package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0769 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0769";
    public static final String myFingerPrint = "4ee1532dc07ef72185f4c777f9224aa364bc1548d4803ffa86b506f7cac32aed";
    private static SubLSymbol $g6150$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLList $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLList $ic65$;
    private static final SubLList $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLList $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    
    public static SubLObject f49000(final SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)$ic0$;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        if (var5 == UNPROVIDED) {
            var5 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        assert NIL != module0161.f10499(var4) : var4;
        assert NIL != module0161.f10499(var5) : var5;
        SubLObject var7 = (SubLObject)NIL;
        final SubLObject var8 = module0751.$g5999$.currentBinding(var6);
        try {
            module0751.$g5999$.bind(module0751.f46595(), var6);
            module0751.f46591((SubLObject)$ic2$);
            try {
                var7 = module0770.f49050(var1, var2, var3, var4, var5, (SubLObject)$ic3$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                final SubLObject var8_9 = Threads.$is_thread_performing_cleanupP$.currentBinding(var6);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var6);
                    module0751.f46592();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var8_9, var6);
                }
            }
        }
        finally {
            module0751.$g5999$.rebind(var8, var6);
        }
        return var7;
    }
    
    public static SubLObject f49001(final SubLObject var1, SubLObject var2, SubLObject var4, SubLObject var5) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)$ic0$;
        }
        if (var4 == UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        if (var5 == UNPROVIDED) {
            var5 = module0579.$g4262$.getDynamicValue();
        }
        assert NIL != module0161.f10499(var4) : var4;
        assert NIL != module0161.f10499(var5) : var5;
        return module0751.f46724(module0751.f46730(module0770.f49050(var1, var2, (SubLObject)NIL, var4, var5, (SubLObject)$ic3$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f49002(final SubLObject var1, SubLObject var2, SubLObject var4, SubLObject var5) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)$ic0$;
        }
        if (var4 == UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        if (var5 == UNPROVIDED) {
            var5 = module0579.$g4262$.getDynamicValue();
        }
        assert NIL != module0161.f10499(var4) : var4;
        assert NIL != module0161.f10499(var5) : var5;
        return module0751.f46726(module0751.f46730(module0770.f49050(var1, var2, (SubLObject)NIL, var4, var5, (SubLObject)$ic3$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f49003(final SubLObject var10) {
        final SubLObject var11 = var10.first();
        return module0660.f40138((SubLObject)ConsesLow.list((SubLObject)$ic4$, var11));
    }
    
    public static SubLObject f49004(final SubLObject var12, SubLObject var13, SubLObject var14) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)$ic5$;
        }
        if (var14 == UNPROVIDED) {
            var14 = module0015.$g294$.getGlobalValue();
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        SubLObject var16 = (SubLObject)NIL;
        final SubLObject var17 = module0579.$g4298$.currentBinding(var15);
        final SubLObject var18 = module0579.$g4301$.currentBinding(var15);
        try {
            module0579.$g4298$.bind((NIL != var13) ? var13 : module0579.$g4298$.getDynamicValue(var15), var15);
            module0579.$g4301$.bind((NIL != var14) ? var14 : module0579.$g4301$.getDynamicValue(var15), var15);
            var16 = f49000(var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0579.$g4301$.rebind(var18, var15);
            module0579.$g4298$.rebind(var17, var15);
        }
        return var16;
    }
    
    public static SubLObject f49005(final SubLObject var12, SubLObject var13, SubLObject var14) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)$ic5$;
        }
        if (var14 == UNPROVIDED) {
            var14 = module0015.$g294$.getGlobalValue();
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (!var14.isString()) {
            var14 = module0656.f39832(var14);
        }
        final SubLObject var16 = module0015.$g533$.currentBinding(var15);
        try {
            module0015.$g533$.bind((SubLObject)NIL, var15);
            module0642.f39013(module0038.f2638(f49004(var12, var13, var14)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var16, var15);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49006(final SubLObject var12, SubLObject var13, SubLObject var14) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)$ic5$;
        }
        if (var14 == UNPROVIDED) {
            var14 = module0015.$g294$.getGlobalValue();
        }
        return f49007(var12, var13, var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49007(final SubLObject var12, SubLObject var13, SubLObject var14, SubLObject var4, SubLObject var5) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)$ic5$;
        }
        if (var14 == UNPROVIDED) {
            var14 = module0015.$g294$.getGlobalValue();
        }
        if (var4 == UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        if (var5 == UNPROVIDED) {
            var5 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        SubLObject var16 = (SubLObject)NIL;
        final SubLObject var17 = module0579.$g4298$.currentBinding(var15);
        final SubLObject var18 = module0579.$g4301$.currentBinding(var15);
        try {
            module0579.$g4298$.bind((NIL != var13) ? var13 : module0579.$g4298$.getDynamicValue(var15), var15);
            module0579.$g4301$.bind((NIL != var14) ? var14 : module0579.$g4301$.getDynamicValue(var15), var15);
            var16 = f49001(var12, (SubLObject)$ic0$, var4, var5);
        }
        finally {
            module0579.$g4301$.rebind(var18, var15);
            module0579.$g4298$.rebind(var17, var15);
        }
        return var16;
    }
    
    public static SubLObject f49008(final SubLObject var12, SubLObject var13, SubLObject var14, SubLObject var4, SubLObject var5) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)$ic5$;
        }
        if (var14 == UNPROVIDED) {
            var14 = module0015.$g294$.getGlobalValue();
        }
        if (var4 == UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        if (var5 == UNPROVIDED) {
            var5 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (!var14.isString()) {
            var14 = module0656.f39832(var14);
        }
        final SubLObject var16 = module0015.$g533$.currentBinding(var15);
        final SubLObject var17 = module0579.$g4260$.currentBinding(var15);
        final SubLObject var18 = module0579.$g4262$.currentBinding(var15);
        try {
            module0015.$g533$.bind((SubLObject)NIL, var15);
            module0579.$g4260$.bind(var4, var15);
            module0579.$g4262$.bind(var5, var15);
            module0642.f39034(module0038.f2638(f49007(var12, var13, var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED);
        }
        finally {
            module0579.$g4262$.rebind(var18, var15);
            module0579.$g4260$.rebind(var17, var15);
            module0015.$g533$.rebind(var16, var15);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49009(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        try {
            final SubLObject var21 = module0601.$g4652$.currentBinding(var20);
            final SubLObject var22 = module0601.$g4654$.currentBinding(var20);
            try {
                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var20), module0601.$g4652$.getDynamicValue(var20)), var20);
                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var20), var20);
                module0601.f36758((SubLObject)$ic8$, (SubLObject)ConsesLow.list((SubLObject)$ic9$, module0751.f46910(var19)), (SubLObject)NIL, (SubLObject)NIL);
                SubLObject var23 = module0751.f46911(var19);
                SubLObject var24 = (SubLObject)NIL;
                var24 = var23.first();
                while (NIL != var23) {
                    module0601.f36746();
                    f49010(var24);
                    var23 = var23.rest();
                    var24 = var23.first();
                }
            }
            finally {
                module0601.$g4654$.rebind(var22, var20);
                module0601.$g4652$.rebind(var21, var20);
            }
        }
        finally {
            final SubLObject var25 = Threads.$is_thread_performing_cleanupP$.currentBinding(var20);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var20);
                module0601.f36746();
                module0601.f36760((SubLObject)$ic8$);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var25, var20);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49010(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        final SubLObject var23 = module0601.$g4652$.currentBinding(var22);
        final SubLObject var24 = module0601.$g4654$.currentBinding(var22);
        try {
            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var22), module0601.$g4652$.getDynamicValue(var22)), var22);
            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var22), var22);
            module0601.f36758((SubLObject)$ic10$, f49011(var21), (SubLObject)T, (SubLObject)NIL);
        }
        finally {
            module0601.$g4654$.rebind(var24, var22);
            module0601.$g4652$.rebind(var23, var22);
        }
        return var21;
    }
    
    public static SubLObject f49011(final SubLObject var21) {
        SubLObject var22 = (SubLObject)ConsesLow.list((SubLObject)$ic9$, module0751.f46919(var21));
        final SubLObject var23 = module0751.f46917(var21);
        if (NIL != var23) {
            var22 = ConsesLow.append(var22, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var23));
        }
        final SubLObject var24 = module0751.f46920(var21);
        if (NIL != var24) {
            var22 = ConsesLow.append(var22, (SubLObject)ConsesLow.list((SubLObject)$ic12$, var24));
        }
        final SubLObject var25 = module0751.f46921(var21);
        if (NIL == module0751.f46829(var25)) {
            var22 = ConsesLow.append(var22, (SubLObject)ConsesLow.list((SubLObject)$ic13$, var25));
        }
        final SubLObject var26 = module0751.f46926(var21);
        if (NIL == module0756.f47747(var26)) {
            var22 = ConsesLow.append(var22, (SubLObject)ConsesLow.list((SubLObject)$ic14$, module0213.f13918(var26)));
        }
        var22 = ConsesLow.append(var22, (SubLObject)ConsesLow.list((SubLObject)$ic15$, module0751.f46928(var21)));
        return var22;
    }
    
    public static SubLObject f49012(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(module0579.$g4259$.getDynamicValue(var28) == $ic3$ && NIL == module0751.f47062(var27));
    }
    
    public static SubLObject f49013(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL == module0751.f46829(var25) && (NIL == module0756.f47776(var25) || NIL != module0579.$g4304$.getDynamicValue(var26)));
    }
    
    public static SubLObject f49014(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        if (NIL != module0579.$g4300$.getDynamicValue(var28)) {
            final SubLObject var29 = f49015(var27);
            if (NIL != var29) {
                return Values.values(Sequences.cconcatenate((SubLObject)$ic16$, new SubLObject[] { module0006.f205(var29), $ic17$ }), (SubLObject)$ic18$);
            }
        }
        final SubLObject var30 = f49016(var27);
        final SubLObject var31 = (SubLObject)((NIL != var30) ? f49017(var27) : NIL);
        return Values.values(var30, var31);
    }
    
    public static SubLObject f49018(final SubLObject var29) {
        return (SubLObject)((NIL != module0172.f10917(var29)) ? Sequences.cconcatenate((SubLObject)$ic19$, module0006.f203(module0655.f39759(var29))) : NIL);
    }
    
    public static SubLObject f49015(final SubLObject var27) {
        SubLObject var28 = (SubLObject)NIL;
        if (NIL == var28) {
            SubLObject var29 = module0751.f46781((SubLObject)$ic22$, (SubLObject)ConsesLow.listS($ic23$, var27, (SubLObject)$ic24$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var30 = (SubLObject)NIL;
            var30 = var29.first();
            while (NIL == var28 && NIL != var29) {
                if (NIL != module0589.f35909(var30)) {
                    var28 = var30;
                }
                else if (NIL != module0337.f22630(var30, (SubLObject)$ic21$)) {
                    var28 = module0205.f13277(var30, (SubLObject)UNPROVIDED);
                }
                var29 = var29.rest();
                var30 = var29.first();
            }
        }
        return var28;
    }
    
    public static SubLObject f49019(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        final SubLObject var29 = (SubLObject)(module0579.$g4302$.getDynamicValue(var28).isFunctionSpec() ? module0579.$g4302$.getDynamicValue(var28) : $ic25$);
        return Functions.funcall(var29, var27);
    }
    
    public static SubLObject f49016(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        final SubLObject var29 = f49019(var27);
        if ($ic26$ == module0579.$g4298$.getDynamicValue(var28)) {
            return (SubLObject)NIL;
        }
        if (NIL != var29) {
            return Sequences.cconcatenate((SubLObject)$ic27$, new SubLObject[] { module0006.f203(module0110.$g570$.getDynamicValue(var28)), $ic28$, module0006.f203(module0579.$g4298$.getDynamicValue(var28)), $ic29$, module0006.f203(var29), $ic30$, module0006.f203(module0579.$g4301$.getDynamicValue(var28)), $ic31$ });
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49017(final SubLObject var27) {
        return module0015.$g382$.getGlobalValue();
    }
    
    public static SubLObject f49020(final SubLObject var35) {
        return (SubLObject)makeBoolean(var35.isString() && NIL != module0038.f2668(module0015.$g381$.getGlobalValue(), var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f49021(final SubLObject var35) {
        return (SubLObject)makeBoolean(var35.isString() && NIL != module0038.f2668(module0015.$g382$.getGlobalValue(), var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f49022(final SubLObject var36, final SubLObject var27) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic32$, var36, var27);
        }
        if (NIL != module0038.f2668((SubLObject)$ic33$, var36, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var38 = Sequences.cconcatenate((SubLObject)$ic34$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic35$, module0006.f203((SubLObject)$ic36$) });
            module0578.f35476(var38, (SubLObject)ConsesLow.list(var27, var36));
        }
        SubLObject var39 = var36;
        final SubLObject var40 = module0603.f36853(var27);
        if (NIL == module0259.f16891(var27, $ic37$) && var40.isInteger()) {
            var39 = Sequences.cconcatenate((SubLObject)$ic27$, new SubLObject[] { module0006.f203(module0110.$g570$.getDynamicValue(var37)), $ic28$, module0006.f203(module0579.$g4298$.getDynamicValue(var37)), $ic29$, module0006.f203(var40), $ic30$, module0006.f203(module0579.$g4301$.getDynamicValue(var37)), $ic31$, module0006.f203(var36), $ic18$ });
        }
        return var39;
    }
    
    public static SubLObject f49023(final SubLObject var38) {
        final SubLObject var39 = Sort.sort(conses_high.copy_list(var38), Symbols.symbol_function((SubLObject)$ic38$), Symbols.symbol_function((SubLObject)$ic39$));
        return f49024(var39);
    }
    
    public static SubLObject f49025(final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        if (NIL == var39) {
            return module0038.$g916$.getGlobalValue();
        }
        SubLObject var41 = (SubLObject)NIL;
        SubLObject var42 = (SubLObject)NIL;
        SubLObject var43 = (SubLObject)NIL;
        try {
            var43 = streams_high.make_private_string_output_stream();
            final SubLObject var44 = module0015.$g131$.currentBinding(var40);
            try {
                module0015.$g131$.bind(var43, var40);
                SubLObject var45 = var39;
                SubLObject var46 = (SubLObject)NIL;
                var46 = var45.first();
                while (NIL != var45) {
                    SubLObject var48;
                    final SubLObject var47 = var48 = var46;
                    SubLObject var49 = (SubLObject)NIL;
                    SubLObject var50 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var48, var47, (SubLObject)$ic41$);
                    var49 = var48.first();
                    var48 = (var50 = var48.rest());
                    if (NIL != var41) {
                        module0642.f39019((SubLObject)$ic42$);
                    }
                    final SubLObject var51 = (SubLObject)T;
                    f49026(var50, (SubLObject)$ic43$, var51);
                    f49027(var49, module0579.$g4243$.getDynamicValue(var40));
                    var41 = (SubLObject)T;
                    var45 = var45.rest();
                    var46 = var45.first();
                }
            }
            finally {
                module0015.$g131$.rebind(var44, var40);
            }
            var42 = streams_high.get_output_stream_string(var43);
        }
        finally {
            final SubLObject var52 = Threads.$is_thread_performing_cleanupP$.currentBinding(var40);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var40);
                streams_high.close(var43, (SubLObject)UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var52, var40);
            }
        }
        return var42;
    }
    
    public static SubLObject f49024(final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        final SubLObject var41 = module0034.$g879$.getDynamicValue(var40);
        SubLObject var42 = (SubLObject)NIL;
        if (NIL == var41) {
            return f49025(var39);
        }
        var42 = module0034.f1857(var41, (SubLObject)$ic40$, (SubLObject)UNPROVIDED);
        if (NIL == var42) {
            var42 = module0034.f1807(module0034.f1842(var41), (SubLObject)$ic40$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var41, (SubLObject)$ic40$, var42);
        }
        SubLObject var43 = module0034.f1814(var42, var39, (SubLObject)$ic44$);
        if (var43 == $ic44$) {
            var43 = Values.arg2(var40.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49025(var39)));
            module0034.f1816(var42, var39, var43, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var43);
    }
    
    public static SubLObject f49026(final SubLObject var47, SubLObject var52, SubLObject var48) {
        if (var52 == UNPROVIDED) {
            var52 = module0038.$g916$.getGlobalValue();
        }
        if (var48 == UNPROVIDED) {
            var48 = (SubLObject)NIL;
        }
        final SubLThread var53 = SubLProcess.currentSubLThread();
        var53.resetMultipleValues();
        final SubLObject var54 = module0773.f49610(var47, (SubLObject)UNPROVIDED);
        final SubLObject var55 = var53.secondMultipleValue();
        final SubLObject var56 = var53.thirdMultipleValue();
        var53.resetMultipleValues();
        if (NIL != var54) {
            final SubLObject var57 = f49028(var47, var55, var56, var52);
            if (NIL != var48) {
                module0642.f39020(module0015.$g238$.getGlobalValue());
                module0642.f39020(module0015.$g431$.getGlobalValue());
                module0642.f39020(module0015.$g440$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var54);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var57) {
                    module0642.f39020(module0015.$g437$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var57);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var58 = module0015.$g533$.currentBinding(var53);
                try {
                    module0015.$g533$.bind((SubLObject)T, var53);
                }
                finally {
                    module0015.$g533$.rebind(var58, var53);
                }
                module0642.f39020(module0015.$g432$.getGlobalValue());
                module0642.f39020(module0015.$g239$.getGlobalValue());
            }
            else {
                module0642.f39020(module0015.$g431$.getGlobalValue());
                module0642.f39020(module0015.$g440$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var54);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var57) {
                    module0642.f39020(module0015.$g437$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var57);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var58 = module0015.$g533$.currentBinding(var53);
                try {
                    module0015.$g533$.bind((SubLObject)T, var53);
                }
                finally {
                    module0015.$g533$.rebind(var58, var53);
                }
                module0642.f39020(module0015.$g432$.getGlobalValue());
            }
        }
        return var47;
    }
    
    public static SubLObject f49028(final SubLObject var47, final SubLObject var54, final SubLObject var55, SubLObject var57) {
        if (var57 == UNPROVIDED) {
            var57 = module0038.$g916$.getGlobalValue();
        }
        final SubLThread var58 = SubLProcess.currentSubLThread();
        if (NIL != var47) {
            final SubLObject var59 = module0409.f28506((SubLObject)ConsesLow.listS($ic45$, var47, (SubLObject)$ic46$), $ic47$, (SubLObject)$ic48$);
            if (NIL != var59) {
                final SubLObject var60 = var59.first();
                final SubLObject var61 = module0035.f2293(var60, (SubLObject)$ic49$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                return var61;
            }
        }
        final SubLObject var62 = (NIL != var47) ? var47 : ((NIL != var54) ? var54 : var55);
        SubLObject var63 = (SubLObject)NIL;
        final SubLObject var64 = module0579.$g4255$.currentBinding(var58);
        final SubLObject var65 = module0579.$g4287$.currentBinding(var58);
        try {
            module0579.$g4255$.bind((SubLObject)T, var58);
            module0579.$g4287$.bind((SubLObject)TWO_INTEGER, var58);
            var63 = module0770.f49049(var62, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0579.$g4287$.rebind(var65, var58);
            module0579.$g4255$.rebind(var64, var58);
        }
        if (NIL != var63) {
            var63 = module0642.f39017(module0209.f13552(var63), (SubLObject)T);
        }
        return Sequences.cconcatenate((SubLObject)$ic50$, new SubLObject[] { module0006.f203(var57), module0006.f203((NIL != var63) ? var63 : module0038.$g916$.getGlobalValue()), $ic51$ });
    }
    
    public static SubLObject f49029(final SubLObject var47) {
        final SubLObject var48 = constants_high_oc.f10737((SubLObject)$ic52$);
        final SubLObject var49 = constants_high_oc.f10737((SubLObject)$ic53$);
        final SubLObject var50 = constants_high_oc.f10737((SubLObject)$ic54$);
        if (NIL == constant_handles_oc.f8465(var48, (SubLObject)UNPROVIDED) || NIL == constant_handles_oc.f8465(var49, (SubLObject)UNPROVIDED) || NIL == constant_handles_oc.f8465(var50, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        final SubLObject var51 = (SubLObject)$ic55$;
        final SubLObject var52 = module0434.f30578(var51, module0202.f12770(var48, var47, var49, var50, var51), $ic47$, (SubLObject)ConsesLow.list((SubLObject)$ic56$, (SubLObject)ZERO_INTEGER, (SubLObject)$ic57$, (SubLObject)FIVE_INTEGER, (SubLObject)$ic58$, (SubLObject)ONE_INTEGER));
        return (SubLObject)((NIL != module0035.f2013(var52)) ? var52.first() : NIL);
    }
    
    public static SubLObject f49030(final SubLObject var66, SubLObject var67, SubLObject var68) {
        if (var67 == UNPROVIDED) {
            var67 = (SubLObject)$ic59$;
        }
        if (var68 == UNPROVIDED) {
            var68 = (SubLObject)T;
        }
        final SubLThread var69 = SubLProcess.currentSubLThread();
        final SubLObject var70 = f49031(var66);
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = (SubLObject)NIL;
        try {
            var74 = streams_high.make_private_string_output_stream();
            final SubLObject var75 = module0015.$g131$.currentBinding(var69);
            try {
                module0015.$g131$.bind(var74, var69);
                var73 = f49032(var70, var68);
                if (NIL != f49033(var66)) {
                    module0642.f39019((SubLObject)$ic60$);
                }
            }
            finally {
                module0015.$g131$.rebind(var75, var69);
            }
            var72 = streams_high.get_output_stream_string(var74);
        }
        finally {
            final SubLObject var76 = Threads.$is_thread_performing_cleanupP$.currentBinding(var69);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var69);
                streams_high.close(var74, (SubLObject)UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var76, var69);
            }
        }
        var74 = (SubLObject)NIL;
        try {
            var74 = streams_high.make_private_string_output_stream();
            final SubLObject var75 = module0015.$g131$.currentBinding(var69);
            try {
                module0015.$g131$.bind(var74, var69);
                final SubLObject var77 = f49034(var66);
                if (NIL != var73 || NIL == f49035()) {
                    f49027(var77, var67);
                }
                else {
                    final SubLObject var78 = $g6150$.getGlobalValue();
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (NIL != var78) {
                        module0642.f39020(module0015.$g222$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(var78));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var8_73 = module0015.$g533$.currentBinding(var69);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var69);
                        f49027(var77, var67);
                    }
                    finally {
                        module0015.$g533$.rebind(var8_73, var69);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                }
                f49026(var70, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g131$.rebind(var75, var69);
            }
            var71 = streams_high.get_output_stream_string(var74);
        }
        finally {
            final SubLObject var79 = Threads.$is_thread_performing_cleanupP$.currentBinding(var69);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var69);
                streams_high.close(var74, (SubLObject)UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var79, var69);
            }
        }
        return Sequences.cconcatenate(var71, new SubLObject[] { $ic61$, var72 });
    }
    
    public static SubLObject f49035() {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean(module0579.$g4303$.getDynamicValue(var6));
    }
    
    public static SubLObject f49027(final SubLObject var34, final SubLObject var67) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g149$.getGlobalValue());
        module0642.f39020(module0015.$g158$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic62$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var69 = module0015.$g533$.currentBinding(var68);
        try {
            module0015.$g533$.bind((SubLObject)T, var68);
            if (var67.eql((SubLObject)$ic59$)) {
                module0642.f39020(module0015.$g238$.getGlobalValue());
                module0642.f39019(var34);
                module0642.f39020(module0015.$g239$.getGlobalValue());
            }
            else if (var67.eql((SubLObject)$ic63$)) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var68), (SubLObject)$ic64$, var34);
            }
        }
        finally {
            module0015.$g533$.rebind(var69, var68);
        }
        module0642.f39020(module0015.$g150$.getGlobalValue());
        return var34;
    }
    
    public static SubLObject f49032(final SubLObject var47, final SubLObject var68) {
        final SubLObject var69 = f49036(var47, var68);
        if (NIL == var69) {
            f49037(var47, var68);
        }
        return var69;
    }
    
    public static SubLObject f49036(final SubLObject var47, final SubLObject var68) {
        final SubLThread var69 = SubLProcess.currentSubLThread();
        SubLObject var70 = f49029(var47);
        if (NIL != module0208.f13537(var70, (SubLObject)UNPROVIDED)) {
            var70 = module0039.f3041(module0205.f13277(var70, (SubLObject)UNPROVIDED));
        }
        if (var70.isString()) {
            final SubLObject var71 = module0015.$g533$.currentBinding(var69);
            try {
                module0015.$g533$.bind((SubLObject)NIL, var69);
                if (NIL != var68) {
                    module0642.f39035(var70, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                else {
                    module0642.f39019(var70);
                }
            }
            finally {
                module0015.$g533$.rebind(var71, var69);
            }
        }
        return var70;
    }
    
    public static SubLObject f49037(final SubLObject var47, final SubLObject var68) {
        final SubLThread var69 = SubLProcess.currentSubLThread();
        final SubLObject var70 = module0579.$g4300$.currentBinding(var69);
        try {
            module0579.$g4300$.bind(var68, var69);
            module0775.f49884(var47, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0579.$g4300$.rebind(var70, var69);
        }
        return var47;
    }
    
    public static SubLObject f49038(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.isList() && NIL != module0062.f4492(var1, (SubLObject)$ic65$));
    }
    
    public static SubLObject f49039(final SubLObject var47, final SubLObject var34, SubLObject var76) {
        if (var76 == UNPROVIDED) {
            var76 = (SubLObject)NIL;
        }
        return (SubLObject)ConsesLow.list(var34, var47, var76);
    }
    
    public static SubLObject f49034(final SubLObject var66) {
        return var66.first();
    }
    
    public static SubLObject f49031(final SubLObject var66) {
        return conses_high.second(var66);
    }
    
    public static SubLObject f49033(final SubLObject var66) {
        return conses_high.third(var66);
    }
    
    public static SubLObject f49040(final SubLObject var15) {
        return module0756.f47718(var15, module0015.$g224$.getGlobalValue(), module0015.$g225$.getGlobalValue());
    }
    
    public static SubLObject f49041(final SubLObject var77) {
        SubLObject var79;
        final SubLObject var78 = var79 = module0749.f46478(var77);
        SubLObject var80 = (SubLObject)NIL;
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var79, var78, (SubLObject)$ic66$);
        var80 = var79.first();
        var79 = var79.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var79, var78, (SubLObject)$ic66$);
        var81 = var79.first();
        var79 = var79.rest();
        if (NIL == var79) {
            final SubLObject var82 = var80.isString() ? Sequences.cconcatenate(module0015.$g224$.getGlobalValue(), var80) : module0015.$g224$.getGlobalValue();
            final SubLObject var83 = var81.isString() ? Sequences.cconcatenate(var81, module0015.$g225$.getGlobalValue()) : module0015.$g225$.getGlobalValue();
            module0749.f46479(var77, var82, var83);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var78, (SubLObject)$ic66$);
        }
        return var77;
    }
    
    public static SubLObject f49042(final SubLObject var77) {
        SubLObject var79;
        final SubLObject var78 = var79 = module0749.f46478(var77);
        SubLObject var80 = (SubLObject)NIL;
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var79, var78, (SubLObject)$ic66$);
        var80 = var79.first();
        var79 = var79.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var79, var78, (SubLObject)$ic66$);
        var81 = var79.first();
        var79 = var79.rest();
        if (NIL == var79) {
            final SubLObject var82 = var80.isString() ? Sequences.cconcatenate(module0015.$g238$.getGlobalValue(), var80) : module0015.$g238$.getGlobalValue();
            final SubLObject var83 = var81.isString() ? Sequences.cconcatenate(var81, module0015.$g239$.getGlobalValue()) : module0015.$g239$.getGlobalValue();
            module0749.f46479(var77, var82, var83);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var78, (SubLObject)$ic66$);
        }
        return var77;
    }
    
    public static SubLObject f49043(final SubLObject var77) {
        SubLObject var79;
        final SubLObject var78 = var79 = module0749.f46478(var77);
        SubLObject var80 = (SubLObject)NIL;
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var79, var78, (SubLObject)$ic66$);
        var80 = var79.first();
        var79 = var79.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var79, var78, (SubLObject)$ic66$);
        var81 = var79.first();
        var79 = var79.rest();
        if (NIL == var79) {
            final SubLObject var82 = var80.isString() ? Sequences.cconcatenate(module0015.$g236$.getGlobalValue(), var80) : module0015.$g236$.getGlobalValue();
            final SubLObject var83 = var81.isString() ? Sequences.cconcatenate(var81, module0015.$g237$.getGlobalValue()) : module0015.$g237$.getGlobalValue();
            module0749.f46479(var77, var82, var83);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var78, (SubLObject)$ic66$);
        }
        return var77;
    }
    
    public static SubLObject f49044(final SubLObject var27) {
        final SubLObject var28 = module0603.f36861(var27);
        return f49022(var28, var27);
    }
    
    public static SubLObject f49045(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if ($ic3$.eql(module0579.$g4259$.getDynamicValue(var16))) {
            final SubLObject var17 = module0756.f47487(var15, (SubLObject)UNPROVIDED);
            SubLObject var19;
            final SubLObject var18 = var19 = module0205.f13304(var17, (SubLObject)UNPROVIDED);
            SubLObject var20 = (SubLObject)NIL;
            SubLObject var21 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var19, var18, (SubLObject)$ic70$);
            var20 = var19.first();
            var19 = var19.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var19, var18, (SubLObject)$ic70$);
            var21 = var19.first();
            var19 = var19.rest();
            if (NIL == var19) {
                final SubLObject var22 = (SubLObject)ConsesLow.list(module0749.f46446(module0770.f49050(var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0751.f46825((SubLObject)$ic71$), var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), f49042(module0749.f46446(module0770.f49050(var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0751.f46825((SubLObject)$ic72$), var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
                module0756.f47501(var15, var22, (SubLObject)UNPROVIDED);
                module0756.f47608(var15);
                return var22;
            }
            cdestructuring_bind.cdestructuring_bind_error(var18, (SubLObject)$ic70$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49046() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49000", "HTML-GENERATE-PHRASE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49001", "HTML-GENERATE-TEXT", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49002", "S#43989", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49003", "PARAPHRASE-LINK-TO-CB-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49004", "S#53489", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49005", "S#53490", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49006", "S#53491", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49007", "S#53492", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49008", "S#53493", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49009", "S#53494", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49010", "S#53495", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49011", "S#53496", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49012", "S#51943", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49013", "S#51944", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49014", "S#37374", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49018", "S#51671", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49015", "S#53497", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49019", "S#53498", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49016", "S#53499", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49017", "S#53500", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49020", "S#51945", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49021", "S#51946", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49022", "S#52349", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49023", "S#52544", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49025", "S#53501", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49024", "S#53502", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49026", "S#53503", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49028", "S#53504", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49029", "S#53505", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49030", "S#53506", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49035", "S#53507", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49027", "S#53508", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49032", "S#53509", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49036", "S#53510", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49037", "S#53511", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49038", "S#53512", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49039", "S#53513", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49034", "S#53514", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49031", "S#53515", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49033", "S#53516", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49040", "S#53268", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49041", "S#53271", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49042", "S#53269", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49043", "S#52355", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49044", "S#53517", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0769", "f49045", "S#53518", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49047() {
        $g6150$ = SubLFiles.defconstant("S#53519", module0015.$g498$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49048() {
        module0015.f873((SubLObject)$ic5$);
        module0002.f35((SubLObject)$ic6$, (SubLObject)$ic7$);
        module0012.f419((SubLObject)$ic20$);
        module0034.f1895((SubLObject)$ic40$);
        module0762.f48147((SubLObject)$ic67$, (SubLObject)$ic68$, (SubLObject)$ic69$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f49046();
    }
    
    public void initializeVariables() {
        f49047();
    }
    
    public void runTopLevelForms() {
        f49048();
    }
    
    static {
        me = (SubLFile)new module0769();
        $g6150$ = null;
        $ic0$ = makeKeyword("ANY");
        $ic1$ = makeSymbol("S#13265", "CYC");
        $ic2$ = makeKeyword("HTML-GENERATE-PHRASE");
        $ic3$ = makeKeyword("HTML");
        $ic4$ = makeString("cb-cf");
        $ic5$ = makeSymbol("PARAPHRASE-LINK-TO-CB-START");
        $ic6$ = makeSymbol("S#53491", "CYC");
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("S#53492", "CYC"));
        $ic8$ = makeString("paraphrase");
        $ic9$ = makeString("string");
        $ic10$ = makeString("sub-paraphrase");
        $ic11$ = makeString("open-tag");
        $ic12$ = makeString("close-tag");
        $ic13$ = makeString("arg-position");
        $ic14$ = makeString("cycl-id");
        $ic15$ = makeString("offset");
        $ic16$ = makeString("<a href=");
        $ic17$ = makeString(">");
        $ic18$ = makeString("</a>");
        $ic19$ = makeString("naut");
        $ic20$ = makeSymbol("S#51671", "CYC");
        $ic21$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("URLFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("URL-P")));
        $ic22$ = makeSymbol("?URL");
        $ic23$ = constant_handles_oc.f8479((SubLObject)makeString("salientURL"));
        $ic24$ = ConsesLow.list((SubLObject)makeSymbol("?URL"));
        $ic25$ = makeSymbol("S#39059", "CYC");
        $ic26$ = makeKeyword("NONE");
        $ic27$ = makeString("<a href=\"");
        $ic28$ = makeString("?");
        $ic29$ = makeString("&");
        $ic30$ = makeString("\" target=\"");
        $ic31$ = makeString("\">");
        $ic32$ = makeString("~&Adding tag to ~S for ~S.~%");
        $ic33$ = makeString("href");
        $ic34$ = makeString("(PPH error level ");
        $ic35$ = makeString(") ");
        $ic36$ = makeString("~&Adding tag to string containing tag: ~S ~S~%");
        $ic37$ = constant_handles_oc.f8479((SubLObject)makeString("IntermediateVocabTerm"));
        $ic38$ = makeSymbol("<");
        $ic39$ = makeSymbol("CAR");
        $ic40$ = makeSymbol("S#53502", "CYC");
        $ic41$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#53520", "CYC"), (SubLObject)makeSymbol("S#10134", "CYC"));
        $ic42$ = makeString(", ");
        $ic43$ = makeString("Source: ");
        $ic44$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic45$ = constant_handles_oc.f8479((SubLObject)makeString("citationStringForStyleAndRendering"));
        $ic46$ = ConsesLow.list((SubLObject)makeSymbol("?X"), (SubLObject)makeSymbol("?Y"), (SubLObject)makeSymbol("?TEXT"));
        $ic47$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic48$ = ConsesLow.list((SubLObject)makeKeyword("MAX-TIME"), (SubLObject)FIVE_INTEGER);
        $ic49$ = makeSymbol("?TEXT");
        $ic50$ = makeString("[");
        $ic51$ = makeString("]");
        $ic52$ = makeString("citationStringForStyleAndRendering");
        $ic53$ = makeString("CycorpStyleSpecificationStandard");
        $ic54$ = makeString("HypertextMarkupLanguage");
        $ic55$ = makeSymbol("?CITATION");
        $ic56$ = makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic57$ = makeKeyword("MAX-TIME");
        $ic58$ = makeKeyword("MAX-NUMBER");
        $ic59$ = makeKeyword("SUPERSCRIPTS");
        $ic60$ = makeString(" (strengthened by Cyc)");
        $ic61$ = makeString(" ");
        $ic62$ = makeString("sourcefootnote");
        $ic63$ = makeKeyword("SQUARE-BRACKETS");
        $ic64$ = makeString("[~D]");
        $ic65$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("POSITIVE-INTEGER-P")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("CYCL-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("BOOLEANP")));
        $ic66$ = ConsesLow.list((SubLObject)makeSymbol("S#51675", "CYC"), (SubLObject)makeSymbol("S#51676", "CYC"));
        $ic67$ = makeSymbol("S#53518", "CYC");
        $ic68$ = makeKeyword("EXPONENT-NAUT");
        $ic69$ = makeKeyword("BEST");
        $ic70$ = ConsesLow.list((SubLObject)makeSymbol("S#53521", "CYC"), (SubLObject)makeSymbol("S#53522", "CYC"));
        $ic71$ = makeKeyword("ARG1");
        $ic72$ = makeKeyword("ARG2");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 484 ms
	
	Decompiled with Procyon 0.5.32.
*/