package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0684 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0684";
    public static final String myFingerPrint = "13609f20a44314488552f9dd976c7b54f5b09ca32e11ddaa71bf0a6aed4d07be";
    private static SubLSymbol $g5385$;
    private static SubLSymbol $g5386$;
    private static final SubLInteger $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLString $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
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
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLInteger $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLInteger $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLList $ic105$;
    private static final SubLString $ic106$;
    private static final SubLString $ic107$;
    private static final SubLString $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLInteger $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLString $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLString $ic120$;
    private static final SubLList $ic121$;
    private static final SubLList $ic122$;
    private static final SubLList $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLString $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLString $ic131$;
    private static final SubLString $ic132$;
    private static final SubLString $ic133$;
    private static final SubLString $ic134$;
    private static final SubLString $ic135$;
    private static final SubLList $ic136$;
    private static final SubLList $ic137$;
    private static final SubLString $ic138$;
    private static final SubLList $ic139$;
    private static final SubLList $ic140$;
    private static final SubLString $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLString $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLString $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLString $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLString $ic153$;
    private static final SubLString $ic154$;
    private static final SubLString $ic155$;
    private static final SubLString $ic156$;
    private static final SubLString $ic157$;
    private static final SubLString $ic158$;
    
    public static SubLObject f41926(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        assert module0684.NIL != oc_inference_datastructures_inference.f25275(var1) : var1;
        assert module0684.NIL != module0423.f29532(var2) : var2;
        return Hashtables.sethash(var1, module0684.$g5385$.getDynamicValue(var3), var2);
    }
    
    public static SubLObject f41927(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert module0684.NIL != oc_inference_datastructures_inference.f25275(var1) : var1;
        return Hashtables.remhash(var1, module0684.$g5385$.getDynamicValue(var2));
    }
    
    public static SubLObject f41928(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert module0684.NIL != oc_inference_datastructures_inference.f25275(var1) : var1;
        return Hashtables.gethash(var1, module0684.$g5385$.getDynamicValue(var2), (SubLObject)module0684.UNPROVIDED);
    }
    
    public static SubLObject f41929(final SubLObject var2) {
        final SubLObject var3 = module0423.f29563(var2);
        final SubLObject var4 = module0423.f29569(var2);
        final SubLObject var5 = module0423.f29566(var2);
        final SubLObject var6 = module0408.f28407(module0412.f28668(module0423.f29573(var2)));
        return module0683.f41815(var3, var4, var6, var2, var5);
    }
    
    public static SubLObject f41930(final SubLObject var2, SubLObject var8) {
        if (var8 == module0684.UNPROVIDED) {
            var8 = (SubLObject)module0684.NIL;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0684.NIL == var8) {
            var8 = (SubLObject)module0684.$ic3$;
        }
        final SubLObject var10 = module0656.f39832((SubLObject)module0684.$ic4$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var9), (SubLObject)module0684.$ic5$, module0656.f39842(var2));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        if (module0684.NIL != var10) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39020(var10);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0684.UNPROVIDED);
        final SubLObject var11 = module0015.$g533$.currentBinding(var9);
        try {
            module0015.$g533$.bind((SubLObject)module0684.T, var9);
            module0642.f39019(var8);
        }
        finally {
            module0015.$g533$.rebind(var11, var9);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var2;
    }
    
    public static SubLObject f41931(final SubLObject var11) {
        final SubLObject var12 = module0656.f39943(var11, (SubLObject)module0684.UNPROVIDED);
        f41929(var12);
        return (SubLObject)module0684.NIL;
    }
    
    public static SubLObject f41932(final SubLObject var2) {
        final SubLObject var3 = module0423.f29563(var2);
        final SubLObject var4 = module0423.f29569(var2);
        final SubLObject var5 = module0423.f29566(var2);
        SubLObject var6 = module0408.f28407(module0412.f28668(module0423.f29573(var2)));
        final SubLObject var7 = f41933(var2);
        Mapping.mapcar((SubLObject)module0684.$ic9$, var7);
        if (module0684.NIL != var7) {
            var6 = conses_high.putf(var6, (SubLObject)module0684.$ic10$, var7);
        }
        return module0683.f41815(var3, var4, var6, var2, var5);
    }
    
    public static SubLObject f41934(final SubLObject var2, SubLObject var8) {
        if (var8 == module0684.UNPROVIDED) {
            var8 = (SubLObject)module0684.NIL;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0684.NIL == var8) {
            var8 = (SubLObject)module0684.$ic11$;
        }
        final SubLObject var10 = module0656.f39832((SubLObject)module0684.$ic4$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var9), (SubLObject)module0684.$ic12$, module0656.f39842(var2));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        if (module0684.NIL != var10) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39020(var10);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0684.UNPROVIDED);
        final SubLObject var11 = module0015.$g533$.currentBinding(var9);
        try {
            module0015.$g533$.bind((SubLObject)module0684.T, var9);
            module0642.f39019(var8);
        }
        finally {
            module0015.$g533$.rebind(var11, var9);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var2;
    }
    
    public static SubLObject f41935(final SubLObject var11) {
        final SubLObject var12 = module0656.f39943(var11, (SubLObject)module0684.UNPROVIDED);
        f41932(var12);
        return (SubLObject)module0684.NIL;
    }
    
    public static SubLObject f41933(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0684.NIL;
        if (module0684.NIL != module0212.f13762(var2)) {
            SubLObject var4 = module0220.f14565(var2, module0684.$ic16$, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
            SubLObject var5 = (SubLObject)module0684.NIL;
            var5 = var4.first();
            while (module0684.NIL != var4) {
                var3 = (SubLObject)ConsesLow.cons(var5, var3);
                var4 = var4.rest();
                var5 = var4.first();
            }
        }
        return var3;
    }
    
    public static SubLObject f41936(final SubLObject var1, SubLObject var8) {
        if (var8 == module0684.UNPROVIDED) {
            var8 = (SubLObject)module0684.NIL;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0684.NIL == var8) {
            var8 = (SubLObject)module0684.$ic17$;
        }
        assert module0684.NIL != oc_inference_datastructures_inference.f25275(var1) : var1;
        final SubLObject var10 = module0656.f39832((SubLObject)module0684.$ic18$);
        if (module0684.$ic19$.isString()) {
            final SubLObject var11 = module0644.f39202((SubLObject)module0684.$ic19$, (SubLObject)module0684.NIL, (SubLObject)module0684.NIL, (SubLObject)module0684.NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var9), (SubLObject)module0684.$ic20$, module0361.f23996(oc_inference_datastructures_inference.f25421(var1)), oc_inference_datastructures_inference.f25422(var1));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            if (module0684.NIL != var10) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
                module0642.f39020(var10);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39020(var11);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39020((SubLObject)module0684.$ic21$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0684.UNPROVIDED);
            final SubLObject var12 = module0015.$g533$.currentBinding(var9);
            try {
                module0015.$g533$.bind((SubLObject)module0684.T, var9);
                module0642.f39019(var8);
            }
            finally {
                module0015.$g533$.rebind(var12, var9);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)module0684.NIL;
    }
    
    public static SubLObject f41937(final SubLObject var11) {
        SubLObject var12 = (SubLObject)module0684.NIL;
        SubLObject var13 = (SubLObject)module0684.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var11, var11, (SubLObject)module0684.$ic24$);
        var12 = var11.first();
        SubLObject var14 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var11, (SubLObject)module0684.$ic24$);
        var13 = var14.first();
        var14 = var14.rest();
        if (module0684.NIL != var14) {
            cdestructuring_bind.cdestructuring_bind_error(var11, (SubLObject)module0684.$ic24$);
            return (SubLObject)module0684.NIL;
        }
        final SubLObject var15 = reader.parse_integer(var12, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        final SubLObject var16 = reader.parse_integer(var13, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        final SubLObject var17 = module0361.f24195(var15, var16);
        final SubLObject var18 = (SubLObject)((module0684.NIL != var17) ? f41928(var17) : module0684.NIL);
        if (module0684.NIL == var17) {
            return module0656.f39789((SubLObject)module0684.$ic25$, var16, var15, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        }
        module0682.f41666(module0682.f41659(var17, (SubLObject)module0684.UNPROVIDED));
        if (module0684.NIL != module0423.f29532(var18)) {
            module0682.f41641(module0682.f41665(), var18);
        }
        return f41938(var18);
    }
    
    public static SubLObject f41939(final SubLObject var2, SubLObject var8) {
        if (var8 == module0684.UNPROVIDED) {
            var8 = (SubLObject)module0684.NIL;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0684.NIL == var8) {
            var8 = (SubLObject)module0684.$ic27$;
        }
        assert module0684.NIL != module0423.f29532(var2) : var2;
        final SubLObject var10 = module0656.f39832((SubLObject)module0684.$ic4$);
        if (module0684.$ic28$.isString()) {
            final SubLObject var11 = module0644.f39202((SubLObject)module0684.$ic28$, (SubLObject)module0684.NIL, (SubLObject)module0684.NIL, (SubLObject)module0684.NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var9), (SubLObject)module0684.$ic29$, module0656.f39842(var2));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            if (module0684.NIL != var10) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
                module0642.f39020(var10);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39020(var11);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39020((SubLObject)module0684.$ic21$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0684.UNPROVIDED);
            final SubLObject var12 = module0015.$g533$.currentBinding(var9);
            try {
                module0015.$g533$.bind((SubLObject)module0684.T, var9);
                module0642.f39019(var8);
            }
            finally {
                module0015.$g533$.rebind(var12, var9);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)module0684.NIL;
    }
    
    public static SubLObject f41940(final SubLObject var11) {
        final SubLObject var12 = module0656.f39943(var11.first(), (SubLObject)module0684.UNPROVIDED);
        if (module0684.NIL == module0423.f29532(var12)) {
            return module0656.f39789((SubLObject)module0684.$ic32$, var11.first(), (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        }
        module0682.f41666(module0682.f41658(var12, (SubLObject)module0684.UNPROVIDED));
        f41938(var12);
        return (SubLObject)module0684.NIL;
    }
    
    public static SubLObject f41938(SubLObject var2) {
        if (var2 == module0684.UNPROVIDED) {
            var2 = (SubLObject)module0684.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = (SubLObject)((module0684.NIL != var2) ? module0684.$ic34$ : module0684.$ic35$);
        final SubLObject var5 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((module0684.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED), var3);
            module0642.f39020((SubLObject)module0684.$ic36$);
            module0642.f39029((SubLObject)module0684.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0642.f39029((SubLObject)module0684.UNPROVIDED);
            module0642.f39020(module0015.$g173$.getGlobalValue());
            module0642.f39019(var4);
            module0642.f39020(module0015.$g174$.getGlobalValue());
            module0666.f40471();
            module0644.f39213();
            module0016.f892();
            module0016.f895();
            module0666.f40487();
            module0666.f40535();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0684.UNPROVIDED);
            final SubLObject var10_24 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)module0684.T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
                module0642.f39020((SubLObject)module0684.$ic37$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0684.UNPROVIDED);
                final SubLObject var10_25 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)module0684.T, var3);
                    module0644.f39197();
                    final SubLObject var6 = module0644.f39214(module0644.$g5024$.getGlobalValue());
                    final SubLObject var7 = module0656.f39832((SubLObject)module0684.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
                    module0642.f39020((SubLObject)module0684.$ic38$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
                    if (module0684.NIL != var7) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
                        module0642.f39020(var7);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
                    }
                    module0642.f39032((SubLObject)module0684.ONE_INTEGER);
                    module0642.f39020(var6);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0684.UNPROVIDED);
                    final SubLObject var10_26 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var8 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var9 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0684.T, var3);
                        module0015.$g541$.bind((SubLObject)module0684.T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)module0684.$ic39$, (SubLObject)module0684.NIL, (SubLObject)module0684.UNPROVIDED);
                        f41941(var4);
                        module0642.f39026((SubLObject)module0684.UNPROVIDED);
                        f41942();
                        module0642.f39026((SubLObject)module0684.TWO_INTEGER);
                        module0683.f41737(module0682.f41660(module0682.f41665()), module0682.f41662(module0682.f41665()), (SubLObject)module0684.NIL);
                        module0642.f39026((SubLObject)module0684.UNPROVIDED);
                        f41943();
                        module0642.f39026((SubLObject)module0684.UNPROVIDED);
                        module0683.f41738(module0682.f41660(module0682.f41665()), (SubLObject)module0684.NIL);
                        module0642.f39026((SubLObject)module0684.UNPROVIDED);
                        f41944();
                        module0642.f39026((SubLObject)module0684.UNPROVIDED);
                        module0683.f41739(module0682.f41639(module0682.f41665()), (SubLObject)module0684.NIL);
                        module0642.f39051((SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
                        f41945((SubLObject)module0684.UNPROVIDED);
                        module0642.f39051((SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
                        f41946(module0682.f41665());
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var9, var3);
                        module0015.$g541$.rebind(var8, var3);
                        module0015.$g533$.rebind(var10_26, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0684.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var10_25, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0684.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var10_24, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0684.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var5, var3);
        }
        return (SubLObject)module0684.NIL;
    }
    
    public static SubLObject f41941(final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = (SubLObject)module0684.FIVE_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0684.NIL != var25) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39020(var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0684.UNPROVIDED);
        final SubLObject var26 = module0015.$g533$.currentBinding(var24);
        try {
            module0015.$g533$.bind((SubLObject)module0684.T, var24);
            module0683.f41676(var23, (SubLObject)module0684.$ic40$, (SubLObject)module0684.$ic41$, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var26, var24);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0642.f39032((SubLObject)module0684.FOUR_INTEGER);
        module0683.f41676((SubLObject)module0684.$ic42$, (SubLObject)module0684.$ic43$, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        module0642.f39032((SubLObject)module0684.UNPROVIDED);
        module0683.f41677((SubLObject)module0684.$ic44$, (SubLObject)module0684.$ic45$, (SubLObject)module0684.$ic46$, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        module0642.f39032((SubLObject)module0684.UNPROVIDED);
        module0683.f41677((SubLObject)module0684.$ic47$, (SubLObject)module0684.$ic48$, (SubLObject)module0684.$ic49$, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        module0642.f39032((SubLObject)module0684.UNPROVIDED);
        module0683.f41677((SubLObject)module0684.$ic50$, (SubLObject)module0684.$ic51$, (SubLObject)module0684.$ic52$, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        module0642.f39032((SubLObject)module0684.UNPROVIDED);
        module0683.f41677((SubLObject)module0684.$ic53$, (SubLObject)module0684.$ic54$, (SubLObject)module0684.$ic55$, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        module0642.f39051((SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        return (SubLObject)module0684.NIL;
    }
    
    public static SubLObject f41942() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0642.f39032((SubLObject)module0684.UNPROVIDED);
        module0683.f41678((SubLObject)module0684.$ic56$, (SubLObject)module0684.$ic57$, (SubLObject)module0684.$ic58$, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        module0642.f39032((SubLObject)module0684.UNPROVIDED);
        module0683.f41676((SubLObject)module0684.$ic59$, (SubLObject)module0684.$ic60$, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        module0642.f39075((SubLObject)module0684.$ic61$, module0682.f41628(module0682.f41665()), (SubLObject)module0684.$ic62$);
        if (module0684.NIL != module0682.f41627(module0682.f41665())) {
            module0642.f39032((SubLObject)module0684.UNPROVIDED);
            module0683.f41678((SubLObject)module0684.$ic63$, (SubLObject)module0684.$ic64$, (SubLObject)module0684.$ic65$, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        }
        module0642.f39026((SubLObject)module0684.UNPROVIDED);
        module0642.f39073((SubLObject)module0684.$ic66$);
        module0642.f39026((SubLObject)module0684.TWO_INTEGER);
        module0016.f920((SubLObject)module0684.$ic67$, (SubLObject)module0684.$ic68$, (SubLObject)module0684.$ic69$);
        final SubLObject var4 = (SubLObject)module0684.$ic70$;
        final SubLObject var5 = (SubLObject)module0684.FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0684.NIL != var5) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39020(var5);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0684.UNPROVIDED);
        SubLObject var6 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)module0684.T, var3);
            module0683.f41676((SubLObject)module0684.$ic71$, (SubLObject)module0684.$ic72$, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var6, var3);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0016.f908((SubLObject)module0684.$ic67$, var4, (SubLObject)module0684.$ic73$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        module0642.f39020((SubLObject)module0684.$ic67$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0684.UNPROVIDED);
        var6 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)module0684.T, var3);
            module0657.f39992(module0682.f41631(module0682.f41665()), (SubLObject)module0684.$ic74$);
        }
        finally {
            module0015.$g533$.rebind(var6, var3);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)module0684.UNPROVIDED);
        return (SubLObject)module0684.NIL;
    }
    
    public static SubLObject f41947() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0642.f39085((SubLObject)module0684.$ic75$);
        module0016.f920((SubLObject)module0684.$ic76$, (SubLObject)module0684.$ic68$, (SubLObject)module0684.$ic69$);
        final SubLObject var4 = (SubLObject)module0684.FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0684.NIL != var4) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39020(var4);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0684.UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)module0684.T, var3);
            module0683.f41676((SubLObject)module0684.$ic77$, (SubLObject)module0684.$ic78$, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var5, var3);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0016.f908((SubLObject)module0684.$ic76$, (SubLObject)module0684.$ic79$, (SubLObject)module0684.$ic73$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        module0642.f39020((SubLObject)module0684.$ic76$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0684.UNPROVIDED);
        final SubLObject var6 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)module0684.T, var3);
            SubLObject var8;
            final SubLObject var7 = var8 = module0682.f41629(module0682.f41665());
            SubLObject var9 = (SubLObject)module0684.NIL;
            var9 = var8.first();
            while (module0684.NIL != var8) {
                module0642.f39026((SubLObject)module0684.UNPROVIDED);
                module0642.f39068((SubLObject)module0684.$ic80$, var9, (SubLObject)module0684.T, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
                module0642.f39032((SubLObject)module0684.TWO_INTEGER);
                module0656.f39804(var9, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
                var8 = var8.rest();
                var9 = var8.first();
            }
            module0642.f39026((SubLObject)module0684.UNPROVIDED);
            module0642.f39021((SubLObject)module0684.$ic81$);
            module0642.f39026((SubLObject)module0684.UNPROVIDED);
            module0642.f39020(module0015.$g336$.getGlobalValue());
            module0642.f39020(module0015.$g338$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39020((SubLObject)module0684.$ic82$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39020(module0015.$g340$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39020((SubLObject)module0684.$ic83$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39020(module0015.$g339$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39020((SubLObject)module0684.THREE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39020(module0015.$g350$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39020((SubLObject)module0684.$ic84$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0684.UNPROVIDED);
            final SubLObject var10_35 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)module0684.T, var3);
                module0642.f39019((SubLObject)module0684.$ic85$);
            }
            finally {
                module0015.$g533$.rebind(var10_35, var3);
            }
            module0642.f39020(module0015.$g337$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var6, var3);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)module0684.UNPROVIDED);
        return (SubLObject)module0684.NIL;
    }
    
    public static SubLObject f41948() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0642.f39085((SubLObject)module0684.$ic44$);
        module0016.f920((SubLObject)module0684.$ic86$, (SubLObject)module0684.$ic68$, (SubLObject)module0684.$ic69$);
        final SubLObject var4 = (SubLObject)module0684.FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0684.NIL != var4) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39020(var4);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0684.UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)module0684.T, var3);
            module0683.f41676((SubLObject)module0684.$ic87$, (SubLObject)module0684.$ic88$, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var5, var3);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0016.f908((SubLObject)module0684.$ic86$, (SubLObject)module0684.$ic79$, (SubLObject)module0684.$ic73$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        module0642.f39020((SubLObject)module0684.$ic86$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0684.UNPROVIDED);
        final SubLObject var6 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)module0684.T, var3);
            final SubLObject var7 = module0682.f41662(module0682.f41665());
            module0642.f39026((SubLObject)module0684.UNPROVIDED);
            module0656.f39804(var7, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var6, var3);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)module0684.UNPROVIDED);
        return (SubLObject)module0684.NIL;
    }
    
    public static SubLObject f41949() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0642.f39085((SubLObject)module0684.$ic47$);
        module0016.f920((SubLObject)module0684.$ic89$, (SubLObject)module0684.$ic68$, (SubLObject)module0684.$ic69$);
        final SubLObject var4 = (SubLObject)module0684.FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0684.NIL != var4) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39020(var4);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0684.UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)module0684.T, var3);
            module0683.f41676((SubLObject)module0684.$ic90$, (SubLObject)module0684.$ic91$, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var5, var3);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0016.f908((SubLObject)module0684.$ic89$, (SubLObject)module0684.$ic79$, (SubLObject)module0684.$ic73$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        module0642.f39020((SubLObject)module0684.$ic89$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0684.UNPROVIDED);
        final SubLObject var6 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)module0684.T, var3);
            final SubLObject var7 = module0682.f41660(module0682.f41665());
            module0642.f39026((SubLObject)module0684.UNPROVIDED);
            module0656.f39804(var7, (SubLObject)module0684.ZERO_INTEGER, (SubLObject)module0684.T);
        }
        finally {
            module0015.$g533$.rebind(var6, var3);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)module0684.UNPROVIDED);
        return (SubLObject)module0684.NIL;
    }
    
    public static SubLObject f41950() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0642.f39085((SubLObject)module0684.$ic92$);
        module0016.f920((SubLObject)module0684.$ic93$, (SubLObject)module0684.$ic68$, (SubLObject)module0684.$ic69$);
        final SubLObject var4 = (SubLObject)module0684.FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0684.NIL != var4) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39020(var4);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0684.UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)module0684.T, var3);
            module0683.f41676((SubLObject)module0684.$ic94$, (SubLObject)module0684.$ic95$, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var5, var3);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        final SubLObject var6 = module0682.f41639(module0682.f41665());
        final SubLObject var7 = (SubLObject)((module0684.NIL != module0206.f13425(var6)) ? module0684.$ic79$ : module0684.$ic70$);
        module0016.f908((SubLObject)module0684.$ic93$, var7, (SubLObject)module0684.$ic73$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        module0642.f39020((SubLObject)module0684.$ic93$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0684.UNPROVIDED);
        final SubLObject var8 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)module0684.T, var3);
            module0642.f39026((SubLObject)module0684.UNPROVIDED);
            module0656.f39804(var6, (SubLObject)module0684.ZERO_INTEGER, (SubLObject)module0684.T);
        }
        finally {
            module0015.$g533$.rebind(var8, var3);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)module0684.UNPROVIDED);
        return (SubLObject)module0684.NIL;
    }
    
    public static SubLObject f41945(SubLObject var37) {
        if (var37 == module0684.UNPROVIDED) {
            var37 = (SubLObject)module0684.T;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        final SubLObject var39 = module0682.f41638(module0682.f41665());
        if (module0684.NIL != var37) {
            return module0683.f41730((SubLObject)module0684.NIL, var39);
        }
        module0016.f920((SubLObject)module0684.$ic96$, (SubLObject)module0684.$ic68$, (SubLObject)module0684.$ic69$);
        final SubLObject var40 = (SubLObject)module0684.FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0684.NIL != var40) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39020(var40);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0684.UNPROVIDED);
        final SubLObject var41 = module0015.$g533$.currentBinding(var38);
        try {
            module0015.$g533$.bind((SubLObject)module0684.T, var38);
            module0683.f41676((SubLObject)module0684.$ic97$, (SubLObject)module0684.$ic98$, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var41, var38);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0016.f908((SubLObject)module0684.$ic96$, (SubLObject)module0684.$ic70$, (SubLObject)module0684.$ic73$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        module0642.f39020((SubLObject)module0684.$ic96$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0684.UNPROVIDED);
        final SubLObject var42 = module0015.$g533$.currentBinding(var38);
        try {
            module0015.$g533$.bind((SubLObject)module0684.T, var38);
            module0642.f39026((SubLObject)module0684.UNPROVIDED);
            module0683.f41750((SubLObject)module0684.NIL, (SubLObject)module0684.NIL, (SubLObject)module0684.NIL, var39);
            module0642.f39026((SubLObject)module0684.UNPROVIDED);
            module0683.f41753((SubLObject)module0684.NIL, (SubLObject)module0684.NIL, (SubLObject)module0684.NIL, var39, (SubLObject)module0684.UNPROVIDED);
            module0642.f39026((SubLObject)module0684.UNPROVIDED);
            module0683.f41754((SubLObject)module0684.NIL, (SubLObject)module0684.NIL, (SubLObject)module0684.NIL, var39, (SubLObject)module0684.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var42, var38);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)module0684.UNPROVIDED);
        return (SubLObject)module0684.NIL;
    }
    
    public static SubLObject f41946(final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        module0642.f39085((SubLObject)module0684.$ic53$);
        module0016.f920((SubLObject)module0684.$ic99$, (SubLObject)module0684.$ic68$, (SubLObject)module0684.$ic69$);
        final SubLObject var41 = (SubLObject)module0684.FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0684.NIL != var41) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39020(var41);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0684.UNPROVIDED);
        final SubLObject var42 = module0015.$g533$.currentBinding(var40);
        try {
            module0015.$g533$.bind((SubLObject)module0684.T, var40);
            module0683.f41676((SubLObject)module0684.$ic100$, (SubLObject)module0684.$ic55$, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var42, var40);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0016.f908((SubLObject)module0684.$ic99$, (SubLObject)module0684.$ic79$, (SubLObject)module0684.$ic73$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        module0642.f39020((SubLObject)module0684.$ic99$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0684.UNPROVIDED);
        final SubLObject var43 = module0015.$g533$.currentBinding(var40);
        try {
            module0015.$g533$.bind((SubLObject)module0684.T, var40);
            final SubLObject var44 = module0682.f41660(var39);
            SubLObject var45;
            SubLObject var46;
            SubLObject var47;
            SubLObject var48;
            SubLObject var49;
            SubLObject var50;
            SubLObject var51;
            SubLObject var52;
            SubLObject var54;
            SubLObject var53;
            SubLObject var55;
            SubLObject var56;
            SubLObject var57;
            SubLObject var58;
            SubLObject var59;
            SubLObject var60;
            SubLObject var61;
            SubLObject var62;
            SubLObject var63;
            SubLObject var64;
            SubLObject var65;
            for (var45 = (SubLObject)module0684.NIL, var45 = (SubLObject)module0684.ZERO_INTEGER; var45.numL(module0684.$g5386$.getGlobalValue()); var45 = Numbers.add(var45, (SubLObject)module0684.ONE_INTEGER)) {
                var46 = Sequences.cconcatenate((SubLObject)module0684.$ic101$, new SubLObject[] { module0006.f203(var45), module0684.$ic102$ });
                var47 = Sequences.cconcatenate((SubLObject)module0684.$ic103$, new SubLObject[] { module0006.f203(var45), module0684.$ic102$ });
                var48 = Sequences.cconcatenate((SubLObject)module0684.$ic104$, new SubLObject[] { module0006.f203(var45), module0684.$ic102$ });
                var49 = module0682.f41627(var39);
                var50 = (SubLObject)((module0684.NIL != var49) ? module0423.f29585(var49, var45) : module0684.NIL);
                var51 = (SubLObject)module0684.$ic85$;
                var52 = (SubLObject)module0684.$ic85$;
                if (module0684.NIL != var50) {
                    var53 = (var54 = var50);
                    var55 = (SubLObject)module0684.NIL;
                    var56 = (SubLObject)module0684.NIL;
                    var57 = (SubLObject)module0684.NIL;
                    var58 = (SubLObject)module0684.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0684.$ic105$);
                    var55 = var54.first();
                    var54 = var54.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0684.$ic105$);
                    var56 = var54.first();
                    var54 = var54.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0684.$ic105$);
                    var57 = var54.first();
                    var54 = var54.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0684.$ic105$);
                    var58 = var54.first();
                    var54 = var54.rest();
                    if (module0684.NIL == var54) {
                        var51 = var56;
                        var52 = var57;
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var53, (SubLObject)module0684.$ic105$);
                    }
                }
                else {
                    var52 = (var51 = Sequences.cconcatenate((SubLObject)module0684.$ic106$, new SubLObject[] { module0006.f203(module0038.f2964(var45)), module0684.$ic107$ }));
                }
                module0642.f39026((SubLObject)module0684.UNPROVIDED);
                module0642.f39020(module0015.$g234$.getGlobalValue());
                PrintLow.format(module0015.$g131$.getDynamicValue(var40), (SubLObject)module0684.$ic108$);
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39075(var46, module0038.f2638(module0048.f_1X(var45)), (SubLObject)module0684.ONE_INTEGER);
                module0642.f39032((SubLObject)module0684.TWO_INTEGER);
                module0683.f41674((SubLObject)module0684.$ic109$, (SubLObject)module0684.$ic110$, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
                module0642.f39075(var47, var51, (SubLObject)module0684.$ic111$);
                module0642.f39032((SubLObject)module0684.TWO_INTEGER);
                module0683.f41674((SubLObject)module0684.$ic112$, (SubLObject)module0684.$ic113$, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
                module0642.f39075(var48, var52, (SubLObject)module0684.FIVE_INTEGER);
                module0642.f39032((SubLObject)module0684.TWO_INTEGER);
                var59 = ((module0684.NIL != module0202.f12597(var44)) ? module0202.f12966(var44, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED) : module0202.f12911(var44, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED));
                var60 = (SubLObject)((module0684.NIL != var50) ? conses_high.fourth(var50) : module0684.NIL);
                if (!module0233.f15372(var60).equal(var59)) {
                    var60 = (SubLObject)module0684.NIL;
                }
                var61 = (SubLObject)module0684.NIL;
                var62 = (SubLObject)module0684.NIL;
                var63 = (SubLObject)module0684.NIL;
                var61 = var59;
                var62 = var61.first();
                for (var63 = (SubLObject)module0684.ZERO_INTEGER; module0684.NIL != var61; var61 = var61.rest(), var62 = var61.first(), var63 = Numbers.add((SubLObject)module0684.ONE_INTEGER, var63)) {
                    var64 = Sequences.cconcatenate((SubLObject)module0684.$ic114$, new SubLObject[] { module0006.f203(var45), module0684.$ic115$, module0006.f203(var63) });
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    PrintLow.format(module0015.$g131$.getDynamicValue(var40), (SubLObject)module0684.$ic116$, var62);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    var65 = module0035.f2293(var60, var62, Symbols.symbol_function((SubLObject)module0684.EQL), (SubLObject)module0684.$ic85$);
                    module0642.f39079(var64, var65, (SubLObject)module0684.$ic111$, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
                }
            }
        }
        finally {
            module0015.$g533$.rebind(var43, var40);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)module0684.UNPROVIDED);
        return (SubLObject)module0684.NIL;
    }
    
    public static SubLObject f41943() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0684.NIL != module0682.f41663(module0682.f41665())) {
            module0642.f39020(module0015.$g219$.getGlobalValue());
            module0642.f39020(module0015.$g222$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39020(module0642.f39042((SubLObject)module0684.$ic117$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0684.UNPROVIDED);
            final SubLObject var4 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)module0684.T, var3);
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019((SubLObject)module0684.$ic118$);
                module0642.f39067();
                SubLObject var5 = module0682.f41663(module0682.f41665());
                SubLObject var6 = (SubLObject)module0684.NIL;
                var6 = var5.first();
                while (module0684.NIL != var5) {
                    module0656.f39804(var6, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
                    module0642.f39067();
                    var5 = var5.rest();
                    var6 = var5.first();
                }
                module0642.f39020(module0015.$g235$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4, var3);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
        }
        return (SubLObject)module0684.NIL;
    }
    
    public static SubLObject f41944() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0684.NIL != module0682.f41661(module0682.f41665())) {
            module0642.f39067();
            module0642.f39020(module0015.$g219$.getGlobalValue());
            module0642.f39020(module0015.$g222$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39020(module0642.f39042((SubLObject)module0684.$ic117$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0684.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0684.UNPROVIDED);
            final SubLObject var4 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)module0684.T, var3);
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019((SubLObject)module0684.$ic119$);
                module0642.f39067();
                SubLObject var5 = module0682.f41661(module0682.f41665());
                SubLObject var6 = (SubLObject)module0684.NIL;
                var6 = var5.first();
                while (module0684.NIL != var5) {
                    module0656.f39804(var6, (SubLObject)module0684.ZERO_INTEGER, (SubLObject)module0684.T);
                    module0642.f39067();
                    var5 = var5.rest();
                    var6 = var5.first();
                }
                module0642.f39020(module0015.$g235$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4, var3);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
        }
        return (SubLObject)module0684.NIL;
    }
    
    public static SubLObject f41951(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = f41952(var11);
        final SubLObject var14 = module0682.f41627(module0682.f41665());
        final SubLObject var15 = f41953(var11);
        var12.resetMultipleValues();
        final SubLObject var16 = f41954(var11);
        final SubLObject var17 = var12.secondMultipleValue();
        var12.resetMultipleValues();
        if (module0684.NIL != var17) {
            return module0656.f39789((SubLObject)module0684.$ic120$, var17, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        }
        var12.resetMultipleValues();
        final SubLObject var18 = f41955(var11);
        final SubLObject var19 = var12.secondMultipleValue();
        var12.resetMultipleValues();
        if (module0684.NIL != var19) {
            return module0656.f39789((SubLObject)module0684.$ic120$, var19, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        }
        var12.resetMultipleValues();
        final SubLObject var20 = module0683.f41792(var11, (SubLObject)module0684.NIL, (SubLObject)module0684.UNPROVIDED);
        final SubLObject var21 = var12.secondMultipleValue();
        var12.resetMultipleValues();
        if (module0684.NIL != var21) {
            return module0656.f39789((SubLObject)module0684.$ic120$, var21, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        }
        var12.resetMultipleValues();
        final SubLObject var22 = module0657.f40003(var11, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        final SubLObject var23 = var12.secondMultipleValue();
        final SubLObject var24 = var12.thirdMultipleValue();
        var12.resetMultipleValues();
        if (module0684.NIL != var23) {
            module0657.f40013(var23, var24);
            return (SubLObject)module0684.NIL;
        }
        var12.resetMultipleValues();
        final SubLObject var25 = module0657.f40022(var11, (SubLObject)module0684.$ic121$);
        final SubLObject var26 = var12.secondMultipleValue();
        final SubLObject var27 = var12.thirdMultipleValue();
        var12.resetMultipleValues();
        if (module0684.NIL != var26) {
            return module0657.f40031(var26, var27, (SubLObject)module0684.UNPROVIDED);
        }
        var12.resetMultipleValues();
        final SubLObject var28 = module0657.f40022(var11, (SubLObject)module0684.$ic122$);
        final SubLObject var29 = var12.secondMultipleValue();
        final SubLObject var30 = var12.thirdMultipleValue();
        var12.resetMultipleValues();
        if (module0684.NIL != var29) {
            return module0657.f40031(var29, var30, (SubLObject)module0684.$ic123$);
        }
        var12.resetMultipleValues();
        final SubLObject var31 = f41956(var11);
        final SubLObject var32 = var12.secondMultipleValue();
        var12.resetMultipleValues();
        if (module0684.NIL != var32) {
            return module0656.f39789((SubLObject)module0684.$ic120$, var32, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        }
        final SubLObject var33 = f41957(var11, var25);
        module0682.f41641(module0682.f41665(), var14);
        module0682.f41651(module0682.f41665(), var15);
        module0682.f41642(module0682.f41665(), var16);
        module0682.f41645(module0682.f41665(), var18);
        module0682.f41652(module0682.f41665(), var20);
        module0682.f41648(module0682.f41665(), (SubLObject)ConsesLow.list(var22));
        module0682.f41647(module0682.f41665(), (SubLObject)ConsesLow.list(var25));
        module0682.f41653(module0682.f41665(), var28);
        module0682.f41650(module0682.f41665(), var31);
        module0682.f41654(module0682.f41665(), var33);
        final SubLObject var34 = var13;
        if (var34.eql((SubLObject)module0684.$ic124$)) {
            return f41958(module0682.f41665(), (SubLObject)module0684.UNPROVIDED);
        }
        if (var34.eql((SubLObject)module0684.$ic125$)) {
            return f41959(module0682.f41665());
        }
        return module0656.f39789((SubLObject)module0684.$ic126$, var13, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
    }
    
    public static SubLObject f41952(final SubLObject var11) {
        if (module0684.NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)module0684.$ic58$, var11))) {
            return (SubLObject)module0684.$ic124$;
        }
        if (module0684.NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)module0684.$ic65$, var11))) {
            return (SubLObject)module0684.$ic125$;
        }
        return (SubLObject)module0684.$ic128$;
    }
    
    public static SubLObject f41960(final SubLObject var11) {
        final SubLObject var12 = module0642.f39104((SubLObject)module0684.$ic129$, var11);
        final SubLObject var13 = module0656.f39943(var12, (SubLObject)module0684.UNPROVIDED);
        return var13;
    }
    
    public static SubLObject f41954(final SubLObject var11) {
        final SubLObject var12 = module0038.f2735(module0642.f39104((SubLObject)module0684.$ic61$, var11));
        SubLObject var13 = (SubLObject)module0684.NIL;
        if (!var12.isString() || var12.equal((SubLObject)module0684.$ic85$)) {
            var13 = (SubLObject)module0684.$ic130$;
        }
        return Values.values(var12, var13);
    }
    
    public static SubLObject f41955(final SubLObject var11) {
        return module0657.f40003(var11, (SubLObject)module0684.NIL, (SubLObject)module0684.$ic74$);
    }
    
    public static SubLObject f41953(final SubLObject var11) {
        SubLObject var12 = module0642.f39109((SubLObject)module0684.$ic131$, var11);
        final SubLObject var13 = module0642.f39104((SubLObject)module0684.$ic132$, var11);
        if (module0684.NIL == module0038.f2610(var13)) {
            var12 = (SubLObject)ConsesLow.cons(var13, var12);
        }
        return var12;
    }
    
    public static SubLObject f41956(final SubLObject var11) {
        final SubLObject var12 = module0642.f39109((SubLObject)module0684.$ic133$, var11);
        final SubLObject var13 = module0656.f39983((SubLObject)module0684.$ic134$, var11);
        final SubLObject var14 = module0656.f39983((SubLObject)module0684.$ic135$, var11);
        SubLObject var15 = (SubLObject)module0684.NIL;
        final SubLObject var16 = (SubLObject)module0684.NIL;
        SubLObject var17 = var12;
        SubLObject var18 = (SubLObject)module0684.NIL;
        var18 = var17.first();
        while (module0684.NIL != var17) {
            final SubLObject var19 = module0038.f2661(var18, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
            SubLObject var21;
            final SubLObject var20 = var21 = var19;
            SubLObject var22 = (SubLObject)module0684.NIL;
            SubLObject var23 = (SubLObject)module0684.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0684.$ic136$);
            var22 = var21.first();
            var21 = var21.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0684.$ic136$);
            var23 = var21.first();
            var21 = var21.rest();
            if (module0684.NIL == var21) {
                if (module0684.NIL != module0656.f39933(var22) && module0684.NIL != module0656.f39933(var23)) {
                    final SubLObject var24 = module0656.f39943(var22, (SubLObject)module0684.UNPROVIDED);
                    final SubLObject var25 = module0656.f39943(var23, (SubLObject)module0684.UNPROVIDED);
                    if (module0684.NIL != module0173.f10955(var24) && module0684.NIL != module0173.f10955(var25)) {
                        final SubLObject var26 = (SubLObject)ConsesLow.list(var24, var25);
                        if (module0684.NIL == conses_high.member(var26, var15, Symbols.symbol_function((SubLObject)module0684.EQUAL), Symbols.symbol_function((SubLObject)module0684.IDENTITY))) {
                            var15 = (SubLObject)ConsesLow.cons(var26, var15);
                        }
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0684.$ic136$);
            }
            var17 = var17.rest();
            var18 = var17.first();
        }
        if (module0684.NIL == module0656.f39984(var13) && module0684.NIL == module0656.f39984(var14) && module0684.NIL != module0173.f10955(var13) && module0684.NIL != module0173.f10955(var14)) {
            final SubLObject var27 = (SubLObject)ConsesLow.list(var13, var14);
            if (module0684.NIL == conses_high.member(var27, var15, Symbols.symbol_function((SubLObject)module0684.EQUAL), Symbols.symbol_function((SubLObject)module0684.IDENTITY))) {
                var15 = (SubLObject)ConsesLow.cons(var27, var15);
            }
        }
        return Values.values(var15, var16);
    }
    
    public static SubLObject f41957(final SubLObject var11, final SubLObject var4) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)module0684.NIL;
        final SubLObject var14 = module0067.f4880(Symbols.symbol_function((SubLObject)module0684.EQ), (SubLObject)module0684.UNPROVIDED);
        SubLObject var15 = var11;
        SubLObject var16 = (SubLObject)module0684.NIL;
        var16 = var15.first();
        while (module0684.NIL != var15) {
            if (module0684.NIL != module0035.f1998(var16)) {
                SubLObject var18;
                final SubLObject var17 = var18 = var16;
                SubLObject var19 = (SubLObject)module0684.NIL;
                SubLObject var20 = (SubLObject)module0684.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)module0684.$ic137$);
                var19 = var18.first();
                var18 = var18.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)module0684.$ic137$);
                var20 = var18.first();
                var18 = var18.rest();
                if (module0684.NIL == var18) {
                    if (module0684.NIL != module0038.f2684(var19, (SubLObject)module0684.$ic138$) && module0684.NIL == module0038.f2608(var20)) {
                        final SubLObject var21 = module0038.f2752(var19, (SubLObject)module0684.$ic139$);
                        SubLObject var102_103;
                        final SubLObject var100_101 = var102_103 = var21;
                        SubLObject var22 = (SubLObject)module0684.NIL;
                        SubLObject var23 = (SubLObject)module0684.NIL;
                        SubLObject var24 = (SubLObject)module0684.NIL;
                        SubLObject var25 = (SubLObject)module0684.NIL;
                        SubLObject var26 = (SubLObject)module0684.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var102_103, var100_101, (SubLObject)module0684.$ic140$);
                        var22 = var102_103.first();
                        var102_103 = var102_103.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var102_103, var100_101, (SubLObject)module0684.$ic140$);
                        var23 = var102_103.first();
                        var102_103 = var102_103.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var102_103, var100_101, (SubLObject)module0684.$ic140$);
                        var24 = var102_103.first();
                        var102_103 = var102_103.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var102_103, var100_101, (SubLObject)module0684.$ic140$);
                        var25 = var102_103.first();
                        var102_103 = var102_103.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var102_103, var100_101, (SubLObject)module0684.$ic140$);
                        var26 = var102_103.first();
                        var102_103 = var102_103.rest();
                        if (module0684.NIL == var102_103) {
                            final SubLObject var27 = reader.read_from_string_ignoring_errors(var25, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
                            final SubLObject var28 = reader.read_from_string_ignoring_errors(var26, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
                            if (module0684.$ic141$.equal(var24)) {
                                module0084.f5770(var14, var27, (SubLObject)module0684.$ic142$, reader.read_from_string_ignoring_errors(var20, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED));
                            }
                            else if (module0684.$ic143$.equal(var24)) {
                                var13 = (SubLObject)module0684.T;
                                module0084.f5770(var14, var27, (SubLObject)module0684.$ic144$, var20);
                            }
                            else if (module0684.$ic145$.equal(var24)) {
                                var13 = (SubLObject)module0684.T;
                                module0084.f5770(var14, var27, (SubLObject)module0684.$ic146$, var20);
                            }
                            else if (module0684.$ic147$.equal(var24)) {
                                var13 = (SubLObject)module0684.T;
                                final SubLObject var29 = Symbols.make_keyword(Sequences.cconcatenate((SubLObject)module0684.$ic148$, module0038.f2638(var28)));
                                module0084.f5770(var14, var27, var29, var20);
                            }
                            else {
                                Errors.warn((SubLObject)module0684.$ic149$, var19);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var100_101, (SubLObject)module0684.$ic140$);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)module0684.$ic137$);
                }
            }
            var15 = var15.rest();
            var16 = var15.first();
        }
        if (module0684.NIL != var13) {
            SubLObject var30 = (SubLObject)module0684.NIL;
            final SubLObject var31 = (module0684.NIL != module0202.f12597(var4)) ? module0202.f12966(var4, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED) : module0202.f12911(var4, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
            SubLObject var32;
            for (var32 = module0066.f4838(module0067.f4891(var14)); module0684.NIL == module0066.f4841(var32); var32 = module0066.f4840(var32)) {
                var12.resetMultipleValues();
                final SubLObject var33 = module0066.f4839(var32);
                final SubLObject var34 = var12.secondMultipleValue();
                var12.resetMultipleValues();
                final SubLObject var35 = module0035.f2335(var34, (SubLObject)module0684.$ic142$, (SubLObject)module0684.UNPROVIDED);
                final SubLObject var36 = module0035.f2335(var34, (SubLObject)module0684.$ic144$, (SubLObject)module0684.UNPROVIDED);
                final SubLObject var37 = module0035.f2335(var34, (SubLObject)module0684.$ic146$, (SubLObject)module0684.UNPROVIDED);
                SubLObject var38 = (SubLObject)module0684.NIL;
                SubLObject var39 = (SubLObject)module0684.ZERO_INTEGER;
                SubLObject var40 = (SubLObject)module0684.NIL;
                while (module0684.NIL == var40) {
                    final SubLObject var41 = Symbols.make_keyword(Sequences.cconcatenate((SubLObject)module0684.$ic148$, module0038.f2638(var39)));
                    final SubLObject var42 = ConsesLow.nth(var39, var31);
                    SubLObject var43 = module0035.f2335(var34, var41, (SubLObject)module0684.$ic150$);
                    if (module0684.$ic150$ == var43) {
                        var40 = (SubLObject)module0684.T;
                    }
                    else if (module0684.NIL == module0038.f2608(var43)) {
                        var43 = reader.read_from_string_ignoring_errors(module0038.f2933(var43), (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
                        var38 = (SubLObject)ConsesLow.cons(module0233.f15340(var42, var43), var38);
                    }
                    var39 = Numbers.add(var39, (SubLObject)module0684.ONE_INTEGER);
                }
                final SubLObject var44 = (SubLObject)((module0684.NIL != var38) ? module0233.f15411((SubLObject)ConsesLow.list(var38)) : module0684.NIL);
                var30 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var35, var36, var37, var44), var30);
            }
            module0066.f4842(var32);
            return Sort.sort(var30, Symbols.symbol_function((SubLObject)module0684.$ic151$), Symbols.symbol_function((SubLObject)module0684.$ic152$));
        }
        return (SubLObject)module0684.NIL;
    }
    
    public static SubLObject f41958(final SubLObject var39, SubLObject var121) {
        if (var121 == module0684.UNPROVIDED) {
            var121 = (SubLObject)module0684.NIL;
        }
        if (module0684.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0684.$ic153$);
            return (SubLObject)module0684.NIL;
        }
        if (module0684.NIL == module0126.f8389(module0682.f41628(var39))) {
            return module0656.f39789((SubLObject)module0684.$ic154$, module0682.f41628(var39), (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        }
        final SubLObject var122 = constants_high_oc.f10737(module0682.f41628(var39));
        SubLObject var123 = (SubLObject)module0684.NIL;
        if (module0684.NIL != var122) {
            return module0656.f39789((SubLObject)module0684.$ic155$, module0682.f41628(var39), (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        }
        final SubLObject var124 = module0126.f8393(module0682.f41628(var39), (SubLObject)module0684.NIL, (SubLObject)module0684.T, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        if (module0684.NIL != var124) {
            return module0656.f39789((SubLObject)module0684.$ic156$, var124.first(), module0682.f41628(var39), (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        }
        var123 = module0673.f41078(module0682.f41628(var39));
        module0682.f41641(var39, var123);
        module0423.f29533(module0682.f41627(var39), module0682.f41660(var39), module0682.f41662(var39), module0412.f28669(module0682.f41638(var39), module0682.f41660(var39)), module0682.f41631(var39), module0682.f41639(var39), module0682.f41640(var39));
        module0423.f29554(module0682.f41627(var39), module0682.f41635(var39), module0682.f41637(var39), module0682.f41636(var39), module0682.f41631(var39));
        if (module0684.NIL != constant_handles_oc.f8449(var123)) {
            module0677.f41359(var123);
        }
        else if (module0684.NIL != module0167.f10813(var123)) {
            module0677.f41360(var123);
        }
        if (module0684.NIL != var121) {
            module0656.f39804(var123, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        }
        else {
            module0674.f41154((SubLObject)module0684.$ic153$, (SubLObject)module0684.T, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        }
        return (SubLObject)module0684.NIL;
    }
    
    public static SubLObject f41959(final SubLObject var39) {
        if (module0684.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0684.$ic157$);
            return (SubLObject)module0684.NIL;
        }
        final SubLObject var40 = module0682.f41628(var39);
        if (module0684.NIL != var40) {
            final SubLObject var41 = module0656.f39957(var40, (SubLObject)module0684.UNPROVIDED);
            if (module0684.NIL == module0423.f29532(var41)) {
                return module0656.f39789((SubLObject)module0684.$ic158$, var40, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
            }
            module0682.f41641(var39, var41);
        }
        final SubLObject var42 = module0682.f41627(var39);
        final SubLObject var43 = module0682.f41660(var39);
        final SubLObject var44 = module0682.f41639(var39);
        final SubLObject var45 = module0682.f41662(var39);
        final SubLObject var46 = module0682.f41638(var39);
        final SubLObject var47 = module0682.f41631(var39);
        final SubLObject var48 = module0682.f41635(var39);
        final SubLObject var49 = module0682.f41637(var39);
        final SubLObject var50 = module0682.f41636(var39);
        final SubLObject var51 = module0682.f41640(var39);
        module0423.f29539(var42, var43, var45, module0412.f28669(var46, var43), var47, var44, var51);
        module0423.f29558(var42, var48, var49, var50, var47);
        module0674.f41154((SubLObject)module0684.$ic34$, (SubLObject)module0684.T, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED);
        return (SubLObject)module0684.NIL;
    }
    
    public static SubLObject f41961() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41926", "S#45674", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41927", "S#45671", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41928", "S#45616", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41929", "S#45928", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41930", "S#45929", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41931", "CB-ASK-KB-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41932", "S#45930", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41934", "S#45931", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41935", "CB-ASK-KB-QUERY-IN-PROOF-CHECKER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41933", "S#32654", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41936", "S#45932", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41937", "CB-SAVE-AS-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41939", "S#45933", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41940", "CB-EDIT-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41938", "S#45934", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41941", "S#45935", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41942", "S#45936", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41947", "S#45937", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41948", "S#45938", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41949", "S#45939", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41950", "S#45940", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41945", "S#45941", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41946", "S#45942", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41943", "S#45943", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41944", "S#45944", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41951", "CB-HANDLE-CONFIRM-SAVE-AS-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41952", "S#45945", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41960", "S#45946", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41954", "S#45947", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41955", "S#45948", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41953", "S#45949", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41956", "S#45950", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41957", "S#45951", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41958", "S#45685", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0684", "f41959", "S#45952", 1, 0, false);
        return (SubLObject)module0684.NIL;
    }
    
    public static SubLObject f41962() {
        module0684.$g5385$ = SubLFiles.defparameter("S#45953", Hashtables.make_hash_table((SubLObject)module0684.$ic0$, (SubLObject)module0684.UNPROVIDED, (SubLObject)module0684.UNPROVIDED));
        module0684.$g5386$ = SubLFiles.deflexical("S#45954", (SubLObject)module0684.FIVE_INTEGER);
        return (SubLObject)module0684.NIL;
    }
    
    public static SubLObject f41963() {
        module0656.f39840((SubLObject)module0684.$ic6$, (SubLObject)module0684.$ic7$, (SubLObject)module0684.TWO_INTEGER);
        module0015.f873((SubLObject)module0684.$ic8$);
        module0656.f39840((SubLObject)module0684.$ic13$, (SubLObject)module0684.$ic14$, (SubLObject)module0684.TWO_INTEGER);
        module0015.f873((SubLObject)module0684.$ic15$);
        module0656.f39840((SubLObject)module0684.$ic22$, (SubLObject)module0684.$ic23$, (SubLObject)module0684.TWO_INTEGER);
        module0015.f873((SubLObject)module0684.$ic26$);
        module0656.f39840((SubLObject)module0684.$ic30$, (SubLObject)module0684.$ic31$, (SubLObject)module0684.TWO_INTEGER);
        module0015.f873((SubLObject)module0684.$ic33$);
        module0015.f873((SubLObject)module0684.$ic127$);
        return (SubLObject)module0684.NIL;
    }
    
    public void declareFunctions() {
        f41961();
    }
    
    public void initializeVariables() {
        f41962();
    }
    
    public void runTopLevelForms() {
        f41963();
    }
    
    static {
        me = (SubLFile)new module0684();
        module0684.$g5385$ = null;
        module0684.$g5386$ = null;
        $ic0$ = SubLObjectFactory.makeInteger(1024);
        $ic1$ = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $ic2$ = SubLObjectFactory.makeSymbol("S#32663", "CYC");
        $ic3$ = SubLObjectFactory.makeString("[Ask Query]");
        $ic4$ = SubLObjectFactory.makeKeyword("MAIN");
        $ic5$ = SubLObjectFactory.makeString("cb-ask-kb-query&~a");
        $ic6$ = SubLObjectFactory.makeKeyword("KBQ-ASK");
        $ic7$ = SubLObjectFactory.makeSymbol("S#45929", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("CB-ASK-KB-QUERY");
        $ic9$ = SubLObjectFactory.makeSymbol("S#45256", "CYC");
        $ic10$ = SubLObjectFactory.makeKeyword("ALLOWED-RULES");
        $ic11$ = SubLObjectFactory.makeString("[Proof-check Query]");
        $ic12$ = SubLObjectFactory.makeString("cb-ask-kb-query-in-proof-checker&~a");
        $ic13$ = SubLObjectFactory.makeKeyword("KBQ-ASK-IN-PROOF-CHECKER");
        $ic14$ = SubLObjectFactory.makeSymbol("S#45931", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("CB-ASK-KB-QUERY-IN-PROOF-CHECKER");
        $ic16$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("queryPracticeRules"));
        $ic17$ = SubLObjectFactory.makeString("[Save As Query]");
        $ic18$ = SubLObjectFactory.makeKeyword("SELF");
        $ic19$ = SubLObjectFactory.makeString("Create an instance of #$CycLQuerySpecification with the focal inference's sentence, microtheory and inference settings.");
        $ic20$ = SubLObjectFactory.makeString("cb-save-as-query&~A&~A");
        $ic21$ = SubLObjectFactory.makeString("nd();");
        $ic22$ = SubLObjectFactory.makeKeyword("KBQ-SAVE");
        $ic23$ = SubLObjectFactory.makeSymbol("S#45932", "CYC");
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#45911", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45912", "CYC"));
        $ic25$ = SubLObjectFactory.makeString("Inference ~S in problem store ~S is no longer available.");
        $ic26$ = SubLObjectFactory.makeSymbol("CB-SAVE-AS-QUERY");
        $ic27$ = SubLObjectFactory.makeString("[Edit Query]");
        $ic28$ = SubLObjectFactory.makeString("Edit the sentence, microtheory, inference settings, etc. for this instance of #$CycLQuerySpecification.");
        $ic29$ = SubLObjectFactory.makeString("cb-edit-query&~A");
        $ic30$ = SubLObjectFactory.makeKeyword("KBQ-EDIT");
        $ic31$ = SubLObjectFactory.makeSymbol("S#45933", "CYC");
        $ic32$ = SubLObjectFactory.makeString("~A does not denote a query specification");
        $ic33$ = SubLObjectFactory.makeSymbol("CB-EDIT-QUERY");
        $ic34$ = SubLObjectFactory.makeString("Edit Query Specification");
        $ic35$ = SubLObjectFactory.makeString("Save Inference Settings as Query Specification");
        $ic36$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic37$ = SubLObjectFactory.makeString("yui-skin-sam");
        $ic38$ = SubLObjectFactory.makeString("post");
        $ic39$ = SubLObjectFactory.makeString("cb-handle-confirm-save-as-query");
        $ic40$ = SubLObjectFactory.makeString("The interface for creating and editing CycLQuerySpecification instances.  Hover over the various headers for context-sensitive help.");
        $ic41$ = SubLObjectFactory.makeString("Save As Query");
        $ic42$ = SubLObjectFactory.makeString("Goto section :");
        $ic43$ = SubLObjectFactory.makeString("Shortcut links to sections that appear further down on this page.");
        $ic44$ = SubLObjectFactory.makeString("mt-section");
        $ic45$ = SubLObjectFactory.makeString("[Mt]");
        $ic46$ = SubLObjectFactory.makeString("Change the Microtheory settings to be used for the saved query.");
        $ic47$ = SubLObjectFactory.makeString("sentence-section");
        $ic48$ = SubLObjectFactory.makeString("[Sentence]");
        $ic49$ = SubLObjectFactory.makeString("Change the CycL sentence to be used for the saved query.");
        $ic50$ = SubLObjectFactory.makeString("parameters-section");
        $ic51$ = SubLObjectFactory.makeString("[Inference Parameters]");
        $ic52$ = SubLObjectFactory.makeString("Adjust the inference parameters and resource constraints that will be used when saving this query.");
        $ic53$ = SubLObjectFactory.makeString("multiple-choice-section");
        $ic54$ = SubLObjectFactory.makeString("[Multiple Choice]");
        $ic55$ = SubLObjectFactory.makeString("If this query is to be a multiple-choice query, define its multiple-choice options here.");
        $ic56$ = SubLObjectFactory.makeString("Save As New Query");
        $ic57$ = SubLObjectFactory.makeString("Creates a new #$CycLQuerySpecification instance, with the specified sentence, mt and inference settings.");
        $ic58$ = SubLObjectFactory.makeString("new");
        $ic59$ = SubLObjectFactory.makeString("Name: ");
        $ic60$ = SubLObjectFactory.makeString("The constant name to save the query specification as.");
        $ic61$ = SubLObjectFactory.makeString("name");
        $ic62$ = SubLObjectFactory.makeInteger(40);
        $ic63$ = SubLObjectFactory.makeString("Overwrite Existing Query");
        $ic64$ = SubLObjectFactory.makeString("Overwrites the existing query specification with the sentence, mt and inference settings specified here.");
        $ic65$ = SubLObjectFactory.makeString("overwrite");
        $ic66$ = SubLObjectFactory.makeString("Reset Values");
        $ic67$ = SubLObjectFactory.makeString("cb-kbq-save-mt");
        $ic68$ = SubLObjectFactory.makeString("Show");
        $ic69$ = SubLObjectFactory.makeString("Hide");
        $ic70$ = SubLObjectFactory.makeKeyword("INVISIBLE");
        $ic71$ = SubLObjectFactory.makeString("Save In Mt: ");
        $ic72$ = SubLObjectFactory.makeString("The microtheory in which to save the assertions about the query specification.  Should be a spec-mt of #$TestVocabularyMt.");
        $ic73$ = SubLObjectFactory.makeKeyword("PARAGRAPH");
        $ic74$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("defining-mt"));
        $ic75$ = SubLObjectFactory.makeString("comment-section");
        $ic76$ = SubLObjectFactory.makeString("query-comment");
        $ic77$ = SubLObjectFactory.makeString("Query Comment (optional)");
        $ic78$ = SubLObjectFactory.makeString("Specify a comment for the CycLQuerySpecification");
        $ic79$ = SubLObjectFactory.makeKeyword("VISIBLE");
        $ic80$ = SubLObjectFactory.makeString("comment");
        $ic81$ = SubLObjectFactory.makeString("Add a Comment: ");
        $ic82$ = SubLObjectFactory.makeString("new-comment");
        $ic83$ = SubLObjectFactory.makeInteger(80);
        $ic84$ = SubLObjectFactory.makeString("virtual");
        $ic85$ = SubLObjectFactory.makeString("");
        $ic86$ = SubLObjectFactory.makeString("cb-query-inference-mt");
        $ic87$ = SubLObjectFactory.makeString("Query Mt");
        $ic88$ = SubLObjectFactory.makeString("The microtheory in which the query will be performed.");
        $ic89$ = SubLObjectFactory.makeString("query-sentence");
        $ic90$ = SubLObjectFactory.makeString("Query Sentence");
        $ic91$ = SubLObjectFactory.makeString("The CycL Sentence for the query.");
        $ic92$ = SubLObjectFactory.makeString("pragmatics-section");
        $ic93$ = SubLObjectFactory.makeString("query-pragmatics");
        $ic94$ = SubLObjectFactory.makeString("Query Pragmatics");
        $ic95$ = SubLObjectFactory.makeString("An optional sentence that will constrain the query for pragmatic reasons.  Justifications for answers will not include this sentence.");
        $ic96$ = SubLObjectFactory.makeString("inference-parameters");
        $ic97$ = SubLObjectFactory.makeString("Inference Parameters");
        $ic98$ = SubLObjectFactory.makeString("The inference parameters and resource constraints that will be used when running the test query.");
        $ic99$ = SubLObjectFactory.makeString("multiple-choice");
        $ic100$ = SubLObjectFactory.makeString("Multiple Choice Options");
        $ic101$ = SubLObjectFactory.makeString("mc-option-number-");
        $ic102$ = SubLObjectFactory.makeString("-0");
        $ic103$ = SubLObjectFactory.makeString("mc-option-full_label-");
        $ic104$ = SubLObjectFactory.makeString("mc-option-index_label-");
        $ic105$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#45955", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45956", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45957", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45958", "CYC"));
        $ic106$ = SubLObjectFactory.makeString("(");
        $ic107$ = SubLObjectFactory.makeString(")");
        $ic108$ = SubLObjectFactory.makeString("Option # ");
        $ic109$ = SubLObjectFactory.makeString("Full label: ");
        $ic110$ = SubLObjectFactory.makeString("A label that fully describes this multiple choice option, e.g. (A) 26");
        $ic111$ = SubLObjectFactory.makeInteger(30);
        $ic112$ = SubLObjectFactory.makeString("Index label: ");
        $ic113$ = SubLObjectFactory.makeString("A label serving as a unique index for this multiple choice option, e.g. (A)");
        $ic114$ = SubLObjectFactory.makeString("mc-option-binding-");
        $ic115$ = SubLObjectFactory.makeString("-");
        $ic116$ = SubLObjectFactory.makeString("Binding for ~A: ");
        $ic117$ = SubLObjectFactory.makeString("red");
        $ic118$ = SubLObjectFactory.makeString("A query specification can have only one query mt.  These extra mts will be dropped.");
        $ic119$ = SubLObjectFactory.makeString("A query specification can have only one query sentence.  These extra sentences will be dropped.");
        $ic120$ = SubLObjectFactory.makeString("~A");
        $ic121$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("sentence"));
        $ic122$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("non_exp_sentence"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED?"), (SubLObject)module0684.NIL);
        $ic123$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOCATION"), (SubLObject)SubLObjectFactory.makeString("Pragmatics"));
        $ic124$ = SubLObjectFactory.makeKeyword("NEW");
        $ic125$ = SubLObjectFactory.makeKeyword("OVERWRITE");
        $ic126$ = SubLObjectFactory.makeString("Unknown query save method ~A");
        $ic127$ = SubLObjectFactory.makeSymbol("CB-HANDLE-CONFIRM-SAVE-AS-QUERY");
        $ic128$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic129$ = SubLObjectFactory.makeString("query-spec");
        $ic130$ = SubLObjectFactory.makeString("No name was specified.");
        $ic131$ = SubLObjectFactory.makeString("gloss");
        $ic132$ = SubLObjectFactory.makeString("new-gloss");
        $ic133$ = SubLObjectFactory.makeString("folder");
        $ic134$ = SubLObjectFactory.makeString("new-folder");
        $ic135$ = SubLObjectFactory.makeString("new-folder-mt");
        $ic136$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#45959", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45277", "CYC"));
        $ic137$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1572", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic138$ = SubLObjectFactory.makeString("mc-option-");
        $ic139$ = ConsesLow.list((SubLObject)Characters.CHAR_hyphen);
        $ic140$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#45960", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45961", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45962", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45963", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45964", "CYC"));
        $ic141$ = SubLObjectFactory.makeString("number");
        $ic142$ = SubLObjectFactory.makeKeyword("NUMBER");
        $ic143$ = SubLObjectFactory.makeString("full_label");
        $ic144$ = SubLObjectFactory.makeKeyword("FULL-LABEL");
        $ic145$ = SubLObjectFactory.makeString("index_label");
        $ic146$ = SubLObjectFactory.makeKeyword("INDEX-LABEL");
        $ic147$ = SubLObjectFactory.makeString("binding");
        $ic148$ = SubLObjectFactory.makeString("BINDING-");
        $ic149$ = SubLObjectFactory.makeString("Unexpected multiple choice option label ~s");
        $ic150$ = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $ic151$ = SubLObjectFactory.makeSymbol("S#3700", "CYC");
        $ic152$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic153$ = SubLObjectFactory.makeString("Save Query Specification");
        $ic154$ = SubLObjectFactory.makeString("~A is not a valid constant name.");
        $ic155$ = SubLObjectFactory.makeString("Already a constant named ~A");
        $ic156$ = SubLObjectFactory.makeString("Constant ~S already exists which differs from ~S only by case");
        $ic157$ = SubLObjectFactory.makeString("Overwrite Query Specification");
        $ic158$ = SubLObjectFactory.makeString("~A is not the name of a CycLQuerySpecification.");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0684.class
	Total time: 566 ms
	
	Decompiled with Procyon 0.5.32.
*/