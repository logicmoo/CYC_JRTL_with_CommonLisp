package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0695 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0695";
    public static final String myFingerPrint = "68687ea79b46fd0a8c9aea0882df12ece0a05fb9b8f851ca8f198e05dfbe7bed";
    private static SubLSymbol $g5473$;
    private static SubLSymbol $g5474$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
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
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLList $ic62$;
    private static final SubLList $ic63$;
    private static final SubLList $ic64$;
    private static final SubLString $ic65$;
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
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLString $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLString $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLString $ic92$;
    private static final SubLInteger $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    
    public static SubLObject f42460(final SubLObject var1, SubLObject var2) {
        if (var2 == module0695.UNPROVIDED) {
            var2 = (SubLObject)module0695.NIL;
        }
        if (var1.eql((SubLObject)module0695.$ic3$)) {
            if (var2.isString()) {
                return var2;
            }
            return (SubLObject)module0695.$ic4$;
        }
        else {
            if (var1.eql((SubLObject)module0695.$ic5$)) {
                return (SubLObject)module0695.$ic6$;
            }
            module0642.f39019((SubLObject)module0695.$ic7$);
            return (SubLObject)module0695.NIL;
        }
    }
    
    public static SubLObject f42461(final SubLObject var4) {
        final SubLObject var5 = var4.first();
        final SubLObject var6 = var4.rest();
        final SubLObject var7 = var5;
        if (var7.eql((SubLObject)module0695.$ic8$) || var7.eql((SubLObject)module0695.$ic9$)) {
            final SubLObject var8 = var6.first();
            SubLObject var9 = conses_high.second(var6);
            if (module0695.NIL == module0035.f2428((SubLObject)module0695.$ic10$, var8, (SubLObject)module0695.UNPROVIDED, (SubLObject)module0695.UNPROVIDED) && module0695.NIL == module0035.f2428((SubLObject)module0695.$ic10$, var9, (SubLObject)module0695.UNPROVIDED, (SubLObject)module0695.UNPROVIDED)) {
                if (module0695.NIL == module0173.f10955(var9) && var9.isCons()) {
                    var9 = module0172.f10921(var9);
                }
                if (module0695.NIL != module0173.f10955(var9)) {
                    final SubLObject var10 = module0538.f33373(var8, var9);
                    SubLObject var11 = (SubLObject)module0695.NIL;
                    SubLObject var12 = (SubLObject)module0695.NIL;
                    if (module0695.NIL == var12) {
                        SubLObject var13 = var10;
                        SubLObject var14 = (SubLObject)module0695.NIL;
                        var14 = var13.first();
                        while (module0695.NIL == var12 && module0695.NIL != var13) {
                            if (module0695.NIL != assertion_handles_oc.f11035(var14) && module0695.NIL != module0178.f11375(var14)) {
                                var11 = var14;
                                var12 = (SubLObject)module0695.T;
                            }
                            var13 = var13.rest();
                            var14 = var13.first();
                        }
                    }
                    return var11;
                }
            }
            return (SubLObject)module0695.NIL;
        }
        return (SubLObject)module0695.NIL;
    }
    
    public static SubLObject f42462(final SubLObject var2, SubLObject var14) {
        if (var14 == module0695.UNPROVIDED) {
            var14 = (SubLObject)module0695.NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        SubLObject var16 = PrintLow.format((SubLObject)module0695.NIL, (SubLObject)module0695.$ic11$, var2);
        if (var14.isString()) {
            var16 = Sequences.cconcatenate(var16, new SubLObject[] { module0695.$ic12$, var14 });
        }
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
        module0642.f39020(var16);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
        final SubLObject var17 = module0015.$g533$.currentBinding(var15);
        try {
            module0015.$g533$.bind((SubLObject)module0695.T, var15);
            module0642.f39020(module0015.$g219$.getGlobalValue());
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
            module0642.f39020((SubLObject)module0695.$ic13$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
            final SubLObject var17_18 = module0015.$g533$.currentBinding(var15);
            try {
                module0015.$g533$.bind((SubLObject)module0695.T, var15);
                module0642.f39019((SubLObject)module0695.$ic14$);
            }
            finally {
                module0015.$g533$.rebind(var17_18, var15);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var17, var15);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        module0642.f39026((SubLObject)module0695.UNPROVIDED);
        return (SubLObject)module0695.NIL;
    }
    
    public static SubLObject f42463(final SubLObject var14) {
        final SubLObject var15 = module0577.f35456(var14);
        final SubLObject var16 = module0577.f35457(var15);
        final SubLObject var17 = module0665.f40419((SubLObject)module0695.$ic15$, module0577.f35443(var15));
        final SubLObject var18 = module0665.f40419((SubLObject)module0695.$ic16$, module0577.f35443(var15));
        final SubLObject var19 = module0665.f40419((SubLObject)module0695.$ic17$, module0577.f35443(var15));
        module0642.f39019((SubLObject)module0695.$ic18$);
        module0642.f39019(Sequences.length(var19));
        module0642.f39019((SubLObject)module0695.$ic19$);
        module0642.f39019(f42460(var17, var18));
        return (SubLObject)module0695.NIL;
    }
    
    public static SubLObject f42464(final SubLObject var22) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var22.isList() && module0695.NIL != module0035.f1995(var22, (SubLObject)module0695.TWO_INTEGER, (SubLObject)module0695.UNPROVIDED) && var22.first() == module0695.$ic10$);
    }
    
    public static SubLObject f42465(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0695.NIL != module0015.$g495$.getGlobalValue()) {
            module0642.f39020(module0015.$g222$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
            module0642.f39020(module0642.f39042(module0015.$g495$.getGlobalValue()));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
        final SubLObject var24 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)module0695.T, var23);
            module0642.f39019(conses_high.second(var22));
        }
        finally {
            module0015.$g533$.rebind(var24, var23);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        return (SubLObject)module0695.NIL;
    }
    
    public static SubLObject f42466(final SubLObject var4, SubLObject var23, SubLObject var24) {
        if (var23 == module0695.UNPROVIDED) {
            var23 = (SubLObject)module0695.NIL;
        }
        if (var24 == module0695.UNPROVIDED) {
            var24 = (SubLObject)module0695.NIL;
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        final SubLObject var26 = var4.first();
        SubLObject var27 = (SubLObject)module0695.NIL;
        SubLObject var28 = (SubLObject)module0695.T;
        if ((var24 == module0695.$ic23$ || var24 == module0695.$ic24$) && module0695.NIL != module0004.f104(var26, (SubLObject)module0695.$ic25$, (SubLObject)module0695.UNPROVIDED, (SubLObject)module0695.UNPROVIDED)) {
            var27 = f42461(var4);
            if (var24 == module0695.$ic24$) {
                final SubLObject var29 = var26;
                if (var29.eql((SubLObject)module0695.$ic8$)) {
                    if (module0695.NIL != var27) {
                        var28 = (SubLObject)module0695.NIL;
                    }
                }
                else if (var29.eql((SubLObject)module0695.$ic9$) && module0695.NIL == var27) {
                    var28 = (SubLObject)module0695.NIL;
                }
            }
        }
        if (module0695.NIL != var28) {
            module0642.f39020(module0015.$g364$.getGlobalValue());
            if (module0695.NIL != var23) {
                module0642.f39020(module0015.$g366$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                module0642.f39020(var23);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
            final SubLObject var30 = module0015.$g533$.currentBinding(var25);
            try {
                module0015.$g533$.bind((SubLObject)module0695.T, var25);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0695.$ic26$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                final SubLObject var17_26 = module0015.$g533$.currentBinding(var25);
                final SubLObject var31 = module0656.$g5164$.currentBinding(var25);
                try {
                    module0015.$g533$.bind((SubLObject)module0695.T, var25);
                    module0656.$g5164$.bind(module0656.f39897(module0695.$g5474$.getDynamicValue(var25)), var25);
                    module0656.f39804(var4, (SubLObject)module0695.ZERO_INTEGER, (SubLObject)module0695.T);
                }
                finally {
                    module0656.$g5164$.rebind(var31, var25);
                    module0015.$g533$.rebind(var17_26, var25);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0695.$ic26$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                final SubLObject var17_27 = module0015.$g533$.currentBinding(var25);
                try {
                    module0015.$g533$.bind((SubLObject)module0695.T, var25);
                    if (var24 == module0695.$ic23$ || var24 == module0695.$ic24$) {
                        final SubLObject var32 = var26;
                        if (var32.eql((SubLObject)module0695.$ic8$)) {
                            if (module0695.NIL != var27) {
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                if (module0695.NIL != module0015.$g495$.getGlobalValue()) {
                                    module0642.f39020(module0015.$g222$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                    module0642.f39020(module0642.f39042(module0015.$g495$.getGlobalValue()));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                                final SubLObject var17_28 = module0015.$g533$.currentBinding(var25);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0695.T, var25);
                                    module0642.f39019((SubLObject)module0695.$ic27$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var17_28, var25);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                                module0656.f39853(var27, (SubLObject)module0695.$ic28$);
                            }
                        }
                        else if (var32.eql((SubLObject)module0695.$ic9$)) {
                            if (module0695.NIL != var27) {
                                module0656.f39853(var27, (SubLObject)module0695.$ic28$);
                            }
                            else {
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                if (module0695.NIL != module0015.$g495$.getGlobalValue()) {
                                    module0642.f39020(module0015.$g222$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                    module0642.f39020(module0642.f39042(module0015.$g495$.getGlobalValue()));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                                final SubLObject var17_29 = module0015.$g533$.currentBinding(var25);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0695.T, var25);
                                    module0642.f39019((SubLObject)module0695.$ic29$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var17_29, var25);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                            }
                        }
                    }
                    module0642.f39067();
                }
                finally {
                    module0015.$g533$.rebind(var17_27, var25);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var30, var25);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0695.UNPROVIDED);
        }
        return var28;
    }
    
    public static SubLObject f42467(final SubLObject var31) {
        final SubLObject var32 = module0665.f40432(var31);
        return f42468(var32);
    }
    
    public static SubLObject f42468(final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var34 = module0665.f40419((SubLObject)module0695.$ic31$, var32);
        if (module0695.NIL == var34) {
            var34 = module0665.f40419((SubLObject)module0695.$ic32$, var32);
            module0665.f40421((SubLObject)module0695.$ic31$, var32, var34);
        }
        final SubLObject var35 = module0577.f35456(var34);
        if (module0695.NIL == module0577.f35438(var35)) {
            module0667.f40568((SubLObject)module0695.$ic33$, PrintLow.format((SubLObject)module0695.NIL, (SubLObject)module0695.$ic34$));
        }
        else {
            final SubLObject var36 = module0577.f35441(var35);
            final SubLObject var37 = module0577.f35457(var35);
            final SubLObject var32_34 = module0577.f35443(var35);
            final SubLObject var38 = module0665.f40419((SubLObject)module0695.$ic15$, var32_34);
            final SubLObject var39 = module0665.f40419((SubLObject)module0695.$ic16$, var32_34);
            final SubLObject var40 = module0665.f40419((SubLObject)module0695.$ic35$, var32_34);
            SubLObject var41 = module0665.f40419((SubLObject)module0695.$ic17$, var32_34);
            Hashtables.remhash((SubLObject)module0695.$ic36$, var32_34);
            final SubLObject var42 = (SubLObject)module0695.$ic37$;
            final SubLObject var43 = module0015.$g538$.currentBinding(var33);
            try {
                module0015.$g538$.bind((module0695.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var33))) ? module0015.$g538$.getDynamicValue(var33) : module0057.f4173((SubLObject)module0695.UNPROVIDED, (SubLObject)module0695.UNPROVIDED, (SubLObject)module0695.UNPROVIDED), var33);
                module0642.f39020((SubLObject)module0695.$ic38$);
                module0642.f39029((SubLObject)module0695.UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var33), module0655.$g5142$.getDynamicValue(var33));
                final SubLObject var44 = module0014.f672((SubLObject)module0695.$ic39$);
                module0642.f39029((SubLObject)module0695.UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                module0642.f39020((SubLObject)module0695.$ic40$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                if (module0695.NIL != var44) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                    module0642.f39020(var44);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                module0642.f39020((SubLObject)module0695.$ic41$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                module0016.f941();
                if (module0695.NIL != var42) {
                    module0642.f39029((SubLObject)module0695.UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var42);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)module0695.UNPROVIDED);
                final SubLObject var17_37 = module0015.$g535$.currentBinding(var33);
                try {
                    module0015.$g535$.bind((SubLObject)module0695.T, var33);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (module0695.NIL != module0015.$g132$.getDynamicValue(var33)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var33)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                    module0642.f39020((SubLObject)module0695.$ic44$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                    final SubLObject var17_38 = module0015.$g533$.currentBinding(var33);
                    try {
                        module0015.$g533$.bind((SubLObject)module0695.T, var33);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                        module0642.f39020((SubLObject)module0695.$ic45$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                        final SubLObject var17_39 = module0015.$g533$.currentBinding(var33);
                        try {
                            module0015.$g533$.bind((SubLObject)module0695.T, var33);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39020((SubLObject)module0695.$ic46$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39020((SubLObject)module0695.$ic47$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39019((SubLObject)module0695.$ic48$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var17_39, var33);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (module0695.NIL != var42) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)module0695.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39019(var42);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)module0695.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                        }
                        module0642.f39019((SubLObject)module0695.$ic49$);
                        module0642.f39019(f42460(var38, var39));
                        if (module0695.NIL == var41) {
                            module0642.f39019((SubLObject)module0695.$ic50$);
                        }
                        else {
                            module0642.f39019((SubLObject)module0695.$ic51$);
                        }
                        module0642.f39026((SubLObject)module0695.TWO_INTEGER);
                        if (var38 == module0695.$ic3$ && var39.isString()) {
                            f42462(var39, var34);
                        }
                        if (module0695.NIL != var41) {
                            final SubLObject var45 = var40;
                            if (!var45.eql((SubLObject)module0695.$ic24$)) {
                                if (var45.eql((SubLObject)module0695.$ic23$)) {
                                    final SubLObject var46 = PrintLow.format((SubLObject)module0695.NIL, (SubLObject)module0695.$ic52$, var34);
                                    module0642.f39020(module0015.$g381$.getGlobalValue());
                                    module0642.f39020(module0015.$g383$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                    module0642.f39020(var46);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                                    final SubLObject var17_40 = module0015.$g533$.currentBinding(var33);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0695.T, var33);
                                        module0642.f39020(module0015.$g219$.getGlobalValue());
                                        module0642.f39020(module0015.$g221$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                        module0642.f39020((SubLObject)module0695.$ic13$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                                        final SubLObject var17_41 = module0015.$g533$.currentBinding(var33);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0695.T, var33);
                                            module0642.f39019((SubLObject)module0695.$ic53$);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var17_41, var33);
                                        }
                                        module0642.f39020(module0015.$g220$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var17_40, var33);
                                    }
                                    module0642.f39020(module0015.$g382$.getGlobalValue());
                                    module0642.f39026((SubLObject)module0695.UNPROVIDED);
                                }
                                else {
                                    final SubLObject var46 = PrintLow.format((SubLObject)module0695.NIL, (SubLObject)module0695.$ic54$, var34);
                                    module0642.f39020(module0015.$g381$.getGlobalValue());
                                    module0642.f39020(module0015.$g383$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                    module0642.f39020(var46);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                                    final SubLObject var17_42 = module0015.$g533$.currentBinding(var33);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0695.T, var33);
                                        module0642.f39020(module0015.$g219$.getGlobalValue());
                                        module0642.f39020(module0015.$g221$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                        module0642.f39020((SubLObject)module0695.$ic13$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                                        final SubLObject var17_43 = module0015.$g533$.currentBinding(var33);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0695.T, var33);
                                            module0642.f39019((SubLObject)module0695.$ic55$);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var17_43, var33);
                                        }
                                        module0642.f39020(module0015.$g220$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var17_42, var33);
                                    }
                                    module0642.f39020(module0015.$g382$.getGlobalValue());
                                    module0642.f39026((SubLObject)module0695.UNPROVIDED);
                                }
                            }
                            module0642.f39026((SubLObject)module0695.UNPROVIDED);
                            final SubLObject var47 = PrintLow.format((SubLObject)module0695.NIL, (SubLObject)module0695.$ic56$, module0577.f35460(var35), var34);
                            module0642.f39020(module0015.$g381$.getGlobalValue());
                            module0642.f39020(module0015.$g383$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39020(var47);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                            final SubLObject var17_44 = module0015.$g533$.currentBinding(var33);
                            try {
                                module0015.$g533$.bind((SubLObject)module0695.T, var33);
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                module0642.f39020(module0015.$g221$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                module0642.f39020((SubLObject)module0695.$ic13$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                                final SubLObject var17_45 = module0015.$g533$.currentBinding(var33);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0695.T, var33);
                                    module0642.f39019((SubLObject)module0695.$ic57$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var17_45, var33);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var17_44, var33);
                            }
                            module0642.f39020(module0015.$g382$.getGlobalValue());
                            module0642.f39026((SubLObject)module0695.TWO_INTEGER);
                            var33.resetMultipleValues();
                            final SubLObject var48 = module0554.f34210(var41);
                            final SubLObject var49 = var33.secondMultipleValue();
                            final SubLObject var50 = var33.thirdMultipleValue();
                            final SubLObject var51 = var33.fourthMultipleValue();
                            final SubLObject var52 = var33.fifthMultipleValue();
                            var33.resetMultipleValues();
                            SubLObject var53 = (SubLObject)module0695.NIL;
                            SubLObject var54 = (SubLObject)module0695.NIL;
                            if (module0695.NIL != var52) {
                                var53 = (SubLObject)ConsesLow.cons((SubLObject)module0695.$ic58$, var53);
                            }
                            if (module0695.NIL != var51) {
                                var53 = (SubLObject)ConsesLow.cons((SubLObject)module0695.$ic59$, var53);
                            }
                            if (module0695.NIL != var50) {
                                var53 = (SubLObject)ConsesLow.cons((SubLObject)module0695.$ic60$, var53);
                            }
                            if (module0695.NIL != var49) {
                                var53 = (SubLObject)ConsesLow.cons((SubLObject)module0695.$ic61$, var53);
                            }
                            final SubLObject var55 = Sequences.length(var53);
                            if (var55.eql((SubLObject)module0695.TWO_INTEGER)) {
                                var54 = (SubLObject)module0695.$ic62$;
                            }
                            else if (var55.eql((SubLObject)module0695.THREE_INTEGER)) {
                                var54 = (SubLObject)module0695.$ic63$;
                            }
                            else if (var55.eql((SubLObject)module0695.FOUR_INTEGER)) {
                                var54 = (SubLObject)module0695.$ic64$;
                            }
                            if (module0695.NIL != var53) {
                                module0642.f39019((SubLObject)module0695.$ic65$);
                                SubLObject var56 = (SubLObject)module0695.NIL;
                                SubLObject var54_55 = (SubLObject)module0695.NIL;
                                SubLObject var57 = (SubLObject)module0695.NIL;
                                SubLObject var57_58 = (SubLObject)module0695.NIL;
                                var56 = var53;
                                var54_55 = var56.first();
                                var57 = var54;
                                var57_58 = var57.first();
                                while (module0695.NIL != var57 || module0695.NIL != var56) {
                                    if (module0695.NIL != var54_55) {
                                        module0642.f39019(var54_55);
                                    }
                                    if (module0695.NIL != var57_58) {
                                        module0642.f39019(var57_58);
                                    }
                                    var56 = var56.rest();
                                    var54_55 = var56.first();
                                    var57 = var57.rest();
                                    var57_58 = var57.first();
                                }
                                module0642.f39019((SubLObject)module0695.$ic66$);
                            }
                            module0642.f39026((SubLObject)module0695.UNPROVIDED);
                            module0642.f39020(module0015.$g346$.getGlobalValue());
                            module0642.f39020(module0015.$g352$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39020((SubLObject)module0695.ZERO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39020(module0015.$g353$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39020((SubLObject)module0695.THREE_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39020(module0015.$g354$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39020((SubLObject)module0695.ZERO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                            final SubLObject var17_46 = module0015.$g533$.currentBinding(var33);
                            try {
                                module0015.$g533$.bind((SubLObject)module0695.T, var33);
                                SubLObject var58 = var48;
                                SubLObject var59 = (SubLObject)module0695.NIL;
                                var59 = var58.first();
                                while (module0695.NIL != var58) {
                                    final SubLObject var60 = var59.first();
                                    final SubLObject var61 = conses_high.second(var59);
                                    final SubLObject var62 = conses_high.third(var59);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                                    final SubLObject var17_47 = module0015.$g533$.currentBinding(var33);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0695.T, var33);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                                        final SubLObject var17_48 = module0015.$g533$.currentBinding(var33);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0695.T, var33);
                                            final SubLObject var63 = var60;
                                            if (var63.eql((SubLObject)module0695.$ic67$)) {
                                                if (module0695.NIL != var50 || module0695.NIL != var51) {
                                                    module0642.f39019((SubLObject)module0695.$ic68$);
                                                }
                                            }
                                            else if (var63.eql((SubLObject)module0695.$ic69$)) {
                                                module0642.f39019((SubLObject)module0695.$ic70$);
                                            }
                                            else if (var63.eql((SubLObject)module0695.$ic71$)) {
                                                module0642.f39019((SubLObject)module0695.$ic72$);
                                            }
                                            else if (var63.eql((SubLObject)module0695.$ic73$)) {
                                                module0642.f39019((SubLObject)module0695.$ic74$);
                                            }
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var17_48, var33);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                                        final SubLObject var17_49 = module0015.$g533$.currentBinding(var33);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0695.T, var33);
                                            if (module0695.NIL != var61) {
                                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                                module0642.f39019(var61);
                                                module0642.f39020(module0015.$g210$.getGlobalValue());
                                            }
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var17_49, var33);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0695.$ic75$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                                        final SubLObject var17_50 = module0015.$g533$.currentBinding(var33);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0695.T, var33);
                                            final SubLObject var63 = var60;
                                            if (var63.eql((SubLObject)module0695.$ic71$)) {
                                                module0642.f39019((SubLObject)module0695.$ic76$);
                                            }
                                            else if (var63.eql((SubLObject)module0695.$ic73$)) {
                                                module0642.f39019((SubLObject)module0695.$ic77$);
                                            }
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var17_50, var33);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                                        final SubLObject var17_51 = module0015.$g533$.currentBinding(var33);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0695.T, var33);
                                            if (module0695.NIL != var62) {
                                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                                module0642.f39019(var62);
                                                module0642.f39020(module0015.$g210$.getGlobalValue());
                                            }
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var17_51, var33);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var17_47, var33);
                                    }
                                    module0642.f39020(module0015.$g365$.getGlobalValue());
                                    module0642.f39029((SubLObject)module0695.UNPROVIDED);
                                    var58 = var58.rest();
                                    var59 = var58.first();
                                }
                                module0642.f39026((SubLObject)module0695.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var17_46, var33);
                            }
                            module0642.f39020(module0015.$g347$.getGlobalValue());
                            module0642.f39020(module0015.$g219$.getGlobalValue());
                            module0642.f39020(module0015.$g221$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39020((SubLObject)module0695.$ic13$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                            final SubLObject var17_52 = module0015.$g533$.currentBinding(var33);
                            try {
                                module0015.$g533$.bind((SubLObject)module0695.T, var33);
                                module0642.f39019((SubLObject)module0695.$ic78$);
                            }
                            finally {
                                module0015.$g533$.rebind(var17_52, var33);
                            }
                            module0642.f39020(module0015.$g220$.getGlobalValue());
                            module0642.f39020(module0015.$g346$.getGlobalValue());
                            module0642.f39020(module0015.$g352$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39020((SubLObject)module0695.ZERO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39020(module0015.$g353$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39020((SubLObject)module0695.ZERO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39020(module0015.$g354$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39020((SubLObject)module0695.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39020(module0015.$g358$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39020((SubLObject)module0695.$ic79$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                            final SubLObject var17_53 = module0015.$g533$.currentBinding(var33);
                            try {
                                module0015.$g533$.bind((SubLObject)module0695.T, var33);
                                SubLObject var64 = (SubLObject)module0695.NIL;
                                SubLObject var65 = (SubLObject)module0695.NIL;
                                if (module0695.NIL == module0655.$g5111$.getDynamicValue(var33)) {
                                    var65 = (SubLObject)module0695.$ic80$;
                                }
                                SubLObject var66 = (SubLObject)module0695.NIL;
                                SubLObject var67 = (SubLObject)module0695.NIL;
                                SubLObject var68 = (SubLObject)module0695.NIL;
                                SubLObject var69 = (SubLObject)module0695.NIL;
                                var67 = var41;
                                var68 = var67.first();
                                for (var69 = (SubLObject)module0695.ZERO_INTEGER; module0695.NIL != var67; var67 = var67.rest(), var68 = var67.first(), var69 = Numbers.add((SubLObject)module0695.ONE_INTEGER, var69)) {
                                    if (module0695.NIL != module0655.$g5111$.getDynamicValue(var33)) {
                                        if (module0695.NIL != var66) {
                                            var66 = (SubLObject)module0695.NIL;
                                        }
                                        else {
                                            var66 = (SubLObject)module0695.T;
                                        }
                                        var65 = (SubLObject)((module0695.NIL != var66) ? module0695.$ic81$ : module0695.$ic80$);
                                    }
                                    final SubLObject var70 = f42466(var68, var65, var40);
                                    if (module0695.NIL != var70) {
                                        var64 = (SubLObject)ConsesLow.cons(var68, var64);
                                    }
                                }
                                var41 = Sequences.nreverse(var64);
                                module0665.f40421((SubLObject)module0695.$ic17$, module0577.f35443(var35), var41);
                            }
                            finally {
                                module0015.$g533$.rebind(var17_53, var33);
                            }
                            module0642.f39020(module0015.$g347$.getGlobalValue());
                        }
                        module0642.f39029((SubLObject)module0695.UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var17_38, var33);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)module0695.UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var17_37, var33);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)module0695.UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var43, var33);
            }
        }
        return (SubLObject)module0695.NIL;
    }
    
    public static SubLObject f42469(final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        final SubLObject var33 = module0665.f40432(var31);
        SubLObject var34 = module0665.f40419((SubLObject)module0695.$ic31$, var33);
        final SubLObject var35 = module0665.f40419((SubLObject)module0695.$ic82$, var33);
        if (module0695.NIL == var34) {
            var34 = module0665.f40419((SubLObject)module0695.$ic32$, var33);
        }
        final SubLObject var36 = module0577.f35456(var34);
        if (module0695.NIL == module0577.f35438(var36)) {
            module0667.f40568((SubLObject)module0695.$ic33$, PrintLow.format((SubLObject)module0695.NIL, (SubLObject)module0695.$ic83$));
        }
        else {
            final SubLObject var32_77 = module0577.f35443(var36);
            final SubLObject var37 = module0665.f40419((SubLObject)module0695.$ic17$, var32_77);
            final SubLObject var38 = var35;
            if (var38.eql((SubLObject)module0695.$ic84$)) {
                final SubLObject var39 = (SubLObject)module0695.$ic85$;
                final SubLObject var40 = module0015.$g538$.currentBinding(var32);
                try {
                    module0015.$g538$.bind((module0695.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var32))) ? module0015.$g538$.getDynamicValue(var32) : module0057.f4173((SubLObject)module0695.UNPROVIDED, (SubLObject)module0695.UNPROVIDED, (SubLObject)module0695.UNPROVIDED), var32);
                    module0642.f39020((SubLObject)module0695.$ic38$);
                    module0642.f39029((SubLObject)module0695.UNPROVIDED);
                    module0642.f39020(module0015.$g155$.getGlobalValue());
                    module0642.f39020(module0015.$g153$.getGlobalValue());
                    module0015.f718();
                    module0655.f39766();
                    module0642.f39064(module0655.$g5143$.getDynamicValue(var32), module0655.$g5142$.getDynamicValue(var32));
                    final SubLObject var41 = module0014.f672((SubLObject)module0695.$ic39$);
                    module0642.f39029((SubLObject)module0695.UNPROVIDED);
                    module0642.f39020(module0015.$g175$.getGlobalValue());
                    module0642.f39020(module0015.$g176$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                    module0642.f39020((SubLObject)module0695.$ic40$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                    if (module0695.NIL != var41) {
                        module0642.f39020(module0015.$g178$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                        module0642.f39020(var41);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g177$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                    module0642.f39020((SubLObject)module0695.$ic41$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                    module0016.f941();
                    if (module0695.NIL != var39) {
                        module0642.f39029((SubLObject)module0695.UNPROVIDED);
                        module0642.f39020(module0015.$g173$.getGlobalValue());
                        module0642.f39019(var39);
                        module0642.f39020(module0015.$g174$.getGlobalValue());
                    }
                    module0642.f39020(module0015.$g154$.getGlobalValue());
                    module0642.f39029((SubLObject)module0695.UNPROVIDED);
                    final SubLObject var17_78 = module0015.$g535$.currentBinding(var32);
                    try {
                        module0015.$g535$.bind((SubLObject)module0695.T, var32);
                        module0642.f39020(module0015.$g133$.getGlobalValue());
                        if (module0695.NIL != module0015.$g132$.getDynamicValue(var32)) {
                            module0642.f39020(module0015.$g135$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var32)));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g137$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                        module0642.f39020((SubLObject)module0695.$ic44$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                        final SubLObject var17_79 = module0015.$g533$.currentBinding(var32);
                        try {
                            module0015.$g533$.bind((SubLObject)module0695.T, var32);
                            module0642.f39020(module0015.$g144$.getGlobalValue());
                            module0642.f39020(module0015.$g157$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39020((SubLObject)module0695.$ic45$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                            final SubLObject var17_80 = module0015.$g533$.currentBinding(var32);
                            try {
                                module0015.$g533$.bind((SubLObject)module0695.T, var32);
                                module0642.f39020(module0015.$g295$.getGlobalValue());
                                module0642.f39020(module0015.$g305$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                module0642.f39020((SubLObject)module0695.$ic46$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                module0642.f39020(module0015.$g302$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                module0642.f39020((SubLObject)module0695.$ic47$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                module0642.f39020(module0015.$g307$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                module0642.f39019((SubLObject)module0695.$ic48$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var17_80, var32);
                            }
                            module0642.f39020(module0015.$g145$.getGlobalValue());
                            if (module0695.NIL != var39) {
                                module0642.f39020(module0015.$g189$.getGlobalValue());
                                module0642.f39020((SubLObject)module0695.TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                                module0642.f39019(var39);
                                module0642.f39020(module0015.$g190$.getGlobalValue());
                                module0642.f39020((SubLObject)module0695.TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                            }
                            SubLObject var42 = var37;
                            SubLObject var43 = (SubLObject)module0695.NIL;
                            var43 = var42.first();
                            while (module0695.NIL != var42) {
                                module0554.f34204(var43, var35);
                                var42 = var42.rest();
                                var43 = var42.first();
                            }
                            module0642.f39029((SubLObject)module0695.UNPROVIDED);
                            module0642.f39050();
                        }
                        finally {
                            module0015.$g533$.rebind(var17_79, var32);
                        }
                        module0642.f39020(module0015.$g134$.getGlobalValue());
                        module0642.f39029((SubLObject)module0695.UNPROVIDED);
                    }
                    finally {
                        module0015.$g535$.rebind(var17_78, var32);
                    }
                    module0642.f39020(module0015.$g156$.getGlobalValue());
                    module0642.f39029((SubLObject)module0695.UNPROVIDED);
                }
                finally {
                    module0015.$g538$.rebind(var40, var32);
                }
                module0577.f35455(var36);
            }
            else if (var38.eql((SubLObject)module0695.$ic86$)) {
                SubLObject var44 = var37;
                SubLObject var45 = (SubLObject)module0695.NIL;
                var45 = var44.first();
                while (module0695.NIL != var44) {
                    if (module0695.$ic67$.equal(var45.first())) {
                        module0554.f34204(var45, (SubLObject)module0695.$ic87$);
                    }
                    var44 = var44.rest();
                    var45 = var44.first();
                }
                f42470(var32_77);
            }
        }
        return (SubLObject)module0695.NIL;
    }
    
    public static SubLObject f42471(final SubLObject var31) {
        final SubLObject var32 = module0665.f40432(var31);
        f42472(var32);
        return (SubLObject)module0695.NIL;
    }
    
    public static SubLObject f42472(final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        final SubLObject var34 = (SubLObject)module0695.$ic1$;
        final SubLObject var35 = module0665.f40419((SubLObject)module0695.$ic31$, var32);
        SubLObject var36 = module0577.f35456(var35);
        if (module0695.NIL == var36) {
            var36 = module0577.f35454((SubLObject)ConsesLow.list((SubLObject)module0695.$ic90$, module0574.f35152(), (SubLObject)module0695.$ic91$, var34));
        }
        if (module0695.NIL == module0577.f35438(var36)) {
            Errors.error((SubLObject)module0695.$ic92$);
        }
        module0577.f35447(var36, Time.get_universal_time());
        if (!module0577.f35443(var36).isHashtable()) {
            module0577.f35448(var36, Hashtables.make_hash_table((SubLObject)module0695.$ic93$, (SubLObject)module0695.UNPROVIDED, (SubLObject)module0695.UNPROVIDED));
        }
        module0665.f40421((SubLObject)module0695.$ic31$, module0577.f35443(var36), module0577.f35439(var36));
        SubLObject var37 = (SubLObject)module0695.NIL;
        SubLObject var38 = (SubLObject)module0695.NIL;
        final Iterator var39 = Hashtables.getEntrySetIterator(var32);
        try {
            while (Hashtables.iteratorHasNext(var39)) {
                final Map.Entry var40 = Hashtables.iteratorNextEntry(var39);
                var37 = Hashtables.getEntryKey(var40);
                var38 = Hashtables.getEntryValue(var40);
                if (module0695.NIL != module0004.f104(var37, module0695.$g5473$.getDynamicValue(var33), (SubLObject)module0695.UNPROVIDED, (SubLObject)module0695.UNPROVIDED)) {
                    module0665.f40422(var37, module0577.f35443(var36), var38);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var39);
        }
        final SubLObject var41 = module0577.f35439(var36);
        final SubLObject var42 = module0577.f35459(var36);
        if (module0695.NIL != var42) {
            Functions.funcall(var42, (SubLObject)ConsesLow.list(var41));
        }
        else {
            Errors.error((SubLObject)module0695.$ic94$);
        }
        return (SubLObject)module0695.NIL;
    }
    
    public static SubLObject f42473(final SubLObject var88, SubLObject var32) {
        if (var32 == module0695.UNPROVIDED) {
            var32 = (SubLObject)module0695.NIL;
        }
        final SubLThread var89 = SubLProcess.currentSubLThread();
        final SubLObject var90 = (SubLObject)module0695.$ic95$;
        final SubLObject var91 = module0015.$g538$.currentBinding(var89);
        try {
            module0015.$g538$.bind((module0695.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var89))) ? module0015.$g538$.getDynamicValue(var89) : module0057.f4173((SubLObject)module0695.UNPROVIDED, (SubLObject)module0695.UNPROVIDED, (SubLObject)module0695.UNPROVIDED), var89);
            module0642.f39020((SubLObject)module0695.$ic38$);
            module0642.f39029((SubLObject)module0695.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var89), module0655.$g5142$.getDynamicValue(var89));
            final SubLObject var92 = module0014.f672((SubLObject)module0695.$ic39$);
            module0642.f39029((SubLObject)module0695.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
            module0642.f39020((SubLObject)module0695.$ic40$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
            if (module0695.NIL != var92) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                module0642.f39020(var92);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
            module0642.f39020((SubLObject)module0695.$ic41$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
            module0016.f941();
            if (module0695.NIL != var90) {
                module0642.f39029((SubLObject)module0695.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var90);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0695.UNPROVIDED);
            final SubLObject var17_89 = module0015.$g535$.currentBinding(var89);
            try {
                module0015.$g535$.bind((SubLObject)module0695.T, var89);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0695.NIL != module0015.$g132$.getDynamicValue(var89)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var89)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                module0642.f39020((SubLObject)module0695.$ic44$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                final SubLObject var17_90 = module0015.$g533$.currentBinding(var89);
                try {
                    module0015.$g533$.bind((SubLObject)module0695.T, var89);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                    module0642.f39020((SubLObject)module0695.$ic45$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                    final SubLObject var17_91 = module0015.$g533$.currentBinding(var89);
                    try {
                        module0015.$g533$.bind((SubLObject)module0695.T, var89);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                        module0642.f39020((SubLObject)module0695.$ic46$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                        module0642.f39020((SubLObject)module0695.$ic47$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                        module0642.f39019((SubLObject)module0695.$ic48$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var17_91, var89);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0695.NIL != var90) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0695.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                        module0642.f39019(var90);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0695.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                    }
                    module0642.f39019((SubLObject)module0695.$ic96$);
                    module0642.f39026((SubLObject)module0695.TWO_INTEGER);
                    if (module0695.NIL != var32) {
                        final SubLObject var93 = module0665.f40419((SubLObject)module0695.$ic16$, var32);
                        if (module0695.NIL != var93) {
                            f42462(var93, (SubLObject)module0695.UNPROVIDED);
                        }
                    }
                    module0642.f39026((SubLObject)module0695.UNPROVIDED);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39020(module0015.$g352$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                    module0642.f39020((SubLObject)module0695.ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                    module0642.f39020(module0015.$g353$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                    module0642.f39020((SubLObject)module0695.TWO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                    module0642.f39020(module0015.$g354$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                    module0642.f39020((SubLObject)module0695.ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                    module0642.f39020(module0015.$g358$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                    module0642.f39020((SubLObject)module0695.$ic79$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                    final SubLObject var17_92 = module0015.$g533$.currentBinding(var89);
                    try {
                        module0015.$g533$.bind((SubLObject)module0695.T, var89);
                        SubLObject var94 = (SubLObject)module0695.NIL;
                        if (module0695.NIL == module0655.$g5111$.getDynamicValue(var89)) {
                            var94 = (SubLObject)module0695.$ic80$;
                        }
                        SubLObject var95 = (SubLObject)module0695.NIL;
                        SubLObject var96 = (SubLObject)module0695.NIL;
                        SubLObject var97 = (SubLObject)module0695.NIL;
                        SubLObject var98 = (SubLObject)module0695.NIL;
                        var96 = var88;
                        var97 = var96.first();
                        for (var98 = (SubLObject)module0695.ZERO_INTEGER; module0695.NIL != var96; var96 = var96.rest(), var97 = var96.first(), var98 = Numbers.add((SubLObject)module0695.ONE_INTEGER, var98)) {
                            if (module0695.NIL != module0655.$g5111$.getDynamicValue(var89)) {
                                if (module0695.NIL != var95) {
                                    var95 = (SubLObject)module0695.NIL;
                                }
                                else {
                                    var95 = (SubLObject)module0695.T;
                                }
                                var94 = (SubLObject)((module0695.NIL != var95) ? module0695.$ic81$ : module0695.$ic80$);
                            }
                            final SubLObject var99 = var97.first();
                            final SubLObject var100 = conses_high.second(var97);
                            final SubLObject var101 = conses_high.third(var97);
                            final SubLObject var102 = conses_high.fourth(var97);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            if (module0695.NIL != var94) {
                                module0642.f39020(module0015.$g366$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                module0642.f39020(var94);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                            final SubLObject var17_93 = module0015.$g533$.currentBinding(var89);
                            try {
                                module0015.$g533$.bind((SubLObject)module0695.T, var89);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39046(module0015.$g369$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0695.$ic97$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0695.$ic26$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                module0642.f39020(module0015.$g375$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                module0642.f39020((SubLObject)module0695.$ic98$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                                final SubLObject var17_94 = module0015.$g533$.currentBinding(var89);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0695.T, var89);
                                    if (module0695.NIL != var99) {
                                        module0642.f39019(var99);
                                    }
                                    module0642.f39019((SubLObject)module0695.$ic66$);
                                    if (module0695.NIL != var100) {
                                        module0642.f39019(var100);
                                    }
                                    if (!var100.eql(var101)) {
                                        module0642.f39019((SubLObject)module0695.$ic99$);
                                        if (module0695.NIL != var101) {
                                            module0642.f39019(var101);
                                        }
                                    }
                                    module0642.f39019((SubLObject)module0695.$ic66$);
                                    module0642.f39027((SubLObject)module0695.$ic100$, (SubLObject)module0695.ONE_INTEGER);
                                }
                                finally {
                                    module0015.$g533$.rebind(var17_94, var89);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0695.$ic97$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                                final SubLObject var17_95 = module0015.$g533$.currentBinding(var89);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0695.T, var89);
                                    module0642.f39019(var102);
                                }
                                finally {
                                    module0015.$g533$.rebind(var17_95, var89);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var17_93, var89);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0695.UNPROVIDED);
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var17_92, var89);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                    module0642.f39026((SubLObject)module0695.UNPROVIDED);
                    module0642.f39019((SubLObject)module0695.$ic101$);
                    final SubLObject var103 = Sequences.cconcatenate(module0110.$g127$.getDynamicValue(var89), (SubLObject)module0695.$ic102$);
                    module0642.f39020(module0015.$g381$.getGlobalValue());
                    module0642.f39020(module0015.$g383$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                    module0642.f39020(var103);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0695.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0695.UNPROVIDED);
                    final SubLObject var17_96 = module0015.$g533$.currentBinding(var89);
                    try {
                        module0015.$g533$.bind((SubLObject)module0695.T, var89);
                        module0642.f39019((SubLObject)module0695.$ic103$);
                    }
                    finally {
                        module0015.$g533$.rebind(var17_96, var89);
                    }
                    module0642.f39020(module0015.$g382$.getGlobalValue());
                    module0642.f39019((SubLObject)module0695.$ic104$);
                    module0642.f39029((SubLObject)module0695.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var17_90, var89);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0695.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var17_89, var89);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0695.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var91, var89);
        }
        return (SubLObject)module0695.NIL;
    }
    
    public static SubLObject f42470(final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        final SubLObject var34 = module0665.f40419((SubLObject)module0695.$ic16$, var32);
        final SubLObject var35 = module0665.f40419((SubLObject)module0695.$ic105$, var32);
        var33.resetMultipleValues();
        final SubLObject var36 = module0554.f34206(var35, var34, (SubLObject)module0695.UNPROVIDED, (SubLObject)module0695.UNPROVIDED);
        final SubLObject var37 = var33.secondMultipleValue();
        var33.resetMultipleValues();
        if (module0695.NIL != var37) {
            f42473(var37, var32);
        }
        else {
            module0665.f40421((SubLObject)module0695.$ic17$, var32, var36);
            f42472(var32);
        }
        return (SubLObject)module0695.NIL;
    }
    
    public static SubLObject f42474(final SubLObject var31) {
        final SubLObject var32 = module0665.f40432(var31);
        final SubLObject var33 = module0665.f40419((SubLObject)module0695.$ic106$, var32);
        final SubLObject var34 = module0038.f2738(var33, (SubLObject)ConsesLow.list(Strings.make_string((SubLObject)module0695.ONE_INTEGER, (SubLObject)Characters.CHAR_newline)), (SubLObject)module0695.UNPROVIDED, (SubLObject)module0695.UNPROVIDED, (SubLObject)module0695.UNPROVIDED, (SubLObject)module0695.UNPROVIDED, (SubLObject)module0695.UNPROVIDED);
        module0665.f40421((SubLObject)module0695.$ic15$, var32, (SubLObject)module0695.$ic5$);
        module0665.f40421((SubLObject)module0695.$ic105$, var32, var34);
        f42470(var32);
        return (SubLObject)module0695.NIL;
    }
    
    public static SubLObject f42475() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0695", "f42460", "S#46455", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0695", "f42461", "S#46456", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0695", "f42462", "S#46457", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0695", "f42463", "S#46458", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0695", "f42464", "S#46459", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0695", "f42465", "S#46460", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0695", "f42466", "S#46461", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0695", "f42467", "CB-DO-KE-OPERATIONS-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0695", "f42468", "S#46462", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0695", "f42469", "CB-DO-KE-OPERATIONS-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0695", "f42471", "CB-HANDLE-KE-OPERATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0695", "f42472", "S#46463", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0695", "f42473", "S#46464", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0695", "f42470", "S#46465", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0695", "f42474", "CB-HANDLE-KE-TEXT-COMPOSE", 1, 0, false);
        return (SubLObject)module0695.NIL;
    }
    
    public static SubLObject f42476() {
        module0695.$g5473$ = SubLFiles.defparameter("S#46466", (SubLObject)module0695.$ic2$);
        module0695.$g5474$ = SubLFiles.defparameter("S#46467", (SubLObject)module0695.$ic22$);
        return (SubLObject)module0695.NIL;
    }
    
    public static SubLObject f42477() {
        final SubLObject var104 = module0577.f35431((SubLObject)module0695.$ic0$);
        module0577.f35427(var104, (SubLObject)module0695.$ic1$);
        Hashtables.sethash(module0577.f35423(var104), module0577.$g4225$.getDynamicValue(), var104);
        module0656.f39895((SubLObject)module0695.$ic20$, (SubLObject)module0695.$ic21$);
        module0015.f873((SubLObject)module0695.$ic30$);
        module0015.f873((SubLObject)module0695.$ic88$);
        module0015.f873((SubLObject)module0695.$ic89$);
        module0015.f873((SubLObject)module0695.$ic107$);
        return (SubLObject)module0695.NIL;
    }
    
    public void declareFunctions() {
        f42475();
    }
    
    public void initializeVariables() {
        f42476();
    }
    
    public void runTopLevelForms() {
        f42477();
    }
    
    static {
        me = (SubLFile)new module0695();
        module0695.$g5473$ = null;
        module0695.$g5474$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUMMARY-FN"), (SubLObject)SubLObjectFactory.makeSymbol("S#46458", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY-FN"), (SubLObject)SubLObjectFactory.makeSymbol("CB-DO-KE-OPERATIONS-DISPLAY"), (SubLObject)SubLObjectFactory.makeKeyword("HANDLER-FN"), (SubLObject)SubLObjectFactory.makeSymbol("CB-DO-KE-OPERATIONS-HANDLER"));
        $ic1$ = SubLObjectFactory.makeKeyword("DO-KE-OPERATIONS");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("USER-ACTION-ID-STRING"), (SubLObject)SubLObjectFactory.makeKeyword("SOURCE"), (SubLObject)SubLObjectFactory.makeKeyword("FILENAME"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-EXISTING"), (SubLObject)SubLObjectFactory.makeKeyword("KE-TEXT-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("KE-OPERATIONS"));
        $ic3$ = SubLObjectFactory.makeKeyword("FILE");
        $ic4$ = SubLObjectFactory.makeString("unknown file");
        $ic5$ = SubLObjectFactory.makeKeyword("COMPOSE");
        $ic6$ = SubLObjectFactory.makeString("ke-text compose");
        $ic7$ = SubLObjectFactory.makeString("unknown source");
        $ic8$ = SubLObjectFactory.makeKeyword("ASSERT");
        $ic9$ = SubLObjectFactory.makeKeyword("UNASSERT");
        $ic10$ = SubLObjectFactory.makeKeyword("NEW-CONSTANT");
        $ic11$ = SubLObjectFactory.makeString("cg?cb-handle-ke-text-file&:filename=~A");
        $ic12$ = SubLObjectFactory.makeString("&:user-action-id-string=");
        $ic13$ = SubLObjectFactory.makeString("+2");
        $ic14$ = SubLObjectFactory.makeString("Reload File");
        $ic15$ = SubLObjectFactory.makeKeyword("SOURCE");
        $ic16$ = SubLObjectFactory.makeKeyword("FILENAME");
        $ic17$ = SubLObjectFactory.makeKeyword("KE-OPERATIONS");
        $ic18$ = SubLObjectFactory.makeString("Evaluate ");
        $ic19$ = SubLObjectFactory.makeString(" forms from ");
        $ic20$ = SubLObjectFactory.makeSymbol("S#46468", "CYC");
        $ic21$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("new-ke-text-constant"), (SubLObject)SubLObjectFactory.makeKeyword("KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("NEW-KE-TEXT-CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("APPLICABILITY-TEST-FN"), (SubLObject)SubLObjectFactory.makeSymbol("S#46459", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("HTML-OUTPUT-FN"), (SubLObject)SubLObjectFactory.makeSymbol("S#46460", "CYC"));
        $ic22$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEW-KE-TEXT-CONSTANT"));
        $ic23$ = SubLObjectFactory.makeKeyword("CHECK-AND-SHOW");
        $ic24$ = SubLObjectFactory.makeKeyword("CHECK-AND-REMOVE");
        $ic25$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERT"), (SubLObject)SubLObjectFactory.makeKeyword("UNASSERT"));
        $ic26$ = SubLObjectFactory.makeKeyword("TOP");
        $ic27$ = SubLObjectFactory.makeString("already exists ");
        $ic28$ = SubLObjectFactory.makeKeyword("BOTTOM");
        $ic29$ = SubLObjectFactory.makeString("does not exist");
        $ic30$ = SubLObjectFactory.makeSymbol("CB-DO-KE-OPERATIONS-DISPLAY");
        $ic31$ = SubLObjectFactory.makeKeyword("USER-ACTION-ID-STRING");
        $ic32$ = SubLObjectFactory.makeKeyword("JUST-STRING");
        $ic33$ = SubLObjectFactory.makeString("Fatal Error");
        $ic34$ = SubLObjectFactory.makeString("cb-do-ke-operations-display-internal called without a valid user-action-id-string");
        $ic35$ = SubLObjectFactory.makeKeyword("CHECK-EXISTING");
        $ic36$ = SubLObjectFactory.makeKeyword("NOT-REDUNDANT");
        $ic37$ = SubLObjectFactory.makeString("KE-Text: Parse Status");
        $ic38$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic39$ = SubLObjectFactory.makeKeyword("CB-CYC");
        $ic40$ = SubLObjectFactory.makeString("stylesheet");
        $ic41$ = SubLObjectFactory.makeString("text/css");
        $ic42$ = SubLObjectFactory.makeKeyword("SHA1");
        $ic43$ = SubLObjectFactory.makeString("text/javascript");
        $ic44$ = SubLObjectFactory.makeString("yui-skin-sam");
        $ic45$ = SubLObjectFactory.makeString("reloadFrameButton");
        $ic46$ = SubLObjectFactory.makeString("button");
        $ic47$ = SubLObjectFactory.makeString("reload");
        $ic48$ = SubLObjectFactory.makeString("Refresh Frames");
        $ic49$ = SubLObjectFactory.makeString("Your KE-Text (from ");
        $ic50$ = SubLObjectFactory.makeString(") did not parse into any operations.");
        $ic51$ = SubLObjectFactory.makeString(") has been successfully parsed into the below lists.");
        $ic52$ = SubLObjectFactory.makeString("cg?cb-handle-ke-operations&:user-action-id-string=~A&::check-existing=check-and-remove");
        $ic53$ = SubLObjectFactory.makeString("Remove Redundant Asserts/Unasserts.");
        $ic54$ = SubLObjectFactory.makeString("cg?cb-handle-ke-operations&:user-action-id-string=~A&::check-existing=check-and-show");
        $ic55$ = SubLObjectFactory.makeString("Check for Existing Assertions.");
        $ic56$ = SubLObjectFactory.makeString("cg?~A&~A&::method=agenda");
        $ic57$ = SubLObjectFactory.makeString("Add Forms to Agenda");
        $ic58$ = SubLObjectFactory.makeString("merged");
        $ic59$ = SubLObjectFactory.makeString("renamed");
        $ic60$ = SubLObjectFactory.makeString("killed");
        $ic61$ = SubLObjectFactory.makeString("created");
        $ic62$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" or "));
        $ic63$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(", "), (SubLObject)SubLObjectFactory.makeString(", or "));
        $ic64$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(", "), (SubLObject)SubLObjectFactory.makeString(", "), (SubLObject)SubLObjectFactory.makeString(" or "));
        $ic65$ = SubLObjectFactory.makeString("The following constants will be ");
        $ic66$ = SubLObjectFactory.makeString(":");
        $ic67$ = SubLObjectFactory.makeKeyword("CREATE");
        $ic68$ = SubLObjectFactory.makeString("Create: ");
        $ic69$ = SubLObjectFactory.makeKeyword("KILL");
        $ic70$ = SubLObjectFactory.makeString("Kill: ");
        $ic71$ = SubLObjectFactory.makeKeyword("RENAME");
        $ic72$ = SubLObjectFactory.makeString("Rename: ");
        $ic73$ = SubLObjectFactory.makeKeyword("MERGE");
        $ic74$ = SubLObjectFactory.makeString("Merge: ");
        $ic75$ = SubLObjectFactory.makeKeyword("CENTER");
        $ic76$ = SubLObjectFactory.makeString(" to ");
        $ic77$ = SubLObjectFactory.makeString(" onto ");
        $ic78$ = SubLObjectFactory.makeString("Operations:");
        $ic79$ = SubLObjectFactory.makeString("100%");
        $ic80$ = SubLObjectFactory.makeString("#cccccc");
        $ic81$ = SubLObjectFactory.makeString("#dddddd");
        $ic82$ = SubLObjectFactory.makeKeyword("METHOD");
        $ic83$ = SubLObjectFactory.makeString("cb-do-ke-operations-handler called without a valid user-action-id-string");
        $ic84$ = SubLObjectFactory.makeKeyword("AGENDA");
        $ic85$ = SubLObjectFactory.makeString("KE-Text: Forms Added to Agenda");
        $ic86$ = SubLObjectFactory.makeKeyword("MAKE-CONSTANTS");
        $ic87$ = SubLObjectFactory.makeKeyword("NOW");
        $ic88$ = SubLObjectFactory.makeSymbol("CB-DO-KE-OPERATIONS-HANDLER");
        $ic89$ = SubLObjectFactory.makeSymbol("CB-HANDLE-KE-OPERATIONS");
        $ic90$ = SubLObjectFactory.makeKeyword("CYCLIST");
        $ic91$ = SubLObjectFactory.makeKeyword("TYPE-KEY");
        $ic92$ = SubLObjectFactory.makeString("ket-handle-ke-operations: Could not create a user action.");
        $ic93$ = SubLObjectFactory.makeInteger(32);
        $ic94$ = SubLObjectFactory.makeString("User action :do-ke-operations not defined.");
        $ic95$ = SubLObjectFactory.makeString("KE-Text: Errors Found");
        $ic96$ = SubLObjectFactory.makeString("Some errors were found parsing your KE-Text.  Please fix and try again.");
        $ic97$ = SubLObjectFactory.makeKeyword("LEFT");
        $ic98$ = SubLObjectFactory.makeString("1%");
        $ic99$ = SubLObjectFactory.makeString("-");
        $ic100$ = SubLObjectFactory.makeKeyword("NBSP");
        $ic101$ = SubLObjectFactory.makeString("Looking over the ");
        $ic102$ = SubLObjectFactory.makeString("ref/ke-file.html");
        $ic103$ = SubLObjectFactory.makeString("KE Text specification");
        $ic104$ = SubLObjectFactory.makeString(" may also help.");
        $ic105$ = SubLObjectFactory.makeKeyword("KE-TEXT-LIST");
        $ic106$ = SubLObjectFactory.makeKeyword("KE-TEXT");
        $ic107$ = SubLObjectFactory.makeSymbol("CB-HANDLE-KE-TEXT-COMPOSE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0695.class
	Total time: 844 ms
	
	Decompiled with Procyon 0.5.32.
*/