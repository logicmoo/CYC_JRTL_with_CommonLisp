package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0644 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0644";
    public static final String myFingerPrint = "f9a6e6367aeae21d30aed6beae840bffcaf737027c353e31a75aee657781a2e4";
    public static SubLSymbol $g4990$;
    public static SubLSymbol $g4991$;
    public static SubLSymbol $g4992$;
    public static SubLSymbol $g4993$;
    public static SubLSymbol $g4994$;
    public static SubLSymbol $g4995$;
    public static SubLSymbol $g4996$;
    public static SubLSymbol $g4997$;
    public static SubLSymbol $g4998$;
    private static SubLSymbol $g4999$;
    private static SubLSymbol $g5000$;
    public static SubLSymbol $g5001$;
    public static SubLSymbol $g5002$;
    private static SubLSymbol $g5003$;
    public static SubLSymbol $g5004$;
    private static SubLSymbol $g5005$;
    private static SubLSymbol $g5006$;
    private static SubLSymbol $g5007$;
    private static SubLSymbol $g5008$;
    private static SubLSymbol $g5009$;
    private static SubLSymbol $g5010$;
    private static SubLSymbol $g5011$;
    private static SubLSymbol $g5012$;
    private static SubLSymbol $g5013$;
    private static SubLSymbol $g5014$;
    private static SubLSymbol $g5015$;
    private static SubLSymbol $g5016$;
    private static SubLSymbol $g5017$;
    public static SubLSymbol $g5018$;
    public static SubLSymbol $g5019$;
    public static SubLSymbol $g5020$;
    private static SubLSymbol $g5021$;
    public static SubLSymbol $g5022$;
    public static SubLSymbol $g5023$;
    public static SubLSymbol $g5024$;
    private static SubLSymbol $g5025$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
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
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLInteger $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
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
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLList $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLList $ic60$;
    private static final SubLList $ic61$;
    private static final SubLList $ic62$;
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
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLList $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLList $ic86$;
    private static final SubLString $ic87$;
    private static final SubLList $ic88$;
    private static final SubLString $ic89$;
    private static final SubLList $ic90$;
    private static final SubLList $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLInteger $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLString $ic105$;
    private static final SubLString $ic106$;
    private static final SubLString $ic107$;
    private static final SubLString $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLString $ic111$;
    private static final SubLInteger $ic112$;
    private static final SubLInteger $ic113$;
    private static final SubLInteger $ic114$;
    private static final SubLString $ic115$;
    private static final SubLString $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLString $ic121$;
    
    public static SubLObject f39174(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var1) : var1;
        assert NIL != Types.stringp(var2) : var2;
        if (NIL != module0015.$g541$.getDynamicValue(var5)) {
            module0642.f39020(module0015.$g295$.getGlobalValue());
            module0642.f39020(module0015.$g305$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g310$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var1) {
                module0642.f39020(module0015.$g307$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39019(var1);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39032((SubLObject)ONE_INTEGER);
            PrintLow.format(module0015.$g131$.getDynamicValue(var5), var2, var3, var4);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        }
        else {
            module0642.f39020(module0015.$g282$.getGlobalValue());
            module0642.f39020(module0015.$g284$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0110.$g570$.getDynamicValue(var5));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var6 = module0015.$g533$.currentBinding(var5);
            final SubLObject var7 = module0015.$g541$.currentBinding(var5);
            final SubLObject var8 = module0015.$g539$.currentBinding(var5);
            try {
                module0015.$g533$.bind((SubLObject)T, var5);
                module0015.$g541$.bind((SubLObject)T, var5);
                module0015.$g539$.bind(module0015.f797(), var5);
                module0642.f39020(module0015.$g295$.getGlobalValue());
                module0642.f39020(module0015.$g305$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g310$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var1) {
                    module0642.f39020(module0015.$g307$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39019(var1);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39032((SubLObject)ONE_INTEGER);
                PrintLow.format(module0015.$g131$.getDynamicValue(var5), var2, var3, var4);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0015.f799(module0015.$g539$.getDynamicValue(var5));
            }
            finally {
                module0015.$g539$.rebind(var8, var5);
                module0015.$g541$.rebind(var7, var5);
                module0015.$g533$.rebind(var6, var5);
            }
            module0642.f39020(module0015.$g283$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39175(final SubLObject var9, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var9) : var9;
        assert NIL != Types.stringp(var2) : var2;
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0656.f39788((SubLObject)$ic4$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)ONE_INTEGER);
        PrintLow.format(module0015.$g131$.getDynamicValue(var10), var2, var3, var4);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var11 = module0015.$g533$.currentBinding(var10);
        try {
            module0015.$g533$.bind((SubLObject)T, var10);
            module0642.f39020(var9);
        }
        finally {
            module0015.$g533$.rebind(var11, var10);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39176(SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)$ic5$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        final SubLObject var12 = module0015.$g535$.currentBinding(var11);
        try {
            module0015.$g535$.bind((SubLObject)T, var11);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39032((SubLObject)ONE_INTEGER);
            f39177((SubLObject)ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var6_11 = module0015.$g533$.currentBinding(var11);
            try {
                module0015.$g533$.bind((SubLObject)T, var11);
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var6_11, var11);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var12, var11);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39178(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)$ic8$;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return f39174(var1, $g4992$.getDynamicValue(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39179(SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)$ic8$;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        return f39175(var9, $g4993$.getDynamicValue(var10), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39180(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)$ic11$;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return f39174(var1, $g4994$.getDynamicValue(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39181(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)$ic13$;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return f39174(var1, $g4995$.getDynamicValue(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39182(SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)$ic13$;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        return f39175(var9, $g4996$.getDynamicValue(var10), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39183(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var12) : var12;
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var14 = module0015.$g533$.currentBinding(var13);
        try {
            module0015.$g533$.bind((SubLObject)T, var13);
            PrintLow.format(module0015.$g131$.getDynamicValue(var13), $g4997$.getDynamicValue(var13), var12);
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var14, var13);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39184(final SubLObject var13, SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)$ic17$;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var13) : var13;
        return f39174(var1, $g4998$.getDynamicValue(var14), var13, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39185(final SubLObject var13, final SubLObject var14, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)$ic19$;
        }
        assert NIL != Types.stringp(var13) : var13;
        assert NIL != Types.stringp(var14) : var14;
        return f39174(var15, $g4999$.getGlobalValue(), var13, var14);
    }
    
    public static SubLObject f39186(final SubLObject var13, final SubLObject var14, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)$ic21$;
        }
        assert NIL != Types.stringp(var13) : var13;
        assert NIL != Types.stringp(var14) : var14;
        return f39174(var15, $g5000$.getGlobalValue(), var13, var14);
    }
    
    public static SubLObject f39187(final SubLObject var12, final SubLObject var16, SubLObject var1, SubLObject var17) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var12) : var12;
        assert NIL != Types.stringp(var16) : var16;
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g314$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var12) {
            module0642.f39020(module0015.$g302$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var12);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var1) {
            module0642.f39020(module0015.$g307$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39019(var1);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var17) {
            module0642.f39046(module0015.$g296$.getGlobalValue());
        }
        module0642.f39032((SubLObject)ONE_INTEGER);
        PrintLow.format(module0015.$g131$.getDynamicValue(var18), $g5001$.getDynamicValue(var18), var16);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39188(final SubLObject var12, final SubLObject var18, SubLObject var1, SubLObject var17) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var12) : var12;
        assert NIL != Types.stringp(var18) : var18;
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g314$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var12) {
            module0642.f39020(module0015.$g302$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var12);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var1) {
            module0642.f39020(module0015.$g307$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39019(var1);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var17) {
            module0642.f39046(module0015.$g296$.getGlobalValue());
        }
        module0642.f39032((SubLObject)ONE_INTEGER);
        PrintLow.format(module0015.$g131$.getDynamicValue(var19), $g5002$.getDynamicValue(var19), var18);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39189(final SubLObject var19, final SubLObject var20) {
        return PrintLow.format((SubLObject)NIL, $g5003$.getGlobalValue(), var19, var20);
    }
    
    public static SubLObject f39177(SubLObject var21) {
        if (var21 == UNPROVIDED) {
            var21 = (SubLObject)$ic27$;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        assert NIL != Types.integerp(var21) : var21;
        PrintLow.format(module0015.$g131$.getDynamicValue(var22), $g5004$.getDynamicValue(var22), var21);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39190(final SubLObject var22, SubLObject var23, SubLObject var24, SubLObject var25, SubLObject var26, SubLObject var27, SubLObject var28) {
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)NIL;
        }
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)NIL;
        }
        if (var25 == UNPROVIDED) {
            var25 = (SubLObject)NIL;
        }
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var22) : var22;
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g316$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g306$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var28);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var23) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var23);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var22) {
            module0642.f39020(module0015.$g307$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39019(var22);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39032((SubLObject)ONE_INTEGER);
        PrintLow.format(module0015.$g131$.getDynamicValue(var29), $g5005$.getDynamicValue(var29));
        f39191(var24, var25, var26, var27);
        PrintLow.format(module0015.$g131$.getDynamicValue(var29), $g5006$.getDynamicValue(var29));
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39192(final SubLObject var12, SubLObject var29, SubLObject var30, SubLObject var24, SubLObject var25, SubLObject var26, SubLObject var27) {
        if (var29 == UNPROVIDED) {
            var29 = (SubLObject)NIL;
        }
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)NIL;
        }
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)NIL;
        }
        if (var25 == UNPROVIDED) {
            var25 = (SubLObject)NIL;
        }
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (var29.equalp((SubLObject)$ic33$)) {
            var29 = (SubLObject)NIL;
        }
        final SubLObject var32 = Sequences.cconcatenate((SubLObject)$ic34$, module0006.f203(var30));
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g317$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g306$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var32);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic35$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var12) {
            module0642.f39020(module0015.$g302$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var12);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var29) {
            module0642.f39020(module0015.$g307$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39019(var29);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39032((SubLObject)ONE_INTEGER);
        PrintLow.format(module0015.$g131$.getDynamicValue(var31), $g5007$.getDynamicValue(var31));
        f39191(var24, var25, var26, var27);
        PrintLow.format(module0015.$g131$.getDynamicValue(var31), $g5008$.getDynamicValue(var31));
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39191(final SubLObject var24, final SubLObject var25, final SubLObject var26, final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        if (var24.isString()) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var28), $g5009$.getDynamicValue(var28), var24);
        }
        if (var25.isString()) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var28), $g5010$.getDynamicValue(var28), var25);
        }
        if (var26.isString()) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var28), $g5011$.getDynamicValue(var28), var26);
        }
        if (var27.isString()) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var28), $g5012$.getDynamicValue(var28), var27);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39193(SubLObject var32, SubLObject var33) {
        if (var32 == UNPROVIDED) {
            var32 = (SubLObject)NIL;
        }
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        final SubLThread var34 = SubLProcess.currentSubLThread();
        if (NIL == var32) {
            return Sequences.cconcatenate($g5016$.getDynamicValue(var34), $g5017$.getDynamicValue(var34));
        }
        if (NIL != var33) {
            return Sequences.cconcatenate($g5016$.getDynamicValue(var34), new SubLObject[] { $ic45$, var32, $ic45$, $g5017$.getDynamicValue(var34) });
        }
        return Sequences.cconcatenate($g5016$.getDynamicValue(var34), new SubLObject[] { var32, $g5017$.getDynamicValue(var34) });
    }
    
    public static SubLObject f39194(SubLObject var34, SubLObject var33) {
        if (var34 == UNPROVIDED) {
            var34 = (SubLObject)NIL;
        }
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        final SubLThread var35 = SubLProcess.currentSubLThread();
        if (NIL == var34) {
            return $g5015$.getDynamicValue(var35);
        }
        if (NIL != var33) {
            return Sequences.cconcatenate($g5015$.getDynamicValue(var35), new SubLObject[] { $ic45$, var34 });
        }
        return Sequences.cconcatenate($g5015$.getDynamicValue(var35), var34);
    }
    
    public static SubLObject f39195(SubLObject var2, SubLObject var35) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var35 == UNPROVIDED) {
            var35 = (SubLObject)NIL;
        }
        final SubLThread var36 = SubLProcess.currentSubLThread();
        if (NIL == var2) {
            return Sequences.cconcatenate($g5013$.getDynamicValue(var36), $g5014$.getDynamicValue(var36));
        }
        if (NIL != var35) {
            return Sequences.cconcatenate($g5013$.getDynamicValue(var36), new SubLObject[] { Strings.string((SubLObject)Characters.CHAR_newline), var2, Strings.string((SubLObject)Characters.CHAR_newline), $g5014$.getDynamicValue(var36) });
        }
        return Sequences.cconcatenate($g5013$.getDynamicValue(var36), new SubLObject[] { Strings.string((SubLObject)Characters.CHAR_newline), module0015.$g405$.getGlobalValue(), Strings.string((SubLObject)Characters.CHAR_newline), var2, Strings.string((SubLObject)Characters.CHAR_newline), f39194(module0015.$g406$.getGlobalValue(), (SubLObject)UNPROVIDED), Strings.string((SubLObject)Characters.CHAR_newline), $g5014$.getDynamicValue(var36) });
    }
    
    public static SubLObject f39196(final SubLObject var12, final SubLObject var36, SubLObject var37, SubLObject var38, SubLObject var39, SubLObject var40, SubLObject var41) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        if (var38 == UNPROVIDED) {
            var38 = (SubLObject)NIL;
        }
        if (var39 == UNPROVIDED) {
            var39 = (SubLObject)NIL;
        }
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)NIL;
        }
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)NIL;
        }
        SubLObject var42 = (SubLObject)$ic33$;
        if (NIL != var37) {
            var42 = var37;
            if (NIL != var38) {
                var42 = Sequences.cconcatenate(var42, new SubLObject[] { $ic46$, var38 });
                if (NIL != var39) {
                    var42 = Sequences.cconcatenate(var42, new SubLObject[] { $ic46$, var39 });
                    if (NIL != var40) {
                        var42 = Sequences.cconcatenate(var42, new SubLObject[] { $ic46$, var40 });
                        if (NIL != var41) {
                            var42 = Sequences.cconcatenate(var42, new SubLObject[] { $ic46$, var41 });
                        }
                    }
                }
            }
        }
        return Sequences.cconcatenate(var12, new SubLObject[] { $ic47$, var42, $ic48$, Strings.string((SubLObject)Characters.CHAR_newline), var36, Strings.string((SubLObject)Characters.CHAR_newline), $ic49$, Strings.string((SubLObject)Characters.CHAR_newline) });
    }
    
    public static SubLObject f39197() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic53$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g147$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic54$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0015.$g533$.currentBinding(var5);
        try {
            module0015.$g533$.bind((SubLObject)T, var5);
        }
        finally {
            module0015.$g533$.rebind(var6, var5);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        final SubLObject var7 = module0014.f657((SubLObject)$ic51$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var7);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic55$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var8 = module0015.$g533$.currentBinding(var5);
        try {
            module0015.$g533$.bind((SubLObject)T, var5);
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var8, var5);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39198(SubLObject var44) {
        var44 = Sequences.substitute((SubLObject)Characters.CHAR_quote, (SubLObject)Characters.CHAR_quotation, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var44 = Sequences.substitute((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_newline, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var44 = module0038.f2659((SubLObject)$ic56$, (SubLObject)$ic57$, var44, (SubLObject)UNPROVIDED);
        return var44;
    }
    
    public static SubLObject f39199() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(!$g5019$.getDynamicValue(var5).isInteger() || $g5019$.getDynamicValue(var5).numL((SubLObject)ZERO_INTEGER));
    }
    
    public static SubLObject f39200(final SubLObject var45, final SubLObject var46) {
        final SubLObject var47 = var45.rest();
        final SubLObject var49;
        final SubLObject var48 = var49 = var47;
        if (NIL != f39199()) {
            return (SubLObject)$ic58$;
        }
        return (SubLObject)ConsesLow.listS((SubLObject)$ic59$, (SubLObject)$ic60$, ConsesLow.append(var49, (SubLObject)NIL));
    }
    
    public static SubLObject f39201(final SubLObject var45, final SubLObject var46) {
        SubLObject var48;
        final SubLObject var47 = var48 = var45.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var48, var47, (SubLObject)$ic61$);
        final SubLObject var49 = var48.rest();
        var48 = var48.first();
        SubLObject var50 = (SubLObject)NIL;
        SubLObject var51 = var48;
        SubLObject var52 = (SubLObject)NIL;
        SubLObject var55_56 = (SubLObject)NIL;
        while (NIL != var51) {
            cdestructuring_bind.destructuring_bind_must_consp(var51, var47, (SubLObject)$ic61$);
            var55_56 = var51.first();
            var51 = var51.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var51, var47, (SubLObject)$ic61$);
            if (NIL == conses_high.member(var55_56, (SubLObject)$ic62$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var52 = (SubLObject)T;
            }
            if (var55_56 == $ic63$) {
                var50 = var51.first();
            }
            var51 = var51.rest();
        }
        if (NIL != var52 && NIL == var50) {
            cdestructuring_bind.cdestructuring_bind_error(var47, (SubLObject)$ic61$);
        }
        final SubLObject var53 = cdestructuring_bind.property_list_member((SubLObject)$ic64$, var48);
        final SubLObject var54 = (SubLObject)((NIL != var53) ? conses_high.cadr(var53) : NIL);
        final SubLObject var55 = cdestructuring_bind.property_list_member((SubLObject)$ic65$, var48);
        final SubLObject var56 = (SubLObject)((NIL != var55) ? conses_high.cadr(var55) : NIL);
        final SubLObject var57 = cdestructuring_bind.property_list_member((SubLObject)$ic66$, var48);
        final SubLObject var58 = (SubLObject)((NIL != var57) ? conses_high.cadr(var57) : NIL);
        final SubLObject var59 = cdestructuring_bind.property_list_member((SubLObject)$ic67$, var48);
        final SubLObject var60 = (SubLObject)((NIL != var59) ? conses_high.cadr(var59) : NIL);
        final SubLObject var61 = cdestructuring_bind.property_list_member((SubLObject)$ic68$, var48);
        final SubLObject var62 = (SubLObject)((NIL != var61) ? conses_high.cadr(var61) : NIL);
        final SubLObject var63 = cdestructuring_bind.property_list_member((SubLObject)$ic69$, var48);
        final SubLObject var64 = (SubLObject)((NIL != var63) ? conses_high.cadr(var63) : NIL);
        final SubLObject var65 = cdestructuring_bind.property_list_member((SubLObject)$ic70$, var48);
        final SubLObject var66 = (SubLObject)((NIL != var65) ? conses_high.cadr(var65) : NIL);
        final SubLObject var67 = cdestructuring_bind.property_list_member((SubLObject)$ic71$, var48);
        final SubLObject var68 = (SubLObject)((NIL != var67) ? conses_high.cadr(var67) : NIL);
        final SubLObject var69 = cdestructuring_bind.property_list_member((SubLObject)$ic72$, var48);
        final SubLObject var70 = (SubLObject)((NIL != var69) ? conses_high.cadr(var69) : NIL);
        final SubLObject var71;
        var48 = (var71 = var49);
        final SubLObject var72 = (SubLObject)$ic73$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic74$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var64), (SubLObject)ConsesLow.list((SubLObject)$ic59$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var72, (SubLObject)ConsesLow.list((SubLObject)$ic75$, var64, var66, var68, var70))), (SubLObject)ConsesLow.listS((SubLObject)$ic76$, (SubLObject)ConsesLow.listS((SubLObject)$ic64$, new SubLObject[] { var54, $ic65$, var56, $ic66$, var58, $ic67$, var60, $ic68$, var62, $ic77$, var72, $ic78$ }), ConsesLow.append(var71, (SubLObject)NIL))));
    }
    
    public static SubLObject f39202(final SubLObject var64, final SubLObject var66, final SubLObject var30, final SubLObject var69) {
        SubLObject var70 = (SubLObject)NIL;
        var70 = (SubLObject)ConsesLow.cons((SubLObject)$ic80$, var70);
        var70 = (SubLObject)ConsesLow.cons(f39198(var64), var70);
        var70 = (SubLObject)ConsesLow.cons((SubLObject)$ic57$, var70);
        if (var66.isString()) {
            var70 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic81$, f39198(var66)), var70);
        }
        if (var30.isInteger()) {
            var70 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic82$, var30), var70);
        }
        if (NIL != var69) {
            var70 = (SubLObject)ConsesLow.cons((SubLObject)$ic83$, var70);
        }
        var70 = (SubLObject)ConsesLow.cons((SubLObject)$ic84$, var70);
        return Functions.apply(Symbols.symbol_function((SubLObject)$ic85$), Sequences.nreverse(var70));
    }
    
    public static SubLObject f39203(SubLObject var72, final SubLObject var73) {
        SubLObject var74 = var73;
        SubLObject var75 = (SubLObject)NIL;
        var75 = var74.first();
        while (NIL != var74) {
            SubLObject var77;
            final SubLObject var76 = var77 = var75;
            SubLObject var78 = (SubLObject)NIL;
            SubLObject var79 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var77, var76, (SubLObject)$ic86$);
            var78 = var77.first();
            var77 = (var79 = var77.rest());
            if (var79.isList()) {
                var79 = var79.first();
            }
            var72 = f39204(var72, var78, var79);
            var74 = var74.rest();
            var75 = var74.first();
        }
        return var72;
    }
    
    public static SubLObject f39204(final SubLObject var72, final SubLObject var78, final SubLObject var79) {
        return module0038.f2659(var79, var78, var72, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39205(final SubLObject var23, final SubLObject var80, final SubLObject var81) {
        final SubLThread var82 = SubLProcess.currentSubLThread();
        if (NIL == module0015.f707(var80)) {
            Errors.warn((SubLObject)$ic87$, var80);
        }
        SubLObject var83 = (SubLObject)NIL;
        if (var80.isSymbol()) {
            var83 = Strings.string_downcase(Symbols.symbol_name(var80), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            var83 = Strings.string_downcase(module0038.f2624(var83), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        $g5020$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var23, var83, var81), $g5020$.getDynamicValue(var82)), var82);
        return var23;
    }
    
    public static SubLObject f39206(final SubLObject var83) {
        final SubLThread var84 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var85 = module0015.$g533$.currentBinding(var84);
        try {
            module0015.$g533$.bind((SubLObject)T, var84);
            SubLObject var86 = var83;
            SubLObject var87 = (SubLObject)NIL;
            var87 = var86.first();
            while (NIL != var86) {
                SubLObject var89;
                final SubLObject var88 = var89 = var87;
                SubLObject var90 = (SubLObject)NIL;
                SubLObject var91 = (SubLObject)NIL;
                SubLObject var92 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)$ic88$);
                var90 = var89.first();
                var89 = var89.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)$ic88$);
                var91 = var89.first();
                var89 = var89.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)$ic88$);
                var92 = var89.first();
                var89 = var89.rest();
                if (NIL == var89) {
                    PrintLow.format(module0015.$g131$.getDynamicValue(var84), (SubLObject)$ic89$, new SubLObject[] { var90, var91, var92 });
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var88, (SubLObject)$ic88$);
                }
                var86 = var86.rest();
                var87 = var86.first();
            }
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var85, var84);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return var83;
    }
    
    public static SubLObject f39207(final SubLObject var45, final SubLObject var46) {
        final SubLObject var47 = var45.rest();
        final SubLObject var49;
        final SubLObject var48 = var49 = var47;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic59$, (SubLObject)$ic90$, ConsesLow.append(var49, (SubLObject)$ic91$));
    }
    
    public static SubLObject f39208() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0015.$g533$.currentBinding(var5);
        try {
            module0015.$g533$.bind((SubLObject)T, var5);
            PrintLow.format(module0015.$g131$.getDynamicValue(var5), $g5021$.getDynamicValue(var5));
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var6, var5);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39209(final SubLObject var22, final SubLObject var89, final SubLObject var90, final SubLObject var1) {
        final SubLThread var91 = SubLProcess.currentSubLThread();
        final SubLObject var92 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic93$, new SubLObject[] { var89, var90, var1 });
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var92);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var93 = module0015.$g533$.currentBinding(var91);
        try {
            module0015.$g533$.bind((SubLObject)T, var91);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var93, var91);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39210() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0015.$g533$.currentBinding(var5);
        try {
            module0015.$g533$.bind((SubLObject)T, var5);
            module0642.f39019((SubLObject)$ic94$);
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var6, var5);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39211(SubLObject var22, SubLObject var12) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)$ic95$;
        }
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)$ic96$;
        }
        module0642.f39074(var22, var12, (SubLObject)$ic97$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39212(final SubLObject var91, SubLObject var92) {
        if (var92 == UNPROVIDED) {
            var92 = (SubLObject)$ic99$;
        }
        final SubLObject var93 = Sequences.cconcatenate((SubLObject)$ic100$, new SubLObject[] { var92, $ic100$, module0038.f2624(Time.get_universal_time()), $ic100$, module0038.f2624(random.random((SubLObject)$ic101$)) });
        final SubLObject var94 = Sequences.cconcatenate(var91, new SubLObject[] { var93, $ic102$ });
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g311$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var91) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var91);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var91) {
            module0642.f39020(module0015.$g302$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var91);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var93) {
            module0642.f39020(module0015.$g308$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var93);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g307$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic33$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g317$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var94) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var94);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var94) {
            module0642.f39020(module0015.$g302$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var94);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g307$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic103$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g303$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0016.f901(var94, (SubLObject)$ic104$, (SubLObject)UNPROVIDED);
        return var93;
    }
    
    public static SubLObject f39213() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0015.$g533$.currentBinding(var5);
        try {
            module0015.$g533$.bind((SubLObject)T, var5);
            module0642.f39020($g5022$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var6, var5);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39214(final SubLObject var95) {
        SubLObject var96 = (SubLObject)NIL;
        SubLObject var97 = (SubLObject)NIL;
        try {
            var97 = streams_high.make_private_string_output_stream();
            PrintLow.format(var97, (SubLObject)$ic105$);
            SubLObject var98 = var95;
            SubLObject var99 = (SubLObject)NIL;
            var99 = var98.first();
            while (NIL != var98) {
                if (!var99.eql(var95.first())) {
                    print_high.princ((SubLObject)$ic106$, var97);
                }
                PrintLow.format(var97, (SubLObject)$ic107$, var99);
                var98 = var98.rest();
                var99 = var98.first();
            }
            print_high.princ((SubLObject)$ic108$, var97);
            var96 = streams_high.get_output_stream_string(var97);
        }
        finally {
            final SubLObject var100 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                streams_high.close(var97, (SubLObject)UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var100);
            }
        }
        return var96;
    }
    
    public static SubLObject f39215() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0015.$g533$.currentBinding(var5);
        try {
            module0015.$g533$.bind((SubLObject)T, var5);
            PrintLow.format(module0015.$g131$.getDynamicValue(var5), $g5025$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var6, var5);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39216(SubLObject var98, SubLObject var30, SubLObject var99, SubLObject var100, SubLObject var101, SubLObject var102) {
        if (var98 == UNPROVIDED) {
            var98 = (SubLObject)$ic111$;
        }
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)$ic112$;
        }
        if (var99 == UNPROVIDED) {
            var99 = (SubLObject)$ic113$;
        }
        if (var100 == UNPROVIDED) {
            var100 = (SubLObject)$ic114$;
        }
        if (var101 == UNPROVIDED) {
            var101 = (SubLObject)$ic113$;
        }
        if (var102 == UNPROVIDED) {
            var102 = (SubLObject)NIL;
        }
        return Sequences.cconcatenate((SubLObject)$ic115$, new SubLObject[] { module0006.f203(var98), $ic116$, module0006.f203(var30), $ic116$, module0006.f203(var99), $ic116$, module0006.f203(var100), $ic116$, module0006.f203(var101), $ic116$, module0006.f203((SubLObject)((NIL != var102) ? $ic117$ : $ic118$)), $ic119$ });
    }
    
    public static SubLObject f39217() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0014.f657((SubLObject)$ic120$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var6);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic55$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var7 = module0015.$g533$.currentBinding(var5);
        try {
            module0015.$g533$.bind((SubLObject)T, var5);
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var7, var5);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39218() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39219() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39174", "S#42918", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39175", "S#42919", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39176", "CB-BACK", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39178", "S#42920", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39179", "S#42921", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39180", "S#42922", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39181", "S#42923", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39182", "S#42924", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39183", "S#42925", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39184", "S#42926", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39185", "S#42927", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39186", "S#42928", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39187", "S#42748", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39188", "S#42747", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39189", "S#42929", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39177", "S#42930", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39190", "S#42931", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39192", "S#42932", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39191", "S#42933", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39193", "S#42934", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39194", "S#42935", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39195", "S#42936", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39196", "S#42937", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39197", "S#42938", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39198", "S#42939", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39199", "S#42940", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0644", "f39200", "S#42941");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0644", "f39201", "S#42942");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39202", "S#42943", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39203", "S#42944", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39204", "S#42945", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39205", "S#42946", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39206", "S#42947", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0644", "f39207", "S#42948");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39208", "S#42949", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39209", "S#42950", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39210", "S#42951", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39211", "S#42952", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39212", "S#42953", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39213", "S#42954", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39214", "S#42955", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39215", "S#42956", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39216", "S#42957", 0, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39217", "S#42958", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0644", "f39218", "S#42959", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39220() {
        $g4990$ = SubLFiles.defparameter("S#42960", (SubLObject)$ic0$);
        $g4991$ = SubLFiles.defparameter("S#42961", (SubLObject)$ic1$);
        $g4992$ = SubLFiles.defparameter("S#42962", (SubLObject)$ic7$);
        $g4993$ = SubLFiles.defparameter("S#42963", (SubLObject)$ic9$);
        $g4994$ = SubLFiles.defparameter("S#42964", (SubLObject)$ic10$);
        $g4995$ = SubLFiles.defparameter("S#42965", (SubLObject)$ic12$);
        $g4996$ = SubLFiles.defparameter("S#42966", (SubLObject)$ic14$);
        $g4997$ = SubLFiles.defparameter("S#42967", (SubLObject)$ic15$);
        $g4998$ = SubLFiles.defparameter("S#42968", (SubLObject)$ic16$);
        $g4999$ = SubLFiles.deflexical("S#42969", (SubLObject)$ic18$);
        $g5000$ = SubLFiles.deflexical("S#42970", (SubLObject)$ic20$);
        $g5001$ = SubLFiles.defparameter("S#42971", (SubLObject)$ic22$);
        $g5002$ = SubLFiles.defparameter("S#42972", (SubLObject)$ic23$);
        $g5003$ = SubLFiles.deflexical("S#42973", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic24$)) ? $g5003$.getGlobalValue() : $ic25$));
        $g5004$ = SubLFiles.defparameter("S#42974", (SubLObject)$ic26$);
        $g5005$ = SubLFiles.defparameter("S#42975", (SubLObject)$ic29$);
        $g5006$ = SubLFiles.defparameter("S#42976", (SubLObject)$ic30$);
        $g5007$ = SubLFiles.defparameter("S#42977", (SubLObject)$ic31$);
        $g5008$ = SubLFiles.defparameter("S#42978", (SubLObject)$ic32$);
        $g5009$ = SubLFiles.defparameter("S#42979", (SubLObject)$ic36$);
        $g5010$ = SubLFiles.defparameter("S#42980", (SubLObject)$ic37$);
        $g5011$ = SubLFiles.defparameter("S#42981", (SubLObject)$ic38$);
        $g5012$ = SubLFiles.defparameter("S#42982", (SubLObject)$ic39$);
        $g5013$ = SubLFiles.defparameter("S#42983", (SubLObject)$ic40$);
        $g5014$ = SubLFiles.defparameter("S#42984", (SubLObject)$ic41$);
        $g5015$ = SubLFiles.defparameter("S#42985", (SubLObject)$ic42$);
        $g5016$ = SubLFiles.defparameter("S#42986", (SubLObject)$ic43$);
        $g5017$ = SubLFiles.defparameter("S#42987", (SubLObject)$ic44$);
        $g5018$ = SubLFiles.defparameter("S#42988", (SubLObject)T);
        $g5019$ = SubLFiles.defparameter("S#42989", (SubLObject)ZERO_INTEGER);
        $g5020$ = SubLFiles.defparameter("S#42990", (SubLObject)NIL);
        $g5021$ = SubLFiles.defparameter("S#42991", (SubLObject)$ic92$);
        $g5022$ = SubLFiles.deflexical("S#42992", (SubLObject)$ic98$);
        $g5023$ = SubLFiles.deflexical("S#42993", (SubLObject)$ic109$);
        $g5024$ = SubLFiles.deflexical("S#42994", (SubLObject)ConsesLow.list($g5023$.getGlobalValue()));
        $g5025$ = SubLFiles.deflexical("S#42995", (SubLObject)$ic110$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39221() {
        module0012.f441((SubLObject)$ic2$);
        module0012.f444((SubLObject)$ic2$);
        module0015.f873((SubLObject)$ic6$);
        module0003.f57((SubLObject)$ic24$);
        module0012.f441((SubLObject)$ic50$);
        module0012.f444((SubLObject)$ic50$);
        Hashtables.sethash((SubLObject)$ic51$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic52$, (SubLObject)NIL));
        module0002.f50((SubLObject)$ic75$, (SubLObject)$ic79$);
        Hashtables.sethash((SubLObject)$ic120$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic121$, (SubLObject)NIL));
        return (SubLObject)NIL;
    }
    
    @Override
    public void declareFunctions() {
        f39219();
    }
    
    @Override
    public void initializeVariables() {
        f39220();
    }
    
    @Override
    public void runTopLevelForms() {
        f39221();
    }
    
    static {
        me = (SubLFile)new module0644();
        $g4990$ = null;
        $g4991$ = null;
        $g4992$ = null;
        $g4993$ = null;
        $g4994$ = null;
        $g4995$ = null;
        $g4996$ = null;
        $g4997$ = null;
        $g4998$ = null;
        $g4999$ = null;
        $g5000$ = null;
        $g5001$ = null;
        $g5002$ = null;
        $g5003$ = null;
        $g5004$ = null;
        $g5005$ = null;
        $g5006$ = null;
        $g5007$ = null;
        $g5008$ = null;
        $g5009$ = null;
        $g5010$ = null;
        $g5011$ = null;
        $g5012$ = null;
        $g5013$ = null;
        $g5014$ = null;
        $g5015$ = null;
        $g5016$ = null;
        $g5017$ = null;
        $g5018$ = null;
        $g5019$ = null;
        $g5020$ = null;
        $g5021$ = null;
        $g5022$ = null;
        $g5023$ = null;
        $g5024$ = null;
        $g5025$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeKeyword("JAVASCRIPT"));
        $ic1$ = makeKeyword("JAVASCRIPT");
        $ic2$ = makeSymbol("S#42961", "CYC");
        $ic3$ = makeSymbol("STRINGP");
        $ic4$ = makeString("cb-back");
        $ic5$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic6$ = makeSymbol("CB-BACK");
        $ic7$ = makeString("onClick=\"top.close();\"");
        $ic8$ = makeString("Dismiss");
        $ic9$ = makeString("onClick=\"top.close(); return false;\"");
        $ic10$ = makeString("onClick=\"self.history.back();\"");
        $ic11$ = makeString("Back");
        $ic12$ = makeString("onClick=\"self.location = self.document.location;\"");
        $ic13$ = makeString("Refresh");
        $ic14$ = makeString("onClick=\"self.location = self.document.location; return false;\"");
        $ic15$ = makeString("\nfor (var i = 0; i < top.frames.length; i++) {\n  var frame = top.frames[i];\n  if (frame.name == '~A') {\n    frame.location = frame.document.location;\n    break;\n  }\n}");
        $ic16$ = makeString("onClick=\"with (this.form.elements['~A']){value = ''; focus();}\"");
        $ic17$ = makeString("Clear");
        $ic18$ = makeString("onClick=\"with (this.form.elements['~A']){value = value + ' ' + '~A'; focus();}\"");
        $ic19$ = makeString("Insert");
        $ic20$ = makeString("onClick=\"with (this.form.elements['~A']){value = '~A';}; this.form.submit();\"");
        $ic21$ = makeString("Paste");
        $ic22$ = makeString("onClick=\"with (this.form.elements['~A']){value = '';}\"");
        $ic23$ = makeString("onClick=\"with (this.form.elements['~A']){focus();}\"");
        $ic24$ = makeSymbol("S#42973", "CYC");
        $ic25$ = makeString("onkeypress=\"this.form.~A[~A].checked=true\"");
        $ic26$ = makeString("onLoad=\"setTimeout('self.history.back()', ~A);\"");
        $ic27$ = makeInteger(2000);
        $ic28$ = makeSymbol("INTEGERP");
        $ic29$ = makeString("\nonClick=\"");
        $ic30$ = makeString("\nthis.form.submit();\"");
        $ic31$ = makeString("\nonFocus=\"");
        $ic32$ = makeString("\"");
        $ic33$ = makeString("");
        $ic34$ = makeString("width:");
        $ic35$ = makeString("inputBox");
        $ic36$ = makeString("\nthis.form.elements[0].name = '~A';");
        $ic37$ = makeString("\nthis.form.action = '~A';");
        $ic38$ = makeString("\nthis.form.method = '~A';");
        $ic39$ = makeString("\nthis.form.target = '~A';");
        $ic40$ = makeString("<script language=\"javascript\">");
        $ic41$ = makeString("</script>");
        $ic42$ = makeString("//");
        $ic43$ = makeString("");
        $ic44$ = makeString("\n");
        $ic45$ = makeString(" ");
        $ic46$ = makeString(", ");
        $ic47$ = makeString(" (");
        $ic48$ = makeString(") {");
        $ic49$ = makeString("}");
        $ic50$ = makeSymbol("S#42988", "CYC");
        $ic51$ = makeKeyword("OVERLIB");
        $ic52$ = makeString("overlib.js");
        $ic53$ = makeString("overDiv");
        $ic54$ = makeString("position:absolute; visibility:hidden; z-index:1000;");
        $ic55$ = makeString("text/javascript");
        $ic56$ = makeString("\\'");
        $ic57$ = makeString("'");
        $ic58$ = ConsesLow.list((SubLObject)makeSymbol("PROGN"));
        $ic59$ = makeSymbol("CLET");
        $ic60$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42989", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("-"), (SubLObject)makeSymbol("S#42989", "CYC"), (SubLObject)ONE_INTEGER)));
        $ic61$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { makeSymbol("&KEY"), makeSymbol("S#1529", "CYC"), makeSymbol("S#29", "CYC"), makeSymbol("S#1553", "CYC"), makeSymbol("S#1512", "CYC"), makeSymbol("S#1520", "CYC"), makeSymbol("S#42996", "CYC"), makeSymbol("S#1633", "CYC"), makeSymbol("S#896", "CYC"), makeSymbol("S#42997", "CYC") }), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic62$ = ConsesLow.list(new SubLObject[] { makeKeyword("HREF"), makeKeyword("NAME"), makeKeyword("TARGET"), makeKeyword("SCRIPT"), makeKeyword("STYLE"), makeKeyword("HOVEROVER-HTML"), makeKeyword("CAPTION"), makeKeyword("WIDTH"), makeKeyword("STICKY") });
        $ic63$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic64$ = makeKeyword("HREF");
        $ic65$ = makeKeyword("NAME");
        $ic66$ = makeKeyword("TARGET");
        $ic67$ = makeKeyword("SCRIPT");
        $ic68$ = makeKeyword("STYLE");
        $ic69$ = makeKeyword("HOVEROVER-HTML");
        $ic70$ = makeKeyword("CAPTION");
        $ic71$ = makeKeyword("WIDTH");
        $ic72$ = makeKeyword("STICKY");
        $ic73$ = makeUninternedSymbol("US#32B84A1");
        $ic74$ = makeSymbol("PWHEN");
        $ic75$ = makeSymbol("S#42943", "CYC");
        $ic76$ = makeSymbol("S#1039", "CYC");
        $ic77$ = makeKeyword("ONMOUSEOVER");
        $ic78$ = ConsesLow.list((SubLObject)makeKeyword("ONMOUSEOUT"), (SubLObject)makeString("nd();"));
        $ic79$ = makeSymbol("S#42942", "CYC");
        $ic80$ = makeString("return overlib('");
        $ic81$ = makeString(",CAPTION,'~A'");
        $ic82$ = makeString(",WIDTH,~A");
        $ic83$ = makeString(",STICKY");
        $ic84$ = makeString(")");
        $ic85$ = makeSymbol("CCONCATENATE");
        $ic86$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#32", "CYC"), (SubLObject)makeSymbol("S#42661", "CYC"));
        $ic87$ = makeString("Odd event handler ~S -- is this a known DOM event?");
        $ic88$ = ConsesLow.list((SubLObject)makeSymbol("S#1519", "CYC"), (SubLObject)makeSymbol("S#42998", "CYC"), (SubLObject)makeSymbol("S#734", "CYC"));
        $ic89$ = makeString("~%document.getElementById('~A').~A = ~A;");
        $ic90$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42990", "CYC"), (SubLObject)NIL));
        $ic91$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42947", "CYC"), (SubLObject)makeSymbol("S#42990", "CYC")));
        $ic92$ = makeString("\n\nfunction set_all_radio_buttons(form, pattern, value) {\n  var re = new RegExp(pattern);\n  for (i = 0 ; i < form.elements.length ; i++) {\n    var field = form.elements[i]; \n    if (re.test(field.name)) {\n      if (field.value == value) {\n\tfield.checked = true;\n      } else {\n        field.checked = false;\n      }\n    }\n  } \n}");
        $ic93$ = makeString("javascript: void set_all_radio_buttons(~a, '~a', '~a')");
        $ic94$ = makeString("window.focus()");
        $ic95$ = makeString("Close Window");
        $ic96$ = makeKeyword("CLOSE-WINDOW");
        $ic97$ = makeString("onClick=javascript:self.close()");
        $ic98$ = makeString("\nfunction load_simple_applet_parameters (applet_name) {\n  applets=document.getElementsByTagName('applet');\n  size = applets.length; \n  for (j=0; j < size; j++) {\n    curApplet = applets.item(j);\n    name = curApplet.getAttribute('name');\n    loc = name.lastIndexOf('-' + applet_name + '-');\n    if (loc >= 0) {\n      prefix = name.substring(0, loc);\n      input = document.getElementById(prefix);\n      if (input == null) { continue; }\n      previousInput = document.getElementById(name + '-previous-value');\n      appletValue = '';\n      is_active = false;\n      try { is_active = curApplet.isActive(); } catch (e) {}\n      if (!is_active) {\n        updateDom();\n        try { is_active = curApplet.isActive(); } catch (e) {}\n      }\n      if (is_active) {\n        input.value = appletValue = curApplet.toString();\n      }\n      if (previousInput != null) {\n        previousInput.value = appletValue;\n      }\n    }\n  }\n}\n\nfunction simple_applet_form_submit_method (applet_names) {\n  for (i=0; i < applet_names.length; i++) {\n    applet_name = applet_names[i];\n    load_simple_applet_parameters(applet_name);\n  }\n  return true;\n}\n\nfunction updateDom() {\n  window.resizeBy(0, -1);\n  window.resizeBy(0, 1);\n}\n\nfunction loadPreviousGKEAppletParameter() {\n  applets=document.getElementsByTagName('applet');\n  size = applets.length; \n  shouldJiggle = true;\n  for (j=0; j < size; j++) {\n    curApplet = applets.item(j);\n    name = curApplet.getAttribute('name');\n    previousInput = document.getElementById(name + '-previous-value');\n    loc = name.lastIndexOf('-GKE-APPLET-');\n    if (loc < 0) { continue; }\n    value = previousInput.value;\n    if (value == '>>>>>>>UNSET<<<<<<<') { continue; }\n    loadPreviousValue(name, value, shouldJiggle, 16, 250);\n    shouldJiggle = false;\n  }\n}\n\nfunction loadPreviousValue(appletId, prevValue, shouldUpdateDom, count, delay) { \n  if (count <= 0) { return; }\n  curApplet = document.getElementById(appletId);\n  value = curApplet.toString();\n  if (curApplet == null) { return; }\n  if (value == '[object HTMLAppletElement]') {\n    if (shouldUpdateDom) { updateDom(); }\n    self.setTimeout('loadPreviousValue(\"' + appletId + \n                    '\", ' + '\"' + prevValue + '\"' + \n                    ', false, ' + (count-1) + ', ' + delay + ')', delay);\n    return;\n  }\n  try {\n    //alert('Trying to set previous value: ' + prevValue);\n    curApplet.showStatus('PREVIOUS VALUE: ' + prevValue);\n  } catch (e) {\n    self.setTimeout('loadPreviousValue(\"' + appletId + \n                    '\", ' + '\"' + prevValue + '\"' + \n                    ', false, ' + (count-1) + ', ' + delay + ')', delay);\n  }\n}\n\nwindow.onload = loadPreviousGKEAppletParameter;\n\n");
        $ic99$ = makeString("APPLET");
        $ic100$ = makeString("-");
        $ic101$ = makeInteger(30000);
        $ic102$ = makeString("-previous-value");
        $ic103$ = makeString(">>>>>>>UNSET<<<<<<<");
        $ic104$ = makeKeyword("INVISIBLE");
        $ic105$ = makeString("onSubmit=\"return simple_applet_form_submit_method(new Array(");
        $ic106$ = makeString(" ,");
        $ic107$ = makeString("'~A'");
        $ic108$ = makeString("))\"");
        $ic109$ = makeString("GKE-APPLET");
        $ic110$ = makeString("var popupWindow = null;\n  function positionedPopup(url,winName,w,h,t,l,scroll){\n  settings =\n  'height='+h+',width='+w+',top='+t+',left='+l+',scrollbars='+scroll+',resizable=yes,location=no';\n  popupWindow = window.open(url,winName,settings)\n  }");
        $ic111$ = makeString("popup");
        $ic112$ = makeInteger(500);
        $ic113$ = makeInteger(300);
        $ic114$ = makeInteger(100);
        $ic115$ = makeString("positionedPopup(this.href, '");
        $ic116$ = makeString("', '");
        $ic117$ = makeString("yes");
        $ic118$ = makeString("no");
        $ic119$ = makeString("'); return false;");
        $ic120$ = makeKeyword("CB-SENTENCE-EDITOR");
        $ic121$ = makeString("cb-sentence-editor.js");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 351 ms
	
	
	Decompiled with Procyon 0.5.32.
*/