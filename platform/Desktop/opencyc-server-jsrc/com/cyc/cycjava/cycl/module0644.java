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
        if (var3 == module0644.UNPROVIDED) {
            var3 = (SubLObject)module0644.NIL;
        }
        if (var4 == module0644.UNPROVIDED) {
            var4 = (SubLObject)module0644.NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert module0644.NIL != Types.stringp(var1) : var1;
        assert module0644.NIL != Types.stringp(var2) : var2;
        if (module0644.NIL != module0015.$g541$.getDynamicValue(var5)) {
            module0642.f39020(module0015.$g295$.getGlobalValue());
            module0642.f39020(module0015.$g305$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
            module0642.f39020(module0015.$g310$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
            if (module0644.NIL != var1) {
                module0642.f39020(module0015.$g307$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
                module0642.f39019(var1);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
            }
            module0642.f39032((SubLObject)module0644.ONE_INTEGER);
            PrintLow.format(module0015.$g131$.getDynamicValue(var5), var2, var3, var4);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0644.UNPROVIDED);
        }
        else {
            module0642.f39020(module0015.$g282$.getGlobalValue());
            module0642.f39020(module0015.$g284$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
            module0642.f39020(module0110.$g570$.getDynamicValue(var5));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0644.UNPROVIDED);
            final SubLObject var6 = module0015.$g533$.currentBinding(var5);
            final SubLObject var7 = module0015.$g541$.currentBinding(var5);
            final SubLObject var8 = module0015.$g539$.currentBinding(var5);
            try {
                module0015.$g533$.bind((SubLObject)module0644.T, var5);
                module0015.$g541$.bind((SubLObject)module0644.T, var5);
                module0015.$g539$.bind(module0015.f797(), var5);
                module0642.f39020(module0015.$g295$.getGlobalValue());
                module0642.f39020(module0015.$g305$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
                module0642.f39020(module0015.$g310$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
                if (module0644.NIL != var1) {
                    module0642.f39020(module0015.$g307$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
                    module0642.f39019(var1);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
                }
                module0642.f39032((SubLObject)module0644.ONE_INTEGER);
                PrintLow.format(module0015.$g131$.getDynamicValue(var5), var2, var3, var4);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0644.UNPROVIDED);
                module0015.f799(module0015.$g539$.getDynamicValue(var5));
            }
            finally {
                module0015.$g539$.rebind(var8, var5);
                module0015.$g541$.rebind(var7, var5);
                module0015.$g533$.rebind(var6, var5);
            }
            module0642.f39020(module0015.$g283$.getGlobalValue());
        }
        return (SubLObject)module0644.NIL;
    }
    
    public static SubLObject f39175(final SubLObject var9, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0644.UNPROVIDED) {
            var3 = (SubLObject)module0644.NIL;
        }
        if (var4 == module0644.UNPROVIDED) {
            var4 = (SubLObject)module0644.NIL;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        assert module0644.NIL != Types.stringp(var9) : var9;
        assert module0644.NIL != Types.stringp(var2) : var2;
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0656.f39788((SubLObject)module0644.$ic4$, (SubLObject)module0644.UNPROVIDED, (SubLObject)module0644.UNPROVIDED, (SubLObject)module0644.UNPROVIDED, (SubLObject)module0644.UNPROVIDED, (SubLObject)module0644.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39032((SubLObject)module0644.ONE_INTEGER);
        PrintLow.format(module0015.$g131$.getDynamicValue(var10), var2, var3, var4);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0644.UNPROVIDED);
        final SubLObject var11 = module0015.$g533$.currentBinding(var10);
        try {
            module0015.$g533$.bind((SubLObject)module0644.T, var10);
            module0642.f39020(var9);
        }
        finally {
            module0015.$g533$.rebind(var11, var10);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0644.NIL;
    }
    
    public static SubLObject f39176(SubLObject var10) {
        if (var10 == module0644.UNPROVIDED) {
            var10 = (SubLObject)module0644.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)module0644.$ic5$);
        module0642.f39029((SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        final SubLObject var12 = module0015.$g535$.currentBinding(var11);
        try {
            module0015.$g535$.bind((SubLObject)module0644.T, var11);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39032((SubLObject)module0644.ONE_INTEGER);
            f39177((SubLObject)module0644.ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0644.UNPROVIDED);
            final SubLObject var6_11 = module0015.$g533$.currentBinding(var11);
            try {
                module0015.$g533$.bind((SubLObject)module0644.T, var11);
                module0642.f39029((SubLObject)module0644.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var6_11, var11);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0644.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var12, var11);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0644.UNPROVIDED);
        return (SubLObject)module0644.NIL;
    }
    
    public static SubLObject f39178(SubLObject var1) {
        if (var1 == module0644.UNPROVIDED) {
            var1 = (SubLObject)module0644.$ic8$;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return f39174(var1, module0644.$g4992$.getDynamicValue(var2), (SubLObject)module0644.UNPROVIDED, (SubLObject)module0644.UNPROVIDED);
    }
    
    public static SubLObject f39179(SubLObject var9) {
        if (var9 == module0644.UNPROVIDED) {
            var9 = (SubLObject)module0644.$ic8$;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        return f39175(var9, module0644.$g4993$.getDynamicValue(var10), (SubLObject)module0644.UNPROVIDED, (SubLObject)module0644.UNPROVIDED);
    }
    
    public static SubLObject f39180(SubLObject var1) {
        if (var1 == module0644.UNPROVIDED) {
            var1 = (SubLObject)module0644.$ic11$;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return f39174(var1, module0644.$g4994$.getDynamicValue(var2), (SubLObject)module0644.UNPROVIDED, (SubLObject)module0644.UNPROVIDED);
    }
    
    public static SubLObject f39181(SubLObject var1) {
        if (var1 == module0644.UNPROVIDED) {
            var1 = (SubLObject)module0644.$ic13$;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return f39174(var1, module0644.$g4995$.getDynamicValue(var2), (SubLObject)module0644.UNPROVIDED, (SubLObject)module0644.UNPROVIDED);
    }
    
    public static SubLObject f39182(SubLObject var9) {
        if (var9 == module0644.UNPROVIDED) {
            var9 = (SubLObject)module0644.$ic13$;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        return f39175(var9, module0644.$g4996$.getDynamicValue(var10), (SubLObject)module0644.UNPROVIDED, (SubLObject)module0644.UNPROVIDED);
    }
    
    public static SubLObject f39183(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        assert module0644.NIL != Types.stringp(var12) : var12;
        module0642.f39029((SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0644.UNPROVIDED);
        final SubLObject var14 = module0015.$g533$.currentBinding(var13);
        try {
            module0015.$g533$.bind((SubLObject)module0644.T, var13);
            PrintLow.format(module0015.$g131$.getDynamicValue(var13), module0644.$g4997$.getDynamicValue(var13), var12);
            module0642.f39029((SubLObject)module0644.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var14, var13);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)module0644.NIL;
    }
    
    public static SubLObject f39184(final SubLObject var13, SubLObject var1) {
        if (var1 == module0644.UNPROVIDED) {
            var1 = (SubLObject)module0644.$ic17$;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert module0644.NIL != Types.stringp(var13) : var13;
        return f39174(var1, module0644.$g4998$.getDynamicValue(var14), var13, (SubLObject)module0644.UNPROVIDED);
    }
    
    public static SubLObject f39185(final SubLObject var13, final SubLObject var14, SubLObject var15) {
        if (var15 == module0644.UNPROVIDED) {
            var15 = (SubLObject)module0644.$ic19$;
        }
        assert module0644.NIL != Types.stringp(var13) : var13;
        assert module0644.NIL != Types.stringp(var14) : var14;
        return f39174(var15, module0644.$g4999$.getGlobalValue(), var13, var14);
    }
    
    public static SubLObject f39186(final SubLObject var13, final SubLObject var14, SubLObject var15) {
        if (var15 == module0644.UNPROVIDED) {
            var15 = (SubLObject)module0644.$ic21$;
        }
        assert module0644.NIL != Types.stringp(var13) : var13;
        assert module0644.NIL != Types.stringp(var14) : var14;
        return f39174(var15, module0644.$g5000$.getGlobalValue(), var13, var14);
    }
    
    public static SubLObject f39187(final SubLObject var12, final SubLObject var16, SubLObject var1, SubLObject var17) {
        if (var1 == module0644.UNPROVIDED) {
            var1 = (SubLObject)module0644.NIL;
        }
        if (var17 == module0644.UNPROVIDED) {
            var17 = (SubLObject)module0644.NIL;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        assert module0644.NIL != Types.stringp(var12) : var12;
        assert module0644.NIL != Types.stringp(var16) : var16;
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g314$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        if (module0644.NIL != var12) {
            module0642.f39020(module0015.$g302$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
            module0642.f39020(var12);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        }
        if (module0644.NIL != var1) {
            module0642.f39020(module0015.$g307$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
            module0642.f39019(var1);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        }
        if (module0644.NIL != var17) {
            module0642.f39046(module0015.$g296$.getGlobalValue());
        }
        module0642.f39032((SubLObject)module0644.ONE_INTEGER);
        PrintLow.format(module0015.$g131$.getDynamicValue(var18), module0644.$g5001$.getDynamicValue(var18), var16);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0644.UNPROVIDED);
        return (SubLObject)module0644.NIL;
    }
    
    public static SubLObject f39188(final SubLObject var12, final SubLObject var18, SubLObject var1, SubLObject var17) {
        if (var1 == module0644.UNPROVIDED) {
            var1 = (SubLObject)module0644.NIL;
        }
        if (var17 == module0644.UNPROVIDED) {
            var17 = (SubLObject)module0644.NIL;
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        assert module0644.NIL != Types.stringp(var12) : var12;
        assert module0644.NIL != Types.stringp(var18) : var18;
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g314$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        if (module0644.NIL != var12) {
            module0642.f39020(module0015.$g302$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
            module0642.f39020(var12);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        }
        if (module0644.NIL != var1) {
            module0642.f39020(module0015.$g307$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
            module0642.f39019(var1);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        }
        if (module0644.NIL != var17) {
            module0642.f39046(module0015.$g296$.getGlobalValue());
        }
        module0642.f39032((SubLObject)module0644.ONE_INTEGER);
        PrintLow.format(module0015.$g131$.getDynamicValue(var19), module0644.$g5002$.getDynamicValue(var19), var18);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0644.UNPROVIDED);
        return (SubLObject)module0644.NIL;
    }
    
    public static SubLObject f39189(final SubLObject var19, final SubLObject var20) {
        return PrintLow.format((SubLObject)module0644.NIL, module0644.$g5003$.getGlobalValue(), var19, var20);
    }
    
    public static SubLObject f39177(SubLObject var21) {
        if (var21 == module0644.UNPROVIDED) {
            var21 = (SubLObject)module0644.$ic27$;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        assert module0644.NIL != Types.integerp(var21) : var21;
        PrintLow.format(module0015.$g131$.getDynamicValue(var22), module0644.$g5004$.getDynamicValue(var22), var21);
        return (SubLObject)module0644.NIL;
    }
    
    public static SubLObject f39190(final SubLObject var22, SubLObject var23, SubLObject var24, SubLObject var25, SubLObject var26, SubLObject var27, SubLObject var28) {
        if (var23 == module0644.UNPROVIDED) {
            var23 = (SubLObject)module0644.NIL;
        }
        if (var24 == module0644.UNPROVIDED) {
            var24 = (SubLObject)module0644.NIL;
        }
        if (var25 == module0644.UNPROVIDED) {
            var25 = (SubLObject)module0644.NIL;
        }
        if (var26 == module0644.UNPROVIDED) {
            var26 = (SubLObject)module0644.NIL;
        }
        if (var27 == module0644.UNPROVIDED) {
            var27 = (SubLObject)module0644.NIL;
        }
        if (var28 == module0644.UNPROVIDED) {
            var28 = (SubLObject)module0644.NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        assert module0644.NIL != Types.stringp(var22) : var22;
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g316$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g306$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020(var28);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        if (module0644.NIL != var23) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
            module0642.f39020(var23);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        }
        if (module0644.NIL != var22) {
            module0642.f39020(module0015.$g307$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
            module0642.f39019(var22);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        }
        module0642.f39032((SubLObject)module0644.ONE_INTEGER);
        PrintLow.format(module0015.$g131$.getDynamicValue(var29), module0644.$g5005$.getDynamicValue(var29));
        f39191(var24, var25, var26, var27);
        PrintLow.format(module0015.$g131$.getDynamicValue(var29), module0644.$g5006$.getDynamicValue(var29));
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0644.UNPROVIDED);
        return (SubLObject)module0644.NIL;
    }
    
    public static SubLObject f39192(final SubLObject var12, SubLObject var29, SubLObject var30, SubLObject var24, SubLObject var25, SubLObject var26, SubLObject var27) {
        if (var29 == module0644.UNPROVIDED) {
            var29 = (SubLObject)module0644.NIL;
        }
        if (var30 == module0644.UNPROVIDED) {
            var30 = (SubLObject)module0644.NIL;
        }
        if (var24 == module0644.UNPROVIDED) {
            var24 = (SubLObject)module0644.NIL;
        }
        if (var25 == module0644.UNPROVIDED) {
            var25 = (SubLObject)module0644.NIL;
        }
        if (var26 == module0644.UNPROVIDED) {
            var26 = (SubLObject)module0644.NIL;
        }
        if (var27 == module0644.UNPROVIDED) {
            var27 = (SubLObject)module0644.NIL;
        }
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (var29.equalp((SubLObject)module0644.$ic33$)) {
            var29 = (SubLObject)module0644.NIL;
        }
        final SubLObject var32 = Sequences.cconcatenate((SubLObject)module0644.$ic34$, module0006.f203(var30));
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g317$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g306$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020(var32);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020((SubLObject)module0644.$ic35$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        if (module0644.NIL != var12) {
            module0642.f39020(module0015.$g302$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
            module0642.f39020(var12);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        }
        if (module0644.NIL != var29) {
            module0642.f39020(module0015.$g307$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
            module0642.f39019(var29);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        }
        module0642.f39032((SubLObject)module0644.ONE_INTEGER);
        PrintLow.format(module0015.$g131$.getDynamicValue(var31), module0644.$g5007$.getDynamicValue(var31));
        f39191(var24, var25, var26, var27);
        PrintLow.format(module0015.$g131$.getDynamicValue(var31), module0644.$g5008$.getDynamicValue(var31));
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0644.UNPROVIDED);
        return (SubLObject)module0644.NIL;
    }
    
    public static SubLObject f39191(final SubLObject var24, final SubLObject var25, final SubLObject var26, final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        if (var24.isString()) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var28), module0644.$g5009$.getDynamicValue(var28), var24);
        }
        if (var25.isString()) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var28), module0644.$g5010$.getDynamicValue(var28), var25);
        }
        if (var26.isString()) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var28), module0644.$g5011$.getDynamicValue(var28), var26);
        }
        if (var27.isString()) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var28), module0644.$g5012$.getDynamicValue(var28), var27);
        }
        return (SubLObject)module0644.NIL;
    }
    
    public static SubLObject f39193(SubLObject var32, SubLObject var33) {
        if (var32 == module0644.UNPROVIDED) {
            var32 = (SubLObject)module0644.NIL;
        }
        if (var33 == module0644.UNPROVIDED) {
            var33 = (SubLObject)module0644.NIL;
        }
        final SubLThread var34 = SubLProcess.currentSubLThread();
        if (module0644.NIL == var32) {
            return Sequences.cconcatenate(module0644.$g5016$.getDynamicValue(var34), module0644.$g5017$.getDynamicValue(var34));
        }
        if (module0644.NIL != var33) {
            return Sequences.cconcatenate(module0644.$g5016$.getDynamicValue(var34), new SubLObject[] { module0644.$ic45$, var32, module0644.$ic45$, module0644.$g5017$.getDynamicValue(var34) });
        }
        return Sequences.cconcatenate(module0644.$g5016$.getDynamicValue(var34), new SubLObject[] { var32, module0644.$g5017$.getDynamicValue(var34) });
    }
    
    public static SubLObject f39194(SubLObject var34, SubLObject var33) {
        if (var34 == module0644.UNPROVIDED) {
            var34 = (SubLObject)module0644.NIL;
        }
        if (var33 == module0644.UNPROVIDED) {
            var33 = (SubLObject)module0644.NIL;
        }
        final SubLThread var35 = SubLProcess.currentSubLThread();
        if (module0644.NIL == var34) {
            return module0644.$g5015$.getDynamicValue(var35);
        }
        if (module0644.NIL != var33) {
            return Sequences.cconcatenate(module0644.$g5015$.getDynamicValue(var35), new SubLObject[] { module0644.$ic45$, var34 });
        }
        return Sequences.cconcatenate(module0644.$g5015$.getDynamicValue(var35), var34);
    }
    
    public static SubLObject f39195(SubLObject var2, SubLObject var35) {
        if (var2 == module0644.UNPROVIDED) {
            var2 = (SubLObject)module0644.NIL;
        }
        if (var35 == module0644.UNPROVIDED) {
            var35 = (SubLObject)module0644.NIL;
        }
        final SubLThread var36 = SubLProcess.currentSubLThread();
        if (module0644.NIL == var2) {
            return Sequences.cconcatenate(module0644.$g5013$.getDynamicValue(var36), module0644.$g5014$.getDynamicValue(var36));
        }
        if (module0644.NIL != var35) {
            return Sequences.cconcatenate(module0644.$g5013$.getDynamicValue(var36), new SubLObject[] { Strings.string((SubLObject)Characters.CHAR_newline), var2, Strings.string((SubLObject)Characters.CHAR_newline), module0644.$g5014$.getDynamicValue(var36) });
        }
        return Sequences.cconcatenate(module0644.$g5013$.getDynamicValue(var36), new SubLObject[] { Strings.string((SubLObject)Characters.CHAR_newline), module0015.$g405$.getGlobalValue(), Strings.string((SubLObject)Characters.CHAR_newline), var2, Strings.string((SubLObject)Characters.CHAR_newline), f39194(module0015.$g406$.getGlobalValue(), (SubLObject)module0644.UNPROVIDED), Strings.string((SubLObject)Characters.CHAR_newline), module0644.$g5014$.getDynamicValue(var36) });
    }
    
    public static SubLObject f39196(final SubLObject var12, final SubLObject var36, SubLObject var37, SubLObject var38, SubLObject var39, SubLObject var40, SubLObject var41) {
        if (var37 == module0644.UNPROVIDED) {
            var37 = (SubLObject)module0644.NIL;
        }
        if (var38 == module0644.UNPROVIDED) {
            var38 = (SubLObject)module0644.NIL;
        }
        if (var39 == module0644.UNPROVIDED) {
            var39 = (SubLObject)module0644.NIL;
        }
        if (var40 == module0644.UNPROVIDED) {
            var40 = (SubLObject)module0644.NIL;
        }
        if (var41 == module0644.UNPROVIDED) {
            var41 = (SubLObject)module0644.NIL;
        }
        SubLObject var42 = (SubLObject)module0644.$ic33$;
        if (module0644.NIL != var37) {
            var42 = var37;
            if (module0644.NIL != var38) {
                var42 = Sequences.cconcatenate(var42, new SubLObject[] { module0644.$ic46$, var38 });
                if (module0644.NIL != var39) {
                    var42 = Sequences.cconcatenate(var42, new SubLObject[] { module0644.$ic46$, var39 });
                    if (module0644.NIL != var40) {
                        var42 = Sequences.cconcatenate(var42, new SubLObject[] { module0644.$ic46$, var40 });
                        if (module0644.NIL != var41) {
                            var42 = Sequences.cconcatenate(var42, new SubLObject[] { module0644.$ic46$, var41 });
                        }
                    }
                }
            }
        }
        return Sequences.cconcatenate(var12, new SubLObject[] { module0644.$ic47$, var42, module0644.$ic48$, Strings.string((SubLObject)Characters.CHAR_newline), var36, Strings.string((SubLObject)Characters.CHAR_newline), module0644.$ic49$, Strings.string((SubLObject)Characters.CHAR_newline) });
    }
    
    public static SubLObject f39197() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020((SubLObject)module0644.$ic53$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g147$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020((SubLObject)module0644.$ic54$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0644.UNPROVIDED);
        final SubLObject var6 = module0015.$g533$.currentBinding(var5);
        try {
            module0015.$g533$.bind((SubLObject)module0644.T, var5);
        }
        finally {
            module0015.$g533$.rebind(var6, var5);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        final SubLObject var7 = module0014.f657((SubLObject)module0644.$ic51$);
        module0642.f39029((SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020(var7);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020((SubLObject)module0644.$ic55$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0644.UNPROVIDED);
        final SubLObject var8 = module0015.$g533$.currentBinding(var5);
        try {
            module0015.$g533$.bind((SubLObject)module0644.T, var5);
            module0642.f39029((SubLObject)module0644.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var8, var5);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)module0644.NIL;
    }
    
    public static SubLObject f39198(SubLObject var44) {
        var44 = Sequences.substitute((SubLObject)Characters.CHAR_quote, (SubLObject)Characters.CHAR_quotation, var44, (SubLObject)module0644.UNPROVIDED, (SubLObject)module0644.UNPROVIDED, (SubLObject)module0644.UNPROVIDED, (SubLObject)module0644.UNPROVIDED, (SubLObject)module0644.UNPROVIDED);
        var44 = Sequences.substitute((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_newline, var44, (SubLObject)module0644.UNPROVIDED, (SubLObject)module0644.UNPROVIDED, (SubLObject)module0644.UNPROVIDED, (SubLObject)module0644.UNPROVIDED, (SubLObject)module0644.UNPROVIDED);
        var44 = module0038.f2659((SubLObject)module0644.$ic56$, (SubLObject)module0644.$ic57$, var44, (SubLObject)module0644.UNPROVIDED);
        return var44;
    }
    
    public static SubLObject f39199() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(!module0644.$g5019$.getDynamicValue(var5).isInteger() || module0644.$g5019$.getDynamicValue(var5).numL((SubLObject)module0644.ZERO_INTEGER));
    }
    
    public static SubLObject f39200(final SubLObject var45, final SubLObject var46) {
        final SubLObject var47 = var45.rest();
        final SubLObject var49;
        final SubLObject var48 = var49 = var47;
        if (module0644.NIL != f39199()) {
            return (SubLObject)module0644.$ic58$;
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0644.$ic59$, (SubLObject)module0644.$ic60$, ConsesLow.append(var49, (SubLObject)module0644.NIL));
    }
    
    public static SubLObject f39201(final SubLObject var45, final SubLObject var46) {
        SubLObject var48;
        final SubLObject var47 = var48 = var45.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var48, var47, (SubLObject)module0644.$ic61$);
        final SubLObject var49 = var48.rest();
        var48 = var48.first();
        SubLObject var50 = (SubLObject)module0644.NIL;
        SubLObject var51 = var48;
        SubLObject var52 = (SubLObject)module0644.NIL;
        SubLObject var55_56 = (SubLObject)module0644.NIL;
        while (module0644.NIL != var51) {
            cdestructuring_bind.destructuring_bind_must_consp(var51, var47, (SubLObject)module0644.$ic61$);
            var55_56 = var51.first();
            var51 = var51.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var51, var47, (SubLObject)module0644.$ic61$);
            if (module0644.NIL == conses_high.member(var55_56, (SubLObject)module0644.$ic62$, (SubLObject)module0644.UNPROVIDED, (SubLObject)module0644.UNPROVIDED)) {
                var52 = (SubLObject)module0644.T;
            }
            if (var55_56 == module0644.$ic63$) {
                var50 = var51.first();
            }
            var51 = var51.rest();
        }
        if (module0644.NIL != var52 && module0644.NIL == var50) {
            cdestructuring_bind.cdestructuring_bind_error(var47, (SubLObject)module0644.$ic61$);
        }
        final SubLObject var53 = cdestructuring_bind.property_list_member((SubLObject)module0644.$ic64$, var48);
        final SubLObject var54 = (SubLObject)((module0644.NIL != var53) ? conses_high.cadr(var53) : module0644.NIL);
        final SubLObject var55 = cdestructuring_bind.property_list_member((SubLObject)module0644.$ic65$, var48);
        final SubLObject var56 = (SubLObject)((module0644.NIL != var55) ? conses_high.cadr(var55) : module0644.NIL);
        final SubLObject var57 = cdestructuring_bind.property_list_member((SubLObject)module0644.$ic66$, var48);
        final SubLObject var58 = (SubLObject)((module0644.NIL != var57) ? conses_high.cadr(var57) : module0644.NIL);
        final SubLObject var59 = cdestructuring_bind.property_list_member((SubLObject)module0644.$ic67$, var48);
        final SubLObject var60 = (SubLObject)((module0644.NIL != var59) ? conses_high.cadr(var59) : module0644.NIL);
        final SubLObject var61 = cdestructuring_bind.property_list_member((SubLObject)module0644.$ic68$, var48);
        final SubLObject var62 = (SubLObject)((module0644.NIL != var61) ? conses_high.cadr(var61) : module0644.NIL);
        final SubLObject var63 = cdestructuring_bind.property_list_member((SubLObject)module0644.$ic69$, var48);
        final SubLObject var64 = (SubLObject)((module0644.NIL != var63) ? conses_high.cadr(var63) : module0644.NIL);
        final SubLObject var65 = cdestructuring_bind.property_list_member((SubLObject)module0644.$ic70$, var48);
        final SubLObject var66 = (SubLObject)((module0644.NIL != var65) ? conses_high.cadr(var65) : module0644.NIL);
        final SubLObject var67 = cdestructuring_bind.property_list_member((SubLObject)module0644.$ic71$, var48);
        final SubLObject var68 = (SubLObject)((module0644.NIL != var67) ? conses_high.cadr(var67) : module0644.NIL);
        final SubLObject var69 = cdestructuring_bind.property_list_member((SubLObject)module0644.$ic72$, var48);
        final SubLObject var70 = (SubLObject)((module0644.NIL != var69) ? conses_high.cadr(var69) : module0644.NIL);
        final SubLObject var71;
        var48 = (var71 = var49);
        final SubLObject var72 = (SubLObject)module0644.$ic73$;
        return (SubLObject)ConsesLow.list((SubLObject)module0644.$ic74$, (SubLObject)ConsesLow.list((SubLObject)module0644.$ic3$, var64), (SubLObject)ConsesLow.list((SubLObject)module0644.$ic59$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var72, (SubLObject)ConsesLow.list((SubLObject)module0644.$ic75$, var64, var66, var68, var70))), (SubLObject)ConsesLow.listS((SubLObject)module0644.$ic76$, (SubLObject)ConsesLow.listS((SubLObject)module0644.$ic64$, new SubLObject[] { var54, module0644.$ic65$, var56, module0644.$ic66$, var58, module0644.$ic67$, var60, module0644.$ic68$, var62, module0644.$ic77$, var72, module0644.$ic78$ }), ConsesLow.append(var71, (SubLObject)module0644.NIL))));
    }
    
    public static SubLObject f39202(final SubLObject var64, final SubLObject var66, final SubLObject var30, final SubLObject var69) {
        SubLObject var70 = (SubLObject)module0644.NIL;
        var70 = (SubLObject)ConsesLow.cons((SubLObject)module0644.$ic80$, var70);
        var70 = (SubLObject)ConsesLow.cons(f39198(var64), var70);
        var70 = (SubLObject)ConsesLow.cons((SubLObject)module0644.$ic57$, var70);
        if (var66.isString()) {
            var70 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)module0644.NIL, (SubLObject)module0644.$ic81$, f39198(var66)), var70);
        }
        if (var30.isInteger()) {
            var70 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)module0644.NIL, (SubLObject)module0644.$ic82$, var30), var70);
        }
        if (module0644.NIL != var69) {
            var70 = (SubLObject)ConsesLow.cons((SubLObject)module0644.$ic83$, var70);
        }
        var70 = (SubLObject)ConsesLow.cons((SubLObject)module0644.$ic84$, var70);
        return Functions.apply(Symbols.symbol_function((SubLObject)module0644.$ic85$), Sequences.nreverse(var70));
    }
    
    public static SubLObject f39203(SubLObject var72, final SubLObject var73) {
        SubLObject var74 = var73;
        SubLObject var75 = (SubLObject)module0644.NIL;
        var75 = var74.first();
        while (module0644.NIL != var74) {
            SubLObject var77;
            final SubLObject var76 = var77 = var75;
            SubLObject var78 = (SubLObject)module0644.NIL;
            SubLObject var79 = (SubLObject)module0644.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var77, var76, (SubLObject)module0644.$ic86$);
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
        return module0038.f2659(var79, var78, var72, (SubLObject)module0644.UNPROVIDED);
    }
    
    public static SubLObject f39205(final SubLObject var23, final SubLObject var80, final SubLObject var81) {
        final SubLThread var82 = SubLProcess.currentSubLThread();
        if (module0644.NIL == module0015.f707(var80)) {
            Errors.warn((SubLObject)module0644.$ic87$, var80);
        }
        SubLObject var83 = (SubLObject)module0644.NIL;
        if (var80.isSymbol()) {
            var83 = Strings.string_downcase(Symbols.symbol_name(var80), (SubLObject)module0644.UNPROVIDED, (SubLObject)module0644.UNPROVIDED);
        }
        else {
            var83 = Strings.string_downcase(module0038.f2624(var83), (SubLObject)module0644.UNPROVIDED, (SubLObject)module0644.UNPROVIDED);
        }
        module0644.$g5020$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var23, var83, var81), module0644.$g5020$.getDynamicValue(var82)), var82);
        return var23;
    }
    
    public static SubLObject f39206(final SubLObject var83) {
        final SubLThread var84 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0644.UNPROVIDED);
        final SubLObject var85 = module0015.$g533$.currentBinding(var84);
        try {
            module0015.$g533$.bind((SubLObject)module0644.T, var84);
            SubLObject var86 = var83;
            SubLObject var87 = (SubLObject)module0644.NIL;
            var87 = var86.first();
            while (module0644.NIL != var86) {
                SubLObject var89;
                final SubLObject var88 = var89 = var87;
                SubLObject var90 = (SubLObject)module0644.NIL;
                SubLObject var91 = (SubLObject)module0644.NIL;
                SubLObject var92 = (SubLObject)module0644.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)module0644.$ic88$);
                var90 = var89.first();
                var89 = var89.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)module0644.$ic88$);
                var91 = var89.first();
                var89 = var89.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)module0644.$ic88$);
                var92 = var89.first();
                var89 = var89.rest();
                if (module0644.NIL == var89) {
                    PrintLow.format(module0015.$g131$.getDynamicValue(var84), (SubLObject)module0644.$ic89$, new SubLObject[] { var90, var91, var92 });
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var88, (SubLObject)module0644.$ic88$);
                }
                var86 = var86.rest();
                var87 = var86.first();
            }
            module0642.f39029((SubLObject)module0644.UNPROVIDED);
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
        return (SubLObject)ConsesLow.listS((SubLObject)module0644.$ic59$, (SubLObject)module0644.$ic90$, ConsesLow.append(var49, (SubLObject)module0644.$ic91$));
    }
    
    public static SubLObject f39208() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0644.UNPROVIDED);
        final SubLObject var6 = module0015.$g533$.currentBinding(var5);
        try {
            module0015.$g533$.bind((SubLObject)module0644.T, var5);
            PrintLow.format(module0015.$g131$.getDynamicValue(var5), module0644.$g5021$.getDynamicValue(var5));
            module0642.f39029((SubLObject)module0644.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var6, var5);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)module0644.NIL;
    }
    
    public static SubLObject f39209(final SubLObject var22, final SubLObject var89, final SubLObject var90, final SubLObject var1) {
        final SubLThread var91 = SubLProcess.currentSubLThread();
        final SubLObject var92 = PrintLow.format((SubLObject)module0644.NIL, (SubLObject)module0644.$ic93$, new SubLObject[] { var89, var90, var1 });
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020(var92);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0644.UNPROVIDED);
        final SubLObject var93 = module0015.$g533$.currentBinding(var91);
        try {
            module0015.$g533$.bind((SubLObject)module0644.T, var91);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var93, var91);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0644.NIL;
    }
    
    public static SubLObject f39210() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0644.UNPROVIDED);
        final SubLObject var6 = module0015.$g533$.currentBinding(var5);
        try {
            module0015.$g533$.bind((SubLObject)module0644.T, var5);
            module0642.f39019((SubLObject)module0644.$ic94$);
            module0642.f39029((SubLObject)module0644.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var6, var5);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)module0644.NIL;
    }
    
    public static SubLObject f39211(SubLObject var22, SubLObject var12) {
        if (var22 == module0644.UNPROVIDED) {
            var22 = (SubLObject)module0644.$ic95$;
        }
        if (var12 == module0644.UNPROVIDED) {
            var12 = (SubLObject)module0644.$ic96$;
        }
        module0642.f39074(var22, var12, (SubLObject)module0644.$ic97$);
        return (SubLObject)module0644.NIL;
    }
    
    public static SubLObject f39212(final SubLObject var91, SubLObject var92) {
        if (var92 == module0644.UNPROVIDED) {
            var92 = (SubLObject)module0644.$ic99$;
        }
        final SubLObject var93 = Sequences.cconcatenate((SubLObject)module0644.$ic100$, new SubLObject[] { var92, module0644.$ic100$, module0038.f2624(Time.get_universal_time()), module0644.$ic100$, module0038.f2624(random.random((SubLObject)module0644.$ic101$)) });
        final SubLObject var94 = Sequences.cconcatenate(var91, new SubLObject[] { var93, module0644.$ic102$ });
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g311$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        if (module0644.NIL != var91) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
            module0642.f39020(var91);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        }
        if (module0644.NIL != var91) {
            module0642.f39020(module0015.$g302$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
            module0642.f39020(var91);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        }
        if (module0644.NIL != var93) {
            module0642.f39020(module0015.$g308$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
            module0642.f39020(var93);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        }
        module0642.f39020(module0015.$g307$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39019((SubLObject)module0644.$ic33$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g317$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        if (module0644.NIL != var94) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
            module0642.f39020(var94);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        }
        if (module0644.NIL != var94) {
            module0642.f39020(module0015.$g302$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
            module0642.f39020(var94);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        }
        module0642.f39020(module0015.$g307$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39019((SubLObject)module0644.$ic103$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g303$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020((SubLObject)module0644.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0644.UNPROVIDED);
        module0016.f901(var94, (SubLObject)module0644.$ic104$, (SubLObject)module0644.UNPROVIDED);
        return var93;
    }
    
    public static SubLObject f39213() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0644.UNPROVIDED);
        final SubLObject var6 = module0015.$g533$.currentBinding(var5);
        try {
            module0015.$g533$.bind((SubLObject)module0644.T, var5);
            module0642.f39020(module0644.$g5022$.getGlobalValue());
            module0642.f39029((SubLObject)module0644.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var6, var5);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)module0644.NIL;
    }
    
    public static SubLObject f39214(final SubLObject var95) {
        SubLObject var96 = (SubLObject)module0644.NIL;
        SubLObject var97 = (SubLObject)module0644.NIL;
        try {
            var97 = streams_high.make_private_string_output_stream();
            PrintLow.format(var97, (SubLObject)module0644.$ic105$);
            SubLObject var98 = var95;
            SubLObject var99 = (SubLObject)module0644.NIL;
            var99 = var98.first();
            while (module0644.NIL != var98) {
                if (!var99.eql(var95.first())) {
                    print_high.princ((SubLObject)module0644.$ic106$, var97);
                }
                PrintLow.format(var97, (SubLObject)module0644.$ic107$, var99);
                var98 = var98.rest();
                var99 = var98.first();
            }
            print_high.princ((SubLObject)module0644.$ic108$, var97);
            var96 = streams_high.get_output_stream_string(var97);
        }
        finally {
            final SubLObject var100 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0644.T);
                streams_high.close(var97, (SubLObject)module0644.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var100);
            }
        }
        return var96;
    }
    
    public static SubLObject f39215() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        module0642.f39029((SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g484$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0644.UNPROVIDED);
        final SubLObject var6 = module0015.$g533$.currentBinding(var5);
        try {
            module0015.$g533$.bind((SubLObject)module0644.T, var5);
            PrintLow.format(module0015.$g131$.getDynamicValue(var5), module0644.$g5025$.getGlobalValue());
            module0642.f39029((SubLObject)module0644.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var6, var5);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)module0644.NIL;
    }
    
    public static SubLObject f39216(SubLObject var98, SubLObject var30, SubLObject var99, SubLObject var100, SubLObject var101, SubLObject var102) {
        if (var98 == module0644.UNPROVIDED) {
            var98 = (SubLObject)module0644.$ic111$;
        }
        if (var30 == module0644.UNPROVIDED) {
            var30 = (SubLObject)module0644.$ic112$;
        }
        if (var99 == module0644.UNPROVIDED) {
            var99 = (SubLObject)module0644.$ic113$;
        }
        if (var100 == module0644.UNPROVIDED) {
            var100 = (SubLObject)module0644.$ic114$;
        }
        if (var101 == module0644.UNPROVIDED) {
            var101 = (SubLObject)module0644.$ic113$;
        }
        if (var102 == module0644.UNPROVIDED) {
            var102 = (SubLObject)module0644.NIL;
        }
        return Sequences.cconcatenate((SubLObject)module0644.$ic115$, new SubLObject[] { module0006.f203(var98), module0644.$ic116$, module0006.f203(var30), module0644.$ic116$, module0006.f203(var99), module0644.$ic116$, module0006.f203(var100), module0644.$ic116$, module0006.f203(var101), module0644.$ic116$, module0006.f203((SubLObject)((module0644.NIL != var102) ? module0644.$ic117$ : module0644.$ic118$)), module0644.$ic119$ });
    }
    
    public static SubLObject f39217() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0014.f657((SubLObject)module0644.$ic120$);
        module0642.f39029((SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020(var6);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39020((SubLObject)module0644.$ic55$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0644.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0644.UNPROVIDED);
        final SubLObject var7 = module0015.$g533$.currentBinding(var5);
        try {
            module0015.$g533$.bind((SubLObject)module0644.T, var5);
            module0642.f39029((SubLObject)module0644.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var7, var5);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        return (SubLObject)module0644.NIL;
    }
    
    public static SubLObject f39218() {
        return (SubLObject)module0644.NIL;
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
        return (SubLObject)module0644.NIL;
    }
    
    public static SubLObject f39220() {
        module0644.$g4990$ = SubLFiles.defparameter("S#42960", (SubLObject)module0644.$ic0$);
        module0644.$g4991$ = SubLFiles.defparameter("S#42961", (SubLObject)module0644.$ic1$);
        module0644.$g4992$ = SubLFiles.defparameter("S#42962", (SubLObject)module0644.$ic7$);
        module0644.$g4993$ = SubLFiles.defparameter("S#42963", (SubLObject)module0644.$ic9$);
        module0644.$g4994$ = SubLFiles.defparameter("S#42964", (SubLObject)module0644.$ic10$);
        module0644.$g4995$ = SubLFiles.defparameter("S#42965", (SubLObject)module0644.$ic12$);
        module0644.$g4996$ = SubLFiles.defparameter("S#42966", (SubLObject)module0644.$ic14$);
        module0644.$g4997$ = SubLFiles.defparameter("S#42967", (SubLObject)module0644.$ic15$);
        module0644.$g4998$ = SubLFiles.defparameter("S#42968", (SubLObject)module0644.$ic16$);
        module0644.$g4999$ = SubLFiles.deflexical("S#42969", (SubLObject)module0644.$ic18$);
        module0644.$g5000$ = SubLFiles.deflexical("S#42970", (SubLObject)module0644.$ic20$);
        module0644.$g5001$ = SubLFiles.defparameter("S#42971", (SubLObject)module0644.$ic22$);
        module0644.$g5002$ = SubLFiles.defparameter("S#42972", (SubLObject)module0644.$ic23$);
        module0644.$g5003$ = SubLFiles.deflexical("S#42973", (SubLObject)((module0644.NIL != Symbols.boundp((SubLObject)module0644.$ic24$)) ? module0644.$g5003$.getGlobalValue() : module0644.$ic25$));
        module0644.$g5004$ = SubLFiles.defparameter("S#42974", (SubLObject)module0644.$ic26$);
        module0644.$g5005$ = SubLFiles.defparameter("S#42975", (SubLObject)module0644.$ic29$);
        module0644.$g5006$ = SubLFiles.defparameter("S#42976", (SubLObject)module0644.$ic30$);
        module0644.$g5007$ = SubLFiles.defparameter("S#42977", (SubLObject)module0644.$ic31$);
        module0644.$g5008$ = SubLFiles.defparameter("S#42978", (SubLObject)module0644.$ic32$);
        module0644.$g5009$ = SubLFiles.defparameter("S#42979", (SubLObject)module0644.$ic36$);
        module0644.$g5010$ = SubLFiles.defparameter("S#42980", (SubLObject)module0644.$ic37$);
        module0644.$g5011$ = SubLFiles.defparameter("S#42981", (SubLObject)module0644.$ic38$);
        module0644.$g5012$ = SubLFiles.defparameter("S#42982", (SubLObject)module0644.$ic39$);
        module0644.$g5013$ = SubLFiles.defparameter("S#42983", (SubLObject)module0644.$ic40$);
        module0644.$g5014$ = SubLFiles.defparameter("S#42984", (SubLObject)module0644.$ic41$);
        module0644.$g5015$ = SubLFiles.defparameter("S#42985", (SubLObject)module0644.$ic42$);
        module0644.$g5016$ = SubLFiles.defparameter("S#42986", (SubLObject)module0644.$ic43$);
        module0644.$g5017$ = SubLFiles.defparameter("S#42987", (SubLObject)module0644.$ic44$);
        module0644.$g5018$ = SubLFiles.defparameter("S#42988", (SubLObject)module0644.T);
        module0644.$g5019$ = SubLFiles.defparameter("S#42989", (SubLObject)module0644.ZERO_INTEGER);
        module0644.$g5020$ = SubLFiles.defparameter("S#42990", (SubLObject)module0644.NIL);
        module0644.$g5021$ = SubLFiles.defparameter("S#42991", (SubLObject)module0644.$ic92$);
        module0644.$g5022$ = SubLFiles.deflexical("S#42992", (SubLObject)module0644.$ic98$);
        module0644.$g5023$ = SubLFiles.deflexical("S#42993", (SubLObject)module0644.$ic109$);
        module0644.$g5024$ = SubLFiles.deflexical("S#42994", (SubLObject)ConsesLow.list(module0644.$g5023$.getGlobalValue()));
        module0644.$g5025$ = SubLFiles.deflexical("S#42995", (SubLObject)module0644.$ic110$);
        return (SubLObject)module0644.NIL;
    }
    
    public static SubLObject f39221() {
        module0012.f441((SubLObject)module0644.$ic2$);
        module0012.f444((SubLObject)module0644.$ic2$);
        module0015.f873((SubLObject)module0644.$ic6$);
        module0003.f57((SubLObject)module0644.$ic24$);
        module0012.f441((SubLObject)module0644.$ic50$);
        module0012.f444((SubLObject)module0644.$ic50$);
        Hashtables.sethash((SubLObject)module0644.$ic51$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0644.$ic52$, (SubLObject)module0644.NIL));
        module0002.f50((SubLObject)module0644.$ic75$, (SubLObject)module0644.$ic79$);
        Hashtables.sethash((SubLObject)module0644.$ic120$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0644.$ic121$, (SubLObject)module0644.NIL));
        return (SubLObject)module0644.NIL;
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
        module0644.$g4990$ = null;
        module0644.$g4991$ = null;
        module0644.$g4992$ = null;
        module0644.$g4993$ = null;
        module0644.$g4994$ = null;
        module0644.$g4995$ = null;
        module0644.$g4996$ = null;
        module0644.$g4997$ = null;
        module0644.$g4998$ = null;
        module0644.$g4999$ = null;
        module0644.$g5000$ = null;
        module0644.$g5001$ = null;
        module0644.$g5002$ = null;
        module0644.$g5003$ = null;
        module0644.$g5004$ = null;
        module0644.$g5005$ = null;
        module0644.$g5006$ = null;
        module0644.$g5007$ = null;
        module0644.$g5008$ = null;
        module0644.$g5009$ = null;
        module0644.$g5010$ = null;
        module0644.$g5011$ = null;
        module0644.$g5012$ = null;
        module0644.$g5013$ = null;
        module0644.$g5014$ = null;
        module0644.$g5015$ = null;
        module0644.$g5016$ = null;
        module0644.$g5017$ = null;
        module0644.$g5018$ = null;
        module0644.$g5019$ = null;
        module0644.$g5020$ = null;
        module0644.$g5021$ = null;
        module0644.$g5022$ = null;
        module0644.$g5023$ = null;
        module0644.$g5024$ = null;
        module0644.$g5025$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JAVASCRIPT"));
        $ic1$ = SubLObjectFactory.makeKeyword("JAVASCRIPT");
        $ic2$ = SubLObjectFactory.makeSymbol("S#42961", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic4$ = SubLObjectFactory.makeString("cb-back");
        $ic5$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic6$ = SubLObjectFactory.makeSymbol("CB-BACK");
        $ic7$ = SubLObjectFactory.makeString("onClick=\"top.close();\"");
        $ic8$ = SubLObjectFactory.makeString("Dismiss");
        $ic9$ = SubLObjectFactory.makeString("onClick=\"top.close(); return false;\"");
        $ic10$ = SubLObjectFactory.makeString("onClick=\"self.history.back();\"");
        $ic11$ = SubLObjectFactory.makeString("Back");
        $ic12$ = SubLObjectFactory.makeString("onClick=\"self.location = self.document.location;\"");
        $ic13$ = SubLObjectFactory.makeString("Refresh");
        $ic14$ = SubLObjectFactory.makeString("onClick=\"self.location = self.document.location; return false;\"");
        $ic15$ = SubLObjectFactory.makeString("\nfor (var i = 0; i < top.frames.length; i++) {\n  var frame = top.frames[i];\n  if (frame.name == '~A') {\n    frame.location = frame.document.location;\n    break;\n  }\n}");
        $ic16$ = SubLObjectFactory.makeString("onClick=\"with (this.form.elements['~A']){value = ''; focus();}\"");
        $ic17$ = SubLObjectFactory.makeString("Clear");
        $ic18$ = SubLObjectFactory.makeString("onClick=\"with (this.form.elements['~A']){value = value + ' ' + '~A'; focus();}\"");
        $ic19$ = SubLObjectFactory.makeString("Insert");
        $ic20$ = SubLObjectFactory.makeString("onClick=\"with (this.form.elements['~A']){value = '~A';}; this.form.submit();\"");
        $ic21$ = SubLObjectFactory.makeString("Paste");
        $ic22$ = SubLObjectFactory.makeString("onClick=\"with (this.form.elements['~A']){value = '';}\"");
        $ic23$ = SubLObjectFactory.makeString("onClick=\"with (this.form.elements['~A']){focus();}\"");
        $ic24$ = SubLObjectFactory.makeSymbol("S#42973", "CYC");
        $ic25$ = SubLObjectFactory.makeString("onkeypress=\"this.form.~A[~A].checked=true\"");
        $ic26$ = SubLObjectFactory.makeString("onLoad=\"setTimeout('self.history.back()', ~A);\"");
        $ic27$ = SubLObjectFactory.makeInteger(2000);
        $ic28$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic29$ = SubLObjectFactory.makeString("\nonClick=\"");
        $ic30$ = SubLObjectFactory.makeString("\nthis.form.submit();\"");
        $ic31$ = SubLObjectFactory.makeString("\nonFocus=\"");
        $ic32$ = SubLObjectFactory.makeString("\"");
        $ic33$ = SubLObjectFactory.makeString("");
        $ic34$ = SubLObjectFactory.makeString("width:");
        $ic35$ = SubLObjectFactory.makeString("inputBox");
        $ic36$ = SubLObjectFactory.makeString("\nthis.form.elements[0].name = '~A';");
        $ic37$ = SubLObjectFactory.makeString("\nthis.form.action = '~A';");
        $ic38$ = SubLObjectFactory.makeString("\nthis.form.method = '~A';");
        $ic39$ = SubLObjectFactory.makeString("\nthis.form.target = '~A';");
        $ic40$ = SubLObjectFactory.makeString("<script language=\"javascript\">");
        $ic41$ = SubLObjectFactory.makeString("</script>");
        $ic42$ = SubLObjectFactory.makeString("//");
        $ic43$ = SubLObjectFactory.makeString("");
        $ic44$ = SubLObjectFactory.makeString("\n");
        $ic45$ = SubLObjectFactory.makeString(" ");
        $ic46$ = SubLObjectFactory.makeString(", ");
        $ic47$ = SubLObjectFactory.makeString(" (");
        $ic48$ = SubLObjectFactory.makeString(") {");
        $ic49$ = SubLObjectFactory.makeString("}");
        $ic50$ = SubLObjectFactory.makeSymbol("S#42988", "CYC");
        $ic51$ = SubLObjectFactory.makeKeyword("OVERLIB");
        $ic52$ = SubLObjectFactory.makeString("overlib.js");
        $ic53$ = SubLObjectFactory.makeString("overDiv");
        $ic54$ = SubLObjectFactory.makeString("position:absolute; visibility:hidden; z-index:1000;");
        $ic55$ = SubLObjectFactory.makeString("text/javascript");
        $ic56$ = SubLObjectFactory.makeString("\\'");
        $ic57$ = SubLObjectFactory.makeString("'");
        $ic58$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"));
        $ic59$ = SubLObjectFactory.makeSymbol("CLET");
        $ic60$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42989", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("S#42989", "CYC"), (SubLObject)module0644.ONE_INTEGER)));
        $ic61$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("S#1529", "CYC"), SubLObjectFactory.makeSymbol("S#29", "CYC"), SubLObjectFactory.makeSymbol("S#1553", "CYC"), SubLObjectFactory.makeSymbol("S#1512", "CYC"), SubLObjectFactory.makeSymbol("S#1520", "CYC"), SubLObjectFactory.makeSymbol("S#42996", "CYC"), SubLObjectFactory.makeSymbol("S#1633", "CYC"), SubLObjectFactory.makeSymbol("S#896", "CYC"), SubLObjectFactory.makeSymbol("S#42997", "CYC") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic62$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("HREF"), SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeKeyword("TARGET"), SubLObjectFactory.makeKeyword("SCRIPT"), SubLObjectFactory.makeKeyword("STYLE"), SubLObjectFactory.makeKeyword("HOVEROVER-HTML"), SubLObjectFactory.makeKeyword("CAPTION"), SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeKeyword("STICKY") });
        $ic63$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic64$ = SubLObjectFactory.makeKeyword("HREF");
        $ic65$ = SubLObjectFactory.makeKeyword("NAME");
        $ic66$ = SubLObjectFactory.makeKeyword("TARGET");
        $ic67$ = SubLObjectFactory.makeKeyword("SCRIPT");
        $ic68$ = SubLObjectFactory.makeKeyword("STYLE");
        $ic69$ = SubLObjectFactory.makeKeyword("HOVEROVER-HTML");
        $ic70$ = SubLObjectFactory.makeKeyword("CAPTION");
        $ic71$ = SubLObjectFactory.makeKeyword("WIDTH");
        $ic72$ = SubLObjectFactory.makeKeyword("STICKY");
        $ic73$ = SubLObjectFactory.makeUninternedSymbol("US#32B84A1");
        $ic74$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic75$ = SubLObjectFactory.makeSymbol("S#42943", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("S#1039", "CYC");
        $ic77$ = SubLObjectFactory.makeKeyword("ONMOUSEOVER");
        $ic78$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ONMOUSEOUT"), (SubLObject)SubLObjectFactory.makeString("nd();"));
        $ic79$ = SubLObjectFactory.makeSymbol("S#42942", "CYC");
        $ic80$ = SubLObjectFactory.makeString("return overlib('");
        $ic81$ = SubLObjectFactory.makeString(",CAPTION,'~A'");
        $ic82$ = SubLObjectFactory.makeString(",WIDTH,~A");
        $ic83$ = SubLObjectFactory.makeString(",STICKY");
        $ic84$ = SubLObjectFactory.makeString(")");
        $ic85$ = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $ic86$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#32", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42661", "CYC"));
        $ic87$ = SubLObjectFactory.makeString("Odd event handler ~S -- is this a known DOM event?");
        $ic88$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42998", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#734", "CYC"));
        $ic89$ = SubLObjectFactory.makeString("~%document.getElementById('~A').~A = ~A;");
        $ic90$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42990", "CYC"), (SubLObject)module0644.NIL));
        $ic91$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42947", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42990", "CYC")));
        $ic92$ = SubLObjectFactory.makeString("\n\nfunction set_all_radio_buttons(form, pattern, value) {\n  var re = new RegExp(pattern);\n  for (i = 0 ; i < form.elements.length ; i++) {\n    var field = form.elements[i]; \n    if (re.test(field.name)) {\n      if (field.value == value) {\n\tfield.checked = true;\n      } else {\n        field.checked = false;\n      }\n    }\n  } \n}");
        $ic93$ = SubLObjectFactory.makeString("javascript: void set_all_radio_buttons(~a, '~a', '~a')");
        $ic94$ = SubLObjectFactory.makeString("window.focus()");
        $ic95$ = SubLObjectFactory.makeString("Close Window");
        $ic96$ = SubLObjectFactory.makeKeyword("CLOSE-WINDOW");
        $ic97$ = SubLObjectFactory.makeString("onClick=javascript:self.close()");
        $ic98$ = SubLObjectFactory.makeString("\nfunction load_simple_applet_parameters (applet_name) {\n  applets=document.getElementsByTagName('applet');\n  size = applets.length; \n  for (j=0; j < size; j++) {\n    curApplet = applets.item(j);\n    name = curApplet.getAttribute('name');\n    loc = name.lastIndexOf('-' + applet_name + '-');\n    if (loc >= 0) {\n      prefix = name.substring(0, loc);\n      input = document.getElementById(prefix);\n      if (input == null) { continue; }\n      previousInput = document.getElementById(name + '-previous-value');\n      appletValue = '';\n      is_active = false;\n      try { is_active = curApplet.isActive(); } catch (e) {}\n      if (!is_active) {\n        updateDom();\n        try { is_active = curApplet.isActive(); } catch (e) {}\n      }\n      if (is_active) {\n        input.value = appletValue = curApplet.toString();\n      }\n      if (previousInput != null) {\n        previousInput.value = appletValue;\n      }\n    }\n  }\n}\n\nfunction simple_applet_form_submit_method (applet_names) {\n  for (i=0; i < applet_names.length; i++) {\n    applet_name = applet_names[i];\n    load_simple_applet_parameters(applet_name);\n  }\n  return true;\n}\n\nfunction updateDom() {\n  window.resizeBy(0, -1);\n  window.resizeBy(0, 1);\n}\n\nfunction loadPreviousGKEAppletParameter() {\n  applets=document.getElementsByTagName('applet');\n  size = applets.length; \n  shouldJiggle = true;\n  for (j=0; j < size; j++) {\n    curApplet = applets.item(j);\n    name = curApplet.getAttribute('name');\n    previousInput = document.getElementById(name + '-previous-value');\n    loc = name.lastIndexOf('-GKE-APPLET-');\n    if (loc < 0) { continue; }\n    value = previousInput.value;\n    if (value == '>>>>>>>UNSET<<<<<<<') { continue; }\n    loadPreviousValue(name, value, shouldJiggle, 16, 250);\n    shouldJiggle = false;\n  }\n}\n\nfunction loadPreviousValue(appletId, prevValue, shouldUpdateDom, count, delay) { \n  if (count <= 0) { return; }\n  curApplet = document.getElementById(appletId);\n  value = curApplet.toString();\n  if (curApplet == null) { return; }\n  if (value == '[object HTMLAppletElement]') {\n    if (shouldUpdateDom) { updateDom(); }\n    self.setTimeout('loadPreviousValue(\"' + appletId + \n                    '\", ' + '\"' + prevValue + '\"' + \n                    ', false, ' + (count-1) + ', ' + delay + ')', delay);\n    return;\n  }\n  try {\n    //alert('Trying to set previous value: ' + prevValue);\n    curApplet.showStatus('PREVIOUS VALUE: ' + prevValue);\n  } catch (e) {\n    self.setTimeout('loadPreviousValue(\"' + appletId + \n                    '\", ' + '\"' + prevValue + '\"' + \n                    ', false, ' + (count-1) + ', ' + delay + ')', delay);\n  }\n}\n\nwindow.onload = loadPreviousGKEAppletParameter;\n\n");
        $ic99$ = SubLObjectFactory.makeString("APPLET");
        $ic100$ = SubLObjectFactory.makeString("-");
        $ic101$ = SubLObjectFactory.makeInteger(30000);
        $ic102$ = SubLObjectFactory.makeString("-previous-value");
        $ic103$ = SubLObjectFactory.makeString(">>>>>>>UNSET<<<<<<<");
        $ic104$ = SubLObjectFactory.makeKeyword("INVISIBLE");
        $ic105$ = SubLObjectFactory.makeString("onSubmit=\"return simple_applet_form_submit_method(new Array(");
        $ic106$ = SubLObjectFactory.makeString(" ,");
        $ic107$ = SubLObjectFactory.makeString("'~A'");
        $ic108$ = SubLObjectFactory.makeString("))\"");
        $ic109$ = SubLObjectFactory.makeString("GKE-APPLET");
        $ic110$ = SubLObjectFactory.makeString("var popupWindow = null;\n  function positionedPopup(url,winName,w,h,t,l,scroll){\n  settings =\n  'height='+h+',width='+w+',top='+t+',left='+l+',scrollbars='+scroll+',resizable=yes,location=no';\n  popupWindow = window.open(url,winName,settings)\n  }");
        $ic111$ = SubLObjectFactory.makeString("popup");
        $ic112$ = SubLObjectFactory.makeInteger(500);
        $ic113$ = SubLObjectFactory.makeInteger(300);
        $ic114$ = SubLObjectFactory.makeInteger(100);
        $ic115$ = SubLObjectFactory.makeString("positionedPopup(this.href, '");
        $ic116$ = SubLObjectFactory.makeString("', '");
        $ic117$ = SubLObjectFactory.makeString("yes");
        $ic118$ = SubLObjectFactory.makeString("no");
        $ic119$ = SubLObjectFactory.makeString("'); return false;");
        $ic120$ = SubLObjectFactory.makeKeyword("CB-SENTENCE-EDITOR");
        $ic121$ = SubLObjectFactory.makeString("cb-sentence-editor.js");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0644.class
	Total time: 351 ms
	
	
	Decompiled with Procyon 0.5.32.
*/