package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0802 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0802";
    public static final String myFingerPrint = "6c132fcbf82e30308ce3958875c0ee945f4062f0792ff50e271368fc6f91f408";
    private static SubLSymbol $g6380$;
    public static SubLSymbol $g6381$;
    private static SubLSymbol $g6382$;
    public static SubLSymbol $g6383$;
    private static SubLSymbol $g6384$;
    private static SubLSymbol $g6385$;
    private static SubLSymbol $g6386$;
    private static SubLSymbol $g6387$;
    private static SubLSymbol $g6388$;
    private static SubLSymbol $g6389$;
    private static SubLSymbol $g6390$;
    private static SubLSymbol $g6391$;
    private static final SubLObject $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLInteger $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLInteger $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLList $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLObject $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLObject $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLObject $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLObject $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLObject $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLList $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLObject $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLObject $ic76$;
    private static final SubLList $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLObject $ic80$;
    private static final SubLList $ic81$;
    private static final SubLList $ic82$;
    private static final SubLList $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLObject $ic85$;
    private static final SubLList $ic86$;
    private static final SubLObject $ic87$;
    private static final SubLList $ic88$;
    private static final SubLList $ic89$;
    private static final SubLObject $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLList $ic92$;
    private static final SubLList $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLObject $ic97$;
    private static final SubLList $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLObject $ic102$;
    private static final SubLObject $ic103$;
    private static final SubLObject $ic104$;
    private static final SubLSymbol $ic105$;
    
    public static SubLObject f51146() {
        f51147();
        f51148();
        f51149();
        f51150();
        f51151();
        f51152();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51153(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)$ic3$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f51154(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)$ic5$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f51147() {
        final SubLObject var8 = $g6384$.getGlobalValue();
        if (NIL != var8) {
            module0034.f1818(var8);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51155(final SubLObject var9) {
        return module0034.f1829($g6384$.getGlobalValue(), (SubLObject)ConsesLow.list(var9), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51156(final SubLObject var9) {
        return (SubLObject)makeBoolean(NIL != module0206.f13444(var9) && (NIL != module0202.f12589(var9, $ic7$) || NIL != module0434.f30582((SubLObject)ConsesLow.listS($ic8$, var9, (SubLObject)$ic9$), $ic0$, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f51157(final SubLObject var9) {
        SubLObject var10 = $g6384$.getGlobalValue();
        if (NIL == var10) {
            var10 = module0034.f1934((SubLObject)$ic6$, (SubLObject)$ic10$, (SubLObject)$ic11$, (SubLObject)EQUAL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var11 = module0034.f1814(var10, var9, (SubLObject)$ic12$);
        if (var11 == $ic12$) {
            var11 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f51156(var9)));
            module0034.f1816(var10, var9, var11, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var11);
    }
    
    public static SubLObject f51158() {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (NIL == $g6382$.getDynamicValue(var12)) {
            $g6382$.setDynamicValue((SubLObject)ConsesLow.listS($ic7$, $g6381$.getDynamicValue(var12), (SubLObject)$ic13$), var12);
        }
        return $g6382$.getDynamicValue(var12);
    }
    
    public static SubLObject f51159(final SubLObject var13, final SubLObject var14) {
        f51149();
        f51150();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51160(final SubLObject var13, final SubLObject var14) {
        f51149();
        f51150();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51148() {
        final SubLObject var8 = $g6385$.getGlobalValue();
        if (NIL != var8) {
            module0034.f1818(var8);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51161(final SubLObject var15, final SubLObject var16) {
        return module0034.f1829($g6385$.getGlobalValue(), (SubLObject)ConsesLow.list(var15, var16), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51162(final SubLObject var15, final SubLObject var16) {
        return (NIL != module0173.f10955(var15)) ? module0078.f5367(module0259.f16840(var15, var16, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : module0078.f5367(Mapping.mapcar((SubLObject)$ic17$, module0347.f23344((SubLObject)$ic18$, (SubLObject)ConsesLow.listS($ic8$, var15, (SubLObject)$ic19$), var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51163(final SubLObject var15, final SubLObject var16) {
        SubLObject var17 = $g6385$.getGlobalValue();
        if (NIL == var17) {
            var17 = module0034.f1934((SubLObject)$ic16$, (SubLObject)$ic20$, (SubLObject)$ic21$, (SubLObject)EQUAL, (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
            module0034.f1953((SubLObject)$ic22$);
        }
        final SubLObject var18 = module0034.f1782(var15, var16);
        final SubLObject var19 = module0034.f1814(var17, var18, (SubLObject)UNPROVIDED);
        if (var19 != $ic12$) {
            SubLObject var20 = var19;
            SubLObject var21 = (SubLObject)NIL;
            var21 = var20.first();
            while (NIL != var20) {
                SubLObject var22 = var21.first();
                final SubLObject var23 = conses_high.second(var21);
                if (var15.equal(var22.first())) {
                    var22 = var22.rest();
                    if (NIL != var22 && NIL == var22.rest() && var16.equal(var22.first())) {
                        return module0034.f1959(var23);
                    }
                }
                var20 = var20.rest();
                var21 = var20.first();
            }
        }
        final SubLObject var24 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f51162(var15, var16)));
        module0034.f1836(var17, var18, var19, var24, (SubLObject)ConsesLow.list(var15, var16));
        return module0034.f1959(var24);
    }
    
    public static SubLObject f51149() {
        final SubLObject var8 = $g6386$.getGlobalValue();
        if (NIL != var8) {
            module0034.f1818(var8);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51164(final SubLObject var25, final SubLObject var16) {
        return module0034.f1829($g6386$.getGlobalValue(), (SubLObject)ConsesLow.list(var25, var16), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51165(final SubLObject var25, final SubLObject var16) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        final SubLObject var27 = module0434.f30578((SubLObject)$ic24$, (SubLObject)ConsesLow.list($ic25$, (SubLObject)$ic24$, var25), var16, (SubLObject)$ic26$);
        final SubLObject var28 = module0078.f5367(var27, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
        final SubLObject var29 = constants_high_oc.f10737((SubLObject)$ic27$);
        if (NIL != constant_handles_oc.f8463(var29, (SubLObject)UNPROVIDED)) {
            SubLObject var30 = (SubLObject)NIL;
            final SubLObject var31 = var29;
            if (NIL != module0158.f10010(var25, (SubLObject)TWO_INTEGER, var31)) {
                final SubLObject var32 = module0158.f10011(var25, (SubLObject)TWO_INTEGER, var31);
                SubLObject var33 = (SubLObject)NIL;
                final SubLObject var34 = (SubLObject)NIL;
                while (NIL == var33) {
                    final SubLObject var35 = module0052.f3695(var32, var34);
                    final SubLObject var36 = (SubLObject)makeBoolean(!var34.eql(var35));
                    if (NIL != var36) {
                        SubLObject var37 = (SubLObject)NIL;
                        try {
                            var37 = module0158.f10316(var35, (SubLObject)$ic28$, (SubLObject)$ic29$, (SubLObject)NIL);
                            SubLObject var32_37 = (SubLObject)NIL;
                            final SubLObject var33_38 = (SubLObject)NIL;
                            while (NIL == var32_37) {
                                final SubLObject var38 = module0052.f3695(var37, var33_38);
                                final SubLObject var35_40 = (SubLObject)makeBoolean(!var33_38.eql(var38));
                                if (NIL != var35_40) {
                                    var30 = module0178.f11331(var38, (SubLObject)ONE_INTEGER);
                                    final SubLObject var39 = module0147.f9540(var16);
                                    final SubLObject var40 = module0147.$g2095$.currentBinding(var26);
                                    final SubLObject var41 = module0147.$g2094$.currentBinding(var26);
                                    final SubLObject var42 = module0147.$g2096$.currentBinding(var26);
                                    try {
                                        module0147.$g2095$.bind(module0147.f9545(var39), var26);
                                        module0147.$g2094$.bind(module0147.f9546(var39), var26);
                                        module0147.$g2096$.bind(module0147.f9549(var39), var26);
                                        SubLObject var43 = var30;
                                        final SubLObject var44 = (SubLObject)$ic32$;
                                        final SubLObject var45 = module0056.f4145(var44);
                                        final SubLObject var42_48 = module0139.$g1635$.currentBinding(var26);
                                        try {
                                            module0139.$g1635$.bind(module0139.f9007(), var26);
                                            final SubLObject var46 = (SubLObject)NIL;
                                            final SubLObject var42_49 = module0141.$g1714$.currentBinding(var26);
                                            final SubLObject var43_51 = module0141.$g1715$.currentBinding(var26);
                                            try {
                                                module0141.$g1714$.bind((NIL != var46) ? var46 : module0141.f9283(), var26);
                                                module0141.$g1715$.bind((SubLObject)((NIL != var46) ? $ic33$ : module0141.$g1715$.getDynamicValue(var26)), var26);
                                                if (NIL != var46 && NIL != module0136.f8864() && NIL == module0141.f9279(var46)) {
                                                    final SubLObject var47 = module0136.$g1591$.getDynamicValue(var26);
                                                    if (var47.eql((SubLObject)$ic34$)) {
                                                        module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic35$, var46, (SubLObject)$ic36$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                    else if (var47.eql((SubLObject)$ic37$)) {
                                                        module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic38$, (SubLObject)$ic35$, var46, (SubLObject)$ic36$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                    else if (var47.eql((SubLObject)$ic39$)) {
                                                        Errors.warn((SubLObject)$ic35$, var46, (SubLObject)$ic36$);
                                                    }
                                                    else {
                                                        Errors.warn((SubLObject)$ic40$, module0136.$g1591$.getDynamicValue(var26));
                                                        Errors.cerror((SubLObject)$ic38$, (SubLObject)$ic35$, var46, (SubLObject)$ic36$);
                                                    }
                                                }
                                                final SubLObject var42_50 = module0141.$g1670$.currentBinding(var26);
                                                final SubLObject var43_52 = module0141.$g1671$.currentBinding(var26);
                                                final SubLObject var44_55 = module0141.$g1672$.currentBinding(var26);
                                                final SubLObject var48 = module0141.$g1674$.currentBinding(var26);
                                                final SubLObject var49 = module0137.$g1605$.currentBinding(var26);
                                                try {
                                                    module0141.$g1670$.bind(module0137.f8955($ic41$), var26);
                                                    module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic41$)), var26);
                                                    module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic41$)), var26);
                                                    module0141.$g1674$.bind((SubLObject)NIL, var26);
                                                    module0137.$g1605$.bind(module0137.f8955($ic41$), var26);
                                                    if (NIL != module0136.f8865() || NIL != module0244.f15795(var30, module0137.f8955((SubLObject)UNPROVIDED))) {
                                                        final SubLObject var42_51 = module0141.$g1677$.currentBinding(var26);
                                                        final SubLObject var43_53 = module0138.$g1619$.currentBinding(var26);
                                                        final SubLObject var44_56 = module0141.$g1674$.currentBinding(var26);
                                                        try {
                                                            module0141.$g1677$.bind(module0141.f9210(), var26);
                                                            module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic41$)), var26);
                                                            module0141.$g1674$.bind((SubLObject)NIL, var26);
                                                            module0249.f16055(var43, (SubLObject)UNPROVIDED);
                                                            while (NIL != var43) {
                                                                final SubLObject var50 = var43;
                                                                module0077.f5326(var50, var28);
                                                                SubLObject var52;
                                                                final SubLObject var51 = var52 = module0200.f12443(module0137.f8955($ic41$));
                                                                SubLObject var53 = (SubLObject)NIL;
                                                                var53 = var52.first();
                                                                while (NIL != var52) {
                                                                    final SubLObject var42_52 = module0137.$g1605$.currentBinding(var26);
                                                                    final SubLObject var43_54 = module0141.$g1674$.currentBinding(var26);
                                                                    try {
                                                                        module0137.$g1605$.bind(var53, var26);
                                                                        module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var26)) : module0141.$g1674$.getDynamicValue(var26)), var26);
                                                                        final SubLObject var54 = module0228.f15229(var43);
                                                                        if (NIL != module0138.f8992(var54)) {
                                                                            final SubLObject var55 = module0242.f15664(var54, module0137.f8955((SubLObject)UNPROVIDED));
                                                                            if (NIL != var55) {
                                                                                final SubLObject var56 = module0245.f15834(var55, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                                                if (NIL != var56) {
                                                                                    SubLObject var57;
                                                                                    for (var57 = module0066.f4838(module0067.f4891(var56)); NIL == module0066.f4841(var57); var57 = module0066.f4840(var57)) {
                                                                                        var26.resetMultipleValues();
                                                                                        final SubLObject var70_71 = module0066.f4839(var57);
                                                                                        final SubLObject var58 = var26.secondMultipleValue();
                                                                                        var26.resetMultipleValues();
                                                                                        if (NIL != module0147.f9507(var70_71)) {
                                                                                            final SubLObject var42_53 = module0138.$g1623$.currentBinding(var26);
                                                                                            try {
                                                                                                module0138.$g1623$.bind(var70_71, var26);
                                                                                                SubLObject var69_74;
                                                                                                for (var69_74 = module0066.f4838(module0067.f4891(var58)); NIL == module0066.f4841(var69_74); var69_74 = module0066.f4840(var69_74)) {
                                                                                                    var26.resetMultipleValues();
                                                                                                    final SubLObject var59 = module0066.f4839(var69_74);
                                                                                                    final SubLObject var60 = var26.secondMultipleValue();
                                                                                                    var26.resetMultipleValues();
                                                                                                    if (NIL != module0141.f9289(var59)) {
                                                                                                        final SubLObject var42_54 = module0138.$g1624$.currentBinding(var26);
                                                                                                        try {
                                                                                                            module0138.$g1624$.bind(var59, var26);
                                                                                                            final SubLObject var61 = var60;
                                                                                                            if (NIL != module0077.f5302(var61)) {
                                                                                                                final SubLObject var62 = module0077.f5333(var61);
                                                                                                                SubLObject var63;
                                                                                                                SubLObject var64;
                                                                                                                SubLObject var65;
                                                                                                                for (var63 = module0032.f1741(var62), var64 = (SubLObject)NIL, var64 = module0032.f1742(var63, var62); NIL == module0032.f1744(var63, var64); var64 = module0032.f1743(var64)) {
                                                                                                                    var65 = module0032.f1745(var63, var64);
                                                                                                                    if (NIL != module0032.f1746(var64, var65) && NIL == module0249.f16059(var65, (SubLObject)UNPROVIDED)) {
                                                                                                                        module0249.f16055(var65, (SubLObject)UNPROVIDED);
                                                                                                                        module0056.f4149(var65, var45);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            else if (var61.isList()) {
                                                                                                                SubLObject var66 = var61;
                                                                                                                SubLObject var67 = (SubLObject)NIL;
                                                                                                                var67 = var66.first();
                                                                                                                while (NIL != var66) {
                                                                                                                    if (NIL == module0249.f16059(var67, (SubLObject)UNPROVIDED)) {
                                                                                                                        module0249.f16055(var67, (SubLObject)UNPROVIDED);
                                                                                                                        module0056.f4149(var67, var45);
                                                                                                                    }
                                                                                                                    var66 = var66.rest();
                                                                                                                    var67 = var66.first();
                                                                                                                }
                                                                                                            }
                                                                                                            else {
                                                                                                                Errors.error((SubLObject)$ic42$, var61);
                                                                                                            }
                                                                                                        }
                                                                                                        finally {
                                                                                                            module0138.$g1624$.rebind(var42_54, var26);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                module0066.f4842(var69_74);
                                                                                            }
                                                                                            finally {
                                                                                                module0138.$g1623$.rebind(var42_53, var26);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    module0066.f4842(var57);
                                                                                }
                                                                            }
                                                                            else {
                                                                                module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic43$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                                            }
                                                                        }
                                                                        else if (NIL != module0155.f9785(var54, (SubLObject)UNPROVIDED)) {
                                                                            SubLObject var20_85;
                                                                            final SubLObject var68 = var20_85 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var26), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var26), module0137.f8955((SubLObject)UNPROVIDED)));
                                                                            SubLObject var69 = (SubLObject)NIL;
                                                                            var69 = var20_85.first();
                                                                            while (NIL != var20_85) {
                                                                                final SubLObject var42_55 = module0138.$g1625$.currentBinding(var26);
                                                                                try {
                                                                                    module0138.$g1625$.bind(var69, var26);
                                                                                    final SubLObject var71;
                                                                                    final SubLObject var70 = var71 = Functions.funcall(var69, var54);
                                                                                    if (NIL != module0077.f5302(var71)) {
                                                                                        final SubLObject var72 = module0077.f5333(var71);
                                                                                        SubLObject var73;
                                                                                        SubLObject var74;
                                                                                        SubLObject var75;
                                                                                        for (var73 = module0032.f1741(var72), var74 = (SubLObject)NIL, var74 = module0032.f1742(var73, var72); NIL == module0032.f1744(var73, var74); var74 = module0032.f1743(var74)) {
                                                                                            var75 = module0032.f1745(var73, var74);
                                                                                            if (NIL != module0032.f1746(var74, var75) && NIL == module0249.f16059(var75, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var75, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var75, var45);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var71.isList()) {
                                                                                        SubLObject var76 = var71;
                                                                                        SubLObject var77 = (SubLObject)NIL;
                                                                                        var77 = var76.first();
                                                                                        while (NIL != var76) {
                                                                                            if (NIL == module0249.f16059(var77, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var77, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var77, var45);
                                                                                            }
                                                                                            var76 = var76.rest();
                                                                                            var77 = var76.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic42$, var71);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1625$.rebind(var42_55, var26);
                                                                                }
                                                                                var20_85 = var20_85.rest();
                                                                                var69 = var20_85.first();
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0141.$g1674$.rebind(var43_54, var26);
                                                                        module0137.$g1605$.rebind(var42_52, var26);
                                                                    }
                                                                    var52 = var52.rest();
                                                                    var53 = var52.first();
                                                                }
                                                                var43 = module0056.f4150(var45);
                                                            }
                                                        }
                                                        finally {
                                                            module0141.$g1674$.rebind(var44_56, var26);
                                                            module0138.$g1619$.rebind(var43_53, var26);
                                                            module0141.$g1677$.rebind(var42_51, var26);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic44$, var30, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                finally {
                                                    module0137.$g1605$.rebind(var49, var26);
                                                    module0141.$g1674$.rebind(var48, var26);
                                                    module0141.$g1672$.rebind(var44_55, var26);
                                                    module0141.$g1671$.rebind(var43_52, var26);
                                                    module0141.$g1670$.rebind(var42_50, var26);
                                                }
                                            }
                                            finally {
                                                module0141.$g1715$.rebind(var43_51, var26);
                                                module0141.$g1714$.rebind(var42_49, var26);
                                            }
                                            module0139.f9011(module0139.$g1635$.getDynamicValue(var26));
                                        }
                                        finally {
                                            module0139.$g1635$.rebind(var42_48, var26);
                                        }
                                    }
                                    finally {
                                        module0147.$g2096$.rebind(var42, var26);
                                        module0147.$g2094$.rebind(var41, var26);
                                        module0147.$g2095$.rebind(var40, var26);
                                    }
                                }
                                var32_37 = (SubLObject)makeBoolean(NIL == var35_40);
                            }
                        }
                        finally {
                            final SubLObject var78 = Threads.$is_thread_performing_cleanupP$.currentBinding(var26);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var26);
                                if (NIL != var37) {
                                    module0158.f10319(var37);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var78, var26);
                            }
                        }
                    }
                    var33 = (SubLObject)makeBoolean(NIL == var36);
                }
            }
        }
        return var28;
    }
    
    public static SubLObject f51166(final SubLObject var25, final SubLObject var16) {
        SubLObject var26 = $g6386$.getGlobalValue();
        if (NIL == var26) {
            var26 = module0034.f1934((SubLObject)$ic23$, (SubLObject)$ic45$, (SubLObject)TWENTY_INTEGER, (SubLObject)EQUAL, (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        final SubLObject var27 = module0034.f1782(var25, var16);
        final SubLObject var28 = module0034.f1814(var26, var27, (SubLObject)UNPROVIDED);
        if (var28 != $ic12$) {
            SubLObject var29 = var28;
            SubLObject var30 = (SubLObject)NIL;
            var30 = var29.first();
            while (NIL != var29) {
                SubLObject var31 = var30.first();
                final SubLObject var32 = conses_high.second(var30);
                if (var25.equal(var31.first())) {
                    var31 = var31.rest();
                    if (NIL != var31 && NIL == var31.rest() && var16.equal(var31.first())) {
                        return module0034.f1959(var32);
                    }
                }
                var29 = var29.rest();
                var30 = var29.first();
            }
        }
        final SubLObject var33 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f51165(var25, var16)));
        module0034.f1836(var26, var27, var28, var33, (SubLObject)ConsesLow.list(var25, var16));
        return module0034.f1959(var33);
    }
    
    public static SubLObject f51167(final SubLObject var25, final SubLObject var16) {
        final SubLObject var26 = module0034.f1933((SubLObject)$ic23$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var27 = (SubLObject)ConsesLow.list(var25, var16);
        return module0034.f1833(var26, var27);
    }
    
    public static SubLObject f51168(final SubLObject var15, SubLObject var90, SubLObject var16) {
        if (var90 == UNPROVIDED) {
            var90 = $g6381$.getDynamicValue();
        }
        if (var16 == UNPROVIDED) {
            var16 = $g6380$.getDynamicValue();
        }
        if (NIL != f51167(var90, var16) && NIL != module0077.f5320(var15, f51166(var90, var16))) {
            return (SubLObject)T;
        }
        if (NIL != f51169(var90)) {
            return module0434.f30582((SubLObject)ConsesLow.list($ic25$, var15, var90), var16, (SubLObject)UNPROVIDED);
        }
        if (NIL == module0212.f13762(var15) && NIL == module0172.f10921(var15)) {
            final SubLObject var91 = module0434.f30582((SubLObject)ConsesLow.list($ic25$, var15, var90), var16, (SubLObject)UNPROVIDED);
            if (NIL != var91 && NIL != module0172.f10917(var15) && NIL != module0172.f10921(var15)) {
                module0077.f5326(module0172.f10921(var15), f51166(var90, var16));
            }
            return var91;
        }
        final SubLObject var92 = f51166(var90, var16);
        return module0077.f5320(module0172.f10922(var15), var92);
    }
    
    public static SubLObject f51169(final SubLObject var25) {
        return module0202.f12589(var25, $ic46$);
    }
    
    public static SubLObject f51170(final SubLObject var93, final SubLObject var25, final SubLObject var16) {
        if (NIL != f51171(var25)) {
            return module0077.f5320(var93, f51172(var25, var16));
        }
        if (NIL != f51173(var25, var16)) {
            return Functions.funcall(f51173(var25, var16), var25, module0172.f10922(var93), var16);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51174() {
        final SubLObject var8 = $g6387$.getGlobalValue();
        if (NIL != var8) {
            module0034.f1818(var8);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51175(final SubLObject var25, final SubLObject var16) {
        return module0034.f1829($g6387$.getGlobalValue(), (SubLObject)ConsesLow.list(var25, var16), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51176(final SubLObject var25, final SubLObject var16) {
        return module0078.f5367(module0434.f30578((SubLObject)$ic48$, (SubLObject)ConsesLow.listS($ic49$, var25, (SubLObject)$ic50$), var16, (SubLObject)UNPROVIDED), (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51172(final SubLObject var25, final SubLObject var16) {
        SubLObject var26 = $g6387$.getGlobalValue();
        if (NIL == var26) {
            var26 = module0034.f1934((SubLObject)$ic47$, (SubLObject)$ic51$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
            module0034.f1940((SubLObject)$ic52$);
        }
        final SubLObject var27 = module0034.f1782(var25, var16);
        final SubLObject var28 = module0034.f1814(var26, var27, (SubLObject)UNPROVIDED);
        if (var28 != $ic12$) {
            SubLObject var29 = var28;
            SubLObject var30 = (SubLObject)NIL;
            var30 = var29.first();
            while (NIL != var29) {
                SubLObject var31 = var30.first();
                final SubLObject var32 = conses_high.second(var30);
                if (var25.equal(var31.first())) {
                    var31 = var31.rest();
                    if (NIL != var31 && NIL == var31.rest() && var16.equal(var31.first())) {
                        return module0034.f1959(var32);
                    }
                }
                var29 = var29.rest();
                var30 = var29.first();
            }
        }
        final SubLObject var33 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f51176(var25, var16)));
        module0034.f1836(var26, var27, var28, var33, (SubLObject)ConsesLow.list(var25, var16));
        return module0034.f1959(var33);
    }
    
    public static SubLObject f51150() {
        final SubLObject var8 = $g6388$.getGlobalValue();
        if (NIL != var8) {
            module0034.f1818(var8);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51177(final SubLObject var25, final SubLObject var16) {
        return module0034.f1829($g6388$.getGlobalValue(), (SubLObject)ConsesLow.list(var25, var16), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51178(final SubLObject var25, final SubLObject var16) {
        return module0078.f5367(module0434.f30578((SubLObject)$ic24$, (SubLObject)ConsesLow.list($ic54$, (SubLObject)$ic24$, var25), var16, (SubLObject)$ic26$), (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51179(final SubLObject var25, final SubLObject var16) {
        SubLObject var26 = $g6388$.getGlobalValue();
        if (NIL == var26) {
            var26 = module0034.f1934((SubLObject)$ic53$, (SubLObject)$ic55$, (SubLObject)TWENTY_INTEGER, (SubLObject)EQUAL, (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        final SubLObject var27 = module0034.f1782(var25, var16);
        final SubLObject var28 = module0034.f1814(var26, var27, (SubLObject)UNPROVIDED);
        if (var28 != $ic12$) {
            SubLObject var29 = var28;
            SubLObject var30 = (SubLObject)NIL;
            var30 = var29.first();
            while (NIL != var29) {
                SubLObject var31 = var30.first();
                final SubLObject var32 = conses_high.second(var30);
                if (var25.equal(var31.first())) {
                    var31 = var31.rest();
                    if (NIL != var31 && NIL == var31.rest() && var16.equal(var31.first())) {
                        return module0034.f1959(var32);
                    }
                }
                var29 = var29.rest();
                var30 = var29.first();
            }
        }
        final SubLObject var33 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f51178(var25, var16)));
        module0034.f1836(var26, var27, var28, var33, (SubLObject)ConsesLow.list(var25, var16));
        return module0034.f1959(var33);
    }
    
    public static SubLObject f51171(final SubLObject var9) {
        return (SubLObject)makeBoolean(NIL == f51173(var9, $ic0$));
    }
    
    public static SubLObject f51180(final SubLObject var9) {
        return module0259.f16891(var9, $ic56$);
    }
    
    public static SubLObject f51181() {
        final SubLObject var8 = $g6389$.getGlobalValue();
        if (NIL != var8) {
            module0034.f1818(var8);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51182(final SubLObject var9, final SubLObject var16) {
        return module0034.f1829($g6389$.getGlobalValue(), (SubLObject)ConsesLow.list(var9, var16), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51183(final SubLObject var9, final SubLObject var16) {
        if (var9.eql($ic1$)) {
            return (SubLObject)$ic58$;
        }
        if (var9.eql($ic59$)) {
            return (SubLObject)$ic60$;
        }
        if (var9.eql($ic61$)) {
            return (SubLObject)$ic62$;
        }
        if (NIL != f51180(var9)) {
            return (SubLObject)$ic63$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51173(final SubLObject var9, final SubLObject var16) {
        SubLObject var17 = $g6389$.getGlobalValue();
        if (NIL == var17) {
            var17 = module0034.f1934((SubLObject)$ic57$, (SubLObject)$ic64$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        final SubLObject var18 = module0034.f1782(var9, var16);
        final SubLObject var19 = module0034.f1814(var17, var18, (SubLObject)UNPROVIDED);
        if (var19 != $ic12$) {
            SubLObject var20 = var19;
            SubLObject var21 = (SubLObject)NIL;
            var21 = var20.first();
            while (NIL != var20) {
                SubLObject var22 = var21.first();
                final SubLObject var23 = conses_high.second(var21);
                if (var9.eql(var22.first())) {
                    var22 = var22.rest();
                    if (NIL != var22 && NIL == var22.rest() && var16.eql(var22.first())) {
                        return module0034.f1959(var23);
                    }
                }
                var20 = var20.rest();
                var21 = var20.first();
            }
        }
        final SubLObject var24 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f51183(var9, var16)));
        module0034.f1836(var17, var18, var19, var24, (SubLObject)ConsesLow.list(var9, var16));
        return module0034.f1959(var24);
    }
    
    public static SubLObject f51184(final SubLObject var94) {
        return f51185(var94, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51186(final SubLObject var25, final SubLObject var15, SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        return module0269.f17716(var15);
    }
    
    public static SubLObject f51187(final SubLObject var25, final SubLObject var15, SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        return f51185(var15, var16);
    }
    
    public static SubLObject f51152() {
        final SubLObject var8 = $g6390$.getGlobalValue();
        if (NIL != var8) {
            module0034.f1818(var8);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51188(final SubLObject var15, SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        return module0034.f1829($g6390$.getGlobalValue(), (SubLObject)ConsesLow.list(var15, var16), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51189(final SubLObject var15, final SubLObject var16) {
        if (NIL != module0206.f13453(var15)) {
            final SubLObject var17 = module0205.f13132(var15);
            if (NIL != module0004.f104(var17, (SubLObject)$ic67$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51185(final SubLObject var15, SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        SubLObject var17 = $g6390$.getGlobalValue();
        if (NIL == var17) {
            var17 = module0034.f1934((SubLObject)$ic66$, (SubLObject)$ic68$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        final SubLObject var18 = module0034.f1782(var15, var16);
        final SubLObject var19 = module0034.f1814(var17, var18, (SubLObject)UNPROVIDED);
        if (var19 != $ic12$) {
            SubLObject var20 = var19;
            SubLObject var21 = (SubLObject)NIL;
            var21 = var20.first();
            while (NIL != var20) {
                SubLObject var22 = var21.first();
                final SubLObject var23 = conses_high.second(var21);
                if (var15.equal(var22.first())) {
                    var22 = var22.rest();
                    if (NIL != var22 && NIL == var22.rest() && var16.equal(var22.first())) {
                        return module0034.f1959(var23);
                    }
                }
                var20 = var20.rest();
                var21 = var20.first();
            }
        }
        final SubLObject var24 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f51189(var15, var16)));
        module0034.f1836(var17, var18, var19, var24, (SubLObject)ConsesLow.list(var15, var16));
        return module0034.f1959(var24);
    }
    
    public static SubLObject f51190(final SubLObject var15, SubLObject var90, SubLObject var16) {
        if (var90 == UNPROVIDED) {
            var90 = $g6381$.getDynamicValue();
        }
        if (var16 == UNPROVIDED) {
            var16 = $g6380$.getDynamicValue();
        }
        final SubLObject var91 = f51179(var90, var16);
        return module0077.f5320(module0172.f10922(var15), var91);
    }
    
    public static SubLObject f51191(final SubLObject var15, SubLObject var96) {
        if (var96 == UNPROVIDED) {
            var96 = f51158();
        }
        final SubLThread var97 = SubLProcess.currentSubLThread();
        SubLObject var98 = (SubLObject)NIL;
        final SubLObject var99 = $g6383$.getDynamicValue(var97);
        final SubLObject var100 = module0034.$g879$.currentBinding(var97);
        try {
            module0034.$g879$.bind(var99, var97);
            SubLObject var101 = (SubLObject)NIL;
            if (NIL != var99 && NIL == module0034.f1842(var99)) {
                var101 = module0034.f1869(var99);
                final SubLObject var102 = Threads.current_process();
                if (NIL == var101) {
                    module0034.f1873(var99, var102);
                }
                else if (!var101.eql(var102)) {
                    Errors.error((SubLObject)$ic69$);
                }
            }
            try {
                var98 = f51192(var15, var96);
            }
            finally {
                final SubLObject var42_101 = Threads.$is_thread_performing_cleanupP$.currentBinding(var97);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var97);
                    if (NIL != var99 && NIL == var101) {
                        module0034.f1873(var99, (SubLObject)NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var42_101, var97);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var100, var97);
        }
        return var98;
    }
    
    public static SubLObject f51193(final SubLObject var15, final SubLObject var96) {
        final SubLThread var97 = SubLProcess.currentSubLThread();
        SubLObject var98 = (SubLObject)NIL;
        SubLObject var100;
        final SubLObject var99 = var100 = f51194(var96, (SubLObject)UNPROVIDED);
        SubLObject var101 = (SubLObject)NIL;
        SubLObject var102 = (SubLObject)NIL;
        SubLObject var103 = (SubLObject)NIL;
        SubLObject var104 = (SubLObject)NIL;
        SubLObject var105 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var100, var99, (SubLObject)$ic71$);
        var101 = var100.first();
        var100 = var100.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var100, var99, (SubLObject)$ic71$);
        var102 = var100.first();
        var100 = var100.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var100, var99, (SubLObject)$ic71$);
        var103 = var100.first();
        var100 = var100.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var100, var99, (SubLObject)$ic71$);
        var104 = var100.first();
        var100 = var100.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var100, var99, (SubLObject)$ic71$);
        var105 = var100.first();
        var100 = var100.rest();
        if (NIL != var100) {
            cdestructuring_bind.cdestructuring_bind_error(var99, (SubLObject)$ic71$);
            return (SubLObject)NIL;
        }
        if (NIL != f51171(var101)) {
            final SubLObject var106 = module0147.f9540(var105);
            final SubLObject var107 = module0147.$g2095$.currentBinding(var97);
            final SubLObject var108 = module0147.$g2094$.currentBinding(var97);
            final SubLObject var109 = module0147.$g2096$.currentBinding(var97);
            try {
                module0147.$g2095$.bind(module0147.f9545(var106), var97);
                module0147.$g2094$.bind(module0147.f9546(var106), var97);
                module0147.$g2096$.bind(module0147.f9549(var106), var97);
                if (NIL != f51168(var15, var101, var105)) {
                    var98 = (SubLObject)ConsesLow.list(var15);
                }
                if (NIL == var98 && NIL != var102 && NIL != module0269.f17710(var15)) {
                    final SubLObject var110 = module0256.f16574(var15, module0077.f5312(f51166(var101, var105)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL != var110) {
                        var98 = var110;
                    }
                }
                if (NIL == var98 && NIL != var103) {
                    final SubLObject var111 = f51163(var15, var105);
                    final SubLObject var112 = f51166(var101, var105);
                    final SubLObject var113 = module0078.f5351((SubLObject)ConsesLow.list(var112, var111), (SubLObject)UNPROVIDED);
                    if (NIL != module0077.f5319(var113)) {
                        if (NIL != var104) {
                            var98 = (SubLObject)ConsesLow.list(var15);
                        }
                        else {
                            var98 = module0256.f16637(module0077.f5312(var113), (SubLObject)NIL, var105, (SubLObject)UNPROVIDED);
                        }
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var109, var97);
                module0147.$g2094$.rebind(var108, var97);
                module0147.$g2095$.rebind(var107, var97);
            }
            return var98;
        }
        if (NIL != f51170(var15, var101, var105)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)ConsesLow.list(var15);
    }
    
    public static SubLObject f51192(final SubLObject var15, final SubLObject var96) {
        final SubLThread var97 = SubLProcess.currentSubLThread();
        final SubLObject var98 = module0034.$g879$.getDynamicValue(var97);
        SubLObject var99 = (SubLObject)NIL;
        if (NIL == var98) {
            return f51193(var15, var96);
        }
        var99 = module0034.f1857(var98, (SubLObject)$ic70$, (SubLObject)UNPROVIDED);
        if (NIL == var99) {
            var99 = module0034.f1807(module0034.f1842(var98), (SubLObject)$ic70$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var98, (SubLObject)$ic70$, var99);
        }
        final SubLObject var100 = module0034.f1782(var15, var96);
        final SubLObject var101 = module0034.f1814(var99, var100, (SubLObject)UNPROVIDED);
        if (var101 != $ic12$) {
            SubLObject var102 = var101;
            SubLObject var103 = (SubLObject)NIL;
            var103 = var102.first();
            while (NIL != var102) {
                SubLObject var104 = var103.first();
                final SubLObject var105 = conses_high.second(var103);
                if (var15.equal(var104.first())) {
                    var104 = var104.rest();
                    if (NIL != var104 && NIL == var104.rest() && var96.equal(var104.first())) {
                        return module0034.f1959(var105);
                    }
                }
                var102 = var102.rest();
                var103 = var102.first();
            }
        }
        final SubLObject var106 = Values.arg2(var97.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f51193(var15, var96)));
        module0034.f1836(var99, var100, var101, var106, (SubLObject)ConsesLow.list(var15, var96));
        return module0034.f1959(var106);
    }
    
    public static SubLObject f51151() {
        final SubLObject var8 = $g6391$.getGlobalValue();
        if (NIL != var8) {
            module0034.f1818(var8);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51195(final SubLObject var116, SubLObject var117) {
        if (var117 == UNPROVIDED) {
            var117 = $g6380$.getDynamicValue();
        }
        return module0034.f1829($g6391$.getGlobalValue(), (SubLObject)ConsesLow.list(var116, var117), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f51196(final SubLObject var116, final SubLObject var117) {
        final SubLObject var118 = (SubLObject)NIL;
        final SubLObject var119 = (SubLObject)NIL;
        final SubLObject var120 = (SubLObject)NIL;
        final SubLObject var121 = (SubLObject)NIL;
        final SubLObject var122 = (SubLObject)NIL;
        if (NIL == var116) {
            return (SubLObject)ConsesLow.list(var118, var119, var120, var121, var122);
        }
        if (NIL != constant_handles_oc.f8463($ic73$, (SubLObject)UNPROVIDED)) {
            return f51197(var116, var117);
        }
        return f51198(var116, var117);
    }
    
    public static SubLObject f51194(final SubLObject var116, SubLObject var117) {
        if (var117 == UNPROVIDED) {
            var117 = $g6380$.getDynamicValue();
        }
        SubLObject var118 = $g6391$.getGlobalValue();
        if (NIL == var118) {
            var118 = module0034.f1934((SubLObject)$ic72$, (SubLObject)$ic74$, (SubLObject)TEN_INTEGER, (SubLObject)EQUAL, (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        final SubLObject var119 = module0034.f1782(var116, var117);
        final SubLObject var120 = module0034.f1814(var118, var119, (SubLObject)UNPROVIDED);
        if (var120 != $ic12$) {
            SubLObject var121 = var120;
            SubLObject var122 = (SubLObject)NIL;
            var122 = var121.first();
            while (NIL != var121) {
                SubLObject var123 = var122.first();
                final SubLObject var124 = conses_high.second(var122);
                if (var116.equal(var123.first())) {
                    var123 = var123.rest();
                    if (NIL != var123 && NIL == var123.rest() && var117.equal(var123.first())) {
                        return module0034.f1959(var124);
                    }
                }
                var121 = var121.rest();
                var122 = var121.first();
            }
        }
        final SubLObject var125 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f51196(var116, var117)));
        module0034.f1836(var118, var119, var120, var125, (SubLObject)ConsesLow.list(var116, var117));
        return module0034.f1959(var125);
    }
    
    public static SubLObject f51197(final SubLObject var116, final SubLObject var117) {
        SubLObject var118 = (SubLObject)NIL;
        SubLObject var119 = (SubLObject)NIL;
        SubLObject var120 = (SubLObject)NIL;
        SubLObject var121 = (SubLObject)NIL;
        SubLObject var122 = (SubLObject)NIL;
        SubLObject var123 = (SubLObject)NIL;
        try {
            var123 = module0361.f24136((SubLObject)NIL);
            var118 = f51199(var116, var123);
            var122 = module0434.f30578((SubLObject)$ic75$, (SubLObject)ConsesLow.listS($ic76$, var116, (SubLObject)$ic77$), $ic0$, (SubLObject)ConsesLow.list((SubLObject)$ic78$, var123)).first();
            final SubLObject var124 = module0434.f30578((SubLObject)$ic79$, (SubLObject)ConsesLow.listS($ic80$, var116, (SubLObject)$ic81$), $ic0$, (SubLObject)ConsesLow.list((SubLObject)$ic78$, var123)).first();
            var119 = module0004.f104(var124, (SubLObject)$ic82$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var120 = module0004.f104(var124, (SubLObject)$ic83$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var125 = module0434.f30578((SubLObject)$ic84$, (SubLObject)ConsesLow.listS($ic85$, var116, (SubLObject)$ic86$), $ic0$, (SubLObject)ConsesLow.list((SubLObject)$ic78$, var123)).first();
            var121 = Equality.eql(var125, $ic87$);
        }
        finally {
            final SubLObject var126 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                module0361.f24005(var123);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var126);
            }
        }
        if (NIL == var122) {
            var122 = var117;
        }
        return (SubLObject)ConsesLow.list(var118, var119, var120, var121, var122);
    }
    
    public static SubLObject f51198(SubLObject var116, final SubLObject var117) {
        var116 = module0172.f10922(var116);
        SubLObject var118 = (SubLObject)NIL;
        SubLObject var119 = (SubLObject)NIL;
        SubLObject var120 = (SubLObject)NIL;
        SubLObject var121 = (SubLObject)NIL;
        SubLObject var122 = (SubLObject)NIL;
        if (NIL != module0205.f13373(var116, $ic7$)) {
            SubLObject var124;
            final SubLObject var123 = var124 = module0205.f13304(var116, (SubLObject)UNPROVIDED);
            SubLObject var125 = (SubLObject)NIL;
            SubLObject var126 = (SubLObject)NIL;
            SubLObject var127 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var124, var123, (SubLObject)$ic88$);
            var125 = var124.first();
            var124 = var124.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var124, var123, (SubLObject)$ic88$);
            var126 = var124.first();
            var124 = var124.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var124, var123, (SubLObject)$ic88$);
            var127 = var124.first();
            var124 = var124.rest();
            if (NIL == var124) {
                var118 = var125;
                var119 = module0004.f104(var127, (SubLObject)$ic82$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var120 = module0004.f104(var127, (SubLObject)$ic83$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var121 = Equality.eql(var126, $ic87$);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var123, (SubLObject)$ic88$);
            }
        }
        else {
            final SubLObject var128 = module0434.f30576((SubLObject)$ic89$, (SubLObject)ConsesLow.list($ic90$, (SubLObject)$ic91$, (SubLObject)$ic84$, (SubLObject)$ic79$, var116), $ic0$, (SubLObject)$ic92$).first();
            SubLObject var130;
            final SubLObject var129 = var130 = var128;
            SubLObject var131 = (SubLObject)NIL;
            SubLObject var132 = (SubLObject)NIL;
            SubLObject var133 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var130, var129, (SubLObject)$ic88$);
            var131 = var130.first();
            var130 = var130.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var130, var129, (SubLObject)$ic88$);
            var132 = var130.first();
            var130 = var130.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var130, var129, (SubLObject)$ic88$);
            var133 = var130.first();
            var130 = var130.rest();
            if (NIL == var130) {
                var118 = var131;
                var119 = module0004.f104(var133, (SubLObject)$ic82$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var120 = module0004.f104(var133, (SubLObject)$ic83$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var121 = Equality.eql(var132, $ic87$);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var129, (SubLObject)$ic88$);
            }
        }
        if (NIL != module0173.f10955(var116)) {
            var122 = module0434.f30578((SubLObject)$ic75$, (SubLObject)ConsesLow.listS($ic76$, var116, (SubLObject)$ic77$), $ic0$, (SubLObject)UNPROVIDED).first();
        }
        if (NIL == var122) {
            var122 = var117;
        }
        return (SubLObject)ConsesLow.list(var118, var119, var120, var121, var122);
    }
    
    public static SubLObject f51199(final SubLObject var116, SubLObject var118) {
        if (var118 == UNPROVIDED) {
            var118 = (SubLObject)NIL;
        }
        final SubLThread var119 = SubLProcess.currentSubLThread();
        if (NIL != constant_handles_oc.f8463($ic73$, (SubLObject)UNPROVIDED)) {
            return module0434.f30578((SubLObject)$ic91$, (SubLObject)ConsesLow.listS($ic73$, var116, (SubLObject)$ic93$), $ic0$, (SubLObject)ConsesLow.list((SubLObject)$ic78$, var118)).first();
        }
        return f51198(var116, $g6380$.getDynamicValue(var119)).first();
    }
    
    public static SubLObject f51200(final SubLObject var127, SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = $g6380$.getDynamicValue();
        }
        assert NIL != module0206.f13450(var127) : var127;
        assert NIL != module0161.f10481(var16) : var16;
        if (NIL != constant_handles_oc.f8463($ic97$, (SubLObject)UNPROVIDED)) {
            return (SubLObject)ConsesLow.listS($ic97$, var127, (SubLObject)$ic98$);
        }
        return (SubLObject)ConsesLow.listS($ic7$, var127, (SubLObject)$ic13$);
    }
    
    public static SubLObject f51201(final SubLObject var29, SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = $g6380$.getDynamicValue();
        }
        assert NIL != module0269.f17713(var29, (SubLObject)UNPROVIDED) : var29;
        assert NIL != module0161.f10481(var16) : var16;
        if (NIL != constant_handles_oc.f8463($ic97$, (SubLObject)UNPROVIDED)) {
            return (SubLObject)ConsesLow.list($ic97$, (SubLObject)ConsesLow.list($ic46$, (SubLObject)$ic101$, (SubLObject)ConsesLow.list($ic8$, (SubLObject)$ic101$, var29)), $ic102$, $ic103$, var16);
        }
        return (SubLObject)ConsesLow.listS($ic104$, (SubLObject)ConsesLow.list($ic46$, (SubLObject)$ic101$, (SubLObject)ConsesLow.list($ic8$, (SubLObject)$ic101$, var29)), (SubLObject)$ic13$);
    }
    
    public static SubLObject f51202(final SubLObject var29, SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = $g6380$.getDynamicValue();
        }
        assert NIL != module0269.f17713(var29, (SubLObject)UNPROVIDED) : var29;
        assert NIL != module0161.f10481(var16) : var16;
        if (NIL != constant_handles_oc.f8463($ic97$, (SubLObject)UNPROVIDED)) {
            return (SubLObject)ConsesLow.listS($ic97$, (SubLObject)ConsesLow.list($ic46$, (SubLObject)$ic101$, (SubLObject)ConsesLow.list($ic41$, (SubLObject)$ic101$, var29)), (SubLObject)$ic98$);
        }
        return (SubLObject)ConsesLow.listS($ic7$, (SubLObject)ConsesLow.list($ic46$, (SubLObject)$ic101$, (SubLObject)ConsesLow.list($ic41$, (SubLObject)$ic101$, var29)), (SubLObject)$ic13$);
    }
    
    public static SubLObject f51203() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51146", "S#55725", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0802", "f51153", "S#55726");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0802", "f51154", "S#55727");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51147", "S#55728", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51155", "S#55729", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51156", "S#55730", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51157", "S#55731", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51158", "S#55732", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51159", "NODES-FOR-CONCEPT-FILTER-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51160", "NODES-FOR-CONCEPT-FILTER-AFTER-REMOVING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51148", "S#55723", 0, 0, false);
        new $f51148$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51161", "S#55733", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51162", "S#55734", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51163", "S#55735", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51149", "S#55736", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51164", "S#55737", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51165", "S#55738", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51166", "S#55739", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51167", "S#55740", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51168", "S#55741", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51169", "S#55742", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51170", "S#55743", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51174", "S#55724", 0, 0, false);
        new $f51174$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51175", "S#55744", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51176", "S#55745", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51172", "S#55746", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51150", "S#55747", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51177", "S#55748", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51178", "S#55749", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51179", "S#55750", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51171", "S#55751", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51180", "S#55752", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51181", "S#55753", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51182", "S#55754", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51183", "S#55755", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51173", "S#55756", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51184", "CONCEPT-TAGGING-IRRELEVANT-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51186", "S#55757", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51187", "S#55758", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51152", "S#55759", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51188", "S#55760", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51189", "S#55761", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51185", "S#55762", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51190", "S#55763", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51191", "S#55764", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51193", "S#55765", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51192", "S#55766", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51151", "S#55767", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51195", "S#55768", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51196", "S#55769", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51194", "S#55770", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51197", "S#55771", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51198", "S#55772", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51199", "S#55773", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51200", "NEW-ADHOC-CONCEPT-FILTER-SPEC", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51201", "NEW-ADHOC-ISA-CONCEPT-FILTER-SPEC", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0802", "f51202", "NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51204() {
        $g6380$ = SubLFiles.defparameter("S#55774", $ic0$);
        $g6381$ = SubLFiles.defparameter("S#55775", $ic1$);
        $g6382$ = SubLFiles.defparameter("S#55776", (SubLObject)NIL);
        $g6383$ = SubLFiles.defparameter("S#55777", (SubLObject)NIL);
        $g6384$ = SubLFiles.deflexical("S#55778", (SubLObject)NIL);
        $g6385$ = SubLFiles.deflexical("S#55779", (SubLObject)NIL);
        $g6386$ = SubLFiles.deflexical("S#55780", (SubLObject)NIL);
        $g6387$ = SubLFiles.deflexical("S#55781", (SubLObject)NIL);
        $g6388$ = SubLFiles.deflexical("S#55782", (SubLObject)NIL);
        $g6389$ = SubLFiles.deflexical("S#55783", (SubLObject)NIL);
        $g6390$ = SubLFiles.deflexical("S#55784", (SubLObject)NIL);
        $g6391$ = SubLFiles.deflexical("S#55785", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f51205() {
        module0034.f1909((SubLObject)$ic6$);
        module0012.f416((SubLObject)$ic14$);
        module0012.f416((SubLObject)$ic15$);
        module0034.f1909((SubLObject)$ic16$);
        module0034.f1909((SubLObject)$ic23$);
        module0034.f1909((SubLObject)$ic47$);
        module0034.f1909((SubLObject)$ic53$);
        module0034.f1909((SubLObject)$ic57$);
        module0012.f416((SubLObject)$ic65$);
        module0034.f1909((SubLObject)$ic66$);
        module0034.f1895((SubLObject)$ic70$);
        module0034.f1909((SubLObject)$ic72$);
        module0002.f38((SubLObject)$ic94$);
        module0002.f38((SubLObject)$ic99$);
        module0002.f38((SubLObject)$ic105$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f51203();
    }
    
    public void initializeVariables() {
        f51204();
    }
    
    public void runTopLevelForms() {
        f51205();
    }
    
    static {
        me = (SubLFile)new module0802();
        $g6380$ = null;
        $g6381$ = null;
        $g6382$ = null;
        $g6383$ = null;
        $g6384$ = null;
        $g6385$ = null;
        $g6386$ = null;
        $g6387$ = null;
        $g6388$ = null;
        $g6389$ = null;
        $g6390$ = null;
        $g6391$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic1$ = constant_handles_oc.f8479((SubLObject)makeString("TaxonomyOfEasilyUnderstandableConcepts"));
        $ic2$ = makeSymbol("CLET");
        $ic3$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#55777", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#3136", "CYC"))));
        $ic4$ = makeSymbol("S#3165", "CYC");
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#55777", "CYC"));
        $ic6$ = makeSymbol("S#55731", "CYC");
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("ConceptFilterSpecificationFn"));
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic9$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ConceptFilterSpecification")));
        $ic10$ = makeSymbol("S#55778", "CYC");
        $ic11$ = makeInteger(50);
        $ic12$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic13$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ConceptOnlyFilterParameter")), constant_handles_oc.f8479((SubLObject)makeString("TriggerFromConcept")));
        $ic14$ = makeSymbol("NODES-FOR-CONCEPT-FILTER-AFTER-ADDING");
        $ic15$ = makeSymbol("NODES-FOR-CONCEPT-FILTER-AFTER-REMOVING");
        $ic16$ = makeSymbol("S#55735", "CYC");
        $ic17$ = makeSymbol("NART-SUBSTITUTE");
        $ic18$ = makeSymbol("?VAR0");
        $ic19$ = ConsesLow.list((SubLObject)makeSymbol("?VAR0"));
        $ic20$ = makeSymbol("S#55779", "CYC");
        $ic21$ = makeInteger(500);
        $ic22$ = makeSymbol("S#55723", "CYC");
        $ic23$ = makeSymbol("S#55739", "CYC");
        $ic24$ = makeSymbol("?X");
        $ic25$ = constant_handles_oc.f8479((SubLObject)makeString("nodeInSystem"));
        $ic26$ = ConsesLow.list((SubLObject)makeKeyword("ANSWER-LANGUAGE"), (SubLObject)makeKeyword("HL"));
        $ic27$ = makeString("collectionAndSpecsInConceptFilter");
        $ic28$ = makeKeyword("GAF");
        $ic29$ = makeKeyword("TRUE");
        $ic30$ = makeKeyword("BREADTH");
        $ic31$ = makeKeyword("QUEUE");
        $ic32$ = makeKeyword("STACK");
        $ic33$ = makeSymbol("S#11450", "CYC");
        $ic34$ = makeKeyword("ERROR");
        $ic35$ = makeString("~A is not a ~A");
        $ic36$ = makeSymbol("S#11592", "CYC");
        $ic37$ = makeKeyword("CERROR");
        $ic38$ = makeString("continue anyway");
        $ic39$ = makeKeyword("WARN");
        $ic40$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic41$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic42$ = makeString("~A is neither SET-P nor LISTP.");
        $ic43$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic44$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic45$ = makeSymbol("S#55780", "CYC");
        $ic46$ = constant_handles_oc.f8479((SubLObject)makeString("TheSetOf"));
        $ic47$ = makeSymbol("S#55746", "CYC");
        $ic48$ = makeSymbol("?NODE");
        $ic49$ = constant_handles_oc.f8479((SubLObject)makeString("suppressIndividualNode"));
        $ic50$ = ConsesLow.list((SubLObject)makeSymbol("?NODE"));
        $ic51$ = makeSymbol("S#55781", "CYC");
        $ic52$ = makeSymbol("S#55724", "CYC");
        $ic53$ = makeSymbol("S#55750", "CYC");
        $ic54$ = constant_handles_oc.f8479((SubLObject)makeString("classifyingNodeInFilter"));
        $ic55$ = makeSymbol("S#55782", "CYC");
        $ic56$ = constant_handles_oc.f8479((SubLObject)makeString("DecisionTreeConceptFilter"));
        $ic57$ = makeSymbol("S#55756", "CYC");
        $ic58$ = makeSymbol("S#55758", "CYC");
        $ic59$ = constant_handles_oc.f8479((SubLObject)makeString("PredicateTaxonomy"));
        $ic60$ = makeSymbol("S#55757", "CYC");
        $ic61$ = constant_handles_oc.f8479((SubLObject)makeString("TheCycOntology"));
        $ic62$ = makeSymbol("IGNORE");
        $ic63$ = makeSymbol("S#55786", "CYC");
        $ic64$ = makeSymbol("S#55783", "CYC");
        $ic65$ = makeSymbol("CONCEPT-TAGGING-IRRELEVANT-TERM?");
        $ic66$ = makeSymbol("S#55762", "CYC");
        $ic67$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("InstanceNamedFn")), constant_handles_oc.f8479((SubLObject)makeString("InstanceNamedFn-Ternary")), constant_handles_oc.f8479((SubLObject)makeString("ThingDescribableAsFn")), constant_handles_oc.f8479((SubLObject)makeString("Kappa")));
        $ic68$ = makeSymbol("S#55784", "CYC");
        $ic69$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic70$ = makeSymbol("S#55766", "CYC");
        $ic71$ = ConsesLow.list((SubLObject)makeSymbol("S#55787", "CYC"), (SubLObject)makeSymbol("S#55788", "CYC"), (SubLObject)makeSymbol("S#55789", "CYC"), (SubLObject)makeSymbol("S#55790", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic72$ = makeSymbol("S#55770", "CYC");
        $ic73$ = constant_handles_oc.f8479((SubLObject)makeString("conceptFilterSpecificationFilter"));
        $ic74$ = makeSymbol("S#55785", "CYC");
        $ic75$ = makeSymbol("?MT");
        $ic76$ = constant_handles_oc.f8479((SubLObject)makeString("conceptFilterSpecificationDefiningMt"));
        $ic77$ = ConsesLow.list((SubLObject)makeSymbol("?MT"));
        $ic78$ = makeKeyword("PROBLEM-STORE");
        $ic79$ = makeSymbol("?TRIGGER");
        $ic80$ = constant_handles_oc.f8479((SubLObject)makeString("conceptFilterSpecificationTrigger"));
        $ic81$ = ConsesLow.list((SubLObject)makeSymbol("?TRIGGER"));
        $ic82$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TriggerFromConceptOrSpec")), constant_handles_oc.f8479((SubLObject)makeString("TriggerFromConceptSpecOrInstance")));
        $ic83$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TriggerFromConceptOrInstance")), constant_handles_oc.f8479((SubLObject)makeString("TriggerFromConceptSpecOrInstance")));
        $ic84$ = makeSymbol("?MODE");
        $ic85$ = constant_handles_oc.f8479((SubLObject)makeString("conceptFilterSpecificationMode"));
        $ic86$ = ConsesLow.list((SubLObject)makeSymbol("?MODE"));
        $ic87$ = constant_handles_oc.f8479((SubLObject)makeString("ConceptAndInstancesFilterParameter"));
        $ic88$ = ConsesLow.list((SubLObject)makeSymbol("S#55791", "CYC"), (SubLObject)makeSymbol("S#4785", "CYC"), (SubLObject)makeSymbol("S#55792", "CYC"));
        $ic89$ = ConsesLow.list((SubLObject)makeSymbol("?FILTER"), (SubLObject)makeSymbol("?MODE"), (SubLObject)makeSymbol("?TRIGGER"));
        $ic90$ = constant_handles_oc.f8479((SubLObject)makeString("specificationForConceptFilter"));
        $ic91$ = makeSymbol("?FILTER");
        $ic92$ = ConsesLow.list((SubLObject)makeKeyword("INFERENCE-MODE"), (SubLObject)makeKeyword("SHALLOW"));
        $ic93$ = ConsesLow.list((SubLObject)makeSymbol("?FILTER"));
        $ic94$ = makeSymbol("NEW-ADHOC-CONCEPT-FILTER-SPEC");
        $ic95$ = makeSymbol("CYCL-TERM-P");
        $ic96$ = makeSymbol("S#12263", "CYC");
        $ic97$ = constant_handles_oc.f8479((SubLObject)makeString("ConceptFilterSpecificationWithMtFn"));
        $ic98$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ConceptOnlyFilterParameter")), constant_handles_oc.f8479((SubLObject)makeString("TriggerFromConcept")), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic99$ = makeSymbol("NEW-ADHOC-ISA-CONCEPT-FILTER-SPEC");
        $ic100$ = makeSymbol("S#17581", "CYC");
        $ic101$ = makeSymbol("?TERM");
        $ic102$ = constant_handles_oc.f8479((SubLObject)makeString("ConceptOnlyFilterParameter"));
        $ic103$ = constant_handles_oc.f8479((SubLObject)makeString("TriggerFromConcept"));
        $ic104$ = constant_handles_oc.f8479((SubLObject)makeString("ConceptFilterSpecificatioFn"));
        $ic105$ = makeSymbol("NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC");
    }
    
    public static final class $f51148$ZeroArityFunction extends ZeroArityFunction
    {
        public $f51148$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#55723"));
        }
        
        public SubLObject processItem() {
            return f51148();
        }
    }
    
    public static final class $f51174$ZeroArityFunction extends ZeroArityFunction
    {
        public $f51174$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#55724"));
        }
        
        public SubLObject processItem() {
            return f51174();
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 807 ms
	
	Decompiled with Procyon 0.5.32.
*/