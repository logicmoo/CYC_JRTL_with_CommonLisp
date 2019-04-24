package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0259 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0259";
    public static final String myFingerPrint = "e38c3b8d7c1714445ab54742cbb0f8cee68f8f5ad5dc25cdb16cb9957d61d025";
    private static SubLSymbol $g2501$;
    private static SubLSymbol $g2502$;
    private static SubLSymbol $g2503$;
    private static SubLSymbol $g2504$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLString $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLString $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLString $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLObject $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLList $ic61$;
    private static final SubLString $ic62$;
    private static final SubLList $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLList $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLString $ic72$;
    private static final SubLList $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLList $ic77$;
    private static final SubLString $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLList $ic81$;
    private static final SubLString $ic82$;
    private static final SubLList $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLList $ic85$;
    private static final SubLString $ic86$;
    private static final SubLList $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLList $ic89$;
    private static final SubLString $ic90$;
    private static final SubLList $ic91$;
    private static final SubLInteger $ic92$;
    private static final SubLInteger $ic93$;
    private static final SubLInteger $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLString $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLString $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLString $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLList $ic102$;
    private static final SubLString $ic103$;
    private static final SubLList $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLList $ic106$;
    private static final SubLString $ic107$;
    private static final SubLList $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLString $ic110$;
    private static final SubLList $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLList $ic116$;
    private static final SubLString $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLList $ic119$;
    private static final SubLString $ic120$;
    private static final SubLList $ic121$;
    private static final SubLObject $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLString $ic124$;
    private static final SubLObject $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLList $ic127$;
    private static final SubLString $ic128$;
    private static final SubLList $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLList $ic131$;
    private static final SubLString $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLList $ic134$;
    private static final SubLString $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLString $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLObject $ic139$;
    private static final SubLString $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLList $ic142$;
    private static final SubLString $ic143$;
    private static final SubLList $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLString $ic146$;
    private static final SubLList $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLList $ic149$;
    private static final SubLString $ic150$;
    private static final SubLList $ic151$;
    private static final SubLObject $ic152$;
    private static final SubLList $ic153$;
    private static final SubLObject $ic154$;
    private static final SubLObject $ic155$;
    private static final SubLObject $ic156$;
    private static final SubLObject $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLString $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLString $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLObject $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLList $ic166$;
    private static final SubLString $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLObject $ic173$;
    private static final SubLObject $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLObject $ic177$;
    private static final SubLList $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLList $ic181$;
    private static final SubLObject $ic182$;
    private static final SubLList $ic183$;
    private static final SubLList $ic184$;
    private static final SubLObject $ic185$;
    private static final SubLList $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLString $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLString $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLString $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLString $ic202$;
    private static final SubLList $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLString $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLSymbol $ic211$;
    
    
    public static SubLObject f16821(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        SubLObject var4 = module0248.f15931(module0137.f8955(module0259.$ic0$), var1, var2, var3, (SubLObject)module0259.UNPROVIDED);
        if (module0259.NIL != module0173.f10956(var1)) {
            var4 = module0035.f2269(ConsesLow.nconc(module0248.f15993(var1, var2, var3), var4), (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
        }
        if (module0259.NIL != module0248.f15968(var1)) {
            var4 = module0035.f2269(ConsesLow.nconc(module0248.f15969(var1, var2, var3), var4), (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
        }
        return var4;
    }
    
    public static SubLObject f16822(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        assert module0259.NIL != module0210.f13572(var1) : var1;
        SubLObject var5 = module0252.f16303(module0137.f8955(module0259.$ic0$), var1, var2, var3);
        if (module0259.NIL != module0173.f10956(var1)) {
            var5 = module0256.f16529(ConsesLow.nconc(module0248.f15993(var1, var2, var3), var5), var2, var3);
        }
        if (module0259.NIL != module0248.f15968(var1)) {
            var5 = module0256.f16529(ConsesLow.nconc(module0248.f15969(var1, var2, var3), var5), var2, var3);
        }
        if (module0259.NIL == module0259.$g2501$.getDynamicValue(var4)) {
            var5 = module0035.remove_if_not((SubLObject)module0259.$ic2$, var5, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
        }
        return var5;
    }
    
    public static SubLObject f16823(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0259.NIL;
        final SubLObject var5 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var3);
        try {
            module0147.$g2094$.bind((SubLObject)module0259.$ic8$, var3);
            module0147.$g2095$.bind(var2, var3);
            var4 = f16822(var1, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var6, var3);
            module0147.$g2094$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f16824(final SubLObject var8, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLObject var9 = module0172.f10921(var8);
        if (module0259.NIL != module0167.f10813(var9)) {
            return f16821(var9, var2, var3);
        }
        return f16825(var8, var2);
    }
    
    public static SubLObject f16825(final SubLObject var8, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        return module0035.f2272(ConsesLow.append(new SubLObject[] { module0226.f14990(module0205.f13276(var8), var2), module0226.f15006(var8, var2), module0226.f15010(var8, var2), module0226.f15011(var8, var2), module0226.f15005(var8, var2), module0248.f15993(var8, var2, (SubLObject)module0259.UNPROVIDED) }));
    }
    
    public static SubLObject f16826(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        return module0248.f15932(module0137.f8955(module0259.$ic0$), var1, var2, var3, (SubLObject)module0259.UNPROVIDED);
    }
    
    public static SubLObject f16827(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13572(var1) : var1;
        return module0256.f16538(module0254.f16477(module0137.f8955(module0259.$ic0$), var1, var2, var3), var2, var3);
    }
    
    public static SubLObject f16828(final SubLObject var10, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLObject var11 = module0172.f10921(var10);
        if (module0259.NIL != module0167.f10813(var11)) {
            return f16827(var11, var2, var3);
        }
        SubLObject var12 = (SubLObject)module0259.NIL;
        SubLObject var13 = module0256.f16550(module0226.f15003(module0205.f13276(var10), var2), var2, var3);
        SubLObject var14 = (SubLObject)module0259.NIL;
        var14 = var13.first();
        while (module0259.NIL != var13) {
            var12 = conses_high.nunion(module0257.f16683(var14, var2, var3), var12, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
            var12 = conses_high.nunion(module0258.f16757(var14, var2), var12, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
            var13 = var13.rest();
            var14 = var13.first();
        }
        return module0256.f16538(var12, var2, var3);
    }
    
    public static SubLObject f16829(final SubLObject var14, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = module0259.$ic11$;
        }
        assert module0259.NIL != module0210.f13565(var14) : var14;
        return module0248.f15933(module0137.f8955(module0259.$ic0$), var14, var2, var3, (SubLObject)module0259.UNPROVIDED);
    }
    
    public static SubLObject f16830(final SubLObject var14, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13565(var14) : var14;
        return module0252.f16308(module0137.f8955(module0259.$ic0$), var14, var2, var3);
    }
    
    public static SubLObject f16831(final SubLObject var15, final SubLObject var16) {
        assert module0259.NIL != Types.integerp(var16) : var16;
        if (module0259.NIL == module0269.f17710(var15)) {
            return (SubLObject)module0259.NIL;
        }
        final SubLObject var17 = module0227.f15190(var15);
        SubLObject var18 = (SubLObject)module0259.NIL;
        SubLObject var19 = (SubLObject)module0259.NIL;
        SubLObject var20;
        for (var20 = (SubLObject)module0259.NIL, var20 = (SubLObject)module0259.ZERO_INTEGER; var20.numL(var16); var20 = Numbers.add(var20, (SubLObject)module0259.ONE_INTEGER)) {
            if (module0259.NIL != module0052.f3687(var17)) {
                return var19;
            }
            var18 = module0052.f3694(var17, (SubLObject)module0259.$ic22$);
            if (var18 != module0259.$ic22$) {
                var19 = (SubLObject)ConsesLow.cons(var18, var19);
            }
        }
        return var19;
    }
    
    public static SubLObject f16832(final SubLObject var14, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        return module0248.f15935(module0137.f8955(module0259.$ic0$), var14, var2, var3, (SubLObject)module0259.UNPROVIDED);
    }
    
    public static SubLObject f16833(final SubLObject var14, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13565(var14) : var14;
        return module0252.f16309(module0137.f8955(module0259.$ic0$), var14, var2, var3);
    }
    
    public static SubLObject f16834(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13572(var1) : var1;
        return module0248.f15937(module0137.f8955(module0259.$ic0$), var1, var2, var3);
    }
    
    public static SubLObject f16835(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13565(var1) : var1;
        return module0248.f15938(module0137.f8955(module0259.$ic0$), var1, var2, var3);
    }
    
    public static SubLObject f16836(final SubLObject var20, final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = module0137.f8955(module0259.$ic0$);
        SubLObject var23 = module0141.$g1670$.currentBinding(var21);
        SubLObject var24 = module0141.$g1671$.currentBinding(var21);
        SubLObject var25 = module0141.$g1672$.currentBinding(var21);
        final SubLObject var26 = module0141.$g1674$.currentBinding(var21);
        final SubLObject var27 = module0137.$g1605$.currentBinding(var21);
        try {
            module0141.$g1670$.bind(var22, var21);
            module0141.$g1671$.bind(module0244.f15739(var22), var21);
            module0141.$g1672$.bind(module0244.f15746(var22), var21);
            module0141.$g1674$.bind((SubLObject)module0259.NIL, var21);
            module0137.$g1605$.bind(var22, var21);
            final SubLObject var28 = var2;
            final SubLObject var6_26 = module0147.$g2095$.currentBinding(var21);
            final SubLObject var7_27 = module0147.$g2094$.currentBinding(var21);
            final SubLObject var22_28 = module0147.$g2096$.currentBinding(var21);
            try {
                module0147.$g2095$.bind(module0147.f9545(var28), var21);
                module0147.$g2094$.bind(module0147.f9546(var28), var21);
                module0147.$g2096$.bind(module0147.f9549(var28), var21);
                final SubLObject var29 = var3;
                final SubLObject var6_27 = module0141.$g1714$.currentBinding(var21);
                final SubLObject var7_28 = module0141.$g1715$.currentBinding(var21);
                try {
                    module0141.$g1714$.bind((module0259.NIL != var29) ? var29 : module0141.f9283(), var21);
                    module0141.$g1715$.bind((SubLObject)((module0259.NIL != var29) ? module0259.$ic30$ : module0141.$g1715$.getDynamicValue(var21)), var21);
                    if (module0259.NIL != var29 && module0259.NIL != module0136.f8864() && module0259.NIL == module0141.f9279(var29)) {
                        final SubLObject var30 = module0136.$g1591$.getDynamicValue(var21);
                        if (var30.eql((SubLObject)module0259.$ic31$)) {
                            module0136.f8870((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic32$, var29, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                        }
                        else if (var30.eql((SubLObject)module0259.$ic34$)) {
                            module0136.f8871((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var29, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                        }
                        else if (var30.eql((SubLObject)module0259.$ic36$)) {
                            Errors.warn((SubLObject)module0259.$ic32$, var29, (SubLObject)module0259.$ic33$);
                        }
                        else {
                            Errors.warn((SubLObject)module0259.$ic37$, module0136.$g1591$.getDynamicValue(var21));
                            Errors.cerror((SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var29, (SubLObject)module0259.$ic33$);
                        }
                    }
                    final SubLObject var6_28 = module0141.$g1710$.currentBinding(var21);
                    final SubLObject var7_29 = module0141.$g1677$.currentBinding(var21);
                    final SubLObject var22_29 = module0138.$g1619$.currentBinding(var21);
                    try {
                        module0141.$g1710$.bind(module0259.$ic11$, var21);
                        module0141.$g1677$.bind(module0141.f9208(), var21);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0259.UNPROVIDED)), var21);
                        final SubLObject var31 = module0139.f9036();
                        final SubLObject var6_29 = module0139.$g1635$.currentBinding(var21);
                        try {
                            module0139.$g1635$.bind((var31 == module0259.$ic38$) ? module0139.$g1635$.getDynamicValue(var21) : module0139.f9038(var31), var21);
                            final SubLObject var6_30 = module0139.$g1636$.currentBinding(var21);
                            try {
                                module0139.$g1636$.bind((var31 == module0259.$ic38$) ? module0139.$g1636$.getDynamicValue(var21) : module0139.f9038(var31), var21);
                                final SubLObject var6_31 = module0141.$g1685$.currentBinding(var21);
                                final SubLObject var7_30 = module0141.$g1686$.currentBinding(var21);
                                final SubLObject var22_30 = module0141.$g1683$.currentBinding(var21);
                                final SubLObject var23_42 = module0141.$g1684$.currentBinding(var21);
                                final SubLObject var24_43 = module0141.$g1674$.currentBinding(var21);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0259.NIL, var21);
                                    module0141.$g1686$.bind((SubLObject)module0259.NIL, var21);
                                    module0141.$g1683$.bind((SubLObject)module0259.NIL, var21);
                                    module0141.$g1684$.bind((SubLObject)module0259.NIL, var21);
                                    module0141.$g1674$.bind((SubLObject)module0259.NIL, var21);
                                    final SubLObject var32 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var33 = (SubLObject)module0259.NIL;
                                    try {
                                        var33 = ReadWriteLocks.rw_lock_seize_read_lock(var32);
                                        final SubLObject var34 = module0200.f12443(var22);
                                        SubLObject var35;
                                        SubLObject var36;
                                        SubLObject var6_32;
                                        SubLObject var7_31;
                                        SubLObject var37;
                                        SubLObject var38;
                                        SubLObject var39;
                                        SubLObject var40;
                                        SubLObject var55_56;
                                        SubLObject var41;
                                        SubLObject var6_33;
                                        SubLObject var54_59;
                                        SubLObject var60_61;
                                        SubLObject var42;
                                        SubLObject var6_34;
                                        SubLObject var43;
                                        SubLObject var44;
                                        SubLObject var45;
                                        SubLObject var46;
                                        SubLObject var47;
                                        SubLObject var48;
                                        SubLObject var49;
                                        SubLObject var50;
                                        SubLObject var47_70;
                                        SubLObject var51;
                                        SubLObject var6_35;
                                        SubLObject var53;
                                        SubLObject var52;
                                        SubLObject var54;
                                        SubLObject var55;
                                        SubLObject var56;
                                        SubLObject var57;
                                        SubLObject var58;
                                        SubLObject var59;
                                        for (var35 = (SubLObject)module0259.NIL, var35 = var34; module0259.NIL == module0141.$g1685$.getDynamicValue(var21) && module0259.NIL != var35; var35 = var35.rest()) {
                                            var36 = var35.first();
                                            var6_32 = module0137.$g1605$.currentBinding(var21);
                                            var7_31 = module0141.$g1674$.currentBinding(var21);
                                            try {
                                                module0137.$g1605$.bind(var36, var21);
                                                module0141.$g1674$.bind((SubLObject)((module0259.NIL != module0141.f9205((SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0259.NIL == module0141.$g1674$.getDynamicValue(var21)) : module0141.$g1674$.getDynamicValue(var21)), var21);
                                                var37 = module0228.f15229(var1);
                                                if (module0259.NIL != module0138.f8992(var37)) {
                                                    var38 = module0242.f15664(var37, module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                    if (module0259.NIL != var38) {
                                                        var39 = module0245.f15834(var38, module0138.f8979(), module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                        if (module0259.NIL != var39) {
                                                            for (var40 = module0066.f4838(module0067.f4891(var39)); module0259.NIL == module0141.$g1685$.getDynamicValue(var21) && module0259.NIL == module0066.f4841(var40); var40 = module0066.f4840(var40)) {
                                                                var21.resetMultipleValues();
                                                                var55_56 = module0066.f4839(var40);
                                                                var41 = var21.secondMultipleValue();
                                                                var21.resetMultipleValues();
                                                                if (module0259.NIL != module0147.f9507(var55_56)) {
                                                                    var6_33 = module0138.$g1623$.currentBinding(var21);
                                                                    try {
                                                                        module0138.$g1623$.bind(var55_56, var21);
                                                                        for (var54_59 = module0066.f4838(module0067.f4891(var41)); module0259.NIL == module0141.$g1685$.getDynamicValue(var21) && module0259.NIL == module0066.f4841(var54_59); var54_59 = module0066.f4840(var54_59)) {
                                                                            var21.resetMultipleValues();
                                                                            var60_61 = module0066.f4839(var54_59);
                                                                            var42 = var21.secondMultipleValue();
                                                                            var21.resetMultipleValues();
                                                                            if (module0259.NIL != module0141.f9289(var60_61)) {
                                                                                var6_34 = module0138.$g1624$.currentBinding(var21);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var60_61, var21);
                                                                                    var43 = var42;
                                                                                    if (module0259.NIL != module0077.f5302(var43)) {
                                                                                        var44 = module0077.f5333(var43);
                                                                                        for (var45 = module0032.f1741(var44), var46 = (SubLObject)module0259.NIL, var46 = module0032.f1742(var45, var44); module0259.NIL == module0141.$g1685$.getDynamicValue(var21) && module0259.NIL == module0032.f1744(var45, var46); var46 = module0032.f1743(var46)) {
                                                                                            var47 = module0032.f1745(var45, var46);
                                                                                            if (module0259.NIL != module0032.f1746(var46, var47)) {
                                                                                                Functions.funcall(var20, var47);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var43.isList()) {
                                                                                        if (module0259.NIL == module0141.$g1685$.getDynamicValue(var21)) {
                                                                                            var48 = var43;
                                                                                            var49 = (SubLObject)module0259.NIL;
                                                                                            var49 = var48.first();
                                                                                            while (module0259.NIL == module0141.$g1685$.getDynamicValue(var21) && module0259.NIL != var48) {
                                                                                                Functions.funcall(var20, var49);
                                                                                                var48 = var48.rest();
                                                                                                var49 = var48.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0259.$ic39$, var43);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_34, var21);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var54_59);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_33, var21);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var40);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0259.FIVE_INTEGER, (SubLObject)module0259.$ic40$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0259.NIL != module0155.f9785(var37, (SubLObject)module0259.UNPROVIDED)) {
                                                    var50 = ((module0259.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var21), module0137.f8955((SubLObject)module0259.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var21), module0137.f8955((SubLObject)module0259.UNPROVIDED)));
                                                    for (var47_70 = (SubLObject)module0259.NIL, var47_70 = var50; module0259.NIL == module0141.$g1685$.getDynamicValue(var21) && module0259.NIL != var47_70; var47_70 = var47_70.rest()) {
                                                        var51 = var47_70.first();
                                                        var6_35 = module0138.$g1625$.currentBinding(var21);
                                                        try {
                                                            module0138.$g1625$.bind(var51, var21);
                                                            var52 = (var53 = Functions.funcall(var51, var37));
                                                            if (module0259.NIL != module0077.f5302(var53)) {
                                                                var54 = module0077.f5333(var53);
                                                                for (var55 = module0032.f1741(var54), var56 = (SubLObject)module0259.NIL, var56 = module0032.f1742(var55, var54); module0259.NIL == module0141.$g1685$.getDynamicValue(var21) && module0259.NIL == module0032.f1744(var55, var56); var56 = module0032.f1743(var56)) {
                                                                    var57 = module0032.f1745(var55, var56);
                                                                    if (module0259.NIL != module0032.f1746(var56, var57)) {
                                                                        Functions.funcall(var20, var57);
                                                                    }
                                                                }
                                                            }
                                                            else if (var53.isList()) {
                                                                if (module0259.NIL == module0141.$g1685$.getDynamicValue(var21)) {
                                                                    var58 = var53;
                                                                    var59 = (SubLObject)module0259.NIL;
                                                                    var59 = var58.first();
                                                                    while (module0259.NIL == module0141.$g1685$.getDynamicValue(var21) && module0259.NIL != var58) {
                                                                        Functions.funcall(var20, var59);
                                                                        var58 = var58.rest();
                                                                        var59 = var58.first();
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0259.$ic39$, var53);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var6_35, var21);
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var7_31, var21);
                                                module0137.$g1605$.rebind(var6_32, var21);
                                            }
                                        }
                                    }
                                    finally {
                                        if (module0259.NIL != var33) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var32);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var24_43, var21);
                                    module0141.$g1684$.rebind(var23_42, var21);
                                    module0141.$g1683$.rebind(var22_30, var21);
                                    module0141.$g1686$.rebind(var7_30, var21);
                                    module0141.$g1685$.rebind(var6_31, var21);
                                }
                                if (var31 == module0259.$ic41$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var21));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var6_30, var21);
                            }
                            if (var31 == module0259.$ic41$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var21));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var6_29, var21);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var22_29, var21);
                        module0141.$g1677$.rebind(var7_29, var21);
                        module0141.$g1710$.rebind(var6_28, var21);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var7_28, var21);
                    module0141.$g1714$.rebind(var6_27, var21);
                }
            }
            finally {
                module0147.$g2096$.rebind(var22_28, var21);
                module0147.$g2094$.rebind(var7_27, var21);
                module0147.$g2095$.rebind(var6_26, var21);
            }
        }
        finally {
            module0137.$g1605$.rebind(var27, var21);
            module0141.$g1674$.rebind(var26, var21);
            module0141.$g1672$.rebind(var25, var21);
            module0141.$g1671$.rebind(var24, var21);
            module0141.$g1670$.rebind(var23, var21);
        }
        if (module0259.NIL != module0173.f10956(var1)) {
            final SubLObject var60 = var2;
            var23 = module0147.$g2095$.currentBinding(var21);
            var24 = module0147.$g2094$.currentBinding(var21);
            var25 = module0147.$g2096$.currentBinding(var21);
            try {
                module0147.$g2095$.bind(module0147.f9545(var60), var21);
                module0147.$g2094$.bind(module0147.f9546(var60), var21);
                module0147.$g2096$.bind(module0147.f9549(var60), var21);
                final SubLObject var61 = var3;
                final SubLObject var6_36 = module0141.$g1714$.currentBinding(var21);
                final SubLObject var7_32 = module0141.$g1715$.currentBinding(var21);
                try {
                    module0141.$g1714$.bind((module0259.NIL != var61) ? var61 : module0141.$g1714$.getDynamicValue(var21), var21);
                    module0141.$g1715$.bind((SubLObject)((module0259.NIL != var61) ? module0259.$ic30$ : module0141.$g1715$.getDynamicValue(var21)), var21);
                    if (module0259.NIL != var61 && module0259.NIL != module0136.f8864() && module0259.NIL == module0141.f9282(var61)) {
                        final SubLObject var62 = module0136.$g1591$.getDynamicValue(var21);
                        if (var62.eql((SubLObject)module0259.$ic31$)) {
                            module0136.f8870((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic32$, var61, (SubLObject)module0259.$ic42$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                        }
                        else if (var62.eql((SubLObject)module0259.$ic34$)) {
                            module0136.f8871((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var61, (SubLObject)module0259.$ic42$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                        }
                        else if (var62.eql((SubLObject)module0259.$ic36$)) {
                            Errors.warn((SubLObject)module0259.$ic32$, var61, (SubLObject)module0259.$ic42$);
                        }
                        else {
                            Errors.warn((SubLObject)module0259.$ic37$, module0136.$g1591$.getDynamicValue(var21));
                            Errors.cerror((SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var61, (SubLObject)module0259.$ic42$);
                        }
                    }
                    SubLObject var63 = Hashtables.gethash_without_values(var1, module0248.f15984(), (SubLObject)module0259.UNPROVIDED);
                    SubLObject var64 = (SubLObject)module0259.NIL;
                    var64 = var63.first();
                    while (module0259.NIL != var63) {
                        SubLObject var66;
                        final SubLObject var65 = var66 = var64;
                        SubLObject var67 = (SubLObject)module0259.NIL;
                        SubLObject var68 = (SubLObject)module0259.NIL;
                        SubLObject var69 = (SubLObject)module0259.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var66, var65, (SubLObject)module0259.$ic43$);
                        var67 = var66.first();
                        var66 = var66.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var66, var65, (SubLObject)module0259.$ic43$);
                        var68 = var66.first();
                        var66 = var66.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var66, var65, (SubLObject)module0259.$ic43$);
                        var69 = var66.first();
                        var66 = var66.rest();
                        if (module0259.NIL == var66) {
                            if (module0259.NIL != module0147.f9507(var68) && module0259.NIL != module0141.f9289(var69)) {
                                Functions.funcall(var20, var67);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var65, (SubLObject)module0259.$ic43$);
                        }
                        var63 = var63.rest();
                        var64 = var63.first();
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var7_32, var21);
                    module0141.$g1714$.rebind(var6_36, var21);
                }
            }
            finally {
                module0147.$g2096$.rebind(var25, var21);
                module0147.$g2094$.rebind(var24, var21);
                module0147.$g2095$.rebind(var23, var21);
            }
        }
        if (module0259.NIL != module0248.f15968(var1)) {
            final SubLObject var70 = module0137.f8955(module0259.$ic44$);
            final SubLObject var71 = var2;
            final SubLObject var72 = module0147.$g2095$.currentBinding(var21);
            final SubLObject var73 = module0147.$g2094$.currentBinding(var21);
            final SubLObject var74 = module0147.$g2096$.currentBinding(var21);
            try {
                module0147.$g2095$.bind(module0147.f9545(var71), var21);
                module0147.$g2094$.bind(module0147.f9546(var71), var21);
                module0147.$g2096$.bind(module0147.f9549(var71), var21);
                final SubLObject var75 = var3;
                final SubLObject var6_37 = module0141.$g1714$.currentBinding(var21);
                final SubLObject var7_33 = module0141.$g1715$.currentBinding(var21);
                try {
                    module0141.$g1714$.bind((module0259.NIL != var75) ? var75 : module0141.f9283(), var21);
                    module0141.$g1715$.bind((SubLObject)((module0259.NIL != var75) ? module0259.$ic30$ : module0141.$g1715$.getDynamicValue(var21)), var21);
                    if (module0259.NIL != var75 && module0259.NIL != module0136.f8864() && module0259.NIL == module0141.f9279(var75)) {
                        final SubLObject var76 = module0136.$g1591$.getDynamicValue(var21);
                        if (var76.eql((SubLObject)module0259.$ic31$)) {
                            module0136.f8870((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic32$, var75, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                        }
                        else if (var76.eql((SubLObject)module0259.$ic34$)) {
                            module0136.f8871((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var75, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                        }
                        else if (var76.eql((SubLObject)module0259.$ic36$)) {
                            Errors.warn((SubLObject)module0259.$ic32$, var75, (SubLObject)module0259.$ic33$);
                        }
                        else {
                            Errors.warn((SubLObject)module0259.$ic37$, module0136.$g1591$.getDynamicValue(var21));
                            Errors.cerror((SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var75, (SubLObject)module0259.$ic33$);
                        }
                    }
                    final SubLObject var6_38 = module0137.$g1605$.currentBinding(var21);
                    try {
                        module0137.$g1605$.bind(var70, var21);
                        SubLObject var77 = Hashtables.gethash(var1, module0248.$g2467$.getGlobalValue(), (SubLObject)module0259.UNPROVIDED);
                        SubLObject var78 = (SubLObject)module0259.NIL;
                        var78 = var77.first();
                        while (module0259.NIL != var77) {
                            SubLObject var80;
                            final SubLObject var79 = var80 = var78;
                            SubLObject var81 = (SubLObject)module0259.NIL;
                            SubLObject var82 = (SubLObject)module0259.NIL;
                            SubLObject var83 = (SubLObject)module0259.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0259.$ic45$);
                            var81 = var80.first();
                            var80 = var80.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0259.$ic45$);
                            var82 = var80.first();
                            var80 = var80.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)module0259.$ic45$);
                            var83 = var80.first();
                            var80 = var80.rest();
                            if (module0259.NIL == var80) {
                                if (module0259.NIL != module0147.f9507(var82) && module0259.NIL != module0141.f9289(var83)) {
                                    final SubLObject var84 = var81;
                                    Functions.funcall(var20, var84);
                                    SubLObject var12_91;
                                    final SubLObject var85 = var12_91 = ((module0259.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8971(), module0141.$g1714$.getDynamicValue(var21), var70)) : module0244.f15760(module0138.f8971(), module0141.$g1714$.getDynamicValue(var21), var70));
                                    SubLObject var86 = (SubLObject)module0259.NIL;
                                    var86 = var12_91.first();
                                    while (module0259.NIL != var12_91) {
                                        final SubLObject var6_39 = module0138.$g1625$.currentBinding(var21);
                                        try {
                                            module0138.$g1625$.bind(var86, var21);
                                            final SubLObject var87 = Functions.funcall(var86, var81);
                                            Functions.funcall(var20, var87);
                                        }
                                        finally {
                                            module0138.$g1625$.rebind(var6_39, var21);
                                        }
                                        var12_91 = var12_91.rest();
                                        var86 = var12_91.first();
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)module0259.$ic45$);
                            }
                            var77 = var77.rest();
                            var78 = var77.first();
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var6_38, var21);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var7_33, var21);
                    module0141.$g1714$.rebind(var6_37, var21);
                }
            }
            finally {
                module0147.$g2096$.rebind(var74, var21);
                module0147.$g2094$.rebind(var73, var21);
                module0147.$g2095$.rebind(var72, var21);
            }
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16837(final SubLObject var20, final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        f16836(var20, var1, var2, var3);
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16838(final SubLObject var20, final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        assert module0259.NIL != Types.function_spec_p(var20) : var20;
        assert module0259.NIL != module0210.f13565(var1) : var1;
        final SubLObject var22 = module0137.f8955(module0259.$ic0$);
        final SubLObject var23 = module0141.$g1670$.currentBinding(var21);
        final SubLObject var24 = module0141.$g1671$.currentBinding(var21);
        final SubLObject var25 = module0141.$g1672$.currentBinding(var21);
        final SubLObject var26 = module0141.$g1674$.currentBinding(var21);
        final SubLObject var27 = module0137.$g1605$.currentBinding(var21);
        try {
            module0141.$g1670$.bind(var22, var21);
            module0141.$g1671$.bind(module0244.f15739(var22), var21);
            module0141.$g1672$.bind(module0244.f15746(var22), var21);
            module0141.$g1674$.bind((SubLObject)module0259.NIL, var21);
            module0137.$g1605$.bind(var22, var21);
            final SubLObject var28 = var2;
            final SubLObject var6_93 = module0147.$g2095$.currentBinding(var21);
            final SubLObject var7_94 = module0147.$g2094$.currentBinding(var21);
            final SubLObject var22_95 = module0147.$g2096$.currentBinding(var21);
            try {
                module0147.$g2095$.bind(module0147.f9545(var28), var21);
                module0147.$g2094$.bind(module0147.f9546(var28), var21);
                module0147.$g2096$.bind(module0147.f9549(var28), var21);
                final SubLObject var29 = var3;
                final SubLObject var6_94 = module0141.$g1714$.currentBinding(var21);
                final SubLObject var7_95 = module0141.$g1715$.currentBinding(var21);
                try {
                    module0141.$g1714$.bind((module0259.NIL != var29) ? var29 : module0141.f9283(), var21);
                    module0141.$g1715$.bind((SubLObject)((module0259.NIL != var29) ? module0259.$ic30$ : module0141.$g1715$.getDynamicValue(var21)), var21);
                    if (module0259.NIL != var29 && module0259.NIL != module0136.f8864() && module0259.NIL == module0141.f9279(var29)) {
                        final SubLObject var30 = module0136.$g1591$.getDynamicValue(var21);
                        if (var30.eql((SubLObject)module0259.$ic31$)) {
                            module0136.f8870((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic32$, var29, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                        }
                        else if (var30.eql((SubLObject)module0259.$ic34$)) {
                            module0136.f8871((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var29, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                        }
                        else if (var30.eql((SubLObject)module0259.$ic36$)) {
                            Errors.warn((SubLObject)module0259.$ic32$, var29, (SubLObject)module0259.$ic33$);
                        }
                        else {
                            Errors.warn((SubLObject)module0259.$ic37$, module0136.$g1591$.getDynamicValue(var21));
                            Errors.cerror((SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var29, (SubLObject)module0259.$ic33$);
                        }
                    }
                    final SubLObject var6_95 = module0141.$g1710$.currentBinding(var21);
                    final SubLObject var7_96 = module0141.$g1677$.currentBinding(var21);
                    final SubLObject var22_96 = module0138.$g1619$.currentBinding(var21);
                    try {
                        module0141.$g1710$.bind(module0259.$ic11$, var21);
                        module0141.$g1677$.bind(module0141.f9210(), var21);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0259.UNPROVIDED)), var21);
                        final SubLObject var31 = module0139.f9036();
                        final SubLObject var6_96 = module0139.$g1635$.currentBinding(var21);
                        try {
                            module0139.$g1635$.bind((var31 == module0259.$ic38$) ? module0139.$g1635$.getDynamicValue(var21) : module0139.f9038(var31), var21);
                            final SubLObject var6_97 = module0139.$g1636$.currentBinding(var21);
                            try {
                                module0139.$g1636$.bind((var31 == module0259.$ic38$) ? module0139.$g1636$.getDynamicValue(var21) : module0139.f9038(var31), var21);
                                final SubLObject var6_98 = module0141.$g1685$.currentBinding(var21);
                                final SubLObject var7_97 = module0141.$g1686$.currentBinding(var21);
                                final SubLObject var22_97 = module0141.$g1683$.currentBinding(var21);
                                final SubLObject var23_106 = module0141.$g1684$.currentBinding(var21);
                                final SubLObject var24_107 = module0141.$g1674$.currentBinding(var21);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0259.NIL, var21);
                                    module0141.$g1686$.bind((SubLObject)module0259.NIL, var21);
                                    module0141.$g1683$.bind((SubLObject)module0259.NIL, var21);
                                    module0141.$g1684$.bind((SubLObject)module0259.NIL, var21);
                                    module0141.$g1674$.bind((SubLObject)module0259.NIL, var21);
                                    final SubLObject var32 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var33 = (SubLObject)module0259.NIL;
                                    try {
                                        var33 = ReadWriteLocks.rw_lock_seize_read_lock(var32);
                                        final SubLObject var34 = module0200.f12443(var22);
                                        SubLObject var35;
                                        SubLObject var36;
                                        SubLObject var6_99;
                                        SubLObject var7_98;
                                        SubLObject var37;
                                        SubLObject var38;
                                        SubLObject var39;
                                        SubLObject var40;
                                        SubLObject var55_110;
                                        SubLObject var41;
                                        SubLObject var6_100;
                                        SubLObject var54_112;
                                        SubLObject var60_113;
                                        SubLObject var42;
                                        SubLObject var6_101;
                                        SubLObject var43;
                                        SubLObject var44;
                                        SubLObject var45;
                                        SubLObject var46;
                                        SubLObject var47;
                                        SubLObject var48;
                                        SubLObject var49;
                                        SubLObject var50;
                                        SubLObject var47_116;
                                        SubLObject var51;
                                        SubLObject var6_102;
                                        SubLObject var53;
                                        SubLObject var52;
                                        SubLObject var54;
                                        SubLObject var55;
                                        SubLObject var56;
                                        SubLObject var57;
                                        SubLObject var58;
                                        SubLObject var59;
                                        for (var35 = (SubLObject)module0259.NIL, var35 = var34; module0259.NIL == module0141.$g1685$.getDynamicValue(var21) && module0259.NIL != var35; var35 = var35.rest()) {
                                            var36 = var35.first();
                                            var6_99 = module0137.$g1605$.currentBinding(var21);
                                            var7_98 = module0141.$g1674$.currentBinding(var21);
                                            try {
                                                module0137.$g1605$.bind(var36, var21);
                                                module0141.$g1674$.bind((SubLObject)((module0259.NIL != module0141.f9205((SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0259.NIL == module0141.$g1674$.getDynamicValue(var21)) : module0141.$g1674$.getDynamicValue(var21)), var21);
                                                var37 = module0228.f15229(var1);
                                                if (module0259.NIL != module0138.f8992(var37)) {
                                                    var38 = module0242.f15664(var37, module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                    if (module0259.NIL != var38) {
                                                        var39 = module0245.f15834(var38, module0138.f8979(), module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                        if (module0259.NIL != var39) {
                                                            for (var40 = module0066.f4838(module0067.f4891(var39)); module0259.NIL == module0141.$g1685$.getDynamicValue(var21) && module0259.NIL == module0066.f4841(var40); var40 = module0066.f4840(var40)) {
                                                                var21.resetMultipleValues();
                                                                var55_110 = module0066.f4839(var40);
                                                                var41 = var21.secondMultipleValue();
                                                                var21.resetMultipleValues();
                                                                if (module0259.NIL != module0147.f9507(var55_110)) {
                                                                    var6_100 = module0138.$g1623$.currentBinding(var21);
                                                                    try {
                                                                        module0138.$g1623$.bind(var55_110, var21);
                                                                        for (var54_112 = module0066.f4838(module0067.f4891(var41)); module0259.NIL == module0141.$g1685$.getDynamicValue(var21) && module0259.NIL == module0066.f4841(var54_112); var54_112 = module0066.f4840(var54_112)) {
                                                                            var21.resetMultipleValues();
                                                                            var60_113 = module0066.f4839(var54_112);
                                                                            var42 = var21.secondMultipleValue();
                                                                            var21.resetMultipleValues();
                                                                            if (module0259.NIL != module0141.f9289(var60_113)) {
                                                                                var6_101 = module0138.$g1624$.currentBinding(var21);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var60_113, var21);
                                                                                    var43 = var42;
                                                                                    if (module0259.NIL != module0077.f5302(var43)) {
                                                                                        var44 = module0077.f5333(var43);
                                                                                        for (var45 = module0032.f1741(var44), var46 = (SubLObject)module0259.NIL, var46 = module0032.f1742(var45, var44); module0259.NIL == module0141.$g1685$.getDynamicValue(var21) && module0259.NIL == module0032.f1744(var45, var46); var46 = module0032.f1743(var46)) {
                                                                                            var47 = module0032.f1745(var45, var46);
                                                                                            if (module0259.NIL != module0032.f1746(var46, var47)) {
                                                                                                Functions.funcall(var20, var47);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var43.isList()) {
                                                                                        if (module0259.NIL == module0141.$g1685$.getDynamicValue(var21)) {
                                                                                            var48 = var43;
                                                                                            var49 = (SubLObject)module0259.NIL;
                                                                                            var49 = var48.first();
                                                                                            while (module0259.NIL == module0141.$g1685$.getDynamicValue(var21) && module0259.NIL != var48) {
                                                                                                Functions.funcall(var20, var49);
                                                                                                var48 = var48.rest();
                                                                                                var49 = var48.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0259.$ic39$, var43);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_101, var21);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var54_112);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_100, var21);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var40);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0259.FIVE_INTEGER, (SubLObject)module0259.$ic40$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0259.NIL != module0155.f9785(var37, (SubLObject)module0259.UNPROVIDED)) {
                                                    var50 = ((module0259.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var21), module0137.f8955((SubLObject)module0259.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var21), module0137.f8955((SubLObject)module0259.UNPROVIDED)));
                                                    for (var47_116 = (SubLObject)module0259.NIL, var47_116 = var50; module0259.NIL == module0141.$g1685$.getDynamicValue(var21) && module0259.NIL != var47_116; var47_116 = var47_116.rest()) {
                                                        var51 = var47_116.first();
                                                        var6_102 = module0138.$g1625$.currentBinding(var21);
                                                        try {
                                                            module0138.$g1625$.bind(var51, var21);
                                                            var52 = (var53 = Functions.funcall(var51, var37));
                                                            if (module0259.NIL != module0077.f5302(var53)) {
                                                                var54 = module0077.f5333(var53);
                                                                for (var55 = module0032.f1741(var54), var56 = (SubLObject)module0259.NIL, var56 = module0032.f1742(var55, var54); module0259.NIL == module0141.$g1685$.getDynamicValue(var21) && module0259.NIL == module0032.f1744(var55, var56); var56 = module0032.f1743(var56)) {
                                                                    var57 = module0032.f1745(var55, var56);
                                                                    if (module0259.NIL != module0032.f1746(var56, var57)) {
                                                                        Functions.funcall(var20, var57);
                                                                    }
                                                                }
                                                            }
                                                            else if (var53.isList()) {
                                                                if (module0259.NIL == module0141.$g1685$.getDynamicValue(var21)) {
                                                                    var58 = var53;
                                                                    var59 = (SubLObject)module0259.NIL;
                                                                    var59 = var58.first();
                                                                    while (module0259.NIL == module0141.$g1685$.getDynamicValue(var21) && module0259.NIL != var58) {
                                                                        Functions.funcall(var20, var59);
                                                                        var58 = var58.rest();
                                                                        var59 = var58.first();
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0259.$ic39$, var53);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var6_102, var21);
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var7_98, var21);
                                                module0137.$g1605$.rebind(var6_99, var21);
                                            }
                                        }
                                    }
                                    finally {
                                        if (module0259.NIL != var33) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var32);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var24_107, var21);
                                    module0141.$g1684$.rebind(var23_106, var21);
                                    module0141.$g1683$.rebind(var22_97, var21);
                                    module0141.$g1686$.rebind(var7_97, var21);
                                    module0141.$g1685$.rebind(var6_98, var21);
                                }
                                if (var31 == module0259.$ic41$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var21));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var6_97, var21);
                            }
                            if (var31 == module0259.$ic41$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var21));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var6_96, var21);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var22_96, var21);
                        module0141.$g1677$.rebind(var7_96, var21);
                        module0141.$g1710$.rebind(var6_95, var21);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var7_95, var21);
                    module0141.$g1714$.rebind(var6_94, var21);
                }
            }
            finally {
                module0147.$g2096$.rebind(var22_95, var21);
                module0147.$g2094$.rebind(var7_94, var21);
                module0147.$g2095$.rebind(var6_93, var21);
            }
        }
        finally {
            module0137.$g1605$.rebind(var27, var21);
            module0141.$g1674$.rebind(var26, var21);
            module0141.$g1672$.rebind(var25, var21);
            module0141.$g1671$.rebind(var24, var21);
            module0141.$g1670$.rebind(var23, var21);
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16839(final SubLObject var1, final SubLObject var118, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLObject var119 = f16840(var1, var2, var3);
        final SubLObject var120 = f16841(var118, var119, var2, var3);
        return module0256.f16529(var120, var2, var3);
    }
    
    public static SubLObject f16840(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        assert module0259.NIL != module0210.f13572(var1) : var1;
        SubLObject var5 = module0252.f16245(module0137.f8955(module0259.$ic0$), var1, var2, var3);
        if (module0259.NIL != module0173.f10956(var1)) {
            var5 = module0035.f2269(ConsesLow.nconc(module0248.f15994(var1, var2, var3), var5), (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
        }
        if (module0259.NIL != module0248.f15968(var1)) {
            var5 = module0035.f2269(ConsesLow.nconc(module0256.f16550(module0248.f15969(var1, var2, var3), var2, var3), var5), (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
        }
        if (module0259.NIL == module0259.$g2501$.getDynamicValue(var4)) {
            var5 = module0035.remove_if_not((SubLObject)module0259.$ic2$, var5, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
        }
        return var5;
    }
    
    public static SubLObject f16842(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0259.NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)module0259.$ic54$, var2);
            module0147.$g2095$.bind(module0259.$ic55$, var2);
            var3 = f16840(var1, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f16843(final SubLObject var1, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0259.NIL;
        final SubLObject var5 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var3);
        try {
            module0147.$g2094$.bind((SubLObject)module0259.$ic8$, var3);
            module0147.$g2095$.bind(var2, var3);
            var4 = f16840(var1, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var6, var3);
            module0147.$g2094$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f16844(final SubLObject var1, SubLObject var122) {
        if (var122 == module0259.UNPROVIDED) {
            var122 = module0262.f17362(module0147.$g2095$.getDynamicValue());
        }
        final SubLThread var123 = SubLProcess.currentSubLThread();
        SubLObject var124 = (SubLObject)module0259.NIL;
        final SubLObject var125 = module0147.$g2094$.currentBinding(var123);
        final SubLObject var126 = module0147.$g2096$.currentBinding(var123);
        try {
            module0147.$g2094$.bind((SubLObject)module0259.$ic56$, var123);
            module0147.$g2096$.bind(var122, var123);
            var124 = f16840(var1, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var126, var123);
            module0147.$g2094$.rebind(var125, var123);
        }
        return var124;
    }
    
    public static SubLObject f16845(final SubLObject var123, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        return f16840(var123, var2, var3);
    }
    
    public static SubLObject f16846(final SubLObject var14, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13565(var14) : var14;
        return module0252.f16248(module0137.f8955(module0259.$ic0$), var14, var2, var3);
    }
    
    public static SubLObject f16847(final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        assert module0259.NIL != module0210.f13565(var124) : var124;
        SubLObject var126 = (SubLObject)module0259.NIL;
        final SubLObject var127 = module0147.$g2094$.currentBinding(var125);
        final SubLObject var128 = module0147.$g2095$.currentBinding(var125);
        try {
            module0147.$g2094$.bind((SubLObject)module0259.$ic54$, var125);
            module0147.$g2095$.bind(module0259.$ic55$, var125);
            var126 = f16846(var124, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var128, var125);
            module0147.$g2094$.rebind(var127, var125);
        }
        return var126;
    }
    
    public static SubLObject f16848(final SubLObject var14, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        return module0035.delete_if_not((SubLObject)module0259.$ic2$, f16846(var14, var2, var3), (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
    }
    
    public static SubLObject f16849(final SubLObject var14, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        return Sequences.delete_if((SubLObject)module0259.$ic66$, f16848(var14, var2, var3), (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
    }
    
    public static SubLObject f16850(final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        SubLObject var126 = (SubLObject)module0259.NIL;
        final SubLObject var127 = module0147.$g2094$.currentBinding(var125);
        final SubLObject var128 = module0147.$g2095$.currentBinding(var125);
        try {
            module0147.$g2094$.bind((SubLObject)module0259.$ic54$, var125);
            module0147.$g2095$.bind(module0259.$ic55$, var125);
            var126 = f16848(var124, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var128, var125);
            module0147.$g2094$.rebind(var127, var125);
        }
        return var126;
    }
    
    public static SubLObject f16851(final SubLObject var1, final SubLObject var13, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert module0259.NIL != module0210.f13565(var1) : var1;
        assert module0259.NIL != module0210.f13565(var13) : var13;
        SubLObject var15 = (SubLObject)module0259.NIL;
        final SubLObject var16 = module0259.$g2502$.currentBinding(var14);
        final SubLObject var17 = module0259.$g2503$.currentBinding(var14);
        try {
            module0259.$g2502$.bind((SubLObject)module0259.NIL, var14);
            module0259.$g2503$.bind(var13, var14);
            f16852((SubLObject)module0259.$ic69$, var1, var2, var3);
            var15 = module0259.$g2502$.getDynamicValue(var14);
        }
        finally {
            module0259.$g2503$.rebind(var17, var14);
            module0259.$g2502$.rebind(var16, var14);
        }
        return var15;
    }
    
    public static SubLObject f16853(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0259.NIL != f16854(var1, module0259.$g2503$.getDynamicValue(var2), (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) {
            module0259.$g2502$.setDynamicValue((SubLObject)ConsesLow.cons(var1, module0259.$g2502$.getDynamicValue(var2)), var2);
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16855(final SubLObject var125, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLThread var126 = SubLProcess.currentSubLThread();
        assert module0259.NIL != Types.listp(var125) : var125;
        if (module0259.NIL == var125) {
            return (SubLObject)module0259.NIL;
        }
        if (module0259.NIL != module0035.f1997(var125)) {
            return f16840(var125.first(), var2, var3);
        }
        SubLObject var127 = module0252.f16252(module0137.f8955(module0259.$ic0$), var125, var2, var3);
        if (module0259.NIL != module0035.f2369((SubLObject)module0259.$ic75$, var125, (SubLObject)module0259.UNPROVIDED)) {
            SubLObject var128 = var125;
            SubLObject var129 = (SubLObject)module0259.NIL;
            var129 = var128.first();
            while (module0259.NIL != var128) {
                if (module0259.NIL != module0248.f15968(var129)) {
                    var127 = ConsesLow.nconc(module0256.f16531(module0248.f15969(var129, var2, var3), var2, var3), var127);
                }
                var128 = var128.rest();
                var129 = var128.first();
            }
            var127 = module0035.f2269(var127, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
            if (module0259.NIL == module0259.$g2501$.getDynamicValue(var126)) {
                var127 = module0035.remove_if_not((SubLObject)module0259.$ic2$, var127, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
            }
        }
        return var127;
    }
    
    public static SubLObject f16856(final SubLObject var126, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != Types.listp(var126) : var126;
        if (module0259.NIL == var126) {
            return (SubLObject)module0259.NIL;
        }
        if (module0259.NIL != module0035.f1997(var126)) {
            return f16846(var126.first(), var2, var3);
        }
        return module0252.f16254(module0137.f8955(module0259.$ic0$), var126, var2, var3);
    }
    
    public static SubLObject f16857(final SubLObject var1, final SubLObject var127, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13572(var1) : var1;
        assert module0259.NIL != Types.listp(var127) : var127;
        if (module0259.NIL == var127) {
            return (SubLObject)module0259.NIL;
        }
        if (module0259.NIL == module0035.f1997(var127)) {
            return module0252.f16332(module0137.f8955(module0259.$ic0$), var1, var127, var2, var3);
        }
        if (module0259.NIL != f16854(var1, var127.first(), var2, var3)) {
            return var127;
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16858(final SubLObject var1, final SubLObject var127, final SubLObject var2) {
        return module0035.f2004(f16857(var1, var127, var2, (SubLObject)module0259.UNPROVIDED), var127);
    }
    
    public static SubLObject f16859(final SubLObject var1, final SubLObject var127, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        return module0256.f16529(f16857(var1, var127, var2, var3), var2, (SubLObject)module0259.UNPROVIDED);
    }
    
    public static SubLObject f16841(final SubLObject var14, final SubLObject var125, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13572(var14) : var14;
        assert module0259.NIL != Types.listp(var125) : var125;
        if (module0259.NIL == var125) {
            return (SubLObject)module0259.NIL;
        }
        if (module0259.NIL == module0035.f1997(var125)) {
            return module0252.f16334(module0137.f8955(module0259.$ic0$), var14, var125, var2, var3);
        }
        if (module0259.NIL != f16854(var125.first(), var14, var2, var3)) {
            return var125;
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16860(final SubLObject var14, final SubLObject var125, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (module0259.NIL != module0268.f17611(var14)) {
            SubLObject var126 = (SubLObject)module0259.NIL;
            SubLObject var127 = var125;
            SubLObject var128 = (SubLObject)module0259.NIL;
            var128 = var127.first();
            while (module0259.NIL != var127) {
                if (module0259.NIL != module0269.f17698(var128, var14, var2)) {
                    var126 = (SubLObject)ConsesLow.cons(var128, var126);
                }
                var127 = var127.rest();
                var128 = var127.first();
            }
            return Sequences.nreverse(var126);
        }
        final SubLObject var129 = (SubLObject)((module0259.NIL != module0173.f10955(var14)) ? module0549.f33895(var14) : module0259.$ic92$);
        if (var129.numLE((SubLObject)module0259.$ic93$)) {
            return f16841(var14, var125, var2, (SubLObject)module0259.UNPROVIDED);
        }
        final SubLObject var130 = Sequences.length(var125);
        final SubLObject var131 = (SubLObject)module0259.$ic94$;
        if (module0048.f3314(var130, var129, (SubLObject)module0259.TWO_INTEGER).numL(var131)) {
            SubLObject var132 = (SubLObject)module0259.NIL;
            SubLObject var133 = var125;
            SubLObject var134 = (SubLObject)module0259.NIL;
            var134 = var133.first();
            while (module0259.NIL != var133) {
                if (module0259.NIL != f16854(var134, var14, var2, (SubLObject)module0259.UNPROVIDED)) {
                    var132 = (SubLObject)ConsesLow.cons(var134, var132);
                }
                var133 = var133.rest();
                var134 = var133.first();
            }
            return Sequences.nreverse(var132);
        }
        return f16841(var14, var125, var2, (SubLObject)module0259.UNPROVIDED);
    }
    
    public static SubLObject f16861(final SubLObject var20, final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        return module0252.f16291(module0137.f8955(module0259.$ic0$), var1, var20, var2, var3);
    }
    
    public static SubLObject f16862(final SubLObject var20, final SubLObject var14, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        return module0252.f16293(module0137.f8955(module0259.$ic0$), var14, var20, var2, var3);
    }
    
    public static SubLObject f16863(final SubLObject var20, final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        return module0252.f16294(module0137.f8955(module0259.$ic0$), var1, var20, var2, var3);
    }
    
    public static SubLObject f16864(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13572(var1) : var1;
        return module0254.f16477(module0137.f8955(module0259.$ic0$), var1, var2, var3);
    }
    
    public static SubLObject f16865(final SubLObject var14, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13565(var14) : var14;
        return module0252.f16249(module0137.f8955(module0259.$ic0$), var14, var2, var3);
    }
    
    public static SubLObject f16866(final SubLObject var1, final SubLObject var127, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13572(var1) : var1;
        assert module0259.NIL != Types.listp(var127) : var127;
        SubLObject var128 = (SubLObject)module0259.NIL;
        SubLObject var129 = var127;
        SubLObject var130 = (SubLObject)module0259.NIL;
        var130 = var129.first();
        while (module0259.NIL != var129) {
            if (module0259.NIL != f16867(var1, var130, var2, var3)) {
                var128 = (SubLObject)ConsesLow.cons(var130, var128);
            }
            var129 = var129.rest();
            var130 = var129.first();
        }
        return Sequences.nreverse(var128);
    }
    
    public static SubLObject f16868() {
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16852(final SubLObject var132, final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != Types.function_spec_p(var132) : var132;
        assert module0259.NIL != module0210.f13572(var1) : var1;
        module0252.f16269(module0137.f8955(module0259.$ic0$), var1, var132, var2, var3);
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16869(final SubLObject var132, final SubLObject var14, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != Types.function_spec_p(var132) : var132;
        assert module0259.NIL != module0210.f13565(var14) : var14;
        module0252.f16272(module0137.f8955(module0259.$ic0$), var14, var132, var2, var3);
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16870(final SubLObject var132, final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        return module0252.f16282(module0137.f8955(module0259.$ic0$), var1, var132, var2, var3, (SubLObject)module0259.UNPROVIDED);
    }
    
    public static SubLObject f16871(final SubLObject var20, final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != Types.function_spec_p(var20) : var20;
        assert module0259.NIL != module0210.f13572(var1) : var1;
        return f16870(var20, var1, var2, var3);
    }
    
    public static SubLObject f16872(final SubLObject var133, final SubLObject var134, final SubLObject var13, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLThread var135 = SubLProcess.currentSubLThread();
        SubLObject var136 = (SubLObject)module0259.NIL;
        final SubLObject var137 = module0139.$g1646$.currentBinding(var135);
        try {
            module0139.$g1646$.bind(module0139.f9007(), var135);
            final SubLObject var6_135 = module0139.$g1647$.currentBinding(var135);
            try {
                module0139.$g1647$.bind(module0139.f9007(), var135);
                final SubLObject var6_136 = module0139.$g1656$.currentBinding(var135);
                final SubLObject var138 = module0139.$g1657$.currentBinding(var135);
                final SubLObject var139 = module0139.$g1655$.currentBinding(var135);
                final SubLObject var140 = module0141.$g1690$.currentBinding(var135);
                try {
                    module0139.$g1656$.bind(module0139.$g1646$.getDynamicValue(var135), var135);
                    module0139.$g1657$.bind(module0139.$g1647$.getDynamicValue(var135), var135);
                    module0139.$g1655$.bind((SubLObject)module0259.T, var135);
                    module0141.$g1690$.bind(var13, var135);
                    var136 = module0252.f16282(module0137.f8955(var133), var134, (SubLObject)module0259.$ic112$, var2, var3, (SubLObject)module0259.UNPROVIDED);
                }
                finally {
                    module0141.$g1690$.rebind(var140, var135);
                    module0139.$g1655$.rebind(var139, var135);
                    module0139.$g1657$.rebind(var138, var135);
                    module0139.$g1656$.rebind(var6_136, var135);
                }
                module0139.f9011(module0139.$g1647$.getDynamicValue(var135));
            }
            finally {
                module0139.$g1647$.rebind(var6_135, var135);
            }
            module0139.f9011(module0139.$g1646$.getDynamicValue(var135));
        }
        finally {
            module0139.$g1646$.rebind(var137, var135);
        }
        return var136;
    }
    
    public static SubLObject f16873(final SubLObject var14, SubLObject var137, SubLObject var2, SubLObject var3) {
        if (var137 == module0259.UNPROVIDED) {
            var137 = (SubLObject)module0259.ONE_INTEGER;
        }
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        return module0252.f16266(module0137.f8955(module0259.$ic0$), var14, var137, var2, var3);
    }
    
    public static SubLObject f16874(final SubLObject var138, final SubLObject var14, SubLObject var137, SubLObject var2, SubLObject var3) {
        if (var137 == module0259.UNPROVIDED) {
            var137 = (SubLObject)module0259.ONE_INTEGER;
        }
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        return module0252.f16268(module0137.f8955(module0259.$ic0$), var138, var14, var137, var2, var3);
    }
    
    public static SubLObject f16875(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        module0251.f16232(module0137.f8955(module0259.$ic0$), var1, var2, var3);
        if (module0259.NIL != module0248.f15968(var1)) {
            SubLObject var4 = module0248.f15969(var1, var2, var3);
            SubLObject var5 = (SubLObject)module0259.NIL;
            var5 = var4.first();
            while (module0259.NIL != var4) {
                module0251.f16232(module0137.f8955(module0259.$ic44$), var5, var2, var3);
                var4 = var4.rest();
                var5 = var4.first();
            }
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16876(final SubLObject var124, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLThread var125 = SubLProcess.currentSubLThread();
        assert module0259.NIL != module0210.f13565(var124) : var124;
        SubLObject var126 = (SubLObject)module0259.ZERO_INTEGER;
        final SubLObject var127 = module0137.$g1605$.currentBinding(var125);
        final SubLObject var128 = module0139.$g1636$.currentBinding(var125);
        try {
            module0137.$g1605$.bind(module0137.f8955(module0259.$ic0$), var125);
            module0139.$g1636$.bind(module0139.f9007(), var125);
            SubLObject var141_142 = var124;
            final SubLObject var129 = (SubLObject)module0259.$ic115$;
            final SubLObject var130 = module0056.f4145(var129);
            final SubLObject var6_145 = module0139.$g1635$.currentBinding(var125);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var125);
                final SubLObject var131 = var2;
                final SubLObject var6_146 = module0147.$g2095$.currentBinding(var125);
                final SubLObject var7_147 = module0147.$g2094$.currentBinding(var125);
                final SubLObject var132 = module0147.$g2096$.currentBinding(var125);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var131), var125);
                    module0147.$g2094$.bind(module0147.f9546(var131), var125);
                    module0147.$g2096$.bind(module0147.f9549(var131), var125);
                    final SubLObject var133 = var3;
                    final SubLObject var6_147 = module0141.$g1714$.currentBinding(var125);
                    final SubLObject var7_148 = module0141.$g1715$.currentBinding(var125);
                    try {
                        module0141.$g1714$.bind((module0259.NIL != var133) ? var133 : module0141.f9283(), var125);
                        module0141.$g1715$.bind((SubLObject)((module0259.NIL != var133) ? module0259.$ic30$ : module0141.$g1715$.getDynamicValue(var125)), var125);
                        if (module0259.NIL != var133 && module0259.NIL != module0136.f8864() && module0259.NIL == module0141.f9279(var133)) {
                            final SubLObject var134 = module0136.$g1591$.getDynamicValue(var125);
                            if (var134.eql((SubLObject)module0259.$ic31$)) {
                                module0136.f8870((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic32$, var133, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                            }
                            else if (var134.eql((SubLObject)module0259.$ic34$)) {
                                module0136.f8871((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var133, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                            }
                            else if (var134.eql((SubLObject)module0259.$ic36$)) {
                                Errors.warn((SubLObject)module0259.$ic32$, var133, (SubLObject)module0259.$ic33$);
                            }
                            else {
                                Errors.warn((SubLObject)module0259.$ic37$, module0136.$g1591$.getDynamicValue(var125));
                                Errors.cerror((SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var133, (SubLObject)module0259.$ic33$);
                            }
                        }
                        final SubLObject var6_148 = module0141.$g1670$.currentBinding(var125);
                        final SubLObject var7_149 = module0141.$g1671$.currentBinding(var125);
                        final SubLObject var22_152 = module0141.$g1672$.currentBinding(var125);
                        final SubLObject var135 = module0141.$g1674$.currentBinding(var125);
                        final SubLObject var136 = module0137.$g1605$.currentBinding(var125);
                        try {
                            module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0259.$ic0$)), var125);
                            module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0259.$ic0$))), var125);
                            module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0259.$ic0$))), var125);
                            module0141.$g1674$.bind((SubLObject)module0259.NIL, var125);
                            module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0259.$ic0$)), var125);
                            if (module0259.NIL != module0136.f8865() || module0259.NIL != module0244.f15795(var124, module0137.f8955((SubLObject)module0259.UNPROVIDED))) {
                                final SubLObject var6_149 = module0141.$g1677$.currentBinding(var125);
                                final SubLObject var7_150 = module0138.$g1619$.currentBinding(var125);
                                final SubLObject var22_153 = module0141.$g1674$.currentBinding(var125);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var125);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0259.$ic0$))), var125);
                                    module0141.$g1674$.bind((SubLObject)module0259.NIL, var125);
                                    module0249.f16055(var141_142, (SubLObject)module0259.UNPROVIDED);
                                    while (module0259.NIL != var141_142) {
                                        final SubLObject var137 = var141_142;
                                        SubLObject var139;
                                        final SubLObject var138 = var139 = module0200.f12443(module0137.f8955(module0259.$ic0$));
                                        SubLObject var140 = (SubLObject)module0259.NIL;
                                        var140 = var139.first();
                                        while (module0259.NIL != var139) {
                                            final SubLObject var6_150 = module0137.$g1605$.currentBinding(var125);
                                            final SubLObject var7_151 = module0141.$g1674$.currentBinding(var125);
                                            try {
                                                module0137.$g1605$.bind(var140, var125);
                                                module0141.$g1674$.bind((SubLObject)((module0259.NIL != module0141.f9205((SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0259.NIL == module0141.$g1674$.getDynamicValue(var125)) : module0141.$g1674$.getDynamicValue(var125)), var125);
                                                final SubLObject var141 = module0228.f15229(var137);
                                                if (module0259.NIL != module0138.f8992(var141)) {
                                                    final SubLObject var142 = module0242.f15664(var141, module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                    if (module0259.NIL != var142) {
                                                        final SubLObject var143 = module0245.f15834(var142, module0244.f15780(module0137.f8955(module0259.$ic0$)), module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                        if (module0259.NIL != var143) {
                                                            SubLObject var144;
                                                            for (var144 = module0066.f4838(module0067.f4891(var143)); module0259.NIL == module0066.f4841(var144); var144 = module0066.f4840(var144)) {
                                                                var125.resetMultipleValues();
                                                                final SubLObject var55_160 = module0066.f4839(var144);
                                                                final SubLObject var145 = var125.secondMultipleValue();
                                                                var125.resetMultipleValues();
                                                                if (module0259.NIL != module0147.f9507(var55_160)) {
                                                                    final SubLObject var6_151 = module0138.$g1623$.currentBinding(var125);
                                                                    try {
                                                                        module0138.$g1623$.bind(var55_160, var125);
                                                                        SubLObject var54_162;
                                                                        for (var54_162 = module0066.f4838(module0067.f4891(var145)); module0259.NIL == module0066.f4841(var54_162); var54_162 = module0066.f4840(var54_162)) {
                                                                            var125.resetMultipleValues();
                                                                            final SubLObject var60_163 = module0066.f4839(var54_162);
                                                                            final SubLObject var146 = var125.secondMultipleValue();
                                                                            var125.resetMultipleValues();
                                                                            if (module0259.NIL != module0141.f9289(var60_163)) {
                                                                                final SubLObject var6_152 = module0138.$g1624$.currentBinding(var125);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var60_163, var125);
                                                                                    final SubLObject var147 = var146;
                                                                                    if (module0259.NIL != module0077.f5302(var147)) {
                                                                                        final SubLObject var148 = module0077.f5333(var147);
                                                                                        SubLObject var149;
                                                                                        SubLObject var150;
                                                                                        SubLObject var151;
                                                                                        for (var149 = module0032.f1741(var148), var150 = (SubLObject)module0259.NIL, var150 = module0032.f1742(var149, var148); module0259.NIL == module0032.f1744(var149, var150); var150 = module0032.f1743(var150)) {
                                                                                            var151 = module0032.f1745(var149, var150);
                                                                                            if (module0259.NIL != module0032.f1746(var150, var151) && module0259.NIL == module0249.f16059(var151, module0139.$g1636$.getDynamicValue(var125))) {
                                                                                                module0249.f16055(var151, module0139.$g1636$.getDynamicValue(var125));
                                                                                                var126 = Numbers.add(var126, (SubLObject)module0259.ONE_INTEGER);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var147.isList()) {
                                                                                        SubLObject var152 = var147;
                                                                                        SubLObject var153 = (SubLObject)module0259.NIL;
                                                                                        var153 = var152.first();
                                                                                        while (module0259.NIL != var152) {
                                                                                            if (module0259.NIL == module0249.f16059(var153, module0139.$g1636$.getDynamicValue(var125))) {
                                                                                                module0249.f16055(var153, module0139.$g1636$.getDynamicValue(var125));
                                                                                                var126 = Numbers.add(var126, (SubLObject)module0259.ONE_INTEGER);
                                                                                            }
                                                                                            var152 = var152.rest();
                                                                                            var153 = var152.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0259.$ic39$, var147);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_152, var125);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var54_162);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_151, var125);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var144);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0259.FIVE_INTEGER, (SubLObject)module0259.$ic40$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                                    }
                                                    if (module0259.NIL != module0200.f12419(var141, module0137.f8955((SubLObject)module0259.UNPROVIDED))) {
                                                        SubLObject var154 = module0248.f15995(var141);
                                                        SubLObject var155 = (SubLObject)module0259.NIL;
                                                        var155 = var154.first();
                                                        while (module0259.NIL != var154) {
                                                            SubLObject var157;
                                                            final SubLObject var156 = var157 = var155;
                                                            SubLObject var158 = (SubLObject)module0259.NIL;
                                                            SubLObject var171_172 = (SubLObject)module0259.NIL;
                                                            SubLObject var173_174 = (SubLObject)module0259.NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var157, var156, (SubLObject)module0259.$ic116$);
                                                            var158 = var157.first();
                                                            var157 = var157.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var157, var156, (SubLObject)module0259.$ic116$);
                                                            var171_172 = var157.first();
                                                            var157 = var157.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var157, var156, (SubLObject)module0259.$ic116$);
                                                            var173_174 = var157.first();
                                                            var157 = var157.rest();
                                                            if (module0259.NIL == var157) {
                                                                if (module0259.NIL != module0147.f9507(var171_172)) {
                                                                    final SubLObject var6_153 = module0138.$g1623$.currentBinding(var125);
                                                                    try {
                                                                        module0138.$g1623$.bind(var171_172, var125);
                                                                        if (module0259.NIL != module0141.f9289(var173_174)) {
                                                                            final SubLObject var6_154 = module0138.$g1624$.currentBinding(var125);
                                                                            try {
                                                                                module0138.$g1624$.bind(var173_174, var125);
                                                                                final SubLObject var147;
                                                                                final SubLObject var159 = var147 = (SubLObject)ConsesLow.list(var158);
                                                                                if (module0259.NIL != module0077.f5302(var147)) {
                                                                                    final SubLObject var148 = module0077.f5333(var147);
                                                                                    SubLObject var149;
                                                                                    SubLObject var150;
                                                                                    SubLObject var151;
                                                                                    for (var149 = module0032.f1741(var148), var150 = (SubLObject)module0259.NIL, var150 = module0032.f1742(var149, var148); module0259.NIL == module0032.f1744(var149, var150); var150 = module0032.f1743(var150)) {
                                                                                        var151 = module0032.f1745(var149, var150);
                                                                                        if (module0259.NIL != module0032.f1746(var150, var151) && module0259.NIL == module0249.f16059(var151, module0139.$g1636$.getDynamicValue(var125))) {
                                                                                            module0249.f16055(var151, module0139.$g1636$.getDynamicValue(var125));
                                                                                            var126 = Numbers.add(var126, (SubLObject)module0259.ONE_INTEGER);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var147.isList()) {
                                                                                    SubLObject var68_177 = var147;
                                                                                    SubLObject var153 = (SubLObject)module0259.NIL;
                                                                                    var153 = var68_177.first();
                                                                                    while (module0259.NIL != var68_177) {
                                                                                        if (module0259.NIL == module0249.f16059(var153, module0139.$g1636$.getDynamicValue(var125))) {
                                                                                            module0249.f16055(var153, module0139.$g1636$.getDynamicValue(var125));
                                                                                            var126 = Numbers.add(var126, (SubLObject)module0259.ONE_INTEGER);
                                                                                        }
                                                                                        var68_177 = var68_177.rest();
                                                                                        var153 = var68_177.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0259.$ic39$, var147);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var6_154, var125);
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_153, var125);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var156, (SubLObject)module0259.$ic116$);
                                                            }
                                                            var154 = var154.rest();
                                                            var155 = var154.first();
                                                        }
                                                    }
                                                }
                                                else if (module0259.NIL != module0155.f9785(var141, (SubLObject)module0259.UNPROVIDED)) {
                                                    SubLObject var12_178;
                                                    final SubLObject var160 = var12_178 = ((module0259.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0259.$ic0$)), module0141.$g1714$.getDynamicValue(var125), module0137.f8955((SubLObject)module0259.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0259.$ic0$)), module0141.$g1714$.getDynamicValue(var125), module0137.f8955((SubLObject)module0259.UNPROVIDED)));
                                                    SubLObject var161 = (SubLObject)module0259.NIL;
                                                    var161 = var12_178.first();
                                                    while (module0259.NIL != var12_178) {
                                                        final SubLObject var6_155 = module0138.$g1625$.currentBinding(var125);
                                                        try {
                                                            module0138.$g1625$.bind(var161, var125);
                                                            final SubLObject var163;
                                                            final SubLObject var162 = var163 = Functions.funcall(var161, var141);
                                                            if (module0259.NIL != module0077.f5302(var163)) {
                                                                final SubLObject var164 = module0077.f5333(var163);
                                                                SubLObject var165;
                                                                SubLObject var166;
                                                                SubLObject var167;
                                                                for (var165 = module0032.f1741(var164), var166 = (SubLObject)module0259.NIL, var166 = module0032.f1742(var165, var164); module0259.NIL == module0032.f1744(var165, var166); var166 = module0032.f1743(var166)) {
                                                                    var167 = module0032.f1745(var165, var166);
                                                                    if (module0259.NIL != module0032.f1746(var166, var167) && module0259.NIL == module0249.f16059(var167, module0139.$g1636$.getDynamicValue(var125))) {
                                                                        module0249.f16055(var167, module0139.$g1636$.getDynamicValue(var125));
                                                                        var126 = Numbers.add(var126, (SubLObject)module0259.ONE_INTEGER);
                                                                    }
                                                                }
                                                            }
                                                            else if (var163.isList()) {
                                                                SubLObject var168 = var163;
                                                                SubLObject var169 = (SubLObject)module0259.NIL;
                                                                var169 = var168.first();
                                                                while (module0259.NIL != var168) {
                                                                    if (module0259.NIL == module0249.f16059(var169, module0139.$g1636$.getDynamicValue(var125))) {
                                                                        module0249.f16055(var169, module0139.$g1636$.getDynamicValue(var125));
                                                                        var126 = Numbers.add(var126, (SubLObject)module0259.ONE_INTEGER);
                                                                    }
                                                                    var168 = var168.rest();
                                                                    var169 = var168.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0259.$ic39$, var163);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var6_155, var125);
                                                        }
                                                        var12_178 = var12_178.rest();
                                                        var161 = var12_178.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var7_151, var125);
                                                module0137.$g1605$.rebind(var6_150, var125);
                                            }
                                            var139 = var139.rest();
                                            var140 = var139.first();
                                        }
                                        SubLObject var171;
                                        final SubLObject var170 = var171 = module0200.f12443(module0244.f15771(module0137.f8955(module0259.$ic0$)));
                                        SubLObject var172 = (SubLObject)module0259.NIL;
                                        var172 = var171.first();
                                        while (module0259.NIL != var171) {
                                            final SubLObject var6_156 = module0137.$g1605$.currentBinding(var125);
                                            final SubLObject var7_152 = module0141.$g1674$.currentBinding(var125);
                                            try {
                                                module0137.$g1605$.bind(var172, var125);
                                                module0141.$g1674$.bind((SubLObject)((module0259.NIL != module0141.f9205((SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0259.NIL == module0141.$g1674$.getDynamicValue(var125)) : module0141.$g1674$.getDynamicValue(var125)), var125);
                                                final SubLObject var173 = module0228.f15229(var141_142);
                                                if (module0259.NIL != module0138.f8992(var173)) {
                                                    final SubLObject var174 = module0242.f15664(var173, module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                    if (module0259.NIL != var174) {
                                                        final SubLObject var175 = module0245.f15834(var174, module0138.f8979(), module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                        if (module0259.NIL != var175) {
                                                            SubLObject var176;
                                                            for (var176 = module0066.f4838(module0067.f4891(var175)); module0259.NIL == module0066.f4841(var176); var176 = module0066.f4840(var176)) {
                                                                var125.resetMultipleValues();
                                                                final SubLObject var55_161 = module0066.f4839(var176);
                                                                final SubLObject var177 = var125.secondMultipleValue();
                                                                var125.resetMultipleValues();
                                                                if (module0259.NIL != module0147.f9507(var55_161)) {
                                                                    final SubLObject var6_157 = module0138.$g1623$.currentBinding(var125);
                                                                    try {
                                                                        module0138.$g1623$.bind(var55_161, var125);
                                                                        SubLObject var54_163;
                                                                        for (var54_163 = module0066.f4838(module0067.f4891(var177)); module0259.NIL == module0066.f4841(var54_163); var54_163 = module0066.f4840(var54_163)) {
                                                                            var125.resetMultipleValues();
                                                                            final SubLObject var60_164 = module0066.f4839(var54_163);
                                                                            final SubLObject var178 = var125.secondMultipleValue();
                                                                            var125.resetMultipleValues();
                                                                            if (module0259.NIL != module0141.f9289(var60_164)) {
                                                                                final SubLObject var6_158 = module0138.$g1624$.currentBinding(var125);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var60_164, var125);
                                                                                    final SubLObject var179 = var178;
                                                                                    if (module0259.NIL != module0077.f5302(var179)) {
                                                                                        final SubLObject var180 = module0077.f5333(var179);
                                                                                        SubLObject var181;
                                                                                        SubLObject var182;
                                                                                        SubLObject var183;
                                                                                        for (var181 = module0032.f1741(var180), var182 = (SubLObject)module0259.NIL, var182 = module0032.f1742(var181, var180); module0259.NIL == module0032.f1744(var181, var182); var182 = module0032.f1743(var182)) {
                                                                                            var183 = module0032.f1745(var181, var182);
                                                                                            if (module0259.NIL != module0032.f1746(var182, var183) && module0259.NIL == module0249.f16059(var183, (SubLObject)module0259.UNPROVIDED)) {
                                                                                                module0249.f16055(var183, (SubLObject)module0259.UNPROVIDED);
                                                                                                module0056.f4149(var183, var130);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var179.isList()) {
                                                                                        SubLObject var184 = var179;
                                                                                        SubLObject var185 = (SubLObject)module0259.NIL;
                                                                                        var185 = var184.first();
                                                                                        while (module0259.NIL != var184) {
                                                                                            if (module0259.NIL == module0249.f16059(var185, (SubLObject)module0259.UNPROVIDED)) {
                                                                                                module0249.f16055(var185, (SubLObject)module0259.UNPROVIDED);
                                                                                                module0056.f4149(var185, var130);
                                                                                            }
                                                                                            var184 = var184.rest();
                                                                                            var185 = var184.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0259.$ic39$, var179);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_158, var125);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var54_163);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_157, var125);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var176);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0259.FIVE_INTEGER, (SubLObject)module0259.$ic40$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0259.NIL != module0155.f9785(var173, (SubLObject)module0259.UNPROVIDED)) {
                                                    SubLObject var12_179;
                                                    final SubLObject var186 = var12_179 = ((module0259.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var125), module0137.f8955((SubLObject)module0259.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var125), module0137.f8955((SubLObject)module0259.UNPROVIDED)));
                                                    SubLObject var187 = (SubLObject)module0259.NIL;
                                                    var187 = var12_179.first();
                                                    while (module0259.NIL != var12_179) {
                                                        final SubLObject var6_159 = module0138.$g1625$.currentBinding(var125);
                                                        try {
                                                            module0138.$g1625$.bind(var187, var125);
                                                            final SubLObject var189;
                                                            final SubLObject var188 = var189 = Functions.funcall(var187, var173);
                                                            if (module0259.NIL != module0077.f5302(var189)) {
                                                                final SubLObject var190 = module0077.f5333(var189);
                                                                SubLObject var191;
                                                                SubLObject var192;
                                                                SubLObject var193;
                                                                for (var191 = module0032.f1741(var190), var192 = (SubLObject)module0259.NIL, var192 = module0032.f1742(var191, var190); module0259.NIL == module0032.f1744(var191, var192); var192 = module0032.f1743(var192)) {
                                                                    var193 = module0032.f1745(var191, var192);
                                                                    if (module0259.NIL != module0032.f1746(var192, var193) && module0259.NIL == module0249.f16059(var193, (SubLObject)module0259.UNPROVIDED)) {
                                                                        module0249.f16055(var193, (SubLObject)module0259.UNPROVIDED);
                                                                        module0056.f4149(var193, var130);
                                                                    }
                                                                }
                                                            }
                                                            else if (var189.isList()) {
                                                                SubLObject var194 = var189;
                                                                SubLObject var195 = (SubLObject)module0259.NIL;
                                                                var195 = var194.first();
                                                                while (module0259.NIL != var194) {
                                                                    if (module0259.NIL == module0249.f16059(var195, (SubLObject)module0259.UNPROVIDED)) {
                                                                        module0249.f16055(var195, (SubLObject)module0259.UNPROVIDED);
                                                                        module0056.f4149(var195, var130);
                                                                    }
                                                                    var194 = var194.rest();
                                                                    var195 = var194.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0259.$ic39$, var189);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var6_159, var125);
                                                        }
                                                        var12_179 = var12_179.rest();
                                                        var187 = var12_179.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var7_152, var125);
                                                module0137.$g1605$.rebind(var6_156, var125);
                                            }
                                            var171 = var171.rest();
                                            var172 = var171.first();
                                        }
                                        var141_142 = module0056.f4150(var130);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var22_153, var125);
                                    module0138.$g1619$.rebind(var7_150, var125);
                                    module0141.$g1677$.rebind(var6_149, var125);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0259.TWO_INTEGER, (SubLObject)module0259.$ic117$, var124, module0244.f15748(module0137.f8955((SubLObject)module0259.UNPROVIDED)), (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var136, var125);
                            module0141.$g1674$.rebind(var135, var125);
                            module0141.$g1672$.rebind(var22_152, var125);
                            module0141.$g1671$.rebind(var7_149, var125);
                            module0141.$g1670$.rebind(var6_148, var125);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var7_148, var125);
                        module0141.$g1714$.rebind(var6_147, var125);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var132, var125);
                    module0147.$g2094$.rebind(var7_147, var125);
                    module0147.$g2095$.rebind(var6_146, var125);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var125));
            }
            finally {
                module0139.$g1635$.rebind(var6_145, var125);
            }
            module0139.f9011(module0139.$g1636$.getDynamicValue(var125));
        }
        finally {
            module0139.$g1636$.rebind(var128, var125);
            module0137.$g1605$.rebind(var127, var125);
        }
        return var126;
    }
    
    public static SubLObject f16877(final SubLObject var124, final SubLObject var133, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLThread var134 = SubLProcess.currentSubLThread();
        SubLObject var135 = (SubLObject)module0259.ZERO_INTEGER;
        final SubLObject var136 = module0137.$g1605$.currentBinding(var134);
        final SubLObject var137 = module0139.$g1636$.currentBinding(var134);
        try {
            module0137.$g1605$.bind(module0137.f8955(module0259.$ic0$), var134);
            module0139.$g1636$.bind(module0139.f9007(), var134);
            SubLObject var141_190 = var124;
            final SubLObject var138 = (SubLObject)module0259.$ic115$;
            final SubLObject var139 = module0056.f4145(var138);
            final SubLObject var6_191 = module0139.$g1635$.currentBinding(var134);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var134);
                final SubLObject var140 = var2;
                final SubLObject var6_192 = module0147.$g2095$.currentBinding(var134);
                final SubLObject var7_193 = module0147.$g2094$.currentBinding(var134);
                final SubLObject var141 = module0147.$g2096$.currentBinding(var134);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var140), var134);
                    module0147.$g2094$.bind(module0147.f9546(var140), var134);
                    module0147.$g2096$.bind(module0147.f9549(var140), var134);
                    final SubLObject var142 = var3;
                    final SubLObject var6_193 = module0141.$g1714$.currentBinding(var134);
                    final SubLObject var7_194 = module0141.$g1715$.currentBinding(var134);
                    try {
                        module0141.$g1714$.bind((module0259.NIL != var142) ? var142 : module0141.f9283(), var134);
                        module0141.$g1715$.bind((SubLObject)((module0259.NIL != var142) ? module0259.$ic30$ : module0141.$g1715$.getDynamicValue(var134)), var134);
                        if (module0259.NIL != var142 && module0259.NIL != module0136.f8864() && module0259.NIL == module0141.f9279(var142)) {
                            final SubLObject var143 = module0136.$g1591$.getDynamicValue(var134);
                            if (var143.eql((SubLObject)module0259.$ic31$)) {
                                module0136.f8870((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic32$, var142, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                            }
                            else if (var143.eql((SubLObject)module0259.$ic34$)) {
                                module0136.f8871((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var142, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                            }
                            else if (var143.eql((SubLObject)module0259.$ic36$)) {
                                Errors.warn((SubLObject)module0259.$ic32$, var142, (SubLObject)module0259.$ic33$);
                            }
                            else {
                                Errors.warn((SubLObject)module0259.$ic37$, module0136.$g1591$.getDynamicValue(var134));
                                Errors.cerror((SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var142, (SubLObject)module0259.$ic33$);
                            }
                        }
                        final SubLObject var6_194 = module0141.$g1670$.currentBinding(var134);
                        final SubLObject var7_195 = module0141.$g1671$.currentBinding(var134);
                        final SubLObject var22_198 = module0141.$g1672$.currentBinding(var134);
                        final SubLObject var144 = module0141.$g1674$.currentBinding(var134);
                        final SubLObject var145 = module0137.$g1605$.currentBinding(var134);
                        try {
                            module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0259.$ic0$)), var134);
                            module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0259.$ic0$))), var134);
                            module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0259.$ic0$))), var134);
                            module0141.$g1674$.bind((SubLObject)module0259.NIL, var134);
                            module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0259.$ic0$)), var134);
                            if (module0259.NIL != module0136.f8865() || module0259.NIL != module0244.f15795(var124, module0137.f8955((SubLObject)module0259.UNPROVIDED))) {
                                final SubLObject var6_195 = module0141.$g1677$.currentBinding(var134);
                                final SubLObject var7_196 = module0138.$g1619$.currentBinding(var134);
                                final SubLObject var22_199 = module0141.$g1674$.currentBinding(var134);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var134);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0259.$ic0$))), var134);
                                    module0141.$g1674$.bind((SubLObject)module0259.NIL, var134);
                                    module0249.f16055(var141_190, (SubLObject)module0259.UNPROVIDED);
                                    while (module0259.NIL != var141_190) {
                                        final SubLObject var146 = var141_190;
                                        SubLObject var148;
                                        final SubLObject var147 = var148 = module0200.f12443(module0137.f8955(module0259.$ic0$));
                                        SubLObject var149 = (SubLObject)module0259.NIL;
                                        var149 = var148.first();
                                        while (module0259.NIL != var148) {
                                            final SubLObject var6_196 = module0137.$g1605$.currentBinding(var134);
                                            final SubLObject var7_197 = module0141.$g1674$.currentBinding(var134);
                                            try {
                                                module0137.$g1605$.bind(var149, var134);
                                                module0141.$g1674$.bind((SubLObject)((module0259.NIL != module0141.f9205((SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0259.NIL == module0141.$g1674$.getDynamicValue(var134)) : module0141.$g1674$.getDynamicValue(var134)), var134);
                                                final SubLObject var150 = module0228.f15229(var146);
                                                if (module0259.NIL != module0138.f8992(var150)) {
                                                    final SubLObject var151 = module0242.f15664(var150, module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                    if (module0259.NIL != var151) {
                                                        final SubLObject var152 = module0245.f15834(var151, module0244.f15780(module0137.f8955(module0259.$ic0$)), module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                        if (module0259.NIL != var152) {
                                                            SubLObject var153;
                                                            for (var153 = module0066.f4838(module0067.f4891(var152)); module0259.NIL == module0066.f4841(var153); var153 = module0066.f4840(var153)) {
                                                                var134.resetMultipleValues();
                                                                final SubLObject var55_204 = module0066.f4839(var153);
                                                                final SubLObject var154 = var134.secondMultipleValue();
                                                                var134.resetMultipleValues();
                                                                if (module0259.NIL != module0147.f9507(var55_204)) {
                                                                    final SubLObject var6_197 = module0138.$g1623$.currentBinding(var134);
                                                                    try {
                                                                        module0138.$g1623$.bind(var55_204, var134);
                                                                        SubLObject var54_206;
                                                                        for (var54_206 = module0066.f4838(module0067.f4891(var154)); module0259.NIL == module0066.f4841(var54_206); var54_206 = module0066.f4840(var54_206)) {
                                                                            var134.resetMultipleValues();
                                                                            final SubLObject var60_207 = module0066.f4839(var54_206);
                                                                            final SubLObject var155 = var134.secondMultipleValue();
                                                                            var134.resetMultipleValues();
                                                                            if (module0259.NIL != module0141.f9289(var60_207)) {
                                                                                final SubLObject var6_198 = module0138.$g1624$.currentBinding(var134);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var60_207, var134);
                                                                                    final SubLObject var156 = var155;
                                                                                    if (module0259.NIL != module0077.f5302(var156)) {
                                                                                        final SubLObject var157 = module0077.f5333(var156);
                                                                                        SubLObject var158;
                                                                                        SubLObject var159;
                                                                                        SubLObject var160;
                                                                                        for (var158 = module0032.f1741(var157), var159 = (SubLObject)module0259.NIL, var159 = module0032.f1742(var158, var157); module0259.NIL == module0032.f1744(var158, var159); var159 = module0032.f1743(var159)) {
                                                                                            var160 = module0032.f1745(var158, var159);
                                                                                            if (module0259.NIL != module0032.f1746(var159, var160) && module0259.NIL == module0249.f16059(var160, module0139.$g1636$.getDynamicValue(var134))) {
                                                                                                module0249.f16055(var160, module0139.$g1636$.getDynamicValue(var134));
                                                                                                if (module0259.NIL != Functions.funcall(var133, var160)) {
                                                                                                    var135 = Numbers.add(var135, (SubLObject)module0259.ONE_INTEGER);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var156.isList()) {
                                                                                        SubLObject var161 = var156;
                                                                                        SubLObject var162 = (SubLObject)module0259.NIL;
                                                                                        var162 = var161.first();
                                                                                        while (module0259.NIL != var161) {
                                                                                            if (module0259.NIL == module0249.f16059(var162, module0139.$g1636$.getDynamicValue(var134))) {
                                                                                                module0249.f16055(var162, module0139.$g1636$.getDynamicValue(var134));
                                                                                                if (module0259.NIL != Functions.funcall(var133, var162)) {
                                                                                                    var135 = Numbers.add(var135, (SubLObject)module0259.ONE_INTEGER);
                                                                                                }
                                                                                            }
                                                                                            var161 = var161.rest();
                                                                                            var162 = var161.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0259.$ic39$, var156);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_198, var134);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var54_206);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_197, var134);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var153);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0259.FIVE_INTEGER, (SubLObject)module0259.$ic40$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                                    }
                                                    if (module0259.NIL != module0200.f12419(var150, module0137.f8955((SubLObject)module0259.UNPROVIDED))) {
                                                        SubLObject var163 = module0248.f15995(var150);
                                                        SubLObject var164 = (SubLObject)module0259.NIL;
                                                        var164 = var163.first();
                                                        while (module0259.NIL != var163) {
                                                            SubLObject var166;
                                                            final SubLObject var165 = var166 = var164;
                                                            SubLObject var167 = (SubLObject)module0259.NIL;
                                                            SubLObject var171_211 = (SubLObject)module0259.NIL;
                                                            SubLObject var173_212 = (SubLObject)module0259.NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var166, var165, (SubLObject)module0259.$ic116$);
                                                            var167 = var166.first();
                                                            var166 = var166.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var166, var165, (SubLObject)module0259.$ic116$);
                                                            var171_211 = var166.first();
                                                            var166 = var166.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var166, var165, (SubLObject)module0259.$ic116$);
                                                            var173_212 = var166.first();
                                                            var166 = var166.rest();
                                                            if (module0259.NIL == var166) {
                                                                if (module0259.NIL != module0147.f9507(var171_211)) {
                                                                    final SubLObject var6_199 = module0138.$g1623$.currentBinding(var134);
                                                                    try {
                                                                        module0138.$g1623$.bind(var171_211, var134);
                                                                        if (module0259.NIL != module0141.f9289(var173_212)) {
                                                                            final SubLObject var6_200 = module0138.$g1624$.currentBinding(var134);
                                                                            try {
                                                                                module0138.$g1624$.bind(var173_212, var134);
                                                                                final SubLObject var156;
                                                                                final SubLObject var168 = var156 = (SubLObject)ConsesLow.list(var167);
                                                                                if (module0259.NIL != module0077.f5302(var156)) {
                                                                                    final SubLObject var157 = module0077.f5333(var156);
                                                                                    SubLObject var158;
                                                                                    SubLObject var159;
                                                                                    SubLObject var160;
                                                                                    for (var158 = module0032.f1741(var157), var159 = (SubLObject)module0259.NIL, var159 = module0032.f1742(var158, var157); module0259.NIL == module0032.f1744(var158, var159); var159 = module0032.f1743(var159)) {
                                                                                        var160 = module0032.f1745(var158, var159);
                                                                                        if (module0259.NIL != module0032.f1746(var159, var160) && module0259.NIL == module0249.f16059(var160, module0139.$g1636$.getDynamicValue(var134))) {
                                                                                            module0249.f16055(var160, module0139.$g1636$.getDynamicValue(var134));
                                                                                            if (module0259.NIL != Functions.funcall(var133, var160)) {
                                                                                                var135 = Numbers.add(var135, (SubLObject)module0259.ONE_INTEGER);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var156.isList()) {
                                                                                    SubLObject var68_215 = var156;
                                                                                    SubLObject var162 = (SubLObject)module0259.NIL;
                                                                                    var162 = var68_215.first();
                                                                                    while (module0259.NIL != var68_215) {
                                                                                        if (module0259.NIL == module0249.f16059(var162, module0139.$g1636$.getDynamicValue(var134))) {
                                                                                            module0249.f16055(var162, module0139.$g1636$.getDynamicValue(var134));
                                                                                            if (module0259.NIL != Functions.funcall(var133, var162)) {
                                                                                                var135 = Numbers.add(var135, (SubLObject)module0259.ONE_INTEGER);
                                                                                            }
                                                                                        }
                                                                                        var68_215 = var68_215.rest();
                                                                                        var162 = var68_215.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0259.$ic39$, var156);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var6_200, var134);
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_199, var134);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var165, (SubLObject)module0259.$ic116$);
                                                            }
                                                            var163 = var163.rest();
                                                            var164 = var163.first();
                                                        }
                                                    }
                                                }
                                                else if (module0259.NIL != module0155.f9785(var150, (SubLObject)module0259.UNPROVIDED)) {
                                                    SubLObject var12_216;
                                                    final SubLObject var169 = var12_216 = ((module0259.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0259.$ic0$)), module0141.$g1714$.getDynamicValue(var134), module0137.f8955((SubLObject)module0259.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0259.$ic0$)), module0141.$g1714$.getDynamicValue(var134), module0137.f8955((SubLObject)module0259.UNPROVIDED)));
                                                    SubLObject var170 = (SubLObject)module0259.NIL;
                                                    var170 = var12_216.first();
                                                    while (module0259.NIL != var12_216) {
                                                        final SubLObject var6_201 = module0138.$g1625$.currentBinding(var134);
                                                        try {
                                                            module0138.$g1625$.bind(var170, var134);
                                                            final SubLObject var172;
                                                            final SubLObject var171 = var172 = Functions.funcall(var170, var150);
                                                            if (module0259.NIL != module0077.f5302(var172)) {
                                                                final SubLObject var173 = module0077.f5333(var172);
                                                                SubLObject var174;
                                                                SubLObject var175;
                                                                SubLObject var176;
                                                                for (var174 = module0032.f1741(var173), var175 = (SubLObject)module0259.NIL, var175 = module0032.f1742(var174, var173); module0259.NIL == module0032.f1744(var174, var175); var175 = module0032.f1743(var175)) {
                                                                    var176 = module0032.f1745(var174, var175);
                                                                    if (module0259.NIL != module0032.f1746(var175, var176) && module0259.NIL == module0249.f16059(var176, module0139.$g1636$.getDynamicValue(var134))) {
                                                                        module0249.f16055(var176, module0139.$g1636$.getDynamicValue(var134));
                                                                        if (module0259.NIL != Functions.funcall(var133, var176)) {
                                                                            var135 = Numbers.add(var135, (SubLObject)module0259.ONE_INTEGER);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            else if (var172.isList()) {
                                                                SubLObject var177 = var172;
                                                                SubLObject var178 = (SubLObject)module0259.NIL;
                                                                var178 = var177.first();
                                                                while (module0259.NIL != var177) {
                                                                    if (module0259.NIL == module0249.f16059(var178, module0139.$g1636$.getDynamicValue(var134))) {
                                                                        module0249.f16055(var178, module0139.$g1636$.getDynamicValue(var134));
                                                                        if (module0259.NIL != Functions.funcall(var133, var178)) {
                                                                            var135 = Numbers.add(var135, (SubLObject)module0259.ONE_INTEGER);
                                                                        }
                                                                    }
                                                                    var177 = var177.rest();
                                                                    var178 = var177.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0259.$ic39$, var172);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var6_201, var134);
                                                        }
                                                        var12_216 = var12_216.rest();
                                                        var170 = var12_216.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var7_197, var134);
                                                module0137.$g1605$.rebind(var6_196, var134);
                                            }
                                            var148 = var148.rest();
                                            var149 = var148.first();
                                        }
                                        SubLObject var180;
                                        final SubLObject var179 = var180 = module0200.f12443(module0244.f15771(module0137.f8955(module0259.$ic0$)));
                                        SubLObject var181 = (SubLObject)module0259.NIL;
                                        var181 = var180.first();
                                        while (module0259.NIL != var180) {
                                            final SubLObject var6_202 = module0137.$g1605$.currentBinding(var134);
                                            final SubLObject var7_198 = module0141.$g1674$.currentBinding(var134);
                                            try {
                                                module0137.$g1605$.bind(var181, var134);
                                                module0141.$g1674$.bind((SubLObject)((module0259.NIL != module0141.f9205((SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0259.NIL == module0141.$g1674$.getDynamicValue(var134)) : module0141.$g1674$.getDynamicValue(var134)), var134);
                                                final SubLObject var182 = module0228.f15229(var141_190);
                                                if (module0259.NIL != module0138.f8992(var182)) {
                                                    final SubLObject var183 = module0242.f15664(var182, module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                    if (module0259.NIL != var183) {
                                                        final SubLObject var184 = module0245.f15834(var183, module0138.f8979(), module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                        if (module0259.NIL != var184) {
                                                            SubLObject var185;
                                                            for (var185 = module0066.f4838(module0067.f4891(var184)); module0259.NIL == module0066.f4841(var185); var185 = module0066.f4840(var185)) {
                                                                var134.resetMultipleValues();
                                                                final SubLObject var55_205 = module0066.f4839(var185);
                                                                final SubLObject var186 = var134.secondMultipleValue();
                                                                var134.resetMultipleValues();
                                                                if (module0259.NIL != module0147.f9507(var55_205)) {
                                                                    final SubLObject var6_203 = module0138.$g1623$.currentBinding(var134);
                                                                    try {
                                                                        module0138.$g1623$.bind(var55_205, var134);
                                                                        SubLObject var54_207;
                                                                        for (var54_207 = module0066.f4838(module0067.f4891(var186)); module0259.NIL == module0066.f4841(var54_207); var54_207 = module0066.f4840(var54_207)) {
                                                                            var134.resetMultipleValues();
                                                                            final SubLObject var60_208 = module0066.f4839(var54_207);
                                                                            final SubLObject var187 = var134.secondMultipleValue();
                                                                            var134.resetMultipleValues();
                                                                            if (module0259.NIL != module0141.f9289(var60_208)) {
                                                                                final SubLObject var6_204 = module0138.$g1624$.currentBinding(var134);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var60_208, var134);
                                                                                    final SubLObject var188 = var187;
                                                                                    if (module0259.NIL != module0077.f5302(var188)) {
                                                                                        final SubLObject var189 = module0077.f5333(var188);
                                                                                        SubLObject var190;
                                                                                        SubLObject var191;
                                                                                        SubLObject var192;
                                                                                        for (var190 = module0032.f1741(var189), var191 = (SubLObject)module0259.NIL, var191 = module0032.f1742(var190, var189); module0259.NIL == module0032.f1744(var190, var191); var191 = module0032.f1743(var191)) {
                                                                                            var192 = module0032.f1745(var190, var191);
                                                                                            if (module0259.NIL != module0032.f1746(var191, var192) && module0259.NIL == module0249.f16059(var192, (SubLObject)module0259.UNPROVIDED)) {
                                                                                                module0249.f16055(var192, (SubLObject)module0259.UNPROVIDED);
                                                                                                module0056.f4149(var192, var139);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var188.isList()) {
                                                                                        SubLObject var193 = var188;
                                                                                        SubLObject var194 = (SubLObject)module0259.NIL;
                                                                                        var194 = var193.first();
                                                                                        while (module0259.NIL != var193) {
                                                                                            if (module0259.NIL == module0249.f16059(var194, (SubLObject)module0259.UNPROVIDED)) {
                                                                                                module0249.f16055(var194, (SubLObject)module0259.UNPROVIDED);
                                                                                                module0056.f4149(var194, var139);
                                                                                            }
                                                                                            var193 = var193.rest();
                                                                                            var194 = var193.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0259.$ic39$, var188);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_204, var134);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var54_207);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_203, var134);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var185);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0259.FIVE_INTEGER, (SubLObject)module0259.$ic40$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0259.NIL != module0155.f9785(var182, (SubLObject)module0259.UNPROVIDED)) {
                                                    SubLObject var12_217;
                                                    final SubLObject var195 = var12_217 = ((module0259.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var134), module0137.f8955((SubLObject)module0259.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var134), module0137.f8955((SubLObject)module0259.UNPROVIDED)));
                                                    SubLObject var196 = (SubLObject)module0259.NIL;
                                                    var196 = var12_217.first();
                                                    while (module0259.NIL != var12_217) {
                                                        final SubLObject var6_205 = module0138.$g1625$.currentBinding(var134);
                                                        try {
                                                            module0138.$g1625$.bind(var196, var134);
                                                            final SubLObject var198;
                                                            final SubLObject var197 = var198 = Functions.funcall(var196, var182);
                                                            if (module0259.NIL != module0077.f5302(var198)) {
                                                                final SubLObject var199 = module0077.f5333(var198);
                                                                SubLObject var200;
                                                                SubLObject var201;
                                                                SubLObject var202;
                                                                for (var200 = module0032.f1741(var199), var201 = (SubLObject)module0259.NIL, var201 = module0032.f1742(var200, var199); module0259.NIL == module0032.f1744(var200, var201); var201 = module0032.f1743(var201)) {
                                                                    var202 = module0032.f1745(var200, var201);
                                                                    if (module0259.NIL != module0032.f1746(var201, var202) && module0259.NIL == module0249.f16059(var202, (SubLObject)module0259.UNPROVIDED)) {
                                                                        module0249.f16055(var202, (SubLObject)module0259.UNPROVIDED);
                                                                        module0056.f4149(var202, var139);
                                                                    }
                                                                }
                                                            }
                                                            else if (var198.isList()) {
                                                                SubLObject var203 = var198;
                                                                SubLObject var204 = (SubLObject)module0259.NIL;
                                                                var204 = var203.first();
                                                                while (module0259.NIL != var203) {
                                                                    if (module0259.NIL == module0249.f16059(var204, (SubLObject)module0259.UNPROVIDED)) {
                                                                        module0249.f16055(var204, (SubLObject)module0259.UNPROVIDED);
                                                                        module0056.f4149(var204, var139);
                                                                    }
                                                                    var203 = var203.rest();
                                                                    var204 = var203.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0259.$ic39$, var198);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var6_205, var134);
                                                        }
                                                        var12_217 = var12_217.rest();
                                                        var196 = var12_217.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var7_198, var134);
                                                module0137.$g1605$.rebind(var6_202, var134);
                                            }
                                            var180 = var180.rest();
                                            var181 = var180.first();
                                        }
                                        var141_190 = module0056.f4150(var139);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var22_199, var134);
                                    module0138.$g1619$.rebind(var7_196, var134);
                                    module0141.$g1677$.rebind(var6_195, var134);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0259.TWO_INTEGER, (SubLObject)module0259.$ic117$, var124, module0244.f15748(module0137.f8955((SubLObject)module0259.UNPROVIDED)), (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var145, var134);
                            module0141.$g1674$.rebind(var144, var134);
                            module0141.$g1672$.rebind(var22_198, var134);
                            module0141.$g1671$.rebind(var7_195, var134);
                            module0141.$g1670$.rebind(var6_194, var134);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var7_194, var134);
                        module0141.$g1714$.rebind(var6_193, var134);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var141, var134);
                    module0147.$g2094$.rebind(var7_193, var134);
                    module0147.$g2095$.rebind(var6_192, var134);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var134));
            }
            finally {
                module0139.$g1635$.rebind(var6_191, var134);
            }
            module0139.f9011(module0139.$g1636$.getDynamicValue(var134));
        }
        finally {
            module0139.$g1636$.rebind(var137, var134);
            module0137.$g1605$.rebind(var136, var134);
        }
        return var135;
    }
    
    public static SubLObject f16878(final SubLObject var124, final SubLObject var227, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLThread var228 = SubLProcess.currentSubLThread();
        SubLObject var229 = (SubLObject)module0259.ZERO_INTEGER;
        SubLObject var230 = (SubLObject)module0259.NIL;
        final SubLObject var231 = module0137.$g1605$.currentBinding(var228);
        final SubLObject var232 = module0139.$g1636$.currentBinding(var228);
        try {
            module0137.$g1605$.bind(module0137.f8955(module0259.$ic0$), var228);
            module0139.$g1636$.bind(module0139.f9007(), var228);
            if (module0259.NIL == var230) {
                SubLObject var141_229 = var124;
                final SubLObject var233 = (SubLObject)module0259.$ic115$;
                final SubLObject var234 = module0056.f4145(var233);
                final SubLObject var6_230 = module0139.$g1635$.currentBinding(var228);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var228);
                    final SubLObject var235 = var2;
                    final SubLObject var6_231 = module0147.$g2095$.currentBinding(var228);
                    final SubLObject var7_232 = module0147.$g2094$.currentBinding(var228);
                    final SubLObject var236 = module0147.$g2096$.currentBinding(var228);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var235), var228);
                        module0147.$g2094$.bind(module0147.f9546(var235), var228);
                        module0147.$g2096$.bind(module0147.f9549(var235), var228);
                        final SubLObject var237 = var3;
                        final SubLObject var6_232 = module0141.$g1714$.currentBinding(var228);
                        final SubLObject var7_233 = module0141.$g1715$.currentBinding(var228);
                        try {
                            module0141.$g1714$.bind((module0259.NIL != var237) ? var237 : module0141.f9283(), var228);
                            module0141.$g1715$.bind((SubLObject)((module0259.NIL != var237) ? module0259.$ic30$ : module0141.$g1715$.getDynamicValue(var228)), var228);
                            if (module0259.NIL != var237 && module0259.NIL != module0136.f8864() && module0259.NIL == module0141.f9279(var237)) {
                                final SubLObject var238 = module0136.$g1591$.getDynamicValue(var228);
                                if (var238.eql((SubLObject)module0259.$ic31$)) {
                                    module0136.f8870((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic32$, var237, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                }
                                else if (var238.eql((SubLObject)module0259.$ic34$)) {
                                    module0136.f8871((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var237, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                }
                                else if (var238.eql((SubLObject)module0259.$ic36$)) {
                                    Errors.warn((SubLObject)module0259.$ic32$, var237, (SubLObject)module0259.$ic33$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0259.$ic37$, module0136.$g1591$.getDynamicValue(var228));
                                    Errors.cerror((SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var237, (SubLObject)module0259.$ic33$);
                                }
                            }
                            final SubLObject var6_233 = module0141.$g1670$.currentBinding(var228);
                            final SubLObject var7_234 = module0141.$g1671$.currentBinding(var228);
                            final SubLObject var22_237 = module0141.$g1672$.currentBinding(var228);
                            final SubLObject var239 = module0141.$g1674$.currentBinding(var228);
                            final SubLObject var240 = module0137.$g1605$.currentBinding(var228);
                            try {
                                module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0259.$ic0$)), var228);
                                module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0259.$ic0$))), var228);
                                module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0259.$ic0$))), var228);
                                module0141.$g1674$.bind((SubLObject)module0259.NIL, var228);
                                module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0259.$ic0$)), var228);
                                if (module0259.NIL != module0136.f8865() || module0259.NIL != module0244.f15795(var124, module0137.f8955((SubLObject)module0259.UNPROVIDED))) {
                                    final SubLObject var6_234 = module0141.$g1677$.currentBinding(var228);
                                    final SubLObject var7_235 = module0138.$g1619$.currentBinding(var228);
                                    final SubLObject var22_238 = module0141.$g1674$.currentBinding(var228);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9210(), var228);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0259.$ic0$))), var228);
                                        module0141.$g1674$.bind((SubLObject)module0259.NIL, var228);
                                        module0249.f16055(var141_229, (SubLObject)module0259.UNPROVIDED);
                                        while (module0259.NIL != var141_229 && module0259.NIL == var230) {
                                            final SubLObject var241 = var141_229;
                                            final SubLObject var242 = module0200.f12443(module0137.f8955(module0259.$ic0$));
                                            SubLObject var243;
                                            SubLObject var244;
                                            SubLObject var6_235;
                                            SubLObject var7_236;
                                            SubLObject var245;
                                            SubLObject var246;
                                            SubLObject var247;
                                            SubLObject var248;
                                            SubLObject var55_243;
                                            SubLObject var249;
                                            SubLObject var6_236;
                                            SubLObject var54_245;
                                            SubLObject var60_246;
                                            SubLObject var250;
                                            SubLObject var6_237;
                                            SubLObject var251;
                                            SubLObject var252;
                                            SubLObject var253;
                                            SubLObject var254;
                                            SubLObject var255;
                                            SubLObject var256;
                                            SubLObject var257;
                                            SubLObject var258;
                                            SubLObject var259;
                                            SubLObject var261;
                                            SubLObject var260;
                                            SubLObject var262;
                                            SubLObject var171_250;
                                            SubLObject var173_251;
                                            SubLObject var6_238;
                                            SubLObject var6_239;
                                            SubLObject var263;
                                            SubLObject var68_254;
                                            SubLObject var264;
                                            SubLObject var47_255;
                                            SubLObject var265;
                                            SubLObject var6_240;
                                            SubLObject var267;
                                            SubLObject var266;
                                            SubLObject var268;
                                            SubLObject var269;
                                            SubLObject var270;
                                            SubLObject var271;
                                            SubLObject var272;
                                            SubLObject var273;
                                            for (var243 = (SubLObject)module0259.NIL, var243 = var242; module0259.NIL == var230 && module0259.NIL != var243; var243 = var243.rest()) {
                                                var244 = var243.first();
                                                var6_235 = module0137.$g1605$.currentBinding(var228);
                                                var7_236 = module0141.$g1674$.currentBinding(var228);
                                                try {
                                                    module0137.$g1605$.bind(var244, var228);
                                                    module0141.$g1674$.bind((SubLObject)((module0259.NIL != module0141.f9205((SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0259.NIL == module0141.$g1674$.getDynamicValue(var228)) : module0141.$g1674$.getDynamicValue(var228)), var228);
                                                    var245 = module0228.f15229(var241);
                                                    if (module0259.NIL != module0138.f8992(var245)) {
                                                        var246 = module0242.f15664(var245, module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                        if (module0259.NIL != var246) {
                                                            var247 = module0245.f15834(var246, module0244.f15780(module0137.f8955(module0259.$ic0$)), module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                            if (module0259.NIL != var247) {
                                                                for (var248 = module0066.f4838(module0067.f4891(var247)); module0259.NIL == var230 && module0259.NIL == module0066.f4841(var248); var248 = module0066.f4840(var248)) {
                                                                    var228.resetMultipleValues();
                                                                    var55_243 = module0066.f4839(var248);
                                                                    var249 = var228.secondMultipleValue();
                                                                    var228.resetMultipleValues();
                                                                    if (module0259.NIL != module0147.f9507(var55_243)) {
                                                                        var6_236 = module0138.$g1623$.currentBinding(var228);
                                                                        try {
                                                                            module0138.$g1623$.bind(var55_243, var228);
                                                                            for (var54_245 = module0066.f4838(module0067.f4891(var249)); module0259.NIL == var230 && module0259.NIL == module0066.f4841(var54_245); var54_245 = module0066.f4840(var54_245)) {
                                                                                var228.resetMultipleValues();
                                                                                var60_246 = module0066.f4839(var54_245);
                                                                                var250 = var228.secondMultipleValue();
                                                                                var228.resetMultipleValues();
                                                                                if (module0259.NIL != module0141.f9289(var60_246)) {
                                                                                    var6_237 = module0138.$g1624$.currentBinding(var228);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var60_246, var228);
                                                                                        var251 = var250;
                                                                                        if (module0259.NIL != module0077.f5302(var251)) {
                                                                                            var252 = module0077.f5333(var251);
                                                                                            for (var253 = module0032.f1741(var252), var254 = (SubLObject)module0259.NIL, var254 = module0032.f1742(var253, var252); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var253, var254); var254 = module0032.f1743(var254)) {
                                                                                                var255 = module0032.f1745(var253, var254);
                                                                                                if (module0259.NIL != module0032.f1746(var254, var255) && module0259.NIL == module0249.f16059(var255, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                                    module0249.f16055(var255, module0139.$g1636$.getDynamicValue(var228));
                                                                                                    var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                                    if (var229.numG(var227)) {
                                                                                                        var230 = (SubLObject)module0259.T;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var251.isList()) {
                                                                                            if (module0259.NIL == var230) {
                                                                                                var256 = var251;
                                                                                                var257 = (SubLObject)module0259.NIL;
                                                                                                var257 = var256.first();
                                                                                                while (module0259.NIL == var230 && module0259.NIL != var256) {
                                                                                                    if (module0259.NIL == module0249.f16059(var257, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                                        module0249.f16055(var257, module0139.$g1636$.getDynamicValue(var228));
                                                                                                        var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                                        if (var229.numG(var227)) {
                                                                                                            var230 = (SubLObject)module0259.T;
                                                                                                        }
                                                                                                    }
                                                                                                    var256 = var256.rest();
                                                                                                    var257 = var256.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0259.$ic39$, var251);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var6_237, var228);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var54_245);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var6_236, var228);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var248);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0259.FIVE_INTEGER, (SubLObject)module0259.$ic40$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                                        }
                                                        if (module0259.NIL != module0200.f12419(var245, module0137.f8955((SubLObject)module0259.UNPROVIDED)) && module0259.NIL == var230) {
                                                            var258 = module0248.f15995(var245);
                                                            var259 = (SubLObject)module0259.NIL;
                                                            var259 = var258.first();
                                                            while (module0259.NIL == var230 && module0259.NIL != var258) {
                                                                var260 = (var261 = var259);
                                                                var262 = (SubLObject)module0259.NIL;
                                                                var171_250 = (SubLObject)module0259.NIL;
                                                                var173_251 = (SubLObject)module0259.NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(var261, var260, (SubLObject)module0259.$ic116$);
                                                                var262 = var261.first();
                                                                var261 = var261.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var261, var260, (SubLObject)module0259.$ic116$);
                                                                var171_250 = var261.first();
                                                                var261 = var261.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var261, var260, (SubLObject)module0259.$ic116$);
                                                                var173_251 = var261.first();
                                                                var261 = var261.rest();
                                                                if (module0259.NIL == var261) {
                                                                    if (module0259.NIL != module0147.f9507(var171_250)) {
                                                                        var6_238 = module0138.$g1623$.currentBinding(var228);
                                                                        try {
                                                                            module0138.$g1623$.bind(var171_250, var228);
                                                                            if (module0259.NIL != module0141.f9289(var173_251)) {
                                                                                var6_239 = module0138.$g1624$.currentBinding(var228);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var173_251, var228);
                                                                                    var263 = (var251 = (SubLObject)ConsesLow.list(var262));
                                                                                    if (module0259.NIL != module0077.f5302(var251)) {
                                                                                        var252 = module0077.f5333(var251);
                                                                                        for (var253 = module0032.f1741(var252), var254 = (SubLObject)module0259.NIL, var254 = module0032.f1742(var253, var252); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var253, var254); var254 = module0032.f1743(var254)) {
                                                                                            var255 = module0032.f1745(var253, var254);
                                                                                            if (module0259.NIL != module0032.f1746(var254, var255) && module0259.NIL == module0249.f16059(var255, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                                module0249.f16055(var255, module0139.$g1636$.getDynamicValue(var228));
                                                                                                var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                                if (var229.numG(var227)) {
                                                                                                    var230 = (SubLObject)module0259.T;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var251.isList()) {
                                                                                        if (module0259.NIL == var230) {
                                                                                            var68_254 = var251;
                                                                                            var257 = (SubLObject)module0259.NIL;
                                                                                            var257 = var68_254.first();
                                                                                            while (module0259.NIL == var230 && module0259.NIL != var68_254) {
                                                                                                if (module0259.NIL == module0249.f16059(var257, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                                    module0249.f16055(var257, module0139.$g1636$.getDynamicValue(var228));
                                                                                                    var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                                    if (var229.numG(var227)) {
                                                                                                        var230 = (SubLObject)module0259.T;
                                                                                                    }
                                                                                                }
                                                                                                var68_254 = var68_254.rest();
                                                                                                var257 = var68_254.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0259.$ic39$, var251);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_239, var228);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var6_238, var228);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(var260, (SubLObject)module0259.$ic116$);
                                                                }
                                                                var258 = var258.rest();
                                                                var259 = var258.first();
                                                            }
                                                        }
                                                    }
                                                    else if (module0259.NIL != module0155.f9785(var245, (SubLObject)module0259.UNPROVIDED)) {
                                                        var264 = ((module0259.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0259.$ic0$)), module0141.$g1714$.getDynamicValue(var228), module0137.f8955((SubLObject)module0259.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0259.$ic0$)), module0141.$g1714$.getDynamicValue(var228), module0137.f8955((SubLObject)module0259.UNPROVIDED)));
                                                        for (var47_255 = (SubLObject)module0259.NIL, var47_255 = var264; module0259.NIL == var230 && module0259.NIL != var47_255; var47_255 = var47_255.rest()) {
                                                            var265 = var47_255.first();
                                                            var6_240 = module0138.$g1625$.currentBinding(var228);
                                                            try {
                                                                module0138.$g1625$.bind(var265, var228);
                                                                var266 = (var267 = Functions.funcall(var265, var245));
                                                                if (module0259.NIL != module0077.f5302(var267)) {
                                                                    var268 = module0077.f5333(var267);
                                                                    for (var269 = module0032.f1741(var268), var270 = (SubLObject)module0259.NIL, var270 = module0032.f1742(var269, var268); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var269, var270); var270 = module0032.f1743(var270)) {
                                                                        var271 = module0032.f1745(var269, var270);
                                                                        if (module0259.NIL != module0032.f1746(var270, var271) && module0259.NIL == module0249.f16059(var271, module0139.$g1636$.getDynamicValue(var228))) {
                                                                            module0249.f16055(var271, module0139.$g1636$.getDynamicValue(var228));
                                                                            var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                            if (var229.numG(var227)) {
                                                                                var230 = (SubLObject)module0259.T;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (var267.isList()) {
                                                                    if (module0259.NIL == var230) {
                                                                        var272 = var267;
                                                                        var273 = (SubLObject)module0259.NIL;
                                                                        var273 = var272.first();
                                                                        while (module0259.NIL == var230 && module0259.NIL != var272) {
                                                                            if (module0259.NIL == module0249.f16059(var273, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                module0249.f16055(var273, module0139.$g1636$.getDynamicValue(var228));
                                                                                var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                if (var229.numG(var227)) {
                                                                                    var230 = (SubLObject)module0259.T;
                                                                                }
                                                                            }
                                                                            var272 = var272.rest();
                                                                            var273 = var272.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0259.$ic39$, var267);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var6_240, var228);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var7_236, var228);
                                                    module0137.$g1605$.rebind(var6_235, var228);
                                                }
                                            }
                                            final SubLObject var274 = module0200.f12443(module0244.f15771(module0137.f8955(module0259.$ic0$)));
                                            SubLObject var275;
                                            SubLObject var276;
                                            SubLObject var6_241;
                                            SubLObject var7_237;
                                            SubLObject var277;
                                            SubLObject var278;
                                            SubLObject var279;
                                            SubLObject var280;
                                            SubLObject var55_244;
                                            SubLObject var281;
                                            SubLObject var6_242;
                                            SubLObject var54_246;
                                            SubLObject var60_247;
                                            SubLObject var282;
                                            SubLObject var6_243;
                                            SubLObject var283;
                                            SubLObject var284;
                                            SubLObject var285;
                                            SubLObject var286;
                                            SubLObject var287;
                                            SubLObject var288;
                                            SubLObject var289;
                                            SubLObject var290;
                                            SubLObject var47_256;
                                            SubLObject var291;
                                            SubLObject var6_244;
                                            SubLObject var293;
                                            SubLObject var292;
                                            SubLObject var294;
                                            SubLObject var295;
                                            SubLObject var296;
                                            SubLObject var297;
                                            SubLObject var298;
                                            SubLObject var299;
                                            for (var275 = (SubLObject)module0259.NIL, var275 = var274; module0259.NIL == var230 && module0259.NIL != var275; var275 = var275.rest()) {
                                                var276 = var275.first();
                                                var6_241 = module0137.$g1605$.currentBinding(var228);
                                                var7_237 = module0141.$g1674$.currentBinding(var228);
                                                try {
                                                    module0137.$g1605$.bind(var276, var228);
                                                    module0141.$g1674$.bind((SubLObject)((module0259.NIL != module0141.f9205((SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0259.NIL == module0141.$g1674$.getDynamicValue(var228)) : module0141.$g1674$.getDynamicValue(var228)), var228);
                                                    var277 = module0228.f15229(var141_229);
                                                    if (module0259.NIL != module0138.f8992(var277)) {
                                                        var278 = module0242.f15664(var277, module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                        if (module0259.NIL != var278) {
                                                            var279 = module0245.f15834(var278, module0138.f8979(), module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                            if (module0259.NIL != var279) {
                                                                for (var280 = module0066.f4838(module0067.f4891(var279)); module0259.NIL == var230 && module0259.NIL == module0066.f4841(var280); var280 = module0066.f4840(var280)) {
                                                                    var228.resetMultipleValues();
                                                                    var55_244 = module0066.f4839(var280);
                                                                    var281 = var228.secondMultipleValue();
                                                                    var228.resetMultipleValues();
                                                                    if (module0259.NIL != module0147.f9507(var55_244)) {
                                                                        var6_242 = module0138.$g1623$.currentBinding(var228);
                                                                        try {
                                                                            module0138.$g1623$.bind(var55_244, var228);
                                                                            for (var54_246 = module0066.f4838(module0067.f4891(var281)); module0259.NIL == var230 && module0259.NIL == module0066.f4841(var54_246); var54_246 = module0066.f4840(var54_246)) {
                                                                                var228.resetMultipleValues();
                                                                                var60_247 = module0066.f4839(var54_246);
                                                                                var282 = var228.secondMultipleValue();
                                                                                var228.resetMultipleValues();
                                                                                if (module0259.NIL != module0141.f9289(var60_247)) {
                                                                                    var6_243 = module0138.$g1624$.currentBinding(var228);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var60_247, var228);
                                                                                        var283 = var282;
                                                                                        if (module0259.NIL != module0077.f5302(var283)) {
                                                                                            var284 = module0077.f5333(var283);
                                                                                            for (var285 = module0032.f1741(var284), var286 = (SubLObject)module0259.NIL, var286 = module0032.f1742(var285, var284); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var285, var286); var286 = module0032.f1743(var286)) {
                                                                                                var287 = module0032.f1745(var285, var286);
                                                                                                if (module0259.NIL != module0032.f1746(var286, var287) && module0259.NIL == module0249.f16059(var287, (SubLObject)module0259.UNPROVIDED)) {
                                                                                                    module0249.f16055(var287, (SubLObject)module0259.UNPROVIDED);
                                                                                                    module0056.f4149(var287, var234);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var283.isList()) {
                                                                                            if (module0259.NIL == var230) {
                                                                                                var288 = var283;
                                                                                                var289 = (SubLObject)module0259.NIL;
                                                                                                var289 = var288.first();
                                                                                                while (module0259.NIL == var230 && module0259.NIL != var288) {
                                                                                                    if (module0259.NIL == module0249.f16059(var289, (SubLObject)module0259.UNPROVIDED)) {
                                                                                                        module0249.f16055(var289, (SubLObject)module0259.UNPROVIDED);
                                                                                                        module0056.f4149(var289, var234);
                                                                                                    }
                                                                                                    var288 = var288.rest();
                                                                                                    var289 = var288.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0259.$ic39$, var283);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var6_243, var228);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var54_246);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var6_242, var228);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var280);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0259.FIVE_INTEGER, (SubLObject)module0259.$ic40$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (module0259.NIL != module0155.f9785(var277, (SubLObject)module0259.UNPROVIDED)) {
                                                        var290 = ((module0259.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var228), module0137.f8955((SubLObject)module0259.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var228), module0137.f8955((SubLObject)module0259.UNPROVIDED)));
                                                        for (var47_256 = (SubLObject)module0259.NIL, var47_256 = var290; module0259.NIL == var230 && module0259.NIL != var47_256; var47_256 = var47_256.rest()) {
                                                            var291 = var47_256.first();
                                                            var6_244 = module0138.$g1625$.currentBinding(var228);
                                                            try {
                                                                module0138.$g1625$.bind(var291, var228);
                                                                var292 = (var293 = Functions.funcall(var291, var277));
                                                                if (module0259.NIL != module0077.f5302(var293)) {
                                                                    var294 = module0077.f5333(var293);
                                                                    for (var295 = module0032.f1741(var294), var296 = (SubLObject)module0259.NIL, var296 = module0032.f1742(var295, var294); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var295, var296); var296 = module0032.f1743(var296)) {
                                                                        var297 = module0032.f1745(var295, var296);
                                                                        if (module0259.NIL != module0032.f1746(var296, var297) && module0259.NIL == module0249.f16059(var297, (SubLObject)module0259.UNPROVIDED)) {
                                                                            module0249.f16055(var297, (SubLObject)module0259.UNPROVIDED);
                                                                            module0056.f4149(var297, var234);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var293.isList()) {
                                                                    if (module0259.NIL == var230) {
                                                                        var298 = var293;
                                                                        var299 = (SubLObject)module0259.NIL;
                                                                        var299 = var298.first();
                                                                        while (module0259.NIL == var230 && module0259.NIL != var298) {
                                                                            if (module0259.NIL == module0249.f16059(var299, (SubLObject)module0259.UNPROVIDED)) {
                                                                                module0249.f16055(var299, (SubLObject)module0259.UNPROVIDED);
                                                                                module0056.f4149(var299, var234);
                                                                            }
                                                                            var298 = var298.rest();
                                                                            var299 = var298.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0259.$ic39$, var293);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var6_244, var228);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var7_237, var228);
                                                    module0137.$g1605$.rebind(var6_241, var228);
                                                }
                                            }
                                            var141_229 = module0056.f4150(var234);
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var22_238, var228);
                                        module0138.$g1619$.rebind(var7_235, var228);
                                        module0141.$g1677$.rebind(var6_234, var228);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)module0259.TWO_INTEGER, (SubLObject)module0259.$ic117$, var124, module0244.f15748(module0137.f8955((SubLObject)module0259.UNPROVIDED)), (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var240, var228);
                                module0141.$g1674$.rebind(var239, var228);
                                module0141.$g1672$.rebind(var22_237, var228);
                                module0141.$g1671$.rebind(var7_234, var228);
                                module0141.$g1670$.rebind(var6_233, var228);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var7_233, var228);
                            module0141.$g1714$.rebind(var6_232, var228);
                        }
                    }
                    finally {
                        module0147.$g2096$.rebind(var236, var228);
                        module0147.$g2094$.rebind(var7_232, var228);
                        module0147.$g2095$.rebind(var6_231, var228);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var228));
                }
                finally {
                    module0139.$g1635$.rebind(var6_230, var228);
                }
            }
            module0139.f9011(module0139.$g1636$.getDynamicValue(var228));
        }
        finally {
            module0139.$g1636$.rebind(var232, var228);
            module0137.$g1605$.rebind(var231, var228);
        }
        return Numbers.numE(var229, var227);
    }
    
    public static SubLObject f16879(final SubLObject var124, final SubLObject var227, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLThread var228 = SubLProcess.currentSubLThread();
        SubLObject var229 = (SubLObject)module0259.ZERO_INTEGER;
        SubLObject var230 = (SubLObject)module0259.NIL;
        final SubLObject var231 = module0137.$g1605$.currentBinding(var228);
        final SubLObject var232 = module0139.$g1636$.currentBinding(var228);
        try {
            module0137.$g1605$.bind(module0137.f8955(module0259.$ic0$), var228);
            module0139.$g1636$.bind(module0139.f9007(), var228);
            if (module0259.NIL == var230) {
                SubLObject var141_266 = var124;
                final SubLObject var233 = (SubLObject)module0259.$ic115$;
                final SubLObject var234 = module0056.f4145(var233);
                final SubLObject var6_267 = module0139.$g1635$.currentBinding(var228);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var228);
                    final SubLObject var235 = var2;
                    final SubLObject var6_268 = module0147.$g2095$.currentBinding(var228);
                    final SubLObject var7_269 = module0147.$g2094$.currentBinding(var228);
                    final SubLObject var236 = module0147.$g2096$.currentBinding(var228);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var235), var228);
                        module0147.$g2094$.bind(module0147.f9546(var235), var228);
                        module0147.$g2096$.bind(module0147.f9549(var235), var228);
                        final SubLObject var237 = var3;
                        final SubLObject var6_269 = module0141.$g1714$.currentBinding(var228);
                        final SubLObject var7_270 = module0141.$g1715$.currentBinding(var228);
                        try {
                            module0141.$g1714$.bind((module0259.NIL != var237) ? var237 : module0141.f9283(), var228);
                            module0141.$g1715$.bind((SubLObject)((module0259.NIL != var237) ? module0259.$ic30$ : module0141.$g1715$.getDynamicValue(var228)), var228);
                            if (module0259.NIL != var237 && module0259.NIL != module0136.f8864() && module0259.NIL == module0141.f9279(var237)) {
                                final SubLObject var238 = module0136.$g1591$.getDynamicValue(var228);
                                if (var238.eql((SubLObject)module0259.$ic31$)) {
                                    module0136.f8870((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic32$, var237, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                }
                                else if (var238.eql((SubLObject)module0259.$ic34$)) {
                                    module0136.f8871((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var237, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                }
                                else if (var238.eql((SubLObject)module0259.$ic36$)) {
                                    Errors.warn((SubLObject)module0259.$ic32$, var237, (SubLObject)module0259.$ic33$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0259.$ic37$, module0136.$g1591$.getDynamicValue(var228));
                                    Errors.cerror((SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var237, (SubLObject)module0259.$ic33$);
                                }
                            }
                            final SubLObject var6_270 = module0141.$g1670$.currentBinding(var228);
                            final SubLObject var7_271 = module0141.$g1671$.currentBinding(var228);
                            final SubLObject var22_274 = module0141.$g1672$.currentBinding(var228);
                            final SubLObject var239 = module0141.$g1674$.currentBinding(var228);
                            final SubLObject var240 = module0137.$g1605$.currentBinding(var228);
                            try {
                                module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0259.$ic0$)), var228);
                                module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0259.$ic0$))), var228);
                                module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0259.$ic0$))), var228);
                                module0141.$g1674$.bind((SubLObject)module0259.NIL, var228);
                                module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0259.$ic0$)), var228);
                                if (module0259.NIL != module0136.f8865() || module0259.NIL != module0244.f15795(var124, module0137.f8955((SubLObject)module0259.UNPROVIDED))) {
                                    final SubLObject var6_271 = module0141.$g1677$.currentBinding(var228);
                                    final SubLObject var7_272 = module0138.$g1619$.currentBinding(var228);
                                    final SubLObject var22_275 = module0141.$g1674$.currentBinding(var228);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9210(), var228);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0259.$ic0$))), var228);
                                        module0141.$g1674$.bind((SubLObject)module0259.NIL, var228);
                                        module0249.f16055(var141_266, (SubLObject)module0259.UNPROVIDED);
                                        while (module0259.NIL != var141_266 && module0259.NIL == var230) {
                                            final SubLObject var241 = var141_266;
                                            final SubLObject var242 = module0200.f12443(module0137.f8955(module0259.$ic0$));
                                            SubLObject var243;
                                            SubLObject var244;
                                            SubLObject var6_272;
                                            SubLObject var7_273;
                                            SubLObject var245;
                                            SubLObject var246;
                                            SubLObject var247;
                                            SubLObject var248;
                                            SubLObject var55_280;
                                            SubLObject var249;
                                            SubLObject var6_273;
                                            SubLObject var54_282;
                                            SubLObject var60_283;
                                            SubLObject var250;
                                            SubLObject var6_274;
                                            SubLObject var251;
                                            SubLObject var252;
                                            SubLObject var253;
                                            SubLObject var254;
                                            SubLObject var255;
                                            SubLObject var256;
                                            SubLObject var257;
                                            SubLObject var258;
                                            SubLObject var259;
                                            SubLObject var261;
                                            SubLObject var260;
                                            SubLObject var262;
                                            SubLObject var171_287;
                                            SubLObject var173_288;
                                            SubLObject var6_275;
                                            SubLObject var6_276;
                                            SubLObject var263;
                                            SubLObject var68_291;
                                            SubLObject var264;
                                            SubLObject var47_292;
                                            SubLObject var265;
                                            SubLObject var6_277;
                                            SubLObject var267;
                                            SubLObject var266;
                                            SubLObject var268;
                                            SubLObject var269;
                                            SubLObject var270;
                                            SubLObject var271;
                                            SubLObject var272;
                                            SubLObject var273;
                                            for (var243 = (SubLObject)module0259.NIL, var243 = var242; module0259.NIL == var230 && module0259.NIL != var243; var243 = var243.rest()) {
                                                var244 = var243.first();
                                                var6_272 = module0137.$g1605$.currentBinding(var228);
                                                var7_273 = module0141.$g1674$.currentBinding(var228);
                                                try {
                                                    module0137.$g1605$.bind(var244, var228);
                                                    module0141.$g1674$.bind((SubLObject)((module0259.NIL != module0141.f9205((SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0259.NIL == module0141.$g1674$.getDynamicValue(var228)) : module0141.$g1674$.getDynamicValue(var228)), var228);
                                                    var245 = module0228.f15229(var241);
                                                    if (module0259.NIL != module0138.f8992(var245)) {
                                                        var246 = module0242.f15664(var245, module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                        if (module0259.NIL != var246) {
                                                            var247 = module0245.f15834(var246, module0244.f15780(module0137.f8955(module0259.$ic0$)), module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                            if (module0259.NIL != var247) {
                                                                for (var248 = module0066.f4838(module0067.f4891(var247)); module0259.NIL == var230 && module0259.NIL == module0066.f4841(var248); var248 = module0066.f4840(var248)) {
                                                                    var228.resetMultipleValues();
                                                                    var55_280 = module0066.f4839(var248);
                                                                    var249 = var228.secondMultipleValue();
                                                                    var228.resetMultipleValues();
                                                                    if (module0259.NIL != module0147.f9507(var55_280)) {
                                                                        var6_273 = module0138.$g1623$.currentBinding(var228);
                                                                        try {
                                                                            module0138.$g1623$.bind(var55_280, var228);
                                                                            for (var54_282 = module0066.f4838(module0067.f4891(var249)); module0259.NIL == var230 && module0259.NIL == module0066.f4841(var54_282); var54_282 = module0066.f4840(var54_282)) {
                                                                                var228.resetMultipleValues();
                                                                                var60_283 = module0066.f4839(var54_282);
                                                                                var250 = var228.secondMultipleValue();
                                                                                var228.resetMultipleValues();
                                                                                if (module0259.NIL != module0141.f9289(var60_283)) {
                                                                                    var6_274 = module0138.$g1624$.currentBinding(var228);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var60_283, var228);
                                                                                        var251 = var250;
                                                                                        if (module0259.NIL != module0077.f5302(var251)) {
                                                                                            var252 = module0077.f5333(var251);
                                                                                            for (var253 = module0032.f1741(var252), var254 = (SubLObject)module0259.NIL, var254 = module0032.f1742(var253, var252); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var253, var254); var254 = module0032.f1743(var254)) {
                                                                                                var255 = module0032.f1745(var253, var254);
                                                                                                if (module0259.NIL != module0032.f1746(var254, var255) && module0259.NIL == module0249.f16059(var255, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                                    module0249.f16055(var255, module0139.$g1636$.getDynamicValue(var228));
                                                                                                    var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                                    if (var229.numG(var227)) {
                                                                                                        var230 = (SubLObject)module0259.T;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var251.isList()) {
                                                                                            if (module0259.NIL == var230) {
                                                                                                var256 = var251;
                                                                                                var257 = (SubLObject)module0259.NIL;
                                                                                                var257 = var256.first();
                                                                                                while (module0259.NIL == var230 && module0259.NIL != var256) {
                                                                                                    if (module0259.NIL == module0249.f16059(var257, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                                        module0249.f16055(var257, module0139.$g1636$.getDynamicValue(var228));
                                                                                                        var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                                        if (var229.numG(var227)) {
                                                                                                            var230 = (SubLObject)module0259.T;
                                                                                                        }
                                                                                                    }
                                                                                                    var256 = var256.rest();
                                                                                                    var257 = var256.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0259.$ic39$, var251);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var6_274, var228);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var54_282);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var6_273, var228);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var248);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0259.FIVE_INTEGER, (SubLObject)module0259.$ic40$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                                        }
                                                        if (module0259.NIL != module0200.f12419(var245, module0137.f8955((SubLObject)module0259.UNPROVIDED)) && module0259.NIL == var230) {
                                                            var258 = module0248.f15995(var245);
                                                            var259 = (SubLObject)module0259.NIL;
                                                            var259 = var258.first();
                                                            while (module0259.NIL == var230 && module0259.NIL != var258) {
                                                                var260 = (var261 = var259);
                                                                var262 = (SubLObject)module0259.NIL;
                                                                var171_287 = (SubLObject)module0259.NIL;
                                                                var173_288 = (SubLObject)module0259.NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(var261, var260, (SubLObject)module0259.$ic116$);
                                                                var262 = var261.first();
                                                                var261 = var261.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var261, var260, (SubLObject)module0259.$ic116$);
                                                                var171_287 = var261.first();
                                                                var261 = var261.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var261, var260, (SubLObject)module0259.$ic116$);
                                                                var173_288 = var261.first();
                                                                var261 = var261.rest();
                                                                if (module0259.NIL == var261) {
                                                                    if (module0259.NIL != module0147.f9507(var171_287)) {
                                                                        var6_275 = module0138.$g1623$.currentBinding(var228);
                                                                        try {
                                                                            module0138.$g1623$.bind(var171_287, var228);
                                                                            if (module0259.NIL != module0141.f9289(var173_288)) {
                                                                                var6_276 = module0138.$g1624$.currentBinding(var228);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var173_288, var228);
                                                                                    var263 = (var251 = (SubLObject)ConsesLow.list(var262));
                                                                                    if (module0259.NIL != module0077.f5302(var251)) {
                                                                                        var252 = module0077.f5333(var251);
                                                                                        for (var253 = module0032.f1741(var252), var254 = (SubLObject)module0259.NIL, var254 = module0032.f1742(var253, var252); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var253, var254); var254 = module0032.f1743(var254)) {
                                                                                            var255 = module0032.f1745(var253, var254);
                                                                                            if (module0259.NIL != module0032.f1746(var254, var255) && module0259.NIL == module0249.f16059(var255, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                                module0249.f16055(var255, module0139.$g1636$.getDynamicValue(var228));
                                                                                                var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                                if (var229.numG(var227)) {
                                                                                                    var230 = (SubLObject)module0259.T;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var251.isList()) {
                                                                                        if (module0259.NIL == var230) {
                                                                                            var68_291 = var251;
                                                                                            var257 = (SubLObject)module0259.NIL;
                                                                                            var257 = var68_291.first();
                                                                                            while (module0259.NIL == var230 && module0259.NIL != var68_291) {
                                                                                                if (module0259.NIL == module0249.f16059(var257, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                                    module0249.f16055(var257, module0139.$g1636$.getDynamicValue(var228));
                                                                                                    var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                                    if (var229.numG(var227)) {
                                                                                                        var230 = (SubLObject)module0259.T;
                                                                                                    }
                                                                                                }
                                                                                                var68_291 = var68_291.rest();
                                                                                                var257 = var68_291.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0259.$ic39$, var251);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_276, var228);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var6_275, var228);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(var260, (SubLObject)module0259.$ic116$);
                                                                }
                                                                var258 = var258.rest();
                                                                var259 = var258.first();
                                                            }
                                                        }
                                                    }
                                                    else if (module0259.NIL != module0155.f9785(var245, (SubLObject)module0259.UNPROVIDED)) {
                                                        var264 = ((module0259.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0259.$ic0$)), module0141.$g1714$.getDynamicValue(var228), module0137.f8955((SubLObject)module0259.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0259.$ic0$)), module0141.$g1714$.getDynamicValue(var228), module0137.f8955((SubLObject)module0259.UNPROVIDED)));
                                                        for (var47_292 = (SubLObject)module0259.NIL, var47_292 = var264; module0259.NIL == var230 && module0259.NIL != var47_292; var47_292 = var47_292.rest()) {
                                                            var265 = var47_292.first();
                                                            var6_277 = module0138.$g1625$.currentBinding(var228);
                                                            try {
                                                                module0138.$g1625$.bind(var265, var228);
                                                                var266 = (var267 = Functions.funcall(var265, var245));
                                                                if (module0259.NIL != module0077.f5302(var267)) {
                                                                    var268 = module0077.f5333(var267);
                                                                    for (var269 = module0032.f1741(var268), var270 = (SubLObject)module0259.NIL, var270 = module0032.f1742(var269, var268); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var269, var270); var270 = module0032.f1743(var270)) {
                                                                        var271 = module0032.f1745(var269, var270);
                                                                        if (module0259.NIL != module0032.f1746(var270, var271) && module0259.NIL == module0249.f16059(var271, module0139.$g1636$.getDynamicValue(var228))) {
                                                                            module0249.f16055(var271, module0139.$g1636$.getDynamicValue(var228));
                                                                            var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                            if (var229.numG(var227)) {
                                                                                var230 = (SubLObject)module0259.T;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (var267.isList()) {
                                                                    if (module0259.NIL == var230) {
                                                                        var272 = var267;
                                                                        var273 = (SubLObject)module0259.NIL;
                                                                        var273 = var272.first();
                                                                        while (module0259.NIL == var230 && module0259.NIL != var272) {
                                                                            if (module0259.NIL == module0249.f16059(var273, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                module0249.f16055(var273, module0139.$g1636$.getDynamicValue(var228));
                                                                                var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                if (var229.numG(var227)) {
                                                                                    var230 = (SubLObject)module0259.T;
                                                                                }
                                                                            }
                                                                            var272 = var272.rest();
                                                                            var273 = var272.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0259.$ic39$, var267);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var6_277, var228);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var7_273, var228);
                                                    module0137.$g1605$.rebind(var6_272, var228);
                                                }
                                            }
                                            final SubLObject var274 = module0200.f12443(module0244.f15771(module0137.f8955(module0259.$ic0$)));
                                            SubLObject var275;
                                            SubLObject var276;
                                            SubLObject var6_278;
                                            SubLObject var7_274;
                                            SubLObject var277;
                                            SubLObject var278;
                                            SubLObject var279;
                                            SubLObject var280;
                                            SubLObject var55_281;
                                            SubLObject var281;
                                            SubLObject var6_279;
                                            SubLObject var54_283;
                                            SubLObject var60_284;
                                            SubLObject var282;
                                            SubLObject var6_280;
                                            SubLObject var283;
                                            SubLObject var284;
                                            SubLObject var285;
                                            SubLObject var286;
                                            SubLObject var287;
                                            SubLObject var288;
                                            SubLObject var289;
                                            SubLObject var290;
                                            SubLObject var47_293;
                                            SubLObject var291;
                                            SubLObject var6_281;
                                            SubLObject var293;
                                            SubLObject var292;
                                            SubLObject var294;
                                            SubLObject var295;
                                            SubLObject var296;
                                            SubLObject var297;
                                            SubLObject var298;
                                            SubLObject var299;
                                            for (var275 = (SubLObject)module0259.NIL, var275 = var274; module0259.NIL == var230 && module0259.NIL != var275; var275 = var275.rest()) {
                                                var276 = var275.first();
                                                var6_278 = module0137.$g1605$.currentBinding(var228);
                                                var7_274 = module0141.$g1674$.currentBinding(var228);
                                                try {
                                                    module0137.$g1605$.bind(var276, var228);
                                                    module0141.$g1674$.bind((SubLObject)((module0259.NIL != module0141.f9205((SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0259.NIL == module0141.$g1674$.getDynamicValue(var228)) : module0141.$g1674$.getDynamicValue(var228)), var228);
                                                    var277 = module0228.f15229(var141_266);
                                                    if (module0259.NIL != module0138.f8992(var277)) {
                                                        var278 = module0242.f15664(var277, module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                        if (module0259.NIL != var278) {
                                                            var279 = module0245.f15834(var278, module0138.f8979(), module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                            if (module0259.NIL != var279) {
                                                                for (var280 = module0066.f4838(module0067.f4891(var279)); module0259.NIL == var230 && module0259.NIL == module0066.f4841(var280); var280 = module0066.f4840(var280)) {
                                                                    var228.resetMultipleValues();
                                                                    var55_281 = module0066.f4839(var280);
                                                                    var281 = var228.secondMultipleValue();
                                                                    var228.resetMultipleValues();
                                                                    if (module0259.NIL != module0147.f9507(var55_281)) {
                                                                        var6_279 = module0138.$g1623$.currentBinding(var228);
                                                                        try {
                                                                            module0138.$g1623$.bind(var55_281, var228);
                                                                            for (var54_283 = module0066.f4838(module0067.f4891(var281)); module0259.NIL == var230 && module0259.NIL == module0066.f4841(var54_283); var54_283 = module0066.f4840(var54_283)) {
                                                                                var228.resetMultipleValues();
                                                                                var60_284 = module0066.f4839(var54_283);
                                                                                var282 = var228.secondMultipleValue();
                                                                                var228.resetMultipleValues();
                                                                                if (module0259.NIL != module0141.f9289(var60_284)) {
                                                                                    var6_280 = module0138.$g1624$.currentBinding(var228);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var60_284, var228);
                                                                                        var283 = var282;
                                                                                        if (module0259.NIL != module0077.f5302(var283)) {
                                                                                            var284 = module0077.f5333(var283);
                                                                                            for (var285 = module0032.f1741(var284), var286 = (SubLObject)module0259.NIL, var286 = module0032.f1742(var285, var284); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var285, var286); var286 = module0032.f1743(var286)) {
                                                                                                var287 = module0032.f1745(var285, var286);
                                                                                                if (module0259.NIL != module0032.f1746(var286, var287) && module0259.NIL == module0249.f16059(var287, (SubLObject)module0259.UNPROVIDED)) {
                                                                                                    module0249.f16055(var287, (SubLObject)module0259.UNPROVIDED);
                                                                                                    module0056.f4149(var287, var234);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var283.isList()) {
                                                                                            if (module0259.NIL == var230) {
                                                                                                var288 = var283;
                                                                                                var289 = (SubLObject)module0259.NIL;
                                                                                                var289 = var288.first();
                                                                                                while (module0259.NIL == var230 && module0259.NIL != var288) {
                                                                                                    if (module0259.NIL == module0249.f16059(var289, (SubLObject)module0259.UNPROVIDED)) {
                                                                                                        module0249.f16055(var289, (SubLObject)module0259.UNPROVIDED);
                                                                                                        module0056.f4149(var289, var234);
                                                                                                    }
                                                                                                    var288 = var288.rest();
                                                                                                    var289 = var288.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0259.$ic39$, var283);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var6_280, var228);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var54_283);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var6_279, var228);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var280);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0259.FIVE_INTEGER, (SubLObject)module0259.$ic40$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (module0259.NIL != module0155.f9785(var277, (SubLObject)module0259.UNPROVIDED)) {
                                                        var290 = ((module0259.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var228), module0137.f8955((SubLObject)module0259.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var228), module0137.f8955((SubLObject)module0259.UNPROVIDED)));
                                                        for (var47_293 = (SubLObject)module0259.NIL, var47_293 = var290; module0259.NIL == var230 && module0259.NIL != var47_293; var47_293 = var47_293.rest()) {
                                                            var291 = var47_293.first();
                                                            var6_281 = module0138.$g1625$.currentBinding(var228);
                                                            try {
                                                                module0138.$g1625$.bind(var291, var228);
                                                                var292 = (var293 = Functions.funcall(var291, var277));
                                                                if (module0259.NIL != module0077.f5302(var293)) {
                                                                    var294 = module0077.f5333(var293);
                                                                    for (var295 = module0032.f1741(var294), var296 = (SubLObject)module0259.NIL, var296 = module0032.f1742(var295, var294); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var295, var296); var296 = module0032.f1743(var296)) {
                                                                        var297 = module0032.f1745(var295, var296);
                                                                        if (module0259.NIL != module0032.f1746(var296, var297) && module0259.NIL == module0249.f16059(var297, (SubLObject)module0259.UNPROVIDED)) {
                                                                            module0249.f16055(var297, (SubLObject)module0259.UNPROVIDED);
                                                                            module0056.f4149(var297, var234);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var293.isList()) {
                                                                    if (module0259.NIL == var230) {
                                                                        var298 = var293;
                                                                        var299 = (SubLObject)module0259.NIL;
                                                                        var299 = var298.first();
                                                                        while (module0259.NIL == var230 && module0259.NIL != var298) {
                                                                            if (module0259.NIL == module0249.f16059(var299, (SubLObject)module0259.UNPROVIDED)) {
                                                                                module0249.f16055(var299, (SubLObject)module0259.UNPROVIDED);
                                                                                module0056.f4149(var299, var234);
                                                                            }
                                                                            var298 = var298.rest();
                                                                            var299 = var298.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0259.$ic39$, var293);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var6_281, var228);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var7_274, var228);
                                                    module0137.$g1605$.rebind(var6_278, var228);
                                                }
                                            }
                                            var141_266 = module0056.f4150(var234);
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var22_275, var228);
                                        module0138.$g1619$.rebind(var7_272, var228);
                                        module0141.$g1677$.rebind(var6_271, var228);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)module0259.TWO_INTEGER, (SubLObject)module0259.$ic117$, var124, module0244.f15748(module0137.f8955((SubLObject)module0259.UNPROVIDED)), (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var240, var228);
                                module0141.$g1674$.rebind(var239, var228);
                                module0141.$g1672$.rebind(var22_274, var228);
                                module0141.$g1671$.rebind(var7_271, var228);
                                module0141.$g1670$.rebind(var6_270, var228);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var7_270, var228);
                            module0141.$g1714$.rebind(var6_269, var228);
                        }
                    }
                    finally {
                        module0147.$g2096$.rebind(var236, var228);
                        module0147.$g2094$.rebind(var7_269, var228);
                        module0147.$g2095$.rebind(var6_268, var228);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var228));
                }
                finally {
                    module0139.$g1635$.rebind(var6_267, var228);
                }
            }
            module0139.f9011(module0139.$g1636$.getDynamicValue(var228));
        }
        finally {
            module0139.$g1636$.rebind(var232, var228);
            module0137.$g1605$.rebind(var231, var228);
        }
        return var230;
    }
    
    public static SubLObject f16880(final SubLObject var124, final SubLObject var227, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLThread var228 = SubLProcess.currentSubLThread();
        SubLObject var229 = (SubLObject)module0259.ZERO_INTEGER;
        SubLObject var230 = (SubLObject)module0259.NIL;
        final SubLObject var231 = module0137.$g1605$.currentBinding(var228);
        final SubLObject var232 = module0139.$g1636$.currentBinding(var228);
        try {
            module0137.$g1605$.bind(module0137.f8955(module0259.$ic0$), var228);
            module0139.$g1636$.bind(module0139.f9007(), var228);
            if (module0259.NIL == var230) {
                SubLObject var141_304 = var124;
                final SubLObject var233 = (SubLObject)module0259.$ic115$;
                final SubLObject var234 = module0056.f4145(var233);
                final SubLObject var6_305 = module0139.$g1635$.currentBinding(var228);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var228);
                    final SubLObject var235 = var2;
                    final SubLObject var6_306 = module0147.$g2095$.currentBinding(var228);
                    final SubLObject var7_307 = module0147.$g2094$.currentBinding(var228);
                    final SubLObject var236 = module0147.$g2096$.currentBinding(var228);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var235), var228);
                        module0147.$g2094$.bind(module0147.f9546(var235), var228);
                        module0147.$g2096$.bind(module0147.f9549(var235), var228);
                        final SubLObject var237 = var3;
                        final SubLObject var6_307 = module0141.$g1714$.currentBinding(var228);
                        final SubLObject var7_308 = module0141.$g1715$.currentBinding(var228);
                        try {
                            module0141.$g1714$.bind((module0259.NIL != var237) ? var237 : module0141.f9283(), var228);
                            module0141.$g1715$.bind((SubLObject)((module0259.NIL != var237) ? module0259.$ic30$ : module0141.$g1715$.getDynamicValue(var228)), var228);
                            if (module0259.NIL != var237 && module0259.NIL != module0136.f8864() && module0259.NIL == module0141.f9279(var237)) {
                                final SubLObject var238 = module0136.$g1591$.getDynamicValue(var228);
                                if (var238.eql((SubLObject)module0259.$ic31$)) {
                                    module0136.f8870((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic32$, var237, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                }
                                else if (var238.eql((SubLObject)module0259.$ic34$)) {
                                    module0136.f8871((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var237, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                }
                                else if (var238.eql((SubLObject)module0259.$ic36$)) {
                                    Errors.warn((SubLObject)module0259.$ic32$, var237, (SubLObject)module0259.$ic33$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0259.$ic37$, module0136.$g1591$.getDynamicValue(var228));
                                    Errors.cerror((SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var237, (SubLObject)module0259.$ic33$);
                                }
                            }
                            final SubLObject var6_308 = module0141.$g1670$.currentBinding(var228);
                            final SubLObject var7_309 = module0141.$g1671$.currentBinding(var228);
                            final SubLObject var22_312 = module0141.$g1672$.currentBinding(var228);
                            final SubLObject var239 = module0141.$g1674$.currentBinding(var228);
                            final SubLObject var240 = module0137.$g1605$.currentBinding(var228);
                            try {
                                module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0259.$ic0$)), var228);
                                module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0259.$ic0$))), var228);
                                module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0259.$ic0$))), var228);
                                module0141.$g1674$.bind((SubLObject)module0259.NIL, var228);
                                module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0259.$ic0$)), var228);
                                if (module0259.NIL != module0136.f8865() || module0259.NIL != module0244.f15795(var124, module0137.f8955((SubLObject)module0259.UNPROVIDED))) {
                                    final SubLObject var6_309 = module0141.$g1677$.currentBinding(var228);
                                    final SubLObject var7_310 = module0138.$g1619$.currentBinding(var228);
                                    final SubLObject var22_313 = module0141.$g1674$.currentBinding(var228);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9210(), var228);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0259.$ic0$))), var228);
                                        module0141.$g1674$.bind((SubLObject)module0259.NIL, var228);
                                        module0249.f16055(var141_304, (SubLObject)module0259.UNPROVIDED);
                                        while (module0259.NIL != var141_304 && module0259.NIL == var230) {
                                            final SubLObject var241 = var141_304;
                                            final SubLObject var242 = module0200.f12443(module0137.f8955(module0259.$ic0$));
                                            SubLObject var243;
                                            SubLObject var244;
                                            SubLObject var6_310;
                                            SubLObject var7_311;
                                            SubLObject var245;
                                            SubLObject var246;
                                            SubLObject var247;
                                            SubLObject var248;
                                            SubLObject var55_318;
                                            SubLObject var249;
                                            SubLObject var6_311;
                                            SubLObject var54_320;
                                            SubLObject var60_321;
                                            SubLObject var250;
                                            SubLObject var6_312;
                                            SubLObject var251;
                                            SubLObject var252;
                                            SubLObject var253;
                                            SubLObject var254;
                                            SubLObject var255;
                                            SubLObject var256;
                                            SubLObject var257;
                                            SubLObject var258;
                                            SubLObject var259;
                                            SubLObject var261;
                                            SubLObject var260;
                                            SubLObject var262;
                                            SubLObject var171_325;
                                            SubLObject var173_326;
                                            SubLObject var6_313;
                                            SubLObject var6_314;
                                            SubLObject var263;
                                            SubLObject var68_329;
                                            SubLObject var264;
                                            SubLObject var47_330;
                                            SubLObject var265;
                                            SubLObject var6_315;
                                            SubLObject var267;
                                            SubLObject var266;
                                            SubLObject var268;
                                            SubLObject var269;
                                            SubLObject var270;
                                            SubLObject var271;
                                            SubLObject var272;
                                            SubLObject var273;
                                            for (var243 = (SubLObject)module0259.NIL, var243 = var242; module0259.NIL == var230 && module0259.NIL != var243; var243 = var243.rest()) {
                                                var244 = var243.first();
                                                var6_310 = module0137.$g1605$.currentBinding(var228);
                                                var7_311 = module0141.$g1674$.currentBinding(var228);
                                                try {
                                                    module0137.$g1605$.bind(var244, var228);
                                                    module0141.$g1674$.bind((SubLObject)((module0259.NIL != module0141.f9205((SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0259.NIL == module0141.$g1674$.getDynamicValue(var228)) : module0141.$g1674$.getDynamicValue(var228)), var228);
                                                    var245 = module0228.f15229(var241);
                                                    if (module0259.NIL != module0138.f8992(var245)) {
                                                        var246 = module0242.f15664(var245, module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                        if (module0259.NIL != var246) {
                                                            var247 = module0245.f15834(var246, module0244.f15780(module0137.f8955(module0259.$ic0$)), module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                            if (module0259.NIL != var247) {
                                                                for (var248 = module0066.f4838(module0067.f4891(var247)); module0259.NIL == var230 && module0259.NIL == module0066.f4841(var248); var248 = module0066.f4840(var248)) {
                                                                    var228.resetMultipleValues();
                                                                    var55_318 = module0066.f4839(var248);
                                                                    var249 = var228.secondMultipleValue();
                                                                    var228.resetMultipleValues();
                                                                    if (module0259.NIL != module0147.f9507(var55_318)) {
                                                                        var6_311 = module0138.$g1623$.currentBinding(var228);
                                                                        try {
                                                                            module0138.$g1623$.bind(var55_318, var228);
                                                                            for (var54_320 = module0066.f4838(module0067.f4891(var249)); module0259.NIL == var230 && module0259.NIL == module0066.f4841(var54_320); var54_320 = module0066.f4840(var54_320)) {
                                                                                var228.resetMultipleValues();
                                                                                var60_321 = module0066.f4839(var54_320);
                                                                                var250 = var228.secondMultipleValue();
                                                                                var228.resetMultipleValues();
                                                                                if (module0259.NIL != module0141.f9289(var60_321)) {
                                                                                    var6_312 = module0138.$g1624$.currentBinding(var228);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var60_321, var228);
                                                                                        var251 = var250;
                                                                                        if (module0259.NIL != module0077.f5302(var251)) {
                                                                                            var252 = module0077.f5333(var251);
                                                                                            for (var253 = module0032.f1741(var252), var254 = (SubLObject)module0259.NIL, var254 = module0032.f1742(var253, var252); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var253, var254); var254 = module0032.f1743(var254)) {
                                                                                                var255 = module0032.f1745(var253, var254);
                                                                                                if (module0259.NIL != module0032.f1746(var254, var255) && module0259.NIL == module0249.f16059(var255, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                                    module0249.f16055(var255, module0139.$g1636$.getDynamicValue(var228));
                                                                                                    var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                                    if (var229.numGE(var227)) {
                                                                                                        var230 = (SubLObject)module0259.T;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var251.isList()) {
                                                                                            if (module0259.NIL == var230) {
                                                                                                var256 = var251;
                                                                                                var257 = (SubLObject)module0259.NIL;
                                                                                                var257 = var256.first();
                                                                                                while (module0259.NIL == var230 && module0259.NIL != var256) {
                                                                                                    if (module0259.NIL == module0249.f16059(var257, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                                        module0249.f16055(var257, module0139.$g1636$.getDynamicValue(var228));
                                                                                                        var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                                        if (var229.numGE(var227)) {
                                                                                                            var230 = (SubLObject)module0259.T;
                                                                                                        }
                                                                                                    }
                                                                                                    var256 = var256.rest();
                                                                                                    var257 = var256.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0259.$ic39$, var251);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var6_312, var228);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var54_320);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var6_311, var228);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var248);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0259.FIVE_INTEGER, (SubLObject)module0259.$ic40$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                                        }
                                                        if (module0259.NIL != module0200.f12419(var245, module0137.f8955((SubLObject)module0259.UNPROVIDED)) && module0259.NIL == var230) {
                                                            var258 = module0248.f15995(var245);
                                                            var259 = (SubLObject)module0259.NIL;
                                                            var259 = var258.first();
                                                            while (module0259.NIL == var230 && module0259.NIL != var258) {
                                                                var260 = (var261 = var259);
                                                                var262 = (SubLObject)module0259.NIL;
                                                                var171_325 = (SubLObject)module0259.NIL;
                                                                var173_326 = (SubLObject)module0259.NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(var261, var260, (SubLObject)module0259.$ic116$);
                                                                var262 = var261.first();
                                                                var261 = var261.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var261, var260, (SubLObject)module0259.$ic116$);
                                                                var171_325 = var261.first();
                                                                var261 = var261.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var261, var260, (SubLObject)module0259.$ic116$);
                                                                var173_326 = var261.first();
                                                                var261 = var261.rest();
                                                                if (module0259.NIL == var261) {
                                                                    if (module0259.NIL != module0147.f9507(var171_325)) {
                                                                        var6_313 = module0138.$g1623$.currentBinding(var228);
                                                                        try {
                                                                            module0138.$g1623$.bind(var171_325, var228);
                                                                            if (module0259.NIL != module0141.f9289(var173_326)) {
                                                                                var6_314 = module0138.$g1624$.currentBinding(var228);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var173_326, var228);
                                                                                    var263 = (var251 = (SubLObject)ConsesLow.list(var262));
                                                                                    if (module0259.NIL != module0077.f5302(var251)) {
                                                                                        var252 = module0077.f5333(var251);
                                                                                        for (var253 = module0032.f1741(var252), var254 = (SubLObject)module0259.NIL, var254 = module0032.f1742(var253, var252); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var253, var254); var254 = module0032.f1743(var254)) {
                                                                                            var255 = module0032.f1745(var253, var254);
                                                                                            if (module0259.NIL != module0032.f1746(var254, var255) && module0259.NIL == module0249.f16059(var255, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                                module0249.f16055(var255, module0139.$g1636$.getDynamicValue(var228));
                                                                                                var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                                if (var229.numGE(var227)) {
                                                                                                    var230 = (SubLObject)module0259.T;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var251.isList()) {
                                                                                        if (module0259.NIL == var230) {
                                                                                            var68_329 = var251;
                                                                                            var257 = (SubLObject)module0259.NIL;
                                                                                            var257 = var68_329.first();
                                                                                            while (module0259.NIL == var230 && module0259.NIL != var68_329) {
                                                                                                if (module0259.NIL == module0249.f16059(var257, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                                    module0249.f16055(var257, module0139.$g1636$.getDynamicValue(var228));
                                                                                                    var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                                    if (var229.numGE(var227)) {
                                                                                                        var230 = (SubLObject)module0259.T;
                                                                                                    }
                                                                                                }
                                                                                                var68_329 = var68_329.rest();
                                                                                                var257 = var68_329.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0259.$ic39$, var251);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_314, var228);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var6_313, var228);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(var260, (SubLObject)module0259.$ic116$);
                                                                }
                                                                var258 = var258.rest();
                                                                var259 = var258.first();
                                                            }
                                                        }
                                                    }
                                                    else if (module0259.NIL != module0155.f9785(var245, (SubLObject)module0259.UNPROVIDED)) {
                                                        var264 = ((module0259.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0259.$ic0$)), module0141.$g1714$.getDynamicValue(var228), module0137.f8955((SubLObject)module0259.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0259.$ic0$)), module0141.$g1714$.getDynamicValue(var228), module0137.f8955((SubLObject)module0259.UNPROVIDED)));
                                                        for (var47_330 = (SubLObject)module0259.NIL, var47_330 = var264; module0259.NIL == var230 && module0259.NIL != var47_330; var47_330 = var47_330.rest()) {
                                                            var265 = var47_330.first();
                                                            var6_315 = module0138.$g1625$.currentBinding(var228);
                                                            try {
                                                                module0138.$g1625$.bind(var265, var228);
                                                                var266 = (var267 = Functions.funcall(var265, var245));
                                                                if (module0259.NIL != module0077.f5302(var267)) {
                                                                    var268 = module0077.f5333(var267);
                                                                    for (var269 = module0032.f1741(var268), var270 = (SubLObject)module0259.NIL, var270 = module0032.f1742(var269, var268); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var269, var270); var270 = module0032.f1743(var270)) {
                                                                        var271 = module0032.f1745(var269, var270);
                                                                        if (module0259.NIL != module0032.f1746(var270, var271) && module0259.NIL == module0249.f16059(var271, module0139.$g1636$.getDynamicValue(var228))) {
                                                                            module0249.f16055(var271, module0139.$g1636$.getDynamicValue(var228));
                                                                            var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                            if (var229.numGE(var227)) {
                                                                                var230 = (SubLObject)module0259.T;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (var267.isList()) {
                                                                    if (module0259.NIL == var230) {
                                                                        var272 = var267;
                                                                        var273 = (SubLObject)module0259.NIL;
                                                                        var273 = var272.first();
                                                                        while (module0259.NIL == var230 && module0259.NIL != var272) {
                                                                            if (module0259.NIL == module0249.f16059(var273, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                module0249.f16055(var273, module0139.$g1636$.getDynamicValue(var228));
                                                                                var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                if (var229.numGE(var227)) {
                                                                                    var230 = (SubLObject)module0259.T;
                                                                                }
                                                                            }
                                                                            var272 = var272.rest();
                                                                            var273 = var272.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0259.$ic39$, var267);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var6_315, var228);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var7_311, var228);
                                                    module0137.$g1605$.rebind(var6_310, var228);
                                                }
                                            }
                                            final SubLObject var274 = module0200.f12443(module0244.f15771(module0137.f8955(module0259.$ic0$)));
                                            SubLObject var275;
                                            SubLObject var276;
                                            SubLObject var6_316;
                                            SubLObject var7_312;
                                            SubLObject var277;
                                            SubLObject var278;
                                            SubLObject var279;
                                            SubLObject var280;
                                            SubLObject var55_319;
                                            SubLObject var281;
                                            SubLObject var6_317;
                                            SubLObject var54_321;
                                            SubLObject var60_322;
                                            SubLObject var282;
                                            SubLObject var6_318;
                                            SubLObject var283;
                                            SubLObject var284;
                                            SubLObject var285;
                                            SubLObject var286;
                                            SubLObject var287;
                                            SubLObject var288;
                                            SubLObject var289;
                                            SubLObject var290;
                                            SubLObject var47_331;
                                            SubLObject var291;
                                            SubLObject var6_319;
                                            SubLObject var293;
                                            SubLObject var292;
                                            SubLObject var294;
                                            SubLObject var295;
                                            SubLObject var296;
                                            SubLObject var297;
                                            SubLObject var298;
                                            SubLObject var299;
                                            for (var275 = (SubLObject)module0259.NIL, var275 = var274; module0259.NIL == var230 && module0259.NIL != var275; var275 = var275.rest()) {
                                                var276 = var275.first();
                                                var6_316 = module0137.$g1605$.currentBinding(var228);
                                                var7_312 = module0141.$g1674$.currentBinding(var228);
                                                try {
                                                    module0137.$g1605$.bind(var276, var228);
                                                    module0141.$g1674$.bind((SubLObject)((module0259.NIL != module0141.f9205((SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0259.NIL == module0141.$g1674$.getDynamicValue(var228)) : module0141.$g1674$.getDynamicValue(var228)), var228);
                                                    var277 = module0228.f15229(var141_304);
                                                    if (module0259.NIL != module0138.f8992(var277)) {
                                                        var278 = module0242.f15664(var277, module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                        if (module0259.NIL != var278) {
                                                            var279 = module0245.f15834(var278, module0138.f8979(), module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                            if (module0259.NIL != var279) {
                                                                for (var280 = module0066.f4838(module0067.f4891(var279)); module0259.NIL == var230 && module0259.NIL == module0066.f4841(var280); var280 = module0066.f4840(var280)) {
                                                                    var228.resetMultipleValues();
                                                                    var55_319 = module0066.f4839(var280);
                                                                    var281 = var228.secondMultipleValue();
                                                                    var228.resetMultipleValues();
                                                                    if (module0259.NIL != module0147.f9507(var55_319)) {
                                                                        var6_317 = module0138.$g1623$.currentBinding(var228);
                                                                        try {
                                                                            module0138.$g1623$.bind(var55_319, var228);
                                                                            for (var54_321 = module0066.f4838(module0067.f4891(var281)); module0259.NIL == var230 && module0259.NIL == module0066.f4841(var54_321); var54_321 = module0066.f4840(var54_321)) {
                                                                                var228.resetMultipleValues();
                                                                                var60_322 = module0066.f4839(var54_321);
                                                                                var282 = var228.secondMultipleValue();
                                                                                var228.resetMultipleValues();
                                                                                if (module0259.NIL != module0141.f9289(var60_322)) {
                                                                                    var6_318 = module0138.$g1624$.currentBinding(var228);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var60_322, var228);
                                                                                        var283 = var282;
                                                                                        if (module0259.NIL != module0077.f5302(var283)) {
                                                                                            var284 = module0077.f5333(var283);
                                                                                            for (var285 = module0032.f1741(var284), var286 = (SubLObject)module0259.NIL, var286 = module0032.f1742(var285, var284); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var285, var286); var286 = module0032.f1743(var286)) {
                                                                                                var287 = module0032.f1745(var285, var286);
                                                                                                if (module0259.NIL != module0032.f1746(var286, var287) && module0259.NIL == module0249.f16059(var287, (SubLObject)module0259.UNPROVIDED)) {
                                                                                                    module0249.f16055(var287, (SubLObject)module0259.UNPROVIDED);
                                                                                                    module0056.f4149(var287, var234);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var283.isList()) {
                                                                                            if (module0259.NIL == var230) {
                                                                                                var288 = var283;
                                                                                                var289 = (SubLObject)module0259.NIL;
                                                                                                var289 = var288.first();
                                                                                                while (module0259.NIL == var230 && module0259.NIL != var288) {
                                                                                                    if (module0259.NIL == module0249.f16059(var289, (SubLObject)module0259.UNPROVIDED)) {
                                                                                                        module0249.f16055(var289, (SubLObject)module0259.UNPROVIDED);
                                                                                                        module0056.f4149(var289, var234);
                                                                                                    }
                                                                                                    var288 = var288.rest();
                                                                                                    var289 = var288.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0259.$ic39$, var283);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var6_318, var228);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var54_321);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var6_317, var228);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var280);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0259.FIVE_INTEGER, (SubLObject)module0259.$ic40$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (module0259.NIL != module0155.f9785(var277, (SubLObject)module0259.UNPROVIDED)) {
                                                        var290 = ((module0259.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var228), module0137.f8955((SubLObject)module0259.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var228), module0137.f8955((SubLObject)module0259.UNPROVIDED)));
                                                        for (var47_331 = (SubLObject)module0259.NIL, var47_331 = var290; module0259.NIL == var230 && module0259.NIL != var47_331; var47_331 = var47_331.rest()) {
                                                            var291 = var47_331.first();
                                                            var6_319 = module0138.$g1625$.currentBinding(var228);
                                                            try {
                                                                module0138.$g1625$.bind(var291, var228);
                                                                var292 = (var293 = Functions.funcall(var291, var277));
                                                                if (module0259.NIL != module0077.f5302(var293)) {
                                                                    var294 = module0077.f5333(var293);
                                                                    for (var295 = module0032.f1741(var294), var296 = (SubLObject)module0259.NIL, var296 = module0032.f1742(var295, var294); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var295, var296); var296 = module0032.f1743(var296)) {
                                                                        var297 = module0032.f1745(var295, var296);
                                                                        if (module0259.NIL != module0032.f1746(var296, var297) && module0259.NIL == module0249.f16059(var297, (SubLObject)module0259.UNPROVIDED)) {
                                                                            module0249.f16055(var297, (SubLObject)module0259.UNPROVIDED);
                                                                            module0056.f4149(var297, var234);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var293.isList()) {
                                                                    if (module0259.NIL == var230) {
                                                                        var298 = var293;
                                                                        var299 = (SubLObject)module0259.NIL;
                                                                        var299 = var298.first();
                                                                        while (module0259.NIL == var230 && module0259.NIL != var298) {
                                                                            if (module0259.NIL == module0249.f16059(var299, (SubLObject)module0259.UNPROVIDED)) {
                                                                                module0249.f16055(var299, (SubLObject)module0259.UNPROVIDED);
                                                                                module0056.f4149(var299, var234);
                                                                            }
                                                                            var298 = var298.rest();
                                                                            var299 = var298.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0259.$ic39$, var293);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var6_319, var228);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var7_312, var228);
                                                    module0137.$g1605$.rebind(var6_316, var228);
                                                }
                                            }
                                            var141_304 = module0056.f4150(var234);
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var22_313, var228);
                                        module0138.$g1619$.rebind(var7_310, var228);
                                        module0141.$g1677$.rebind(var6_309, var228);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)module0259.TWO_INTEGER, (SubLObject)module0259.$ic117$, var124, module0244.f15748(module0137.f8955((SubLObject)module0259.UNPROVIDED)), (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var240, var228);
                                module0141.$g1674$.rebind(var239, var228);
                                module0141.$g1672$.rebind(var22_312, var228);
                                module0141.$g1671$.rebind(var7_309, var228);
                                module0141.$g1670$.rebind(var6_308, var228);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var7_308, var228);
                            module0141.$g1714$.rebind(var6_307, var228);
                        }
                    }
                    finally {
                        module0147.$g2096$.rebind(var236, var228);
                        module0147.$g2094$.rebind(var7_307, var228);
                        module0147.$g2095$.rebind(var6_306, var228);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var228));
                }
                finally {
                    module0139.$g1635$.rebind(var6_305, var228);
                }
            }
            module0139.f9011(module0139.$g1636$.getDynamicValue(var228));
        }
        finally {
            module0139.$g1636$.rebind(var232, var228);
            module0137.$g1605$.rebind(var231, var228);
        }
        return var230;
    }
    
    public static SubLObject f16881(final SubLObject var124, final SubLObject var227, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        return Numbers.numL(f16876(var124, var2, var3), var227);
    }
    
    public static SubLObject f16882(final SubLObject var124, final SubLObject var227, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        return Numbers.numLE(f16876(var124, var2, var3), var227);
    }
    
    public static SubLObject f16883(final SubLObject var124, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLThread var125 = SubLProcess.currentSubLThread();
        assert module0259.NIL != module0210.f13565(var124) : var124;
        SubLObject var126 = (SubLObject)module0259.ZERO_INTEGER;
        final SubLObject var127 = module0137.$g1605$.currentBinding(var125);
        final SubLObject var128 = module0139.$g1636$.currentBinding(var125);
        try {
            module0137.$g1605$.bind(module0137.f8955(module0259.$ic122$), var125);
            module0139.$g1636$.bind(module0139.f9007(), var125);
            SubLObject var141_341 = var124;
            final SubLObject var129 = (SubLObject)module0259.$ic115$;
            final SubLObject var130 = module0056.f4145(var129);
            final SubLObject var6_342 = module0139.$g1635$.currentBinding(var125);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var125);
                final SubLObject var131 = var2;
                final SubLObject var6_343 = module0147.$g2095$.currentBinding(var125);
                final SubLObject var7_344 = module0147.$g2094$.currentBinding(var125);
                final SubLObject var132 = module0147.$g2096$.currentBinding(var125);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var131), var125);
                    module0147.$g2094$.bind(module0147.f9546(var131), var125);
                    module0147.$g2096$.bind(module0147.f9549(var131), var125);
                    final SubLObject var133 = var3;
                    final SubLObject var6_344 = module0141.$g1714$.currentBinding(var125);
                    final SubLObject var7_345 = module0141.$g1715$.currentBinding(var125);
                    try {
                        module0141.$g1714$.bind((module0259.NIL != var133) ? var133 : module0141.f9283(), var125);
                        module0141.$g1715$.bind((SubLObject)((module0259.NIL != var133) ? module0259.$ic30$ : module0141.$g1715$.getDynamicValue(var125)), var125);
                        if (module0259.NIL != var133 && module0259.NIL != module0136.f8864() && module0259.NIL == module0141.f9279(var133)) {
                            final SubLObject var134 = module0136.$g1591$.getDynamicValue(var125);
                            if (var134.eql((SubLObject)module0259.$ic31$)) {
                                module0136.f8870((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic32$, var133, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                            }
                            else if (var134.eql((SubLObject)module0259.$ic34$)) {
                                module0136.f8871((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var133, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                            }
                            else if (var134.eql((SubLObject)module0259.$ic36$)) {
                                Errors.warn((SubLObject)module0259.$ic32$, var133, (SubLObject)module0259.$ic33$);
                            }
                            else {
                                Errors.warn((SubLObject)module0259.$ic37$, module0136.$g1591$.getDynamicValue(var125));
                                Errors.cerror((SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var133, (SubLObject)module0259.$ic33$);
                            }
                        }
                        final SubLObject var6_345 = module0141.$g1670$.currentBinding(var125);
                        final SubLObject var7_346 = module0141.$g1671$.currentBinding(var125);
                        final SubLObject var22_349 = module0141.$g1672$.currentBinding(var125);
                        final SubLObject var135 = module0141.$g1674$.currentBinding(var125);
                        final SubLObject var136 = module0137.$g1605$.currentBinding(var125);
                        try {
                            module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0259.$ic122$)), var125);
                            module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0259.$ic122$))), var125);
                            module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0259.$ic122$))), var125);
                            module0141.$g1674$.bind((SubLObject)module0259.NIL, var125);
                            module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0259.$ic122$)), var125);
                            if (module0259.NIL != module0136.f8865() || module0259.NIL != module0244.f15795(var124, module0137.f8955((SubLObject)module0259.UNPROVIDED))) {
                                final SubLObject var6_346 = module0141.$g1677$.currentBinding(var125);
                                final SubLObject var7_347 = module0138.$g1619$.currentBinding(var125);
                                final SubLObject var22_350 = module0141.$g1674$.currentBinding(var125);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var125);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0259.$ic122$))), var125);
                                    module0141.$g1674$.bind((SubLObject)module0259.NIL, var125);
                                    module0249.f16055(var141_341, (SubLObject)module0259.UNPROVIDED);
                                    while (module0259.NIL != var141_341) {
                                        final SubLObject var137 = var141_341;
                                        SubLObject var139;
                                        final SubLObject var138 = var139 = module0200.f12443(module0137.f8955(module0259.$ic122$));
                                        SubLObject var140 = (SubLObject)module0259.NIL;
                                        var140 = var139.first();
                                        while (module0259.NIL != var139) {
                                            final SubLObject var6_347 = module0137.$g1605$.currentBinding(var125);
                                            final SubLObject var7_348 = module0141.$g1674$.currentBinding(var125);
                                            try {
                                                module0137.$g1605$.bind(var140, var125);
                                                module0141.$g1674$.bind((SubLObject)((module0259.NIL != module0141.f9205((SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0259.NIL == module0141.$g1674$.getDynamicValue(var125)) : module0141.$g1674$.getDynamicValue(var125)), var125);
                                                final SubLObject var141 = module0228.f15229(var137);
                                                if (module0259.NIL != module0138.f8992(var141)) {
                                                    final SubLObject var142 = module0242.f15664(var141, module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                    if (module0259.NIL != var142) {
                                                        final SubLObject var143 = module0245.f15834(var142, module0244.f15780(module0137.f8955(module0259.$ic122$)), module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                        if (module0259.NIL != var143) {
                                                            SubLObject var144;
                                                            for (var144 = module0066.f4838(module0067.f4891(var143)); module0259.NIL == module0066.f4841(var144); var144 = module0066.f4840(var144)) {
                                                                var125.resetMultipleValues();
                                                                final SubLObject var55_355 = module0066.f4839(var144);
                                                                final SubLObject var145 = var125.secondMultipleValue();
                                                                var125.resetMultipleValues();
                                                                if (module0259.NIL != module0147.f9507(var55_355)) {
                                                                    final SubLObject var6_348 = module0138.$g1623$.currentBinding(var125);
                                                                    try {
                                                                        module0138.$g1623$.bind(var55_355, var125);
                                                                        SubLObject var54_357;
                                                                        for (var54_357 = module0066.f4838(module0067.f4891(var145)); module0259.NIL == module0066.f4841(var54_357); var54_357 = module0066.f4840(var54_357)) {
                                                                            var125.resetMultipleValues();
                                                                            final SubLObject var60_358 = module0066.f4839(var54_357);
                                                                            final SubLObject var146 = var125.secondMultipleValue();
                                                                            var125.resetMultipleValues();
                                                                            if (module0259.NIL != module0141.f9289(var60_358)) {
                                                                                final SubLObject var6_349 = module0138.$g1624$.currentBinding(var125);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var60_358, var125);
                                                                                    final SubLObject var147 = var146;
                                                                                    if (module0259.NIL != module0077.f5302(var147)) {
                                                                                        final SubLObject var148 = module0077.f5333(var147);
                                                                                        SubLObject var149;
                                                                                        SubLObject var150;
                                                                                        SubLObject var151;
                                                                                        for (var149 = module0032.f1741(var148), var150 = (SubLObject)module0259.NIL, var150 = module0032.f1742(var149, var148); module0259.NIL == module0032.f1744(var149, var150); var150 = module0032.f1743(var150)) {
                                                                                            var151 = module0032.f1745(var149, var150);
                                                                                            if (module0259.NIL != module0032.f1746(var150, var151) && module0259.NIL == module0249.f16059(var151, module0139.$g1636$.getDynamicValue(var125))) {
                                                                                                module0249.f16055(var151, module0139.$g1636$.getDynamicValue(var125));
                                                                                                var126 = Numbers.add(var126, (SubLObject)module0259.ONE_INTEGER);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var147.isList()) {
                                                                                        SubLObject var152 = var147;
                                                                                        SubLObject var153 = (SubLObject)module0259.NIL;
                                                                                        var153 = var152.first();
                                                                                        while (module0259.NIL != var152) {
                                                                                            if (module0259.NIL == module0249.f16059(var153, module0139.$g1636$.getDynamicValue(var125))) {
                                                                                                module0249.f16055(var153, module0139.$g1636$.getDynamicValue(var125));
                                                                                                var126 = Numbers.add(var126, (SubLObject)module0259.ONE_INTEGER);
                                                                                            }
                                                                                            var152 = var152.rest();
                                                                                            var153 = var152.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0259.$ic39$, var147);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_349, var125);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var54_357);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_348, var125);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var144);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0259.FIVE_INTEGER, (SubLObject)module0259.$ic40$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                                    }
                                                    if (module0259.NIL != module0200.f12419(var141, module0137.f8955((SubLObject)module0259.UNPROVIDED))) {
                                                        SubLObject var154 = module0248.f15995(var141);
                                                        SubLObject var155 = (SubLObject)module0259.NIL;
                                                        var155 = var154.first();
                                                        while (module0259.NIL != var154) {
                                                            SubLObject var157;
                                                            final SubLObject var156 = var157 = var155;
                                                            SubLObject var158 = (SubLObject)module0259.NIL;
                                                            SubLObject var171_362 = (SubLObject)module0259.NIL;
                                                            SubLObject var173_363 = (SubLObject)module0259.NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var157, var156, (SubLObject)module0259.$ic116$);
                                                            var158 = var157.first();
                                                            var157 = var157.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var157, var156, (SubLObject)module0259.$ic116$);
                                                            var171_362 = var157.first();
                                                            var157 = var157.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var157, var156, (SubLObject)module0259.$ic116$);
                                                            var173_363 = var157.first();
                                                            var157 = var157.rest();
                                                            if (module0259.NIL == var157) {
                                                                if (module0259.NIL != module0147.f9507(var171_362)) {
                                                                    final SubLObject var6_350 = module0138.$g1623$.currentBinding(var125);
                                                                    try {
                                                                        module0138.$g1623$.bind(var171_362, var125);
                                                                        if (module0259.NIL != module0141.f9289(var173_363)) {
                                                                            final SubLObject var6_351 = module0138.$g1624$.currentBinding(var125);
                                                                            try {
                                                                                module0138.$g1624$.bind(var173_363, var125);
                                                                                final SubLObject var147;
                                                                                final SubLObject var159 = var147 = (SubLObject)ConsesLow.list(var158);
                                                                                if (module0259.NIL != module0077.f5302(var147)) {
                                                                                    final SubLObject var148 = module0077.f5333(var147);
                                                                                    SubLObject var149;
                                                                                    SubLObject var150;
                                                                                    SubLObject var151;
                                                                                    for (var149 = module0032.f1741(var148), var150 = (SubLObject)module0259.NIL, var150 = module0032.f1742(var149, var148); module0259.NIL == module0032.f1744(var149, var150); var150 = module0032.f1743(var150)) {
                                                                                        var151 = module0032.f1745(var149, var150);
                                                                                        if (module0259.NIL != module0032.f1746(var150, var151) && module0259.NIL == module0249.f16059(var151, module0139.$g1636$.getDynamicValue(var125))) {
                                                                                            module0249.f16055(var151, module0139.$g1636$.getDynamicValue(var125));
                                                                                            var126 = Numbers.add(var126, (SubLObject)module0259.ONE_INTEGER);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var147.isList()) {
                                                                                    SubLObject var68_366 = var147;
                                                                                    SubLObject var153 = (SubLObject)module0259.NIL;
                                                                                    var153 = var68_366.first();
                                                                                    while (module0259.NIL != var68_366) {
                                                                                        if (module0259.NIL == module0249.f16059(var153, module0139.$g1636$.getDynamicValue(var125))) {
                                                                                            module0249.f16055(var153, module0139.$g1636$.getDynamicValue(var125));
                                                                                            var126 = Numbers.add(var126, (SubLObject)module0259.ONE_INTEGER);
                                                                                        }
                                                                                        var68_366 = var68_366.rest();
                                                                                        var153 = var68_366.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0259.$ic39$, var147);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var6_351, var125);
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_350, var125);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var156, (SubLObject)module0259.$ic116$);
                                                            }
                                                            var154 = var154.rest();
                                                            var155 = var154.first();
                                                        }
                                                    }
                                                }
                                                else if (module0259.NIL != module0155.f9785(var141, (SubLObject)module0259.UNPROVIDED)) {
                                                    SubLObject var12_367;
                                                    final SubLObject var160 = var12_367 = ((module0259.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0259.$ic122$)), module0141.$g1714$.getDynamicValue(var125), module0137.f8955((SubLObject)module0259.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0259.$ic122$)), module0141.$g1714$.getDynamicValue(var125), module0137.f8955((SubLObject)module0259.UNPROVIDED)));
                                                    SubLObject var161 = (SubLObject)module0259.NIL;
                                                    var161 = var12_367.first();
                                                    while (module0259.NIL != var12_367) {
                                                        final SubLObject var6_352 = module0138.$g1625$.currentBinding(var125);
                                                        try {
                                                            module0138.$g1625$.bind(var161, var125);
                                                            final SubLObject var163;
                                                            final SubLObject var162 = var163 = Functions.funcall(var161, var141);
                                                            if (module0259.NIL != module0077.f5302(var163)) {
                                                                final SubLObject var164 = module0077.f5333(var163);
                                                                SubLObject var165;
                                                                SubLObject var166;
                                                                SubLObject var167;
                                                                for (var165 = module0032.f1741(var164), var166 = (SubLObject)module0259.NIL, var166 = module0032.f1742(var165, var164); module0259.NIL == module0032.f1744(var165, var166); var166 = module0032.f1743(var166)) {
                                                                    var167 = module0032.f1745(var165, var166);
                                                                    if (module0259.NIL != module0032.f1746(var166, var167) && module0259.NIL == module0249.f16059(var167, module0139.$g1636$.getDynamicValue(var125))) {
                                                                        module0249.f16055(var167, module0139.$g1636$.getDynamicValue(var125));
                                                                        var126 = Numbers.add(var126, (SubLObject)module0259.ONE_INTEGER);
                                                                    }
                                                                }
                                                            }
                                                            else if (var163.isList()) {
                                                                SubLObject var168 = var163;
                                                                SubLObject var169 = (SubLObject)module0259.NIL;
                                                                var169 = var168.first();
                                                                while (module0259.NIL != var168) {
                                                                    if (module0259.NIL == module0249.f16059(var169, module0139.$g1636$.getDynamicValue(var125))) {
                                                                        module0249.f16055(var169, module0139.$g1636$.getDynamicValue(var125));
                                                                        var126 = Numbers.add(var126, (SubLObject)module0259.ONE_INTEGER);
                                                                    }
                                                                    var168 = var168.rest();
                                                                    var169 = var168.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0259.$ic39$, var163);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var6_352, var125);
                                                        }
                                                        var12_367 = var12_367.rest();
                                                        var161 = var12_367.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var7_348, var125);
                                                module0137.$g1605$.rebind(var6_347, var125);
                                            }
                                            var139 = var139.rest();
                                            var140 = var139.first();
                                        }
                                        SubLObject var171;
                                        final SubLObject var170 = var171 = module0200.f12443(module0244.f15771(module0137.f8955(module0259.$ic122$)));
                                        SubLObject var172 = (SubLObject)module0259.NIL;
                                        var172 = var171.first();
                                        while (module0259.NIL != var171) {
                                            final SubLObject var6_353 = module0137.$g1605$.currentBinding(var125);
                                            final SubLObject var7_349 = module0141.$g1674$.currentBinding(var125);
                                            try {
                                                module0137.$g1605$.bind(var172, var125);
                                                module0141.$g1674$.bind((SubLObject)((module0259.NIL != module0141.f9205((SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0259.NIL == module0141.$g1674$.getDynamicValue(var125)) : module0141.$g1674$.getDynamicValue(var125)), var125);
                                                final SubLObject var173 = module0228.f15229(var141_341);
                                                if (module0259.NIL != module0138.f8992(var173)) {
                                                    final SubLObject var174 = module0242.f15664(var173, module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                    if (module0259.NIL != var174) {
                                                        final SubLObject var175 = module0245.f15834(var174, module0138.f8979(), module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                        if (module0259.NIL != var175) {
                                                            SubLObject var176;
                                                            for (var176 = module0066.f4838(module0067.f4891(var175)); module0259.NIL == module0066.f4841(var176); var176 = module0066.f4840(var176)) {
                                                                var125.resetMultipleValues();
                                                                final SubLObject var55_356 = module0066.f4839(var176);
                                                                final SubLObject var177 = var125.secondMultipleValue();
                                                                var125.resetMultipleValues();
                                                                if (module0259.NIL != module0147.f9507(var55_356)) {
                                                                    final SubLObject var6_354 = module0138.$g1623$.currentBinding(var125);
                                                                    try {
                                                                        module0138.$g1623$.bind(var55_356, var125);
                                                                        SubLObject var54_358;
                                                                        for (var54_358 = module0066.f4838(module0067.f4891(var177)); module0259.NIL == module0066.f4841(var54_358); var54_358 = module0066.f4840(var54_358)) {
                                                                            var125.resetMultipleValues();
                                                                            final SubLObject var60_359 = module0066.f4839(var54_358);
                                                                            final SubLObject var178 = var125.secondMultipleValue();
                                                                            var125.resetMultipleValues();
                                                                            if (module0259.NIL != module0141.f9289(var60_359)) {
                                                                                final SubLObject var6_355 = module0138.$g1624$.currentBinding(var125);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var60_359, var125);
                                                                                    final SubLObject var179 = var178;
                                                                                    if (module0259.NIL != module0077.f5302(var179)) {
                                                                                        final SubLObject var180 = module0077.f5333(var179);
                                                                                        SubLObject var181;
                                                                                        SubLObject var182;
                                                                                        SubLObject var183;
                                                                                        for (var181 = module0032.f1741(var180), var182 = (SubLObject)module0259.NIL, var182 = module0032.f1742(var181, var180); module0259.NIL == module0032.f1744(var181, var182); var182 = module0032.f1743(var182)) {
                                                                                            var183 = module0032.f1745(var181, var182);
                                                                                            if (module0259.NIL != module0032.f1746(var182, var183) && module0259.NIL == module0249.f16059(var183, (SubLObject)module0259.UNPROVIDED)) {
                                                                                                module0249.f16055(var183, (SubLObject)module0259.UNPROVIDED);
                                                                                                module0056.f4149(var183, var130);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var179.isList()) {
                                                                                        SubLObject var184 = var179;
                                                                                        SubLObject var185 = (SubLObject)module0259.NIL;
                                                                                        var185 = var184.first();
                                                                                        while (module0259.NIL != var184) {
                                                                                            if (module0259.NIL == module0249.f16059(var185, (SubLObject)module0259.UNPROVIDED)) {
                                                                                                module0249.f16055(var185, (SubLObject)module0259.UNPROVIDED);
                                                                                                module0056.f4149(var185, var130);
                                                                                            }
                                                                                            var184 = var184.rest();
                                                                                            var185 = var184.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0259.$ic39$, var179);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_355, var125);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var54_358);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_354, var125);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var176);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0259.FIVE_INTEGER, (SubLObject)module0259.$ic40$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0259.NIL != module0155.f9785(var173, (SubLObject)module0259.UNPROVIDED)) {
                                                    SubLObject var12_368;
                                                    final SubLObject var186 = var12_368 = ((module0259.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var125), module0137.f8955((SubLObject)module0259.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var125), module0137.f8955((SubLObject)module0259.UNPROVIDED)));
                                                    SubLObject var187 = (SubLObject)module0259.NIL;
                                                    var187 = var12_368.first();
                                                    while (module0259.NIL != var12_368) {
                                                        final SubLObject var6_356 = module0138.$g1625$.currentBinding(var125);
                                                        try {
                                                            module0138.$g1625$.bind(var187, var125);
                                                            final SubLObject var189;
                                                            final SubLObject var188 = var189 = Functions.funcall(var187, var173);
                                                            if (module0259.NIL != module0077.f5302(var189)) {
                                                                final SubLObject var190 = module0077.f5333(var189);
                                                                SubLObject var191;
                                                                SubLObject var192;
                                                                SubLObject var193;
                                                                for (var191 = module0032.f1741(var190), var192 = (SubLObject)module0259.NIL, var192 = module0032.f1742(var191, var190); module0259.NIL == module0032.f1744(var191, var192); var192 = module0032.f1743(var192)) {
                                                                    var193 = module0032.f1745(var191, var192);
                                                                    if (module0259.NIL != module0032.f1746(var192, var193) && module0259.NIL == module0249.f16059(var193, (SubLObject)module0259.UNPROVIDED)) {
                                                                        module0249.f16055(var193, (SubLObject)module0259.UNPROVIDED);
                                                                        module0056.f4149(var193, var130);
                                                                    }
                                                                }
                                                            }
                                                            else if (var189.isList()) {
                                                                SubLObject var194 = var189;
                                                                SubLObject var195 = (SubLObject)module0259.NIL;
                                                                var195 = var194.first();
                                                                while (module0259.NIL != var194) {
                                                                    if (module0259.NIL == module0249.f16059(var195, (SubLObject)module0259.UNPROVIDED)) {
                                                                        module0249.f16055(var195, (SubLObject)module0259.UNPROVIDED);
                                                                        module0056.f4149(var195, var130);
                                                                    }
                                                                    var194 = var194.rest();
                                                                    var195 = var194.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0259.$ic39$, var189);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var6_356, var125);
                                                        }
                                                        var12_368 = var12_368.rest();
                                                        var187 = var12_368.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var7_349, var125);
                                                module0137.$g1605$.rebind(var6_353, var125);
                                            }
                                            var171 = var171.rest();
                                            var172 = var171.first();
                                        }
                                        var141_341 = module0056.f4150(var130);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var22_350, var125);
                                    module0138.$g1619$.rebind(var7_347, var125);
                                    module0141.$g1677$.rebind(var6_346, var125);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0259.TWO_INTEGER, (SubLObject)module0259.$ic117$, var124, module0244.f15748(module0137.f8955((SubLObject)module0259.UNPROVIDED)), (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var136, var125);
                            module0141.$g1674$.rebind(var135, var125);
                            module0141.$g1672$.rebind(var22_349, var125);
                            module0141.$g1671$.rebind(var7_346, var125);
                            module0141.$g1670$.rebind(var6_345, var125);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var7_345, var125);
                        module0141.$g1714$.rebind(var6_344, var125);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var132, var125);
                    module0147.$g2094$.rebind(var7_344, var125);
                    module0147.$g2095$.rebind(var6_343, var125);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var125));
            }
            finally {
                module0139.$g1635$.rebind(var6_342, var125);
            }
            module0139.f9011(module0139.$g1636$.getDynamicValue(var125));
        }
        finally {
            module0139.$g1636$.rebind(var128, var125);
            module0137.$g1605$.rebind(var127, var125);
        }
        return var126;
    }
    
    public static SubLObject f16884(final SubLObject var124, final SubLObject var133, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLThread var134 = SubLProcess.currentSubLThread();
        SubLObject var135 = (SubLObject)module0259.ZERO_INTEGER;
        final SubLObject var136 = module0137.$g1605$.currentBinding(var134);
        final SubLObject var137 = module0139.$g1636$.currentBinding(var134);
        try {
            module0137.$g1605$.bind(module0137.f8955(module0259.$ic122$), var134);
            module0139.$g1636$.bind(module0139.f9007(), var134);
            SubLObject var141_378 = var124;
            final SubLObject var138 = (SubLObject)module0259.$ic115$;
            final SubLObject var139 = module0056.f4145(var138);
            final SubLObject var6_379 = module0139.$g1635$.currentBinding(var134);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var134);
                final SubLObject var140 = var2;
                final SubLObject var6_380 = module0147.$g2095$.currentBinding(var134);
                final SubLObject var7_381 = module0147.$g2094$.currentBinding(var134);
                final SubLObject var141 = module0147.$g2096$.currentBinding(var134);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var140), var134);
                    module0147.$g2094$.bind(module0147.f9546(var140), var134);
                    module0147.$g2096$.bind(module0147.f9549(var140), var134);
                    final SubLObject var142 = var3;
                    final SubLObject var6_381 = module0141.$g1714$.currentBinding(var134);
                    final SubLObject var7_382 = module0141.$g1715$.currentBinding(var134);
                    try {
                        module0141.$g1714$.bind((module0259.NIL != var142) ? var142 : module0141.f9283(), var134);
                        module0141.$g1715$.bind((SubLObject)((module0259.NIL != var142) ? module0259.$ic30$ : module0141.$g1715$.getDynamicValue(var134)), var134);
                        if (module0259.NIL != var142 && module0259.NIL != module0136.f8864() && module0259.NIL == module0141.f9279(var142)) {
                            final SubLObject var143 = module0136.$g1591$.getDynamicValue(var134);
                            if (var143.eql((SubLObject)module0259.$ic31$)) {
                                module0136.f8870((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic32$, var142, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                            }
                            else if (var143.eql((SubLObject)module0259.$ic34$)) {
                                module0136.f8871((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var142, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                            }
                            else if (var143.eql((SubLObject)module0259.$ic36$)) {
                                Errors.warn((SubLObject)module0259.$ic32$, var142, (SubLObject)module0259.$ic33$);
                            }
                            else {
                                Errors.warn((SubLObject)module0259.$ic37$, module0136.$g1591$.getDynamicValue(var134));
                                Errors.cerror((SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var142, (SubLObject)module0259.$ic33$);
                            }
                        }
                        final SubLObject var6_382 = module0141.$g1670$.currentBinding(var134);
                        final SubLObject var7_383 = module0141.$g1671$.currentBinding(var134);
                        final SubLObject var22_386 = module0141.$g1672$.currentBinding(var134);
                        final SubLObject var144 = module0141.$g1674$.currentBinding(var134);
                        final SubLObject var145 = module0137.$g1605$.currentBinding(var134);
                        try {
                            module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0259.$ic122$)), var134);
                            module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0259.$ic122$))), var134);
                            module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0259.$ic122$))), var134);
                            module0141.$g1674$.bind((SubLObject)module0259.NIL, var134);
                            module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0259.$ic122$)), var134);
                            if (module0259.NIL != module0136.f8865() || module0259.NIL != module0244.f15795(var124, module0137.f8955((SubLObject)module0259.UNPROVIDED))) {
                                final SubLObject var6_383 = module0141.$g1677$.currentBinding(var134);
                                final SubLObject var7_384 = module0138.$g1619$.currentBinding(var134);
                                final SubLObject var22_387 = module0141.$g1674$.currentBinding(var134);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var134);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0259.$ic122$))), var134);
                                    module0141.$g1674$.bind((SubLObject)module0259.NIL, var134);
                                    module0249.f16055(var141_378, (SubLObject)module0259.UNPROVIDED);
                                    while (module0259.NIL != var141_378) {
                                        final SubLObject var146 = var141_378;
                                        SubLObject var148;
                                        final SubLObject var147 = var148 = module0200.f12443(module0137.f8955(module0259.$ic122$));
                                        SubLObject var149 = (SubLObject)module0259.NIL;
                                        var149 = var148.first();
                                        while (module0259.NIL != var148) {
                                            final SubLObject var6_384 = module0137.$g1605$.currentBinding(var134);
                                            final SubLObject var7_385 = module0141.$g1674$.currentBinding(var134);
                                            try {
                                                module0137.$g1605$.bind(var149, var134);
                                                module0141.$g1674$.bind((SubLObject)((module0259.NIL != module0141.f9205((SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0259.NIL == module0141.$g1674$.getDynamicValue(var134)) : module0141.$g1674$.getDynamicValue(var134)), var134);
                                                final SubLObject var150 = module0228.f15229(var146);
                                                if (module0259.NIL != module0138.f8992(var150)) {
                                                    final SubLObject var151 = module0242.f15664(var150, module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                    if (module0259.NIL != var151) {
                                                        final SubLObject var152 = module0245.f15834(var151, module0244.f15780(module0137.f8955(module0259.$ic122$)), module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                        if (module0259.NIL != var152) {
                                                            SubLObject var153;
                                                            for (var153 = module0066.f4838(module0067.f4891(var152)); module0259.NIL == module0066.f4841(var153); var153 = module0066.f4840(var153)) {
                                                                var134.resetMultipleValues();
                                                                final SubLObject var55_392 = module0066.f4839(var153);
                                                                final SubLObject var154 = var134.secondMultipleValue();
                                                                var134.resetMultipleValues();
                                                                if (module0259.NIL != module0147.f9507(var55_392)) {
                                                                    final SubLObject var6_385 = module0138.$g1623$.currentBinding(var134);
                                                                    try {
                                                                        module0138.$g1623$.bind(var55_392, var134);
                                                                        SubLObject var54_394;
                                                                        for (var54_394 = module0066.f4838(module0067.f4891(var154)); module0259.NIL == module0066.f4841(var54_394); var54_394 = module0066.f4840(var54_394)) {
                                                                            var134.resetMultipleValues();
                                                                            final SubLObject var60_395 = module0066.f4839(var54_394);
                                                                            final SubLObject var155 = var134.secondMultipleValue();
                                                                            var134.resetMultipleValues();
                                                                            if (module0259.NIL != module0141.f9289(var60_395)) {
                                                                                final SubLObject var6_386 = module0138.$g1624$.currentBinding(var134);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var60_395, var134);
                                                                                    final SubLObject var156 = var155;
                                                                                    if (module0259.NIL != module0077.f5302(var156)) {
                                                                                        final SubLObject var157 = module0077.f5333(var156);
                                                                                        SubLObject var158;
                                                                                        SubLObject var159;
                                                                                        SubLObject var160;
                                                                                        for (var158 = module0032.f1741(var157), var159 = (SubLObject)module0259.NIL, var159 = module0032.f1742(var158, var157); module0259.NIL == module0032.f1744(var158, var159); var159 = module0032.f1743(var159)) {
                                                                                            var160 = module0032.f1745(var158, var159);
                                                                                            if (module0259.NIL != module0032.f1746(var159, var160) && module0259.NIL == module0249.f16059(var160, module0139.$g1636$.getDynamicValue(var134))) {
                                                                                                module0249.f16055(var160, module0139.$g1636$.getDynamicValue(var134));
                                                                                                if (module0259.NIL != Functions.funcall(var133, var160)) {
                                                                                                    var135 = Numbers.add(var135, (SubLObject)module0259.ONE_INTEGER);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var156.isList()) {
                                                                                        SubLObject var161 = var156;
                                                                                        SubLObject var162 = (SubLObject)module0259.NIL;
                                                                                        var162 = var161.first();
                                                                                        while (module0259.NIL != var161) {
                                                                                            if (module0259.NIL == module0249.f16059(var162, module0139.$g1636$.getDynamicValue(var134))) {
                                                                                                module0249.f16055(var162, module0139.$g1636$.getDynamicValue(var134));
                                                                                                if (module0259.NIL != Functions.funcall(var133, var162)) {
                                                                                                    var135 = Numbers.add(var135, (SubLObject)module0259.ONE_INTEGER);
                                                                                                }
                                                                                            }
                                                                                            var161 = var161.rest();
                                                                                            var162 = var161.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0259.$ic39$, var156);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_386, var134);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var54_394);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_385, var134);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var153);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0259.FIVE_INTEGER, (SubLObject)module0259.$ic40$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                                    }
                                                    if (module0259.NIL != module0200.f12419(var150, module0137.f8955((SubLObject)module0259.UNPROVIDED))) {
                                                        SubLObject var163 = module0248.f15995(var150);
                                                        SubLObject var164 = (SubLObject)module0259.NIL;
                                                        var164 = var163.first();
                                                        while (module0259.NIL != var163) {
                                                            SubLObject var166;
                                                            final SubLObject var165 = var166 = var164;
                                                            SubLObject var167 = (SubLObject)module0259.NIL;
                                                            SubLObject var171_399 = (SubLObject)module0259.NIL;
                                                            SubLObject var173_400 = (SubLObject)module0259.NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var166, var165, (SubLObject)module0259.$ic116$);
                                                            var167 = var166.first();
                                                            var166 = var166.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var166, var165, (SubLObject)module0259.$ic116$);
                                                            var171_399 = var166.first();
                                                            var166 = var166.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var166, var165, (SubLObject)module0259.$ic116$);
                                                            var173_400 = var166.first();
                                                            var166 = var166.rest();
                                                            if (module0259.NIL == var166) {
                                                                if (module0259.NIL != module0147.f9507(var171_399)) {
                                                                    final SubLObject var6_387 = module0138.$g1623$.currentBinding(var134);
                                                                    try {
                                                                        module0138.$g1623$.bind(var171_399, var134);
                                                                        if (module0259.NIL != module0141.f9289(var173_400)) {
                                                                            final SubLObject var6_388 = module0138.$g1624$.currentBinding(var134);
                                                                            try {
                                                                                module0138.$g1624$.bind(var173_400, var134);
                                                                                final SubLObject var156;
                                                                                final SubLObject var168 = var156 = (SubLObject)ConsesLow.list(var167);
                                                                                if (module0259.NIL != module0077.f5302(var156)) {
                                                                                    final SubLObject var157 = module0077.f5333(var156);
                                                                                    SubLObject var158;
                                                                                    SubLObject var159;
                                                                                    SubLObject var160;
                                                                                    for (var158 = module0032.f1741(var157), var159 = (SubLObject)module0259.NIL, var159 = module0032.f1742(var158, var157); module0259.NIL == module0032.f1744(var158, var159); var159 = module0032.f1743(var159)) {
                                                                                        var160 = module0032.f1745(var158, var159);
                                                                                        if (module0259.NIL != module0032.f1746(var159, var160) && module0259.NIL == module0249.f16059(var160, module0139.$g1636$.getDynamicValue(var134))) {
                                                                                            module0249.f16055(var160, module0139.$g1636$.getDynamicValue(var134));
                                                                                            if (module0259.NIL != Functions.funcall(var133, var160)) {
                                                                                                var135 = Numbers.add(var135, (SubLObject)module0259.ONE_INTEGER);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var156.isList()) {
                                                                                    SubLObject var68_403 = var156;
                                                                                    SubLObject var162 = (SubLObject)module0259.NIL;
                                                                                    var162 = var68_403.first();
                                                                                    while (module0259.NIL != var68_403) {
                                                                                        if (module0259.NIL == module0249.f16059(var162, module0139.$g1636$.getDynamicValue(var134))) {
                                                                                            module0249.f16055(var162, module0139.$g1636$.getDynamicValue(var134));
                                                                                            if (module0259.NIL != Functions.funcall(var133, var162)) {
                                                                                                var135 = Numbers.add(var135, (SubLObject)module0259.ONE_INTEGER);
                                                                                            }
                                                                                        }
                                                                                        var68_403 = var68_403.rest();
                                                                                        var162 = var68_403.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0259.$ic39$, var156);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var6_388, var134);
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_387, var134);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var165, (SubLObject)module0259.$ic116$);
                                                            }
                                                            var163 = var163.rest();
                                                            var164 = var163.first();
                                                        }
                                                    }
                                                }
                                                else if (module0259.NIL != module0155.f9785(var150, (SubLObject)module0259.UNPROVIDED)) {
                                                    SubLObject var12_404;
                                                    final SubLObject var169 = var12_404 = ((module0259.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0259.$ic122$)), module0141.$g1714$.getDynamicValue(var134), module0137.f8955((SubLObject)module0259.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0259.$ic122$)), module0141.$g1714$.getDynamicValue(var134), module0137.f8955((SubLObject)module0259.UNPROVIDED)));
                                                    SubLObject var170 = (SubLObject)module0259.NIL;
                                                    var170 = var12_404.first();
                                                    while (module0259.NIL != var12_404) {
                                                        final SubLObject var6_389 = module0138.$g1625$.currentBinding(var134);
                                                        try {
                                                            module0138.$g1625$.bind(var170, var134);
                                                            final SubLObject var172;
                                                            final SubLObject var171 = var172 = Functions.funcall(var170, var150);
                                                            if (module0259.NIL != module0077.f5302(var172)) {
                                                                final SubLObject var173 = module0077.f5333(var172);
                                                                SubLObject var174;
                                                                SubLObject var175;
                                                                SubLObject var176;
                                                                for (var174 = module0032.f1741(var173), var175 = (SubLObject)module0259.NIL, var175 = module0032.f1742(var174, var173); module0259.NIL == module0032.f1744(var174, var175); var175 = module0032.f1743(var175)) {
                                                                    var176 = module0032.f1745(var174, var175);
                                                                    if (module0259.NIL != module0032.f1746(var175, var176) && module0259.NIL == module0249.f16059(var176, module0139.$g1636$.getDynamicValue(var134))) {
                                                                        module0249.f16055(var176, module0139.$g1636$.getDynamicValue(var134));
                                                                        if (module0259.NIL != Functions.funcall(var133, var176)) {
                                                                            var135 = Numbers.add(var135, (SubLObject)module0259.ONE_INTEGER);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            else if (var172.isList()) {
                                                                SubLObject var177 = var172;
                                                                SubLObject var178 = (SubLObject)module0259.NIL;
                                                                var178 = var177.first();
                                                                while (module0259.NIL != var177) {
                                                                    if (module0259.NIL == module0249.f16059(var178, module0139.$g1636$.getDynamicValue(var134))) {
                                                                        module0249.f16055(var178, module0139.$g1636$.getDynamicValue(var134));
                                                                        if (module0259.NIL != Functions.funcall(var133, var178)) {
                                                                            var135 = Numbers.add(var135, (SubLObject)module0259.ONE_INTEGER);
                                                                        }
                                                                    }
                                                                    var177 = var177.rest();
                                                                    var178 = var177.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0259.$ic39$, var172);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var6_389, var134);
                                                        }
                                                        var12_404 = var12_404.rest();
                                                        var170 = var12_404.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var7_385, var134);
                                                module0137.$g1605$.rebind(var6_384, var134);
                                            }
                                            var148 = var148.rest();
                                            var149 = var148.first();
                                        }
                                        SubLObject var180;
                                        final SubLObject var179 = var180 = module0200.f12443(module0244.f15771(module0137.f8955(module0259.$ic122$)));
                                        SubLObject var181 = (SubLObject)module0259.NIL;
                                        var181 = var180.first();
                                        while (module0259.NIL != var180) {
                                            final SubLObject var6_390 = module0137.$g1605$.currentBinding(var134);
                                            final SubLObject var7_386 = module0141.$g1674$.currentBinding(var134);
                                            try {
                                                module0137.$g1605$.bind(var181, var134);
                                                module0141.$g1674$.bind((SubLObject)((module0259.NIL != module0141.f9205((SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0259.NIL == module0141.$g1674$.getDynamicValue(var134)) : module0141.$g1674$.getDynamicValue(var134)), var134);
                                                final SubLObject var182 = module0228.f15229(var141_378);
                                                if (module0259.NIL != module0138.f8992(var182)) {
                                                    final SubLObject var183 = module0242.f15664(var182, module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                    if (module0259.NIL != var183) {
                                                        final SubLObject var184 = module0245.f15834(var183, module0138.f8979(), module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                        if (module0259.NIL != var184) {
                                                            SubLObject var185;
                                                            for (var185 = module0066.f4838(module0067.f4891(var184)); module0259.NIL == module0066.f4841(var185); var185 = module0066.f4840(var185)) {
                                                                var134.resetMultipleValues();
                                                                final SubLObject var55_393 = module0066.f4839(var185);
                                                                final SubLObject var186 = var134.secondMultipleValue();
                                                                var134.resetMultipleValues();
                                                                if (module0259.NIL != module0147.f9507(var55_393)) {
                                                                    final SubLObject var6_391 = module0138.$g1623$.currentBinding(var134);
                                                                    try {
                                                                        module0138.$g1623$.bind(var55_393, var134);
                                                                        SubLObject var54_395;
                                                                        for (var54_395 = module0066.f4838(module0067.f4891(var186)); module0259.NIL == module0066.f4841(var54_395); var54_395 = module0066.f4840(var54_395)) {
                                                                            var134.resetMultipleValues();
                                                                            final SubLObject var60_396 = module0066.f4839(var54_395);
                                                                            final SubLObject var187 = var134.secondMultipleValue();
                                                                            var134.resetMultipleValues();
                                                                            if (module0259.NIL != module0141.f9289(var60_396)) {
                                                                                final SubLObject var6_392 = module0138.$g1624$.currentBinding(var134);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var60_396, var134);
                                                                                    final SubLObject var188 = var187;
                                                                                    if (module0259.NIL != module0077.f5302(var188)) {
                                                                                        final SubLObject var189 = module0077.f5333(var188);
                                                                                        SubLObject var190;
                                                                                        SubLObject var191;
                                                                                        SubLObject var192;
                                                                                        for (var190 = module0032.f1741(var189), var191 = (SubLObject)module0259.NIL, var191 = module0032.f1742(var190, var189); module0259.NIL == module0032.f1744(var190, var191); var191 = module0032.f1743(var191)) {
                                                                                            var192 = module0032.f1745(var190, var191);
                                                                                            if (module0259.NIL != module0032.f1746(var191, var192) && module0259.NIL == module0249.f16059(var192, (SubLObject)module0259.UNPROVIDED)) {
                                                                                                module0249.f16055(var192, (SubLObject)module0259.UNPROVIDED);
                                                                                                module0056.f4149(var192, var139);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var188.isList()) {
                                                                                        SubLObject var193 = var188;
                                                                                        SubLObject var194 = (SubLObject)module0259.NIL;
                                                                                        var194 = var193.first();
                                                                                        while (module0259.NIL != var193) {
                                                                                            if (module0259.NIL == module0249.f16059(var194, (SubLObject)module0259.UNPROVIDED)) {
                                                                                                module0249.f16055(var194, (SubLObject)module0259.UNPROVIDED);
                                                                                                module0056.f4149(var194, var139);
                                                                                            }
                                                                                            var193 = var193.rest();
                                                                                            var194 = var193.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0259.$ic39$, var188);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_392, var134);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var54_395);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_391, var134);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var185);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0259.FIVE_INTEGER, (SubLObject)module0259.$ic40$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0259.NIL != module0155.f9785(var182, (SubLObject)module0259.UNPROVIDED)) {
                                                    SubLObject var12_405;
                                                    final SubLObject var195 = var12_405 = ((module0259.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var134), module0137.f8955((SubLObject)module0259.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var134), module0137.f8955((SubLObject)module0259.UNPROVIDED)));
                                                    SubLObject var196 = (SubLObject)module0259.NIL;
                                                    var196 = var12_405.first();
                                                    while (module0259.NIL != var12_405) {
                                                        final SubLObject var6_393 = module0138.$g1625$.currentBinding(var134);
                                                        try {
                                                            module0138.$g1625$.bind(var196, var134);
                                                            final SubLObject var198;
                                                            final SubLObject var197 = var198 = Functions.funcall(var196, var182);
                                                            if (module0259.NIL != module0077.f5302(var198)) {
                                                                final SubLObject var199 = module0077.f5333(var198);
                                                                SubLObject var200;
                                                                SubLObject var201;
                                                                SubLObject var202;
                                                                for (var200 = module0032.f1741(var199), var201 = (SubLObject)module0259.NIL, var201 = module0032.f1742(var200, var199); module0259.NIL == module0032.f1744(var200, var201); var201 = module0032.f1743(var201)) {
                                                                    var202 = module0032.f1745(var200, var201);
                                                                    if (module0259.NIL != module0032.f1746(var201, var202) && module0259.NIL == module0249.f16059(var202, (SubLObject)module0259.UNPROVIDED)) {
                                                                        module0249.f16055(var202, (SubLObject)module0259.UNPROVIDED);
                                                                        module0056.f4149(var202, var139);
                                                                    }
                                                                }
                                                            }
                                                            else if (var198.isList()) {
                                                                SubLObject var203 = var198;
                                                                SubLObject var204 = (SubLObject)module0259.NIL;
                                                                var204 = var203.first();
                                                                while (module0259.NIL != var203) {
                                                                    if (module0259.NIL == module0249.f16059(var204, (SubLObject)module0259.UNPROVIDED)) {
                                                                        module0249.f16055(var204, (SubLObject)module0259.UNPROVIDED);
                                                                        module0056.f4149(var204, var139);
                                                                    }
                                                                    var203 = var203.rest();
                                                                    var204 = var203.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0259.$ic39$, var198);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var6_393, var134);
                                                        }
                                                        var12_405 = var12_405.rest();
                                                        var196 = var12_405.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var7_386, var134);
                                                module0137.$g1605$.rebind(var6_390, var134);
                                            }
                                            var180 = var180.rest();
                                            var181 = var180.first();
                                        }
                                        var141_378 = module0056.f4150(var139);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var22_387, var134);
                                    module0138.$g1619$.rebind(var7_384, var134);
                                    module0141.$g1677$.rebind(var6_383, var134);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0259.TWO_INTEGER, (SubLObject)module0259.$ic117$, var124, module0244.f15748(module0137.f8955((SubLObject)module0259.UNPROVIDED)), (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var145, var134);
                            module0141.$g1674$.rebind(var144, var134);
                            module0141.$g1672$.rebind(var22_386, var134);
                            module0141.$g1671$.rebind(var7_383, var134);
                            module0141.$g1670$.rebind(var6_382, var134);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var7_382, var134);
                        module0141.$g1714$.rebind(var6_381, var134);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var141, var134);
                    module0147.$g2094$.rebind(var7_381, var134);
                    module0147.$g2095$.rebind(var6_380, var134);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var134));
            }
            finally {
                module0139.$g1635$.rebind(var6_379, var134);
            }
            module0139.f9011(module0139.$g1636$.getDynamicValue(var134));
        }
        finally {
            module0139.$g1636$.rebind(var137, var134);
            module0137.$g1605$.rebind(var136, var134);
        }
        return var135;
    }
    
    public static SubLObject f16885(final SubLObject var124, final SubLObject var227, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLThread var228 = SubLProcess.currentSubLThread();
        SubLObject var229 = (SubLObject)module0259.ZERO_INTEGER;
        SubLObject var230 = (SubLObject)module0259.NIL;
        final SubLObject var231 = module0137.$g1605$.currentBinding(var228);
        final SubLObject var232 = module0139.$g1636$.currentBinding(var228);
        try {
            module0137.$g1605$.bind(module0137.f8955(module0259.$ic122$), var228);
            module0139.$g1636$.bind(module0139.f9007(), var228);
            if (module0259.NIL == var230) {
                SubLObject var141_415 = var124;
                final SubLObject var233 = (SubLObject)module0259.$ic115$;
                final SubLObject var234 = module0056.f4145(var233);
                final SubLObject var6_416 = module0139.$g1635$.currentBinding(var228);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var228);
                    final SubLObject var235 = var2;
                    final SubLObject var6_417 = module0147.$g2095$.currentBinding(var228);
                    final SubLObject var7_418 = module0147.$g2094$.currentBinding(var228);
                    final SubLObject var236 = module0147.$g2096$.currentBinding(var228);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var235), var228);
                        module0147.$g2094$.bind(module0147.f9546(var235), var228);
                        module0147.$g2096$.bind(module0147.f9549(var235), var228);
                        final SubLObject var237 = var3;
                        final SubLObject var6_418 = module0141.$g1714$.currentBinding(var228);
                        final SubLObject var7_419 = module0141.$g1715$.currentBinding(var228);
                        try {
                            module0141.$g1714$.bind((module0259.NIL != var237) ? var237 : module0141.f9283(), var228);
                            module0141.$g1715$.bind((SubLObject)((module0259.NIL != var237) ? module0259.$ic30$ : module0141.$g1715$.getDynamicValue(var228)), var228);
                            if (module0259.NIL != var237 && module0259.NIL != module0136.f8864() && module0259.NIL == module0141.f9279(var237)) {
                                final SubLObject var238 = module0136.$g1591$.getDynamicValue(var228);
                                if (var238.eql((SubLObject)module0259.$ic31$)) {
                                    module0136.f8870((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic32$, var237, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                }
                                else if (var238.eql((SubLObject)module0259.$ic34$)) {
                                    module0136.f8871((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var237, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                }
                                else if (var238.eql((SubLObject)module0259.$ic36$)) {
                                    Errors.warn((SubLObject)module0259.$ic32$, var237, (SubLObject)module0259.$ic33$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0259.$ic37$, module0136.$g1591$.getDynamicValue(var228));
                                    Errors.cerror((SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var237, (SubLObject)module0259.$ic33$);
                                }
                            }
                            final SubLObject var6_419 = module0141.$g1670$.currentBinding(var228);
                            final SubLObject var7_420 = module0141.$g1671$.currentBinding(var228);
                            final SubLObject var22_423 = module0141.$g1672$.currentBinding(var228);
                            final SubLObject var239 = module0141.$g1674$.currentBinding(var228);
                            final SubLObject var240 = module0137.$g1605$.currentBinding(var228);
                            try {
                                module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0259.$ic122$)), var228);
                                module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0259.$ic122$))), var228);
                                module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0259.$ic122$))), var228);
                                module0141.$g1674$.bind((SubLObject)module0259.NIL, var228);
                                module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0259.$ic122$)), var228);
                                if (module0259.NIL != module0136.f8865() || module0259.NIL != module0244.f15795(var124, module0137.f8955((SubLObject)module0259.UNPROVIDED))) {
                                    final SubLObject var6_420 = module0141.$g1677$.currentBinding(var228);
                                    final SubLObject var7_421 = module0138.$g1619$.currentBinding(var228);
                                    final SubLObject var22_424 = module0141.$g1674$.currentBinding(var228);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9210(), var228);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0259.$ic122$))), var228);
                                        module0141.$g1674$.bind((SubLObject)module0259.NIL, var228);
                                        module0249.f16055(var141_415, (SubLObject)module0259.UNPROVIDED);
                                        while (module0259.NIL != var141_415 && module0259.NIL == var230) {
                                            final SubLObject var241 = var141_415;
                                            final SubLObject var242 = module0200.f12443(module0137.f8955(module0259.$ic122$));
                                            SubLObject var243;
                                            SubLObject var244;
                                            SubLObject var6_421;
                                            SubLObject var7_422;
                                            SubLObject var245;
                                            SubLObject var246;
                                            SubLObject var247;
                                            SubLObject var248;
                                            SubLObject var55_429;
                                            SubLObject var249;
                                            SubLObject var6_422;
                                            SubLObject var54_431;
                                            SubLObject var60_432;
                                            SubLObject var250;
                                            SubLObject var6_423;
                                            SubLObject var251;
                                            SubLObject var252;
                                            SubLObject var253;
                                            SubLObject var254;
                                            SubLObject var255;
                                            SubLObject var256;
                                            SubLObject var257;
                                            SubLObject var258;
                                            SubLObject var259;
                                            SubLObject var261;
                                            SubLObject var260;
                                            SubLObject var262;
                                            SubLObject var171_436;
                                            SubLObject var173_437;
                                            SubLObject var6_424;
                                            SubLObject var6_425;
                                            SubLObject var263;
                                            SubLObject var68_440;
                                            SubLObject var264;
                                            SubLObject var47_441;
                                            SubLObject var265;
                                            SubLObject var6_426;
                                            SubLObject var267;
                                            SubLObject var266;
                                            SubLObject var268;
                                            SubLObject var269;
                                            SubLObject var270;
                                            SubLObject var271;
                                            SubLObject var272;
                                            SubLObject var273;
                                            for (var243 = (SubLObject)module0259.NIL, var243 = var242; module0259.NIL == var230 && module0259.NIL != var243; var243 = var243.rest()) {
                                                var244 = var243.first();
                                                var6_421 = module0137.$g1605$.currentBinding(var228);
                                                var7_422 = module0141.$g1674$.currentBinding(var228);
                                                try {
                                                    module0137.$g1605$.bind(var244, var228);
                                                    module0141.$g1674$.bind((SubLObject)((module0259.NIL != module0141.f9205((SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0259.NIL == module0141.$g1674$.getDynamicValue(var228)) : module0141.$g1674$.getDynamicValue(var228)), var228);
                                                    var245 = module0228.f15229(var241);
                                                    if (module0259.NIL != module0138.f8992(var245)) {
                                                        var246 = module0242.f15664(var245, module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                        if (module0259.NIL != var246) {
                                                            var247 = module0245.f15834(var246, module0244.f15780(module0137.f8955(module0259.$ic122$)), module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                            if (module0259.NIL != var247) {
                                                                for (var248 = module0066.f4838(module0067.f4891(var247)); module0259.NIL == var230 && module0259.NIL == module0066.f4841(var248); var248 = module0066.f4840(var248)) {
                                                                    var228.resetMultipleValues();
                                                                    var55_429 = module0066.f4839(var248);
                                                                    var249 = var228.secondMultipleValue();
                                                                    var228.resetMultipleValues();
                                                                    if (module0259.NIL != module0147.f9507(var55_429)) {
                                                                        var6_422 = module0138.$g1623$.currentBinding(var228);
                                                                        try {
                                                                            module0138.$g1623$.bind(var55_429, var228);
                                                                            for (var54_431 = module0066.f4838(module0067.f4891(var249)); module0259.NIL == var230 && module0259.NIL == module0066.f4841(var54_431); var54_431 = module0066.f4840(var54_431)) {
                                                                                var228.resetMultipleValues();
                                                                                var60_432 = module0066.f4839(var54_431);
                                                                                var250 = var228.secondMultipleValue();
                                                                                var228.resetMultipleValues();
                                                                                if (module0259.NIL != module0141.f9289(var60_432)) {
                                                                                    var6_423 = module0138.$g1624$.currentBinding(var228);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var60_432, var228);
                                                                                        var251 = var250;
                                                                                        if (module0259.NIL != module0077.f5302(var251)) {
                                                                                            var252 = module0077.f5333(var251);
                                                                                            for (var253 = module0032.f1741(var252), var254 = (SubLObject)module0259.NIL, var254 = module0032.f1742(var253, var252); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var253, var254); var254 = module0032.f1743(var254)) {
                                                                                                var255 = module0032.f1745(var253, var254);
                                                                                                if (module0259.NIL != module0032.f1746(var254, var255) && module0259.NIL == module0249.f16059(var255, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                                    module0249.f16055(var255, module0139.$g1636$.getDynamicValue(var228));
                                                                                                    var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                                    if (var229.numG(var227)) {
                                                                                                        var230 = (SubLObject)module0259.T;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var251.isList()) {
                                                                                            if (module0259.NIL == var230) {
                                                                                                var256 = var251;
                                                                                                var257 = (SubLObject)module0259.NIL;
                                                                                                var257 = var256.first();
                                                                                                while (module0259.NIL == var230 && module0259.NIL != var256) {
                                                                                                    if (module0259.NIL == module0249.f16059(var257, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                                        module0249.f16055(var257, module0139.$g1636$.getDynamicValue(var228));
                                                                                                        var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                                        if (var229.numG(var227)) {
                                                                                                            var230 = (SubLObject)module0259.T;
                                                                                                        }
                                                                                                    }
                                                                                                    var256 = var256.rest();
                                                                                                    var257 = var256.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0259.$ic39$, var251);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var6_423, var228);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var54_431);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var6_422, var228);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var248);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0259.FIVE_INTEGER, (SubLObject)module0259.$ic40$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                                        }
                                                        if (module0259.NIL != module0200.f12419(var245, module0137.f8955((SubLObject)module0259.UNPROVIDED)) && module0259.NIL == var230) {
                                                            var258 = module0248.f15995(var245);
                                                            var259 = (SubLObject)module0259.NIL;
                                                            var259 = var258.first();
                                                            while (module0259.NIL == var230 && module0259.NIL != var258) {
                                                                var260 = (var261 = var259);
                                                                var262 = (SubLObject)module0259.NIL;
                                                                var171_436 = (SubLObject)module0259.NIL;
                                                                var173_437 = (SubLObject)module0259.NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(var261, var260, (SubLObject)module0259.$ic116$);
                                                                var262 = var261.first();
                                                                var261 = var261.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var261, var260, (SubLObject)module0259.$ic116$);
                                                                var171_436 = var261.first();
                                                                var261 = var261.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var261, var260, (SubLObject)module0259.$ic116$);
                                                                var173_437 = var261.first();
                                                                var261 = var261.rest();
                                                                if (module0259.NIL == var261) {
                                                                    if (module0259.NIL != module0147.f9507(var171_436)) {
                                                                        var6_424 = module0138.$g1623$.currentBinding(var228);
                                                                        try {
                                                                            module0138.$g1623$.bind(var171_436, var228);
                                                                            if (module0259.NIL != module0141.f9289(var173_437)) {
                                                                                var6_425 = module0138.$g1624$.currentBinding(var228);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var173_437, var228);
                                                                                    var263 = (var251 = (SubLObject)ConsesLow.list(var262));
                                                                                    if (module0259.NIL != module0077.f5302(var251)) {
                                                                                        var252 = module0077.f5333(var251);
                                                                                        for (var253 = module0032.f1741(var252), var254 = (SubLObject)module0259.NIL, var254 = module0032.f1742(var253, var252); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var253, var254); var254 = module0032.f1743(var254)) {
                                                                                            var255 = module0032.f1745(var253, var254);
                                                                                            if (module0259.NIL != module0032.f1746(var254, var255) && module0259.NIL == module0249.f16059(var255, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                                module0249.f16055(var255, module0139.$g1636$.getDynamicValue(var228));
                                                                                                var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                                if (var229.numG(var227)) {
                                                                                                    var230 = (SubLObject)module0259.T;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var251.isList()) {
                                                                                        if (module0259.NIL == var230) {
                                                                                            var68_440 = var251;
                                                                                            var257 = (SubLObject)module0259.NIL;
                                                                                            var257 = var68_440.first();
                                                                                            while (module0259.NIL == var230 && module0259.NIL != var68_440) {
                                                                                                if (module0259.NIL == module0249.f16059(var257, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                                    module0249.f16055(var257, module0139.$g1636$.getDynamicValue(var228));
                                                                                                    var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                                    if (var229.numG(var227)) {
                                                                                                        var230 = (SubLObject)module0259.T;
                                                                                                    }
                                                                                                }
                                                                                                var68_440 = var68_440.rest();
                                                                                                var257 = var68_440.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0259.$ic39$, var251);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_425, var228);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var6_424, var228);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(var260, (SubLObject)module0259.$ic116$);
                                                                }
                                                                var258 = var258.rest();
                                                                var259 = var258.first();
                                                            }
                                                        }
                                                    }
                                                    else if (module0259.NIL != module0155.f9785(var245, (SubLObject)module0259.UNPROVIDED)) {
                                                        var264 = ((module0259.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0259.$ic122$)), module0141.$g1714$.getDynamicValue(var228), module0137.f8955((SubLObject)module0259.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0259.$ic122$)), module0141.$g1714$.getDynamicValue(var228), module0137.f8955((SubLObject)module0259.UNPROVIDED)));
                                                        for (var47_441 = (SubLObject)module0259.NIL, var47_441 = var264; module0259.NIL == var230 && module0259.NIL != var47_441; var47_441 = var47_441.rest()) {
                                                            var265 = var47_441.first();
                                                            var6_426 = module0138.$g1625$.currentBinding(var228);
                                                            try {
                                                                module0138.$g1625$.bind(var265, var228);
                                                                var266 = (var267 = Functions.funcall(var265, var245));
                                                                if (module0259.NIL != module0077.f5302(var267)) {
                                                                    var268 = module0077.f5333(var267);
                                                                    for (var269 = module0032.f1741(var268), var270 = (SubLObject)module0259.NIL, var270 = module0032.f1742(var269, var268); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var269, var270); var270 = module0032.f1743(var270)) {
                                                                        var271 = module0032.f1745(var269, var270);
                                                                        if (module0259.NIL != module0032.f1746(var270, var271) && module0259.NIL == module0249.f16059(var271, module0139.$g1636$.getDynamicValue(var228))) {
                                                                            module0249.f16055(var271, module0139.$g1636$.getDynamicValue(var228));
                                                                            var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                            if (var229.numG(var227)) {
                                                                                var230 = (SubLObject)module0259.T;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (var267.isList()) {
                                                                    if (module0259.NIL == var230) {
                                                                        var272 = var267;
                                                                        var273 = (SubLObject)module0259.NIL;
                                                                        var273 = var272.first();
                                                                        while (module0259.NIL == var230 && module0259.NIL != var272) {
                                                                            if (module0259.NIL == module0249.f16059(var273, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                module0249.f16055(var273, module0139.$g1636$.getDynamicValue(var228));
                                                                                var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                if (var229.numG(var227)) {
                                                                                    var230 = (SubLObject)module0259.T;
                                                                                }
                                                                            }
                                                                            var272 = var272.rest();
                                                                            var273 = var272.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0259.$ic39$, var267);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var6_426, var228);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var7_422, var228);
                                                    module0137.$g1605$.rebind(var6_421, var228);
                                                }
                                            }
                                            final SubLObject var274 = module0200.f12443(module0244.f15771(module0137.f8955(module0259.$ic122$)));
                                            SubLObject var275;
                                            SubLObject var276;
                                            SubLObject var6_427;
                                            SubLObject var7_423;
                                            SubLObject var277;
                                            SubLObject var278;
                                            SubLObject var279;
                                            SubLObject var280;
                                            SubLObject var55_430;
                                            SubLObject var281;
                                            SubLObject var6_428;
                                            SubLObject var54_432;
                                            SubLObject var60_433;
                                            SubLObject var282;
                                            SubLObject var6_429;
                                            SubLObject var283;
                                            SubLObject var284;
                                            SubLObject var285;
                                            SubLObject var286;
                                            SubLObject var287;
                                            SubLObject var288;
                                            SubLObject var289;
                                            SubLObject var290;
                                            SubLObject var47_442;
                                            SubLObject var291;
                                            SubLObject var6_430;
                                            SubLObject var293;
                                            SubLObject var292;
                                            SubLObject var294;
                                            SubLObject var295;
                                            SubLObject var296;
                                            SubLObject var297;
                                            SubLObject var298;
                                            SubLObject var299;
                                            for (var275 = (SubLObject)module0259.NIL, var275 = var274; module0259.NIL == var230 && module0259.NIL != var275; var275 = var275.rest()) {
                                                var276 = var275.first();
                                                var6_427 = module0137.$g1605$.currentBinding(var228);
                                                var7_423 = module0141.$g1674$.currentBinding(var228);
                                                try {
                                                    module0137.$g1605$.bind(var276, var228);
                                                    module0141.$g1674$.bind((SubLObject)((module0259.NIL != module0141.f9205((SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0259.NIL == module0141.$g1674$.getDynamicValue(var228)) : module0141.$g1674$.getDynamicValue(var228)), var228);
                                                    var277 = module0228.f15229(var141_415);
                                                    if (module0259.NIL != module0138.f8992(var277)) {
                                                        var278 = module0242.f15664(var277, module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                        if (module0259.NIL != var278) {
                                                            var279 = module0245.f15834(var278, module0138.f8979(), module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                            if (module0259.NIL != var279) {
                                                                for (var280 = module0066.f4838(module0067.f4891(var279)); module0259.NIL == var230 && module0259.NIL == module0066.f4841(var280); var280 = module0066.f4840(var280)) {
                                                                    var228.resetMultipleValues();
                                                                    var55_430 = module0066.f4839(var280);
                                                                    var281 = var228.secondMultipleValue();
                                                                    var228.resetMultipleValues();
                                                                    if (module0259.NIL != module0147.f9507(var55_430)) {
                                                                        var6_428 = module0138.$g1623$.currentBinding(var228);
                                                                        try {
                                                                            module0138.$g1623$.bind(var55_430, var228);
                                                                            for (var54_432 = module0066.f4838(module0067.f4891(var281)); module0259.NIL == var230 && module0259.NIL == module0066.f4841(var54_432); var54_432 = module0066.f4840(var54_432)) {
                                                                                var228.resetMultipleValues();
                                                                                var60_433 = module0066.f4839(var54_432);
                                                                                var282 = var228.secondMultipleValue();
                                                                                var228.resetMultipleValues();
                                                                                if (module0259.NIL != module0141.f9289(var60_433)) {
                                                                                    var6_429 = module0138.$g1624$.currentBinding(var228);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var60_433, var228);
                                                                                        var283 = var282;
                                                                                        if (module0259.NIL != module0077.f5302(var283)) {
                                                                                            var284 = module0077.f5333(var283);
                                                                                            for (var285 = module0032.f1741(var284), var286 = (SubLObject)module0259.NIL, var286 = module0032.f1742(var285, var284); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var285, var286); var286 = module0032.f1743(var286)) {
                                                                                                var287 = module0032.f1745(var285, var286);
                                                                                                if (module0259.NIL != module0032.f1746(var286, var287) && module0259.NIL == module0249.f16059(var287, (SubLObject)module0259.UNPROVIDED)) {
                                                                                                    module0249.f16055(var287, (SubLObject)module0259.UNPROVIDED);
                                                                                                    module0056.f4149(var287, var234);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var283.isList()) {
                                                                                            if (module0259.NIL == var230) {
                                                                                                var288 = var283;
                                                                                                var289 = (SubLObject)module0259.NIL;
                                                                                                var289 = var288.first();
                                                                                                while (module0259.NIL == var230 && module0259.NIL != var288) {
                                                                                                    if (module0259.NIL == module0249.f16059(var289, (SubLObject)module0259.UNPROVIDED)) {
                                                                                                        module0249.f16055(var289, (SubLObject)module0259.UNPROVIDED);
                                                                                                        module0056.f4149(var289, var234);
                                                                                                    }
                                                                                                    var288 = var288.rest();
                                                                                                    var289 = var288.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0259.$ic39$, var283);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var6_429, var228);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var54_432);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var6_428, var228);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var280);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0259.FIVE_INTEGER, (SubLObject)module0259.$ic40$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (module0259.NIL != module0155.f9785(var277, (SubLObject)module0259.UNPROVIDED)) {
                                                        var290 = ((module0259.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var228), module0137.f8955((SubLObject)module0259.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var228), module0137.f8955((SubLObject)module0259.UNPROVIDED)));
                                                        for (var47_442 = (SubLObject)module0259.NIL, var47_442 = var290; module0259.NIL == var230 && module0259.NIL != var47_442; var47_442 = var47_442.rest()) {
                                                            var291 = var47_442.first();
                                                            var6_430 = module0138.$g1625$.currentBinding(var228);
                                                            try {
                                                                module0138.$g1625$.bind(var291, var228);
                                                                var292 = (var293 = Functions.funcall(var291, var277));
                                                                if (module0259.NIL != module0077.f5302(var293)) {
                                                                    var294 = module0077.f5333(var293);
                                                                    for (var295 = module0032.f1741(var294), var296 = (SubLObject)module0259.NIL, var296 = module0032.f1742(var295, var294); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var295, var296); var296 = module0032.f1743(var296)) {
                                                                        var297 = module0032.f1745(var295, var296);
                                                                        if (module0259.NIL != module0032.f1746(var296, var297) && module0259.NIL == module0249.f16059(var297, (SubLObject)module0259.UNPROVIDED)) {
                                                                            module0249.f16055(var297, (SubLObject)module0259.UNPROVIDED);
                                                                            module0056.f4149(var297, var234);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var293.isList()) {
                                                                    if (module0259.NIL == var230) {
                                                                        var298 = var293;
                                                                        var299 = (SubLObject)module0259.NIL;
                                                                        var299 = var298.first();
                                                                        while (module0259.NIL == var230 && module0259.NIL != var298) {
                                                                            if (module0259.NIL == module0249.f16059(var299, (SubLObject)module0259.UNPROVIDED)) {
                                                                                module0249.f16055(var299, (SubLObject)module0259.UNPROVIDED);
                                                                                module0056.f4149(var299, var234);
                                                                            }
                                                                            var298 = var298.rest();
                                                                            var299 = var298.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0259.$ic39$, var293);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var6_430, var228);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var7_423, var228);
                                                    module0137.$g1605$.rebind(var6_427, var228);
                                                }
                                            }
                                            var141_415 = module0056.f4150(var234);
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var22_424, var228);
                                        module0138.$g1619$.rebind(var7_421, var228);
                                        module0141.$g1677$.rebind(var6_420, var228);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)module0259.TWO_INTEGER, (SubLObject)module0259.$ic117$, var124, module0244.f15748(module0137.f8955((SubLObject)module0259.UNPROVIDED)), (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var240, var228);
                                module0141.$g1674$.rebind(var239, var228);
                                module0141.$g1672$.rebind(var22_423, var228);
                                module0141.$g1671$.rebind(var7_420, var228);
                                module0141.$g1670$.rebind(var6_419, var228);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var7_419, var228);
                            module0141.$g1714$.rebind(var6_418, var228);
                        }
                    }
                    finally {
                        module0147.$g2096$.rebind(var236, var228);
                        module0147.$g2094$.rebind(var7_418, var228);
                        module0147.$g2095$.rebind(var6_417, var228);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var228));
                }
                finally {
                    module0139.$g1635$.rebind(var6_416, var228);
                }
            }
            module0139.f9011(module0139.$g1636$.getDynamicValue(var228));
        }
        finally {
            module0139.$g1636$.rebind(var232, var228);
            module0137.$g1605$.rebind(var231, var228);
        }
        return Numbers.numE(var229, var227);
    }
    
    public static SubLObject f16886(final SubLObject var124, final SubLObject var227, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLThread var228 = SubLProcess.currentSubLThread();
        SubLObject var229 = (SubLObject)module0259.ZERO_INTEGER;
        SubLObject var230 = (SubLObject)module0259.NIL;
        final SubLObject var231 = module0137.$g1605$.currentBinding(var228);
        final SubLObject var232 = module0139.$g1636$.currentBinding(var228);
        try {
            module0137.$g1605$.bind(module0137.f8955(module0259.$ic122$), var228);
            module0139.$g1636$.bind(module0139.f9007(), var228);
            if (module0259.NIL == var230) {
                SubLObject var141_452 = var124;
                final SubLObject var233 = (SubLObject)module0259.$ic115$;
                final SubLObject var234 = module0056.f4145(var233);
                final SubLObject var6_453 = module0139.$g1635$.currentBinding(var228);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var228);
                    final SubLObject var235 = var2;
                    final SubLObject var6_454 = module0147.$g2095$.currentBinding(var228);
                    final SubLObject var7_455 = module0147.$g2094$.currentBinding(var228);
                    final SubLObject var236 = module0147.$g2096$.currentBinding(var228);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var235), var228);
                        module0147.$g2094$.bind(module0147.f9546(var235), var228);
                        module0147.$g2096$.bind(module0147.f9549(var235), var228);
                        final SubLObject var237 = var3;
                        final SubLObject var6_455 = module0141.$g1714$.currentBinding(var228);
                        final SubLObject var7_456 = module0141.$g1715$.currentBinding(var228);
                        try {
                            module0141.$g1714$.bind((module0259.NIL != var237) ? var237 : module0141.f9283(), var228);
                            module0141.$g1715$.bind((SubLObject)((module0259.NIL != var237) ? module0259.$ic30$ : module0141.$g1715$.getDynamicValue(var228)), var228);
                            if (module0259.NIL != var237 && module0259.NIL != module0136.f8864() && module0259.NIL == module0141.f9279(var237)) {
                                final SubLObject var238 = module0136.$g1591$.getDynamicValue(var228);
                                if (var238.eql((SubLObject)module0259.$ic31$)) {
                                    module0136.f8870((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic32$, var237, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                }
                                else if (var238.eql((SubLObject)module0259.$ic34$)) {
                                    module0136.f8871((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var237, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                }
                                else if (var238.eql((SubLObject)module0259.$ic36$)) {
                                    Errors.warn((SubLObject)module0259.$ic32$, var237, (SubLObject)module0259.$ic33$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0259.$ic37$, module0136.$g1591$.getDynamicValue(var228));
                                    Errors.cerror((SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var237, (SubLObject)module0259.$ic33$);
                                }
                            }
                            final SubLObject var6_456 = module0141.$g1670$.currentBinding(var228);
                            final SubLObject var7_457 = module0141.$g1671$.currentBinding(var228);
                            final SubLObject var22_460 = module0141.$g1672$.currentBinding(var228);
                            final SubLObject var239 = module0141.$g1674$.currentBinding(var228);
                            final SubLObject var240 = module0137.$g1605$.currentBinding(var228);
                            try {
                                module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0259.$ic122$)), var228);
                                module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0259.$ic122$))), var228);
                                module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0259.$ic122$))), var228);
                                module0141.$g1674$.bind((SubLObject)module0259.NIL, var228);
                                module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0259.$ic122$)), var228);
                                if (module0259.NIL != module0136.f8865() || module0259.NIL != module0244.f15795(var124, module0137.f8955((SubLObject)module0259.UNPROVIDED))) {
                                    final SubLObject var6_457 = module0141.$g1677$.currentBinding(var228);
                                    final SubLObject var7_458 = module0138.$g1619$.currentBinding(var228);
                                    final SubLObject var22_461 = module0141.$g1674$.currentBinding(var228);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9210(), var228);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0259.$ic122$))), var228);
                                        module0141.$g1674$.bind((SubLObject)module0259.NIL, var228);
                                        module0249.f16055(var141_452, (SubLObject)module0259.UNPROVIDED);
                                        while (module0259.NIL != var141_452 && module0259.NIL == var230) {
                                            final SubLObject var241 = var141_452;
                                            final SubLObject var242 = module0200.f12443(module0137.f8955(module0259.$ic122$));
                                            SubLObject var243;
                                            SubLObject var244;
                                            SubLObject var6_458;
                                            SubLObject var7_459;
                                            SubLObject var245;
                                            SubLObject var246;
                                            SubLObject var247;
                                            SubLObject var248;
                                            SubLObject var55_466;
                                            SubLObject var249;
                                            SubLObject var6_459;
                                            SubLObject var54_468;
                                            SubLObject var60_469;
                                            SubLObject var250;
                                            SubLObject var6_460;
                                            SubLObject var251;
                                            SubLObject var252;
                                            SubLObject var253;
                                            SubLObject var254;
                                            SubLObject var255;
                                            SubLObject var256;
                                            SubLObject var257;
                                            SubLObject var258;
                                            SubLObject var259;
                                            SubLObject var261;
                                            SubLObject var260;
                                            SubLObject var262;
                                            SubLObject var171_473;
                                            SubLObject var173_474;
                                            SubLObject var6_461;
                                            SubLObject var6_462;
                                            SubLObject var263;
                                            SubLObject var68_477;
                                            SubLObject var264;
                                            SubLObject var47_478;
                                            SubLObject var265;
                                            SubLObject var6_463;
                                            SubLObject var267;
                                            SubLObject var266;
                                            SubLObject var268;
                                            SubLObject var269;
                                            SubLObject var270;
                                            SubLObject var271;
                                            SubLObject var272;
                                            SubLObject var273;
                                            for (var243 = (SubLObject)module0259.NIL, var243 = var242; module0259.NIL == var230 && module0259.NIL != var243; var243 = var243.rest()) {
                                                var244 = var243.first();
                                                var6_458 = module0137.$g1605$.currentBinding(var228);
                                                var7_459 = module0141.$g1674$.currentBinding(var228);
                                                try {
                                                    module0137.$g1605$.bind(var244, var228);
                                                    module0141.$g1674$.bind((SubLObject)((module0259.NIL != module0141.f9205((SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0259.NIL == module0141.$g1674$.getDynamicValue(var228)) : module0141.$g1674$.getDynamicValue(var228)), var228);
                                                    var245 = module0228.f15229(var241);
                                                    if (module0259.NIL != module0138.f8992(var245)) {
                                                        var246 = module0242.f15664(var245, module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                        if (module0259.NIL != var246) {
                                                            var247 = module0245.f15834(var246, module0244.f15780(module0137.f8955(module0259.$ic122$)), module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                            if (module0259.NIL != var247) {
                                                                for (var248 = module0066.f4838(module0067.f4891(var247)); module0259.NIL == var230 && module0259.NIL == module0066.f4841(var248); var248 = module0066.f4840(var248)) {
                                                                    var228.resetMultipleValues();
                                                                    var55_466 = module0066.f4839(var248);
                                                                    var249 = var228.secondMultipleValue();
                                                                    var228.resetMultipleValues();
                                                                    if (module0259.NIL != module0147.f9507(var55_466)) {
                                                                        var6_459 = module0138.$g1623$.currentBinding(var228);
                                                                        try {
                                                                            module0138.$g1623$.bind(var55_466, var228);
                                                                            for (var54_468 = module0066.f4838(module0067.f4891(var249)); module0259.NIL == var230 && module0259.NIL == module0066.f4841(var54_468); var54_468 = module0066.f4840(var54_468)) {
                                                                                var228.resetMultipleValues();
                                                                                var60_469 = module0066.f4839(var54_468);
                                                                                var250 = var228.secondMultipleValue();
                                                                                var228.resetMultipleValues();
                                                                                if (module0259.NIL != module0141.f9289(var60_469)) {
                                                                                    var6_460 = module0138.$g1624$.currentBinding(var228);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var60_469, var228);
                                                                                        var251 = var250;
                                                                                        if (module0259.NIL != module0077.f5302(var251)) {
                                                                                            var252 = module0077.f5333(var251);
                                                                                            for (var253 = module0032.f1741(var252), var254 = (SubLObject)module0259.NIL, var254 = module0032.f1742(var253, var252); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var253, var254); var254 = module0032.f1743(var254)) {
                                                                                                var255 = module0032.f1745(var253, var254);
                                                                                                if (module0259.NIL != module0032.f1746(var254, var255) && module0259.NIL == module0249.f16059(var255, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                                    module0249.f16055(var255, module0139.$g1636$.getDynamicValue(var228));
                                                                                                    var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                                    if (var229.numG(var227)) {
                                                                                                        var230 = (SubLObject)module0259.T;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var251.isList()) {
                                                                                            if (module0259.NIL == var230) {
                                                                                                var256 = var251;
                                                                                                var257 = (SubLObject)module0259.NIL;
                                                                                                var257 = var256.first();
                                                                                                while (module0259.NIL == var230 && module0259.NIL != var256) {
                                                                                                    if (module0259.NIL == module0249.f16059(var257, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                                        module0249.f16055(var257, module0139.$g1636$.getDynamicValue(var228));
                                                                                                        var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                                        if (var229.numG(var227)) {
                                                                                                            var230 = (SubLObject)module0259.T;
                                                                                                        }
                                                                                                    }
                                                                                                    var256 = var256.rest();
                                                                                                    var257 = var256.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0259.$ic39$, var251);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var6_460, var228);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var54_468);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var6_459, var228);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var248);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0259.FIVE_INTEGER, (SubLObject)module0259.$ic40$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                                        }
                                                        if (module0259.NIL != module0200.f12419(var245, module0137.f8955((SubLObject)module0259.UNPROVIDED)) && module0259.NIL == var230) {
                                                            var258 = module0248.f15995(var245);
                                                            var259 = (SubLObject)module0259.NIL;
                                                            var259 = var258.first();
                                                            while (module0259.NIL == var230 && module0259.NIL != var258) {
                                                                var260 = (var261 = var259);
                                                                var262 = (SubLObject)module0259.NIL;
                                                                var171_473 = (SubLObject)module0259.NIL;
                                                                var173_474 = (SubLObject)module0259.NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(var261, var260, (SubLObject)module0259.$ic116$);
                                                                var262 = var261.first();
                                                                var261 = var261.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var261, var260, (SubLObject)module0259.$ic116$);
                                                                var171_473 = var261.first();
                                                                var261 = var261.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var261, var260, (SubLObject)module0259.$ic116$);
                                                                var173_474 = var261.first();
                                                                var261 = var261.rest();
                                                                if (module0259.NIL == var261) {
                                                                    if (module0259.NIL != module0147.f9507(var171_473)) {
                                                                        var6_461 = module0138.$g1623$.currentBinding(var228);
                                                                        try {
                                                                            module0138.$g1623$.bind(var171_473, var228);
                                                                            if (module0259.NIL != module0141.f9289(var173_474)) {
                                                                                var6_462 = module0138.$g1624$.currentBinding(var228);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var173_474, var228);
                                                                                    var263 = (var251 = (SubLObject)ConsesLow.list(var262));
                                                                                    if (module0259.NIL != module0077.f5302(var251)) {
                                                                                        var252 = module0077.f5333(var251);
                                                                                        for (var253 = module0032.f1741(var252), var254 = (SubLObject)module0259.NIL, var254 = module0032.f1742(var253, var252); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var253, var254); var254 = module0032.f1743(var254)) {
                                                                                            var255 = module0032.f1745(var253, var254);
                                                                                            if (module0259.NIL != module0032.f1746(var254, var255) && module0259.NIL == module0249.f16059(var255, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                                module0249.f16055(var255, module0139.$g1636$.getDynamicValue(var228));
                                                                                                var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                                if (var229.numG(var227)) {
                                                                                                    var230 = (SubLObject)module0259.T;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var251.isList()) {
                                                                                        if (module0259.NIL == var230) {
                                                                                            var68_477 = var251;
                                                                                            var257 = (SubLObject)module0259.NIL;
                                                                                            var257 = var68_477.first();
                                                                                            while (module0259.NIL == var230 && module0259.NIL != var68_477) {
                                                                                                if (module0259.NIL == module0249.f16059(var257, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                                    module0249.f16055(var257, module0139.$g1636$.getDynamicValue(var228));
                                                                                                    var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                                    if (var229.numG(var227)) {
                                                                                                        var230 = (SubLObject)module0259.T;
                                                                                                    }
                                                                                                }
                                                                                                var68_477 = var68_477.rest();
                                                                                                var257 = var68_477.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0259.$ic39$, var251);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_462, var228);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var6_461, var228);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(var260, (SubLObject)module0259.$ic116$);
                                                                }
                                                                var258 = var258.rest();
                                                                var259 = var258.first();
                                                            }
                                                        }
                                                    }
                                                    else if (module0259.NIL != module0155.f9785(var245, (SubLObject)module0259.UNPROVIDED)) {
                                                        var264 = ((module0259.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0259.$ic122$)), module0141.$g1714$.getDynamicValue(var228), module0137.f8955((SubLObject)module0259.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0259.$ic122$)), module0141.$g1714$.getDynamicValue(var228), module0137.f8955((SubLObject)module0259.UNPROVIDED)));
                                                        for (var47_478 = (SubLObject)module0259.NIL, var47_478 = var264; module0259.NIL == var230 && module0259.NIL != var47_478; var47_478 = var47_478.rest()) {
                                                            var265 = var47_478.first();
                                                            var6_463 = module0138.$g1625$.currentBinding(var228);
                                                            try {
                                                                module0138.$g1625$.bind(var265, var228);
                                                                var266 = (var267 = Functions.funcall(var265, var245));
                                                                if (module0259.NIL != module0077.f5302(var267)) {
                                                                    var268 = module0077.f5333(var267);
                                                                    for (var269 = module0032.f1741(var268), var270 = (SubLObject)module0259.NIL, var270 = module0032.f1742(var269, var268); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var269, var270); var270 = module0032.f1743(var270)) {
                                                                        var271 = module0032.f1745(var269, var270);
                                                                        if (module0259.NIL != module0032.f1746(var270, var271) && module0259.NIL == module0249.f16059(var271, module0139.$g1636$.getDynamicValue(var228))) {
                                                                            module0249.f16055(var271, module0139.$g1636$.getDynamicValue(var228));
                                                                            var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                            if (var229.numG(var227)) {
                                                                                var230 = (SubLObject)module0259.T;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (var267.isList()) {
                                                                    if (module0259.NIL == var230) {
                                                                        var272 = var267;
                                                                        var273 = (SubLObject)module0259.NIL;
                                                                        var273 = var272.first();
                                                                        while (module0259.NIL == var230 && module0259.NIL != var272) {
                                                                            if (module0259.NIL == module0249.f16059(var273, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                module0249.f16055(var273, module0139.$g1636$.getDynamicValue(var228));
                                                                                var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                if (var229.numG(var227)) {
                                                                                    var230 = (SubLObject)module0259.T;
                                                                                }
                                                                            }
                                                                            var272 = var272.rest();
                                                                            var273 = var272.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0259.$ic39$, var267);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var6_463, var228);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var7_459, var228);
                                                    module0137.$g1605$.rebind(var6_458, var228);
                                                }
                                            }
                                            final SubLObject var274 = module0200.f12443(module0244.f15771(module0137.f8955(module0259.$ic122$)));
                                            SubLObject var275;
                                            SubLObject var276;
                                            SubLObject var6_464;
                                            SubLObject var7_460;
                                            SubLObject var277;
                                            SubLObject var278;
                                            SubLObject var279;
                                            SubLObject var280;
                                            SubLObject var55_467;
                                            SubLObject var281;
                                            SubLObject var6_465;
                                            SubLObject var54_469;
                                            SubLObject var60_470;
                                            SubLObject var282;
                                            SubLObject var6_466;
                                            SubLObject var283;
                                            SubLObject var284;
                                            SubLObject var285;
                                            SubLObject var286;
                                            SubLObject var287;
                                            SubLObject var288;
                                            SubLObject var289;
                                            SubLObject var290;
                                            SubLObject var47_479;
                                            SubLObject var291;
                                            SubLObject var6_467;
                                            SubLObject var293;
                                            SubLObject var292;
                                            SubLObject var294;
                                            SubLObject var295;
                                            SubLObject var296;
                                            SubLObject var297;
                                            SubLObject var298;
                                            SubLObject var299;
                                            for (var275 = (SubLObject)module0259.NIL, var275 = var274; module0259.NIL == var230 && module0259.NIL != var275; var275 = var275.rest()) {
                                                var276 = var275.first();
                                                var6_464 = module0137.$g1605$.currentBinding(var228);
                                                var7_460 = module0141.$g1674$.currentBinding(var228);
                                                try {
                                                    module0137.$g1605$.bind(var276, var228);
                                                    module0141.$g1674$.bind((SubLObject)((module0259.NIL != module0141.f9205((SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0259.NIL == module0141.$g1674$.getDynamicValue(var228)) : module0141.$g1674$.getDynamicValue(var228)), var228);
                                                    var277 = module0228.f15229(var141_452);
                                                    if (module0259.NIL != module0138.f8992(var277)) {
                                                        var278 = module0242.f15664(var277, module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                        if (module0259.NIL != var278) {
                                                            var279 = module0245.f15834(var278, module0138.f8979(), module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                            if (module0259.NIL != var279) {
                                                                for (var280 = module0066.f4838(module0067.f4891(var279)); module0259.NIL == var230 && module0259.NIL == module0066.f4841(var280); var280 = module0066.f4840(var280)) {
                                                                    var228.resetMultipleValues();
                                                                    var55_467 = module0066.f4839(var280);
                                                                    var281 = var228.secondMultipleValue();
                                                                    var228.resetMultipleValues();
                                                                    if (module0259.NIL != module0147.f9507(var55_467)) {
                                                                        var6_465 = module0138.$g1623$.currentBinding(var228);
                                                                        try {
                                                                            module0138.$g1623$.bind(var55_467, var228);
                                                                            for (var54_469 = module0066.f4838(module0067.f4891(var281)); module0259.NIL == var230 && module0259.NIL == module0066.f4841(var54_469); var54_469 = module0066.f4840(var54_469)) {
                                                                                var228.resetMultipleValues();
                                                                                var60_470 = module0066.f4839(var54_469);
                                                                                var282 = var228.secondMultipleValue();
                                                                                var228.resetMultipleValues();
                                                                                if (module0259.NIL != module0141.f9289(var60_470)) {
                                                                                    var6_466 = module0138.$g1624$.currentBinding(var228);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var60_470, var228);
                                                                                        var283 = var282;
                                                                                        if (module0259.NIL != module0077.f5302(var283)) {
                                                                                            var284 = module0077.f5333(var283);
                                                                                            for (var285 = module0032.f1741(var284), var286 = (SubLObject)module0259.NIL, var286 = module0032.f1742(var285, var284); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var285, var286); var286 = module0032.f1743(var286)) {
                                                                                                var287 = module0032.f1745(var285, var286);
                                                                                                if (module0259.NIL != module0032.f1746(var286, var287) && module0259.NIL == module0249.f16059(var287, (SubLObject)module0259.UNPROVIDED)) {
                                                                                                    module0249.f16055(var287, (SubLObject)module0259.UNPROVIDED);
                                                                                                    module0056.f4149(var287, var234);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var283.isList()) {
                                                                                            if (module0259.NIL == var230) {
                                                                                                var288 = var283;
                                                                                                var289 = (SubLObject)module0259.NIL;
                                                                                                var289 = var288.first();
                                                                                                while (module0259.NIL == var230 && module0259.NIL != var288) {
                                                                                                    if (module0259.NIL == module0249.f16059(var289, (SubLObject)module0259.UNPROVIDED)) {
                                                                                                        module0249.f16055(var289, (SubLObject)module0259.UNPROVIDED);
                                                                                                        module0056.f4149(var289, var234);
                                                                                                    }
                                                                                                    var288 = var288.rest();
                                                                                                    var289 = var288.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0259.$ic39$, var283);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var6_466, var228);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var54_469);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var6_465, var228);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var280);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0259.FIVE_INTEGER, (SubLObject)module0259.$ic40$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (module0259.NIL != module0155.f9785(var277, (SubLObject)module0259.UNPROVIDED)) {
                                                        var290 = ((module0259.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var228), module0137.f8955((SubLObject)module0259.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var228), module0137.f8955((SubLObject)module0259.UNPROVIDED)));
                                                        for (var47_479 = (SubLObject)module0259.NIL, var47_479 = var290; module0259.NIL == var230 && module0259.NIL != var47_479; var47_479 = var47_479.rest()) {
                                                            var291 = var47_479.first();
                                                            var6_467 = module0138.$g1625$.currentBinding(var228);
                                                            try {
                                                                module0138.$g1625$.bind(var291, var228);
                                                                var292 = (var293 = Functions.funcall(var291, var277));
                                                                if (module0259.NIL != module0077.f5302(var293)) {
                                                                    var294 = module0077.f5333(var293);
                                                                    for (var295 = module0032.f1741(var294), var296 = (SubLObject)module0259.NIL, var296 = module0032.f1742(var295, var294); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var295, var296); var296 = module0032.f1743(var296)) {
                                                                        var297 = module0032.f1745(var295, var296);
                                                                        if (module0259.NIL != module0032.f1746(var296, var297) && module0259.NIL == module0249.f16059(var297, (SubLObject)module0259.UNPROVIDED)) {
                                                                            module0249.f16055(var297, (SubLObject)module0259.UNPROVIDED);
                                                                            module0056.f4149(var297, var234);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var293.isList()) {
                                                                    if (module0259.NIL == var230) {
                                                                        var298 = var293;
                                                                        var299 = (SubLObject)module0259.NIL;
                                                                        var299 = var298.first();
                                                                        while (module0259.NIL == var230 && module0259.NIL != var298) {
                                                                            if (module0259.NIL == module0249.f16059(var299, (SubLObject)module0259.UNPROVIDED)) {
                                                                                module0249.f16055(var299, (SubLObject)module0259.UNPROVIDED);
                                                                                module0056.f4149(var299, var234);
                                                                            }
                                                                            var298 = var298.rest();
                                                                            var299 = var298.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0259.$ic39$, var293);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var6_467, var228);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var7_460, var228);
                                                    module0137.$g1605$.rebind(var6_464, var228);
                                                }
                                            }
                                            var141_452 = module0056.f4150(var234);
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var22_461, var228);
                                        module0138.$g1619$.rebind(var7_458, var228);
                                        module0141.$g1677$.rebind(var6_457, var228);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)module0259.TWO_INTEGER, (SubLObject)module0259.$ic117$, var124, module0244.f15748(module0137.f8955((SubLObject)module0259.UNPROVIDED)), (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var240, var228);
                                module0141.$g1674$.rebind(var239, var228);
                                module0141.$g1672$.rebind(var22_460, var228);
                                module0141.$g1671$.rebind(var7_457, var228);
                                module0141.$g1670$.rebind(var6_456, var228);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var7_456, var228);
                            module0141.$g1714$.rebind(var6_455, var228);
                        }
                    }
                    finally {
                        module0147.$g2096$.rebind(var236, var228);
                        module0147.$g2094$.rebind(var7_455, var228);
                        module0147.$g2095$.rebind(var6_454, var228);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var228));
                }
                finally {
                    module0139.$g1635$.rebind(var6_453, var228);
                }
            }
            module0139.f9011(module0139.$g1636$.getDynamicValue(var228));
        }
        finally {
            module0139.$g1636$.rebind(var232, var228);
            module0137.$g1605$.rebind(var231, var228);
        }
        return var230;
    }
    
    public static SubLObject f16887(final SubLObject var124, final SubLObject var227, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLThread var228 = SubLProcess.currentSubLThread();
        SubLObject var229 = (SubLObject)module0259.ZERO_INTEGER;
        SubLObject var230 = (SubLObject)module0259.NIL;
        final SubLObject var231 = module0137.$g1605$.currentBinding(var228);
        final SubLObject var232 = module0139.$g1636$.currentBinding(var228);
        try {
            module0137.$g1605$.bind(module0137.f8955(module0259.$ic122$), var228);
            module0139.$g1636$.bind(module0139.f9007(), var228);
            if (module0259.NIL == var230) {
                SubLObject var141_489 = var124;
                final SubLObject var233 = (SubLObject)module0259.$ic115$;
                final SubLObject var234 = module0056.f4145(var233);
                final SubLObject var6_490 = module0139.$g1635$.currentBinding(var228);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var228);
                    final SubLObject var235 = var2;
                    final SubLObject var6_491 = module0147.$g2095$.currentBinding(var228);
                    final SubLObject var7_492 = module0147.$g2094$.currentBinding(var228);
                    final SubLObject var236 = module0147.$g2096$.currentBinding(var228);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var235), var228);
                        module0147.$g2094$.bind(module0147.f9546(var235), var228);
                        module0147.$g2096$.bind(module0147.f9549(var235), var228);
                        final SubLObject var237 = var3;
                        final SubLObject var6_492 = module0141.$g1714$.currentBinding(var228);
                        final SubLObject var7_493 = module0141.$g1715$.currentBinding(var228);
                        try {
                            module0141.$g1714$.bind((module0259.NIL != var237) ? var237 : module0141.f9283(), var228);
                            module0141.$g1715$.bind((SubLObject)((module0259.NIL != var237) ? module0259.$ic30$ : module0141.$g1715$.getDynamicValue(var228)), var228);
                            if (module0259.NIL != var237 && module0259.NIL != module0136.f8864() && module0259.NIL == module0141.f9279(var237)) {
                                final SubLObject var238 = module0136.$g1591$.getDynamicValue(var228);
                                if (var238.eql((SubLObject)module0259.$ic31$)) {
                                    module0136.f8870((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic32$, var237, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                }
                                else if (var238.eql((SubLObject)module0259.$ic34$)) {
                                    module0136.f8871((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var237, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                }
                                else if (var238.eql((SubLObject)module0259.$ic36$)) {
                                    Errors.warn((SubLObject)module0259.$ic32$, var237, (SubLObject)module0259.$ic33$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0259.$ic37$, module0136.$g1591$.getDynamicValue(var228));
                                    Errors.cerror((SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var237, (SubLObject)module0259.$ic33$);
                                }
                            }
                            final SubLObject var6_493 = module0141.$g1670$.currentBinding(var228);
                            final SubLObject var7_494 = module0141.$g1671$.currentBinding(var228);
                            final SubLObject var22_497 = module0141.$g1672$.currentBinding(var228);
                            final SubLObject var239 = module0141.$g1674$.currentBinding(var228);
                            final SubLObject var240 = module0137.$g1605$.currentBinding(var228);
                            try {
                                module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0259.$ic122$)), var228);
                                module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0259.$ic122$))), var228);
                                module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0259.$ic122$))), var228);
                                module0141.$g1674$.bind((SubLObject)module0259.NIL, var228);
                                module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0259.$ic122$)), var228);
                                if (module0259.NIL != module0136.f8865() || module0259.NIL != module0244.f15795(var124, module0137.f8955((SubLObject)module0259.UNPROVIDED))) {
                                    final SubLObject var6_494 = module0141.$g1677$.currentBinding(var228);
                                    final SubLObject var7_495 = module0138.$g1619$.currentBinding(var228);
                                    final SubLObject var22_498 = module0141.$g1674$.currentBinding(var228);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9210(), var228);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0259.$ic122$))), var228);
                                        module0141.$g1674$.bind((SubLObject)module0259.NIL, var228);
                                        module0249.f16055(var141_489, (SubLObject)module0259.UNPROVIDED);
                                        while (module0259.NIL != var141_489 && module0259.NIL == var230) {
                                            final SubLObject var241 = var141_489;
                                            final SubLObject var242 = module0200.f12443(module0137.f8955(module0259.$ic122$));
                                            SubLObject var243;
                                            SubLObject var244;
                                            SubLObject var6_495;
                                            SubLObject var7_496;
                                            SubLObject var245;
                                            SubLObject var246;
                                            SubLObject var247;
                                            SubLObject var248;
                                            SubLObject var55_503;
                                            SubLObject var249;
                                            SubLObject var6_496;
                                            SubLObject var54_505;
                                            SubLObject var60_506;
                                            SubLObject var250;
                                            SubLObject var6_497;
                                            SubLObject var251;
                                            SubLObject var252;
                                            SubLObject var253;
                                            SubLObject var254;
                                            SubLObject var255;
                                            SubLObject var256;
                                            SubLObject var257;
                                            SubLObject var258;
                                            SubLObject var259;
                                            SubLObject var261;
                                            SubLObject var260;
                                            SubLObject var262;
                                            SubLObject var171_510;
                                            SubLObject var173_511;
                                            SubLObject var6_498;
                                            SubLObject var6_499;
                                            SubLObject var263;
                                            SubLObject var68_514;
                                            SubLObject var264;
                                            SubLObject var47_515;
                                            SubLObject var265;
                                            SubLObject var6_500;
                                            SubLObject var267;
                                            SubLObject var266;
                                            SubLObject var268;
                                            SubLObject var269;
                                            SubLObject var270;
                                            SubLObject var271;
                                            SubLObject var272;
                                            SubLObject var273;
                                            for (var243 = (SubLObject)module0259.NIL, var243 = var242; module0259.NIL == var230 && module0259.NIL != var243; var243 = var243.rest()) {
                                                var244 = var243.first();
                                                var6_495 = module0137.$g1605$.currentBinding(var228);
                                                var7_496 = module0141.$g1674$.currentBinding(var228);
                                                try {
                                                    module0137.$g1605$.bind(var244, var228);
                                                    module0141.$g1674$.bind((SubLObject)((module0259.NIL != module0141.f9205((SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0259.NIL == module0141.$g1674$.getDynamicValue(var228)) : module0141.$g1674$.getDynamicValue(var228)), var228);
                                                    var245 = module0228.f15229(var241);
                                                    if (module0259.NIL != module0138.f8992(var245)) {
                                                        var246 = module0242.f15664(var245, module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                        if (module0259.NIL != var246) {
                                                            var247 = module0245.f15834(var246, module0244.f15780(module0137.f8955(module0259.$ic122$)), module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                            if (module0259.NIL != var247) {
                                                                for (var248 = module0066.f4838(module0067.f4891(var247)); module0259.NIL == var230 && module0259.NIL == module0066.f4841(var248); var248 = module0066.f4840(var248)) {
                                                                    var228.resetMultipleValues();
                                                                    var55_503 = module0066.f4839(var248);
                                                                    var249 = var228.secondMultipleValue();
                                                                    var228.resetMultipleValues();
                                                                    if (module0259.NIL != module0147.f9507(var55_503)) {
                                                                        var6_496 = module0138.$g1623$.currentBinding(var228);
                                                                        try {
                                                                            module0138.$g1623$.bind(var55_503, var228);
                                                                            for (var54_505 = module0066.f4838(module0067.f4891(var249)); module0259.NIL == var230 && module0259.NIL == module0066.f4841(var54_505); var54_505 = module0066.f4840(var54_505)) {
                                                                                var228.resetMultipleValues();
                                                                                var60_506 = module0066.f4839(var54_505);
                                                                                var250 = var228.secondMultipleValue();
                                                                                var228.resetMultipleValues();
                                                                                if (module0259.NIL != module0141.f9289(var60_506)) {
                                                                                    var6_497 = module0138.$g1624$.currentBinding(var228);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var60_506, var228);
                                                                                        var251 = var250;
                                                                                        if (module0259.NIL != module0077.f5302(var251)) {
                                                                                            var252 = module0077.f5333(var251);
                                                                                            for (var253 = module0032.f1741(var252), var254 = (SubLObject)module0259.NIL, var254 = module0032.f1742(var253, var252); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var253, var254); var254 = module0032.f1743(var254)) {
                                                                                                var255 = module0032.f1745(var253, var254);
                                                                                                if (module0259.NIL != module0032.f1746(var254, var255) && module0259.NIL == module0249.f16059(var255, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                                    module0249.f16055(var255, module0139.$g1636$.getDynamicValue(var228));
                                                                                                    var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                                    if (var229.numGE(var227)) {
                                                                                                        var230 = (SubLObject)module0259.T;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var251.isList()) {
                                                                                            if (module0259.NIL == var230) {
                                                                                                var256 = var251;
                                                                                                var257 = (SubLObject)module0259.NIL;
                                                                                                var257 = var256.first();
                                                                                                while (module0259.NIL == var230 && module0259.NIL != var256) {
                                                                                                    if (module0259.NIL == module0249.f16059(var257, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                                        module0249.f16055(var257, module0139.$g1636$.getDynamicValue(var228));
                                                                                                        var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                                        if (var229.numGE(var227)) {
                                                                                                            var230 = (SubLObject)module0259.T;
                                                                                                        }
                                                                                                    }
                                                                                                    var256 = var256.rest();
                                                                                                    var257 = var256.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0259.$ic39$, var251);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var6_497, var228);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var54_505);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var6_496, var228);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var248);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0259.FIVE_INTEGER, (SubLObject)module0259.$ic40$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                                        }
                                                        if (module0259.NIL != module0200.f12419(var245, module0137.f8955((SubLObject)module0259.UNPROVIDED)) && module0259.NIL == var230) {
                                                            var258 = module0248.f15995(var245);
                                                            var259 = (SubLObject)module0259.NIL;
                                                            var259 = var258.first();
                                                            while (module0259.NIL == var230 && module0259.NIL != var258) {
                                                                var260 = (var261 = var259);
                                                                var262 = (SubLObject)module0259.NIL;
                                                                var171_510 = (SubLObject)module0259.NIL;
                                                                var173_511 = (SubLObject)module0259.NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(var261, var260, (SubLObject)module0259.$ic116$);
                                                                var262 = var261.first();
                                                                var261 = var261.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var261, var260, (SubLObject)module0259.$ic116$);
                                                                var171_510 = var261.first();
                                                                var261 = var261.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var261, var260, (SubLObject)module0259.$ic116$);
                                                                var173_511 = var261.first();
                                                                var261 = var261.rest();
                                                                if (module0259.NIL == var261) {
                                                                    if (module0259.NIL != module0147.f9507(var171_510)) {
                                                                        var6_498 = module0138.$g1623$.currentBinding(var228);
                                                                        try {
                                                                            module0138.$g1623$.bind(var171_510, var228);
                                                                            if (module0259.NIL != module0141.f9289(var173_511)) {
                                                                                var6_499 = module0138.$g1624$.currentBinding(var228);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var173_511, var228);
                                                                                    var263 = (var251 = (SubLObject)ConsesLow.list(var262));
                                                                                    if (module0259.NIL != module0077.f5302(var251)) {
                                                                                        var252 = module0077.f5333(var251);
                                                                                        for (var253 = module0032.f1741(var252), var254 = (SubLObject)module0259.NIL, var254 = module0032.f1742(var253, var252); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var253, var254); var254 = module0032.f1743(var254)) {
                                                                                            var255 = module0032.f1745(var253, var254);
                                                                                            if (module0259.NIL != module0032.f1746(var254, var255) && module0259.NIL == module0249.f16059(var255, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                                module0249.f16055(var255, module0139.$g1636$.getDynamicValue(var228));
                                                                                                var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                                if (var229.numGE(var227)) {
                                                                                                    var230 = (SubLObject)module0259.T;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var251.isList()) {
                                                                                        if (module0259.NIL == var230) {
                                                                                            var68_514 = var251;
                                                                                            var257 = (SubLObject)module0259.NIL;
                                                                                            var257 = var68_514.first();
                                                                                            while (module0259.NIL == var230 && module0259.NIL != var68_514) {
                                                                                                if (module0259.NIL == module0249.f16059(var257, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                                    module0249.f16055(var257, module0139.$g1636$.getDynamicValue(var228));
                                                                                                    var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                                    if (var229.numGE(var227)) {
                                                                                                        var230 = (SubLObject)module0259.T;
                                                                                                    }
                                                                                                }
                                                                                                var68_514 = var68_514.rest();
                                                                                                var257 = var68_514.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0259.$ic39$, var251);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_499, var228);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var6_498, var228);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(var260, (SubLObject)module0259.$ic116$);
                                                                }
                                                                var258 = var258.rest();
                                                                var259 = var258.first();
                                                            }
                                                        }
                                                    }
                                                    else if (module0259.NIL != module0155.f9785(var245, (SubLObject)module0259.UNPROVIDED)) {
                                                        var264 = ((module0259.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0259.$ic122$)), module0141.$g1714$.getDynamicValue(var228), module0137.f8955((SubLObject)module0259.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0259.$ic122$)), module0141.$g1714$.getDynamicValue(var228), module0137.f8955((SubLObject)module0259.UNPROVIDED)));
                                                        for (var47_515 = (SubLObject)module0259.NIL, var47_515 = var264; module0259.NIL == var230 && module0259.NIL != var47_515; var47_515 = var47_515.rest()) {
                                                            var265 = var47_515.first();
                                                            var6_500 = module0138.$g1625$.currentBinding(var228);
                                                            try {
                                                                module0138.$g1625$.bind(var265, var228);
                                                                var266 = (var267 = Functions.funcall(var265, var245));
                                                                if (module0259.NIL != module0077.f5302(var267)) {
                                                                    var268 = module0077.f5333(var267);
                                                                    for (var269 = module0032.f1741(var268), var270 = (SubLObject)module0259.NIL, var270 = module0032.f1742(var269, var268); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var269, var270); var270 = module0032.f1743(var270)) {
                                                                        var271 = module0032.f1745(var269, var270);
                                                                        if (module0259.NIL != module0032.f1746(var270, var271) && module0259.NIL == module0249.f16059(var271, module0139.$g1636$.getDynamicValue(var228))) {
                                                                            module0249.f16055(var271, module0139.$g1636$.getDynamicValue(var228));
                                                                            var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                            if (var229.numGE(var227)) {
                                                                                var230 = (SubLObject)module0259.T;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (var267.isList()) {
                                                                    if (module0259.NIL == var230) {
                                                                        var272 = var267;
                                                                        var273 = (SubLObject)module0259.NIL;
                                                                        var273 = var272.first();
                                                                        while (module0259.NIL == var230 && module0259.NIL != var272) {
                                                                            if (module0259.NIL == module0249.f16059(var273, module0139.$g1636$.getDynamicValue(var228))) {
                                                                                module0249.f16055(var273, module0139.$g1636$.getDynamicValue(var228));
                                                                                var229 = Numbers.add(var229, (SubLObject)module0259.ONE_INTEGER);
                                                                                if (var229.numGE(var227)) {
                                                                                    var230 = (SubLObject)module0259.T;
                                                                                }
                                                                            }
                                                                            var272 = var272.rest();
                                                                            var273 = var272.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0259.$ic39$, var267);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var6_500, var228);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var7_496, var228);
                                                    module0137.$g1605$.rebind(var6_495, var228);
                                                }
                                            }
                                            final SubLObject var274 = module0200.f12443(module0244.f15771(module0137.f8955(module0259.$ic122$)));
                                            SubLObject var275;
                                            SubLObject var276;
                                            SubLObject var6_501;
                                            SubLObject var7_497;
                                            SubLObject var277;
                                            SubLObject var278;
                                            SubLObject var279;
                                            SubLObject var280;
                                            SubLObject var55_504;
                                            SubLObject var281;
                                            SubLObject var6_502;
                                            SubLObject var54_506;
                                            SubLObject var60_507;
                                            SubLObject var282;
                                            SubLObject var6_503;
                                            SubLObject var283;
                                            SubLObject var284;
                                            SubLObject var285;
                                            SubLObject var286;
                                            SubLObject var287;
                                            SubLObject var288;
                                            SubLObject var289;
                                            SubLObject var290;
                                            SubLObject var47_516;
                                            SubLObject var291;
                                            SubLObject var6_504;
                                            SubLObject var293;
                                            SubLObject var292;
                                            SubLObject var294;
                                            SubLObject var295;
                                            SubLObject var296;
                                            SubLObject var297;
                                            SubLObject var298;
                                            SubLObject var299;
                                            for (var275 = (SubLObject)module0259.NIL, var275 = var274; module0259.NIL == var230 && module0259.NIL != var275; var275 = var275.rest()) {
                                                var276 = var275.first();
                                                var6_501 = module0137.$g1605$.currentBinding(var228);
                                                var7_497 = module0141.$g1674$.currentBinding(var228);
                                                try {
                                                    module0137.$g1605$.bind(var276, var228);
                                                    module0141.$g1674$.bind((SubLObject)((module0259.NIL != module0141.f9205((SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0259.NIL == module0141.$g1674$.getDynamicValue(var228)) : module0141.$g1674$.getDynamicValue(var228)), var228);
                                                    var277 = module0228.f15229(var141_489);
                                                    if (module0259.NIL != module0138.f8992(var277)) {
                                                        var278 = module0242.f15664(var277, module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                        if (module0259.NIL != var278) {
                                                            var279 = module0245.f15834(var278, module0138.f8979(), module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                            if (module0259.NIL != var279) {
                                                                for (var280 = module0066.f4838(module0067.f4891(var279)); module0259.NIL == var230 && module0259.NIL == module0066.f4841(var280); var280 = module0066.f4840(var280)) {
                                                                    var228.resetMultipleValues();
                                                                    var55_504 = module0066.f4839(var280);
                                                                    var281 = var228.secondMultipleValue();
                                                                    var228.resetMultipleValues();
                                                                    if (module0259.NIL != module0147.f9507(var55_504)) {
                                                                        var6_502 = module0138.$g1623$.currentBinding(var228);
                                                                        try {
                                                                            module0138.$g1623$.bind(var55_504, var228);
                                                                            for (var54_506 = module0066.f4838(module0067.f4891(var281)); module0259.NIL == var230 && module0259.NIL == module0066.f4841(var54_506); var54_506 = module0066.f4840(var54_506)) {
                                                                                var228.resetMultipleValues();
                                                                                var60_507 = module0066.f4839(var54_506);
                                                                                var282 = var228.secondMultipleValue();
                                                                                var228.resetMultipleValues();
                                                                                if (module0259.NIL != module0141.f9289(var60_507)) {
                                                                                    var6_503 = module0138.$g1624$.currentBinding(var228);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var60_507, var228);
                                                                                        var283 = var282;
                                                                                        if (module0259.NIL != module0077.f5302(var283)) {
                                                                                            var284 = module0077.f5333(var283);
                                                                                            for (var285 = module0032.f1741(var284), var286 = (SubLObject)module0259.NIL, var286 = module0032.f1742(var285, var284); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var285, var286); var286 = module0032.f1743(var286)) {
                                                                                                var287 = module0032.f1745(var285, var286);
                                                                                                if (module0259.NIL != module0032.f1746(var286, var287) && module0259.NIL == module0249.f16059(var287, (SubLObject)module0259.UNPROVIDED)) {
                                                                                                    module0249.f16055(var287, (SubLObject)module0259.UNPROVIDED);
                                                                                                    module0056.f4149(var287, var234);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var283.isList()) {
                                                                                            if (module0259.NIL == var230) {
                                                                                                var288 = var283;
                                                                                                var289 = (SubLObject)module0259.NIL;
                                                                                                var289 = var288.first();
                                                                                                while (module0259.NIL == var230 && module0259.NIL != var288) {
                                                                                                    if (module0259.NIL == module0249.f16059(var289, (SubLObject)module0259.UNPROVIDED)) {
                                                                                                        module0249.f16055(var289, (SubLObject)module0259.UNPROVIDED);
                                                                                                        module0056.f4149(var289, var234);
                                                                                                    }
                                                                                                    var288 = var288.rest();
                                                                                                    var289 = var288.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0259.$ic39$, var283);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var6_503, var228);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var54_506);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var6_502, var228);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var280);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0259.FIVE_INTEGER, (SubLObject)module0259.$ic40$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (module0259.NIL != module0155.f9785(var277, (SubLObject)module0259.UNPROVIDED)) {
                                                        var290 = ((module0259.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var228), module0137.f8955((SubLObject)module0259.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var228), module0137.f8955((SubLObject)module0259.UNPROVIDED)));
                                                        for (var47_516 = (SubLObject)module0259.NIL, var47_516 = var290; module0259.NIL == var230 && module0259.NIL != var47_516; var47_516 = var47_516.rest()) {
                                                            var291 = var47_516.first();
                                                            var6_504 = module0138.$g1625$.currentBinding(var228);
                                                            try {
                                                                module0138.$g1625$.bind(var291, var228);
                                                                var292 = (var293 = Functions.funcall(var291, var277));
                                                                if (module0259.NIL != module0077.f5302(var293)) {
                                                                    var294 = module0077.f5333(var293);
                                                                    for (var295 = module0032.f1741(var294), var296 = (SubLObject)module0259.NIL, var296 = module0032.f1742(var295, var294); module0259.NIL == var230 && module0259.NIL == module0032.f1744(var295, var296); var296 = module0032.f1743(var296)) {
                                                                        var297 = module0032.f1745(var295, var296);
                                                                        if (module0259.NIL != module0032.f1746(var296, var297) && module0259.NIL == module0249.f16059(var297, (SubLObject)module0259.UNPROVIDED)) {
                                                                            module0249.f16055(var297, (SubLObject)module0259.UNPROVIDED);
                                                                            module0056.f4149(var297, var234);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var293.isList()) {
                                                                    if (module0259.NIL == var230) {
                                                                        var298 = var293;
                                                                        var299 = (SubLObject)module0259.NIL;
                                                                        var299 = var298.first();
                                                                        while (module0259.NIL == var230 && module0259.NIL != var298) {
                                                                            if (module0259.NIL == module0249.f16059(var299, (SubLObject)module0259.UNPROVIDED)) {
                                                                                module0249.f16055(var299, (SubLObject)module0259.UNPROVIDED);
                                                                                module0056.f4149(var299, var234);
                                                                            }
                                                                            var298 = var298.rest();
                                                                            var299 = var298.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0259.$ic39$, var293);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var6_504, var228);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var7_497, var228);
                                                    module0137.$g1605$.rebind(var6_501, var228);
                                                }
                                            }
                                            var141_489 = module0056.f4150(var234);
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var22_498, var228);
                                        module0138.$g1619$.rebind(var7_495, var228);
                                        module0141.$g1677$.rebind(var6_494, var228);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)module0259.TWO_INTEGER, (SubLObject)module0259.$ic117$, var124, module0244.f15748(module0137.f8955((SubLObject)module0259.UNPROVIDED)), (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var240, var228);
                                module0141.$g1674$.rebind(var239, var228);
                                module0141.$g1672$.rebind(var22_497, var228);
                                module0141.$g1671$.rebind(var7_494, var228);
                                module0141.$g1670$.rebind(var6_493, var228);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var7_493, var228);
                            module0141.$g1714$.rebind(var6_492, var228);
                        }
                    }
                    finally {
                        module0147.$g2096$.rebind(var236, var228);
                        module0147.$g2094$.rebind(var7_492, var228);
                        module0147.$g2095$.rebind(var6_491, var228);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var228));
                }
                finally {
                    module0139.$g1635$.rebind(var6_490, var228);
                }
            }
            module0139.f9011(module0139.$g1636$.getDynamicValue(var228));
        }
        finally {
            module0139.$g1636$.rebind(var232, var228);
            module0137.$g1605$.rebind(var231, var228);
        }
        return var230;
    }
    
    public static SubLObject f16888(final SubLObject var124, final SubLObject var227, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        return Numbers.numL(f16883(var124, var2, var3), var227);
    }
    
    public static SubLObject f16889(final SubLObject var124, final SubLObject var227, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        return Numbers.numLE(f16883(var124, var2, var3), var227);
    }
    
    public static SubLObject f16854(final SubLObject var1, final SubLObject var124, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13565(var124) : var124;
        if (module0259.NIL != module0252.f16343(module0137.f8955(module0259.$ic0$), var1, var124, var2, var3)) {
            return (SubLObject)module0259.T;
        }
        if (module0259.NIL != module0248.f15968(var1) && module0259.NIL != module0256.f16604(var124, module0248.f15969(var1, var2, var3), var2, var3)) {
            return (SubLObject)module0259.T;
        }
        if (module0259.NIL != module0206.f13453(var124) && module0205.f13136(var124).eql(module0259.$ic125$) && module0259.NIL != module0202.f12677(module0205.f13203(var124, (SubLObject)module0259.UNPROVIDED))) {
            SubLObject var126;
            final SubLObject var125 = var126 = module0202.f12684(module0205.f13203(var124, (SubLObject)module0259.UNPROVIDED));
            SubLObject var127 = (SubLObject)module0259.NIL;
            var127 = var126.first();
            while (module0259.NIL != var126) {
                if (module0259.NIL == module0210.f13565(var127) || module0259.NIL == f16854(var1, var127, var2, var3)) {
                    return (SubLObject)module0259.NIL;
                }
                var126 = var126.rest();
                var127 = var126.first();
            }
            return (SubLObject)module0259.T;
        }
        if (module0259.NIL != module0173.f10956(var1) && module0259.NIL != module0248.f15990(var1, var124, var2, var3)) {
            return (SubLObject)module0259.T;
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16890(final SubLObject var1, final SubLObject var124, final SubLObject var122) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        assert module0259.NIL != module0210.f13565(var124) : var124;
        SubLObject var126 = (SubLObject)module0259.NIL;
        final SubLObject var127 = module0147.$g2094$.currentBinding(var125);
        final SubLObject var128 = module0147.$g2096$.currentBinding(var125);
        try {
            module0147.$g2094$.bind((SubLObject)module0259.$ic56$, var125);
            module0147.$g2096$.bind(var122, var125);
            var126 = f16854(var1, var124, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var128, var125);
            module0147.$g2094$.rebind(var127, var125);
        }
        return var126;
    }
    
    public static SubLObject f16891(final SubLObject var1, final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        SubLObject var126 = (SubLObject)module0259.NIL;
        final SubLObject var127 = module0147.$g2094$.currentBinding(var125);
        final SubLObject var128 = module0147.$g2095$.currentBinding(var125);
        try {
            module0147.$g2094$.bind((SubLObject)module0259.$ic54$, var125);
            module0147.$g2095$.bind(module0259.$ic55$, var125);
            var126 = f16854(var1, var124, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var128, var125);
            module0147.$g2094$.rebind(var127, var125);
        }
        return var126;
    }
    
    public static SubLObject f16892(final SubLObject var10, final SubLObject var124, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLObject var125 = module0205.f13330(var10);
        if (module0259.NIL != var125) {
            return f16854(var125, var124, var2, var3);
        }
        return f16893(var10, var124, var2);
    }
    
    public static SubLObject f16893(final SubLObject var10, final SubLObject var124, final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0259.NIL != module0248.f15990(var10, var124, var2, (SubLObject)module0259.UNPROVIDED) || (module0259.NIL == f16894(module0205.f13276(var10), var124, var2) && module0259.NIL == f16895(var10, var124, var2) && (module0259.NIL != f16896(module0205.f13276(var10), var124, var2) || module0259.NIL != f16897(var10, var124, var2) || module0259.NIL != f16898(var10, var124, var2) || module0259.NIL != f16899(var10, var124, var2))));
    }
    
    public static SubLObject f16896(final SubLObject var529, final SubLObject var124, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        return module0256.f16604(var124, module0226.f14990(var529, var2), var2, (SubLObject)module0259.UNPROVIDED);
    }
    
    public static SubLObject f16894(final SubLObject var529, final SubLObject var124, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        return module0257.f16696(module0226.f14990(var529, var2), var124, var2, (SubLObject)module0259.UNPROVIDED);
    }
    
    public static SubLObject f16897(final SubLObject var123, final SubLObject var124, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        return module0256.f16604(var124, module0226.f15006(var123, var2), var2, (SubLObject)module0259.UNPROVIDED);
    }
    
    public static SubLObject f16895(final SubLObject var123, final SubLObject var124, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        return module0257.f16696(module0226.f15006(var123, var2), var124, var2, (SubLObject)module0259.UNPROVIDED);
    }
    
    public static SubLObject f16898(final SubLObject var123, final SubLObject var124, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        return module0256.f16604(var124, module0226.f15010(var123, var2), var2, (SubLObject)module0259.UNPROVIDED);
    }
    
    public static SubLObject f16899(final SubLObject var123, final SubLObject var124, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        return module0256.f16604(var124, module0226.f15011(var123, var2), var2, (SubLObject)module0259.UNPROVIDED);
    }
    
    public static SubLObject f16900(final SubLObject var530) {
        if (module0259.NIL != module0252.f16335(module0137.f8955(module0259.$ic0$), var530, module0141.f9251(), (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) {
            return var530;
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16901(final SubLObject var1, final SubLObject var127, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13572(var1) : var1;
        assert module0259.NIL != Types.listp(var127) : var127;
        if (module0259.NIL == var127) {
            return (SubLObject)module0259.NIL;
        }
        if (module0259.NIL != module0035.f1997(var127)) {
            return f16854(var1, var127.first(), var2, var3);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0259.NIL != module0252.f16352(module0137.f8955(module0259.$ic0$), var1, var127, var2, var3) || module0259.NIL != ((module0259.NIL != module0173.f10956(var1)) ? module0248.f15991(var1, var127, var2, var3) : module0259.NIL) || module0259.NIL != ((module0259.NIL != module0248.f15968(var1)) ? module0256.f16609(module0248.f15969(var1, var2, var3), var127, var2, var3) : module0259.NIL));
    }
    
    public static SubLObject f16902(final SubLObject var1, final SubLObject var127, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13572(var1) : var1;
        assert module0259.NIL != Types.listp(var127) : var127;
        return f16901(var1, var127, var2, var3);
    }
    
    public static SubLObject f16903(final SubLObject var10, final SubLObject var127, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLObject var128 = module0205.f13330(var10);
        if (module0259.NIL != var128) {
            return f16902(var128, var127, var2, var3);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0259.NIL != module0248.f15991(var10, var127, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED) || module0259.NIL != module0256.f16609(module0226.f15003(module0205.f13276(var10), var2), var127, var2, var3));
    }
    
    public static SubLObject f16904(final SubLObject var124, final SubLObject var531) {
        final SubLThread var532 = SubLProcess.currentSubLThread();
        assert module0259.NIL != Types.listp(var531) : var531;
        if (module0259.NIL == Errors.$ignore_mustsP$.getDynamicValue(var532) && module0259.NIL == f16854(var124, module0259.$ic139$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) {
            Errors.error((SubLObject)module0259.$ic140$, var124);
        }
        SubLObject var533 = var531;
        SubLObject var534 = (SubLObject)module0259.NIL;
        var534 = var533.first();
        while (module0259.NIL != var533) {
            if (module0259.NIL != f16891(var534, var124)) {
                return var534;
            }
            var533 = var533.rest();
            var534 = var533.first();
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16905(final SubLObject var1, final SubLObject var127, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != Types.listp(var127) : var127;
        if (module0259.NIL == var127) {
            return (SubLObject)module0259.T;
        }
        if (module0259.NIL != module0035.f1997(var127)) {
            return f16854(var1, var127.first(), var2, var3);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0259.NIL != module0252.f16358(module0137.f8955(module0259.$ic0$), var1, var127, var2, var3) || module0259.NIL != ((module0259.NIL != module0173.f10956(var1)) ? module0248.f15992(var1, var127, var2, var3) : module0259.NIL) || module0259.NIL != ((module0259.NIL != module0248.f15968(var1)) ? module0256.f16610(module0248.f15969(var1, var2, var3), var127, var2, var3) : module0259.NIL));
    }
    
    public static SubLObject f16906(final SubLObject var125, final SubLObject var124, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        if (module0259.NIL == var125) {
            return (SubLObject)module0259.T;
        }
        if (module0259.NIL != module0035.f1997(var125)) {
            return f16854(var125.first(), var124, var2, var3);
        }
        return module0252.f16365(module0137.f8955(module0259.$ic0$), var125, var124, var2, var3);
    }
    
    public static SubLObject f16907(final SubLObject var125, final SubLObject var127, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != Types.listp(var125) : var125;
        assert module0259.NIL != Types.listp(var127) : var127;
        if (module0259.NIL == var125) {
            return (SubLObject)module0259.NIL;
        }
        if (module0259.NIL == var127) {
            return (SubLObject)module0259.NIL;
        }
        if (module0259.NIL != module0035.f1997(var125)) {
            return f16902(var125.first(), var127, var2, var3);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0259.NIL != module0252.f16370(module0137.f8955(module0259.$ic0$), var125, var127, var2, var3) || module0259.NIL != ((module0259.NIL != module0035.f2369((SubLObject)module0259.$ic75$, var125, (SubLObject)module0259.UNPROVIDED)) ? module0256.f16609(module0248.f15970(var125, var2, var3), var127, var2, var3) : module0259.NIL));
    }
    
    public static SubLObject f16867(final SubLObject var1, final SubLObject var124, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13572(var1) : var1;
        assert module0259.NIL != module0210.f13565(var124) : var124;
        return (SubLObject)SubLObjectFactory.makeBoolean(module0259.NIL != f16908(var1, var124, var2, var3) || module0259.NIL != f16909(var1, var124, var2, var3));
    }
    
    public static SubLObject f16910(final SubLObject var1, final SubLObject var127, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        SubLObject var128 = (SubLObject)module0259.NIL;
        if (module0259.NIL == var128) {
            SubLObject var129 = var127;
            SubLObject var130 = (SubLObject)module0259.NIL;
            var130 = var129.first();
            while (module0259.NIL == var128 && module0259.NIL != var129) {
                if (module0259.NIL != f16867(var1, var130, var2, var3)) {
                    var128 = (SubLObject)module0259.T;
                }
                var129 = var129.rest();
                var130 = var129.first();
            }
        }
        return var128;
    }
    
    public static SubLObject f16909(final SubLObject var1, final SubLObject var124, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        return module0254.f16488(module0137.f8955(module0259.$ic0$), var1, var124, var2, var3);
    }
    
    public static SubLObject f16908(final SubLObject var1, final SubLObject var124, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        if (module0259.NIL != module0226.f14858(var124, var2)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0259.NIL == f16854(var1, var124, var2, var3));
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16911(final SubLObject var1, final SubLObject var14, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        return module0254.f16487(module0137.f8955(module0259.$ic0$), var1, var14, var2, var3);
    }
    
    public static SubLObject f16912(final SubLObject var1, final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        SubLObject var126 = (SubLObject)module0259.NIL;
        final SubLObject var127 = module0147.$g2094$.currentBinding(var125);
        final SubLObject var128 = module0147.$g2095$.currentBinding(var125);
        try {
            module0147.$g2094$.bind((SubLObject)module0259.$ic54$, var125);
            module0147.$g2095$.bind(module0259.$ic55$, var125);
            var126 = f16867(var1, var124, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var128, var125);
            module0147.$g2094$.rebind(var127, var125);
        }
        return var126;
    }
    
    public static SubLObject f16913(final SubLObject var10, final SubLObject var124, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLObject var125 = module0205.f13330(var10);
        if (module0259.NIL != var125) {
            return f16867(var125, var124, var2, var3);
        }
        return module0257.f16696(module0226.f15003(module0205.f13276(var10), var2), var124, var2, var3);
    }
    
    public static SubLObject f16914(final SubLObject var1, final SubLObject var124, SubLObject var2, SubLObject var3, SubLObject var535) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        if (var535 == module0259.UNPROVIDED) {
            var535 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13572(var1) : var1;
        assert module0259.NIL != module0210.f13565(var124) : var124;
        if (module0259.NIL != module0210.f13598(var1)) {
            return f16915(var1, var124, var2);
        }
        return module0252.f16349(module0137.f8955(module0259.$ic0$), var1, var124, var2, var3, var535);
    }
    
    public static SubLObject f16916(final SubLObject var1, final SubLObject var124, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        return f16914(var1, var124, var2, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
    }
    
    public static SubLObject f16915(final SubLObject var10, final SubLObject var124, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        final SubLObject var125 = module0205.f13330(var10);
        final SubLObject var126 = f16916(var125, var124, var2);
        if (module0259.NIL != var126) {
            return (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)ConsesLow.list(module0259.$ic152$, var125, var10), (SubLObject)module0259.$ic153$), var126);
        }
        SubLObject var127 = (SubLObject)module0259.NIL;
        if (module0259.NIL == var127) {
            SubLObject var128 = module0226.f15003(module0205.f13276(var10), var2);
            SubLObject var129 = (SubLObject)module0259.NIL;
            var129 = var128.first();
            while (module0259.NIL == var127 && module0259.NIL != var128) {
                if (!var129.equal(var124)) {
                    var127 = module0256.f16628(var129, var124, var2, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                }
                if (module0259.NIL != var127 || var129.equal(var124)) {
                    return (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)ConsesLow.list(module0259.$ic154$, module0205.f13276(var10), var129), (SubLObject)module0259.$ic153$), var127);
                }
                var128 = var128.rest();
                var129 = var128.first();
            }
        }
        if (module0259.NIL == var127) {
            SubLObject var128 = module0226.f15006(var10, var2);
            SubLObject var129 = (SubLObject)module0259.NIL;
            var129 = var128.first();
            while (module0259.NIL == var127 && module0259.NIL != var128) {
                if (!var129.equal(var124)) {
                    var127 = module0256.f16628(var129, var124, var2, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                }
                if (module0259.NIL != var127 || var129.equal(var124)) {
                    final SubLObject var130 = module0226.f15024(var10, var124, var2, (SubLObject)module0259.UNPROVIDED);
                    if (module0259.NIL != var130) {
                        return (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)ConsesLow.list(module0259.$ic155$, module0205.f13276(var10), var130.first()), (SubLObject)module0259.$ic153$), var127);
                    }
                }
                var128 = var128.rest();
                var129 = var128.first();
            }
        }
        if (module0259.NIL == var127) {
            SubLObject var128 = module0226.f15010(var10, var2);
            SubLObject var129 = (SubLObject)module0259.NIL;
            var129 = var128.first();
            while (module0259.NIL == var127 && module0259.NIL != var128) {
                if (!var129.equal(var124)) {
                    var127 = module0256.f16628(var129, var124, var2, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                }
                if (module0259.NIL != var127 || var129.equal(var124)) {
                    final SubLObject var130 = module0226.f15026(var10, var124, var2, (SubLObject)module0259.UNPROVIDED).first();
                    if (var130.isCons()) {
                        final SubLObject var131 = var130.first();
                        final SubLObject var132 = conses_high.second(var130);
                        final SubLObject var133 = conses_high.third(var130);
                        final SubLObject var134 = module0205.f13362(var10, var131, (SubLObject)module0259.UNPROVIDED);
                        if (!var134.equal(var132)) {
                            var127 = ConsesLow.nconc(var127, f16914(var134, var132, var2, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED));
                        }
                        if (!var133.equal(var124)) {
                            var127 = ConsesLow.nconc(var127, module0256.f16628(var133, var124, var2, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED));
                        }
                        return (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)ConsesLow.list(module0259.$ic156$, module0205.f13276(var10), var131, var132, var133), (SubLObject)module0259.$ic153$), var127);
                    }
                }
                var128 = var128.rest();
                var129 = var128.first();
            }
        }
        if (module0259.NIL == var127) {
            SubLObject var128 = module0226.f15011(var10, var2);
            SubLObject var129 = (SubLObject)module0259.NIL;
            var129 = var128.first();
            while (module0259.NIL == var127 && module0259.NIL != var128) {
                if (!var129.equal(var124)) {
                    var127 = module0256.f16628(var129, var124, var2, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                }
                if (module0259.NIL != var127 || var129.equal(var124)) {
                    final SubLObject var130 = module0226.f15027(var10, var124, var2, (SubLObject)module0259.UNPROVIDED).first();
                    if (var130.isCons()) {
                        final SubLObject var135 = var130.first().first();
                        final SubLObject var136 = conses_high.second(var130);
                        final SubLObject var137 = module0205.f13136(var135);
                        final SubLObject var138 = conses_high.third(var130);
                        final SubLObject var139 = conses_high.fourth(var130);
                        final SubLObject var140 = module0205.f13134(var135, var139, (SubLObject)module0259.UNPROVIDED);
                        if (!var140.equal(var124)) {
                            var127 = ConsesLow.nconc(var127, module0256.f16628(var140, var124, var2, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED));
                        }
                        return ConsesLow.append((SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)ConsesLow.list(module0259.$ic157$, module0205.f13276(var10), var136, var137, var138, var139), (SubLObject)module0259.$ic153$), reader.bq_cons(var135, (SubLObject)module0259.$ic153$)), var127);
                    }
                }
                var128 = var128.rest();
                var129 = var128.first();
            }
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16917(final SubLObject var1, final SubLObject var124, SubLObject var2, SubLObject var3, SubLObject var535) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        if (var535 == module0259.UNPROVIDED) {
            var535 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13572(var1) : var1;
        assert module0259.NIL != module0210.f13565(var124) : var124;
        if (module0259.NIL != module0210.f13598(var1)) {
            return f16918(var1, var124, var2);
        }
        SubLObject var536 = (SubLObject)module0259.NIL;
        var536 = module0254.f16496(module0137.f8955(module0259.$ic0$), var1, var124, var2, var3, var535);
        if (module0259.NIL == var536) {
            var536 = module0305.f20460(var1, var124, var2);
        }
        return var536;
    }
    
    public static SubLObject f16919(final SubLObject var1, final SubLObject var124, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        return f16917(var1, var124, var2, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
    }
    
    public static SubLObject f16918(final SubLObject var10, final SubLObject var124, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        final SubLObject var125 = module0205.f13330(var10);
        final SubLObject var126 = f16919(var125, var124, var2);
        if (module0259.NIL != var126) {
            return (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)ConsesLow.list(module0259.$ic152$, var125, var10), (SubLObject)module0259.$ic153$), var126);
        }
        SubLObject var127 = (SubLObject)module0259.NIL;
        if (module0259.NIL == var127) {
            SubLObject var128 = module0226.f15003(module0205.f13276(var10), var2);
            SubLObject var129 = (SubLObject)module0259.NIL;
            var129 = var128.first();
            while (module0259.NIL == var127 && module0259.NIL != var128) {
                var127 = module0256.f16630(var129, var124, var2, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                if (module0259.NIL != var127) {
                    return (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)ConsesLow.list(module0259.$ic154$, module0205.f13276(var10), var129), (SubLObject)module0259.$ic153$), var126);
                }
                var128 = var128.rest();
                var129 = var128.first();
            }
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16920(final SubLObject var124, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13565(var124) : var124;
        return f16921(var124, var2, var3);
    }
    
    public static SubLObject f16921(final SubLObject var124, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLThread var125 = SubLProcess.currentSubLThread();
        if (module0259.NIL != module0210.f13593(var124, (SubLObject)module0259.UNPROVIDED)) {
            return f16829(module0172.f10921(var124), var2, (SubLObject)module0259.UNPROVIDED);
        }
        final SubLObject var126 = module0137.f8955(module0259.$ic0$);
        SubLObject var127 = (SubLObject)module0259.NIL;
        final SubLObject var128 = var2;
        final SubLObject var129 = module0147.$g2095$.currentBinding(var125);
        final SubLObject var130 = module0147.$g2094$.currentBinding(var125);
        final SubLObject var131 = module0147.$g2096$.currentBinding(var125);
        try {
            module0147.$g2095$.bind(module0147.f9545(var128), var125);
            module0147.$g2094$.bind(module0147.f9546(var128), var125);
            module0147.$g2096$.bind(module0147.f9549(var128), var125);
            final SubLObject var132 = var3;
            final SubLObject var6_548 = module0141.$g1714$.currentBinding(var125);
            final SubLObject var7_549 = module0141.$g1715$.currentBinding(var125);
            try {
                module0141.$g1714$.bind((module0259.NIL != var132) ? var132 : module0141.f9283(), var125);
                module0141.$g1715$.bind((SubLObject)((module0259.NIL != var132) ? module0259.$ic30$ : module0141.$g1715$.getDynamicValue(var125)), var125);
                if (module0259.NIL != var132 && module0259.NIL != module0136.f8864() && module0259.NIL == module0141.f9279(var132)) {
                    final SubLObject var133 = module0136.$g1591$.getDynamicValue(var125);
                    if (var133.eql((SubLObject)module0259.$ic31$)) {
                        module0136.f8870((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic32$, var132, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                    }
                    else if (var133.eql((SubLObject)module0259.$ic34$)) {
                        module0136.f8871((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var132, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                    }
                    else if (var133.eql((SubLObject)module0259.$ic36$)) {
                        Errors.warn((SubLObject)module0259.$ic32$, var132, (SubLObject)module0259.$ic33$);
                    }
                    else {
                        Errors.warn((SubLObject)module0259.$ic37$, module0136.$g1591$.getDynamicValue(var125));
                        Errors.cerror((SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var132, (SubLObject)module0259.$ic33$);
                    }
                }
                final SubLObject var6_549 = module0141.$g1710$.currentBinding(var125);
                final SubLObject var7_550 = module0141.$g1677$.currentBinding(var125);
                final SubLObject var22_552 = module0138.$g1619$.currentBinding(var125);
                try {
                    module0141.$g1710$.bind(module0259.$ic11$, var125);
                    module0141.$g1677$.bind(module0141.f9210(), var125);
                    module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0259.UNPROVIDED)), var125);
                    final SubLObject var134 = module0139.f9036();
                    final SubLObject var6_550 = module0139.$g1635$.currentBinding(var125);
                    try {
                        module0139.$g1635$.bind((var134 == module0259.$ic38$) ? module0139.$g1635$.getDynamicValue(var125) : module0139.f9038(var134), var125);
                        final SubLObject var6_551 = module0139.$g1636$.currentBinding(var125);
                        try {
                            module0139.$g1636$.bind((var134 == module0259.$ic38$) ? module0139.$g1636$.getDynamicValue(var125) : module0139.f9038(var134), var125);
                            final SubLObject var6_552 = module0141.$g1685$.currentBinding(var125);
                            final SubLObject var7_551 = module0141.$g1686$.currentBinding(var125);
                            final SubLObject var22_553 = module0141.$g1683$.currentBinding(var125);
                            final SubLObject var135 = module0141.$g1684$.currentBinding(var125);
                            final SubLObject var136 = module0141.$g1674$.currentBinding(var125);
                            try {
                                module0141.$g1685$.bind((SubLObject)module0259.NIL, var125);
                                module0141.$g1686$.bind((SubLObject)module0259.NIL, var125);
                                module0141.$g1683$.bind((SubLObject)module0259.NIL, var125);
                                module0141.$g1684$.bind((SubLObject)module0259.NIL, var125);
                                module0141.$g1674$.bind((SubLObject)module0259.NIL, var125);
                                final SubLObject var137 = module0138.$g1626$.getGlobalValue();
                                SubLObject var138 = (SubLObject)module0259.NIL;
                                try {
                                    var138 = ReadWriteLocks.rw_lock_seize_read_lock(var137);
                                    final SubLObject var6_553 = module0141.$g1670$.currentBinding(var125);
                                    final SubLObject var7_552 = module0141.$g1671$.currentBinding(var125);
                                    final SubLObject var22_554 = module0141.$g1672$.currentBinding(var125);
                                    final SubLObject var23_561 = module0141.$g1674$.currentBinding(var125);
                                    final SubLObject var24_562 = module0137.$g1605$.currentBinding(var125);
                                    try {
                                        module0141.$g1670$.bind(var126, var125);
                                        module0141.$g1671$.bind(module0244.f15739(var126), var125);
                                        module0141.$g1672$.bind(module0244.f15746(var126), var125);
                                        module0141.$g1674$.bind((SubLObject)module0259.NIL, var125);
                                        module0137.$g1605$.bind(var126, var125);
                                        final SubLObject var139 = module0200.f12443(var126);
                                        SubLObject var140;
                                        SubLObject var141;
                                        SubLObject var6_554;
                                        SubLObject var7_553;
                                        SubLObject var142;
                                        SubLObject var143;
                                        SubLObject var144;
                                        SubLObject var145;
                                        SubLObject var55_565;
                                        SubLObject var146;
                                        SubLObject var6_555;
                                        SubLObject var54_567;
                                        SubLObject var60_568;
                                        SubLObject var147;
                                        SubLObject var6_556;
                                        SubLObject var148;
                                        SubLObject var149;
                                        SubLObject var150;
                                        SubLObject var151;
                                        SubLObject var152;
                                        SubLObject var153;
                                        SubLObject var154;
                                        SubLObject var155;
                                        SubLObject var156;
                                        SubLObject var158;
                                        SubLObject var157;
                                        SubLObject var159;
                                        SubLObject var171_572;
                                        SubLObject var173_573;
                                        SubLObject var6_557;
                                        SubLObject var6_558;
                                        SubLObject var160;
                                        SubLObject var68_576;
                                        SubLObject var161;
                                        SubLObject var47_577;
                                        SubLObject var162;
                                        SubLObject var6_559;
                                        SubLObject var164;
                                        SubLObject var163;
                                        SubLObject var165;
                                        SubLObject var166;
                                        SubLObject var167;
                                        SubLObject var168;
                                        SubLObject var169;
                                        SubLObject var170;
                                        for (var140 = (SubLObject)module0259.NIL, var140 = var139; module0259.NIL == var127 && module0259.NIL != var140; var140 = var140.rest()) {
                                            var141 = var140.first();
                                            var6_554 = module0137.$g1605$.currentBinding(var125);
                                            var7_553 = module0141.$g1674$.currentBinding(var125);
                                            try {
                                                module0137.$g1605$.bind(var141, var125);
                                                module0141.$g1674$.bind((SubLObject)((module0259.NIL != module0141.f9205((SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0259.NIL == module0141.$g1674$.getDynamicValue(var125)) : module0141.$g1674$.getDynamicValue(var125)), var125);
                                                var142 = module0228.f15229(var124);
                                                if (module0259.NIL != module0138.f8992(var142)) {
                                                    var143 = module0242.f15664(var142, module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                    if (module0259.NIL != var143) {
                                                        var144 = module0245.f15834(var143, module0138.f8979(), module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                        if (module0259.NIL != var144) {
                                                            for (var145 = module0066.f4838(module0067.f4891(var144)); module0259.NIL == var127 && module0259.NIL == module0066.f4841(var145); var145 = module0066.f4840(var145)) {
                                                                var125.resetMultipleValues();
                                                                var55_565 = module0066.f4839(var145);
                                                                var146 = var125.secondMultipleValue();
                                                                var125.resetMultipleValues();
                                                                if (module0259.NIL != module0147.f9507(var55_565)) {
                                                                    var6_555 = module0138.$g1623$.currentBinding(var125);
                                                                    try {
                                                                        module0138.$g1623$.bind(var55_565, var125);
                                                                        for (var54_567 = module0066.f4838(module0067.f4891(var146)); module0259.NIL == var127 && module0259.NIL == module0066.f4841(var54_567); var54_567 = module0066.f4840(var54_567)) {
                                                                            var125.resetMultipleValues();
                                                                            var60_568 = module0066.f4839(var54_567);
                                                                            var147 = var125.secondMultipleValue();
                                                                            var125.resetMultipleValues();
                                                                            if (module0259.NIL != module0141.f9289(var60_568)) {
                                                                                var6_556 = module0138.$g1624$.currentBinding(var125);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var60_568, var125);
                                                                                    var148 = var147;
                                                                                    if (module0259.NIL != module0077.f5302(var148)) {
                                                                                        var149 = module0077.f5333(var148);
                                                                                        for (var150 = module0032.f1741(var149), var151 = (SubLObject)module0259.NIL, var151 = module0032.f1742(var150, var149); module0259.NIL == var127 && module0259.NIL == module0032.f1744(var150, var151); var151 = module0032.f1743(var151)) {
                                                                                            var152 = module0032.f1745(var150, var151);
                                                                                            if (module0259.NIL != module0032.f1746(var151, var152) && module0259.NIL != var152) {
                                                                                                var127 = (SubLObject)module0259.T;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var148.isList()) {
                                                                                        if (module0259.NIL == var127) {
                                                                                            var153 = var148;
                                                                                            var154 = (SubLObject)module0259.NIL;
                                                                                            var154 = var153.first();
                                                                                            while (module0259.NIL == var127 && module0259.NIL != var153) {
                                                                                                if (module0259.NIL != var154) {
                                                                                                    var127 = (SubLObject)module0259.T;
                                                                                                }
                                                                                                var153 = var153.rest();
                                                                                                var154 = var153.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0259.$ic39$, var148);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_556, var125);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var54_567);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_555, var125);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var145);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0259.FIVE_INTEGER, (SubLObject)module0259.$ic40$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                                    }
                                                    if (module0259.NIL != module0200.f12419(var142, module0137.f8955((SubLObject)module0259.UNPROVIDED)) && module0259.NIL == var127) {
                                                        var155 = module0248.f15995(var142);
                                                        var156 = (SubLObject)module0259.NIL;
                                                        var156 = var155.first();
                                                        while (module0259.NIL == var127 && module0259.NIL != var155) {
                                                            var157 = (var158 = var156);
                                                            var159 = (SubLObject)module0259.NIL;
                                                            var171_572 = (SubLObject)module0259.NIL;
                                                            var173_573 = (SubLObject)module0259.NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var158, var157, (SubLObject)module0259.$ic116$);
                                                            var159 = var158.first();
                                                            var158 = var158.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var158, var157, (SubLObject)module0259.$ic116$);
                                                            var171_572 = var158.first();
                                                            var158 = var158.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var158, var157, (SubLObject)module0259.$ic116$);
                                                            var173_573 = var158.first();
                                                            var158 = var158.rest();
                                                            if (module0259.NIL == var158) {
                                                                if (module0259.NIL != module0147.f9507(var171_572)) {
                                                                    var6_557 = module0138.$g1623$.currentBinding(var125);
                                                                    try {
                                                                        module0138.$g1623$.bind(var171_572, var125);
                                                                        if (module0259.NIL != module0141.f9289(var173_573)) {
                                                                            var6_558 = module0138.$g1624$.currentBinding(var125);
                                                                            try {
                                                                                module0138.$g1624$.bind(var173_573, var125);
                                                                                var160 = (var148 = (SubLObject)ConsesLow.list(var159));
                                                                                if (module0259.NIL != module0077.f5302(var148)) {
                                                                                    var149 = module0077.f5333(var148);
                                                                                    for (var150 = module0032.f1741(var149), var151 = (SubLObject)module0259.NIL, var151 = module0032.f1742(var150, var149); module0259.NIL == var127 && module0259.NIL == module0032.f1744(var150, var151); var151 = module0032.f1743(var151)) {
                                                                                        var152 = module0032.f1745(var150, var151);
                                                                                        if (module0259.NIL != module0032.f1746(var151, var152) && module0259.NIL != var152) {
                                                                                            var127 = (SubLObject)module0259.T;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var148.isList()) {
                                                                                    if (module0259.NIL == var127) {
                                                                                        var68_576 = var148;
                                                                                        var154 = (SubLObject)module0259.NIL;
                                                                                        var154 = var68_576.first();
                                                                                        while (module0259.NIL == var127 && module0259.NIL != var68_576) {
                                                                                            if (module0259.NIL != var154) {
                                                                                                var127 = (SubLObject)module0259.T;
                                                                                            }
                                                                                            var68_576 = var68_576.rest();
                                                                                            var154 = var68_576.first();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0259.$ic39$, var148);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var6_558, var125);
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_557, var125);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var157, (SubLObject)module0259.$ic116$);
                                                            }
                                                            var155 = var155.rest();
                                                            var156 = var155.first();
                                                        }
                                                    }
                                                }
                                                else if (module0259.NIL != module0155.f9785(var142, (SubLObject)module0259.UNPROVIDED)) {
                                                    var161 = ((module0259.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var125), module0137.f8955((SubLObject)module0259.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var125), module0137.f8955((SubLObject)module0259.UNPROVIDED)));
                                                    for (var47_577 = (SubLObject)module0259.NIL, var47_577 = var161; module0259.NIL == var127 && module0259.NIL != var47_577; var47_577 = var47_577.rest()) {
                                                        var162 = var47_577.first();
                                                        var6_559 = module0138.$g1625$.currentBinding(var125);
                                                        try {
                                                            module0138.$g1625$.bind(var162, var125);
                                                            var163 = (var164 = Functions.funcall(var162, var142));
                                                            if (module0259.NIL != module0077.f5302(var164)) {
                                                                var165 = module0077.f5333(var164);
                                                                for (var166 = module0032.f1741(var165), var167 = (SubLObject)module0259.NIL, var167 = module0032.f1742(var166, var165); module0259.NIL == var127 && module0259.NIL == module0032.f1744(var166, var167); var167 = module0032.f1743(var167)) {
                                                                    var168 = module0032.f1745(var166, var167);
                                                                    if (module0259.NIL != module0032.f1746(var167, var168) && module0259.NIL != var168) {
                                                                        var127 = (SubLObject)module0259.T;
                                                                    }
                                                                }
                                                            }
                                                            else if (var164.isList()) {
                                                                if (module0259.NIL == var127) {
                                                                    var169 = var164;
                                                                    var170 = (SubLObject)module0259.NIL;
                                                                    var170 = var169.first();
                                                                    while (module0259.NIL == var127 && module0259.NIL != var169) {
                                                                        if (module0259.NIL != var170) {
                                                                            var127 = (SubLObject)module0259.T;
                                                                        }
                                                                        var169 = var169.rest();
                                                                        var170 = var169.first();
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0259.$ic39$, var164);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var6_559, var125);
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var7_553, var125);
                                                module0137.$g1605$.rebind(var6_554, var125);
                                            }
                                        }
                                    }
                                    finally {
                                        module0137.$g1605$.rebind(var24_562, var125);
                                        module0141.$g1674$.rebind(var23_561, var125);
                                        module0141.$g1672$.rebind(var22_554, var125);
                                        module0141.$g1671$.rebind(var7_552, var125);
                                        module0141.$g1670$.rebind(var6_553, var125);
                                    }
                                }
                                finally {
                                    if (module0259.NIL != var138) {
                                        ReadWriteLocks.rw_lock_release_read_lock(var137);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var136, var125);
                                module0141.$g1684$.rebind(var135, var125);
                                module0141.$g1683$.rebind(var22_553, var125);
                                module0141.$g1686$.rebind(var7_551, var125);
                                module0141.$g1685$.rebind(var6_552, var125);
                            }
                            if (var134 == module0259.$ic41$) {
                                module0139.f9012(module0139.$g1636$.getDynamicValue(var125));
                            }
                        }
                        finally {
                            module0139.$g1636$.rebind(var6_551, var125);
                        }
                        if (var134 == module0259.$ic41$) {
                            module0139.f9012(module0139.$g1635$.getDynamicValue(var125));
                        }
                    }
                    finally {
                        module0139.$g1635$.rebind(var6_550, var125);
                    }
                }
                finally {
                    module0138.$g1619$.rebind(var22_552, var125);
                    module0141.$g1677$.rebind(var7_550, var125);
                    module0141.$g1710$.rebind(var6_549, var125);
                }
            }
            finally {
                module0141.$g1715$.rebind(var7_549, var125);
                module0141.$g1714$.rebind(var6_548, var125);
            }
        }
        finally {
            module0147.$g2096$.rebind(var131, var125);
            module0147.$g2094$.rebind(var130, var125);
            module0147.$g2095$.rebind(var129, var125);
        }
        return var127;
    }
    
    public static SubLObject f16922(final SubLObject var579, final SubLObject var124, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        SubLObject var580 = (SubLObject)module0259.NIL;
        SubLObject var581 = var579;
        SubLObject var582 = (SubLObject)module0259.NIL;
        var582 = var581.first();
        while (module0259.NIL != var581) {
            if (module0259.NIL != module0138.f8992(var582) && module0259.NIL != f16854(var582, var124, var2, var3)) {
                var580 = (SubLObject)ConsesLow.cons(var582, var580);
            }
            var581 = var581.rest();
            var582 = var581.first();
        }
        return Sequences.nreverse(var580);
    }
    
    public static SubLObject f16923(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0259.NIL;
        final SubLObject var4 = module0141.$g1691$.currentBinding(var2);
        try {
            module0141.$g1691$.bind(f16924(var1), var2);
            f16852((SubLObject)module0259.$ic162$, var1, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
            var3 = module0035.f2272(module0141.$g1691$.getDynamicValue(var2));
        }
        finally {
            module0141.$g1691$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f16925(final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        module0141.$g1691$.setDynamicValue(ConsesLow.nconc(module0141.$g1691$.getDynamicValue(var125), module0256.f16655(var124)), var125);
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16926(final SubLObject var124, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0259.NIL != module0305.f20485(var124) || module0259.NIL != module0305.f20569(var124, var2));
    }
    
    public static SubLObject f16927(final SubLObject var124, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0173.f10955(var124) : var124;
        if (module0259.NIL != var2 && !module0259.areAssertionsDisabledFor(me) && module0259.NIL == module0161.f10481(var2)) {
            throw new AssertionError(var2);
        }
        if (module0259.NIL != module0268.f17603(var124)) {
            return module0035.f2099(module0269.f17703(var124));
        }
        if (module0259.$ic164$.eql(var124)) {
            return module0173.f10963();
        }
        if (module0549.f33895(var124).numG(Numbers.integerDivide(module0173.f10962(), module0259.$g2504$.getGlobalValue()))) {
            SubLObject var125;
            SubLObject var126;
            for (var125 = (SubLObject)module0259.NIL; module0259.NIL == var125; var125 = var126) {
                var126 = module0173.f10963();
                if (module0259.NIL != f16854(var126, var124, var2, (SubLObject)module0259.UNPROVIDED)) {}
            }
            return var125;
        }
        final SubLObject var127 = f16846(var124, var2, (SubLObject)module0259.UNPROVIDED);
        return module0035.f2099(var127);
    }
    
    public static SubLObject f16928(final SubLObject var125, SubLObject var583, SubLObject var2, SubLObject var3) {
        if (var583 == module0259.UNPROVIDED) {
            var583 = (SubLObject)module0259.NIL;
        }
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        return module0252.f16314(module0137.f8955(module0259.$ic0$), var125, var583, var2, var3);
    }
    
    public static SubLObject f16929(final SubLObject var125, SubLObject var583, SubLObject var2, SubLObject var3) {
        if (var583 == module0259.UNPROVIDED) {
            var583 = (SubLObject)module0259.NIL;
        }
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        return f16928(var125, var583, var2, var3);
    }
    
    public static SubLObject f16930(final SubLObject var125, SubLObject var583, SubLObject var2) {
        if (var583 == module0259.UNPROVIDED) {
            var583 = (SubLObject)module0259.NIL;
        }
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        final SubLObject var584 = (SubLObject)module0259.NIL;
        return var584;
    }
    
    public static SubLObject f16931(final SubLObject var1, final SubLObject var124, final SubLObject var2) {
        return module0262.f17327(var2, f16932(var1, var124, (SubLObject)module0259.UNPROVIDED), (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
    }
    
    public static SubLObject f16932(final SubLObject var1, final SubLObject var124, SubLObject var3) {
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13572(var1) : var1;
        assert module0259.NIL != module0210.f13565(var124) : var124;
        SubLObject var125 = (SubLObject)module0259.NIL;
        var125 = module0262.f17379(f16933(var1, var124, var3));
        return var125;
    }
    
    public static SubLObject f16933(final SubLObject var1, final SubLObject var124, SubLObject var3) {
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        if (module0259.NIL != module0206.f13467(var1)) {
            final SubLObject var125 = module0285.f18933(var1, (SubLObject)module0259.UNPROVIDED);
            if (module0259.NIL != var125) {
                return f16934(var125, var124, var3);
            }
        }
        else {
            if (module0259.NIL == module0210.f13598(var1)) {
                final SubLObject var126 = module0253.f16440(module0137.f8955(module0259.$ic0$), var1, var124, var3);
                SubLObject var127 = (SubLObject)module0259.NIL;
                if (module0259.NIL != module0305.f20485(var124)) {
                    var127 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0259.$ic168$), module0305.f20450(var1, var124));
                }
                return ConsesLow.nconc(var126, var127);
            }
            final SubLObject var126 = f16935(var1, var124);
            if (module0259.NIL != var126) {
                return var126;
            }
            if (module0259.NIL != module0305.f20485(var124)) {
                return Mapping.mapcar(Symbols.symbol_function((SubLObject)module0259.$ic168$), module0305.f20450(var1, var124));
            }
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16935(final SubLObject var10, final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        final SubLObject var126 = module0205.f13330(var10);
        if (module0259.NIL != var126) {
            return f16933(var126, var124, (SubLObject)module0259.UNPROVIDED);
        }
        SubLObject var127 = (SubLObject)module0259.NIL;
        SubLObject var128 = module0018.$g587$.currentBinding(var125);
        SubLObject var129 = module0018.$g590$.currentBinding(var125);
        final SubLObject var130 = module0018.$g584$.currentBinding(var125);
        try {
            module0018.$g587$.bind(var124, var125);
            module0018.$g590$.bind((SubLObject)module0259.TWO_INTEGER, var125);
            module0018.$g584$.bind((SubLObject)module0259.NIL, var125);
            final SubLObject var6_589 = module0147.$g2094$.currentBinding(var125);
            final SubLObject var7_590 = module0147.$g2095$.currentBinding(var125);
            try {
                module0147.$g2094$.bind((SubLObject)module0259.$ic54$, var125);
                module0147.$g2095$.bind(module0259.$ic55$, var125);
                module0219.f14477(Symbols.symbol_function((SubLObject)module0259.$ic169$), module0205.f13276(var10), (SubLObject)module0259.ONE_INTEGER, module0259.$ic154$, (SubLObject)module0259.$ic170$, (SubLObject)module0259.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var7_590, var125);
                module0147.$g2094$.rebind(var6_589, var125);
            }
            var127 = module0018.$g584$.getDynamicValue(var125);
        }
        finally {
            module0018.$g584$.rebind(var130, var125);
            module0018.$g590$.rebind(var129, var125);
            module0018.$g587$.rebind(var128, var125);
        }
        var128 = module0018.$g590$.currentBinding(var125);
        var129 = module0018.$g584$.currentBinding(var125);
        try {
            module0018.$g590$.bind((SubLObject)module0259.TWO_INTEGER, var125);
            module0018.$g584$.bind(Hashtables.make_hash_table(module0202.f12725(var10, (SubLObject)module0259.UNPROVIDED), (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED), var125);
            final SubLObject var6_590 = module0147.$g2094$.currentBinding(var125);
            final SubLObject var7_591 = module0147.$g2095$.currentBinding(var125);
            try {
                module0147.$g2094$.bind((SubLObject)module0259.$ic54$, var125);
                module0147.$g2095$.bind(module0259.$ic55$, var125);
                module0219.f14477(Symbols.symbol_function((SubLObject)module0259.$ic171$), module0205.f13276(var10), (SubLObject)module0259.ONE_INTEGER, module0259.$ic155$, (SubLObject)module0259.$ic170$, (SubLObject)module0259.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var7_591, var125);
                module0147.$g2094$.rebind(var6_590, var125);
            }
            final SubLObject var131 = module0018.$g584$.getDynamicValue(var125);
            SubLObject var132 = (SubLObject)module0259.NIL;
            SubLObject var133 = (SubLObject)module0259.NIL;
            final Iterator var134 = Hashtables.getEntrySetIterator(var131);
            try {
                while (Hashtables.iteratorHasNext(var134)) {
                    final Map.Entry var135 = Hashtables.iteratorNextEntry(var134);
                    var132 = Hashtables.getEntryKey(var135);
                    var133 = Hashtables.getEntryValue(var135);
                    final SubLObject var136 = module0205.f13134(var10, var132, (SubLObject)module0259.UNPROVIDED);
                    SubLObject var137 = module0256.f16652(var136, var124, (SubLObject)module0259.UNPROVIDED);
                    SubLObject var138 = (SubLObject)module0259.NIL;
                    var138 = var137.first();
                    while (module0259.NIL != var137) {
                        if (module0259.NIL != var138) {
                            SubLObject var12_599 = var133;
                            SubLObject var139 = (SubLObject)module0259.NIL;
                            var139 = var12_599.first();
                            while (module0259.NIL != var12_599) {
                                final SubLObject var140 = module0262.f17364(conses_high.adjoin(var139, var138, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED), (SubLObject)module0259.UNPROVIDED);
                                if (module0259.NIL != var140) {
                                    final SubLObject var141 = var140;
                                    if (module0259.NIL == conses_high.member(var141, var127, Symbols.symbol_function((SubLObject)module0259.$ic172$), Symbols.symbol_function((SubLObject)module0259.IDENTITY))) {
                                        var127 = (SubLObject)ConsesLow.cons(var141, var127);
                                    }
                                }
                                var12_599 = var12_599.rest();
                                var139 = var12_599.first();
                            }
                        }
                        var137 = var137.rest();
                        var138 = var137.first();
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var134);
            }
        }
        finally {
            module0018.$g584$.rebind(var129, var125);
            module0018.$g590$.rebind(var128, var125);
        }
        return var127;
    }
    
    public static SubLObject f16934(final SubLObject var1, final SubLObject var124, SubLObject var3) {
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        if (module0259.NIL == module0210.f13598(var1)) {
            final SubLObject var125 = module0253.f16440(module0137.f8955(module0259.$ic122$), var1, var124, var3);
            SubLObject var126 = (SubLObject)module0259.NIL;
            if (module0259.NIL != module0305.f20523(var124)) {
                var126 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0259.$ic168$), module0305.f20453(var1, var124));
            }
            return ConsesLow.nconc(var125, var126);
        }
        final SubLObject var127 = f16936(var1, var124);
        if (module0259.NIL != var127) {
            return var127;
        }
        if (module0259.NIL != module0305.f20523(var124)) {
            return Mapping.mapcar(Symbols.symbol_function((SubLObject)module0259.$ic168$), module0305.f20453(var1, var124));
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16936(final SubLObject var10, final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        final SubLObject var126 = module0205.f13330(var10);
        if (module0259.NIL != var126) {
            return f16934(var126, var124, (SubLObject)module0259.UNPROVIDED);
        }
        SubLObject var127 = (SubLObject)module0259.NIL;
        SubLObject var128 = module0018.$g587$.currentBinding(var125);
        SubLObject var129 = module0018.$g590$.currentBinding(var125);
        SubLObject var130 = module0018.$g584$.currentBinding(var125);
        try {
            module0018.$g587$.bind(var124, var125);
            module0018.$g590$.bind((SubLObject)module0259.TWO_INTEGER, var125);
            module0018.$g584$.bind((SubLObject)module0259.NIL, var125);
            final SubLObject var6_603 = module0147.$g2094$.currentBinding(var125);
            final SubLObject var7_604 = module0147.$g2095$.currentBinding(var125);
            try {
                module0147.$g2094$.bind((SubLObject)module0259.$ic54$, var125);
                module0147.$g2095$.bind(module0259.$ic55$, var125);
                module0219.f14477(Symbols.symbol_function((SubLObject)module0259.$ic169$), module0205.f13276(var10), (SubLObject)module0259.ONE_INTEGER, module0259.$ic173$, (SubLObject)module0259.$ic170$, (SubLObject)module0259.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var7_604, var125);
                module0147.$g2094$.rebind(var6_603, var125);
            }
            var127 = module0018.$g584$.getDynamicValue(var125);
        }
        finally {
            module0018.$g584$.rebind(var130, var125);
            module0018.$g590$.rebind(var129, var125);
            module0018.$g587$.rebind(var128, var125);
        }
        var128 = module0018.$g587$.currentBinding(var125);
        var129 = module0018.$g590$.currentBinding(var125);
        var130 = module0018.$g584$.currentBinding(var125);
        try {
            module0018.$g587$.bind(var124, var125);
            module0018.$g590$.bind((SubLObject)module0259.TWO_INTEGER, var125);
            module0018.$g584$.bind((SubLObject)module0259.NIL, var125);
            final SubLObject var6_604 = module0147.$g2094$.currentBinding(var125);
            final SubLObject var7_605 = module0147.$g2095$.currentBinding(var125);
            try {
                module0147.$g2094$.bind((SubLObject)module0259.$ic54$, var125);
                module0147.$g2095$.bind(module0259.$ic55$, var125);
                module0219.f14477(Symbols.symbol_function((SubLObject)module0259.$ic169$), module0205.f13276(var10), (SubLObject)module0259.ONE_INTEGER, module0259.$ic174$, (SubLObject)module0259.$ic170$, (SubLObject)module0259.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var7_605, var125);
                module0147.$g2094$.rebind(var6_604, var125);
            }
            final SubLObject var131 = var127;
            if (module0259.NIL == conses_high.member(var131, module0018.$g584$.getDynamicValue(var125), Symbols.symbol_function((SubLObject)module0259.$ic172$), Symbols.symbol_function((SubLObject)module0259.IDENTITY))) {
                module0018.$g584$.setDynamicValue((SubLObject)ConsesLow.cons(var131, module0018.$g584$.getDynamicValue(var125)), var125);
            }
        }
        finally {
            module0018.$g584$.rebind(var130, var125);
            module0018.$g590$.rebind(var129, var125);
            module0018.$g587$.rebind(var128, var125);
        }
        return var127;
    }
    
    public static SubLObject f16937(final SubLObject var607) {
        final SubLThread var608 = SubLProcess.currentSubLThread();
        final SubLObject var609 = module0178.f11331(var607, module0018.$g590$.getDynamicValue(var608));
        final SubLObject var610 = module0178.f11287(var607);
        if (module0259.NIL != module0173.f10955(var609)) {
            SubLObject var611 = module0253.f16440(module0137.f8955(module0259.$ic44$), var609, module0018.$g587$.getDynamicValue(var608), (SubLObject)module0259.UNPROVIDED);
            SubLObject var612 = (SubLObject)module0259.NIL;
            var612 = var611.first();
            while (module0259.NIL != var611) {
                if (module0259.NIL != var612) {
                    final SubLObject var613 = module0262.f17364(conses_high.adjoin(var610, var612, Symbols.symbol_function((SubLObject)module0259.$ic175$), (SubLObject)module0259.UNPROVIDED), (SubLObject)module0259.UNPROVIDED);
                    if (module0259.NIL != var613) {
                        final SubLObject var614 = var613;
                        if (module0259.NIL == conses_high.member(var614, module0018.$g584$.getDynamicValue(var608), Symbols.symbol_function((SubLObject)module0259.$ic172$), Symbols.symbol_function((SubLObject)module0259.IDENTITY))) {
                            module0018.$g584$.setDynamicValue((SubLObject)ConsesLow.cons(var614, module0018.$g584$.getDynamicValue(var608)), var608);
                        }
                    }
                }
                var611 = var611.rest();
                var612 = var611.first();
            }
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16938(final SubLObject var607) {
        final SubLThread var608 = SubLProcess.currentSubLThread();
        if (module0259.NIL != module0178.f11284(var607)) {
            module0030.f1599(module0178.f11331(var607, module0018.$g590$.getDynamicValue(var608)), module0178.f11287(var607), module0018.$g584$.getDynamicValue(var608));
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16939(final SubLObject var1, final SubLObject var609, SubLObject var3) {
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        return module0253.f16449(module0137.f8955(module0259.$ic0$), var609, var1, var3);
    }
    
    public static SubLObject f16940(final SubLObject var1, final SubLObject var609, SubLObject var3) {
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        return module0253.f16443(module0137.f8955(module0259.$ic0$), var609, var1, var3);
    }
    
    public static SubLObject f16941(final SubLObject var1, final SubLObject var610, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (module0259.NIL != module0173.f10955(var610)) {
            return f16854(var1, var610, var2, (SubLObject)module0259.UNPROVIDED);
        }
        if (module0259.NIL != f16942(var610)) {
            return f16943(var1, var610);
        }
        if (module0259.NIL != module0202.f12685(var610)) {
            return module0256.f16576(var1, module0202.f12686(var610), (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16944(final SubLObject var610, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (module0259.NIL != module0173.f10955(var610)) {
            return f16829(var610, var2, (SubLObject)module0259.UNPROVIDED);
        }
        if (module0259.NIL != f16942(var610)) {
            return f16945(var610);
        }
        if (module0259.NIL != module0202.f12685(var610)) {
            return module0256.f16539(module0202.f12686(var610), var2, (SubLObject)module0259.UNPROVIDED);
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16946(final SubLObject var610, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (module0259.NIL != module0173.f10955(var610)) {
            return f16846(var610, var2, (SubLObject)module0259.UNPROVIDED);
        }
        if (module0259.NIL != f16942(var610)) {
            return f16945(var610);
        }
        if (module0259.NIL != module0202.f12685(var610)) {
            return module0256.f16552(module0202.f12686(var610), var2, (SubLObject)module0259.UNPROVIDED);
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16947(final SubLObject var610, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0226.f14815(var610) : var610;
        if (module0259.NIL != module0173.f10955(var610)) {
            return f16927(var610, var2);
        }
        if (module0259.NIL != f16942(var610)) {
            return f16948(var610);
        }
        if (module0259.NIL != module0202.f12685(var610)) {
            return module0256.f16618(module0202.f12686(var610), var2);
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16942(final SubLObject var611) {
        return module0205.f13374(var611, module0259.$ic177$);
    }
    
    public static SubLObject f16943(final SubLObject var1, final SubLObject var610) {
        return module0004.f104(var1, module0205.f13304(var610, (SubLObject)module0259.UNPROVIDED), Symbols.symbol_function((SubLObject)module0259.EQUAL), (SubLObject)module0259.UNPROVIDED);
    }
    
    public static SubLObject f16945(final SubLObject var610) {
        return module0205.f13304(var610, (SubLObject)module0259.UNPROVIDED);
    }
    
    public static SubLObject f16948(final SubLObject var610) {
        return module0035.f2099(f16945(var610));
    }
    
    public static SubLObject f16949(final SubLObject var580) {
        return module0226.f15062(var580, module0259.$ic0$, (SubLObject)module0259.UNPROVIDED);
    }
    
    public static SubLObject f16924(final SubLObject var580) {
        return module0226.f15062(var580, module0259.$ic0$, (SubLObject)module0259.$ic178$);
    }
    
    public static SubLObject f16950(final SubLObject var580) {
        return f16924(var580);
    }
    
    public static SubLObject f16951(final SubLObject var1, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        return module0248.f16006(module0137.f8955(module0259.$ic0$), var1, var2);
    }
    
    public static SubLObject f16952(final SubLObject var1, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        return module0248.f16007(module0137.f8955(module0259.$ic0$), var1, var2);
    }
    
    public static SubLObject f16953(final SubLObject var1, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        return module0248.f16008(module0137.f8955(module0259.$ic0$), var1, var2);
    }
    
    public static SubLObject f16954(final SubLObject var1, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        return module0248.f16011(module0137.f8955(module0259.$ic0$), var1, var2);
    }
    
    public static SubLObject f16955(final SubLObject var1, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        return module0248.f16012(module0137.f8955(module0259.$ic0$), var1, var2);
    }
    
    public static SubLObject f16956(final SubLObject var1, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        return module0248.f16009(module0137.f8955(module0259.$ic0$), var1, var2);
    }
    
    public static SubLObject f16957(final SubLObject var1, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        return module0248.f16010(module0137.f8955(module0259.$ic0$), var1, var2);
    }
    
    public static SubLObject f16958(final SubLObject var1, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        return module0248.f16013(module0137.f8955(module0259.$ic0$), var1, var2);
    }
    
    public static SubLObject f16959(final SubLObject var1, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        return module0248.f16014(module0137.f8955(module0259.$ic0$), var1, var2);
    }
    
    public static SubLObject f16960(final SubLObject var608, final SubLObject var607) {
        return f16961(var608, var607);
    }
    
    public static SubLObject f16961(final SubLObject var608, final SubLObject var607) {
        module0248.f15957(var608, var607, module0137.f8955(module0259.$ic0$));
        module0268.f17665(var607);
        module0345.f23239(var608, var607);
        f16962(var607);
        f16963(var607);
        module0248.f15996(var607);
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16962(final SubLObject var607) {
        if (module0259.NIL != module0211.f13635(var607)) {
            final SubLObject var608 = module0538.f33478(var607, (SubLObject)module0259.UNPROVIDED);
            SubLObject var610;
            final SubLObject var609 = var610 = var608;
            SubLObject var611 = (SubLObject)module0259.NIL;
            SubLObject var612 = (SubLObject)module0259.NIL;
            SubLObject var613 = (SubLObject)module0259.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var610, var609, (SubLObject)module0259.$ic181$);
            var611 = var610.first();
            var610 = var610.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var610, var609, (SubLObject)module0259.$ic181$);
            var612 = var610.first();
            var610 = var610.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var610, var609, (SubLObject)module0259.$ic181$);
            var613 = var610.first();
            var610 = var610.rest();
            if (module0259.NIL == var610) {
                if (var611.eql(module0259.$ic0$) && module0259.NIL != module0202.f12589(var613, module0259.$ic182$)) {
                    SubLObject var620_621;
                    final SubLObject var618_619 = var620_621 = var613;
                    SubLObject var614 = (SubLObject)module0259.NIL;
                    SubLObject var615 = (SubLObject)module0259.NIL;
                    SubLObject var616 = (SubLObject)module0259.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var620_621, var618_619, (SubLObject)module0259.$ic183$);
                    var614 = var620_621.first();
                    var620_621 = var620_621.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var620_621, var618_619, (SubLObject)module0259.$ic183$);
                    var615 = var620_621.first();
                    var620_621 = var620_621.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var620_621, var618_619, (SubLObject)module0259.$ic183$);
                    var616 = var620_621.first();
                    var620_621 = var620_621.rest();
                    if (module0259.NIL == var620_621) {
                        f16964(var616, var612, var607);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var618_619, (SubLObject)module0259.$ic183$);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var609, (SubLObject)module0259.$ic181$);
            }
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16963(final SubLObject var607) {
        if (module0259.NIL != module0211.f13635(var607)) {
            final SubLObject var608 = module0538.f33478(var607, (SubLObject)module0259.UNPROVIDED);
            SubLObject var610;
            final SubLObject var609 = var610 = var608;
            SubLObject var611 = (SubLObject)module0259.NIL;
            SubLObject var612 = (SubLObject)module0259.NIL;
            SubLObject var613 = (SubLObject)module0259.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var610, var609, (SubLObject)module0259.$ic184$);
            var611 = var610.first();
            var610 = var610.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var610, var609, (SubLObject)module0259.$ic184$);
            var612 = var610.first();
            var610 = var610.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var610, var609, (SubLObject)module0259.$ic184$);
            var613 = var610.first();
            var610 = var610.rest();
            if (module0259.NIL == var610) {
                if (var611.eql(module0259.$ic0$) && module0259.NIL != module0202.f12589(var613, module0259.$ic185$)) {
                    f16964(var613, var612, var607);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var609, (SubLObject)module0259.$ic184$);
            }
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16964(final SubLObject var623, final SubLObject var1, final SubLObject var607) {
        SubLObject var624 = (SubLObject)module0259.NIL;
        SubLObject var625 = (SubLObject)module0259.NIL;
        SubLObject var626 = (SubLObject)module0259.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var623, var623, (SubLObject)module0259.$ic186$);
        var624 = var623.first();
        SubLObject var627 = var623.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var627, var623, (SubLObject)module0259.$ic186$);
        var625 = var627.first();
        var627 = var627.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var627, var623, (SubLObject)module0259.$ic186$);
        var626 = var627.first();
        var627 = var627.rest();
        if (module0259.NIL == var627) {
            final SubLObject var628 = module0205.f13250(var1, var625, var626, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
            final SubLObject var629 = module0178.f11287(var607);
            module0538.f33372(var628, var629, (SubLObject)ConsesLow.list(var607), (SubLObject)module0259.$ic187$, (SubLObject)module0259.T);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var623, (SubLObject)module0259.$ic186$);
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16965(final SubLObject var608, final SubLObject var607) {
        return f16966(var608, var607);
    }
    
    public static SubLObject f16966(final SubLObject var608, final SubLObject var607) {
        module0248.f15962(var608, var607, module0137.f8955(module0259.$ic0$));
        module0268.f17676(var607);
        module0248.f15997(var607);
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16967() {
        module0248.f16004(module0137.f8955(module0259.$ic0$));
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16968(final SubLObject var530) {
        final SubLThread var531 = SubLProcess.currentSubLThread();
        final SubLObject var532 = module0141.$g1670$.currentBinding(var531);
        final SubLObject var533 = module0141.$g1671$.currentBinding(var531);
        final SubLObject var534 = module0141.$g1672$.currentBinding(var531);
        final SubLObject var535 = module0141.$g1674$.currentBinding(var531);
        final SubLObject var536 = module0137.$g1605$.currentBinding(var531);
        try {
            module0141.$g1670$.bind(module0137.f8955(module0259.$ic0$), var531);
            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0259.$ic0$)), var531);
            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0259.$ic0$)), var531);
            module0141.$g1674$.bind((SubLObject)module0259.NIL, var531);
            module0137.$g1605$.bind(module0137.f8955(module0259.$ic0$), var531);
            SubLObject var537 = module0248.f15925(module0137.f8955(module0259.$ic0$), var530);
            SubLObject var538 = (SubLObject)module0259.NIL;
            var538 = var537.first();
            while (module0259.NIL != var537) {
                module0248.f15999(var530, var538, (SubLObject)module0259.UNPROVIDED);
                var537 = var537.rest();
                var538 = var537.first();
            }
        }
        finally {
            module0137.$g1605$.rebind(var536, var531);
            module0141.$g1674$.rebind(var535, var531);
            module0141.$g1672$.rebind(var534, var531);
            module0141.$g1671$.rebind(var533, var531);
            module0141.$g1670$.rebind(var532, var531);
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16969(final SubLObject var530) {
        final SubLObject var531 = f16949(var530);
        f16968(var530);
        SubLObject var532 = var531;
        SubLObject var533 = (SubLObject)module0259.NIL;
        var533 = var532.first();
        while (module0259.NIL != var532) {
            f16970(var530, var533);
            var532 = var532.rest();
            var533 = var532.first();
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16970(final SubLObject var530, final SubLObject var2) {
        module0248.f15951(var530, var2, module0137.f8955(module0259.$ic0$));
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16971(SubLObject var632) {
        if (var632 == module0259.UNPROVIDED) {
            var632 = (SubLObject)module0259.T;
        }
        if (module0259.NIL != var632) {
            f16967();
        }
        module0248.f15952(module0137.f8955(module0259.$ic0$));
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16972(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        SubLObject var4 = module0248.f15931(module0137.f8955(module0259.$ic122$), var1, var2, var3, (SubLObject)module0259.UNPROVIDED);
        if (module0259.NIL != module0248.f15974(var1)) {
            var4 = module0035.f2269(ConsesLow.nconc(module0248.f15978(var1, var2, var3), var4), (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
        }
        return var4;
    }
    
    public static SubLObject f16973(final SubLObject var8, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLObject var9 = module0172.f10921(var8);
        if (module0259.NIL != module0167.f10813(var9)) {
            return f16972(var9, var2, var3);
        }
        final SubLObject var10 = module0205.f13276(var8);
        return ConsesLow.nconc(module0226.f14993(var10, var2), module0226.f14996(var10, var2));
    }
    
    public static SubLObject f16974(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        return module0248.f15932(module0137.f8955(module0259.$ic122$), var1, var2, var3, (SubLObject)module0259.UNPROVIDED);
    }
    
    public static SubLObject f16975(final SubLObject var1, final SubLObject var124, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13565(var124) : var124;
        return (SubLObject)SubLObjectFactory.makeBoolean(module0259.NIL != module0252.f16343(module0137.f8955(module0259.$ic122$), var1, var124, var2, var3) || module0259.NIL != ((module0259.NIL != module0248.f15974(var1)) ? module0256.f16604(var124, module0248.f15978(var1, var2, var3), var2, var3) : module0259.NIL));
    }
    
    public static SubLObject f16976(final SubLObject var1, final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        SubLObject var126 = (SubLObject)module0259.NIL;
        final SubLObject var127 = module0147.$g2094$.currentBinding(var125);
        final SubLObject var128 = module0147.$g2095$.currentBinding(var125);
        try {
            module0147.$g2094$.bind((SubLObject)module0259.$ic54$, var125);
            module0147.$g2095$.bind(module0259.$ic55$, var125);
            var126 = f16975(var1, var124, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var128, var125);
            module0147.$g2094$.rebind(var127, var125);
        }
        return var126;
    }
    
    public static SubLObject f16977(final SubLObject var1, final SubLObject var127, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13572(var1) : var1;
        assert module0259.NIL != Types.listp(var127) : var127;
        if (module0259.NIL == var127) {
            return (SubLObject)module0259.NIL;
        }
        if (module0259.NIL != module0035.f1997(var127)) {
            return f16975(var1, var127.first(), var2, var3);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0259.NIL != module0252.f16352(module0137.f8955(module0259.$ic122$), var1, var127, var2, var3) || module0259.NIL != ((module0259.NIL != module0248.f15974(var1)) ? module0256.f16609(module0248.f15978(var1, var2, var3), var127, var2, var3) : module0259.NIL));
    }
    
    public static SubLObject f16978(final SubLObject var1, final SubLObject var127, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13572(var1) : var1;
        assert module0259.NIL != Types.listp(var127) : var127;
        return f16977(var1, var127, var2, var3);
    }
    
    public static SubLObject f16979(final SubLObject var1, final SubLObject var127, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13572(var1) : var1;
        assert module0259.NIL != Types.listp(var127) : var127;
        if (module0259.NIL == var127) {
            return (SubLObject)module0259.T;
        }
        if (module0259.NIL != module0035.f1997(var127)) {
            return f16975(var1, var127.first(), var2, var3);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0259.NIL != module0252.f16358(module0137.f8955(module0259.$ic122$), var1, var127, var2, var3) || module0259.NIL != ((module0259.NIL != module0248.f15974(var1)) ? module0256.f16610(module0248.f15978(var1, var2, var3), var127, var2, var3) : module0259.NIL));
    }
    
    public static SubLObject f16980(final SubLObject var1, final SubLObject var124, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13572(var1) : var1;
        assert module0259.NIL != module0210.f13565(var124) : var124;
        return (SubLObject)SubLObjectFactory.makeBoolean(module0259.NIL != f16981(var1, var124, var2, var3) || module0259.NIL != f16982(var1, var124, var2, var3));
    }
    
    public static SubLObject f16982(final SubLObject var1, final SubLObject var124, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        return module0254.f16488(module0137.f8955(module0259.$ic122$), var1, var124, var2, var3);
    }
    
    public static SubLObject f16981(final SubLObject var1, final SubLObject var124, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        if (module0259.NIL != module0226.f14858(var124, var2)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0259.NIL == f16975(var1, var124, var2, var3));
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16983(final SubLObject var14, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = module0259.$ic11$;
        }
        assert module0259.NIL != module0210.f13565(var14) : var14;
        return module0248.f15933(module0137.f8955(module0259.$ic122$), var14, var2, var3, (SubLObject)module0259.UNPROVIDED);
    }
    
    public static SubLObject f16984(final SubLObject var126, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != Types.listp(var126) : var126;
        if (module0259.NIL == var126) {
            return (SubLObject)module0259.NIL;
        }
        if (module0259.NIL != module0035.f1997(var126)) {
            return f16985(var126.first(), var2, var3);
        }
        return module0252.f16254(module0137.f8955(module0259.$ic122$), var126, var2, var3);
    }
    
    public static SubLObject f16986(final SubLObject var132, final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != Types.function_spec_p(var132) : var132;
        assert module0259.NIL != module0210.f13572(var1) : var1;
        module0252.f16269(module0137.f8955(module0259.$ic122$), var1, var132, var2, var3);
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16987(final SubLObject var132, final SubLObject var14, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        module0252.f16272(module0137.f8955(module0259.$ic122$), var14, var132, var2, var3);
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16988(final SubLObject var20, final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = module0137.f8955(module0259.$ic122$);
        final SubLObject var23 = module0141.$g1670$.currentBinding(var21);
        final SubLObject var24 = module0141.$g1671$.currentBinding(var21);
        final SubLObject var25 = module0141.$g1672$.currentBinding(var21);
        final SubLObject var26 = module0141.$g1674$.currentBinding(var21);
        final SubLObject var27 = module0137.$g1605$.currentBinding(var21);
        try {
            module0141.$g1670$.bind(var22, var21);
            module0141.$g1671$.bind(module0244.f15739(var22), var21);
            module0141.$g1672$.bind(module0244.f15746(var22), var21);
            module0141.$g1674$.bind((SubLObject)module0259.NIL, var21);
            module0137.$g1605$.bind(var22, var21);
            final SubLObject var28 = var2;
            final SubLObject var6_635 = module0147.$g2095$.currentBinding(var21);
            final SubLObject var7_636 = module0147.$g2094$.currentBinding(var21);
            final SubLObject var22_637 = module0147.$g2096$.currentBinding(var21);
            try {
                module0147.$g2095$.bind(module0147.f9545(var28), var21);
                module0147.$g2094$.bind(module0147.f9546(var28), var21);
                module0147.$g2096$.bind(module0147.f9549(var28), var21);
                final SubLObject var29 = var3;
                final SubLObject var6_636 = module0141.$g1714$.currentBinding(var21);
                final SubLObject var7_637 = module0141.$g1715$.currentBinding(var21);
                try {
                    module0141.$g1714$.bind((module0259.NIL != var29) ? var29 : module0141.f9283(), var21);
                    module0141.$g1715$.bind((SubLObject)((module0259.NIL != var29) ? module0259.$ic30$ : module0141.$g1715$.getDynamicValue(var21)), var21);
                    if (module0259.NIL != var29 && module0259.NIL != module0136.f8864() && module0259.NIL == module0141.f9279(var29)) {
                        final SubLObject var30 = module0136.$g1591$.getDynamicValue(var21);
                        if (var30.eql((SubLObject)module0259.$ic31$)) {
                            module0136.f8870((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic32$, var29, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                        }
                        else if (var30.eql((SubLObject)module0259.$ic34$)) {
                            module0136.f8871((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var29, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                        }
                        else if (var30.eql((SubLObject)module0259.$ic36$)) {
                            Errors.warn((SubLObject)module0259.$ic32$, var29, (SubLObject)module0259.$ic33$);
                        }
                        else {
                            Errors.warn((SubLObject)module0259.$ic37$, module0136.$g1591$.getDynamicValue(var21));
                            Errors.cerror((SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var29, (SubLObject)module0259.$ic33$);
                        }
                    }
                    final SubLObject var6_637 = module0141.$g1710$.currentBinding(var21);
                    final SubLObject var7_638 = module0141.$g1677$.currentBinding(var21);
                    final SubLObject var22_638 = module0138.$g1619$.currentBinding(var21);
                    try {
                        module0141.$g1710$.bind(module0259.$ic11$, var21);
                        module0141.$g1677$.bind(module0141.f9208(), var21);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0259.UNPROVIDED)), var21);
                        final SubLObject var31 = module0139.f9036();
                        final SubLObject var6_638 = module0139.$g1635$.currentBinding(var21);
                        try {
                            module0139.$g1635$.bind((var31 == module0259.$ic38$) ? module0139.$g1635$.getDynamicValue(var21) : module0139.f9038(var31), var21);
                            final SubLObject var6_639 = module0139.$g1636$.currentBinding(var21);
                            try {
                                module0139.$g1636$.bind((var31 == module0259.$ic38$) ? module0139.$g1636$.getDynamicValue(var21) : module0139.f9038(var31), var21);
                                final SubLObject var6_640 = module0141.$g1685$.currentBinding(var21);
                                final SubLObject var7_639 = module0141.$g1686$.currentBinding(var21);
                                final SubLObject var22_639 = module0141.$g1683$.currentBinding(var21);
                                final SubLObject var23_648 = module0141.$g1684$.currentBinding(var21);
                                final SubLObject var24_649 = module0141.$g1674$.currentBinding(var21);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0259.NIL, var21);
                                    module0141.$g1686$.bind((SubLObject)module0259.NIL, var21);
                                    module0141.$g1683$.bind((SubLObject)module0259.NIL, var21);
                                    module0141.$g1684$.bind((SubLObject)module0259.NIL, var21);
                                    module0141.$g1674$.bind((SubLObject)module0259.NIL, var21);
                                    final SubLObject var32 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var33 = (SubLObject)module0259.NIL;
                                    try {
                                        var33 = ReadWriteLocks.rw_lock_seize_read_lock(var32);
                                        final SubLObject var34 = module0200.f12443(var22);
                                        SubLObject var35;
                                        SubLObject var36;
                                        SubLObject var6_641;
                                        SubLObject var7_640;
                                        SubLObject var37;
                                        SubLObject var38;
                                        SubLObject var39;
                                        SubLObject var40;
                                        SubLObject var55_652;
                                        SubLObject var41;
                                        SubLObject var6_642;
                                        SubLObject var54_654;
                                        SubLObject var60_655;
                                        SubLObject var42;
                                        SubLObject var6_643;
                                        SubLObject var43;
                                        SubLObject var44;
                                        SubLObject var45;
                                        SubLObject var46;
                                        SubLObject var47;
                                        SubLObject var48;
                                        SubLObject var49;
                                        SubLObject var50;
                                        SubLObject var47_658;
                                        SubLObject var51;
                                        SubLObject var6_644;
                                        SubLObject var53;
                                        SubLObject var52;
                                        SubLObject var54;
                                        SubLObject var55;
                                        SubLObject var56;
                                        SubLObject var57;
                                        SubLObject var58;
                                        SubLObject var59;
                                        for (var35 = (SubLObject)module0259.NIL, var35 = var34; module0259.NIL == module0141.$g1685$.getDynamicValue(var21) && module0259.NIL != var35; var35 = var35.rest()) {
                                            var36 = var35.first();
                                            var6_641 = module0137.$g1605$.currentBinding(var21);
                                            var7_640 = module0141.$g1674$.currentBinding(var21);
                                            try {
                                                module0137.$g1605$.bind(var36, var21);
                                                module0141.$g1674$.bind((SubLObject)((module0259.NIL != module0141.f9205((SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0259.NIL == module0141.$g1674$.getDynamicValue(var21)) : module0141.$g1674$.getDynamicValue(var21)), var21);
                                                var37 = module0228.f15229(var1);
                                                if (module0259.NIL != module0138.f8992(var37)) {
                                                    var38 = module0242.f15664(var37, module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                    if (module0259.NIL != var38) {
                                                        var39 = module0245.f15834(var38, module0138.f8979(), module0137.f8955((SubLObject)module0259.UNPROVIDED));
                                                        if (module0259.NIL != var39) {
                                                            for (var40 = module0066.f4838(module0067.f4891(var39)); module0259.NIL == module0141.$g1685$.getDynamicValue(var21) && module0259.NIL == module0066.f4841(var40); var40 = module0066.f4840(var40)) {
                                                                var21.resetMultipleValues();
                                                                var55_652 = module0066.f4839(var40);
                                                                var41 = var21.secondMultipleValue();
                                                                var21.resetMultipleValues();
                                                                if (module0259.NIL != module0147.f9507(var55_652)) {
                                                                    var6_642 = module0138.$g1623$.currentBinding(var21);
                                                                    try {
                                                                        module0138.$g1623$.bind(var55_652, var21);
                                                                        for (var54_654 = module0066.f4838(module0067.f4891(var41)); module0259.NIL == module0141.$g1685$.getDynamicValue(var21) && module0259.NIL == module0066.f4841(var54_654); var54_654 = module0066.f4840(var54_654)) {
                                                                            var21.resetMultipleValues();
                                                                            var60_655 = module0066.f4839(var54_654);
                                                                            var42 = var21.secondMultipleValue();
                                                                            var21.resetMultipleValues();
                                                                            if (module0259.NIL != module0141.f9289(var60_655)) {
                                                                                var6_643 = module0138.$g1624$.currentBinding(var21);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var60_655, var21);
                                                                                    var43 = var42;
                                                                                    if (module0259.NIL != module0077.f5302(var43)) {
                                                                                        var44 = module0077.f5333(var43);
                                                                                        for (var45 = module0032.f1741(var44), var46 = (SubLObject)module0259.NIL, var46 = module0032.f1742(var45, var44); module0259.NIL == module0141.$g1685$.getDynamicValue(var21) && module0259.NIL == module0032.f1744(var45, var46); var46 = module0032.f1743(var46)) {
                                                                                            var47 = module0032.f1745(var45, var46);
                                                                                            if (module0259.NIL != module0032.f1746(var46, var47)) {
                                                                                                Functions.funcall(var20, var47);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var43.isList()) {
                                                                                        if (module0259.NIL == module0141.$g1685$.getDynamicValue(var21)) {
                                                                                            var48 = var43;
                                                                                            var49 = (SubLObject)module0259.NIL;
                                                                                            var49 = var48.first();
                                                                                            while (module0259.NIL == module0141.$g1685$.getDynamicValue(var21) && module0259.NIL != var48) {
                                                                                                Functions.funcall(var20, var49);
                                                                                                var48 = var48.rest();
                                                                                                var49 = var48.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0259.$ic39$, var43);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_643, var21);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var54_654);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_642, var21);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var40);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0259.FIVE_INTEGER, (SubLObject)module0259.$ic40$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0259.NIL != module0155.f9785(var37, (SubLObject)module0259.UNPROVIDED)) {
                                                    var50 = ((module0259.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var21), module0137.f8955((SubLObject)module0259.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var21), module0137.f8955((SubLObject)module0259.UNPROVIDED)));
                                                    for (var47_658 = (SubLObject)module0259.NIL, var47_658 = var50; module0259.NIL == module0141.$g1685$.getDynamicValue(var21) && module0259.NIL != var47_658; var47_658 = var47_658.rest()) {
                                                        var51 = var47_658.first();
                                                        var6_644 = module0138.$g1625$.currentBinding(var21);
                                                        try {
                                                            module0138.$g1625$.bind(var51, var21);
                                                            var52 = (var53 = Functions.funcall(var51, var37));
                                                            if (module0259.NIL != module0077.f5302(var53)) {
                                                                var54 = module0077.f5333(var53);
                                                                for (var55 = module0032.f1741(var54), var56 = (SubLObject)module0259.NIL, var56 = module0032.f1742(var55, var54); module0259.NIL == module0141.$g1685$.getDynamicValue(var21) && module0259.NIL == module0032.f1744(var55, var56); var56 = module0032.f1743(var56)) {
                                                                    var57 = module0032.f1745(var55, var56);
                                                                    if (module0259.NIL != module0032.f1746(var56, var57)) {
                                                                        Functions.funcall(var20, var57);
                                                                    }
                                                                }
                                                            }
                                                            else if (var53.isList()) {
                                                                if (module0259.NIL == module0141.$g1685$.getDynamicValue(var21)) {
                                                                    var58 = var53;
                                                                    var59 = (SubLObject)module0259.NIL;
                                                                    var59 = var58.first();
                                                                    while (module0259.NIL == module0141.$g1685$.getDynamicValue(var21) && module0259.NIL != var58) {
                                                                        Functions.funcall(var20, var59);
                                                                        var58 = var58.rest();
                                                                        var59 = var58.first();
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0259.$ic39$, var53);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var6_644, var21);
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var7_640, var21);
                                                module0137.$g1605$.rebind(var6_641, var21);
                                            }
                                        }
                                    }
                                    finally {
                                        if (module0259.NIL != var33) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var32);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var24_649, var21);
                                    module0141.$g1684$.rebind(var23_648, var21);
                                    module0141.$g1683$.rebind(var22_639, var21);
                                    module0141.$g1686$.rebind(var7_639, var21);
                                    module0141.$g1685$.rebind(var6_640, var21);
                                }
                                if (var31 == module0259.$ic41$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var21));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var6_639, var21);
                            }
                            if (var31 == module0259.$ic41$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var21));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var6_638, var21);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var22_638, var21);
                        module0141.$g1677$.rebind(var7_638, var21);
                        module0141.$g1710$.rebind(var6_637, var21);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var7_637, var21);
                    module0141.$g1714$.rebind(var6_636, var21);
                }
            }
            finally {
                module0147.$g2096$.rebind(var22_637, var21);
                module0147.$g2094$.rebind(var7_636, var21);
                module0147.$g2095$.rebind(var6_635, var21);
            }
        }
        finally {
            module0137.$g1605$.rebind(var27, var21);
            module0141.$g1674$.rebind(var26, var21);
            module0141.$g1672$.rebind(var25, var21);
            module0141.$g1671$.rebind(var24, var21);
            module0141.$g1670$.rebind(var23, var21);
        }
        if (module0259.NIL != module0248.f15974(var1)) {
            final SubLObject var60 = module0137.f8955(module0259.$ic44$);
            final SubLObject var61 = var2;
            final SubLObject var62 = module0147.$g2095$.currentBinding(var21);
            final SubLObject var63 = module0147.$g2094$.currentBinding(var21);
            final SubLObject var64 = module0147.$g2096$.currentBinding(var21);
            try {
                module0147.$g2095$.bind(module0147.f9545(var61), var21);
                module0147.$g2094$.bind(module0147.f9546(var61), var21);
                module0147.$g2096$.bind(module0147.f9549(var61), var21);
                final SubLObject var65 = var3;
                final SubLObject var6_645 = module0141.$g1714$.currentBinding(var21);
                final SubLObject var7_641 = module0141.$g1715$.currentBinding(var21);
                try {
                    module0141.$g1714$.bind((module0259.NIL != var65) ? var65 : module0141.f9283(), var21);
                    module0141.$g1715$.bind((SubLObject)((module0259.NIL != var65) ? module0259.$ic30$ : module0141.$g1715$.getDynamicValue(var21)), var21);
                    if (module0259.NIL != var65 && module0259.NIL != module0136.f8864() && module0259.NIL == module0141.f9279(var65)) {
                        final SubLObject var66 = module0136.$g1591$.getDynamicValue(var21);
                        if (var66.eql((SubLObject)module0259.$ic31$)) {
                            module0136.f8870((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic32$, var65, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                        }
                        else if (var66.eql((SubLObject)module0259.$ic34$)) {
                            module0136.f8871((SubLObject)module0259.ONE_INTEGER, (SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var65, (SubLObject)module0259.$ic33$, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
                        }
                        else if (var66.eql((SubLObject)module0259.$ic36$)) {
                            Errors.warn((SubLObject)module0259.$ic32$, var65, (SubLObject)module0259.$ic33$);
                        }
                        else {
                            Errors.warn((SubLObject)module0259.$ic37$, module0136.$g1591$.getDynamicValue(var21));
                            Errors.cerror((SubLObject)module0259.$ic35$, (SubLObject)module0259.$ic32$, var65, (SubLObject)module0259.$ic33$);
                        }
                    }
                    final SubLObject var6_646 = module0137.$g1605$.currentBinding(var21);
                    try {
                        module0137.$g1605$.bind(var60, var21);
                        SubLObject var67 = Hashtables.gethash(var1, module0248.$g2468$.getGlobalValue(), (SubLObject)module0259.UNPROVIDED);
                        SubLObject var68 = (SubLObject)module0259.NIL;
                        var68 = var67.first();
                        while (module0259.NIL != var67) {
                            SubLObject var70;
                            final SubLObject var69 = var70 = var68;
                            SubLObject var71 = (SubLObject)module0259.NIL;
                            SubLObject var72 = (SubLObject)module0259.NIL;
                            SubLObject var73 = (SubLObject)module0259.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var70, var69, (SubLObject)module0259.$ic203$);
                            var71 = var70.first();
                            var70 = var70.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var70, var69, (SubLObject)module0259.$ic203$);
                            var72 = var70.first();
                            var70 = var70.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var70, var69, (SubLObject)module0259.$ic203$);
                            var73 = var70.first();
                            var70 = var70.rest();
                            if (module0259.NIL == var70) {
                                if (module0259.NIL != module0147.f9507(var72) && module0259.NIL != module0141.f9289(var73)) {
                                    final SubLObject var74 = var71;
                                    Functions.funcall(var20, var74);
                                    SubLObject var12_670;
                                    final SubLObject var75 = var12_670 = ((module0259.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8971(), module0141.$g1714$.getDynamicValue(var21), var60)) : module0244.f15760(module0138.f8971(), module0141.$g1714$.getDynamicValue(var21), var60));
                                    SubLObject var76 = (SubLObject)module0259.NIL;
                                    var76 = var12_670.first();
                                    while (module0259.NIL != var12_670) {
                                        final SubLObject var6_647 = module0138.$g1625$.currentBinding(var21);
                                        try {
                                            module0138.$g1625$.bind(var76, var21);
                                            final SubLObject var77 = Functions.funcall(var76, var71);
                                            Functions.funcall(var20, var77);
                                        }
                                        finally {
                                            module0138.$g1625$.rebind(var6_647, var21);
                                        }
                                        var12_670 = var12_670.rest();
                                        var76 = var12_670.first();
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var69, (SubLObject)module0259.$ic203$);
                            }
                            var67 = var67.rest();
                            var68 = var67.first();
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var6_646, var21);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var7_641, var21);
                    module0141.$g1714$.rebind(var6_645, var21);
                }
            }
            finally {
                module0147.$g2096$.rebind(var64, var21);
                module0147.$g2094$.rebind(var63, var21);
                module0147.$g2095$.rebind(var62, var21);
            }
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16989(final SubLObject var20, final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        f16988(var20, var1, var2, var3);
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16990(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13572(var1) : var1;
        final SubLObject var4 = module0252.f16245(module0137.f8955(module0259.$ic122$), var1, var2, var3);
        return var4;
    }
    
    public static SubLObject f16991(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0259.NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)module0259.$ic54$, var2);
            module0147.$g2095$.bind(module0259.$ic55$, var2);
            var3 = f16990(var1, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f16992(final SubLObject var1, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0259.NIL;
        final SubLObject var5 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var3);
        try {
            module0147.$g2094$.bind((SubLObject)module0259.$ic8$, var3);
            module0147.$g2095$.bind(var2, var3);
            var4 = f16990(var1, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var6, var3);
            module0147.$g2094$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f16993(final SubLObject var1, SubLObject var122) {
        if (var122 == module0259.UNPROVIDED) {
            var122 = module0262.f17362(module0147.$g2095$.getDynamicValue());
        }
        final SubLThread var123 = SubLProcess.currentSubLThread();
        SubLObject var124 = (SubLObject)module0259.NIL;
        final SubLObject var125 = module0147.$g2094$.currentBinding(var123);
        final SubLObject var126 = module0147.$g2096$.currentBinding(var123);
        try {
            module0147.$g2094$.bind((SubLObject)module0259.$ic56$, var123);
            module0147.$g2096$.bind(var122, var123);
            var124 = f16990(var1, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var126, var123);
            module0147.$g2094$.rebind(var125, var123);
        }
        return var124;
    }
    
    public static SubLObject f16994(final SubLObject var1, final SubLObject var13, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert module0259.NIL != module0210.f13565(var1) : var1;
        assert module0259.NIL != module0210.f13565(var13) : var13;
        SubLObject var15 = (SubLObject)module0259.NIL;
        final SubLObject var16 = module0259.$g2502$.currentBinding(var14);
        final SubLObject var17 = module0259.$g2503$.currentBinding(var14);
        try {
            module0259.$g2502$.bind((SubLObject)module0259.NIL, var14);
            module0259.$g2503$.bind(var13, var14);
            f16986((SubLObject)module0259.$ic69$, var1, var2, var3);
            var15 = module0259.$g2502$.getDynamicValue(var14);
        }
        finally {
            module0259.$g2503$.rebind(var17, var14);
            module0259.$g2502$.rebind(var16, var14);
        }
        return var15;
    }
    
    public static SubLObject f16985(final SubLObject var14, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13565(var14) : var14;
        return module0252.f16248(module0137.f8955(module0259.$ic122$), var14, var2, var3);
    }
    
    public static SubLObject f16995(final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        SubLObject var126 = (SubLObject)module0259.NIL;
        final SubLObject var127 = module0147.$g2094$.currentBinding(var125);
        final SubLObject var128 = module0147.$g2095$.currentBinding(var125);
        try {
            module0147.$g2094$.bind((SubLObject)module0259.$ic54$, var125);
            module0147.$g2095$.bind(module0259.$ic55$, var125);
            var126 = f16985(var124, (SubLObject)module0259.UNPROVIDED, (SubLObject)module0259.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var128, var125);
            module0147.$g2094$.rebind(var127, var125);
        }
        return var126;
    }
    
    public static SubLObject f16996(final SubLObject var1, final SubLObject var127, SubLObject var2, SubLObject var3) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        if (var3 == module0259.UNPROVIDED) {
            var3 = (SubLObject)module0259.NIL;
        }
        assert module0259.NIL != module0210.f13572(var1) : var1;
        assert module0259.NIL != Types.listp(var127) : var127;
        if (module0259.NIL == var127) {
            return (SubLObject)module0259.NIL;
        }
        if (module0259.NIL == module0035.f1997(var127)) {
            return module0252.f16332(module0137.f8955(module0259.$ic122$), var1, var127, var2, var3);
        }
        if (module0259.NIL != f16975(var1, var127.first(), var2, var3)) {
            return var127;
        }
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f16997(final SubLObject var1, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        return module0248.f16006(module0137.f8955(module0259.$ic122$), var1, var2);
    }
    
    public static SubLObject f16998(final SubLObject var1, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        return module0248.f16007(module0137.f8955(module0259.$ic122$), var1, var2);
    }
    
    public static SubLObject f16999(final SubLObject var608, final SubLObject var607) {
        module0248.f15957(var608, var607, module0137.f8955(module0259.$ic122$));
        module0268.f17665(var607);
        module0345.f23240(var608, var607);
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f17000(final SubLObject var608, final SubLObject var607) {
        module0248.f15962(var608, var607, module0137.f8955(module0259.$ic122$));
        module0268.f17676(var607);
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f17001(final SubLObject var14, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        return f17002(var14, var2);
    }
    
    public static SubLObject f17002(final SubLObject var14, SubLObject var2) {
        if (var2 == module0259.UNPROVIDED) {
            var2 = (SubLObject)module0259.NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        SubLObject var16 = (SubLObject)module0259.NIL;
        final SubLObject var17 = var2;
        final SubLObject var18 = module0147.$g2095$.currentBinding(var15);
        final SubLObject var19 = module0147.$g2094$.currentBinding(var15);
        final SubLObject var20 = module0147.$g2096$.currentBinding(var15);
        try {
            module0147.$g2095$.bind(module0147.f9545(var17), var15);
            module0147.$g2094$.bind(module0147.f9546(var17), var15);
            module0147.$g2096$.bind(module0147.f9549(var17), var15);
            final SubLObject var21 = module0259.$ic0$;
            if (module0259.NIL != module0158.f10010(var14, (SubLObject)module0259.TWO_INTEGER, var21)) {
                final SubLObject var22 = module0158.f10011(var14, (SubLObject)module0259.TWO_INTEGER, var21);
                SubLObject var23 = (SubLObject)module0259.NIL;
                final SubLObject var24 = (SubLObject)module0259.NIL;
                while (module0259.NIL == var23) {
                    final SubLObject var25 = module0052.f3695(var22, var24);
                    final SubLObject var26 = (SubLObject)SubLObjectFactory.makeBoolean(!var24.eql(var25));
                    if (module0259.NIL != var26) {
                        SubLObject var27 = (SubLObject)module0259.NIL;
                        try {
                            var27 = module0158.f10316(var25, (SubLObject)module0259.$ic211$, (SubLObject)module0259.$ic170$, (SubLObject)module0259.NIL);
                            SubLObject var674_679 = (SubLObject)module0259.NIL;
                            final SubLObject var675_680 = (SubLObject)module0259.NIL;
                            while (module0259.NIL == var674_679) {
                                final SubLObject var28 = module0052.f3695(var27, var675_680);
                                final SubLObject var677_682 = (SubLObject)SubLObjectFactory.makeBoolean(!var675_680.eql(var28));
                                if (module0259.NIL != var677_682) {
                                    final SubLObject var29 = module0178.f11334(var28);
                                    var16 = (SubLObject)ConsesLow.cons(var29, var16);
                                }
                                var674_679 = (SubLObject)SubLObjectFactory.makeBoolean(module0259.NIL == var677_682);
                            }
                        }
                        finally {
                            final SubLObject var6_683 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0259.T, var15);
                                if (module0259.NIL != var27) {
                                    module0158.f10319(var27);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var6_683, var15);
                            }
                        }
                    }
                    var23 = (SubLObject)SubLObjectFactory.makeBoolean(module0259.NIL == var26);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var20, var15);
            module0147.$g2094$.rebind(var19, var15);
            module0147.$g2095$.rebind(var18, var15);
        }
        return Sequences.nreverse(var16);
    }
    
    public static SubLObject f17003() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16821", "ISA", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16822", "MIN-ISA", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16823", "S#19522", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16824", "S#19523", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16825", "S#19524", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16826", "S#19525", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16827", "MAX-NOT-ISA", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16828", "S#19526", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16829", "INSTANCES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16830", "MAX-INSTANCES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16831", "ALL-INSTANCES-WITH-MAX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16832", "S#19527", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16833", "MIN-NOT-INSTANCES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16834", "ISA-SIBLINGS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16835", "INSTANCE-SIBLINGS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16836", "S#19528", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16837", "S#19529", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16838", "MAP-INSTANCES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16839", "S#19530", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16840", "ALL-ISA", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16842", "ALL-ISA-IN-ANY-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16843", "S#19531", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16844", "S#19532", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16845", "S#19533", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16846", "ALL-INSTANCES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16847", "ALL-INSTANCES-IN-ALL-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16848", "ALL-FORT-INSTANCES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16849", "S#19534", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16850", "ALL-FORT-INSTANCES-IN-ALL-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16851", "ALL-ISAS-WRT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16853", "S#19535", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16855", "UNION-ALL-ISA", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16856", "UNION-ALL-INSTANCES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16857", "ALL-ISA-AMONG", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16858", "S#19536", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16859", "S#19537", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16841", "ALL-INSTANCES-AMONG", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16860", "S#19538", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16861", "S#19419", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16862", "S#19539", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16863", "S#19540", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16864", "ALL-NOT-ISA", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16865", "ALL-NOT-INSTANCES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16866", "NOT-ISA-AMONG", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16868", "S#19541", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16852", "MAP-ALL-ISA", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16869", "MAP-ALL-INSTANCES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16870", "S#19542", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16871", "ANY-WRT-ALL-ISA", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16872", "S#19267", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16873", "SAMPLE-LEAF-INSTANCES", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16874", "SAMPLE-DIFFERENT-LEAF-INSTANCES", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16875", "S#19543", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16876", "COUNT-ALL-INSTANCES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16877", "S#19544", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16878", "S#19545", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16879", "S#19546", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16880", "S#19547", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16881", "S#19548", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16882", "S#19549", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16883", "COUNT-ALL-QUOTED-INSTANCES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16884", "S#19550", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16885", "S#19551", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16886", "S#19552", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16887", "S#19553", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16888", "S#19554", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16889", "S#19555", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16854", "ISA?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16890", "ISA-IN-MTS?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16891", "ISA-IN-ANY-MT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16892", "S#15522", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16893", "S#19556", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16896", "S#19557", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16894", "S#19558", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16897", "S#19559", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16895", "S#19560", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16898", "S#19561", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16899", "S#19562", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16900", "S#19563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16901", "ANY-ISA?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16902", "ISA-ANY?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16903", "S#19564", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16904", "S#19565", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16905", "S#15405", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16906", "S#19566", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16907", "ANY-ISA-ANY?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16867", "NOT-ISA?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16910", "S#19567", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16909", "S#19568", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16908", "S#19569", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16911", "S#19570", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16912", "S#19571", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16913", "S#19572", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16914", "WHY-ISA?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16916", "S#19420", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16915", "S#19573", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16917", "WHY-NOT-ISA?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16919", "S#19574", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16918", "S#19575", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16920", "INSTANCES?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16921", "S#19576", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16922", "S#19577", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16923", "S#19578", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16925", "S#19579", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16926", "S#19580", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16927", "S#19581", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16928", "S#19582", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16929", "S#19583", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16930", "S#19584", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16931", "S#19585", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16932", "MAX-FLOOR-MTS-OF-ISA-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16933", "MIN-MTS-OF-ISA-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16935", "S#19586", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16934", "S#19587", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16936", "S#19588", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16937", "S#19589", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16938", "S#19590", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16939", "S#19591", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16940", "S#19592", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16941", "S#19593", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16944", "S#19594", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16946", "S#19595", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16947", "S#19596", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16942", "S#19597", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16943", "S#19598", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16945", "S#19599", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16948", "S#19600", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16949", "S#19601", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16924", "S#19602", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16950", "S#19603", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16951", "S#19604", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16952", "S#19605", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16953", "S#19606", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16954", "S#19607", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16955", "S#19608", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16956", "S#19609", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16957", "S#19610", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16958", "S#19611", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16959", "S#19612", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16960", "INSTANCEOF-AFTER-ADDING", 2, 0, false);
        new $f16960$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16961", "ISA-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16962", "S#19613", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16963", "S#19614", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16964", "S#19615", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16965", "INSTANCEOF-AFTER-REMOVING", 2, 0, false);
        new $f16965$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16966", "ISA-AFTER-REMOVING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16967", "S#19616", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16968", "S#19617", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16969", "S#18604", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16970", "S#19618", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16971", "S#19619", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16972", "S#19620", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16973", "S#19621", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16974", "S#19622", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16975", "QUOTED-ISA?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16976", "QUOTED-ISA-IN-ANY-MT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16977", "ANY-QUOTED-ISA?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16978", "QUOTED-ISA-ANY?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16979", "ALL-QUOTED-ISA?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16980", "NOT-QUOTED-ISA?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16982", "S#19623", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16981", "S#19624", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16983", "QUOTED-INSTANCES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16984", "UNION-ALL-QUOTED-INSTANCES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16986", "MAP-ALL-QUOTED-ISA", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16987", "S#19625", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16988", "S#19626", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16989", "S#19627", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16990", "ALL-QUOTED-ISA", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16991", "S#19628", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16992", "S#19629", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16993", "S#19630", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16994", "ALL-QUOTED-ISAS-WRT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16985", "ALL-QUOTED-INSTANCES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16995", "S#19631", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16996", "ALL-QUOTED-ISA-AMONG", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16997", "S#19632", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16998", "S#19633", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f16999", "QUOTED-INSTANCEOF-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f17000", "QUOTED-INSTANCEOF-AFTER-REMOVING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f17001", "S#17143", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0259", "f17002", "S#19634", 1, 1, false);
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f17004() {
        module0259.$g2501$ = SubLFiles.defparameter("S#19635", (SubLObject)module0259.T);
        module0259.$g2502$ = SubLFiles.defparameter("S#19636", (SubLObject)module0259.NIL);
        module0259.$g2503$ = SubLFiles.defparameter("S#19637", (SubLObject)module0259.NIL);
        module0259.$g2504$ = SubLFiles.deflexical("S#19638", (SubLObject)module0259.TWENTY_INTEGER);
        return (SubLObject)module0259.NIL;
    }
    
    public static SubLObject f17005() {
        module0012.f368((SubLObject)module0259.$ic3$, (SubLObject)module0259.$ic4$, (SubLObject)module0259.$ic5$, (SubLObject)module0259.$ic6$, (SubLObject)module0259.$ic7$);
        module0012.f368((SubLObject)module0259.$ic9$, (SubLObject)module0259.$ic4$, (SubLObject)module0259.$ic10$, (SubLObject)module0259.$ic6$, (SubLObject)module0259.$ic7$);
        module0012.f368((SubLObject)module0259.$ic13$, (SubLObject)module0259.$ic14$, (SubLObject)module0259.$ic15$, (SubLObject)module0259.$ic16$, (SubLObject)module0259.$ic7$);
        module0012.f368((SubLObject)module0259.$ic17$, (SubLObject)module0259.$ic18$, (SubLObject)module0259.$ic19$, (SubLObject)module0259.$ic16$, (SubLObject)module0259.$ic7$);
        module0002.f38((SubLObject)module0259.$ic20$);
        module0012.f368((SubLObject)module0259.$ic23$, (SubLObject)module0259.$ic18$, (SubLObject)module0259.$ic24$, (SubLObject)module0259.$ic16$, (SubLObject)module0259.$ic7$);
        module0012.f368((SubLObject)module0259.$ic25$, (SubLObject)module0259.$ic4$, (SubLObject)module0259.$ic26$, (SubLObject)module0259.$ic6$, (SubLObject)module0259.$ic7$);
        module0012.f368((SubLObject)module0259.$ic27$, (SubLObject)module0259.$ic4$, (SubLObject)module0259.$ic28$, (SubLObject)module0259.$ic29$, (SubLObject)module0259.$ic7$);
        module0012.f368((SubLObject)module0259.$ic47$, (SubLObject)module0259.$ic48$, (SubLObject)module0259.$ic49$, (SubLObject)module0259.$ic50$, (SubLObject)module0259.NIL);
        module0012.f368((SubLObject)module0259.$ic51$, (SubLObject)module0259.$ic4$, (SubLObject)module0259.$ic52$, (SubLObject)module0259.$ic6$, (SubLObject)module0259.$ic53$);
        module0012.f368((SubLObject)module0259.$ic57$, (SubLObject)module0259.$ic18$, (SubLObject)module0259.$ic58$, (SubLObject)module0259.$ic16$, (SubLObject)module0259.$ic59$);
        module0012.f368((SubLObject)module0259.$ic60$, (SubLObject)module0259.$ic61$, (SubLObject)module0259.$ic62$, (SubLObject)module0259.$ic63$, (SubLObject)module0259.$ic59$);
        module0002.f35((SubLObject)module0259.$ic64$, (SubLObject)module0259.$ic65$);
        module0002.f38((SubLObject)module0259.$ic64$);
        module0002.f35((SubLObject)module0259.$ic67$, (SubLObject)module0259.$ic68$);
        module0012.f368((SubLObject)module0259.$ic70$, (SubLObject)module0259.$ic71$, (SubLObject)module0259.$ic72$, (SubLObject)module0259.$ic73$, (SubLObject)module0259.$ic7$);
        module0012.f368((SubLObject)module0259.$ic76$, (SubLObject)module0259.$ic77$, (SubLObject)module0259.$ic78$, (SubLObject)module0259.$ic79$, (SubLObject)module0259.$ic7$);
        module0012.f368((SubLObject)module0259.$ic80$, (SubLObject)module0259.$ic81$, (SubLObject)module0259.$ic82$, (SubLObject)module0259.$ic83$, (SubLObject)module0259.$ic7$);
        module0012.f368((SubLObject)module0259.$ic84$, (SubLObject)module0259.$ic85$, (SubLObject)module0259.$ic86$, (SubLObject)module0259.$ic87$, (SubLObject)module0259.$ic7$);
        module0012.f368((SubLObject)module0259.$ic88$, (SubLObject)module0259.$ic89$, (SubLObject)module0259.$ic90$, (SubLObject)module0259.$ic91$, (SubLObject)module0259.$ic59$);
        module0012.f368((SubLObject)module0259.$ic95$, (SubLObject)module0259.$ic4$, (SubLObject)module0259.$ic96$, (SubLObject)module0259.$ic6$, (SubLObject)module0259.$ic7$);
        module0012.f368((SubLObject)module0259.$ic97$, (SubLObject)module0259.$ic18$, (SubLObject)module0259.$ic98$, (SubLObject)module0259.$ic16$, (SubLObject)module0259.$ic7$);
        module0012.f368((SubLObject)module0259.$ic99$, (SubLObject)module0259.$ic85$, (SubLObject)module0259.$ic100$, (SubLObject)module0259.$ic87$, (SubLObject)module0259.$ic7$);
        module0012.f368((SubLObject)module0259.$ic101$, (SubLObject)module0259.$ic102$, (SubLObject)module0259.$ic103$, (SubLObject)module0259.$ic104$, (SubLObject)module0259.NIL);
        module0012.f368((SubLObject)module0259.$ic105$, (SubLObject)module0259.$ic106$, (SubLObject)module0259.$ic107$, (SubLObject)module0259.$ic108$, (SubLObject)module0259.NIL);
        module0012.f368((SubLObject)module0259.$ic109$, (SubLObject)module0259.$ic48$, (SubLObject)module0259.$ic110$, (SubLObject)module0259.$ic111$, (SubLObject)module0259.NIL);
        module0012.f368((SubLObject)module0259.$ic118$, (SubLObject)module0259.$ic119$, (SubLObject)module0259.$ic120$, (SubLObject)module0259.$ic63$, (SubLObject)module0259.$ic121$);
        module0012.f368((SubLObject)module0259.$ic123$, (SubLObject)module0259.$ic119$, (SubLObject)module0259.$ic124$, (SubLObject)module0259.$ic63$, (SubLObject)module0259.$ic121$);
        module0012.f368((SubLObject)module0259.$ic126$, (SubLObject)module0259.$ic127$, (SubLObject)module0259.$ic128$, (SubLObject)module0259.$ic63$, (SubLObject)module0259.$ic129$);
        module0012.f368((SubLObject)module0259.$ic130$, (SubLObject)module0259.$ic131$, (SubLObject)module0259.$ic132$, (SubLObject)module0259.$ic63$, (SubLObject)module0259.$ic129$);
        module0012.f368((SubLObject)module0259.$ic133$, (SubLObject)module0259.$ic134$, (SubLObject)module0259.$ic135$, (SubLObject)module0259.NIL, (SubLObject)module0259.$ic129$);
        module0012.f368((SubLObject)module0259.$ic136$, (SubLObject)module0259.$ic85$, (SubLObject)module0259.$ic137$, (SubLObject)module0259.$ic87$, (SubLObject)module0259.$ic129$);
        module0012.f368((SubLObject)module0259.$ic138$, (SubLObject)module0259.$ic85$, (SubLObject)module0259.$ic137$, (SubLObject)module0259.$ic87$, (SubLObject)module0259.$ic129$);
        module0012.f368((SubLObject)module0259.$ic141$, (SubLObject)module0259.$ic142$, (SubLObject)module0259.$ic143$, (SubLObject)module0259.$ic144$, (SubLObject)module0259.$ic129$);
        module0012.f368((SubLObject)module0259.$ic145$, (SubLObject)module0259.$ic127$, (SubLObject)module0259.$ic146$, (SubLObject)module0259.$ic147$, (SubLObject)module0259.$ic129$);
        module0012.f368((SubLObject)module0259.$ic148$, (SubLObject)module0259.$ic149$, (SubLObject)module0259.$ic150$, (SubLObject)module0259.$ic147$, (SubLObject)module0259.$ic151$);
        module0012.f368((SubLObject)module0259.$ic158$, (SubLObject)module0259.$ic149$, (SubLObject)module0259.$ic159$, (SubLObject)module0259.$ic147$, (SubLObject)module0259.$ic151$);
        module0012.f368((SubLObject)module0259.$ic160$, (SubLObject)module0259.$ic119$, (SubLObject)module0259.$ic161$, (SubLObject)module0259.$ic63$, (SubLObject)module0259.$ic129$);
        module0012.f368((SubLObject)module0259.$ic165$, (SubLObject)module0259.$ic166$, (SubLObject)module0259.$ic167$, (SubLObject)module0259.$ic147$, (SubLObject)module0259.NIL);
        module0012.f416((SubLObject)module0259.$ic179$);
        module0012.f416((SubLObject)module0259.$ic180$);
        module0012.f416((SubLObject)module0259.$ic188$);
        module0012.f416((SubLObject)module0259.$ic189$);
        module0012.f368((SubLObject)module0259.$ic190$, (SubLObject)module0259.$ic127$, (SubLObject)module0259.$ic191$, (SubLObject)module0259.$ic63$, (SubLObject)module0259.$ic129$);
        module0012.f368((SubLObject)module0259.$ic192$, (SubLObject)module0259.$ic134$, (SubLObject)module0259.$ic135$, (SubLObject)module0259.NIL, (SubLObject)module0259.$ic129$);
        module0012.f368((SubLObject)module0259.$ic193$, (SubLObject)module0259.$ic85$, (SubLObject)module0259.$ic137$, (SubLObject)module0259.$ic87$, (SubLObject)module0259.$ic129$);
        module0012.f368((SubLObject)module0259.$ic194$, (SubLObject)module0259.$ic85$, (SubLObject)module0259.$ic137$, (SubLObject)module0259.$ic87$, (SubLObject)module0259.$ic129$);
        module0012.f368((SubLObject)module0259.$ic195$, (SubLObject)module0259.$ic85$, (SubLObject)module0259.$ic196$, (SubLObject)module0259.$ic87$, (SubLObject)module0259.$ic129$);
        module0012.f368((SubLObject)module0259.$ic197$, (SubLObject)module0259.$ic127$, (SubLObject)module0259.$ic146$, (SubLObject)module0259.$ic147$, (SubLObject)module0259.$ic129$);
        module0012.f368((SubLObject)module0259.$ic198$, (SubLObject)module0259.$ic14$, (SubLObject)module0259.$ic15$, (SubLObject)module0259.$ic16$, (SubLObject)module0259.$ic7$);
        module0012.f368((SubLObject)module0259.$ic199$, (SubLObject)module0259.$ic81$, (SubLObject)module0259.$ic200$, (SubLObject)module0259.$ic83$, (SubLObject)module0259.$ic7$);
        module0012.f368((SubLObject)module0259.$ic201$, (SubLObject)module0259.$ic102$, (SubLObject)module0259.$ic202$, (SubLObject)module0259.$ic104$, (SubLObject)module0259.NIL);
        module0012.f368((SubLObject)module0259.$ic204$, (SubLObject)module0259.$ic4$, (SubLObject)module0259.$ic52$, (SubLObject)module0259.$ic6$, (SubLObject)module0259.$ic7$);
        module0012.f368((SubLObject)module0259.$ic205$, (SubLObject)module0259.$ic71$, (SubLObject)module0259.$ic72$, (SubLObject)module0259.$ic73$, (SubLObject)module0259.$ic7$);
        module0012.f368((SubLObject)module0259.$ic206$, (SubLObject)module0259.$ic18$, (SubLObject)module0259.$ic58$, (SubLObject)module0259.$ic16$, (SubLObject)module0259.$ic7$);
        module0012.f368((SubLObject)module0259.$ic207$, (SubLObject)module0259.$ic85$, (SubLObject)module0259.$ic208$, (SubLObject)module0259.$ic87$, (SubLObject)module0259.$ic7$);
        module0012.f416((SubLObject)module0259.$ic209$);
        module0012.f416((SubLObject)module0259.$ic210$);
        return (SubLObject)module0259.NIL;
    }
    
    public void declareFunctions() {
        f17003();
    }
    
    public void initializeVariables() {
        f17004();
    }
    
    public void runTopLevelForms() {
        f17005();
    }
    
    static {
        me = (SubLFile)new module0259();
        module0259.$g2501$ = null;
        module0259.$g2502$ = null;
        module0259.$g2503$ = null;
        module0259.$g2504$ = null;
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic1$ = SubLObjectFactory.makeSymbol("HL-TERM-P");
        $ic2$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic3$ = SubLObjectFactory.makeSymbol("MIN-ISA");
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"));
        $ic5$ = SubLObjectFactory.makeString("Returns most-specific collections that include TERM (inexpensive)");
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("HL-TERM-P")));
        $ic7$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")));
        $ic8$ = SubLObjectFactory.makeSymbol("S#12276", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("MAX-NOT-ISA");
        $ic10$ = SubLObjectFactory.makeString("Returns most-general collections that do not include TERM (expensive)");
        $ic11$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $ic12$ = SubLObjectFactory.makeSymbol("EL-FORT-P");
        $ic13$ = SubLObjectFactory.makeSymbol("INSTANCES");
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"))));
        $ic15$ = SubLObjectFactory.makeString("Returns the asserted instances of COL");
        $ic16$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")));
        $ic17$ = SubLObjectFactory.makeSymbol("MAX-INSTANCES");
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"));
        $ic19$ = SubLObjectFactory.makeString("Returns the maximal among the asserted instances of COL");
        $ic20$ = SubLObjectFactory.makeSymbol("ALL-INSTANCES-WITH-MAX");
        $ic21$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic22$ = SubLObjectFactory.makeKeyword("INVALID-ITERATION-TERM");
        $ic23$ = SubLObjectFactory.makeSymbol("MIN-NOT-INSTANCES");
        $ic24$ = SubLObjectFactory.makeString("Returns the most-specific negated instances of collection COL");
        $ic25$ = SubLObjectFactory.makeSymbol("ISA-SIBLINGS");
        $ic26$ = SubLObjectFactory.makeString("Returns the direct isas of those collections of which TERM is a direct instance");
        $ic27$ = SubLObjectFactory.makeSymbol("INSTANCE-SIBLINGS");
        $ic28$ = SubLObjectFactory.makeString("Returns the direct instances of those collections having direct isa TERM");
        $ic29$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")));
        $ic30$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic31$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic32$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic33$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic34$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic35$ = SubLObjectFactory.makeString("continue anyway");
        $ic36$ = SubLObjectFactory.makeKeyword("WARN");
        $ic37$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic38$ = SubLObjectFactory.makeKeyword("OLD");
        $ic39$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic40$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic41$ = SubLObjectFactory.makeKeyword("RESOURCE");
        $ic42$ = SubLObjectFactory.makeSymbol("S#11585", "CYC");
        $ic43$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#4A5C20A"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#785C208"));
        $ic44$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic45$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#30670C2"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#35B6E1E"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#35BE29E"));
        $ic46$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic47$ = SubLObjectFactory.makeSymbol("MAP-INSTANCES");
        $ic48$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"));
        $ic49$ = SubLObjectFactory.makeString("apply FUNCTION to every (least general) #$isa of TERM");
        $ic50$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")));
        $ic51$ = SubLObjectFactory.makeSymbol("ALL-ISA");
        $ic52$ = SubLObjectFactory.makeString("Returns all collections that include TERM (inexpensive)");
        $ic53$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION-P")));
        $ic54$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic55$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic56$ = SubLObjectFactory.makeSymbol("S#12280", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("ALL-INSTANCES");
        $ic58$ = SubLObjectFactory.makeString("Returns all instances of COLLECTION (expensive)");
        $ic59$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("HL-TERM-P")));
        $ic60$ = SubLObjectFactory.makeSymbol("ALL-INSTANCES-IN-ALL-MTS");
        $ic61$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC"));
        $ic62$ = SubLObjectFactory.makeString("@return listp; all instances of COLLECTION in all mts.");
        $ic63$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")));
        $ic64$ = SubLObjectFactory.makeSymbol("ALL-FORT-INSTANCES");
        $ic65$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-INSTANCES"));
        $ic66$ = SubLObjectFactory.makeSymbol("S#19639", "CYC");
        $ic67$ = SubLObjectFactory.makeSymbol("ALL-FORT-INSTANCES-IN-ALL-MTS");
        $ic68$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-INSTANCES-IN-ALL-MTS"));
        $ic69$ = SubLObjectFactory.makeSymbol("S#19535", "CYC");
        $ic70$ = SubLObjectFactory.makeSymbol("ALL-ISAS-WRT");
        $ic71$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("ISA"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"));
        $ic72$ = SubLObjectFactory.makeString("Returns all isa of term TERM that are also instances of collection ISA (ascending transitive closure; inexpensive)");
        $ic73$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")));
        $ic74$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic75$ = SubLObjectFactory.makeSymbol("S#18709", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("UNION-ALL-ISA");
        $ic77$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13098", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"));
        $ic78$ = SubLObjectFactory.makeString("Returns all collections that include any term in TERMS (inexpensive)");
        $ic79$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13098", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $ic80$ = SubLObjectFactory.makeSymbol("UNION-ALL-INSTANCES");
        $ic81$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1573", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"));
        $ic82$ = SubLObjectFactory.makeString("Returns set of all instances of each collection in COLS (expensive)");
        $ic83$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1573", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $ic84$ = SubLObjectFactory.makeSymbol("ALL-ISA-AMONG");
        $ic85$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#19640", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"));
        $ic86$ = SubLObjectFactory.makeString("Returns those elements of COLLECTIONS that include TERM as an all-instance");
        $ic87$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("HL-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#19640", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $ic88$ = SubLObjectFactory.makeSymbol("ALL-INSTANCES-AMONG");
        $ic89$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13098", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"));
        $ic90$ = SubLObjectFactory.makeString("Returns those elements of TERMS that include COL as an all-isa");
        $ic91$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("HL-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13098", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $ic92$ = SubLObjectFactory.makeInteger(100000);
        $ic93$ = SubLObjectFactory.makeInteger(50);
        $ic94$ = SubLObjectFactory.makeInteger(25);
        $ic95$ = SubLObjectFactory.makeSymbol("ALL-NOT-ISA");
        $ic96$ = SubLObjectFactory.makeString("Returns all collections that do not include TERM (expensive)");
        $ic97$ = SubLObjectFactory.makeSymbol("ALL-NOT-INSTANCES");
        $ic98$ = SubLObjectFactory.makeString("Returns all terms that are not members of col (by assertion)");
        $ic99$ = SubLObjectFactory.makeSymbol("NOT-ISA-AMONG");
        $ic100$ = SubLObjectFactory.makeString("Returns those elements of COLLECTIONS that do NOT include TERM");
        $ic101$ = SubLObjectFactory.makeSymbol("MAP-ALL-ISA");
        $ic102$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11675", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"));
        $ic103$ = SubLObjectFactory.makeString("Apply FUNCTION to every all-isa of TERM\n   (FUNCTION must not affect the current sbhl search state)");
        $ic104$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11675", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("HL-TERM-P")));
        $ic105$ = SubLObjectFactory.makeSymbol("MAP-ALL-INSTANCES");
        $ic106$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11675", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"));
        $ic107$ = SubLObjectFactory.makeString("Apply FUNCTION to each unique instance of all specs of COLLECTION.");
        $ic108$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11675", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")));
        $ic109$ = SubLObjectFactory.makeSymbol("ANY-WRT-ALL-ISA");
        $ic110$ = SubLObjectFactory.makeString("Return the first encountered non-nil result of applying FUNCTION to the all-isa of TERM\n   (FUNCTION may not affect the current sbhl search state)");
        $ic111$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("HL-TERM-P")));
        $ic112$ = SubLObjectFactory.makeSymbol("S#19563", "CYC");
        $ic113$ = SubLObjectFactory.makeKeyword("BREADTH");
        $ic114$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic115$ = SubLObjectFactory.makeKeyword("STACK");
        $ic116$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#4D5E436"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1526883"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#15AA083"));
        $ic117$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic118$ = SubLObjectFactory.makeSymbol("COUNT-ALL-INSTANCES");
        $ic119$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"));
        $ic120$ = SubLObjectFactory.makeString("Counts the number of instances in COLLECTION and then returns the count.");
        $ic121$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"));
        $ic122$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $ic123$ = SubLObjectFactory.makeSymbol("COUNT-ALL-QUOTED-INSTANCES");
        $ic124$ = SubLObjectFactory.makeString("Counts the number of quoted instances in COLLECTION and then returns the count.");
        $ic125$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionIntersectionFn"));
        $ic126$ = SubLObjectFactory.makeSymbol("ISA?");
        $ic127$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"));
        $ic128$ = SubLObjectFactory.makeString("Returns whether TERM is an instance of COLLECTION via the SBHL, i.e. isa and genls assertions.\n@note This function does _not_ use defns to determine membership in COLLECTION.\n@see has-type?\n@see quiet-has-type?");
        $ic129$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $ic130$ = SubLObjectFactory.makeSymbol("ISA-IN-MTS?");
        $ic131$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12701", "CYC"));
        $ic132$ = SubLObjectFactory.makeString("is <term> an element of <collection> via assertions in any mt in <mts>");
        $ic133$ = SubLObjectFactory.makeSymbol("ISA-IN-ANY-MT?");
        $ic134$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC"));
        $ic135$ = SubLObjectFactory.makeString("is <term> an element of <collection> in any mt");
        $ic136$ = SubLObjectFactory.makeSymbol("ANY-ISA?");
        $ic137$ = SubLObjectFactory.makeString("Returns whether TERM is an instance of any collection in COLLECTIONS");
        $ic138$ = SubLObjectFactory.makeSymbol("ISA-ANY?");
        $ic139$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Collection"));
        $ic140$ = SubLObjectFactory.makeString("~A is not a collection");
        $ic141$ = SubLObjectFactory.makeSymbol("ANY-ISA-ANY?");
        $ic142$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13098", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#19640", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"));
        $ic143$ = SubLObjectFactory.makeString("@return booleanp; whether any term in TERMS is an instance of any collection in COLLECTIONS");
        $ic144$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13098", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#19640", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $ic145$ = SubLObjectFactory.makeSymbol("NOT-ISA?");
        $ic146$ = SubLObjectFactory.makeString("@return booleanp; whether TERM is known to not be an instance of COLLECTION");
        $ic147$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("HL-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")));
        $ic148$ = SubLObjectFactory.makeSymbol("WHY-ISA?");
        $ic149$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11669", "CYC"));
        $ic150$ = SubLObjectFactory.makeString("Returns justification of (isa TERM COLLECTION)");
        $ic151$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $ic152$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $ic153$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRUE"));
        $ic154$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("resultIsa"));
        $ic155$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("resultIsaArg"));
        $ic156$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgResultIsa"));
        $ic157$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgResultIsaReln"));
        $ic158$ = SubLObjectFactory.makeSymbol("WHY-NOT-ISA?");
        $ic159$ = SubLObjectFactory.makeString("Returns justification of (not (isa TERM COLLECTION))");
        $ic160$ = SubLObjectFactory.makeSymbol("INSTANCES?");
        $ic161$ = SubLObjectFactory.makeString("Returns whether COLLECTION has any direct instances");
        $ic162$ = SubLObjectFactory.makeSymbol("S#19579", "CYC");
        $ic163$ = SubLObjectFactory.makeSymbol("S#12263", "CYC");
        $ic164$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic165$ = SubLObjectFactory.makeSymbol("MAX-FLOOR-MTS-OF-ISA-PATHS");
        $ic166$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"));
        $ic167$ = SubLObjectFactory.makeString("Returns in what (most-genl) mts TERM is an instance of COLLECTION");
        $ic168$ = SubLObjectFactory.makeSymbol("LIST");
        $ic169$ = SubLObjectFactory.makeSymbol("S#19589", "CYC");
        $ic170$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic171$ = SubLObjectFactory.makeSymbol("S#19590", "CYC");
        $ic172$ = SubLObjectFactory.makeSymbol("SETS-EQUAL?");
        $ic173$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("resultQuotedIsa"));
        $ic174$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("evaluationResultQuotedIsa"));
        $ic175$ = SubLObjectFactory.makeSymbol("HLMT-EQUAL");
        $ic176$ = SubLObjectFactory.makeSymbol("S#17613", "CYC");
        $ic177$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $ic178$ = ConsesLow.list((SubLObject)module0259.ONE_INTEGER);
        $ic179$ = SubLObjectFactory.makeSymbol("INSTANCEOF-AFTER-ADDING");
        $ic180$ = SubLObjectFactory.makeSymbol("ISA-AFTER-ADDING");
        $ic181$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#19641", "CYC"));
        $ic182$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn"));
        $ic183$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#19642", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#19643", "CYC"));
        $ic184$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#19643", "CYC"));
        $ic185$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheCollectionOf"));
        $ic186$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#19644", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10996", "CYC"));
        $ic187$ = SubLObjectFactory.makeKeyword("FORWARD");
        $ic188$ = SubLObjectFactory.makeSymbol("INSTANCEOF-AFTER-REMOVING");
        $ic189$ = SubLObjectFactory.makeSymbol("ISA-AFTER-REMOVING");
        $ic190$ = SubLObjectFactory.makeSymbol("QUOTED-ISA?");
        $ic191$ = SubLObjectFactory.makeString("Returns whether TERM is a quoted instance of COLLECTION via the SBHL, i.e. quotedIsa and genls assertions.\n@note This function does _not_ use defns to determine membership in COLLECTION.\n@see has-type?\n@see quiet-has-type?");
        $ic192$ = SubLObjectFactory.makeSymbol("QUOTED-ISA-IN-ANY-MT?");
        $ic193$ = SubLObjectFactory.makeSymbol("ANY-QUOTED-ISA?");
        $ic194$ = SubLObjectFactory.makeSymbol("QUOTED-ISA-ANY?");
        $ic195$ = SubLObjectFactory.makeSymbol("ALL-QUOTED-ISA?");
        $ic196$ = SubLObjectFactory.makeString("Returns whether TERM is a quoted instance of all collections in COLLECTIONS");
        $ic197$ = SubLObjectFactory.makeSymbol("NOT-QUOTED-ISA?");
        $ic198$ = SubLObjectFactory.makeSymbol("QUOTED-INSTANCES");
        $ic199$ = SubLObjectFactory.makeSymbol("UNION-ALL-QUOTED-INSTANCES");
        $ic200$ = SubLObjectFactory.makeString("Returns set of all quoted instances of each collection in COLS (expensive)");
        $ic201$ = SubLObjectFactory.makeSymbol("MAP-ALL-QUOTED-ISA");
        $ic202$ = SubLObjectFactory.makeString("Apply FUNCTION to every all-quoted-isa of TERM\n   (FUNCTION must not affect the current sbhl search state)");
        $ic203$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#30670C2"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#3FCACC8"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#2FCACC9"));
        $ic204$ = SubLObjectFactory.makeSymbol("ALL-QUOTED-ISA");
        $ic205$ = SubLObjectFactory.makeSymbol("ALL-QUOTED-ISAS-WRT");
        $ic206$ = SubLObjectFactory.makeSymbol("ALL-QUOTED-INSTANCES");
        $ic207$ = SubLObjectFactory.makeSymbol("ALL-QUOTED-ISA-AMONG");
        $ic208$ = SubLObjectFactory.makeString("Returns those elements of COLLECTIONS that include TERM as an all-quoted-instance");
        $ic209$ = SubLObjectFactory.makeSymbol("QUOTED-INSTANCEOF-AFTER-ADDING");
        $ic210$ = SubLObjectFactory.makeSymbol("QUOTED-INSTANCEOF-AFTER-REMOVING");
        $ic211$ = SubLObjectFactory.makeKeyword("GAF");
    }
    
    public static final class $f16960$BinaryFunction extends BinaryFunction
    {
        public $f16960$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INSTANCEOF-AFTER-ADDING"));
        }
        
        public SubLObject processItem(final SubLObject var612, final SubLObject var613) {
            return module0259.f16960(var612, var613);
        }
    }
    
    public static final class $f16965$BinaryFunction extends BinaryFunction
    {
        public $f16965$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INSTANCEOF-AFTER-REMOVING"));
        }
        
        public SubLObject processItem(final SubLObject var612, final SubLObject var613) {
            return module0259.f16965(var612, var613);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0259.class
	Total time: 11237 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/