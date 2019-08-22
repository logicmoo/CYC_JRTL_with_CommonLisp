package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        assert NIL != inference_datastructures_inference_oc.f25275(var1) : var1;
        assert NIL != module0423.f29532(var2) : var2;
        return Hashtables.sethash(var1, $g5385$.getDynamicValue(var3), var2);
    }
    
    public static SubLObject f41927(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference_oc.f25275(var1) : var1;
        return Hashtables.remhash(var1, $g5385$.getDynamicValue(var2));
    }
    
    public static SubLObject f41928(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference_oc.f25275(var1) : var1;
        return Hashtables.gethash(var1, $g5385$.getDynamicValue(var2), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41929(final SubLObject var2) {
        final SubLObject var3 = module0423.f29563(var2);
        final SubLObject var4 = module0423.f29569(var2);
        final SubLObject var5 = module0423.f29566(var2);
        final SubLObject var6 = module0408.f28407(module0412.f28668(module0423.f29573(var2)));
        return module0683.f41815(var3, var4, var6, var2, var5);
    }
    
    public static SubLObject f41930(final SubLObject var2, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (NIL == var8) {
            var8 = (SubLObject)$ic3$;
        }
        final SubLObject var10 = module0656.f39832((SubLObject)$ic4$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var9), (SubLObject)$ic5$, module0656.f39842(var2));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var10) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var10);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var11 = module0015.$g533$.currentBinding(var9);
        try {
            module0015.$g533$.bind((SubLObject)T, var9);
            module0642.f39019(var8);
        }
        finally {
            module0015.$g533$.rebind(var11, var9);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var2;
    }
    
    public static SubLObject f41931(final SubLObject var11) {
        final SubLObject var12 = module0656.f39943(var11, (SubLObject)UNPROVIDED);
        f41929(var12);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41932(final SubLObject var2) {
        final SubLObject var3 = module0423.f29563(var2);
        final SubLObject var4 = module0423.f29569(var2);
        final SubLObject var5 = module0423.f29566(var2);
        SubLObject var6 = module0408.f28407(module0412.f28668(module0423.f29573(var2)));
        final SubLObject var7 = f41933(var2);
        Mapping.mapcar((SubLObject)$ic9$, var7);
        if (NIL != var7) {
            var6 = conses_high.putf(var6, (SubLObject)$ic10$, var7);
        }
        return module0683.f41815(var3, var4, var6, var2, var5);
    }
    
    public static SubLObject f41934(final SubLObject var2, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (NIL == var8) {
            var8 = (SubLObject)$ic11$;
        }
        final SubLObject var10 = module0656.f39832((SubLObject)$ic4$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var9), (SubLObject)$ic12$, module0656.f39842(var2));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var10) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var10);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var11 = module0015.$g533$.currentBinding(var9);
        try {
            module0015.$g533$.bind((SubLObject)T, var9);
            module0642.f39019(var8);
        }
        finally {
            module0015.$g533$.rebind(var11, var9);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var2;
    }
    
    public static SubLObject f41935(final SubLObject var11) {
        final SubLObject var12 = module0656.f39943(var11, (SubLObject)UNPROVIDED);
        f41932(var12);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41933(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        if (NIL != module0212.f13762(var2)) {
            SubLObject var4 = module0220.f14565(var2, $ic16$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var5 = (SubLObject)NIL;
            var5 = var4.first();
            while (NIL != var4) {
                var3 = (SubLObject)ConsesLow.cons(var5, var3);
                var4 = var4.rest();
                var5 = var4.first();
            }
        }
        return var3;
    }
    
    public static SubLObject f41936(final SubLObject var1, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (NIL == var8) {
            var8 = (SubLObject)$ic17$;
        }
        assert NIL != inference_datastructures_inference_oc.f25275(var1) : var1;
        final SubLObject var10 = module0656.f39832((SubLObject)$ic18$);
        if ($ic19$.isString()) {
            final SubLObject var11 = module0644.f39202((SubLObject)$ic19$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var9), (SubLObject)$ic20$, module0361.f23996(inference_datastructures_inference_oc.f25421(var1)), inference_datastructures_inference_oc.f25422(var1));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var10) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var10);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var11);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic21$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var12 = module0015.$g533$.currentBinding(var9);
            try {
                module0015.$g533$.bind((SubLObject)T, var9);
                module0642.f39019(var8);
            }
            finally {
                module0015.$g533$.rebind(var12, var9);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41937(final SubLObject var11) {
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var11, var11, (SubLObject)$ic24$);
        var12 = var11.first();
        SubLObject var14 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var14, var11, (SubLObject)$ic24$);
        var13 = var14.first();
        var14 = var14.rest();
        if (NIL != var14) {
            cdestructuring_bind.cdestructuring_bind_error(var11, (SubLObject)$ic24$);
            return (SubLObject)NIL;
        }
        final SubLObject var15 = reader.parse_integer(var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var16 = reader.parse_integer(var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var17 = module0361.f24195(var15, var16);
        final SubLObject var18 = (SubLObject)((NIL != var17) ? f41928(var17) : NIL);
        if (NIL == var17) {
            return module0656.f39789((SubLObject)$ic25$, var16, var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0682.f41666(module0682.f41659(var17, (SubLObject)UNPROVIDED));
        if (NIL != module0423.f29532(var18)) {
            module0682.f41641(module0682.f41665(), var18);
        }
        return f41938(var18);
    }
    
    public static SubLObject f41939(final SubLObject var2, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (NIL == var8) {
            var8 = (SubLObject)$ic27$;
        }
        assert NIL != module0423.f29532(var2) : var2;
        final SubLObject var10 = module0656.f39832((SubLObject)$ic4$);
        if ($ic28$.isString()) {
            final SubLObject var11 = module0644.f39202((SubLObject)$ic28$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var9), (SubLObject)$ic29$, module0656.f39842(var2));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var10) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var10);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var11);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic21$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var12 = module0015.$g533$.currentBinding(var9);
            try {
                module0015.$g533$.bind((SubLObject)T, var9);
                module0642.f39019(var8);
            }
            finally {
                module0015.$g533$.rebind(var12, var9);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41940(final SubLObject var11) {
        final SubLObject var12 = module0656.f39943(var11.first(), (SubLObject)UNPROVIDED);
        if (NIL == module0423.f29532(var12)) {
            return module0656.f39789((SubLObject)$ic32$, var11.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0682.f41666(module0682.f41658(var12, (SubLObject)UNPROVIDED));
        f41938(var12);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41938(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = (SubLObject)((NIL != var2) ? $ic34$ : $ic35$);
        final SubLObject var5 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
            module0642.f39020((SubLObject)$ic36$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0642.f39029((SubLObject)UNPROVIDED);
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
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var10_24 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic37$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_25 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)T, var3);
                    module0644.f39197();
                    final SubLObject var6 = module0644.f39214(module0644.$g5024$.getGlobalValue());
                    final SubLObject var7 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic38$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var7) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var7);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39032((SubLObject)ONE_INTEGER);
                    module0642.f39020(var6);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_26 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var8 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var9 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0015.$g541$.bind((SubLObject)T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)$ic39$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                        f41941(var4);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        f41942();
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0683.f41737(module0682.f41660(module0682.f41665()), module0682.f41662(module0682.f41665()), (SubLObject)NIL);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        f41943();
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0683.f41738(module0682.f41660(module0682.f41665()), (SubLObject)NIL);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        f41944();
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0683.f41739(module0682.f41639(module0682.f41665()), (SubLObject)NIL);
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        f41945((SubLObject)UNPROVIDED);
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        f41946(module0682.f41665());
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var9, var3);
                        module0015.$g541$.rebind(var8, var3);
                        module0015.$g533$.rebind(var10_26, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var10_25, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var10_24, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var5, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41941(final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = (SubLObject)FIVE_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var25) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var26 = module0015.$g533$.currentBinding(var24);
        try {
            module0015.$g533$.bind((SubLObject)T, var24);
            module0683.f41676(var23, (SubLObject)$ic40$, (SubLObject)$ic41$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var26, var24);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0642.f39032((SubLObject)FOUR_INTEGER);
        module0683.f41676((SubLObject)$ic42$, (SubLObject)$ic43$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0683.f41677((SubLObject)$ic44$, (SubLObject)$ic45$, (SubLObject)$ic46$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0683.f41677((SubLObject)$ic47$, (SubLObject)$ic48$, (SubLObject)$ic49$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0683.f41677((SubLObject)$ic50$, (SubLObject)$ic51$, (SubLObject)$ic52$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0683.f41677((SubLObject)$ic53$, (SubLObject)$ic54$, (SubLObject)$ic55$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41942() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0642.f39032((SubLObject)UNPROVIDED);
        module0683.f41678((SubLObject)$ic56$, (SubLObject)$ic57$, (SubLObject)$ic58$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0683.f41676((SubLObject)$ic59$, (SubLObject)$ic60$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39075((SubLObject)$ic61$, module0682.f41628(module0682.f41665()), (SubLObject)$ic62$);
        if (NIL != module0682.f41627(module0682.f41665())) {
            module0642.f39032((SubLObject)UNPROVIDED);
            module0683.f41678((SubLObject)$ic63$, (SubLObject)$ic64$, (SubLObject)$ic65$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39073((SubLObject)$ic66$);
        module0642.f39026((SubLObject)TWO_INTEGER);
        module0016.f920((SubLObject)$ic67$, (SubLObject)$ic68$, (SubLObject)$ic69$);
        final SubLObject var4 = (SubLObject)$ic70$;
        final SubLObject var5 = (SubLObject)FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var5) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var5);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        SubLObject var6 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)T, var3);
            module0683.f41676((SubLObject)$ic71$, (SubLObject)$ic72$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var6, var3);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0016.f908((SubLObject)$ic67$, var4, (SubLObject)$ic73$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic67$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var6 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)T, var3);
            module0657.f39992(module0682.f41631(module0682.f41665()), (SubLObject)$ic74$);
        }
        finally {
            module0015.$g533$.rebind(var6, var3);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41947() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0642.f39085((SubLObject)$ic75$);
        module0016.f920((SubLObject)$ic76$, (SubLObject)$ic68$, (SubLObject)$ic69$);
        final SubLObject var4 = (SubLObject)FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var4) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var4);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)T, var3);
            module0683.f41676((SubLObject)$ic77$, (SubLObject)$ic78$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var5, var3);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0016.f908((SubLObject)$ic76$, (SubLObject)$ic79$, (SubLObject)$ic73$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic76$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)T, var3);
            SubLObject var8;
            final SubLObject var7 = var8 = module0682.f41629(module0682.f41665());
            SubLObject var9 = (SubLObject)NIL;
            var9 = var8.first();
            while (NIL != var8) {
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39068((SubLObject)$ic80$, var9, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)TWO_INTEGER);
                module0656.f39804(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var8 = var8.rest();
                var9 = var8.first();
            }
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39021((SubLObject)$ic81$);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g336$.getGlobalValue());
            module0642.f39020(module0015.$g338$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic82$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g340$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic83$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g339$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)THREE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g350$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic84$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var10_35 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)T, var3);
                module0642.f39019((SubLObject)$ic85$);
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
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41948() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0642.f39085((SubLObject)$ic44$);
        module0016.f920((SubLObject)$ic86$, (SubLObject)$ic68$, (SubLObject)$ic69$);
        final SubLObject var4 = (SubLObject)FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var4) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var4);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)T, var3);
            module0683.f41676((SubLObject)$ic87$, (SubLObject)$ic88$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var5, var3);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0016.f908((SubLObject)$ic86$, (SubLObject)$ic79$, (SubLObject)$ic73$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic86$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)T, var3);
            final SubLObject var7 = module0682.f41662(module0682.f41665());
            module0642.f39026((SubLObject)UNPROVIDED);
            module0656.f39804(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var6, var3);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41949() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0642.f39085((SubLObject)$ic47$);
        module0016.f920((SubLObject)$ic89$, (SubLObject)$ic68$, (SubLObject)$ic69$);
        final SubLObject var4 = (SubLObject)FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var4) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var4);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)T, var3);
            module0683.f41676((SubLObject)$ic90$, (SubLObject)$ic91$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var5, var3);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0016.f908((SubLObject)$ic89$, (SubLObject)$ic79$, (SubLObject)$ic73$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic89$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)T, var3);
            final SubLObject var7 = module0682.f41660(module0682.f41665());
            module0642.f39026((SubLObject)UNPROVIDED);
            module0656.f39804(var7, (SubLObject)ZERO_INTEGER, (SubLObject)T);
        }
        finally {
            module0015.$g533$.rebind(var6, var3);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41950() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0642.f39085((SubLObject)$ic92$);
        module0016.f920((SubLObject)$ic93$, (SubLObject)$ic68$, (SubLObject)$ic69$);
        final SubLObject var4 = (SubLObject)FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var4) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var4);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)T, var3);
            module0683.f41676((SubLObject)$ic94$, (SubLObject)$ic95$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var5, var3);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        final SubLObject var6 = module0682.f41639(module0682.f41665());
        final SubLObject var7 = (SubLObject)((NIL != module0206.f13425(var6)) ? $ic79$ : $ic70$);
        module0016.f908((SubLObject)$ic93$, var7, (SubLObject)$ic73$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic93$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var8 = module0015.$g533$.currentBinding(var3);
        try {
            module0015.$g533$.bind((SubLObject)T, var3);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0656.f39804(var6, (SubLObject)ZERO_INTEGER, (SubLObject)T);
        }
        finally {
            module0015.$g533$.rebind(var8, var3);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41945(SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)T;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        final SubLObject var39 = module0682.f41638(module0682.f41665());
        if (NIL != var37) {
            return module0683.f41730((SubLObject)NIL, var39);
        }
        module0016.f920((SubLObject)$ic96$, (SubLObject)$ic68$, (SubLObject)$ic69$);
        final SubLObject var40 = (SubLObject)FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var40) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var40);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var41 = module0015.$g533$.currentBinding(var38);
        try {
            module0015.$g533$.bind((SubLObject)T, var38);
            module0683.f41676((SubLObject)$ic97$, (SubLObject)$ic98$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var41, var38);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0016.f908((SubLObject)$ic96$, (SubLObject)$ic70$, (SubLObject)$ic73$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic96$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var42 = module0015.$g533$.currentBinding(var38);
        try {
            module0015.$g533$.bind((SubLObject)T, var38);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0683.f41750((SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, var39);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0683.f41753((SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, var39, (SubLObject)UNPROVIDED);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0683.f41754((SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, var39, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var42, var38);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41946(final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        module0642.f39085((SubLObject)$ic53$);
        module0016.f920((SubLObject)$ic99$, (SubLObject)$ic68$, (SubLObject)$ic69$);
        final SubLObject var41 = (SubLObject)FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var41) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var41);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var42 = module0015.$g533$.currentBinding(var40);
        try {
            module0015.$g533$.bind((SubLObject)T, var40);
            module0683.f41676((SubLObject)$ic100$, (SubLObject)$ic55$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var42, var40);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0016.f908((SubLObject)$ic99$, (SubLObject)$ic79$, (SubLObject)$ic73$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic99$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var43 = module0015.$g533$.currentBinding(var40);
        try {
            module0015.$g533$.bind((SubLObject)T, var40);
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
            for (var45 = (SubLObject)NIL, var45 = (SubLObject)ZERO_INTEGER; var45.numL($g5386$.getGlobalValue()); var45 = Numbers.add(var45, (SubLObject)ONE_INTEGER)) {
                var46 = Sequences.cconcatenate((SubLObject)$ic101$, new SubLObject[] { module0006.f203(var45), $ic102$ });
                var47 = Sequences.cconcatenate((SubLObject)$ic103$, new SubLObject[] { module0006.f203(var45), $ic102$ });
                var48 = Sequences.cconcatenate((SubLObject)$ic104$, new SubLObject[] { module0006.f203(var45), $ic102$ });
                var49 = module0682.f41627(var39);
                var50 = (SubLObject)((NIL != var49) ? module0423.f29585(var49, var45) : NIL);
                var51 = (SubLObject)$ic85$;
                var52 = (SubLObject)$ic85$;
                if (NIL != var50) {
                    var53 = (var54 = var50);
                    var55 = (SubLObject)NIL;
                    var56 = (SubLObject)NIL;
                    var57 = (SubLObject)NIL;
                    var58 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)$ic105$);
                    var55 = var54.first();
                    var54 = var54.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)$ic105$);
                    var56 = var54.first();
                    var54 = var54.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)$ic105$);
                    var57 = var54.first();
                    var54 = var54.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)$ic105$);
                    var58 = var54.first();
                    var54 = var54.rest();
                    if (NIL == var54) {
                        var51 = var56;
                        var52 = var57;
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var53, (SubLObject)$ic105$);
                    }
                }
                else {
                    var52 = (var51 = Sequences.cconcatenate((SubLObject)$ic106$, new SubLObject[] { module0006.f203(module0038.f2964(var45)), $ic107$ }));
                }
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g234$.getGlobalValue());
                PrintLow.format(module0015.$g131$.getDynamicValue(var40), (SubLObject)$ic108$);
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39075(var46, module0038.f2638(module0048.f_1X(var45)), (SubLObject)ONE_INTEGER);
                module0642.f39032((SubLObject)TWO_INTEGER);
                module0683.f41674((SubLObject)$ic109$, (SubLObject)$ic110$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39075(var47, var51, (SubLObject)$ic111$);
                module0642.f39032((SubLObject)TWO_INTEGER);
                module0683.f41674((SubLObject)$ic112$, (SubLObject)$ic113$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39075(var48, var52, (SubLObject)FIVE_INTEGER);
                module0642.f39032((SubLObject)TWO_INTEGER);
                var59 = ((NIL != module0202.f12597(var44)) ? module0202.f12966(var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : module0202.f12911(var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                var60 = (SubLObject)((NIL != var50) ? conses_high.fourth(var50) : NIL);
                if (!module0233.f15372(var60).equal(var59)) {
                    var60 = (SubLObject)NIL;
                }
                var61 = (SubLObject)NIL;
                var62 = (SubLObject)NIL;
                var63 = (SubLObject)NIL;
                var61 = var59;
                var62 = var61.first();
                for (var63 = (SubLObject)ZERO_INTEGER; NIL != var61; var61 = var61.rest(), var62 = var61.first(), var63 = Numbers.add((SubLObject)ONE_INTEGER, var63)) {
                    var64 = Sequences.cconcatenate((SubLObject)$ic114$, new SubLObject[] { module0006.f203(var45), $ic115$, module0006.f203(var63) });
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    PrintLow.format(module0015.$g131$.getDynamicValue(var40), (SubLObject)$ic116$, var62);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    var65 = module0035.f2293(var60, var62, Symbols.symbol_function((SubLObject)EQL), (SubLObject)$ic85$);
                    module0642.f39079(var64, var65, (SubLObject)$ic111$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
        }
        finally {
            module0015.$g533$.rebind(var43, var40);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41943() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != module0682.f41663(module0682.f41665())) {
            module0642.f39020(module0015.$g219$.getGlobalValue());
            module0642.f39020(module0015.$g222$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39042((SubLObject)$ic117$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)T, var3);
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019((SubLObject)$ic118$);
                module0642.f39067();
                SubLObject var5 = module0682.f41663(module0682.f41665());
                SubLObject var6 = (SubLObject)NIL;
                var6 = var5.first();
                while (NIL != var5) {
                    module0656.f39804(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41944() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != module0682.f41661(module0682.f41665())) {
            module0642.f39067();
            module0642.f39020(module0015.$g219$.getGlobalValue());
            module0642.f39020(module0015.$g222$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39042((SubLObject)$ic117$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)T, var3);
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019((SubLObject)$ic119$);
                module0642.f39067();
                SubLObject var5 = module0682.f41661(module0682.f41665());
                SubLObject var6 = (SubLObject)NIL;
                var6 = var5.first();
                while (NIL != var5) {
                    module0656.f39804(var6, (SubLObject)ZERO_INTEGER, (SubLObject)T);
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
        return (SubLObject)NIL;
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
        if (NIL != var17) {
            return module0656.f39789((SubLObject)$ic120$, var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        var12.resetMultipleValues();
        final SubLObject var18 = f41955(var11);
        final SubLObject var19 = var12.secondMultipleValue();
        var12.resetMultipleValues();
        if (NIL != var19) {
            return module0656.f39789((SubLObject)$ic120$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        var12.resetMultipleValues();
        final SubLObject var20 = module0683.f41792(var11, (SubLObject)NIL, (SubLObject)UNPROVIDED);
        final SubLObject var21 = var12.secondMultipleValue();
        var12.resetMultipleValues();
        if (NIL != var21) {
            return module0656.f39789((SubLObject)$ic120$, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        var12.resetMultipleValues();
        final SubLObject var22 = module0657.f40003(var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var23 = var12.secondMultipleValue();
        final SubLObject var24 = var12.thirdMultipleValue();
        var12.resetMultipleValues();
        if (NIL != var23) {
            module0657.f40013(var23, var24);
            return (SubLObject)NIL;
        }
        var12.resetMultipleValues();
        final SubLObject var25 = module0657.f40022(var11, (SubLObject)$ic121$);
        final SubLObject var26 = var12.secondMultipleValue();
        final SubLObject var27 = var12.thirdMultipleValue();
        var12.resetMultipleValues();
        if (NIL != var26) {
            return module0657.f40031(var26, var27, (SubLObject)UNPROVIDED);
        }
        var12.resetMultipleValues();
        final SubLObject var28 = module0657.f40022(var11, (SubLObject)$ic122$);
        final SubLObject var29 = var12.secondMultipleValue();
        final SubLObject var30 = var12.thirdMultipleValue();
        var12.resetMultipleValues();
        if (NIL != var29) {
            return module0657.f40031(var29, var30, (SubLObject)$ic123$);
        }
        var12.resetMultipleValues();
        final SubLObject var31 = f41956(var11);
        final SubLObject var32 = var12.secondMultipleValue();
        var12.resetMultipleValues();
        if (NIL != var32) {
            return module0656.f39789((SubLObject)$ic120$, var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
        if (var34.eql((SubLObject)$ic124$)) {
            return f41958(module0682.f41665(), (SubLObject)UNPROVIDED);
        }
        if (var34.eql((SubLObject)$ic125$)) {
            return f41959(module0682.f41665());
        }
        return module0656.f39789((SubLObject)$ic126$, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41952(final SubLObject var11) {
        if (NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)$ic58$, var11))) {
            return (SubLObject)$ic124$;
        }
        if (NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)$ic65$, var11))) {
            return (SubLObject)$ic125$;
        }
        return (SubLObject)$ic128$;
    }
    
    public static SubLObject f41960(final SubLObject var11) {
        final SubLObject var12 = module0642.f39104((SubLObject)$ic129$, var11);
        final SubLObject var13 = module0656.f39943(var12, (SubLObject)UNPROVIDED);
        return var13;
    }
    
    public static SubLObject f41954(final SubLObject var11) {
        final SubLObject var12 = module0038.f2735(module0642.f39104((SubLObject)$ic61$, var11));
        SubLObject var13 = (SubLObject)NIL;
        if (!var12.isString() || var12.equal((SubLObject)$ic85$)) {
            var13 = (SubLObject)$ic130$;
        }
        return Values.values(var12, var13);
    }
    
    public static SubLObject f41955(final SubLObject var11) {
        return module0657.f40003(var11, (SubLObject)NIL, (SubLObject)$ic74$);
    }
    
    public static SubLObject f41953(final SubLObject var11) {
        SubLObject var12 = module0642.f39109((SubLObject)$ic131$, var11);
        final SubLObject var13 = module0642.f39104((SubLObject)$ic132$, var11);
        if (NIL == module0038.f2610(var13)) {
            var12 = (SubLObject)ConsesLow.cons(var13, var12);
        }
        return var12;
    }
    
    public static SubLObject f41956(final SubLObject var11) {
        final SubLObject var12 = module0642.f39109((SubLObject)$ic133$, var11);
        final SubLObject var13 = module0656.f39983((SubLObject)$ic134$, var11);
        final SubLObject var14 = module0656.f39983((SubLObject)$ic135$, var11);
        SubLObject var15 = (SubLObject)NIL;
        final SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = var12;
        SubLObject var18 = (SubLObject)NIL;
        var18 = var17.first();
        while (NIL != var17) {
            final SubLObject var19 = module0038.f2661(var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var21;
            final SubLObject var20 = var21 = var19;
            SubLObject var22 = (SubLObject)NIL;
            SubLObject var23 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic136$);
            var22 = var21.first();
            var21 = var21.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic136$);
            var23 = var21.first();
            var21 = var21.rest();
            if (NIL == var21) {
                if (NIL != module0656.f39933(var22) && NIL != module0656.f39933(var23)) {
                    final SubLObject var24 = module0656.f39943(var22, (SubLObject)UNPROVIDED);
                    final SubLObject var25 = module0656.f39943(var23, (SubLObject)UNPROVIDED);
                    if (NIL != module0173.f10955(var24) && NIL != module0173.f10955(var25)) {
                        final SubLObject var26 = (SubLObject)ConsesLow.list(var24, var25);
                        if (NIL == conses_high.member(var26, var15, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                            var15 = (SubLObject)ConsesLow.cons(var26, var15);
                        }
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic136$);
            }
            var17 = var17.rest();
            var18 = var17.first();
        }
        if (NIL == module0656.f39984(var13) && NIL == module0656.f39984(var14) && NIL != module0173.f10955(var13) && NIL != module0173.f10955(var14)) {
            final SubLObject var27 = (SubLObject)ConsesLow.list(var13, var14);
            if (NIL == conses_high.member(var27, var15, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var15 = (SubLObject)ConsesLow.cons(var27, var15);
            }
        }
        return Values.values(var15, var16);
    }
    
    public static SubLObject f41957(final SubLObject var11, final SubLObject var4) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)NIL;
        final SubLObject var14 = module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        SubLObject var15 = var11;
        SubLObject var16 = (SubLObject)NIL;
        var16 = var15.first();
        while (NIL != var15) {
            if (NIL != module0035.f1998(var16)) {
                SubLObject var18;
                final SubLObject var17 = var18 = var16;
                SubLObject var19 = (SubLObject)NIL;
                SubLObject var20 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)$ic137$);
                var19 = var18.first();
                var18 = var18.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)$ic137$);
                var20 = var18.first();
                var18 = var18.rest();
                if (NIL == var18) {
                    if (NIL != module0038.f2684(var19, (SubLObject)$ic138$) && NIL == module0038.f2608(var20)) {
                        final SubLObject var21 = module0038.f2752(var19, (SubLObject)$ic139$);
                        SubLObject var102_103;
                        final SubLObject var100_101 = var102_103 = var21;
                        SubLObject var22 = (SubLObject)NIL;
                        SubLObject var23 = (SubLObject)NIL;
                        SubLObject var24 = (SubLObject)NIL;
                        SubLObject var25 = (SubLObject)NIL;
                        SubLObject var26 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var102_103, var100_101, (SubLObject)$ic140$);
                        var22 = var102_103.first();
                        var102_103 = var102_103.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var102_103, var100_101, (SubLObject)$ic140$);
                        var23 = var102_103.first();
                        var102_103 = var102_103.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var102_103, var100_101, (SubLObject)$ic140$);
                        var24 = var102_103.first();
                        var102_103 = var102_103.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var102_103, var100_101, (SubLObject)$ic140$);
                        var25 = var102_103.first();
                        var102_103 = var102_103.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var102_103, var100_101, (SubLObject)$ic140$);
                        var26 = var102_103.first();
                        var102_103 = var102_103.rest();
                        if (NIL == var102_103) {
                            final SubLObject var27 = reader.read_from_string_ignoring_errors(var25, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            final SubLObject var28 = reader.read_from_string_ignoring_errors(var26, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            if ($ic141$.equal(var24)) {
                                module0084.f5770(var14, var27, (SubLObject)$ic142$, reader.read_from_string_ignoring_errors(var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                            }
                            else if ($ic143$.equal(var24)) {
                                var13 = (SubLObject)T;
                                module0084.f5770(var14, var27, (SubLObject)$ic144$, var20);
                            }
                            else if ($ic145$.equal(var24)) {
                                var13 = (SubLObject)T;
                                module0084.f5770(var14, var27, (SubLObject)$ic146$, var20);
                            }
                            else if ($ic147$.equal(var24)) {
                                var13 = (SubLObject)T;
                                final SubLObject var29 = Symbols.make_keyword(Sequences.cconcatenate((SubLObject)$ic148$, module0038.f2638(var28)));
                                module0084.f5770(var14, var27, var29, var20);
                            }
                            else {
                                Errors.warn((SubLObject)$ic149$, var19);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var100_101, (SubLObject)$ic140$);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)$ic137$);
                }
            }
            var15 = var15.rest();
            var16 = var15.first();
        }
        if (NIL != var13) {
            SubLObject var30 = (SubLObject)NIL;
            final SubLObject var31 = (NIL != module0202.f12597(var4)) ? module0202.f12966(var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : module0202.f12911(var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var32;
            for (var32 = module0066.f4838(module0067.f4891(var14)); NIL == module0066.f4841(var32); var32 = module0066.f4840(var32)) {
                var12.resetMultipleValues();
                final SubLObject var33 = module0066.f4839(var32);
                final SubLObject var34 = var12.secondMultipleValue();
                var12.resetMultipleValues();
                final SubLObject var35 = module0035.f2335(var34, (SubLObject)$ic142$, (SubLObject)UNPROVIDED);
                final SubLObject var36 = module0035.f2335(var34, (SubLObject)$ic144$, (SubLObject)UNPROVIDED);
                final SubLObject var37 = module0035.f2335(var34, (SubLObject)$ic146$, (SubLObject)UNPROVIDED);
                SubLObject var38 = (SubLObject)NIL;
                SubLObject var39 = (SubLObject)ZERO_INTEGER;
                SubLObject var40 = (SubLObject)NIL;
                while (NIL == var40) {
                    final SubLObject var41 = Symbols.make_keyword(Sequences.cconcatenate((SubLObject)$ic148$, module0038.f2638(var39)));
                    final SubLObject var42 = ConsesLow.nth(var39, var31);
                    SubLObject var43 = module0035.f2335(var34, var41, (SubLObject)$ic150$);
                    if ($ic150$ == var43) {
                        var40 = (SubLObject)T;
                    }
                    else if (NIL == module0038.f2608(var43)) {
                        var43 = reader.read_from_string_ignoring_errors(module0038.f2933(var43), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        var38 = (SubLObject)ConsesLow.cons(module0233.f15340(var42, var43), var38);
                    }
                    var39 = Numbers.add(var39, (SubLObject)ONE_INTEGER);
                }
                final SubLObject var44 = (SubLObject)((NIL != var38) ? module0233.f15411((SubLObject)ConsesLow.list(var38)) : NIL);
                var30 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var35, var36, var37, var44), var30);
            }
            module0066.f4842(var32);
            return Sort.sort(var30, Symbols.symbol_function((SubLObject)$ic151$), Symbols.symbol_function((SubLObject)$ic152$));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41958(final SubLObject var39, SubLObject var121) {
        if (var121 == UNPROVIDED) {
            var121 = (SubLObject)NIL;
        }
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic153$);
            return (SubLObject)NIL;
        }
        if (NIL == module0126.f8389(module0682.f41628(var39))) {
            return module0656.f39789((SubLObject)$ic154$, module0682.f41628(var39), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var122 = constants_high_oc.f10737(module0682.f41628(var39));
        SubLObject var123 = (SubLObject)NIL;
        if (NIL != var122) {
            return module0656.f39789((SubLObject)$ic155$, module0682.f41628(var39), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var124 = module0126.f8393(module0682.f41628(var39), (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var124) {
            return module0656.f39789((SubLObject)$ic156$, var124.first(), module0682.f41628(var39), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        var123 = module0673.f41078(module0682.f41628(var39));
        module0682.f41641(var39, var123);
        module0423.f29533(module0682.f41627(var39), module0682.f41660(var39), module0682.f41662(var39), module0412.f28669(module0682.f41638(var39), module0682.f41660(var39)), module0682.f41631(var39), module0682.f41639(var39), module0682.f41640(var39));
        module0423.f29554(module0682.f41627(var39), module0682.f41635(var39), module0682.f41637(var39), module0682.f41636(var39), module0682.f41631(var39));
        if (NIL != constant_handles_oc.f8449(var123)) {
            module0677.f41359(var123);
        }
        else if (NIL != module0167.f10813(var123)) {
            module0677.f41360(var123);
        }
        if (NIL != var121) {
            module0656.f39804(var123, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            module0674.f41154((SubLObject)$ic153$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41959(final SubLObject var39) {
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic157$);
            return (SubLObject)NIL;
        }
        final SubLObject var40 = module0682.f41628(var39);
        if (NIL != var40) {
            final SubLObject var41 = module0656.f39957(var40, (SubLObject)UNPROVIDED);
            if (NIL == module0423.f29532(var41)) {
                return module0656.f39789((SubLObject)$ic158$, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
        module0674.f41154((SubLObject)$ic34$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41962() {
        $g5385$ = SubLFiles.defparameter("S#45953", Hashtables.make_hash_table((SubLObject)$ic0$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g5386$ = SubLFiles.deflexical("S#45954", (SubLObject)FIVE_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41963() {
        module0656.f39840((SubLObject)$ic6$, (SubLObject)$ic7$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic8$);
        module0656.f39840((SubLObject)$ic13$, (SubLObject)$ic14$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic15$);
        module0656.f39840((SubLObject)$ic22$, (SubLObject)$ic23$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic26$);
        module0656.f39840((SubLObject)$ic30$, (SubLObject)$ic31$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic33$);
        module0015.f873((SubLObject)$ic127$);
        return (SubLObject)NIL;
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
        $g5385$ = null;
        $g5386$ = null;
        $ic0$ = makeInteger(1024);
        $ic1$ = makeSymbol("INFERENCE-P");
        $ic2$ = makeSymbol("S#32663", "CYC");
        $ic3$ = makeString("[Ask Query]");
        $ic4$ = makeKeyword("MAIN");
        $ic5$ = makeString("cb-ask-kb-query&~a");
        $ic6$ = makeKeyword("KBQ-ASK");
        $ic7$ = makeSymbol("S#45929", "CYC");
        $ic8$ = makeSymbol("CB-ASK-KB-QUERY");
        $ic9$ = makeSymbol("S#45256", "CYC");
        $ic10$ = makeKeyword("ALLOWED-RULES");
        $ic11$ = makeString("[Proof-check Query]");
        $ic12$ = makeString("cb-ask-kb-query-in-proof-checker&~a");
        $ic13$ = makeKeyword("KBQ-ASK-IN-PROOF-CHECKER");
        $ic14$ = makeSymbol("S#45931", "CYC");
        $ic15$ = makeSymbol("CB-ASK-KB-QUERY-IN-PROOF-CHECKER");
        $ic16$ = constant_handles_oc.f8479((SubLObject)makeString("queryPracticeRules"));
        $ic17$ = makeString("[Save As Query]");
        $ic18$ = makeKeyword("SELF");
        $ic19$ = makeString("Create an instance of #$CycLQuerySpecification with the focal inference's sentence, microtheory and inference settings.");
        $ic20$ = makeString("cb-save-as-query&~A&~A");
        $ic21$ = makeString("nd();");
        $ic22$ = makeKeyword("KBQ-SAVE");
        $ic23$ = makeSymbol("S#45932", "CYC");
        $ic24$ = ConsesLow.list((SubLObject)makeSymbol("S#45911", "CYC"), (SubLObject)makeSymbol("S#45912", "CYC"));
        $ic25$ = makeString("Inference ~S in problem store ~S is no longer available.");
        $ic26$ = makeSymbol("CB-SAVE-AS-QUERY");
        $ic27$ = makeString("[Edit Query]");
        $ic28$ = makeString("Edit the sentence, microtheory, inference settings, etc. for this instance of #$CycLQuerySpecification.");
        $ic29$ = makeString("cb-edit-query&~A");
        $ic30$ = makeKeyword("KBQ-EDIT");
        $ic31$ = makeSymbol("S#45933", "CYC");
        $ic32$ = makeString("~A does not denote a query specification");
        $ic33$ = makeSymbol("CB-EDIT-QUERY");
        $ic34$ = makeString("Edit Query Specification");
        $ic35$ = makeString("Save Inference Settings as Query Specification");
        $ic36$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic37$ = makeString("yui-skin-sam");
        $ic38$ = makeString("post");
        $ic39$ = makeString("cb-handle-confirm-save-as-query");
        $ic40$ = makeString("The interface for creating and editing CycLQuerySpecification instances.  Hover over the various headers for context-sensitive help.");
        $ic41$ = makeString("Save As Query");
        $ic42$ = makeString("Goto section :");
        $ic43$ = makeString("Shortcut links to sections that appear further down on this page.");
        $ic44$ = makeString("mt-section");
        $ic45$ = makeString("[Mt]");
        $ic46$ = makeString("Change the Microtheory settings to be used for the saved query.");
        $ic47$ = makeString("sentence-section");
        $ic48$ = makeString("[Sentence]");
        $ic49$ = makeString("Change the CycL sentence to be used for the saved query.");
        $ic50$ = makeString("parameters-section");
        $ic51$ = makeString("[Inference Parameters]");
        $ic52$ = makeString("Adjust the inference parameters and resource constraints that will be used when saving this query.");
        $ic53$ = makeString("multiple-choice-section");
        $ic54$ = makeString("[Multiple Choice]");
        $ic55$ = makeString("If this query is to be a multiple-choice query, define its multiple-choice options here.");
        $ic56$ = makeString("Save As New Query");
        $ic57$ = makeString("Creates a new #$CycLQuerySpecification instance, with the specified sentence, mt and inference settings.");
        $ic58$ = makeString("new");
        $ic59$ = makeString("Name: ");
        $ic60$ = makeString("The constant name to save the query specification as.");
        $ic61$ = makeString("name");
        $ic62$ = makeInteger(40);
        $ic63$ = makeString("Overwrite Existing Query");
        $ic64$ = makeString("Overwrites the existing query specification with the sentence, mt and inference settings specified here.");
        $ic65$ = makeString("overwrite");
        $ic66$ = makeString("Reset Values");
        $ic67$ = makeString("cb-kbq-save-mt");
        $ic68$ = makeString("Show");
        $ic69$ = makeString("Hide");
        $ic70$ = makeKeyword("INVISIBLE");
        $ic71$ = makeString("Save In Mt: ");
        $ic72$ = makeString("The microtheory in which to save the assertions about the query specification.  Should be a spec-mt of #$TestVocabularyMt.");
        $ic73$ = makeKeyword("PARAGRAPH");
        $ic74$ = ConsesLow.list((SubLObject)makeKeyword("INPUT-NAME"), (SubLObject)makeString("defining-mt"));
        $ic75$ = makeString("comment-section");
        $ic76$ = makeString("query-comment");
        $ic77$ = makeString("Query Comment (optional)");
        $ic78$ = makeString("Specify a comment for the CycLQuerySpecification");
        $ic79$ = makeKeyword("VISIBLE");
        $ic80$ = makeString("comment");
        $ic81$ = makeString("Add a Comment: ");
        $ic82$ = makeString("new-comment");
        $ic83$ = makeInteger(80);
        $ic84$ = makeString("virtual");
        $ic85$ = makeString("");
        $ic86$ = makeString("cb-query-inference-mt");
        $ic87$ = makeString("Query Mt");
        $ic88$ = makeString("The microtheory in which the query will be performed.");
        $ic89$ = makeString("query-sentence");
        $ic90$ = makeString("Query Sentence");
        $ic91$ = makeString("The CycL Sentence for the query.");
        $ic92$ = makeString("pragmatics-section");
        $ic93$ = makeString("query-pragmatics");
        $ic94$ = makeString("Query Pragmatics");
        $ic95$ = makeString("An optional sentence that will constrain the query for pragmatic reasons.  Justifications for answers will not include this sentence.");
        $ic96$ = makeString("inference-parameters");
        $ic97$ = makeString("Inference Parameters");
        $ic98$ = makeString("The inference parameters and resource constraints that will be used when running the test query.");
        $ic99$ = makeString("multiple-choice");
        $ic100$ = makeString("Multiple Choice Options");
        $ic101$ = makeString("mc-option-number-");
        $ic102$ = makeString("-0");
        $ic103$ = makeString("mc-option-full_label-");
        $ic104$ = makeString("mc-option-index_label-");
        $ic105$ = ConsesLow.list((SubLObject)makeSymbol("S#45955", "CYC"), (SubLObject)makeSymbol("S#45956", "CYC"), (SubLObject)makeSymbol("S#45957", "CYC"), (SubLObject)makeSymbol("S#45958", "CYC"));
        $ic106$ = makeString("(");
        $ic107$ = makeString(")");
        $ic108$ = makeString("Option # ");
        $ic109$ = makeString("Full label: ");
        $ic110$ = makeString("A label that fully describes this multiple choice option, e.g. (A) 26");
        $ic111$ = makeInteger(30);
        $ic112$ = makeString("Index label: ");
        $ic113$ = makeString("A label serving as a unique index for this multiple choice option, e.g. (A)");
        $ic114$ = makeString("mc-option-binding-");
        $ic115$ = makeString("-");
        $ic116$ = makeString("Binding for ~A: ");
        $ic117$ = makeString("red");
        $ic118$ = makeString("A query specification can have only one query mt.  These extra mts will be dropped.");
        $ic119$ = makeString("A query specification can have only one query sentence.  These extra sentences will be dropped.");
        $ic120$ = makeString("~A");
        $ic121$ = ConsesLow.list((SubLObject)makeKeyword("INPUT-NAME"), (SubLObject)makeString("sentence"));
        $ic122$ = ConsesLow.list((SubLObject)makeKeyword("INPUT-NAME"), (SubLObject)makeString("non_exp_sentence"), (SubLObject)makeKeyword("REQUIRED?"), (SubLObject)NIL);
        $ic123$ = ConsesLow.list((SubLObject)makeKeyword("LOCATION"), (SubLObject)makeString("Pragmatics"));
        $ic124$ = makeKeyword("NEW");
        $ic125$ = makeKeyword("OVERWRITE");
        $ic126$ = makeString("Unknown query save method ~A");
        $ic127$ = makeSymbol("CB-HANDLE-CONFIRM-SAVE-AS-QUERY");
        $ic128$ = makeKeyword("UNKNOWN");
        $ic129$ = makeString("query-spec");
        $ic130$ = makeString("No name was specified.");
        $ic131$ = makeString("gloss");
        $ic132$ = makeString("new-gloss");
        $ic133$ = makeString("folder");
        $ic134$ = makeString("new-folder");
        $ic135$ = makeString("new-folder-mt");
        $ic136$ = ConsesLow.list((SubLObject)makeSymbol("S#45959", "CYC"), (SubLObject)makeSymbol("S#45277", "CYC"));
        $ic137$ = ConsesLow.list((SubLObject)makeSymbol("S#1572", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic138$ = makeString("mc-option-");
        $ic139$ = ConsesLow.list((SubLObject)Characters.CHAR_hyphen);
        $ic140$ = ConsesLow.list((SubLObject)makeSymbol("S#45960", "CYC"), (SubLObject)makeSymbol("S#45961", "CYC"), (SubLObject)makeSymbol("S#45962", "CYC"), (SubLObject)makeSymbol("S#45963", "CYC"), (SubLObject)makeSymbol("S#45964", "CYC"));
        $ic141$ = makeString("number");
        $ic142$ = makeKeyword("NUMBER");
        $ic143$ = makeString("full_label");
        $ic144$ = makeKeyword("FULL-LABEL");
        $ic145$ = makeString("index_label");
        $ic146$ = makeKeyword("INDEX-LABEL");
        $ic147$ = makeString("binding");
        $ic148$ = makeString("BINDING-");
        $ic149$ = makeString("Unexpected multiple choice option label ~s");
        $ic150$ = makeKeyword("NOT-FOUND");
        $ic151$ = makeSymbol("S#3700", "CYC");
        $ic152$ = makeSymbol("FIRST");
        $ic153$ = makeString("Save Query Specification");
        $ic154$ = makeString("~A is not a valid constant name.");
        $ic155$ = makeString("Already a constant named ~A");
        $ic156$ = makeString("Constant ~S already exists which differs from ~S only by case");
        $ic157$ = makeString("Overwrite Query Specification");
        $ic158$ = makeString("~A is not the name of a CycLQuerySpecification.");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 566 ms
	
	Decompiled with Procyon 0.5.32.
*/