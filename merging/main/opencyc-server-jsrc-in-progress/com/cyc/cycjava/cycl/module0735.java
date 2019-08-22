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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0735 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0735";
    public static final String myFingerPrint = "dcb32839a716c24969842a1206614f58adba9a75f34137de64a7b222622434c8";
    private static SubLSymbol $g5816$;
    private static SubLSymbol $g5817$;
    public static SubLSymbol $g5818$;
    private static SubLSymbol $g5819$;
    private static SubLSymbol $g5820$;
    private static SubLSymbol $g5821$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLObject $ic27$;
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
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
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
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLList $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLList $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLList $ic68$;
    private static final SubLObject $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLList $ic73$;
    private static final SubLObject $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLList $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLList $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLList $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLList $ic82$;
    private static final SubLObject $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLObject $ic87$;
    private static final SubLObject $ic88$;
    private static final SubLObject $ic89$;
    private static final SubLObject $ic90$;
    private static final SubLObject $ic91$;
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
    private static final SubLObject $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLObject $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLObject $ic108$;
    private static final SubLList $ic109$;
    private static final SubLList $ic110$;
    private static final SubLList $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLList $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLList $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLObject $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLObject $ic124$;
    private static final SubLObject $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLObject $ic127$;
    private static final SubLObject $ic128$;
    private static final SubLObject $ic129$;
    private static final SubLObject $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLList $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLList $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLList $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLList $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLList $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLList $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLList $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLList $ic146$;
    private static final SubLList $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLList $ic152$;
    private static final SubLList $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLList $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLList $ic157$;
    private static final SubLList $ic158$;
    private static final SubLObject $ic159$;
    private static final SubLObject $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLObject $ic162$;
    private static final SubLList $ic163$;
    private static final SubLList $ic164$;
    private static final SubLList $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLList $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLList $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLList $ic176$;
    
    public static SubLObject f45223(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0018.f984();
    }
    
    public static SubLObject f45224(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var3, var3, (SubLObject)$ic0$);
        var6 = var3.first();
        SubLObject var10 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic0$);
        var7 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic0$);
        var8 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic0$);
        var9 = var10.first();
        var10 = var10.rest();
        if (NIL == var10) {
            final SubLObject var11 = module0147.f9540(var8);
            final SubLObject var12 = module0147.$g2095$.currentBinding(var4);
            final SubLObject var13 = module0147.$g2094$.currentBinding(var4);
            final SubLObject var14 = module0147.$g2096$.currentBinding(var4);
            try {
                module0147.$g2095$.bind(module0147.f9545(var11), var4);
                module0147.$g2094$.bind(module0147.f9546(var11), var4);
                module0147.$g2096$.bind(module0147.f9549(var11), var4);
                var5 = f45225(var7);
            }
            finally {
                module0147.$g2096$.rebind(var14, var4);
                module0147.$g2094$.rebind(var13, var4);
                module0147.$g2095$.rebind(var12, var4);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        }
        return var5;
    }
    
    public static SubLObject f45226(final SubLObject var3) {
        return module0738.f45808(var3);
    }
    
    public static SubLObject f45227(final SubLObject var3) {
        return module0738.f45809(var3);
    }
    
    public static SubLObject f45225(final SubLObject var1) {
        SubLObject var3;
        final SubLObject var2 = var3 = module0205.f13180(var1, (SubLObject)UNPROVIDED);
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var3, var2, (SubLObject)$ic4$);
        var4 = var3.first();
        var3 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var3, var2, (SubLObject)$ic4$);
        var5 = var3.first();
        var3 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var3, var2, (SubLObject)$ic4$);
        var6 = var3.first();
        var3 = var3.rest();
        if (NIL == var3) {
            final SubLObject var7 = module0147.f9507($ic5$);
            final SubLObject var8 = module0147.f9551();
            final SubLObject var9 = module0731.f44730(var6, var4, var7, var8, (SubLObject)UNPROVIDED);
            return module0004.f104(var5, var9, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic4$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45228(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (NIL != f45225(var1)) {
            final SubLObject var3 = f45229(var1);
            module0347.f23330(var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45229(final SubLObject var23) {
        return module0191.f11990((SubLObject)$ic8$, var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45230(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0018.f984();
    }
    
    public static SubLObject f45231(final SubLObject var17, final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        return module0052.f3709(module0731.f44730(var19, var17, (SubLObject)T, module0147.$g2095$.getDynamicValue(var20), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f45232(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0018.f984();
    }
    
    public static SubLObject f45233(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        return module0217.f14221(var3, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45234(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = module0205.f13180(var1, (SubLObject)UNPROVIDED);
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic12$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic12$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic12$);
        var8 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            final SubLObject var9 = module0584.$g4389$.currentBinding(var3);
            try {
                module0584.$g4389$.bind(module0147.f9507($ic5$), var3);
                SubLObject var11;
                final SubLObject var10 = var11 = module0730.f44564(var7, var6, module0147.f9552((SubLObject)UNPROVIDED));
                SubLObject var12 = (SubLObject)NIL;
                var12 = var11.first();
                while (NIL != var11) {
                    var3.resetMultipleValues();
                    final SubLObject var13 = module0235.f15474(var12, var8, (SubLObject)T, (SubLObject)T);
                    final SubLObject var14 = var3.secondMultipleValue();
                    var3.resetMultipleValues();
                    if (NIL != var13) {
                        final SubLObject var15 = module0233.f15361(var13, var1);
                        final SubLObject var16 = f45229(var15);
                        module0347.f23330(var16, var13, var14);
                    }
                    var11 = var11.rest();
                    var12 = var11.first();
                }
            }
            finally {
                module0584.$g4389$.rebind(var9, var3);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic12$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45235(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0018.f984();
    }
    
    public static SubLObject f45236(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)ZERO_INTEGER;
        final SubLObject var5 = module0205.f13333(var1);
        final SubLObject var6 = (SubLObject)$ic17$;
        final SubLObject var7 = module0056.f4145(var6);
        SubLObject var8 = (SubLObject)NIL;
        final SubLObject var9 = module0139.$g1635$.currentBinding(var3);
        try {
            module0139.$g1635$.bind(module0139.f9007(), var3);
            final SubLObject var10 = $ic18$;
            final SubLObject var12_37 = module0141.$g1714$.currentBinding(var3);
            final SubLObject var11 = module0141.$g1715$.currentBinding(var3);
            try {
                module0141.$g1714$.bind((NIL != var10) ? var10 : module0141.f9283(), var3);
                module0141.$g1715$.bind((SubLObject)((NIL != var10) ? $ic19$ : module0141.$g1715$.getDynamicValue(var3)), var3);
                if (NIL != var10 && NIL != module0136.f8864() && NIL == module0141.f9279(var10)) {
                    final SubLObject var12 = module0136.$g1591$.getDynamicValue(var3);
                    if (var12.eql((SubLObject)$ic20$)) {
                        module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic21$, var10, (SubLObject)$ic22$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else if (var12.eql((SubLObject)$ic23$)) {
                        module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic24$, (SubLObject)$ic21$, var10, (SubLObject)$ic22$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else if (var12.eql((SubLObject)$ic25$)) {
                        Errors.warn((SubLObject)$ic21$, var10, (SubLObject)$ic22$);
                    }
                    else {
                        Errors.warn((SubLObject)$ic26$, module0136.$g1591$.getDynamicValue(var3));
                        Errors.cerror((SubLObject)$ic24$, (SubLObject)$ic21$, var10, (SubLObject)$ic22$);
                    }
                }
                final SubLObject var12_38 = module0141.$g1670$.currentBinding(var3);
                final SubLObject var13_40 = module0141.$g1671$.currentBinding(var3);
                final SubLObject var13 = module0141.$g1672$.currentBinding(var3);
                final SubLObject var14 = module0141.$g1674$.currentBinding(var3);
                final SubLObject var15 = module0137.$g1605$.currentBinding(var3);
                try {
                    module0141.$g1670$.bind(module0137.f8955($ic27$), var3);
                    module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic27$)), var3);
                    module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic27$)), var3);
                    module0141.$g1674$.bind((SubLObject)NIL, var3);
                    module0137.$g1605$.bind(module0137.f8955($ic27$), var3);
                    if (NIL != module0136.f8865() || NIL != module0244.f15795(module0205.f13333(var1), module0137.f8955((SubLObject)UNPROVIDED))) {
                        final SubLObject var12_39 = module0141.$g1677$.currentBinding(var3);
                        final SubLObject var13_41 = module0138.$g1619$.currentBinding(var3);
                        final SubLObject var14_45 = module0141.$g1674$.currentBinding(var3);
                        try {
                            module0141.$g1677$.bind(module0141.f9210(), var3);
                            module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic27$)), var3);
                            module0141.$g1674$.bind((SubLObject)NIL, var3);
                            module0249.f16055(var5, (SubLObject)UNPROVIDED);
                            for (var8 = (SubLObject)ConsesLow.list(module0205.f13333(var1), module0141.f9195()); NIL != var8; var8 = module0056.f4150(var7)) {
                                final SubLObject var32_46 = var8.first();
                                final SubLObject var16 = conses_high.second(var8);
                                final SubLObject var17 = var32_46;
                                final SubLObject var12_40 = module0141.$g1674$.currentBinding(var3);
                                try {
                                    module0141.$g1674$.bind(var16, var3);
                                    if (NIL != module0250.f16115(module0141.f9190(), var32_46)) {
                                        var4 = Numbers.add(var4, module0217.f14249(var17));
                                    }
                                    SubLObject var19;
                                    final SubLObject var18 = var19 = module0200.f12443(module0137.f8955($ic27$));
                                    SubLObject var20 = (SubLObject)NIL;
                                    var20 = var19.first();
                                    while (NIL != var19) {
                                        final SubLObject var12_41 = module0137.$g1605$.currentBinding(var3);
                                        final SubLObject var13_42 = module0141.$g1674$.currentBinding(var3);
                                        try {
                                            module0137.$g1605$.bind(var20, var3);
                                            module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var3)) : module0141.$g1674$.getDynamicValue(var3)), var3);
                                            final SubLObject var21 = module0228.f15229(var32_46);
                                            if (NIL != module0138.f8992(var21)) {
                                                final SubLObject var22 = module0242.f15664(var21, module0137.f8955((SubLObject)UNPROVIDED));
                                                if (NIL != var22) {
                                                    final SubLObject var23 = module0245.f15834(var22, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var23) {
                                                        SubLObject var24;
                                                        for (var24 = module0066.f4838(module0067.f4891(var23)); NIL == module0066.f4841(var24); var24 = module0066.f4840(var24)) {
                                                            var3.resetMultipleValues();
                                                            final SubLObject var25 = module0066.f4839(var24);
                                                            final SubLObject var26 = var3.secondMultipleValue();
                                                            var3.resetMultipleValues();
                                                            if (NIL != module0147.f9507(var25)) {
                                                                final SubLObject var12_42 = module0138.$g1623$.currentBinding(var3);
                                                                try {
                                                                    module0138.$g1623$.bind(var25, var3);
                                                                    SubLObject var57_61;
                                                                    for (var57_61 = module0066.f4838(module0067.f4891(var26)); NIL == module0066.f4841(var57_61); var57_61 = module0066.f4840(var57_61)) {
                                                                        var3.resetMultipleValues();
                                                                        final SubLObject var27 = module0066.f4839(var57_61);
                                                                        final SubLObject var28 = var3.secondMultipleValue();
                                                                        var3.resetMultipleValues();
                                                                        if (NIL != module0141.f9289(var27)) {
                                                                            final SubLObject var12_43 = module0138.$g1624$.currentBinding(var3);
                                                                            try {
                                                                                module0138.$g1624$.bind(var27, var3);
                                                                                final SubLObject var29 = var28;
                                                                                if (NIL != module0077.f5302(var29)) {
                                                                                    final SubLObject var30 = module0077.f5333(var29);
                                                                                    SubLObject var31;
                                                                                    SubLObject var32;
                                                                                    SubLObject var33;
                                                                                    for (var31 = module0032.f1741(var30), var32 = (SubLObject)NIL, var32 = module0032.f1742(var31, var30); NIL == module0032.f1744(var31, var32); var32 = module0032.f1743(var32)) {
                                                                                        var33 = module0032.f1745(var31, var32);
                                                                                        if (NIL != module0032.f1746(var32, var33) && NIL == module0249.f16059(var33, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var33, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var33, module0141.f9195()), var7);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var29.isList()) {
                                                                                    SubLObject var34 = var29;
                                                                                    SubLObject var35 = (SubLObject)NIL;
                                                                                    var35 = var34.first();
                                                                                    while (NIL != var34) {
                                                                                        if (NIL == module0249.f16059(var35, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var35, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var35, module0141.f9195()), var7);
                                                                                        }
                                                                                        var34 = var34.rest();
                                                                                        var35 = var34.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic28$, var29);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var12_43, var3);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var57_61);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var12_42, var3);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var24);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic29$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                }
                                            }
                                            else if (NIL != module0155.f9785(var21, (SubLObject)UNPROVIDED)) {
                                                SubLObject var28_72;
                                                final SubLObject var36 = var28_72 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var3), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var3), module0137.f8955((SubLObject)UNPROVIDED)));
                                                SubLObject var37 = (SubLObject)NIL;
                                                var37 = var28_72.first();
                                                while (NIL != var28_72) {
                                                    final SubLObject var12_44 = module0138.$g1625$.currentBinding(var3);
                                                    try {
                                                        module0138.$g1625$.bind(var37, var3);
                                                        final SubLObject var39;
                                                        final SubLObject var38 = var39 = Functions.funcall(var37, var21);
                                                        if (NIL != module0077.f5302(var39)) {
                                                            final SubLObject var40 = module0077.f5333(var39);
                                                            SubLObject var41;
                                                            SubLObject var42;
                                                            SubLObject var43;
                                                            for (var41 = module0032.f1741(var40), var42 = (SubLObject)NIL, var42 = module0032.f1742(var41, var40); NIL == module0032.f1744(var41, var42); var42 = module0032.f1743(var42)) {
                                                                var43 = module0032.f1745(var41, var42);
                                                                if (NIL != module0032.f1746(var42, var43) && NIL == module0249.f16059(var43, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var43, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var43, module0141.f9195()), var7);
                                                                }
                                                            }
                                                        }
                                                        else if (var39.isList()) {
                                                            SubLObject var44 = var39;
                                                            SubLObject var45 = (SubLObject)NIL;
                                                            var45 = var44.first();
                                                            while (NIL != var44) {
                                                                if (NIL == module0249.f16059(var45, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var45, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var45, module0141.f9195()), var7);
                                                                }
                                                                var44 = var44.rest();
                                                                var45 = var44.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)$ic28$, var39);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var12_44, var3);
                                                    }
                                                    var28_72 = var28_72.rest();
                                                    var37 = var28_72.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var13_42, var3);
                                            module0137.$g1605$.rebind(var12_41, var3);
                                        }
                                        var19 = var19.rest();
                                        var20 = var19.first();
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var12_40, var3);
                                }
                            }
                        }
                        finally {
                            module0141.$g1674$.rebind(var14_45, var3);
                            module0138.$g1619$.rebind(var13_41, var3);
                            module0141.$g1677$.rebind(var12_39, var3);
                        }
                    }
                    else {
                        module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic30$, module0205.f13333(var1), module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var15, var3);
                    module0141.$g1674$.rebind(var14, var3);
                    module0141.$g1672$.rebind(var13, var3);
                    module0141.$g1671$.rebind(var13_40, var3);
                    module0141.$g1670$.rebind(var12_38, var3);
                }
            }
            finally {
                module0141.$g1715$.rebind(var11, var3);
                module0141.$g1714$.rebind(var12_37, var3);
            }
            module0139.f9011(module0139.$g1635$.getDynamicValue(var3));
        }
        finally {
            module0139.$g1635$.rebind(var9, var3);
        }
        final SubLObject var46 = module0339.f22757();
        if (NIL != var46) {
            final SubLObject var47 = inference_datastructures_inference_oc.f25521(var46);
            if (NIL != var47 && var47.numL(var4)) {
                var4 = var47;
            }
        }
        return var4;
    }
    
    public static SubLObject f45237(final SubLObject var77, final SubLObject var78) {
        compatibility.default_struct_print_function(var77, var78, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45238(final SubLObject var77) {
        return (SubLObject)((var77.getClass() == $sX49438_native.class) ? T : NIL);
    }
    
    public static SubLObject f45239(final SubLObject var77) {
        assert NIL != f45238(var77) : var77;
        return var77.getField2();
    }
    
    public static SubLObject f45240(final SubLObject var77) {
        assert NIL != f45238(var77) : var77;
        return var77.getField3();
    }
    
    public static SubLObject f45241(final SubLObject var77) {
        assert NIL != f45238(var77) : var77;
        return var77.getField4();
    }
    
    public static SubLObject f45242(final SubLObject var77) {
        assert NIL != f45238(var77) : var77;
        return var77.getField5();
    }
    
    public static SubLObject f45243(final SubLObject var77) {
        assert NIL != f45238(var77) : var77;
        return var77.getField6();
    }
    
    public static SubLObject f45244(final SubLObject var77, final SubLObject var80) {
        assert NIL != f45238(var77) : var77;
        return var77.setField2(var80);
    }
    
    public static SubLObject f45245(final SubLObject var77, final SubLObject var80) {
        assert NIL != f45238(var77) : var77;
        return var77.setField3(var80);
    }
    
    public static SubLObject f45246(final SubLObject var77, final SubLObject var80) {
        assert NIL != f45238(var77) : var77;
        return var77.setField4(var80);
    }
    
    public static SubLObject f45247(final SubLObject var77, final SubLObject var80) {
        assert NIL != f45238(var77) : var77;
        return var77.setField5(var80);
    }
    
    public static SubLObject f45248(final SubLObject var77, final SubLObject var80) {
        assert NIL != f45238(var77) : var77;
        return var77.setField6(var80);
    }
    
    public static SubLObject f45249(SubLObject var81) {
        if (var81 == UNPROVIDED) {
            var81 = (SubLObject)NIL;
        }
        final SubLObject var82 = (SubLObject)new $sX49438_native();
        SubLObject var83;
        SubLObject var84;
        SubLObject var85;
        SubLObject var86;
        for (var83 = (SubLObject)NIL, var83 = var81; NIL != var83; var83 = conses_high.cddr(var83)) {
            var84 = var83.first();
            var85 = conses_high.cadr(var83);
            var86 = var84;
            if (var86.eql((SubLObject)$ic50$)) {
                f45244(var82, var85);
            }
            else if (var86.eql((SubLObject)$ic51$)) {
                f45245(var82, var85);
            }
            else if (var86.eql((SubLObject)$ic52$)) {
                f45246(var82, var85);
            }
            else if (var86.eql((SubLObject)$ic53$)) {
                f45247(var82, var85);
            }
            else if (var86.eql((SubLObject)$ic54$)) {
                f45248(var82, var85);
            }
            else {
                Errors.error((SubLObject)$ic55$, var84);
            }
        }
        return var82;
    }
    
    public static SubLObject f45250(final SubLObject var86, final SubLObject var87) {
        Functions.funcall(var87, var86, (SubLObject)$ic56$, (SubLObject)$ic57$, (SubLObject)FIVE_INTEGER);
        Functions.funcall(var87, var86, (SubLObject)$ic58$, (SubLObject)$ic50$, f45239(var86));
        Functions.funcall(var87, var86, (SubLObject)$ic58$, (SubLObject)$ic51$, f45240(var86));
        Functions.funcall(var87, var86, (SubLObject)$ic58$, (SubLObject)$ic52$, f45241(var86));
        Functions.funcall(var87, var86, (SubLObject)$ic58$, (SubLObject)$ic53$, f45242(var86));
        Functions.funcall(var87, var86, (SubLObject)$ic58$, (SubLObject)$ic54$, f45243(var86));
        Functions.funcall(var87, var86, (SubLObject)$ic59$, (SubLObject)$ic57$, (SubLObject)FIVE_INTEGER);
        return var86;
    }
    
    public static SubLObject f45251(final SubLObject var86, final SubLObject var87) {
        return f45250(var86, var87);
    }
    
    public static SubLObject f45252(final SubLObject var88) {
        return (SubLObject)makeBoolean(NIL != module0052.f3687(f45242(var88)) && (NIL == f45243(var88) || NIL != module0052.f3687(f45243(var88))));
    }
    
    public static SubLObject f45253(final SubLObject var88) {
        return (SubLObject)makeBoolean(NIL != f45243(var88) && NIL == module0052.f3687(f45243(var88)));
    }
    
    public static SubLObject f45254(final SubLObject var88) {
        while (NIL == module0052.f3687(f45242(var88)) && NIL == f45253(var88)) {
            final SubLObject var89 = module0052.f3693(f45242(var88));
            final SubLObject var90 = conses_high.second(var89);
            if (NIL != var90) {
                f45248(var88, module0052.f3709(var90));
            }
        }
        return var88;
    }
    
    public static SubLObject f45255(final SubLObject var88, final SubLObject var91, final SubLObject var19) {
        return (SubLObject)makeBoolean(NIL != module0235.f15474(f45240(var88), var91, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0235.f15474(f45241(var88), var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f45256(final SubLObject var88) {
        final SubLThread var89 = SubLProcess.currentSubLThread();
        SubLObject var90 = (SubLObject)NIL;
        SubLObject var91 = (SubLObject)NIL;
        while ((NIL == var90 || NIL == var91) && NIL == f45252(var88)) {
            if (NIL == f45253(var88)) {
                f45254(var88);
            }
            while (NIL == var90 && NIL != f45253(var88)) {
                final SubLObject var92 = module0052.f3693(f45243(var88));
                final SubLObject var93 = f45239(var88);
                if (NIL != module0737.f45321(var92, (SubLObject)UNPROVIDED) && NIL != module0737.f45517(var92)) {
                    var89.resetMultipleValues();
                    final SubLObject var94 = module0738.f45778(var92, var93, (SubLObject)UNPROVIDED);
                    final SubLObject var95 = var89.secondMultipleValue();
                    var89.resetMultipleValues();
                    if (NIL == var94) {
                        continue;
                    }
                    final SubLObject var96 = module0737.f45495(var92, (SubLObject)NIL);
                    final SubLObject var97 = module0737.f45336(var92);
                    if (NIL == f45255(var88, var96, var97)) {
                        continue;
                    }
                    var90 = var96;
                    var91 = (SubLObject)ConsesLow.cons(var97, var95);
                }
            }
        }
        return Values.values((SubLObject)((NIL != var90) ? ConsesLow.list(f45239(var88), var90, var91) : NIL), var88, Types.sublisp_null(var90));
    }
    
    public static SubLObject f45257(final SubLObject var1) {
        SubLObject var3;
        final SubLObject var2 = var3 = module0205.f13180(var1, (SubLObject)UNPROVIDED);
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var3, var2, (SubLObject)$ic63$);
        var4 = var3.first();
        var3 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var3, var2, (SubLObject)$ic63$);
        var5 = var3.first();
        var3 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var3, var2, (SubLObject)$ic63$);
        var6 = var3.first();
        var3 = var3.rest();
        if (NIL == var3) {
            final SubLObject var7 = module0737.f45723((SubLObject)UNPROVIDED);
            final SubLObject var8 = f45249((SubLObject)ConsesLow.list((SubLObject)$ic53$, var7, (SubLObject)$ic50$, var4, (SubLObject)$ic51$, var5, (SubLObject)$ic52$, var6));
            return module0052.f3689(var8, Symbols.symbol_function((SubLObject)$ic61$), Symbols.symbol_function((SubLObject)$ic62$), (SubLObject)UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic63$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45258(final SubLObject var100) {
        return conses_high.second(var100).rest();
    }
    
    public static SubLObject f45259(final SubLObject var101, final SubLObject var18, final SubLObject var92) {
        SubLObject var102 = (SubLObject)NIL;
        SubLObject var103 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var92, var92, (SubLObject)$ic66$);
        var102 = var92.first();
        final SubLObject var104 = var103 = var92.rest();
        return module0202.f12768(var101, var18, var102);
    }
    
    public static SubLObject f45260(final SubLObject var104) {
        module0340.f22938(var104);
        SubLObject var105 = (SubLObject)$ic68$;
        SubLObject var106 = (SubLObject)NIL;
        var106 = var105.first();
        while (NIL != var105) {
            module0340.f22944(var104, var106);
            var105 = var105.rest();
            var106 = var105.first();
        }
        return var104;
    }
    
    public static SubLObject f45261(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0018.f984();
    }
    
    public static SubLObject f45262(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0217.f14223(var3, (SubLObject)ONE_INTEGER, var4);
        final SubLObject var6 = module0217.f14223(var4, (SubLObject)ONE_INTEGER, $ic69$);
        return Numbers.add(var5, Numbers.multiply(var6, $g5819$.getGlobalValue()));
    }
    
    public static SubLObject f45263(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0205.f13389(var1, (SubLObject)UNPROVIDED);
        final SubLObject var7 = module0219.f14509(var4, (SubLObject)ONE_INTEGER, var5, (SubLObject)NIL, (SubLObject)UNPROVIDED);
        SubLObject var8 = (SubLObject)NIL;
        if (NIL == var7) {
            final SubLObject var9 = module0584.$g4396$.currentBinding(var3);
            try {
                module0584.$g4396$.bind(module0147.f9551(), var3);
                final SubLObject var10 = module0731.f44730(var6, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != module0004.f104(var4, var10, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                    module0347.f23330(f45229(module0202.f12768(var5, var4, var6)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var8 = (SubLObject)T;
                }
            }
            finally {
                module0584.$g4396$.rebind(var9, var3);
            }
        }
        if (NIL == var8) {
            SubLObject var11 = var7;
            SubLObject var12 = (SubLObject)NIL;
            var12 = var11.first();
            while (NIL == var8 && NIL != var11) {
                if (NIL != module0209.f13556(var6, module0178.f11335(var12))) {
                    var8 = (SubLObject)T;
                    module0347.f23330(var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                var11 = var11.rest();
                var12 = var11.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45264(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0018.f984();
    }
    
    public static SubLObject f45265(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13389(var1, (SubLObject)UNPROVIDED);
        return Numbers.multiply((SubLObject)TWO_INTEGER, Sequences.length(module0730.f44560(var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f45266(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0205.f13389(var1, (SubLObject)UNPROVIDED);
        SubLObject var7 = module0730.f44560(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var8 = (SubLObject)NIL;
        var8 = var7.first();
        while (NIL != var7) {
            SubLObject var28_113;
            final SubLObject var9 = var28_113 = module0730.f44574(var8, (SubLObject)ConsesLow.list(var5));
            SubLObject var10 = (SubLObject)NIL;
            var10 = var28_113.first();
            while (NIL != var28_113) {
                final SubLObject var11 = var10.first();
                if (NIL != Strings.stringE(var6, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var3.resetMultipleValues();
                    final SubLObject var12 = module0235.f15474(var4, var8, (SubLObject)T, (SubLObject)T);
                    final SubLObject var13 = var3.secondMultipleValue();
                    var3.resetMultipleValues();
                    if (NIL != var12) {
                        module0347.f23330(conses_high.cadr(var10), var12, ConsesLow.append(conses_high.cddr(var10), var13));
                    }
                }
                var28_113 = var28_113.rest();
                var10 = var28_113.first();
            }
            var7 = var7.rest();
            var8 = var7.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45267(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0018.f984();
    }
    
    public static SubLObject f45268(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0731.f44778(var3, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)ZERO_INTEGER;
        SubLObject var6 = var4;
        SubLObject var7 = (SubLObject)NIL;
        var7 = var6.first();
        while (NIL != var6) {
            var5 = Numbers.add(var5, module0217.f14221(var7, (SubLObject)ONE_INTEGER, $ic74$, (SubLObject)UNPROVIDED));
            var6 = var6.rest();
            var7 = var6.first();
        }
        return Numbers.multiply((SubLObject)TWO_INTEGER, var5);
    }
    
    public static SubLObject f45269(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0731.f44778(var4, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var7 = module0205.f13389(var1, (SubLObject)UNPROVIDED);
        SubLObject var8 = var5;
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            SubLObject var28_119 = module0732.f44924(var9, (SubLObject)UNPROVIDED);
            SubLObject var10 = (SubLObject)NIL;
            var10 = var28_119.first();
            while (NIL != var28_119) {
                SubLObject var28_120;
                final SubLObject var11 = var28_120 = module0730.f44574(var4, (SubLObject)ConsesLow.list(var10));
                SubLObject var12 = (SubLObject)NIL;
                var12 = var28_120.first();
                while (NIL != var28_120) {
                    final SubLObject var13 = var12.first();
                    if (NIL != Strings.stringE(var7, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var3.resetMultipleValues();
                        final SubLObject var14 = module0235.f15474(var10, var6, (SubLObject)T, (SubLObject)T);
                        final SubLObject var15 = var3.secondMultipleValue();
                        var3.resetMultipleValues();
                        if (NIL != var14) {
                            module0347.f23330(conses_high.cadr(var12), var14, ConsesLow.append(conses_high.cddr(var12), var15));
                        }
                    }
                    var28_120 = var28_120.rest();
                    var12 = var28_120.first();
                }
                var28_119 = var28_119.rest();
                var10 = var28_119.first();
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45270(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0018.f984();
    }
    
    public static SubLObject f45271(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return Numbers.multiply((SubLObject)TWO_INTEGER, f45262(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f45272(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0205.f13389(var1, (SubLObject)UNPROVIDED);
        SubLObject var8;
        final SubLObject var7 = var8 = module0730.f44574(var4, (SubLObject)ConsesLow.list(var5));
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            final SubLObject var10 = var9.first();
            var3.resetMultipleValues();
            final SubLObject var11 = module0235.f15474(var10, var6, (SubLObject)T, (SubLObject)T);
            final SubLObject var12 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            if (NIL != var11) {
                module0347.f23330(conses_high.cadr(var9), var11, ConsesLow.append(conses_high.cddr(var9), var12));
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45273(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0018.f984();
    }
    
    public static SubLObject f45274(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13389(var1, (SubLObject)UNPROVIDED);
        SubLObject var4 = (SubLObject)ZERO_INTEGER;
        SubLObject var5 = module0730.f44560(var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var6 = (SubLObject)NIL;
        var6 = var5.first();
        while (NIL != var5) {
            SubLObject var28_122;
            final SubLObject var7 = var28_122 = module0731.f44778(var6, (SubLObject)UNPROVIDED);
            SubLObject var8 = (SubLObject)NIL;
            var8 = var28_122.first();
            while (NIL != var28_122) {
                var4 = Numbers.add(var4, Numbers.multiply((SubLObject)TWO_INTEGER, module0217.f14221(var8, (SubLObject)ONE_INTEGER, $ic74$, (SubLObject)UNPROVIDED)));
                var28_122 = var28_122.rest();
                var8 = var28_122.first();
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        return var4;
    }
    
    public static SubLObject f45275(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0205.f13389(var1, (SubLObject)UNPROVIDED);
        SubLObject var7 = module0730.f44560(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var8 = (SubLObject)NIL;
        var8 = var7.first();
        while (NIL != var7) {
            var3.resetMultipleValues();
            final SubLObject var9 = module0235.f15474(var8, var4, (SubLObject)T, (SubLObject)T);
            final SubLObject var10 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            if (NIL != var9) {
                SubLObject var28_124;
                final SubLObject var11 = var28_124 = module0731.f44778(var8, (SubLObject)UNPROVIDED);
                SubLObject var12 = (SubLObject)NIL;
                var12 = var28_124.first();
                while (NIL != var28_124) {
                    SubLObject var28_125 = module0732.f44924(var12, (SubLObject)UNPROVIDED);
                    SubLObject var13 = (SubLObject)NIL;
                    var13 = var28_125.first();
                    while (NIL != var28_125) {
                        SubLObject var28_126;
                        final SubLObject var14 = var28_126 = module0730.f44574(var8, (SubLObject)ConsesLow.list(var13));
                        SubLObject var15 = (SubLObject)NIL;
                        var15 = var28_126.first();
                        while (NIL != var28_126) {
                            final SubLObject var16 = var15.first();
                            if (NIL != Strings.stringE(var6, var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                var3.resetMultipleValues();
                                final SubLObject var17 = module0235.f15474(var13, var5, (SubLObject)T, (SubLObject)T);
                                final SubLObject var18 = var3.secondMultipleValue();
                                var3.resetMultipleValues();
                                if (NIL != var17) {
                                    module0347.f23330(conses_high.cadr(var15), ConsesLow.append(var9, var17), ConsesLow.append(conses_high.cddr(var15), var10, var18));
                                }
                            }
                            var28_126 = var28_126.rest();
                            var15 = var28_126.first();
                        }
                        var28_125 = var28_125.rest();
                        var13 = var28_125.first();
                    }
                    var28_124 = var28_124.rest();
                    var12 = var28_124.first();
                }
            }
            var7 = var7.rest();
            var8 = var7.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45276(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0018.f984();
    }
    
    public static SubLObject f45277(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0731.f44778(var3, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)ZERO_INTEGER;
        SubLObject var6 = var4;
        SubLObject var7 = (SubLObject)NIL;
        var7 = var6.first();
        while (NIL != var6) {
            var5 = Numbers.add(var5, Numbers.multiply((SubLObject)TWO_INTEGER, module0217.f14221(var7, (SubLObject)ONE_INTEGER, $ic74$, (SubLObject)UNPROVIDED)));
            var6 = var6.rest();
            var7 = var6.first();
        }
        return var5;
    }
    
    public static SubLObject f45278(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0731.f44778(var4, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var7 = module0205.f13389(var1, (SubLObject)UNPROVIDED);
        SubLObject var8 = var5;
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            SubLObject var28_129 = module0732.f44924(var9, (SubLObject)UNPROVIDED);
            SubLObject var10 = (SubLObject)NIL;
            var10 = var28_129.first();
            while (NIL != var28_129) {
                SubLObject var28_130;
                final SubLObject var11 = var28_130 = module0730.f44574(var4, (SubLObject)ConsesLow.list(var10));
                SubLObject var12 = (SubLObject)NIL;
                var12 = var28_130.first();
                while (NIL != var28_130) {
                    final SubLObject var13 = var12.first();
                    var3.resetMultipleValues();
                    final SubLObject var14 = module0235.f15474(var10, var6, (SubLObject)T, (SubLObject)T);
                    final SubLObject var15 = var3.secondMultipleValue();
                    var3.resetMultipleValues();
                    if (NIL != var14) {
                        var3.resetMultipleValues();
                        final SubLObject var16 = module0235.f15474(var13, var7, (SubLObject)T, (SubLObject)T);
                        final SubLObject var17 = var3.secondMultipleValue();
                        var3.resetMultipleValues();
                        if (NIL != var16) {
                            module0347.f23330(conses_high.cadr(var12), ConsesLow.append(var14, var16), ConsesLow.append(conses_high.cddr(var12), var15, var17));
                        }
                    }
                    var28_130 = var28_130.rest();
                    var12 = var28_130.first();
                }
                var28_129 = var28_129.rest();
                var10 = var28_129.first();
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45279(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (NIL != module0035.f2013(f45280(var3))) {
            return (SubLObject)T;
        }
        if ($ic83$.eql(module0191.f11968(var3))) {
            var4.resetMultipleValues();
            final SubLObject var5 = f45281(var3);
            final SubLObject var6 = var4.secondMultipleValue();
            var4.resetMultipleValues();
            SubLObject var7 = (SubLObject)NIL;
            final SubLObject var8 = module0147.f9540(module0191.f11976(var3));
            final SubLObject var9 = module0147.$g2095$.currentBinding(var4);
            final SubLObject var10 = module0147.$g2094$.currentBinding(var4);
            final SubLObject var11 = module0147.$g2096$.currentBinding(var4);
            try {
                module0147.$g2095$.bind(module0147.f9545(var8), var4);
                module0147.$g2094$.bind(module0147.f9546(var8), var4);
                module0147.$g2096$.bind(module0147.f9549(var8), var4);
                var7 = (SubLObject)makeBoolean(NIL == module0173.f10955(var5) && NIL != (($ic84$ == module0191.f11978(var3)) ? module0492.f32095(var5, var6) : module0492.f32098(var5, var6)));
            }
            finally {
                module0147.$g2096$.rebind(var11, var4);
                module0147.$g2094$.rebind(var10, var4);
                module0147.$g2095$.rebind(var9, var4);
            }
            return var7;
        }
        if (NIL == f45282(module0191.f11967(var3))) {
            final SubLObject var12 = (SubLObject)NIL;
            return var12;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45280(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0191.f11976(var3);
        SubLObject var6 = (SubLObject)NIL;
        if ($ic84$ == module0191.f11978(var3)) {
            var4.resetMultipleValues();
            final SubLObject var7 = f45281(var3);
            final SubLObject var8 = var4.secondMultipleValue();
            final SubLObject var9 = var4.thirdMultipleValue();
            final SubLObject var10 = var4.fourthMultipleValue();
            final SubLObject var11 = var4.fifthMultipleValue();
            var4.resetMultipleValues();
            final SubLObject var12 = module0147.f9540(var5);
            final SubLObject var13 = module0147.$g2095$.currentBinding(var4);
            final SubLObject var14 = module0147.$g2094$.currentBinding(var4);
            final SubLObject var15 = module0147.$g2096$.currentBinding(var4);
            try {
                module0147.$g2095$.bind(module0147.f9545(var12), var4);
                module0147.$g2094$.bind(module0147.f9546(var12), var4);
                module0147.$g2096$.bind(module0147.f9549(var12), var4);
                var6 = f45283(var7, var8, var9, var10, var11);
            }
            finally {
                module0147.$g2096$.rebind(var15, var4);
                module0147.$g2094$.rebind(var14, var4);
                module0147.$g2095$.rebind(var13, var4);
            }
        }
        return var6;
    }
    
    public static SubLObject f45281(final SubLObject var3) {
        final SubLObject var4 = module0191.f11967(var3);
        final SubLObject var5 = f45284(var4);
        final SubLObject var6 = f45282(var4);
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        final SubLObject var10 = module0205.f13333(var4);
        if (var10.eql($ic87$) || var10.eql($ic88$) || var10.eql($ic89$) || var10.eql($ic90$)) {
            final SubLObject var11 = module0205.f13385(var4, (SubLObject)UNPROVIDED);
            var7 = var11.first();
            var9 = conses_high.cadr(var11);
            var8 = conses_high.cddr(var11).first();
        }
        else if (var10.eql($ic83$)) {
            final SubLObject var12 = module0205.f13385(var4, (SubLObject)UNPROVIDED);
            var7 = var12.first();
            var8 = conses_high.cadr(var12);
            var9 = $ic91$;
        }
        return Values.values(var7, var8, var9, var5, var6);
    }
    
    public static SubLObject f45285(final SubLObject var3) {
        final SubLObject var4 = f45280(var3);
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = var4;
        SubLObject var8 = (SubLObject)NIL;
        var8 = var7.first();
        while (NIL != var7) {
            if (NIL != assertion_handles_oc.f11035(var8)) {
                final SubLObject var9 = module0178.f11287(var8);
                if (NIL == conses_high.member(var9, var5, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var5 = (SubLObject)ConsesLow.cons(var9, var5);
                }
            }
            else if (NIL != module0191.f11952(var8)) {
                SubLObject var28_143 = module0333.f22438(var8);
                SubLObject var10 = (SubLObject)NIL;
                var10 = var28_143.first();
                while (NIL != var28_143) {
                    final SubLObject var11 = module0191.f11976(var10);
                    if (NIL == conses_high.member(var11, var5, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var5 = (SubLObject)ConsesLow.cons(var11, var5);
                    }
                    var28_143 = var28_143.rest();
                    var10 = var28_143.first();
                }
            }
            var7 = var7.rest();
            var8 = var7.first();
        }
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var3, var3, (SubLObject)$ic92$);
        var12 = var3.first();
        SubLObject var16 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var16, var3, (SubLObject)$ic92$);
        var13 = var16.first();
        var16 = var16.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var16, var3, (SubLObject)$ic92$);
        var14 = var16.first();
        var16 = var16.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var16, var3, (SubLObject)$ic92$);
        var15 = var16.first();
        var16 = var16.rest();
        if (NIL == var16) {
            SubLObject var17 = module0262.f17370(var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var9_148 = (SubLObject)NIL;
            var9_148 = var17.first();
            while (NIL != var17) {
                var6 = (SubLObject)ConsesLow.cons(module0191.f11990(var12, var13, var9_148, var15), var6);
                var17 = var17.rest();
                var9_148 = var17.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic92$);
        }
        return var6;
    }
    
    public static SubLObject f45286(final SubLObject var96, final SubLObject var149) {
        return module0035.f2201(var149, f45287(var96), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45287(final SubLObject var96) {
        return Mapping.mapcar((SubLObject)$ic94$, var96);
    }
    
    public static SubLObject f45288(final SubLObject var3) {
        final SubLObject var4 = module0172.f10922(var3);
        return (SubLObject)((NIL != f45279(var4)) ? f45280(var4) : NIL);
    }
    
    public static SubLObject f45289(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0018.f984();
    }
    
    public static SubLObject f45283(final SubLObject var151, final SubLObject var19, final SubLObject var134, SubLObject var135, SubLObject var136) {
        if (var135 == UNPROVIDED) {
            var135 = (SubLObject)NIL;
        }
        if (var136 == UNPROVIDED) {
            var136 = (SubLObject)NIL;
        }
        final SubLThread var152 = SubLProcess.currentSubLThread();
        SubLObject var153 = module0035.remove_if_not((SubLObject)$ic104$, module0738.f45810(var151, var19, var134, var135, module0147.$g2095$.getDynamicValue(var152)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var154 = (SubLObject)NIL;
        SubLObject var155 = (SubLObject)NIL;
        if (NIL == var153 && NIL == var136) {
            var153 = f45290(var151, var19, var134, var135);
        }
        if (NIL != var153) {
            SubLObject var156 = Sequences.find_if((SubLObject)$ic105$, var153, (SubLObject)$ic94$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var156) {
                var155 = module0191.f11968(var156);
            }
            if (NIL == var155) {
                var156 = Sequences.find($ic106$, var153, Symbols.symbol_function((SubLObject)EQL), (SubLObject)$ic94$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != var156) {
                    var155 = module0205.f13388(module0191.f11967(var156), (SubLObject)UNPROVIDED);
                }
            }
            SubLObject var157;
            for (var157 = module0066.f4838(module0067.f4891(module0732.f44997())); NIL == var154 && NIL == module0066.f4841(var157); var157 = module0066.f4840(var157)) {
                var152.resetMultipleValues();
                final SubLObject var158 = module0066.f4839(var157);
                final SubLObject var159 = var152.secondMultipleValue();
                var152.resetMultipleValues();
                final SubLObject var160 = Sequences.find(var158, var153, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)$ic94$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != var160) {
                    var154 = module0205.f13384(module0191.f11967(var160), var159, (SubLObject)UNPROVIDED);
                }
            }
            module0066.f4842(var157);
            if (NIL != module0731.f44656(var134, (SubLObject)UNPROVIDED) && !var154.equal(var134)) {
                SubLObject var161 = module0347.f23339((SubLObject)ConsesLow.list($ic108$, var154, var134), module0147.$g2095$.getDynamicValue(var152), (SubLObject)$ic84$, (SubLObject)$ic109$).first();
                SubLObject var162 = (SubLObject)NIL;
                var162 = var161.first();
                while (NIL != var161) {
                    final SubLObject var163 = var162;
                    if (NIL == conses_high.member(var163, var153, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)$ic107$))) {
                        var153 = (SubLObject)ConsesLow.cons(var163, var153);
                    }
                    var161 = var161.rest();
                    var162 = var161.first();
                }
            }
        }
        if (NIL != var154 && NIL != var155 && NIL == conses_high.member($ic74$, var153, Symbols.symbol_function((SubLObject)EQL), (SubLObject)$ic94$)) {
            SubLObject var161 = module0347.f23339((SubLObject)ConsesLow.list($ic74$, var154, var155), module0147.$g2095$.getDynamicValue(var152), (SubLObject)$ic84$, (SubLObject)$ic109$).first();
            SubLObject var162 = (SubLObject)NIL;
            var162 = var161.first();
            while (NIL != var161) {
                final SubLObject var163 = var162;
                if (NIL == conses_high.member(var163, var153, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)$ic107$))) {
                    var153 = (SubLObject)ConsesLow.cons(var163, var153);
                }
                var161 = var161.rest();
                var162 = var161.first();
            }
        }
        return var153;
    }
    
    public static SubLObject f45290(final SubLObject var151, final SubLObject var19, final SubLObject var134, final SubLObject var135) {
        SubLObject var152 = (SubLObject)NIL;
        if (NIL != module0035.f2012(var152)) {
            SubLObject var153 = module0764.f48458(var151, var19, f45291(var134), var135);
            SubLObject var154 = (SubLObject)NIL;
            var154 = var153.first();
            while (NIL != var153) {
                if (NIL == module0337.f22630(module0191.f11967(var154), (SubLObject)ConsesLow.list((SubLObject)$ic110$, var151, var134, var19))) {
                    var152 = (SubLObject)ConsesLow.cons(var154, var152);
                }
                var153 = var153.rest();
                var154 = var153.first();
            }
        }
        return var152;
    }
    
    public static SubLObject f45292(final SubLObject var155, final SubLObject var156) {
        SubLObject var158;
        final SubLObject var157 = var158 = var155.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var158, var157, (SubLObject)$ic111$);
        final SubLObject var159 = var158.rest();
        var158 = var158.first();
        SubLObject var160 = (SubLObject)NIL;
        SubLObject var161 = (SubLObject)NIL;
        SubLObject var162 = (SubLObject)NIL;
        SubLObject var163 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var158, var157, (SubLObject)$ic111$);
        var160 = var158.first();
        var158 = var158.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var158, var157, (SubLObject)$ic111$);
        var161 = var158.first();
        var158 = var158.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var158, var157, (SubLObject)$ic111$);
        var162 = var158.first();
        var158 = var158.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var158, var157, (SubLObject)$ic111$);
        var163 = var158.first();
        var158 = var158.rest();
        if (NIL == var158) {
            final SubLObject var164;
            var158 = (var164 = var159);
            return (SubLObject)ConsesLow.list((SubLObject)$ic112$, (SubLObject)ConsesLow.list((SubLObject)$ic113$, var161), (SubLObject)ConsesLow.listS((SubLObject)$ic114$, (SubLObject)ConsesLow.listS(var160, new SubLObject[] { var161, $ic115$, var162, $ic116$, var163, $ic117$ }), ConsesLow.append(var164, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic118$, (SubLObject)ConsesLow.listS(var160, new SubLObject[] { var161, $ic115$, var162, $ic116$, var163, $ic117$ }), ConsesLow.append(var164, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var157, (SubLObject)$ic111$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45293(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic119$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic119$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic119$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var8 = f45291(var6);
            final SubLObject var9 = f45282(var1);
            if (NIL != var8) {
                final SubLObject var10 = module0492.f32096(var5, var8, var9);
                f45294(var10, var1, var7);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic119$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45294(final SubLObject var164, final SubLObject var1, final SubLObject var165) {
        final SubLThread var166 = SubLProcess.currentSubLThread();
        SubLObject var167 = var164;
        SubLObject var168 = (SubLObject)NIL;
        var168 = var167.first();
        while (NIL != var167) {
            var166.resetMultipleValues();
            final SubLObject var169 = (NIL != f45284(var1)) ? f45295(var168, var165, (SubLObject)T, (SubLObject)T) : module0235.f15474(var168, var165, (SubLObject)T, (SubLObject)T);
            final SubLObject var170 = var166.secondMultipleValue();
            var166.resetMultipleValues();
            if (NIL != var169) {
                final SubLObject var171 = module0233.f15361(var169, var1);
                final SubLObject var172 = f45296(var171);
                module0347.f23330(var172, var169, var170);
            }
            var167 = var167.rest();
            var168 = var167.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45296(final SubLObject var23) {
        return module0191.f11990((SubLObject)$ic120$, var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45295(final SubLObject var166, final SubLObject var165, SubLObject var167, SubLObject var168) {
        if (var167 == UNPROVIDED) {
            var167 = (SubLObject)T;
        }
        if (var168 == UNPROVIDED) {
            var168 = (SubLObject)NIL;
        }
        return module0235.f15474(var166.isString() ? Strings.string_downcase(var166, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : var166, var165.isString() ? Strings.string_downcase(var165, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : var165, var167, var168);
    }
    
    public static SubLObject f45291(final SubLObject var134) {
        SubLObject var135 = (SubLObject)NIL;
        if (NIL != module0731.f44656(var134, (SubLObject)UNPROVIDED)) {
            var135 = module0731.f44658(var134);
        }
        else if (NIL != module0731.f44690(var134, (SubLObject)UNPROVIDED)) {
            var135 = Sequences.remove_if(Symbols.symbol_function((SubLObject)$ic121$), module0260.f17034(var134, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0259.f16854(var134, $ic122$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var135 = module0035.remove_if_not((SubLObject)$ic123$, module0260.f17034(var134, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (var134.eql($ic124$)) {
            var135 = module0035.remove_if_not((SubLObject)$ic123$, module0220.f14562($ic124$, $ic125$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (var134.eql($ic91$)) {
            var135 = (SubLObject)$ic126$;
        }
        if (NIL == module0731.f44656(var134, (SubLObject)UNPROVIDED)) {
            final SubLObject var136 = module0732.f44973(var134, (SubLObject)UNPROVIDED);
            if (NIL != var136) {
                final SubLObject var137 = f45291(var136);
                if (var137.isVector()) {
                    final SubLObject var138 = var137;
                    final SubLObject var139 = (SubLObject)NIL;
                    SubLObject var140;
                    SubLObject var141;
                    SubLObject var142;
                    SubLObject var143;
                    for (var140 = Sequences.length(var138), var141 = (SubLObject)NIL, var141 = (SubLObject)ZERO_INTEGER; var141.numL(var140); var141 = Numbers.add(var141, (SubLObject)ONE_INTEGER)) {
                        var142 = ((NIL != var139) ? Numbers.subtract(var140, var141, (SubLObject)ONE_INTEGER) : var141);
                        var143 = Vectors.aref(var138, var142);
                        var135 = (SubLObject)ConsesLow.cons(var143, var135);
                    }
                }
                else {
                    SubLObject var144 = var137;
                    SubLObject var145 = (SubLObject)NIL;
                    var145 = var144.first();
                    while (NIL != var144) {
                        var135 = (SubLObject)ConsesLow.cons(var145, var135);
                        var144 = var144.rest();
                        var145 = var144.first();
                    }
                }
                var135 = Sequences.delete_duplicates(var135, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        if (var135 != $ic126$ && NIL != module0256.f16576($ic127$, var134, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var135 = (SubLObject)$ic126$;
        }
        if (NIL != module0256.f16576($ic128$, var134, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && var135.isList()) {
            var135 = ConsesLow.append(var135, module0035.remove_if_not((SubLObject)$ic123$, module0220.f14562($ic124$, $ic125$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            var135 = ConsesLow.append(var135, module0260.f17034($ic129$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return var135;
    }
    
    public static SubLObject f45297(final SubLObject var106) {
        return module0259.f16854(var106, $ic130$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45298(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic147$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic147$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic147$);
        var8 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            final SubLObject var9 = f45291(var7);
            final SubLObject var10 = f45284(var1);
            final SubLObject var11 = f45282(var1);
            final SubLObject var12 = module0585.$g4447$.currentBinding(var3);
            try {
                module0585.$g4447$.bind((SubLObject)((NIL == var10) ? $ic148$ : $ic149$), var3);
                if (var9.isList()) {
                    SubLObject var13 = (SubLObject)NIL;
                    SubLObject var14 = module0202.f12702(var1);
                    SubLObject var15 = (SubLObject)NIL;
                    final SubLObject var12_182 = module0584.$g4390$.currentBinding(var3);
                    try {
                        module0584.$g4390$.bind((SubLObject)$ic150$, var3);
                        SubLObject var16 = var9;
                        SubLObject var17 = (SubLObject)NIL;
                        var17 = var16.first();
                        while (NIL != var16) {
                            final SubLObject var18 = f45299(var8, var17);
                            if (NIL != var18) {
                                var13 = (SubLObject)T;
                                var14 = module0202.f12818((SubLObject)TWO_INTEGER, var17, var14);
                                f45294(var18, var14, var6);
                            }
                            var16 = var16.rest();
                            var17 = var16.first();
                        }
                        var15 = (SubLObject)makeBoolean(NIL == var13);
                    }
                    finally {
                        module0584.$g4390$.rebind(var12_182, var3);
                    }
                    if (NIL != var15) {
                        final SubLObject var12_183 = module0584.$g4390$.currentBinding(var3);
                        try {
                            module0584.$g4390$.bind((SubLObject)$ic151$, var3);
                            SubLObject var16 = var9;
                            SubLObject var17 = (SubLObject)NIL;
                            var17 = var16.first();
                            while (NIL != var16) {
                                final SubLObject var18 = f45299(var8, var17);
                                if (NIL != var18) {
                                    var13 = (SubLObject)T;
                                    var14 = module0202.f12818((SubLObject)TWO_INTEGER, var17, var14);
                                    f45294(var18, var14, var6);
                                }
                                var16 = var16.rest();
                                var17 = var16.first();
                            }
                            var15 = (SubLObject)makeBoolean(NIL == var13);
                        }
                        finally {
                            module0584.$g4390$.rebind(var12_183, var3);
                        }
                    }
                }
                else {
                    f45294(f45300(var8), var1, var6);
                }
            }
            finally {
                module0585.$g4447$.rebind(var12, var3);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic147$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45284(final SubLObject var1) {
        return module0004.f104(module0205.f13333(var1), (SubLObject)$ic152$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45282(final SubLObject var1) {
        return module0004.f104(module0205.f13333(var1), (SubLObject)$ic153$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45300(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        SubLObject var21 = (SubLObject)NIL;
        final SubLObject var22 = module0584.$g4396$.currentBinding(var20);
        try {
            module0584.$g4396$.bind(module0147.$g2095$.getDynamicValue(var20), var20);
            var21 = module0731.f44783(var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0584.$g4396$.rebind(var22, var20);
        }
        return var21;
    }
    
    public static SubLObject f45299(final SubLObject var19, final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        SubLObject var108 = (SubLObject)NIL;
        final SubLObject var109 = module0584.$g4396$.currentBinding(var107);
        try {
            module0584.$g4396$.bind(module0147.$g2095$.getDynamicValue(var107), var107);
            var108 = module0731.f44805(var19, var106, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0584.$g4396$.rebind(var109, var107);
        }
        return var108;
    }
    
    public static SubLObject f45301(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic158$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic158$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic158$);
        var8 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            final SubLObject var9 = module0584.$g4396$.currentBinding(var3);
            final SubLObject var10 = module0585.$g4447$.currentBinding(var3);
            try {
                module0584.$g4396$.bind(module0147.$g2095$.getDynamicValue(var3), var3);
                module0585.$g4447$.bind((SubLObject)((NIL == f45284(var1)) ? $ic148$ : $ic149$), var3);
                var3.resetMultipleValues();
                final SubLObject var11 = module0731.f44783(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var12 = var3.secondMultipleValue();
                var3.resetMultipleValues();
                f45302(var1, var11, var12);
            }
            finally {
                module0585.$g4447$.rebind(var10, var3);
                module0584.$g4396$.rebind(var9, var3);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic158$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45302(final SubLObject var1, final SubLObject var183, final SubLObject var187) {
        SubLObject var188 = (SubLObject)NIL;
        SubLObject var151_189 = (SubLObject)NIL;
        SubLObject var189 = (SubLObject)NIL;
        SubLObject var191_192 = (SubLObject)NIL;
        var188 = var183;
        var151_189 = var188.first();
        var189 = var187;
        var191_192 = var189.first();
        while (NIL != var189 || NIL != var188) {
            SubLObject var190 = var191_192;
            SubLObject var191 = (SubLObject)NIL;
            var191 = var190.first();
            while (NIL != var190) {
                f45303(var1, var151_189, var191);
                var190 = var190.rest();
                var191 = var190.first();
            }
            var188 = var188.rest();
            var151_189 = var188.first();
            var189 = var189.rest();
            var191_192 = var189.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45303(final SubLObject var1, final SubLObject var151, final SubLObject var106) {
        final SubLThread var152 = SubLProcess.currentSubLThread();
        SubLObject var154;
        final SubLObject var153 = var154 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var155 = (SubLObject)NIL;
        SubLObject var156 = (SubLObject)NIL;
        SubLObject var157 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var154, var153, (SubLObject)$ic158$);
        var155 = var154.first();
        var154 = var154.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var154, var153, (SubLObject)$ic158$);
        var156 = var154.first();
        var154 = var154.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var154, var153, (SubLObject)$ic158$);
        var157 = var154.first();
        var154 = var154.rest();
        if (NIL == var154) {
            var152.resetMultipleValues();
            final SubLObject var158 = module0235.f15474(var151, var155, (SubLObject)T, (SubLObject)T);
            final SubLObject var159 = var152.secondMultipleValue();
            var152.resetMultipleValues();
            SubLObject var160 = f45304(var106);
            SubLObject var161 = (SubLObject)NIL;
            var161 = var160.first();
            while (NIL != var160) {
                var152.resetMultipleValues();
                final SubLObject var162 = module0235.f15474(var161, var156, (SubLObject)T, (SubLObject)T);
                final SubLObject var163 = var152.secondMultipleValue();
                var152.resetMultipleValues();
                if (NIL == module0233.f15405(var158, var162)) {
                    final SubLObject var164 = ConsesLow.append(var158, var162);
                    final SubLObject var165 = module0233.f15361(var164, var1);
                    final SubLObject var166 = f45296(var165);
                    module0347.f23330(var166, var164, ConsesLow.append(var159, var163));
                }
                var160 = var160.rest();
                var161 = var160.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var153, (SubLObject)$ic158$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45304(final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        SubLObject var108 = (SubLObject)ConsesLow.list($ic91$);
        final SubLObject var109 = module0584.f35795(var106);
        final SubLObject var110 = (SubLObject)((NIL != var109 || NIL == module0731.f44690(var106, (SubLObject)UNPROVIDED)) ? NIL : module0731.f44691(var106));
        final SubLObject var111 = (SubLObject)$ic17$;
        final SubLObject var112 = module0056.f4145(var111);
        SubLObject var113 = (SubLObject)NIL;
        final SubLObject var114 = module0139.$g1635$.currentBinding(var107);
        try {
            module0139.$g1635$.bind(module0139.f9007(), var107);
            final SubLObject var115 = (SubLObject)NIL;
            final SubLObject var12_202 = module0141.$g1714$.currentBinding(var107);
            final SubLObject var116 = module0141.$g1715$.currentBinding(var107);
            try {
                module0141.$g1714$.bind((NIL != var115) ? var115 : module0141.f9283(), var107);
                module0141.$g1715$.bind((SubLObject)((NIL != var115) ? $ic19$ : module0141.$g1715$.getDynamicValue(var107)), var107);
                if (NIL != var115 && NIL != module0136.f8864() && NIL == module0141.f9279(var115)) {
                    final SubLObject var117 = module0136.$g1591$.getDynamicValue(var107);
                    if (var117.eql((SubLObject)$ic20$)) {
                        module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic21$, var115, (SubLObject)$ic22$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else if (var117.eql((SubLObject)$ic23$)) {
                        module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic24$, (SubLObject)$ic21$, var115, (SubLObject)$ic22$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else if (var117.eql((SubLObject)$ic25$)) {
                        Errors.warn((SubLObject)$ic21$, var115, (SubLObject)$ic22$);
                    }
                    else {
                        Errors.warn((SubLObject)$ic26$, module0136.$g1591$.getDynamicValue(var107));
                        Errors.cerror((SubLObject)$ic24$, (SubLObject)$ic21$, var115, (SubLObject)$ic22$);
                    }
                }
                final SubLObject var12_203 = module0141.$g1670$.currentBinding(var107);
                final SubLObject var13_204 = module0141.$g1671$.currentBinding(var107);
                final SubLObject var118 = module0141.$g1672$.currentBinding(var107);
                final SubLObject var119 = module0141.$g1674$.currentBinding(var107);
                final SubLObject var120 = module0137.$g1605$.currentBinding(var107);
                try {
                    module0141.$g1670$.bind(module0137.f8955($ic27$), var107);
                    module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic27$)), var107);
                    module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic27$)), var107);
                    module0141.$g1674$.bind((SubLObject)NIL, var107);
                    module0137.$g1605$.bind(module0137.f8955($ic27$), var107);
                    if (NIL != module0136.f8865() || NIL != module0244.f15795(var106, module0137.f8955((SubLObject)UNPROVIDED))) {
                        final SubLObject var12_204 = module0141.$g1677$.currentBinding(var107);
                        final SubLObject var13_205 = module0138.$g1619$.currentBinding(var107);
                        final SubLObject var14_207 = module0141.$g1674$.currentBinding(var107);
                        try {
                            module0141.$g1677$.bind(module0141.f9208(), var107);
                            module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955($ic27$)), var107);
                            module0141.$g1674$.bind((SubLObject)NIL, var107);
                            module0249.f16055(var106, (SubLObject)UNPROVIDED);
                            for (var113 = (SubLObject)ConsesLow.list(var106, module0141.f9195()); NIL != var113; var113 = module0056.f4150(var112)) {
                                final SubLObject var32_208 = var113.first();
                                final SubLObject var121 = conses_high.second(var113);
                                final SubLObject var122 = var32_208;
                                final SubLObject var12_205 = module0141.$g1674$.currentBinding(var107);
                                try {
                                    module0141.$g1674$.bind(var121, var107);
                                    if (NIL != module0250.f16115(module0141.f9190(), var32_208) && NIL != module0259.f16854(var122, $ic159$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                        var108 = (SubLObject)ConsesLow.cons(var122, var108);
                                    }
                                    SubLObject var124;
                                    final SubLObject var123 = var124 = module0200.f12443(module0137.f8955($ic27$));
                                    SubLObject var125 = (SubLObject)NIL;
                                    var125 = var124.first();
                                    while (NIL != var124) {
                                        final SubLObject var12_206 = module0137.$g1605$.currentBinding(var107);
                                        final SubLObject var13_206 = module0141.$g1674$.currentBinding(var107);
                                        try {
                                            module0137.$g1605$.bind(var125, var107);
                                            module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var107)) : module0141.$g1674$.getDynamicValue(var107)), var107);
                                            final SubLObject var126 = module0228.f15229(var32_208);
                                            if (NIL != module0138.f8992(var126)) {
                                                final SubLObject var127 = module0242.f15664(var126, module0137.f8955((SubLObject)UNPROVIDED));
                                                if (NIL != var127) {
                                                    final SubLObject var128 = module0245.f15834(var127, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var128) {
                                                        SubLObject var129;
                                                        for (var129 = module0066.f4838(module0067.f4891(var128)); NIL == module0066.f4841(var129); var129 = module0066.f4840(var129)) {
                                                            var107.resetMultipleValues();
                                                            final SubLObject var130 = module0066.f4839(var129);
                                                            final SubLObject var131 = var107.secondMultipleValue();
                                                            var107.resetMultipleValues();
                                                            if (NIL != module0147.f9507(var130)) {
                                                                final SubLObject var12_207 = module0138.$g1623$.currentBinding(var107);
                                                                try {
                                                                    module0138.$g1623$.bind(var130, var107);
                                                                    SubLObject var57_214;
                                                                    for (var57_214 = module0066.f4838(module0067.f4891(var131)); NIL == module0066.f4841(var57_214); var57_214 = module0066.f4840(var57_214)) {
                                                                        var107.resetMultipleValues();
                                                                        final SubLObject var132 = module0066.f4839(var57_214);
                                                                        final SubLObject var133 = var107.secondMultipleValue();
                                                                        var107.resetMultipleValues();
                                                                        if (NIL != module0141.f9289(var132)) {
                                                                            final SubLObject var12_208 = module0138.$g1624$.currentBinding(var107);
                                                                            try {
                                                                                module0138.$g1624$.bind(var132, var107);
                                                                                final SubLObject var134 = var133;
                                                                                if (NIL != module0077.f5302(var134)) {
                                                                                    final SubLObject var135 = module0077.f5333(var134);
                                                                                    SubLObject var136;
                                                                                    SubLObject var137;
                                                                                    SubLObject var138;
                                                                                    for (var136 = module0032.f1741(var135), var137 = (SubLObject)NIL, var137 = module0032.f1742(var136, var135); NIL == module0032.f1744(var136, var137); var137 = module0032.f1743(var137)) {
                                                                                        var138 = module0032.f1745(var136, var137);
                                                                                        if (NIL != module0032.f1746(var137, var138) && NIL == module0249.f16059(var138, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var138, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var138, module0141.f9195()), var112);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var134.isList()) {
                                                                                    SubLObject var139 = var134;
                                                                                    SubLObject var140 = (SubLObject)NIL;
                                                                                    var140 = var139.first();
                                                                                    while (NIL != var139) {
                                                                                        if (NIL == module0249.f16059(var140, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var140, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var140, module0141.f9195()), var112);
                                                                                        }
                                                                                        var139 = var139.rest();
                                                                                        var140 = var139.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic28$, var134);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var12_208, var107);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var57_214);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var12_207, var107);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var129);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic29$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                }
                                            }
                                            else if (NIL != module0155.f9785(var126, (SubLObject)UNPROVIDED)) {
                                                SubLObject var28_216;
                                                final SubLObject var141 = var28_216 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var107), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var107), module0137.f8955((SubLObject)UNPROVIDED)));
                                                SubLObject var142 = (SubLObject)NIL;
                                                var142 = var28_216.first();
                                                while (NIL != var28_216) {
                                                    final SubLObject var12_209 = module0138.$g1625$.currentBinding(var107);
                                                    try {
                                                        module0138.$g1625$.bind(var142, var107);
                                                        final SubLObject var144;
                                                        final SubLObject var143 = var144 = Functions.funcall(var142, var126);
                                                        if (NIL != module0077.f5302(var144)) {
                                                            final SubLObject var145 = module0077.f5333(var144);
                                                            SubLObject var146;
                                                            SubLObject var147;
                                                            SubLObject var148;
                                                            for (var146 = module0032.f1741(var145), var147 = (SubLObject)NIL, var147 = module0032.f1742(var146, var145); NIL == module0032.f1744(var146, var147); var147 = module0032.f1743(var147)) {
                                                                var148 = module0032.f1745(var146, var147);
                                                                if (NIL != module0032.f1746(var147, var148) && NIL == module0249.f16059(var148, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var148, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var148, module0141.f9195()), var112);
                                                                }
                                                            }
                                                        }
                                                        else if (var144.isList()) {
                                                            SubLObject var149 = var144;
                                                            SubLObject var150 = (SubLObject)NIL;
                                                            var150 = var149.first();
                                                            while (NIL != var149) {
                                                                if (NIL == module0249.f16059(var150, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var150, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var150, module0141.f9195()), var112);
                                                                }
                                                                var149 = var149.rest();
                                                                var150 = var149.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)$ic28$, var144);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var12_209, var107);
                                                    }
                                                    var28_216 = var28_216.rest();
                                                    var142 = var28_216.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var13_206, var107);
                                            module0137.$g1605$.rebind(var12_206, var107);
                                        }
                                        var124 = var124.rest();
                                        var125 = var124.first();
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var12_205, var107);
                                }
                            }
                        }
                        finally {
                            module0141.$g1674$.rebind(var14_207, var107);
                            module0138.$g1619$.rebind(var13_205, var107);
                            module0141.$g1677$.rebind(var12_204, var107);
                        }
                    }
                    else {
                        module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic30$, var106, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var120, var107);
                    module0141.$g1674$.rebind(var119, var107);
                    module0141.$g1672$.rebind(var118, var107);
                    module0141.$g1671$.rebind(var13_204, var107);
                    module0141.$g1670$.rebind(var12_203, var107);
                }
            }
            finally {
                module0141.$g1715$.rebind(var116, var107);
                module0141.$g1714$.rebind(var12_202, var107);
            }
            module0139.f9011(module0139.$g1635$.getDynamicValue(var107));
        }
        finally {
            module0139.$g1635$.rebind(var114, var107);
        }
        if (NIL != var109) {
            var108 = (SubLObject)ConsesLow.cons($ic124$, var108);
            var108 = (SubLObject)ConsesLow.cons($ic128$, var108);
            final SubLObject var220_221 = (SubLObject)$ic17$;
            final SubLObject var222_223 = module0056.f4145(var220_221);
            final SubLObject var151 = module0139.$g1635$.currentBinding(var107);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var107);
                final SubLObject var152 = (SubLObject)NIL;
                final SubLObject var12_210 = module0141.$g1714$.currentBinding(var107);
                final SubLObject var153 = module0141.$g1715$.currentBinding(var107);
                try {
                    module0141.$g1714$.bind((NIL != var152) ? var152 : module0141.f9283(), var107);
                    module0141.$g1715$.bind((SubLObject)((NIL != var152) ? $ic19$ : module0141.$g1715$.getDynamicValue(var107)), var107);
                    if (NIL != var152 && NIL != module0136.f8864() && NIL == module0141.f9279(var152)) {
                        final SubLObject var154 = module0136.$g1591$.getDynamicValue(var107);
                        if (var154.eql((SubLObject)$ic20$)) {
                            module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic21$, var152, (SubLObject)$ic22$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var154.eql((SubLObject)$ic23$)) {
                            module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic24$, (SubLObject)$ic21$, var152, (SubLObject)$ic22$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var154.eql((SubLObject)$ic25$)) {
                            Errors.warn((SubLObject)$ic21$, var152, (SubLObject)$ic22$);
                        }
                        else {
                            Errors.warn((SubLObject)$ic26$, module0136.$g1591$.getDynamicValue(var107));
                            Errors.cerror((SubLObject)$ic24$, (SubLObject)$ic21$, var152, (SubLObject)$ic22$);
                        }
                    }
                    final SubLObject var12_211 = module0141.$g1670$.currentBinding(var107);
                    final SubLObject var13_207 = module0141.$g1671$.currentBinding(var107);
                    final SubLObject var155 = module0141.$g1672$.currentBinding(var107);
                    final SubLObject var156 = module0141.$g1674$.currentBinding(var107);
                    final SubLObject var157 = module0137.$g1605$.currentBinding(var107);
                    try {
                        module0141.$g1670$.bind(module0137.f8955($ic160$), var107);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic160$)), var107);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic160$)), var107);
                        module0141.$g1674$.bind((SubLObject)NIL, var107);
                        module0137.$g1605$.bind(module0137.f8955($ic160$), var107);
                        if (NIL != module0136.f8865() || NIL != module0244.f15795(var106, module0137.f8955((SubLObject)UNPROVIDED))) {
                            final SubLObject var12_212 = module0141.$g1677$.currentBinding(var107);
                            final SubLObject var13_208 = module0138.$g1619$.currentBinding(var107);
                            final SubLObject var14_208 = module0141.$g1674$.currentBinding(var107);
                            try {
                                module0141.$g1677$.bind(module0141.f9208(), var107);
                                module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)UNPROVIDED)), var107);
                                module0141.$g1674$.bind((SubLObject)NIL, var107);
                                SubLObject var159;
                                final SubLObject var158 = var159 = module0200.f12443(module0137.f8955($ic160$));
                                SubLObject var160 = (SubLObject)NIL;
                                var160 = var159.first();
                                while (NIL != var159) {
                                    final SubLObject var12_213 = module0137.$g1605$.currentBinding(var107);
                                    final SubLObject var13_209 = module0141.$g1674$.currentBinding(var107);
                                    try {
                                        module0137.$g1605$.bind(var160, var107);
                                        module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var107)) : module0141.$g1674$.getDynamicValue(var107)), var107);
                                        final SubLObject var161 = module0228.f15229(var106);
                                        if (NIL != module0138.f8992(var161)) {
                                            final SubLObject var162 = module0242.f15664(var161, module0137.f8955((SubLObject)UNPROVIDED));
                                            if (NIL != var162) {
                                                final SubLObject var163 = module0245.f15834(var162, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                if (NIL != var163) {
                                                    SubLObject var164;
                                                    for (var164 = module0066.f4838(module0067.f4891(var163)); NIL == module0066.f4841(var164); var164 = module0066.f4840(var164)) {
                                                        var107.resetMultipleValues();
                                                        final SubLObject var165 = module0066.f4839(var164);
                                                        final SubLObject var166 = var107.secondMultipleValue();
                                                        var107.resetMultipleValues();
                                                        if (NIL != module0147.f9507(var165)) {
                                                            final SubLObject var12_214 = module0138.$g1623$.currentBinding(var107);
                                                            try {
                                                                module0138.$g1623$.bind(var165, var107);
                                                                SubLObject var57_215;
                                                                for (var57_215 = module0066.f4838(module0067.f4891(var166)); NIL == module0066.f4841(var57_215); var57_215 = module0066.f4840(var57_215)) {
                                                                    var107.resetMultipleValues();
                                                                    final SubLObject var167 = module0066.f4839(var57_215);
                                                                    final SubLObject var168 = var107.secondMultipleValue();
                                                                    var107.resetMultipleValues();
                                                                    if (NIL != module0141.f9289(var167)) {
                                                                        final SubLObject var12_215 = module0138.$g1624$.currentBinding(var107);
                                                                        try {
                                                                            module0138.$g1624$.bind(var167, var107);
                                                                            final SubLObject var169 = var168;
                                                                            if (NIL != module0077.f5302(var169)) {
                                                                                final SubLObject var170 = module0077.f5333(var169);
                                                                                SubLObject var171;
                                                                                SubLObject var172;
                                                                                SubLObject var173;
                                                                                for (var171 = module0032.f1741(var170), var172 = (SubLObject)NIL, var172 = module0032.f1742(var171, var170); NIL == module0032.f1744(var171, var172); var172 = module0032.f1743(var172)) {
                                                                                    var173 = module0032.f1745(var171, var172);
                                                                                    if (NIL != module0032.f1746(var172, var173) && NIL == module0249.f16059(var173, (SubLObject)UNPROVIDED)) {
                                                                                        module0249.f16055(var173, (SubLObject)UNPROVIDED);
                                                                                        module0056.f4149(var173, var222_223);
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (var169.isList()) {
                                                                                SubLObject var174 = var169;
                                                                                SubLObject var175 = (SubLObject)NIL;
                                                                                var175 = var174.first();
                                                                                while (NIL != var174) {
                                                                                    if (NIL == module0249.f16059(var175, (SubLObject)UNPROVIDED)) {
                                                                                        module0249.f16055(var175, (SubLObject)UNPROVIDED);
                                                                                        module0056.f4149(var175, var222_223);
                                                                                    }
                                                                                    var174 = var174.rest();
                                                                                    var175 = var174.first();
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)$ic28$, var169);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1624$.rebind(var12_215, var107);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var57_215);
                                                            }
                                                            finally {
                                                                module0138.$g1623$.rebind(var12_214, var107);
                                                            }
                                                        }
                                                    }
                                                    module0066.f4842(var164);
                                                }
                                            }
                                            else {
                                                module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic29$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                            }
                                        }
                                        else if (NIL != module0155.f9785(var161, (SubLObject)UNPROVIDED)) {
                                            SubLObject var28_217;
                                            final SubLObject var176 = var28_217 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var107), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var107), module0137.f8955((SubLObject)UNPROVIDED)));
                                            SubLObject var177 = (SubLObject)NIL;
                                            var177 = var28_217.first();
                                            while (NIL != var28_217) {
                                                final SubLObject var12_216 = module0138.$g1625$.currentBinding(var107);
                                                try {
                                                    module0138.$g1625$.bind(var177, var107);
                                                    final SubLObject var179;
                                                    final SubLObject var178 = var179 = Functions.funcall(var177, var161);
                                                    if (NIL != module0077.f5302(var179)) {
                                                        final SubLObject var180 = module0077.f5333(var179);
                                                        SubLObject var181;
                                                        SubLObject var182;
                                                        SubLObject var183;
                                                        for (var181 = module0032.f1741(var180), var182 = (SubLObject)NIL, var182 = module0032.f1742(var181, var180); NIL == module0032.f1744(var181, var182); var182 = module0032.f1743(var182)) {
                                                            var183 = module0032.f1745(var181, var182);
                                                            if (NIL != module0032.f1746(var182, var183) && NIL == module0249.f16059(var183, (SubLObject)UNPROVIDED)) {
                                                                module0249.f16055(var183, (SubLObject)UNPROVIDED);
                                                                module0056.f4149(var183, var222_223);
                                                            }
                                                        }
                                                    }
                                                    else if (var179.isList()) {
                                                        SubLObject var184 = var179;
                                                        SubLObject var185 = (SubLObject)NIL;
                                                        var185 = var184.first();
                                                        while (NIL != var184) {
                                                            if (NIL == module0249.f16059(var185, (SubLObject)UNPROVIDED)) {
                                                                module0249.f16055(var185, (SubLObject)UNPROVIDED);
                                                                module0056.f4149(var185, var222_223);
                                                            }
                                                            var184 = var184.rest();
                                                            var185 = var184.first();
                                                        }
                                                    }
                                                    else {
                                                        Errors.error((SubLObject)$ic28$, var179);
                                                    }
                                                }
                                                finally {
                                                    module0138.$g1625$.rebind(var12_216, var107);
                                                }
                                                var28_217 = var28_217.rest();
                                                var177 = var28_217.first();
                                            }
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var13_209, var107);
                                        module0137.$g1605$.rebind(var12_213, var107);
                                    }
                                    var159 = var159.rest();
                                    var160 = var159.first();
                                }
                                SubLObject var218_219 = module0056.f4150(var222_223);
                                final SubLObject var12_217 = module0137.$g1605$.currentBinding(var107);
                                final SubLObject var13_210 = module0141.$g1674$.currentBinding(var107);
                                final SubLObject var14_209 = module0138.$g1619$.currentBinding(var107);
                                try {
                                    module0137.$g1605$.bind(module0244.f15771(module0141.f9188()), var107);
                                    module0141.$g1674$.bind((SubLObject)NIL, var107);
                                    module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)UNPROVIDED)), var107);
                                    while (NIL != var218_219) {
                                        final SubLObject var186 = var218_219;
                                        if (NIL != module0259.f16854(var186, $ic159$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                            var108 = (SubLObject)ConsesLow.cons(var186, var108);
                                        }
                                        SubLObject var188;
                                        final SubLObject var187 = var188 = module0200.f12443(module0137.f8955((SubLObject)UNPROVIDED));
                                        SubLObject var189 = (SubLObject)NIL;
                                        var189 = var188.first();
                                        while (NIL != var188) {
                                            final SubLObject var12_218 = module0137.$g1605$.currentBinding(var107);
                                            final SubLObject var13_211 = module0141.$g1674$.currentBinding(var107);
                                            try {
                                                module0137.$g1605$.bind(var189, var107);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var107)) : module0141.$g1674$.getDynamicValue(var107)), var107);
                                                final SubLObject var190 = module0228.f15229(var218_219);
                                                if (NIL != module0138.f8992(var190)) {
                                                    final SubLObject var191 = module0242.f15664(var190, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var191) {
                                                        final SubLObject var192 = module0245.f15834(var191, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var192) {
                                                            SubLObject var193;
                                                            for (var193 = module0066.f4838(module0067.f4891(var192)); NIL == module0066.f4841(var193); var193 = module0066.f4840(var193)) {
                                                                var107.resetMultipleValues();
                                                                final SubLObject var194 = module0066.f4839(var193);
                                                                final SubLObject var195 = var107.secondMultipleValue();
                                                                var107.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var194)) {
                                                                    final SubLObject var12_219 = module0138.$g1623$.currentBinding(var107);
                                                                    try {
                                                                        module0138.$g1623$.bind(var194, var107);
                                                                        SubLObject var57_216;
                                                                        for (var57_216 = module0066.f4838(module0067.f4891(var195)); NIL == module0066.f4841(var57_216); var57_216 = module0066.f4840(var57_216)) {
                                                                            var107.resetMultipleValues();
                                                                            final SubLObject var196 = module0066.f4839(var57_216);
                                                                            final SubLObject var197 = var107.secondMultipleValue();
                                                                            var107.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var196)) {
                                                                                final SubLObject var12_220 = module0138.$g1624$.currentBinding(var107);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var196, var107);
                                                                                    final SubLObject var198 = var197;
                                                                                    if (NIL != module0077.f5302(var198)) {
                                                                                        final SubLObject var199 = module0077.f5333(var198);
                                                                                        SubLObject var200;
                                                                                        SubLObject var201;
                                                                                        SubLObject var202;
                                                                                        for (var200 = module0032.f1741(var199), var201 = (SubLObject)NIL, var201 = module0032.f1742(var200, var199); NIL == module0032.f1744(var200, var201); var201 = module0032.f1743(var201)) {
                                                                                            var202 = module0032.f1745(var200, var201);
                                                                                            if (NIL != module0032.f1746(var201, var202) && NIL == module0249.f16059(var202, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var202, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var202, var222_223);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var198.isList()) {
                                                                                        SubLObject var203 = var198;
                                                                                        SubLObject var204 = (SubLObject)NIL;
                                                                                        var204 = var203.first();
                                                                                        while (NIL != var203) {
                                                                                            if (NIL == module0249.f16059(var204, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var204, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var204, var222_223);
                                                                                            }
                                                                                            var203 = var203.rest();
                                                                                            var204 = var203.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic28$, var198);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var12_220, var107);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var57_216);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var12_219, var107);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var193);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic29$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var190, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var28_218;
                                                    final SubLObject var205 = var28_218 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var107), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var107), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var206 = (SubLObject)NIL;
                                                    var206 = var28_218.first();
                                                    while (NIL != var28_218) {
                                                        final SubLObject var12_221 = module0138.$g1625$.currentBinding(var107);
                                                        try {
                                                            module0138.$g1625$.bind(var206, var107);
                                                            final SubLObject var208;
                                                            final SubLObject var207 = var208 = Functions.funcall(var206, var190);
                                                            if (NIL != module0077.f5302(var208)) {
                                                                final SubLObject var209 = module0077.f5333(var208);
                                                                SubLObject var175;
                                                                SubLObject var210;
                                                                SubLObject var211;
                                                                for (var210 = module0032.f1741(var209), var211 = (SubLObject)NIL, var211 = module0032.f1742(var210, var209); NIL == module0032.f1744(var210, var211); var211 = module0032.f1743(var211)) {
                                                                    var175 = module0032.f1745(var210, var211);
                                                                    if (NIL != module0032.f1746(var211, var175) && NIL == module0249.f16059(var175, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var175, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var175, var222_223);
                                                                    }
                                                                }
                                                            }
                                                            else if (var208.isList()) {
                                                                SubLObject var212 = var208;
                                                                SubLObject var213 = (SubLObject)NIL;
                                                                var213 = var212.first();
                                                                while (NIL != var212) {
                                                                    if (NIL == module0249.f16059(var213, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var213, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var213, var222_223);
                                                                    }
                                                                    var212 = var212.rest();
                                                                    var213 = var212.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic28$, var208);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var12_221, var107);
                                                        }
                                                        var28_218 = var28_218.rest();
                                                        var206 = var28_218.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var13_211, var107);
                                                module0137.$g1605$.rebind(var12_218, var107);
                                            }
                                            var188 = var188.rest();
                                            var189 = var188.first();
                                        }
                                        var218_219 = module0056.f4150(var222_223);
                                    }
                                }
                                finally {
                                    module0138.$g1619$.rebind(var14_209, var107);
                                    module0141.$g1674$.rebind(var13_210, var107);
                                    module0137.$g1605$.rebind(var12_217, var107);
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var14_208, var107);
                                module0138.$g1619$.rebind(var13_208, var107);
                                module0141.$g1677$.rebind(var12_212, var107);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic30$, var106, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var157, var107);
                        module0141.$g1674$.rebind(var156, var107);
                        module0141.$g1672$.rebind(var155, var107);
                        module0141.$g1671$.rebind(var13_207, var107);
                        module0141.$g1670$.rebind(var12_211, var107);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var153, var107);
                    module0141.$g1714$.rebind(var12_210, var107);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var107));
            }
            finally {
                module0139.$g1635$.rebind(var151, var107);
            }
        }
        else if (NIL != var110) {
            if (NIL != module0731.f44702(var106, $ic129$, (SubLObject)UNPROVIDED)) {
                var108 = (SubLObject)ConsesLow.cons($ic128$, var108);
            }
            SubLObject var249_250 = var110;
            final SubLObject var251_252 = (SubLObject)$ic16$;
            final SubLObject var253_254 = module0056.f4145(var251_252);
            final SubLObject var151 = module0139.$g1635$.currentBinding(var107);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var107);
                final SubLObject var152 = (SubLObject)NIL;
                final SubLObject var12_222 = module0141.$g1714$.currentBinding(var107);
                final SubLObject var153 = module0141.$g1715$.currentBinding(var107);
                try {
                    module0141.$g1714$.bind((NIL != var152) ? var152 : module0141.f9283(), var107);
                    module0141.$g1715$.bind((SubLObject)((NIL != var152) ? $ic19$ : module0141.$g1715$.getDynamicValue(var107)), var107);
                    if (NIL != var152 && NIL != module0136.f8864() && NIL == module0141.f9279(var152)) {
                        final SubLObject var154 = module0136.$g1591$.getDynamicValue(var107);
                        if (var154.eql((SubLObject)$ic20$)) {
                            module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic21$, var152, (SubLObject)$ic22$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var154.eql((SubLObject)$ic23$)) {
                            module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic24$, (SubLObject)$ic21$, var152, (SubLObject)$ic22$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var154.eql((SubLObject)$ic25$)) {
                            Errors.warn((SubLObject)$ic21$, var152, (SubLObject)$ic22$);
                        }
                        else {
                            Errors.warn((SubLObject)$ic26$, module0136.$g1591$.getDynamicValue(var107));
                            Errors.cerror((SubLObject)$ic24$, (SubLObject)$ic21$, var152, (SubLObject)$ic22$);
                        }
                    }
                    final SubLObject var12_223 = module0141.$g1670$.currentBinding(var107);
                    final SubLObject var13_212 = module0141.$g1671$.currentBinding(var107);
                    final SubLObject var155 = module0141.$g1672$.currentBinding(var107);
                    final SubLObject var156 = module0141.$g1674$.currentBinding(var107);
                    final SubLObject var157 = module0137.$g1605$.currentBinding(var107);
                    try {
                        module0141.$g1670$.bind(module0137.f8955($ic108$), var107);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic108$)), var107);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic108$)), var107);
                        module0141.$g1674$.bind((SubLObject)NIL, var107);
                        module0137.$g1605$.bind(module0137.f8955($ic108$), var107);
                        if (NIL != module0136.f8865() || NIL != module0244.f15795(var110, module0137.f8955((SubLObject)UNPROVIDED))) {
                            final SubLObject var12_224 = module0141.$g1677$.currentBinding(var107);
                            final SubLObject var13_213 = module0138.$g1619$.currentBinding(var107);
                            final SubLObject var14_210 = module0141.$g1674$.currentBinding(var107);
                            try {
                                module0141.$g1677$.bind(module0141.f9208(), var107);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955($ic108$)), var107);
                                module0141.$g1674$.bind((SubLObject)NIL, var107);
                                module0249.f16055(var249_250, (SubLObject)UNPROVIDED);
                                while (NIL != var249_250) {
                                    final SubLObject var214 = var249_250;
                                    if (NIL != module0259.f16854(var214, $ic159$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                        var108 = (SubLObject)ConsesLow.cons(var214, var108);
                                    }
                                    SubLObject var159;
                                    final SubLObject var158 = var159 = module0200.f12443(module0137.f8955($ic108$));
                                    SubLObject var160 = (SubLObject)NIL;
                                    var160 = var159.first();
                                    while (NIL != var159) {
                                        final SubLObject var12_225 = module0137.$g1605$.currentBinding(var107);
                                        final SubLObject var13_214 = module0141.$g1674$.currentBinding(var107);
                                        try {
                                            module0137.$g1605$.bind(var160, var107);
                                            module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var107)) : module0141.$g1674$.getDynamicValue(var107)), var107);
                                            final SubLObject var161 = module0228.f15229(var249_250);
                                            if (NIL != module0138.f8992(var161)) {
                                                final SubLObject var162 = module0242.f15664(var161, module0137.f8955((SubLObject)UNPROVIDED));
                                                if (NIL != var162) {
                                                    final SubLObject var163 = module0245.f15834(var162, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var163) {
                                                        SubLObject var164;
                                                        for (var164 = module0066.f4838(module0067.f4891(var163)); NIL == module0066.f4841(var164); var164 = module0066.f4840(var164)) {
                                                            var107.resetMultipleValues();
                                                            final SubLObject var165 = module0066.f4839(var164);
                                                            final SubLObject var166 = var107.secondMultipleValue();
                                                            var107.resetMultipleValues();
                                                            if (NIL != module0147.f9507(var165)) {
                                                                final SubLObject var12_226 = module0138.$g1623$.currentBinding(var107);
                                                                try {
                                                                    module0138.$g1623$.bind(var165, var107);
                                                                    SubLObject var57_217;
                                                                    for (var57_217 = module0066.f4838(module0067.f4891(var166)); NIL == module0066.f4841(var57_217); var57_217 = module0066.f4840(var57_217)) {
                                                                        var107.resetMultipleValues();
                                                                        final SubLObject var167 = module0066.f4839(var57_217);
                                                                        final SubLObject var168 = var107.secondMultipleValue();
                                                                        var107.resetMultipleValues();
                                                                        if (NIL != module0141.f9289(var167)) {
                                                                            final SubLObject var12_227 = module0138.$g1624$.currentBinding(var107);
                                                                            try {
                                                                                module0138.$g1624$.bind(var167, var107);
                                                                                final SubLObject var169 = var168;
                                                                                if (NIL != module0077.f5302(var169)) {
                                                                                    final SubLObject var170 = module0077.f5333(var169);
                                                                                    SubLObject var171;
                                                                                    SubLObject var172;
                                                                                    SubLObject var215;
                                                                                    for (var171 = module0032.f1741(var170), var172 = (SubLObject)NIL, var172 = module0032.f1742(var171, var170); NIL == module0032.f1744(var171, var172); var172 = module0032.f1743(var172)) {
                                                                                        var215 = module0032.f1745(var171, var172);
                                                                                        if (NIL != module0032.f1746(var172, var215) && NIL == module0249.f16059(var215, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var215, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149(var215, var253_254);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var169.isList()) {
                                                                                    SubLObject var174 = var169;
                                                                                    SubLObject var216 = (SubLObject)NIL;
                                                                                    var216 = var174.first();
                                                                                    while (NIL != var174) {
                                                                                        if (NIL == module0249.f16059(var216, (SubLObject)UNPROVIDED)) {
                                                                                            module0249.f16055(var216, (SubLObject)UNPROVIDED);
                                                                                            module0056.f4149(var216, var253_254);
                                                                                        }
                                                                                        var174 = var174.rest();
                                                                                        var216 = var174.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic28$, var169);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var12_227, var107);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var57_217);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var12_226, var107);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var164);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic29$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                }
                                            }
                                            else if (NIL != module0155.f9785(var161, (SubLObject)UNPROVIDED)) {
                                                SubLObject var28_219;
                                                final SubLObject var176 = var28_219 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var107), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var107), module0137.f8955((SubLObject)UNPROVIDED)));
                                                SubLObject var177 = (SubLObject)NIL;
                                                var177 = var28_219.first();
                                                while (NIL != var28_219) {
                                                    final SubLObject var12_228 = module0138.$g1625$.currentBinding(var107);
                                                    try {
                                                        module0138.$g1625$.bind(var177, var107);
                                                        final SubLObject var179;
                                                        final SubLObject var178 = var179 = Functions.funcall(var177, var161);
                                                        if (NIL != module0077.f5302(var179)) {
                                                            final SubLObject var180 = module0077.f5333(var179);
                                                            SubLObject var181;
                                                            SubLObject var182;
                                                            SubLObject var217;
                                                            for (var181 = module0032.f1741(var180), var182 = (SubLObject)NIL, var182 = module0032.f1742(var181, var180); NIL == module0032.f1744(var181, var182); var182 = module0032.f1743(var182)) {
                                                                var217 = module0032.f1745(var181, var182);
                                                                if (NIL != module0032.f1746(var182, var217) && NIL == module0249.f16059(var217, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var217, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149(var217, var253_254);
                                                                }
                                                            }
                                                        }
                                                        else if (var179.isList()) {
                                                            SubLObject var184 = var179;
                                                            SubLObject var218 = (SubLObject)NIL;
                                                            var218 = var184.first();
                                                            while (NIL != var184) {
                                                                if (NIL == module0249.f16059(var218, (SubLObject)UNPROVIDED)) {
                                                                    module0249.f16055(var218, (SubLObject)UNPROVIDED);
                                                                    module0056.f4149(var218, var253_254);
                                                                }
                                                                var184 = var184.rest();
                                                                var218 = var184.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)$ic28$, var179);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var12_228, var107);
                                                    }
                                                    var28_219 = var28_219.rest();
                                                    var177 = var28_219.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var13_214, var107);
                                            module0137.$g1605$.rebind(var12_225, var107);
                                        }
                                        var159 = var159.rest();
                                        var160 = var159.first();
                                    }
                                    var249_250 = module0056.f4150(var253_254);
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var14_210, var107);
                                module0138.$g1619$.rebind(var13_213, var107);
                                module0141.$g1677$.rebind(var12_224, var107);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic30$, var110, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var157, var107);
                        module0141.$g1674$.rebind(var156, var107);
                        module0141.$g1672$.rebind(var155, var107);
                        module0141.$g1671$.rebind(var13_212, var107);
                        module0141.$g1670$.rebind(var12_223, var107);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var153, var107);
                    module0141.$g1714$.rebind(var12_222, var107);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var107));
            }
            finally {
                module0139.$g1635$.rebind(var151, var107);
            }
        }
        return var108;
    }
    
    public static SubLObject f45305(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = module0205.f13180(var1, (SubLObject)UNPROVIDED);
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic163$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic163$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic163$);
        var8 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            SubLObject var9 = module0738.f45776(var8, var6, (SubLObject)T, module0147.$g2095$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
            SubLObject var10 = (SubLObject)NIL;
            var10 = var9.first();
            while (NIL != var9) {
                var3.resetMultipleValues();
                final SubLObject var11 = module0337.f22630(module0178.f11285(var10), (SubLObject)ConsesLow.list((SubLObject)$ic164$, (SubLObject)$ic165$, var8));
                final SubLObject var12 = var3.secondMultipleValue();
                var3.resetMultipleValues();
                if (NIL != var11) {
                    final SubLObject var13 = module0035.f2294(var12, (SubLObject)$ic166$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var14 = module0035.f2294(var12, (SubLObject)$ic167$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL != module0731.f44702(var13, var6, (SubLObject)UNPROVIDED)) {
                        var3.resetMultipleValues();
                        final SubLObject var29_276 = module0235.f15474(var14, var7, (SubLObject)T, (SubLObject)T);
                        final SubLObject var15 = var3.secondMultipleValue();
                        var3.resetMultipleValues();
                        final SubLObject var16 = (SubLObject)(var13.eql(var6) ? NIL : ConsesLow.list(module0191.f11990((SubLObject)$ic168$, module0202.f12768($ic27$, var13, var6), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
                        if (NIL != var29_276) {
                            module0347.f23330(var10, var29_276, ConsesLow.append(var16, var15));
                        }
                    }
                }
                var9 = var9.rest();
                var10 = var9.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic163$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45306(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL == module0202.f12589(var1, $ic83$));
    }
    
    public static SubLObject f45307() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45223", "S#49449", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45224", "S#25119", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45226", "S#25120", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45227", "S#25121", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45225", "S#49450", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45228", "S#49451", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45229", "S#49452", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45230", "S#49453", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45231", "S#49454", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45232", "S#49455", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45233", "S#49456", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45234", "S#49457", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45235", "S#49458", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45236", "S#49459", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45237", "S#49460", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45238", "S#49439", 1, 0, false);
        new $f45238$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45239", "S#49461", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45240", "S#49462", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45241", "S#49463", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45242", "S#49464", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45243", "S#49465", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45244", "S#49466", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45245", "S#49467", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45246", "S#49468", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45247", "S#49469", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45248", "S#49470", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45249", "S#49471", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45250", "S#49472", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45251", "S#49473", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45252", "S#49474", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45253", "S#49475", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45254", "S#49476", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45255", "S#49477", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45256", "S#49478", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45257", "S#49479", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45258", "S#49480", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45259", "S#49481", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45260", "S#48850", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45261", "S#49482", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45262", "S#49483", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45263", "S#49484", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45264", "S#49485", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45265", "S#49486", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45266", "S#49487", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45267", "S#49488", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45268", "S#49489", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45269", "S#49490", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45270", "S#49491", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45271", "S#49492", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45272", "S#49493", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45273", "S#49494", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45274", "S#49495", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45275", "S#49496", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45276", "S#49497", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45277", "S#49498", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45278", "S#49499", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45279", "S#25122", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45280", "S#25123", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45281", "S#49500", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45285", "S#25124", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45286", "S#49501", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45287", "S#49502", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45288", "S#49503", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45289", "S#49504", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45283", "S#49505", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45290", "S#49506", 4, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0735", "f45292", "S#49507");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45293", "S#49508", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45294", "S#49509", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45296", "S#49510", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45295", "S#49511", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45291", "S#49512", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45297", "S#49513", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45298", "S#49514", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45284", "S#49515", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45282", "S#49516", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45300", "S#49517", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45299", "S#49518", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45301", "S#49519", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45302", "S#49520", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45303", "S#49521", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45304", "S#49522", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45305", "S#49523", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0735", "f45306", "S#49524", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45308() {
        $g5816$ = SubLFiles.defparameter("S#49525", (SubLObject)ONE_INTEGER);
        $g5817$ = SubLFiles.defparameter("S#49526", (SubLObject)TWO_INTEGER);
        $g5818$ = SubLFiles.defconstant("S#49527", (SubLObject)$ic31$);
        $g5819$ = SubLFiles.defconstant("S#49528", (SubLObject)THREE_INTEGER);
        $g5820$ = SubLFiles.defparameter("S#49529", (SubLObject)TWO_INTEGER);
        $g5821$ = SubLFiles.defparameter("S#49530", (SubLObject)TWO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45309() {
        module0012.f419((SubLObject)$ic1$);
        module0012.f419((SubLObject)$ic2$);
        module0012.f419((SubLObject)$ic3$);
        module0340.f22941((SubLObject)$ic6$, (SubLObject)$ic7$);
        module0012.f419((SubLObject)$ic9$);
        module0340.f22941((SubLObject)$ic10$, (SubLObject)$ic11$);
        module0340.f22941((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g5818$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic38$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic39$);
        Structures.def_csetf((SubLObject)$ic40$, (SubLObject)$ic41$);
        Structures.def_csetf((SubLObject)$ic42$, (SubLObject)$ic43$);
        Structures.def_csetf((SubLObject)$ic44$, (SubLObject)$ic45$);
        Structures.def_csetf((SubLObject)$ic46$, (SubLObject)$ic47$);
        Structures.def_csetf((SubLObject)$ic48$, (SubLObject)$ic49$);
        Equality.identity((SubLObject)$ic31$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g5818$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic60$));
        module0012.f419((SubLObject)$ic61$);
        module0012.f419((SubLObject)$ic62$);
        module0012.f419((SubLObject)$ic64$);
        module0012.f419((SubLObject)$ic65$);
        module0012.f419((SubLObject)$ic67$);
        module0340.f22941((SubLObject)$ic70$, (SubLObject)$ic71$);
        module0340.f22941((SubLObject)$ic72$, (SubLObject)$ic73$);
        module0340.f22941((SubLObject)$ic75$, (SubLObject)$ic76$);
        module0340.f22941((SubLObject)$ic77$, (SubLObject)$ic78$);
        module0340.f22941((SubLObject)$ic79$, (SubLObject)$ic80$);
        module0340.f22941((SubLObject)$ic81$, (SubLObject)$ic82$);
        module0012.f419((SubLObject)$ic85$);
        module0012.f419((SubLObject)$ic86$);
        module0012.f419((SubLObject)$ic93$);
        module0027.f1449((SubLObject)$ic95$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic96$, $ic97$, $ic98$, NIL, $ic99$, NIL, $ic100$, $ic101$, $ic102$, T }), $ic103$);
        module0340.f22941((SubLObject)$ic131$, (SubLObject)$ic132$);
        module0340.f22941((SubLObject)$ic133$, (SubLObject)$ic134$);
        module0340.f22941((SubLObject)$ic135$, (SubLObject)$ic136$);
        module0340.f22941((SubLObject)$ic137$, (SubLObject)$ic138$);
        module0340.f22941((SubLObject)$ic139$, (SubLObject)$ic140$);
        module0340.f22941((SubLObject)$ic141$, (SubLObject)$ic142$);
        module0340.f22941((SubLObject)$ic143$, (SubLObject)$ic144$);
        module0340.f22941((SubLObject)$ic145$, (SubLObject)$ic146$);
        module0340.f22941((SubLObject)$ic154$, (SubLObject)$ic155$);
        module0340.f22941((SubLObject)$ic156$, (SubLObject)$ic157$);
        module0340.f22938($ic87$);
        module0340.f22938($ic89$);
        module0340.f22938($ic162$);
        module0012.f419((SubLObject)$ic169$);
        module0012.f419((SubLObject)$ic170$);
        module0358.f23730((SubLObject)$ic171$, (SubLObject)$ic172$);
        module0358.f23730((SubLObject)$ic173$, (SubLObject)$ic174$);
        module0340.f22941((SubLObject)$ic175$, (SubLObject)$ic176$);
        return (SubLObject)NIL;
    }
    
    private static SubLObject _constant_103_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("ChronicObstructivePulmonaryDisease-PulmonaryFunctionTest")), constant_handles_oc.f8479((SubLObject)makeString("nameString")), (SubLObject)makeString("COPD-PFT")), constant_handles_oc.f8479((SubLObject)makeString("MedicalLexicalMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("acronymString")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("Atherosclerosis")), constant_handles_oc.f8479((SubLObject)makeString("nonPlural-Generic")), (SubLObject)makeString("hardening of the arteries")), constant_handles_oc.f8479((SubLObject)makeString("EnglishCompositionalPhrasesLexicalMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("compoundString")), constant_handles_oc.f8479((SubLObject)makeString("regularSuffix")), constant_handles_oc.f8479((SubLObject)makeString("presentParticiple")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("OpenEndedInvestmentCompany")), constant_handles_oc.f8479((SubLObject)makeString("nameString")), (SubLObject)makeString("OEIC")), constant_handles_oc.f8479((SubLObject)makeString("EnglishMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("initialismString")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("ScubaDiving")), constant_handles_oc.f8479((SubLObject)makeString("nonPlural-Generic")), (SubLObject)makeString("scuba diving")), constant_handles_oc.f8479((SubLObject)makeString("EnglishMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("multiWordString")), constant_handles_oc.f8479((SubLObject)makeString("regularSuffix")), constant_handles_oc.f8479((SubLObject)makeString("regularSuffix")), constant_handles_oc.f8479((SubLObject)makeString("infinitive")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("SupraventricularTachycardia")), constant_handles_oc.f8479((SubLObject)makeString("MassNoun")), (SubLObject)makeString("supraventricular tach")), constant_handles_oc.f8479((SubLObject)makeString("EnglishMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("speechPartPreds")), constant_handles_oc.f8479((SubLObject)makeString("abbreviationForLexicalWord")), constant_handles_oc.f8479((SubLObject)makeString("multiWordString")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("Hepatitis")), constant_handles_oc.f8479((SubLObject)makeString("massNumber")), (SubLObject)makeString("hepatitis")), constant_handles_oc.f8479((SubLObject)makeString("EnglishMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("massNumber")), constant_handles_oc.f8479((SubLObject)makeString("speechPartPreds")), constant_handles_oc.f8479((SubLObject)makeString("denotation")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("GolfCourse")), constant_handles_oc.f8479((SubLObject)makeString("plural")), (SubLObject)makeString("links")), constant_handles_oc.f8479((SubLObject)makeString("GeneralEnglishMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("speechPartPreds")), constant_handles_oc.f8479((SubLObject)makeString("denotation")), constant_handles_oc.f8479((SubLObject)makeString("plural")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("ChronicObstructivePulmonaryDisease-PulmonaryFunctionTest")), constant_handles_oc.f8479((SubLObject)makeString("nonPlural-Generic")), (SubLObject)makeString("COPD confirmed by a pulmonary function test")), constant_handles_oc.f8479((SubLObject)makeString("MedicalLexicalMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("speechPartPreds")), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("compoundString")), constant_handles_oc.f8479((SubLObject)makeString("massNumber")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("TetralogyOfFallotWithAbsentPulmonaryValve")), constant_handles_oc.f8479((SubLObject)makeString("nonPlural-Generic")), (SubLObject)makeString("Tetralogy of Fallot with absent pulmonary valve")), constant_handles_oc.f8479((SubLObject)makeString("MedicalLexicalMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("speechPartPreds")), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("compoundString")), constant_handles_oc.f8479((SubLObject)makeString("pnMassNumber")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("DiseaseOfTheAorta")), constant_handles_oc.f8479((SubLObject)makeString("CountNoun")), (SubLObject)makeString("disease of the aorta")), constant_handles_oc.f8479((SubLObject)makeString("MedicalLexicalMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("speechPartPreds")), constant_handles_oc.f8479((SubLObject)makeString("compoundString")), constant_handles_oc.f8479((SubLObject)makeString("singular")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("Tennis-TheGame")), constant_handles_oc.f8479((SubLObject)makeString("nonPlural-Generic")), (SubLObject)makeString("tennis")), constant_handles_oc.f8479((SubLObject)makeString("GeneralEnglishMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("speechPartPreds")), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("denotation")), constant_handles_oc.f8479((SubLObject)makeString("massNumber")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("PorscheCar")), constant_handles_oc.f8479((SubLObject)makeString("nonPlural-Generic")), (SubLObject)makeString("Porsche")), constant_handles_oc.f8479((SubLObject)makeString("GeneralEnglishMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("speechPartPreds")), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("denotation")), constant_handles_oc.f8479((SubLObject)makeString("pnSingular")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("InLineSkating")), constant_handles_oc.f8479((SubLObject)makeString("nonPlural-Generic")), (SubLObject)makeString("roller-blading")), constant_handles_oc.f8479((SubLObject)makeString("GeneralEnglishMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("speechPartPreds")), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("denotation")), constant_handles_oc.f8479((SubLObject)makeString("regularSuffix")), constant_handles_oc.f8479((SubLObject)makeString("regularSuffix")), constant_handles_oc.f8479((SubLObject)makeString("infinitive")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("EnemaAdministeringEvent")), constant_handles_oc.f8479((SubLObject)makeString("nonPlural-Generic")), (SubLObject)makeString("enema")), constant_handles_oc.f8479((SubLObject)makeString("GeneralEnglishMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("speechPartPreds")), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("denotation")), constant_handles_oc.f8479((SubLObject)makeString("singular")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("Exercising")), constant_handles_oc.f8479((SubLObject)makeString("nonPlural-Generic")), (SubLObject)makeString("Bewegung")), constant_handles_oc.f8479((SubLObject)makeString("GermanLexicalMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("speechPartPreds")), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("denotation")), constant_handles_oc.f8479((SubLObject)makeString("singular-Feminine")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("Baseball-TheGame")), constant_handles_oc.f8479((SubLObject)makeString("nonPlural-Generic")), (SubLObject)makeString("the game of baseball")), constant_handles_oc.f8479((SubLObject)makeString("GeneralEnglishMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("speechPartPreds")), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("headMedialString")), constant_handles_oc.f8479((SubLObject)makeString("massNumber")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("AtrialFibrillationOrFlutter")), constant_handles_oc.f8479((SubLObject)makeString("nonPlural-Generic")), (SubLObject)makeString("atrial fibrillation or flutter")), constant_handles_oc.f8479((SubLObject)makeString("GeneralEnglishMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("speechPartPreds")), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("headMedialString")), constant_handles_oc.f8479((SubLObject)makeString("singular")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("SinglesTableTennis")), constant_handles_oc.f8479((SubLObject)makeString("nonPlural-Generic")), (SubLObject)makeString("singles table tennis")), constant_handles_oc.f8479((SubLObject)makeString("EnglishMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("speechPartPreds")), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("multiWordString")), constant_handles_oc.f8479((SubLObject)makeString("massNumber")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("VentricularSeptalDefect-Atrial-ventricularCanalType")), constant_handles_oc.f8479((SubLObject)makeString("nonPlural-Generic")), (SubLObject)makeString("A-V canal type VSD")), constant_handles_oc.f8479((SubLObject)makeString("MedicalLexicalMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("speechPartPreds")), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("multiWordString")), constant_handles_oc.f8479((SubLObject)makeString("pnSingular")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("Poker-CardGame")), constant_handles_oc.f8479((SubLObject)makeString("nonPlural-Generic")), (SubLObject)makeString("poker game")), constant_handles_oc.f8479((SubLObject)makeString("EnglishMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("speechPartPreds")), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("multiWordString")), constant_handles_oc.f8479((SubLObject)makeString("singular")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("DiseaseOfTheDescendingAorta")), constant_handles_oc.f8479((SubLObject)makeString("MassNoun")), (SubLObject)makeString("disease of the descending aorta")), constant_handles_oc.f8479((SubLObject)makeString("EnglishCompositionalPhrasesLexicalMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("speechPartPreds")), constant_handles_oc.f8479((SubLObject)makeString("compoundString")), constant_handles_oc.f8479((SubLObject)makeString("massNumber")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("Franchise")), constant_handles_oc.f8479((SubLObject)makeString("Noun")), (SubLObject)makeString("franchises")), constant_handles_oc.f8479((SubLObject)makeString("GeneralEnglishMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("speechPartPreds")), constant_handles_oc.f8479((SubLObject)makeString("genls")), constant_handles_oc.f8479((SubLObject)makeString("denotation")), constant_handles_oc.f8479((SubLObject)makeString("regularSuffix")), constant_handles_oc.f8479((SubLObject)makeString("singular")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("Ox")), constant_handles_oc.f8479((SubLObject)makeString("CountNoun")), (SubLObject)makeString("oxen")), constant_handles_oc.f8479((SubLObject)makeString("GeneralEnglishMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("speechPartPreds")), constant_handles_oc.f8479((SubLObject)makeString("denotation")), constant_handles_oc.f8479((SubLObject)makeString("plural")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("Calcification")), constant_handles_oc.f8479((SubLObject)makeString("MassNoun")), (SubLObject)makeString("calcification")), constant_handles_oc.f8479((SubLObject)makeString("EnglishJargonMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("speechPartPreds")), constant_handles_oc.f8479((SubLObject)makeString("denotation")), constant_handles_oc.f8479((SubLObject)makeString("massNumber")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("AtresiaWithVentricularSeptalDefect-PulmonaryValve")), constant_handles_oc.f8479((SubLObject)makeString("MassNoun")), (SubLObject)makeString("pulmonary valve atresia with ventricular septal defect")), constant_handles_oc.f8479((SubLObject)makeString("MedicalLexicalMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("speechPartPreds")), constant_handles_oc.f8479((SubLObject)makeString("headMedialString")), constant_handles_oc.f8479((SubLObject)makeString("massNumber")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("RenalFailure")), constant_handles_oc.f8479((SubLObject)makeString("MassNoun")), (SubLObject)makeString("renal failure")), constant_handles_oc.f8479((SubLObject)makeString("GeneralEnglishMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("speechPartPreds")), constant_handles_oc.f8479((SubLObject)makeString("multiWordString")), constant_handles_oc.f8479((SubLObject)makeString("massNumber")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("AbnormalNumberOfCusps")), constant_handles_oc.f8479((SubLObject)makeString("nonPlural-Generic")), (SubLObject)makeString("abnormal num of cusps")), constant_handles_oc.f8479((SubLObject)makeString("CCFLexicalMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("speechPartPreds")), constant_handles_oc.f8479((SubLObject)makeString("abbreviationForLexicalWord")), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("headMedialString")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-CaseInsensitive-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("Ox")), constant_handles_oc.f8479((SubLObject)makeString("CountNoun")), (SubLObject)makeString("oXen")), constant_handles_oc.f8479((SubLObject)makeString("GeneralEnglishMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("speechPartPreds")), constant_handles_oc.f8479((SubLObject)makeString("denotation")), constant_handles_oc.f8479((SubLObject)makeString("plural")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SubcollectionOfWithRelationToFn")), constant_handles_oc.f8479((SubLObject)makeString("Submarine")), constant_handles_oc.f8479((SubLObject)makeString("mainColorOfObject")), constant_handles_oc.f8479((SubLObject)makeString("YellowColor"))), constant_handles_oc.f8479((SubLObject)makeString("CharacterString")), (SubLObject)makeString("the yellow submarine")), constant_handles_oc.f8479((SubLObject)makeString("EnglishMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SubcollectionOfWithRelationToFn")), constant_handles_oc.f8479((SubLObject)makeString("Submarine")), constant_handles_oc.f8479((SubLObject)makeString("mainColorOfObject")), constant_handles_oc.f8479((SubLObject)makeString("YellowColor"))), constant_handles_oc.f8479((SubLObject)makeString("NounPhrase")), (SubLObject)makeString("a yellow submarine")), constant_handles_oc.f8479((SubLObject)makeString("EnglishMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SubcollectionOfWithRelationToFn")), constant_handles_oc.f8479((SubLObject)makeString("Submarine")), constant_handles_oc.f8479((SubLObject)makeString("mainColorOfObject")), constant_handles_oc.f8479((SubLObject)makeString("YellowColor"))), constant_handles_oc.f8479((SubLObject)makeString("singular-Generic")), (SubLObject)makeString("yellow submarine")), constant_handles_oc.f8479((SubLObject)makeString("EnglishMt")), (SubLObject)makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")))) });
    }
    
    public void declareFunctions() {
        f45307();
    }
    
    public void initializeVariables() {
        f45308();
    }
    
    public void runTopLevelForms() {
        f45309();
    }
    
    static {
        me = (SubLFile)new module0735();
        $g5816$ = null;
        $g5817$ = null;
        $g5818$ = null;
        $g5819$ = null;
        $g5820$ = null;
        $g5821$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("S#14781", "CYC"), (SubLObject)makeSymbol("S#13100", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic1$ = makeSymbol("S#25119", "CYC");
        $ic2$ = makeSymbol("S#25120", "CYC");
        $ic3$ = makeSymbol("S#25121", "CYC");
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#49531", "CYC"), (SubLObject)makeSymbol("S#4322", "CYC"), (SubLObject)makeSymbol("STRING"));
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("CommonEnglishMisspellingsMt"));
        $ic6$ = makeKeyword("REMOVAL-WORD-STRINGS-CHECK");
        $ic7$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#39429", "CYC")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("S#49449", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#49525", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#49451", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<speech-part-pred> <fully bound> <string>) using the lexicon cache"), makeKeyword("EXAMPLE"), makeString("(#$nounStrings #$Dog-TheWord \"dog\")") });
        $ic8$ = makeKeyword("WORD-STRINGS");
        $ic9$ = makeSymbol("S#49454", "CYC");
        $ic10$ = makeKeyword("REMOVAL-WORD-STRINGS-UNIFY-ARG1");
        $ic11$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#39429", "CYC")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("S#49453", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#49526", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#49531", "CYC")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#49531", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("STRING")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#49531", "CYC"), (SubLObject)makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#49454", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#49531", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("STRING")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#49531", "CYC")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("STRING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("WORD-STRINGS"), makeKeyword("DOCUMENTATION"), makeString("(<speech-part-predicate> <not fully-bound> <string>)\nusing the lexicon cache"), makeKeyword("EXAMPLE"), makeString("(#$wordStrings ?WHAT \"dog\")") });
        $ic12$ = ConsesLow.list((SubLObject)makeSymbol("S#49531", "CYC"), (SubLObject)makeSymbol("S#4322", "CYC"), (SubLObject)makeSymbol("S#751", "CYC"));
        $ic13$ = makeKeyword("REMOVAL-WORD-STRINGS-UNIFY-ARG2");
        $ic14$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#39429", "CYC")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("S#49455", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("COST"), makeSymbol("S#49456", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#49457", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<speech-part-predicate> <fully bound> <not fully bound>) using the lexicon cache"), makeKeyword("EXAMPLE"), makeString("(#$nounStrings #$Dog-TheWord ?STRING)") });
        $ic15$ = makeKeyword("DEPTH");
        $ic16$ = makeKeyword("STACK");
        $ic17$ = makeKeyword("QUEUE");
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("True-JustificationTruth"));
        $ic19$ = makeSymbol("S#11450", "CYC");
        $ic20$ = makeKeyword("ERROR");
        $ic21$ = makeString("~A is not a ~A");
        $ic22$ = makeSymbol("S#11592", "CYC");
        $ic23$ = makeKeyword("CERROR");
        $ic24$ = makeString("continue anyway");
        $ic25$ = makeKeyword("WARN");
        $ic26$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic27$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic28$ = makeString("~A is neither SET-P nor LISTP.");
        $ic29$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic30$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic31$ = makeSymbol("S#49438", "CYC");
        $ic32$ = makeSymbol("S#49439", "CYC");
        $ic33$ = ConsesLow.list((SubLObject)makeSymbol("S#49532", "CYC"), (SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#751", "CYC"), (SubLObject)makeSymbol("S#49533", "CYC"), (SubLObject)makeSymbol("S#49534", "CYC"));
        $ic34$ = ConsesLow.list((SubLObject)makeKeyword("SPEECH-PART-PREDICATE"), (SubLObject)makeKeyword("ARG1"), (SubLObject)makeKeyword("ARG2"), (SubLObject)makeKeyword("TRIE-ITERATOR"), (SubLObject)makeKeyword("ENTRY-ITERATOR"));
        $ic35$ = ConsesLow.list((SubLObject)makeSymbol("S#49461", "CYC"), (SubLObject)makeSymbol("S#49462", "CYC"), (SubLObject)makeSymbol("S#49463", "CYC"), (SubLObject)makeSymbol("S#49464", "CYC"), (SubLObject)makeSymbol("S#49465", "CYC"));
        $ic36$ = ConsesLow.list((SubLObject)makeSymbol("S#49466", "CYC"), (SubLObject)makeSymbol("S#49467", "CYC"), (SubLObject)makeSymbol("S#49468", "CYC"), (SubLObject)makeSymbol("S#49469", "CYC"), (SubLObject)makeSymbol("S#49470", "CYC"));
        $ic37$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic38$ = makeSymbol("S#49460", "CYC");
        $ic39$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#49439", "CYC"));
        $ic40$ = makeSymbol("S#49461", "CYC");
        $ic41$ = makeSymbol("S#49466", "CYC");
        $ic42$ = makeSymbol("S#49462", "CYC");
        $ic43$ = makeSymbol("S#49467", "CYC");
        $ic44$ = makeSymbol("S#49463", "CYC");
        $ic45$ = makeSymbol("S#49468", "CYC");
        $ic46$ = makeSymbol("S#49464", "CYC");
        $ic47$ = makeSymbol("S#49469", "CYC");
        $ic48$ = makeSymbol("S#49465", "CYC");
        $ic49$ = makeSymbol("S#49470", "CYC");
        $ic50$ = makeKeyword("SPEECH-PART-PREDICATE");
        $ic51$ = makeKeyword("ARG1");
        $ic52$ = makeKeyword("ARG2");
        $ic53$ = makeKeyword("TRIE-ITERATOR");
        $ic54$ = makeKeyword("ENTRY-ITERATOR");
        $ic55$ = makeString("Invalid slot ~S for construction function");
        $ic56$ = makeKeyword("BEGIN");
        $ic57$ = makeSymbol("S#49471", "CYC");
        $ic58$ = makeKeyword("SLOT");
        $ic59$ = makeKeyword("END");
        $ic60$ = makeSymbol("S#49473", "CYC");
        $ic61$ = makeSymbol("S#49474", "CYC");
        $ic62$ = makeSymbol("S#49478", "CYC");
        $ic63$ = ConsesLow.list((SubLObject)makeSymbol("S#49532", "CYC"), (SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#751", "CYC"));
        $ic64$ = makeSymbol("S#49479", "CYC");
        $ic65$ = makeSymbol("S#49480", "CYC");
        $ic66$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("STRING"), (SubLObject)makeSymbol("S#14510", "CYC"));
        $ic67$ = makeSymbol("S#49481", "CYC");
        $ic68$ = ConsesLow.list((SubLObject)makeKeyword("REMOVAL-WORD-STRINGS-UNIFY-ARG2"), (SubLObject)makeKeyword("REMOVAL-WORD-STRINGS-UNIFY-ARG1"), (SubLObject)makeKeyword("REMOVAL-WORD-STRINGS-CHECK"));
        $ic69$ = constant_handles_oc.f8479((SubLObject)makeString("regularSuffix"));
        $ic70$ = makeKeyword("REMOVAL-WORD-FORMS-CHECK");
        $ic71$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("wordForms")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("wordForms")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("S#49482", "CYC"), makeKeyword("COST"), makeSymbol("S#49483", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#49484", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$wordForms <fully bound> <fully bound> <string>) using morphology functions"), makeKeyword("EXAMPLE"), makeString("(#$wordForms #$Ox-TheWord #$plural \"oxen\")") });
        $ic72$ = makeKeyword("REMOVAL-WORD-FORMS-UNIFY-ARG1");
        $ic73$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("wordForms")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("wordForms")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("S#49485", "CYC"), makeKeyword("COST"), makeSymbol("S#49486", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#49487", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$wordForms <not-fully-bound> <fully-bound> <string>) using morphology functions"), makeKeyword("EXAMPLE"), makeString("(#$wordForms ?WORD #$plural \"dogs\")") });
        $ic74$ = constant_handles_oc.f8479((SubLObject)makeString("speechPartPreds"));
        $ic75$ = makeKeyword("REMOVAL-WORD-FORMS-UNIFY-ARG2");
        $ic76$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("wordForms")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("wordForms")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("S#49488", "CYC"), makeKeyword("COST"), makeSymbol("S#49489", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#49490", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$wordForms <fully-bound> <not-fully-bound> <string>) using morphology functions"), makeKeyword("EXAMPLE"), makeString("(#$wordForms #$Dog-TheWord ?PRED \"dogs\")") });
        $ic77$ = makeKeyword("REMOVAL-WORD-FORMS-UNIFY-ARG3");
        $ic78$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("wordForms")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("wordForms")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("S#49491", "CYC"), makeKeyword("COST"), makeSymbol("S#49492", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#49493", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$wordForms <fully-bound> <fully-bound> <not-fully-bound>) using morphology functions"), makeKeyword("EXAMPLE"), makeString("(#$wordForms #$Dog-TheWord #$plural ?STRING)") });
        $ic79$ = makeKeyword("REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2");
        $ic80$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("wordForms")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("wordForms")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("S#49494", "CYC"), makeKeyword("COST"), makeSymbol("S#49495", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#49496", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$wordForms <not-fully-bound> <not-fully-bound> <string>) using morphology functions"), makeKeyword("EXAMPLE"), makeString("(#$wordForms ?WORD ?PRED \"dogs\")") });
        $ic81$ = makeKeyword("REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3");
        $ic82$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("wordForms")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("wordForms")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("S#49497", "CYC"), makeKeyword("COST"), makeSymbol("S#49498", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#49499", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$wordForms <fully-bound> <not-fully-bound> <not-fully-bound>) using morphology functions"), makeKeyword("EXAMPLE"), makeString("(#$wordForms #$Dog-TheWord ?PRED ?STRING)") });
        $ic83$ = constant_handles_oc.f8479((SubLObject)makeString("termStrings"));
        $ic84$ = makeKeyword("TRUE");
        $ic85$ = makeSymbol("S#25122", "CYC");
        $ic86$ = makeSymbol("S#25123", "CYC");
        $ic87$ = constant_handles_oc.f8479((SubLObject)makeString("termPhrases"));
        $ic88$ = constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical"));
        $ic89$ = constant_handles_oc.f8479((SubLObject)makeString("termPhrases-CaseInsensitive"));
        $ic90$ = constant_handles_oc.f8479((SubLObject)makeString("termPhrases-CaseInsensitive-Lexical"));
        $ic91$ = constant_handles_oc.f8479((SubLObject)makeString("CharacterString"));
        $ic92$ = ConsesLow.list((SubLObject)makeSymbol("S#14781", "CYC"), (SubLObject)makeSymbol("S#25111", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic93$ = makeSymbol("S#25124", "CYC");
        $ic94$ = makeSymbol("S#14752", "CYC");
        $ic95$ = makeSymbol("S#49503", "CYC");
        $ic96$ = makeKeyword("TEST");
        $ic97$ = makeSymbol("S#49501", "CYC");
        $ic98$ = makeKeyword("OWNER");
        $ic99$ = makeKeyword("CLASSES");
        $ic100$ = makeKeyword("KB");
        $ic101$ = makeKeyword("FULL");
        $ic102$ = makeKeyword("WORKING?");
        $ic103$ = _constant_103_initializer();
        $ic104$ = makeSymbol("SUPPORT-P");
        $ic105$ = makeSymbol("S#39429", "CYC");
        $ic106$ = constant_handles_oc.f8479((SubLObject)makeString("abbreviationForLexicalWord"));
        $ic107$ = makeSymbol("SUPPORT-SENTENCE");
        $ic108$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic109$ = ConsesLow.list((SubLObject)makeKeyword("MAX-NUMBER"), (SubLObject)ONE_INTEGER);
        $ic110$ = ConsesLow.list((SubLObject)makeKeyword("OR"), constant_handles_oc.f8479((SubLObject)makeString("termPhrases")), constant_handles_oc.f8479((SubLObject)makeString("termPhrases-CaseInsensitive")));
        $ic111$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12459", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("S#11198", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic112$ = makeSymbol("PIF");
        $ic113$ = makeSymbol("INDEXED-TERM-P");
        $ic114$ = makeSymbol("DO-GAF-ARG-INDEX");
        $ic115$ = makeKeyword("PREDICATE");
        $ic116$ = makeKeyword("INDEX");
        $ic117$ = ConsesLow.list((SubLObject)makeKeyword("TRUTH"), (SubLObject)makeKeyword("TRUE"));
        $ic118$ = makeSymbol("S#16821", "CYC");
        $ic119$ = ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#43350", "CYC"), (SubLObject)makeSymbol("S#6053", "CYC"));
        $ic120$ = makeKeyword("TERM-PHRASES");
        $ic121$ = makeSymbol("S#49513", "CYC");
        $ic122$ = constant_handles_oc.f8479((SubLObject)makeString("StringIndexingSlot"));
        $ic123$ = makeSymbol("S#39454", "CYC");
        $ic124$ = constant_handles_oc.f8479((SubLObject)makeString("ProperNameString"));
        $ic125$ = constant_handles_oc.f8479((SubLObject)makeString("arg2Isa"));
        $ic126$ = makeKeyword("ALL");
        $ic127$ = constant_handles_oc.f8479((SubLObject)makeString("NLWordForm"));
        $ic128$ = constant_handles_oc.f8479((SubLObject)makeString("NounPhrase"));
        $ic129$ = constant_handles_oc.f8479((SubLObject)makeString("nonSingular-Generic"));
        $ic130$ = constant_handles_oc.f8479((SubLObject)makeString("GenericSpeechPartPredicate"));
        $ic131$ = makeKeyword("REMOVAL-TERM-PHRASES-CASE-INSENSITIVE-LEXICAL-UNIFY-ARG3");
        $ic132$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("termPhrases-CaseInsensitive-Lexical")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-CaseInsensitive-Lexical")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("S#49504", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#49529", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#49508", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-CaseInsensitive-Lexical <fully bound> <fully bound> <whatever>) using lexicon functions and generation"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases-CaseInsensitive-Lexical #$Egypt #$ProperNameString \"EGYPT\")\n    (#$termPhrases-CaseInsensitive-Lexical #$FamousHuman #$singular ?STRING)") });
        $ic133$ = makeKeyword("REMOVAL-TERM-PHRASES-CASE-INSENSITIVE-UNIFY-ARG3");
        $ic134$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("termPhrases-CaseInsensitive")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-CaseInsensitive")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("S#49504", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#49529", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#49508", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-CaseInsensitive <fully bound> <fully bound> <whatever>) using lexicon functions and generation"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases-CaseInsensitive #$Egypt #$ProperNameString \"EGYPT\")\n    (#$termPhrases-CaseInsensitive #$FamousHuman #$singular ?STRING)") });
        $ic135$ = makeKeyword("REMOVAL-TERM-PHRASES-UNIFY-ARG3");
        $ic136$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("termPhrases")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("S#49504", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#49529", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#49508", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases <fully bound> <fully bound> <whatever>) using lexicon functions and generation"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases #$Egypt #$ProperNameString \"Egypt\")\n    (#$termPhrases #$FamousHuman #$singular ?STRING)") });
        $ic137$ = makeKeyword("REMOVAL-TERM-PHRASES-LEXICAL-UNIFY-ARG3");
        $ic138$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("S#49504", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#49529", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#49508", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-Lexical <fully bound> <fully bound> <whatever>) using lexicon functions"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases #$Egypt #$ProperNameString \"Egypt\")\n    (#$termPhrases #$FamousHuman #$singular ?STRING)") });
        $ic139$ = makeKeyword("REMOVAL-TERM-PHRASES-UNIFY-ARG1");
        $ic140$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("termPhrases")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("S#49504", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#49529", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#49514", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases <whatever> <fully bound> <string>) using lexicon functions and parsing"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases ?WHAT #$singular \"emu\")") });
        $ic141$ = makeKeyword("REMOVAL-TERM-PHRASES-CASE-INSENSITIVE-UNIFY-ARG1");
        $ic142$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("termPhrases-CaseInsensitive")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-CaseInsensitive")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("S#49504", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#49529", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#49514", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-CaseInsensitive <not fully bound> <fully bound> <string>) using lexicon functions and parsing"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases-CaseInsensitive ?WHAT #$singular \"emu\")") });
        $ic143$ = makeKeyword("REMOVAL-TERM-PHRASES-LEXICAL-UNIFY-ARG1");
        $ic144$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("S#49504", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#49529", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#49514", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-Lexical <not fully bound> <fully bound> <string>) using lexicon functions"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases-Lexical ?WHAT #$singular \"emu\")") });
        $ic145$ = makeKeyword("REMOVAL-TERM-PHRASES-CASE-INSENSITIVE-LEXICAL-UNIFY-ARG1");
        $ic146$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("termPhrases-CaseInsensitive-Lexical")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-CaseInsensitive-Lexical")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("S#49504", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#49529", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#49514", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-CaseInsensitive-Lexical <not fully bound> <fully bound> <string>) using lexicon functions"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases-CaseInsensitive-Lexical ?WHAT #$singular \"emu\")") });
        $ic147$ = ConsesLow.list((SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#43350", "CYC"), (SubLObject)makeSymbol("STRING"));
        $ic148$ = makeKeyword("ON");
        $ic149$ = makeKeyword("OFF");
        $ic150$ = makeKeyword("NEVER");
        $ic151$ = makeKeyword("ONLY");
        $ic152$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-CaseInsensitive")), constant_handles_oc.f8479((SubLObject)makeString("termPhrases-CaseInsensitive-Lexical")));
        $ic153$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-Lexical")), constant_handles_oc.f8479((SubLObject)makeString("termPhrases-CaseInsensitive-Lexical")));
        $ic154$ = makeKeyword("REMOVAL-TERM-PHRASES-UNIFY-ARG1-AND-ARG2");
        $ic155$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("termPhrases")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("S#49504", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#49529", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#49519", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases <not fully bound> <not fully bound> <string>) using lexicon functions"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases ?DENOT ?CONSTRAINT \"emu\")") });
        $ic156$ = makeKeyword("REMOVAL-TERM-PHRASES-CASE-INSENSITIVE-UNIFY-ARG1-AND-ARG2");
        $ic157$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("termPhrases-CaseInsensitive")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termPhrases-CaseInsensitive")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("S#49504", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#49529", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#49519", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-CaseInsensitive <not fully bound> <not fully bound> <string>) using lexicon functions"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases-CaseInsensitive ?DENOT ?CONSTRAINT \"emu\")") });
        $ic158$ = ConsesLow.list((SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#751", "CYC"), (SubLObject)makeSymbol("STRING"));
        $ic159$ = constant_handles_oc.f8479((SubLObject)makeString("TermPhrasesConstraint"));
        $ic160$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic161$ = makeKeyword("BREADTH");
        $ic162$ = constant_handles_oc.f8479((SubLObject)makeString("wordForms"));
        $ic163$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("STRING"));
        $ic164$ = ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#49535", "CYC"));
        $ic165$ = ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#49536", "CYC"));
        $ic166$ = makeSymbol("S#49535", "CYC");
        $ic167$ = makeSymbol("S#49536", "CYC");
        $ic168$ = makeKeyword("GENLPREDS");
        $ic169$ = makeSymbol("S#49523", "CYC");
        $ic170$ = makeSymbol("S#49524", "CYC");
        $ic171$ = makeKeyword("TERM-STRINGS-STRONGLY-PREFER-AT-LEAST-ONE-FULLY-BOUND-ARG");
        $ic172$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("GENL-PRED"), constant_handles_oc.f8479((SubLObject)makeString("termStrings"))), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic173$ = makeKeyword("TERM-PHRASES-STRONGLY-PREFER-AT-LEAST-TERM-OR-STRING-FULLY-BOUND");
        $ic174$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("GENL-PRED"), constant_handles_oc.f8479((SubLObject)makeString("termPhrases"))), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic175$ = makeKeyword("REMOVAL-LEXICON-NAMESTRING");
        $ic176$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#49537", "CYC")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("STRINGP"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#49530", "CYC"), makeKeyword("COMPLETE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#49524", "CYC")), makeKeyword("EXPAND"), makeSymbol("S#49523", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<name-string-pred> <anything> <string>)\nusing the Cyc lexicon."), makeKeyword("EXAMPLE"), makeString("(#$nameString ?WHO \"Cher\")") });
    }
    
    public static final class $sX49438_native extends SubLStructNative
    {
        public SubLObject $speech_part_predicate;
        public SubLObject $arg1;
        public SubLObject $arg2;
        public SubLObject $trie_iterator;
        public SubLObject $entry_iterator;
        public static final SubLStructDeclNative structDecl;
        
        public $sX49438_native() {
            this.$speech_part_predicate = (SubLObject)CommonSymbols.NIL;
            this.$arg1 = (SubLObject)CommonSymbols.NIL;
            this.$arg2 = (SubLObject)CommonSymbols.NIL;
            this.$trie_iterator = (SubLObject)CommonSymbols.NIL;
            this.$entry_iterator = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$speech_part_predicate;
        }
        
        public SubLObject getField3() {
            return this.$arg1;
        }
        
        public SubLObject getField4() {
            return this.$arg2;
        }
        
        public SubLObject getField5() {
            return this.$trie_iterator;
        }
        
        public SubLObject getField6() {
            return this.$entry_iterator;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$speech_part_predicate = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$arg1 = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$arg2 = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$trie_iterator = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$entry_iterator = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX49438_native.class, $ic31$, $ic32$, $ic33$, $ic34$, new String[] { "$speech_part_predicate", "$arg1", "$arg2", "$trie_iterator", "$entry_iterator" }, $ic35$, $ic36$, $ic37$);
        }
    }
    
    public static final class $f45238$UnaryFunction extends UnaryFunction
    {
        public $f45238$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#49439"));
        }
        
        public SubLObject processItem(final SubLObject var79) {
            return f45238(var79);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 3067 ms
	
	Decompiled with Procyon 0.5.32.
*/