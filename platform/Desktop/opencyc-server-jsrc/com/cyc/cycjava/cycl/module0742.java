package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0742 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0742";
    public static final String myFingerPrint = "308b49bd361790f0c8e6a6dc3d463f68c986f5bc05280b42cf9472c8deaacd95";
    public static SubLSymbol $g5885$;
    private static SubLSymbol $g5886$;
    private static SubLSymbol $g5887$;
    private static SubLSymbol $g5888$;
    public static SubLSymbol $g5889$;
    public static SubLSymbol $g5890$;
    public static SubLSymbol $g5891$;
    private static SubLSymbol $g5892$;
    private static SubLSymbol $g5893$;
    public static SubLSymbol $g5894$;
    public static SubLSymbol $g5895$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLString $ic2$;
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
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLString $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLList $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLInteger $ic58$;
    private static final SubLString $ic59$;
    private static final SubLList $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLObject $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLString $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLString $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLList $ic78$;
    private static final SubLString $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLString $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLList $ic91$;
    private static final SubLList $ic92$;
    private static final SubLList $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLObject $ic107$;
    private static final SubLObject $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLObject $ic111$;
    private static final SubLObject $ic112$;
    private static final SubLObject $ic113$;
    private static final SubLObject $ic114$;
    private static final SubLString $ic115$;
    private static final SubLString $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLString $ic120$;
    private static final SubLString $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLString $ic123$;
    private static final SubLString $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLString $ic132$;
    private static final SubLString $ic133$;
    private static final SubLString $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLString $ic138$;
    private static final SubLString $ic139$;
    private static final SubLString $ic140$;
    private static final SubLString $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLObject $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLList $ic145$;
    private static final SubLString $ic146$;
    private static final SubLString $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLString $ic151$;
    private static final SubLString $ic152$;
    private static final SubLInteger $ic153$;
    private static final SubLString $ic154$;
    private static final SubLString $ic155$;
    private static final SubLString $ic156$;
    private static final SubLString $ic157$;
    private static final SubLString $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLString $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLString $ic162$;
    private static final SubLString $ic163$;
    private static final SubLString $ic164$;
    private static final SubLString $ic165$;
    private static final SubLString $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLInteger $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLString $ic171$;
    private static final SubLString $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLString $ic176$;
    private static final SubLString $ic177$;
    private static final SubLString $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLString $ic180$;
    private static final SubLString $ic181$;
    private static final SubLString $ic182$;
    private static final SubLString $ic183$;
    private static final SubLString $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLString $ic187$;
    private static final SubLString $ic188$;
    private static final SubLString $ic189$;
    private static final SubLString $ic190$;
    private static final SubLString $ic191$;
    private static final SubLString $ic192$;
    private static final SubLString $ic193$;
    private static final SubLString $ic194$;
    private static final SubLString $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLString $ic197$;
    private static final SubLString $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLString $ic201$;
    private static final SubLString $ic202$;
    private static final SubLString $ic203$;
    private static final SubLString $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLList $ic207$;
    private static final SubLList $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLString $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLSymbol $ic213$;
    private static final SubLString $ic214$;
    private static final SubLString $ic215$;
    private static final SubLString $ic216$;
    private static final SubLString $ic217$;
    private static final SubLString $ic218$;
    private static final SubLString $ic219$;
    private static final SubLString $ic220$;
    private static final SubLInteger $ic221$;
    private static final SubLSymbol $ic222$;
    private static final SubLSymbol $ic223$;
    private static final SubLString $ic224$;
    private static final SubLString $ic225$;
    private static final SubLString $ic226$;
    private static final SubLList $ic227$;
    private static final SubLList $ic228$;
    private static final SubLString $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLString $ic231$;
    private static final SubLSymbol $ic232$;
    private static final SubLString $ic233$;
    private static final SubLString $ic234$;
    private static final SubLString $ic235$;
    private static final SubLString $ic236$;
    private static final SubLString $ic237$;
    private static final SubLString $ic238$;
    private static final SubLSymbol $ic239$;
    private static final SubLString $ic240$;
    private static final SubLString $ic241$;
    private static final SubLSymbol $ic242$;
    private static final SubLSymbol $ic243$;
    private static final SubLInteger $ic244$;
    private static final SubLSymbol $ic245$;
    
    public static SubLObject f45919(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0742.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0742.$ic1$);
        var2 = var1.first();
        final SubLObject var3 = var1.rest();
        if (module0742.NIL == var3) {
            final SubLObject var4 = module0656.f39943(var2, (SubLObject)module0742.UNPROVIDED);
            if (module0742.NIL == module0173.f10955(var4)) {
                return module0656.f39789((SubLObject)module0742.$ic2$, var2, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
            }
            f45920(var4, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0742.$ic1$);
        }
        return (SubLObject)module0742.NIL;
    }
    
    public static SubLObject f45921(final SubLObject var5, SubLObject var6, SubLObject var7) {
        if (var6 == module0742.UNPROVIDED) {
            var6 = (SubLObject)module0742.NIL;
        }
        if (var7 == module0742.UNPROVIDED) {
            var7 = (SubLObject)module0742.NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (module0742.NIL == var7) {
            var7 = (SubLObject)module0742.$ic4$;
        }
        final SubLObject var9 = module0656.f39832((SubLObject)module0742.$ic5$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var8), (SubLObject)module0742.$ic6$, module0656.f39842(var5));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        if (module0742.NIL != var9) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020(var9);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        final SubLObject var10 = module0015.$g533$.currentBinding(var8);
        try {
            module0015.$g533$.bind((SubLObject)module0742.T, var8);
            module0642.f39019(var7);
        }
        finally {
            module0015.$g533$.rebind(var10, var8);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        if (module0742.NIL != var6) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var8), (SubLObject)module0742.$ic7$, var6);
        }
        return var5;
    }
    
    public static SubLObject f45922(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0742.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0742.$ic1$);
        var2 = var1.first();
        final SubLObject var3 = var1.rest();
        if (module0742.NIL == var3) {
            final SubLObject var4 = module0656.f39943(var2, (SubLObject)module0742.UNPROVIDED);
            if (module0742.NIL == module0173.f10955(var4)) {
                return module0656.f39789((SubLObject)module0742.$ic2$, var2, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
            }
            f45920(var4, (SubLObject)module0742.T, (SubLObject)module0742.UNPROVIDED);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0742.$ic1$);
        }
        return (SubLObject)module0742.NIL;
    }
    
    public static SubLObject f45923(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0656.f39832((SubLObject)module0742.$ic5$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var6), (SubLObject)module0742.$ic11$, module0656.f39842(var5));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        if (module0742.NIL != var7) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020(var7);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        final SubLObject var8 = module0015.$g533$.currentBinding(var6);
        try {
            module0015.$g533$.bind((SubLObject)module0742.T, var6);
            module0642.f39019((SubLObject)module0742.$ic12$);
        }
        finally {
            module0015.$g533$.rebind(var8, var6);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var5;
    }
    
    public static SubLObject f45924(final SubLObject var5, SubLObject var13) {
        if (var13 == module0742.UNPROVIDED) {
            var13 = (SubLObject)module0742.NIL;
        }
        f45925(var5, var13);
        SubLObject var14 = f45926(var5, var13);
        if (module0742.NIL != var14) {
            var14 = f45927(var14);
            f45928(var14, var13);
        }
        else {
            module0642.f39026((SubLObject)module0742.UNPROVIDED);
            module0642.f39032((SubLObject)module0742.THREE_INTEGER);
            module0642.f39019((SubLObject)module0742.$ic15$);
            module0642.f39026((SubLObject)module0742.TWO_INTEGER);
        }
        return (SubLObject)module0742.NIL;
    }
    
    public static SubLObject f45926(final SubLObject var5, SubLObject var13) {
        if (var13 == module0742.UNPROVIDED) {
            var13 = (SubLObject)module0742.NIL;
        }
        return (module0742.NIL != module0731.f44764(var5, (SubLObject)module0742.UNPROVIDED)) ? f45929(var5, var13) : f45930(var5, (SubLObject)module0742.UNPROVIDED);
    }
    
    public static SubLObject f45929(final SubLObject var15, SubLObject var13) {
        if (var13 == module0742.UNPROVIDED) {
            var13 = (SubLObject)module0742.NIL;
        }
        SubLObject var16 = (SubLObject)module0742.NIL;
        SubLObject var17 = module0731.f44778(var15, (SubLObject)module0742.UNPROVIDED);
        SubLObject var18 = (SubLObject)module0742.NIL;
        var18 = var17.first();
        while (module0742.NIL != var17) {
            final SubLObject var19 = module0731.f44861(var15, var18, (SubLObject)module0742.UNPROVIDED);
            final SubLObject var20 = (SubLObject)((module0742.NIL != var19) ? var19 : ((module0742.NIL != var13) ? module0731.f44859(var15, var18) : module0742.NIL));
            var16 = ConsesLow.nconc(var16, var20);
            var17 = var17.rest();
            var18 = var17.first();
        }
        return var16;
    }
    
    public static SubLObject f45930(final SubLObject var5, SubLObject var21) {
        if (var21 == module0742.UNPROVIDED) {
            var21 = (SubLObject)module0742.NIL;
        }
        final SubLObject var22 = module0732.f45086(var5);
        if (module0742.NIL != var21 && module0742.NIL != module0661.f40297()) {
            SubLObject var23 = (SubLObject)module0742.NIL;
            final SubLObject var24 = (module0742.NIL != module0655.f39751()) ? module0262.f17322(module0661.f40271(), (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED) : module0661.f40271();
            SubLObject var25 = var22;
            SubLObject var26 = (SubLObject)module0742.NIL;
            var26 = var25.first();
            while (module0742.NIL != var25) {
                if (module0742.NIL != Sequences.find(module0178.f11287(var26), var24, (SubLObject)module0742.$ic16$, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED)) {
                    var23 = (SubLObject)ConsesLow.cons(var26, var23);
                }
                var25 = var25.rest();
                var26 = var25.first();
            }
            return var23;
        }
        return var22;
    }
    
    public static SubLObject f45927(final SubLObject var26) {
        SubLObject var27 = (SubLObject)module0742.NIL;
        SubLObject var28 = (SubLObject)module0742.NIL;
        SubLObject var29 = var26;
        SubLObject var30 = (SubLObject)module0742.NIL;
        var30 = var29.first();
        while (module0742.NIL != var29) {
            if (module0742.NIL != assertion_handles_oc.f11035(var30)) {
                var27 = (SubLObject)ConsesLow.cons(var30, var27);
            }
            else {
                var28 = (SubLObject)ConsesLow.cons(var30, var28);
            }
            var29 = var29.rest();
            var30 = var29.first();
        }
        var27 = Sort.sort(var27, Symbols.symbol_function((SubLObject)module0742.$ic17$), Symbols.symbol_function((SubLObject)module0742.$ic18$));
        var27 = Sort.sort(var27, Symbols.symbol_function((SubLObject)module0742.$ic17$), Symbols.symbol_function((SubLObject)module0742.$ic19$));
        var27 = Sort.sort(var27, Symbols.symbol_function((SubLObject)module0742.$ic17$), Symbols.symbol_function((SubLObject)module0742.$ic20$));
        return ConsesLow.append(var27, var28);
    }
    
    public static SubLObject f45920(final SubLObject var5, SubLObject var13, SubLObject var30) {
        if (var13 == module0742.UNPROVIDED) {
            var13 = (SubLObject)module0742.NIL;
        }
        if (var30 == module0742.UNPROVIDED) {
            var30 = (SubLObject)module0742.NIL;
        }
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (module0742.NIL != var30) {
            module0732.f44981(var5);
        }
        final SubLObject var33;
        final SubLObject var32 = var33 = PrintLow.format((SubLObject)module0742.NIL, (SubLObject)module0742.$ic21$, (SubLObject)((module0742.NIL != var13) ? module0742.$ic22$ : module0742.$ic23$), var5);
        final SubLObject var34 = module0015.$g538$.currentBinding(var31);
        try {
            module0015.$g538$.bind((module0742.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var31))) ? module0015.$g538$.getDynamicValue(var31) : module0057.f4173((SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED), var31);
            module0642.f39020((SubLObject)module0742.$ic24$);
            module0642.f39029((SubLObject)module0742.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var31), module0655.$g5142$.getDynamicValue(var31));
            final SubLObject var35 = module0014.f672((SubLObject)module0742.$ic25$);
            module0642.f39029((SubLObject)module0742.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020((SubLObject)module0742.$ic26$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            if (module0742.NIL != var35) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39020(var35);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020((SubLObject)module0742.$ic27$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
            if (module0742.NIL != var33) {
                module0642.f39029((SubLObject)module0742.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var33);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0016.f941();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0742.UNPROVIDED);
            final SubLObject var10_34 = module0015.$g535$.currentBinding(var31);
            try {
                module0015.$g535$.bind((SubLObject)module0742.T, var31);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0742.NIL != module0015.$g132$.getDynamicValue(var31)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var31)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39020((SubLObject)module0742.$ic28$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                final SubLObject var10_35 = module0015.$g533$.currentBinding(var31);
                try {
                    module0015.$g533$.bind((SubLObject)module0742.T, var31);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020((SubLObject)module0742.$ic29$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                    final SubLObject var10_36 = module0015.$g533$.currentBinding(var31);
                    try {
                        module0015.$g533$.bind((SubLObject)module0742.T, var31);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39020((SubLObject)module0742.$ic30$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39020((SubLObject)module0742.$ic31$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39019((SubLObject)module0742.$ic32$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39020(module0015.$g160$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39020((SubLObject)module0742.$ic33$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var10_36, var31);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    module0016.f936();
                    module0016.f894();
                    f45924(var5, var13);
                    module0642.f39026((SubLObject)module0742.UNPROVIDED);
                    f45931(var5, var13);
                    module0642.f39029((SubLObject)module0742.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var10_35, var31);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0742.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var10_34, var31);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0742.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var34, var31);
        }
        return (SubLObject)module0742.NIL;
    }
    
    public static SubLObject f45931(final SubLObject var5, SubLObject var13) {
        if (var13 == module0742.UNPROVIDED) {
            var13 = (SubLObject)module0742.NIL;
        }
        module0642.f39020(module0015.$g189$.getGlobalValue());
        module0642.f39020((SubLObject)module0742.FOUR_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        module0642.f39019((SubLObject)module0742.$ic34$);
        module0642.f39020(module0015.$g190$.getGlobalValue());
        module0642.f39020((SubLObject)module0742.FOUR_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        if (module0742.NIL != module0226.f14792(var5)) {
            module0642.f39019((SubLObject)module0742.$ic35$);
            module0656.f39837((SubLObject)module0742.$ic36$, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
            module0642.f39026((SubLObject)module0742.UNPROVIDED);
        }
        if (module0742.NIL != module0777.f50031(var5, (SubLObject)module0742.UNPROVIDED)) {
            module0642.f39019((SubLObject)module0742.$ic37$);
        }
        else {
            module0642.f39019((SubLObject)module0742.$ic38$);
        }
        module0656.f39837((SubLObject)module0742.$ic39$, var5, (SubLObject)module0742.NIL, (SubLObject)module0742.T, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
        module0642.f39026((SubLObject)module0742.UNPROVIDED);
        module0642.f39019((SubLObject)module0742.$ic40$);
        module0656.f39837((SubLObject)module0742.$ic41$, var5, var13, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
        module0642.f39026((SubLObject)module0742.UNPROVIDED);
        if (module0742.NIL == var13) {
            module0642.f39019((SubLObject)module0742.$ic42$);
            module0656.f39837((SubLObject)module0742.$ic13$, var5, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
            module0642.f39026((SubLObject)module0742.UNPROVIDED);
        }
        return (SubLObject)module0742.T;
    }
    
    public static SubLObject f45932(final SubLObject var37, SubLObject var13, SubLObject var7) {
        if (var13 == module0742.UNPROVIDED) {
            var13 = (SubLObject)module0742.NIL;
        }
        if (var7 == module0742.UNPROVIDED) {
            var7 = (SubLObject)module0742.NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        if (module0742.NIL == var7) {
            var7 = (SubLObject)module0742.$ic43$;
        }
        final SubLObject var39 = module0656.f39832((SubLObject)module0742.$ic5$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var38), (SubLObject)module0742.$ic44$, module0656.f39842(var37), var13);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        if (module0742.NIL != var39) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020(var39);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        final SubLObject var40 = module0015.$g533$.currentBinding(var38);
        try {
            module0015.$g533$.bind((SubLObject)module0742.T, var38);
            module0642.f39019(var7);
        }
        finally {
            module0015.$g533$.rebind(var40, var38);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0742.NIL;
    }
    
    public static SubLObject f45933(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0742.NIL;
        SubLObject var3 = (SubLObject)module0742.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0742.$ic46$);
        var2 = var1.first();
        SubLObject var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0742.$ic46$);
        var3 = var4.first();
        var4 = var4.rest();
        if (module0742.NIL == var4) {
            final SubLObject var5 = module0656.f39943(var2, (SubLObject)module0742.UNPROVIDED);
            final SubLObject var6 = reader.read_from_string(var3, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
            if (module0742.NIL == module0173.f10955(var5)) {
                return module0656.f39789((SubLObject)module0742.$ic2$, var2, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
            }
            f45920(var5, var6, (SubLObject)module0742.T);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0742.$ic46$);
        }
        return (SubLObject)module0742.NIL;
    }
    
    public static SubLObject f45934(SubLObject var7) {
        if (var7 == module0742.UNPROVIDED) {
            var7 = (SubLObject)module0742.NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (!var7.isString()) {
            var7 = (SubLObject)module0742.$ic48$;
        }
        final SubLObject var9 = module0656.f39832((SubLObject)module0742.$ic49$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var8), (SubLObject)module0742.$ic50$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        if (module0742.NIL != var9) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020(var9);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        final SubLObject var10 = module0015.$g533$.currentBinding(var8);
        try {
            module0015.$g533$.bind((SubLObject)module0742.T, var8);
            module0642.f39019(var7);
        }
        finally {
            module0015.$g533$.rebind(var10, var8);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0742.NIL;
    }
    
    public static SubLObject f45935(SubLObject var1) {
        if (var1 == module0742.UNPROVIDED) {
            var1 = (SubLObject)module0742.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = f45936();
        module0642.f39020(module0015.$g189$.getGlobalValue());
        module0642.f39020((SubLObject)module0742.ONE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        module0642.f39019((SubLObject)module0742.$ic52$);
        module0642.f39020(module0015.$g190$.getGlobalValue());
        module0642.f39020((SubLObject)module0742.ONE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        f45937(var3);
        module0642.f39051((SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
        SubLObject var4 = var3;
        SubLObject var5 = (SubLObject)module0742.NIL;
        var5 = var4.first();
        while (module0742.NIL != var4) {
            SubLObject var7;
            final SubLObject var6 = var7 = var5;
            SubLObject var8 = (SubLObject)module0742.NIL;
            SubLObject var9 = (SubLObject)module0742.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0742.$ic53$);
            var8 = var7.first();
            var7 = (var9 = var7.rest());
            final SubLObject var10 = PrintLow.format((SubLObject)module0742.NIL, (SubLObject)module0742.$ic54$, module0656.f39942(var8));
            module0642.f39020(module0015.$g381$.getGlobalValue());
            if (module0742.NIL != var10) {
                module0642.f39020(module0015.$g384$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39020(var10);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
            final SubLObject var11 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)module0742.T, var2);
            }
            finally {
                module0015.$g533$.rebind(var11, var2);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
            module0642.f39020(module0015.$g189$.getGlobalValue());
            module0642.f39020((SubLObject)module0742.TWO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
            module0656.f39804(var8, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020(module0015.$g190$.getGlobalValue());
            module0642.f39020((SubLObject)module0742.TWO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39020(module0015.$g352$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020((SubLObject)module0742.ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
            final SubLObject var12 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)module0742.T, var2);
                SubLObject var13 = (SubLObject)module0742.NIL;
                SubLObject var14 = (SubLObject)module0742.NIL;
                SubLObject var15 = (SubLObject)module0742.NIL;
                var13 = var9;
                var14 = var13.first();
                for (var15 = (SubLObject)module0742.ZERO_INTEGER; module0742.NIL != var13; var13 = var13.rest(), var14 = var13.first(), var15 = Numbers.add((SubLObject)module0742.ONE_INTEGER, var15)) {
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                    final SubLObject var10_51 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0742.T, var2);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g375$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39020((SubLObject)module0742.TEN_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                        final SubLObject var10_52 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)module0742.T, var2);
                        }
                        finally {
                            module0015.$g533$.rebind(var10_52, var2);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g371$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39020((SubLObject)module0742.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                        final SubLObject var10_53 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)module0742.T, var2);
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)module0742.THREE_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                            module0656.f39804(var14, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
                            if (module0742.NIL != module0127.f8414(var14)) {
                                module0642.f39020((SubLObject)module0742.$ic55$);
                            }
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)module0742.THREE_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var10_53, var2);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var10_51, var2);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)module0742.UNPROVIDED);
                    SubLObject var17_54 = (SubLObject)module0742.$ic60$;
                    SubLObject var16 = (SubLObject)module0742.NIL;
                    var16 = var17_54.first();
                    while (module0742.NIL != var17_54) {
                        final SubLObject var17 = module0147.f9540(module0677.f41312());
                        final SubLObject var10_54 = module0147.$g2095$.currentBinding(var2);
                        final SubLObject var18 = module0147.$g2094$.currentBinding(var2);
                        final SubLObject var19 = module0147.$g2096$.currentBinding(var2);
                        try {
                            module0147.$g2095$.bind(module0147.f9545(var17), var2);
                            module0147.$g2094$.bind(module0147.f9546(var17), var2);
                            module0147.$g2096$.bind(module0147.f9549(var17), var2);
                            final SubLObject var20 = module0219.f14509(var14, (SubLObject)module0742.ONE_INTEGER, var16, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
                            if (module0742.NIL != var20) {
                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                                final SubLObject var10_55 = module0015.$g533$.currentBinding(var2);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0742.T, var2);
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g375$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                                    module0642.f39020((SubLObject)module0742.TEN_INTEGER);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                                    final SubLObject var10_56 = module0015.$g533$.currentBinding(var2);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0742.T, var2);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var10_56, var2);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)module0742.$ic56$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)module0742.$ic57$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                                    module0642.f39020(module0015.$g375$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                                    module0642.f39020((SubLObject)module0742.$ic58$);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                                    final SubLObject var10_57 = module0015.$g533$.currentBinding(var2);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0742.T, var2);
                                        module0642.f39020(module0015.$g234$.getGlobalValue());
                                        module0656.f39804(var16, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
                                        module0642.f39019((SubLObject)module0742.$ic59$);
                                        module0642.f39020(module0015.$g235$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var10_57, var2);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                    SubLObject var17_55 = var20;
                                    SubLObject var21 = (SubLObject)module0742.NIL;
                                    var21 = var17_55.first();
                                    while (module0742.NIL != var17_55) {
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                                        final SubLObject var10_58 = module0015.$g533$.currentBinding(var2);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0742.T, var2);
                                            module0656.f39921(var21, (SubLObject)module0742.T);
                                            module0642.f39026((SubLObject)module0742.UNPROVIDED);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var10_58, var2);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        var17_55 = var17_55.rest();
                                        var21 = var17_55.first();
                                    }
                                }
                                finally {
                                    module0015.$g533$.rebind(var10_55, var2);
                                }
                                module0642.f39020(module0015.$g365$.getGlobalValue());
                                module0642.f39029((SubLObject)module0742.UNPROVIDED);
                            }
                        }
                        finally {
                            module0147.$g2096$.rebind(var19, var2);
                            module0147.$g2094$.rebind(var18, var2);
                            module0147.$g2095$.rebind(var10_54, var2);
                        }
                        var17_54 = var17_54.rest();
                        var16 = var17_54.first();
                    }
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                    final SubLObject var10_59 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0742.T, var2);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g371$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39020((SubLObject)module0742.THREE_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                        final SubLObject var10_60 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)module0742.T, var2);
                            module0642.f39051((SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var10_60, var2);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var10_59, var2);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)module0742.UNPROVIDED);
                }
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                final SubLObject var10_61 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0742.T, var2);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g371$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020((SubLObject)module0742.THREE_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                    final SubLObject var10_62 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0742.T, var2);
                        module0642.f39051((SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var10_62, var2);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var10_61, var2);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0742.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var12, var2);
            }
            module0642.f39020(module0015.$g347$.getGlobalValue());
            var4 = var4.rest();
            var5 = var4.first();
        }
        module0656.f39790((SubLObject)module0742.$ic61$, (SubLObject)module0742.UNPROVIDED);
        return (SubLObject)module0742.NIL;
    }
    
    public static SubLObject f45936() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = module0067.f4880((SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
        final SubLObject var10 = module0677.f41312();
        SubLObject var11 = (SubLObject)module0742.NIL;
        final SubLObject var12 = module0147.f9540(var10);
        final SubLObject var13 = module0147.$g2095$.currentBinding(var8);
        final SubLObject var14 = module0147.$g2094$.currentBinding(var8);
        final SubLObject var15 = module0147.$g2096$.currentBinding(var8);
        try {
            module0147.$g2095$.bind(module0147.f9545(var12), var8);
            module0147.$g2094$.bind(module0147.f9546(var12), var8);
            module0147.$g2096$.bind(module0147.f9549(var12), var8);
            final SubLObject var16 = module0742.$ic63$;
            final SubLObject var10_74 = module0137.$g1605$.currentBinding(var8);
            final SubLObject var58_75 = module0139.$g1636$.currentBinding(var8);
            try {
                module0137.$g1605$.bind(module0137.f8955(module0742.$ic64$), var8);
                module0139.$g1636$.bind(module0139.f9007(), var8);
                SubLObject var76_77 = var16;
                final SubLObject var17 = (SubLObject)module0742.$ic67$;
                final SubLObject var18 = module0056.f4145(var17);
                final SubLObject var10_75 = module0139.$g1635$.currentBinding(var8);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var8);
                    final SubLObject var56_81 = var10;
                    final SubLObject var10_76 = module0147.$g2095$.currentBinding(var8);
                    final SubLObject var58_76 = module0147.$g2094$.currentBinding(var8);
                    final SubLObject var59_84 = module0147.$g2096$.currentBinding(var8);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var56_81), var8);
                        module0147.$g2094$.bind(module0147.f9546(var56_81), var8);
                        module0147.$g2096$.bind(module0147.f9549(var56_81), var8);
                        final SubLObject var19 = (SubLObject)module0742.NIL;
                        final SubLObject var10_77 = module0141.$g1714$.currentBinding(var8);
                        final SubLObject var58_77 = module0141.$g1715$.currentBinding(var8);
                        try {
                            module0141.$g1714$.bind((module0742.NIL != var19) ? var19 : module0141.f9283(), var8);
                            module0141.$g1715$.bind((SubLObject)((module0742.NIL != var19) ? module0742.$ic68$ : module0141.$g1715$.getDynamicValue(var8)), var8);
                            if (module0742.NIL != var19 && module0742.NIL != module0136.f8864() && module0742.NIL == module0141.f9279(var19)) {
                                final SubLObject var20 = module0136.$g1591$.getDynamicValue(var8);
                                if (var20.eql((SubLObject)module0742.$ic69$)) {
                                    module0136.f8870((SubLObject)module0742.ONE_INTEGER, (SubLObject)module0742.$ic70$, var19, (SubLObject)module0742.$ic71$, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
                                }
                                else if (var20.eql((SubLObject)module0742.$ic72$)) {
                                    module0136.f8871((SubLObject)module0742.ONE_INTEGER, (SubLObject)module0742.$ic73$, (SubLObject)module0742.$ic70$, var19, (SubLObject)module0742.$ic71$, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
                                }
                                else if (var20.eql((SubLObject)module0742.$ic74$)) {
                                    Errors.warn((SubLObject)module0742.$ic70$, var19, (SubLObject)module0742.$ic71$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0742.$ic75$, module0136.$g1591$.getDynamicValue(var8));
                                    Errors.cerror((SubLObject)module0742.$ic73$, (SubLObject)module0742.$ic70$, var19, (SubLObject)module0742.$ic71$);
                                }
                            }
                            final SubLObject var10_78 = module0141.$g1670$.currentBinding(var8);
                            final SubLObject var58_78 = module0141.$g1671$.currentBinding(var8);
                            final SubLObject var59_85 = module0141.$g1672$.currentBinding(var8);
                            final SubLObject var21 = module0141.$g1674$.currentBinding(var8);
                            final SubLObject var22 = module0137.$g1605$.currentBinding(var8);
                            try {
                                module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0742.$ic64$)), var8);
                                module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0742.$ic64$))), var8);
                                module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0742.$ic64$))), var8);
                                module0141.$g1674$.bind((SubLObject)module0742.NIL, var8);
                                module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0742.$ic64$)), var8);
                                if (module0742.NIL != module0136.f8865() || module0742.NIL != module0244.f15795(var16, module0137.f8955((SubLObject)module0742.UNPROVIDED))) {
                                    final SubLObject var10_79 = module0141.$g1677$.currentBinding(var8);
                                    final SubLObject var58_79 = module0138.$g1619$.currentBinding(var8);
                                    final SubLObject var59_86 = module0141.$g1674$.currentBinding(var8);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9210(), var8);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0742.$ic64$))), var8);
                                        module0141.$g1674$.bind((SubLObject)module0742.NIL, var8);
                                        module0249.f16055(var76_77, (SubLObject)module0742.UNPROVIDED);
                                        while (module0742.NIL != var76_77) {
                                            final SubLObject var23 = var76_77;
                                            SubLObject var25;
                                            final SubLObject var24 = var25 = module0200.f12443(module0137.f8955(module0742.$ic64$));
                                            SubLObject var26 = (SubLObject)module0742.NIL;
                                            var26 = var25.first();
                                            while (module0742.NIL != var25) {
                                                final SubLObject var10_80 = module0137.$g1605$.currentBinding(var8);
                                                final SubLObject var58_80 = module0141.$g1674$.currentBinding(var8);
                                                try {
                                                    module0137.$g1605$.bind(var26, var8);
                                                    module0141.$g1674$.bind((SubLObject)((module0742.NIL != module0141.f9205((SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0742.NIL == module0141.$g1674$.getDynamicValue(var8)) : module0141.$g1674$.getDynamicValue(var8)), var8);
                                                    final SubLObject var27 = module0228.f15229(var23);
                                                    if (module0742.NIL != module0138.f8992(var27)) {
                                                        final SubLObject var28 = module0242.f15664(var27, module0137.f8955((SubLObject)module0742.UNPROVIDED));
                                                        if (module0742.NIL != var28) {
                                                            final SubLObject var29 = module0245.f15834(var28, module0244.f15780(module0137.f8955(module0742.$ic64$)), module0137.f8955((SubLObject)module0742.UNPROVIDED));
                                                            if (module0742.NIL != var29) {
                                                                SubLObject var30;
                                                                for (var30 = module0066.f4838(module0067.f4891(var29)); module0742.NIL == module0066.f4841(var30); var30 = module0066.f4840(var30)) {
                                                                    var8.resetMultipleValues();
                                                                    final SubLObject var31 = module0066.f4839(var30);
                                                                    final SubLObject var32 = var8.secondMultipleValue();
                                                                    var8.resetMultipleValues();
                                                                    if (module0742.NIL != module0147.f9507(var31)) {
                                                                        final SubLObject var10_81 = module0138.$g1623$.currentBinding(var8);
                                                                        try {
                                                                            module0138.$g1623$.bind(var31, var8);
                                                                            SubLObject var105_109;
                                                                            for (var105_109 = module0066.f4838(module0067.f4891(var32)); module0742.NIL == module0066.f4841(var105_109); var105_109 = module0066.f4840(var105_109)) {
                                                                                var8.resetMultipleValues();
                                                                                final SubLObject var33 = module0066.f4839(var105_109);
                                                                                final SubLObject var34 = var8.secondMultipleValue();
                                                                                var8.resetMultipleValues();
                                                                                if (module0742.NIL != module0141.f9289(var33)) {
                                                                                    final SubLObject var10_82 = module0138.$g1624$.currentBinding(var8);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var33, var8);
                                                                                        final SubLObject var35 = var34;
                                                                                        if (module0742.NIL != module0077.f5302(var35)) {
                                                                                            final SubLObject var36 = module0077.f5333(var35);
                                                                                            SubLObject var37;
                                                                                            SubLObject var38;
                                                                                            SubLObject var39;
                                                                                            SubLObject var17_118;
                                                                                            SubLObject var40;
                                                                                            SubLObject var41;
                                                                                            for (var37 = module0032.f1741(var36), var38 = (SubLObject)module0742.NIL, var38 = module0032.f1742(var37, var36); module0742.NIL == module0032.f1744(var37, var38); var38 = module0032.f1743(var38)) {
                                                                                                var39 = module0032.f1745(var37, var38);
                                                                                                if (module0742.NIL != module0032.f1746(var38, var39) && module0742.NIL == module0249.f16059(var39, module0139.$g1636$.getDynamicValue(var8))) {
                                                                                                    module0249.f16055(var39, module0139.$g1636$.getDynamicValue(var8));
                                                                                                    if (module0742.NIL != module0173.f10955(var39)) {
                                                                                                        var40 = (var17_118 = f45938(var39, var10));
                                                                                                        var41 = (SubLObject)module0742.NIL;
                                                                                                        var41 = var17_118.first();
                                                                                                        while (module0742.NIL != var17_118) {
                                                                                                            module0084.f5762(var9, var41, var39);
                                                                                                            var17_118 = var17_118.rest();
                                                                                                            var41 = var17_118.first();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var35.isList()) {
                                                                                            SubLObject var42 = var35;
                                                                                            SubLObject var43 = (SubLObject)module0742.NIL;
                                                                                            var43 = var42.first();
                                                                                            while (module0742.NIL != var42) {
                                                                                                if (module0742.NIL == module0249.f16059(var43, module0139.$g1636$.getDynamicValue(var8))) {
                                                                                                    module0249.f16055(var43, module0139.$g1636$.getDynamicValue(var8));
                                                                                                    if (module0742.NIL != module0173.f10955(var43)) {
                                                                                                        SubLObject var17_119;
                                                                                                        final SubLObject var44 = var17_119 = f45938(var43, var10);
                                                                                                        SubLObject var45 = (SubLObject)module0742.NIL;
                                                                                                        var45 = var17_119.first();
                                                                                                        while (module0742.NIL != var17_119) {
                                                                                                            module0084.f5762(var9, var45, var43);
                                                                                                            var17_119 = var17_119.rest();
                                                                                                            var45 = var17_119.first();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                var42 = var42.rest();
                                                                                                var43 = var42.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0742.$ic76$, var35);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var10_82, var8);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var105_109);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var10_81, var8);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var30);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0742.FIVE_INTEGER, (SubLObject)module0742.$ic77$, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
                                                        }
                                                        if (module0742.NIL != module0200.f12419(var27, module0137.f8955((SubLObject)module0742.UNPROVIDED))) {
                                                            SubLObject var46 = module0248.f15995(var27);
                                                            SubLObject var47 = (SubLObject)module0742.NIL;
                                                            var47 = var46.first();
                                                            while (module0742.NIL != var46) {
                                                                SubLObject var49;
                                                                final SubLObject var48 = var49 = var47;
                                                                SubLObject var50 = (SubLObject)module0742.NIL;
                                                                SubLObject var51 = (SubLObject)module0742.NIL;
                                                                SubLObject var52 = (SubLObject)module0742.NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)module0742.$ic78$);
                                                                var50 = var49.first();
                                                                var49 = var49.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)module0742.$ic78$);
                                                                var51 = var49.first();
                                                                var49 = var49.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)module0742.$ic78$);
                                                                var52 = var49.first();
                                                                var49 = var49.rest();
                                                                if (module0742.NIL == var49) {
                                                                    if (module0742.NIL != module0147.f9507(var51)) {
                                                                        final SubLObject var10_83 = module0138.$g1623$.currentBinding(var8);
                                                                        try {
                                                                            module0138.$g1623$.bind(var51, var8);
                                                                            if (module0742.NIL != module0141.f9289(var52)) {
                                                                                final SubLObject var10_84 = module0138.$g1624$.currentBinding(var8);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var52, var8);
                                                                                    final SubLObject var35;
                                                                                    final SubLObject var53 = var35 = (SubLObject)ConsesLow.list(var50);
                                                                                    if (module0742.NIL != module0077.f5302(var35)) {
                                                                                        final SubLObject var36 = module0077.f5333(var35);
                                                                                        SubLObject var37;
                                                                                        SubLObject var38;
                                                                                        SubLObject var39;
                                                                                        SubLObject var40;
                                                                                        SubLObject var41;
                                                                                        SubLObject var17_120;
                                                                                        for (var37 = module0032.f1741(var36), var38 = (SubLObject)module0742.NIL, var38 = module0032.f1742(var37, var36); module0742.NIL == module0032.f1744(var37, var38); var38 = module0032.f1743(var38)) {
                                                                                            var39 = module0032.f1745(var37, var38);
                                                                                            if (module0742.NIL != module0032.f1746(var38, var39) && module0742.NIL == module0249.f16059(var39, module0139.$g1636$.getDynamicValue(var8))) {
                                                                                                module0249.f16055(var39, module0139.$g1636$.getDynamicValue(var8));
                                                                                                if (module0742.NIL != module0173.f10955(var39)) {
                                                                                                    var40 = (var17_120 = f45938(var39, var10));
                                                                                                    var41 = (SubLObject)module0742.NIL;
                                                                                                    var41 = var17_120.first();
                                                                                                    while (module0742.NIL != var17_120) {
                                                                                                        module0084.f5762(var9, var41, var39);
                                                                                                        var17_120 = var17_120.rest();
                                                                                                        var41 = var17_120.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var35.isList()) {
                                                                                        SubLObject var120_131 = var35;
                                                                                        SubLObject var43 = (SubLObject)module0742.NIL;
                                                                                        var43 = var120_131.first();
                                                                                        while (module0742.NIL != var120_131) {
                                                                                            if (module0742.NIL == module0249.f16059(var43, module0139.$g1636$.getDynamicValue(var8))) {
                                                                                                module0249.f16055(var43, module0139.$g1636$.getDynamicValue(var8));
                                                                                                if (module0742.NIL != module0173.f10955(var43)) {
                                                                                                    SubLObject var17_121;
                                                                                                    final SubLObject var44 = var17_121 = f45938(var43, var10);
                                                                                                    SubLObject var45 = (SubLObject)module0742.NIL;
                                                                                                    var45 = var17_121.first();
                                                                                                    while (module0742.NIL != var17_121) {
                                                                                                        module0084.f5762(var9, var45, var43);
                                                                                                        var17_121 = var17_121.rest();
                                                                                                        var45 = var17_121.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            var120_131 = var120_131.rest();
                                                                                            var43 = var120_131.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0742.$ic76$, var35);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var10_84, var8);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var10_83, var8);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(var48, (SubLObject)module0742.$ic78$);
                                                                }
                                                                var46 = var46.rest();
                                                                var47 = var46.first();
                                                            }
                                                        }
                                                    }
                                                    else if (module0742.NIL != module0155.f9785(var27, (SubLObject)module0742.UNPROVIDED)) {
                                                        SubLObject var17_122;
                                                        final SubLObject var54 = var17_122 = ((module0742.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0742.$ic64$)), module0141.$g1714$.getDynamicValue(var8), module0137.f8955((SubLObject)module0742.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0742.$ic64$)), module0141.$g1714$.getDynamicValue(var8), module0137.f8955((SubLObject)module0742.UNPROVIDED)));
                                                        SubLObject var55 = (SubLObject)module0742.NIL;
                                                        var55 = var17_122.first();
                                                        while (module0742.NIL != var17_122) {
                                                            final SubLObject var10_85 = module0138.$g1625$.currentBinding(var8);
                                                            try {
                                                                module0138.$g1625$.bind(var55, var8);
                                                                final SubLObject var57;
                                                                final SubLObject var56 = var57 = Functions.funcall(var55, var27);
                                                                if (module0742.NIL != module0077.f5302(var57)) {
                                                                    final SubLObject var58 = module0077.f5333(var57);
                                                                    SubLObject var59;
                                                                    SubLObject var60;
                                                                    SubLObject var61;
                                                                    SubLObject var17_123;
                                                                    SubLObject var62;
                                                                    SubLObject var63;
                                                                    for (var59 = module0032.f1741(var58), var60 = (SubLObject)module0742.NIL, var60 = module0032.f1742(var59, var58); module0742.NIL == module0032.f1744(var59, var60); var60 = module0032.f1743(var60)) {
                                                                        var61 = module0032.f1745(var59, var60);
                                                                        if (module0742.NIL != module0032.f1746(var60, var61) && module0742.NIL == module0249.f16059(var61, module0139.$g1636$.getDynamicValue(var8))) {
                                                                            module0249.f16055(var61, module0139.$g1636$.getDynamicValue(var8));
                                                                            if (module0742.NIL != module0173.f10955(var61)) {
                                                                                var62 = (var17_123 = f45938(var61, var10));
                                                                                var63 = (SubLObject)module0742.NIL;
                                                                                var63 = var17_123.first();
                                                                                while (module0742.NIL != var17_123) {
                                                                                    module0084.f5762(var9, var63, var61);
                                                                                    var17_123 = var17_123.rest();
                                                                                    var63 = var17_123.first();
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (var57.isList()) {
                                                                    SubLObject var64 = var57;
                                                                    SubLObject var65 = (SubLObject)module0742.NIL;
                                                                    var65 = var64.first();
                                                                    while (module0742.NIL != var64) {
                                                                        if (module0742.NIL == module0249.f16059(var65, module0139.$g1636$.getDynamicValue(var8))) {
                                                                            module0249.f16055(var65, module0139.$g1636$.getDynamicValue(var8));
                                                                            if (module0742.NIL != module0173.f10955(var65)) {
                                                                                SubLObject var17_124;
                                                                                final SubLObject var66 = var17_124 = f45938(var65, var10);
                                                                                SubLObject var67 = (SubLObject)module0742.NIL;
                                                                                var67 = var17_124.first();
                                                                                while (module0742.NIL != var17_124) {
                                                                                    module0084.f5762(var9, var67, var65);
                                                                                    var17_124 = var17_124.rest();
                                                                                    var67 = var17_124.first();
                                                                                }
                                                                            }
                                                                        }
                                                                        var64 = var64.rest();
                                                                        var65 = var64.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0742.$ic76$, var57);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var10_85, var8);
                                                            }
                                                            var17_122 = var17_122.rest();
                                                            var55 = var17_122.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var58_80, var8);
                                                    module0137.$g1605$.rebind(var10_80, var8);
                                                }
                                                var25 = var25.rest();
                                                var26 = var25.first();
                                            }
                                            SubLObject var69;
                                            final SubLObject var68 = var69 = module0200.f12443(module0244.f15771(module0137.f8955(module0742.$ic64$)));
                                            SubLObject var70 = (SubLObject)module0742.NIL;
                                            var70 = var69.first();
                                            while (module0742.NIL != var69) {
                                                final SubLObject var10_86 = module0137.$g1605$.currentBinding(var8);
                                                final SubLObject var58_81 = module0141.$g1674$.currentBinding(var8);
                                                try {
                                                    module0137.$g1605$.bind(var70, var8);
                                                    module0141.$g1674$.bind((SubLObject)((module0742.NIL != module0141.f9205((SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0742.NIL == module0141.$g1674$.getDynamicValue(var8)) : module0141.$g1674$.getDynamicValue(var8)), var8);
                                                    final SubLObject var71 = module0228.f15229(var76_77);
                                                    if (module0742.NIL != module0138.f8992(var71)) {
                                                        final SubLObject var72 = module0242.f15664(var71, module0137.f8955((SubLObject)module0742.UNPROVIDED));
                                                        if (module0742.NIL != var72) {
                                                            final SubLObject var73 = module0245.f15834(var72, module0138.f8979(), module0137.f8955((SubLObject)module0742.UNPROVIDED));
                                                            if (module0742.NIL != var73) {
                                                                SubLObject var74;
                                                                for (var74 = module0066.f4838(module0067.f4891(var73)); module0742.NIL == module0066.f4841(var74); var74 = module0066.f4840(var74)) {
                                                                    var8.resetMultipleValues();
                                                                    final SubLObject var75 = module0066.f4839(var74);
                                                                    final SubLObject var76 = var8.secondMultipleValue();
                                                                    var8.resetMultipleValues();
                                                                    if (module0742.NIL != module0147.f9507(var75)) {
                                                                        final SubLObject var10_87 = module0138.$g1623$.currentBinding(var8);
                                                                        try {
                                                                            module0138.$g1623$.bind(var75, var8);
                                                                            SubLObject var105_110;
                                                                            for (var105_110 = module0066.f4838(module0067.f4891(var76)); module0742.NIL == module0066.f4841(var105_110); var105_110 = module0066.f4840(var105_110)) {
                                                                                var8.resetMultipleValues();
                                                                                final SubLObject var77 = module0066.f4839(var105_110);
                                                                                final SubLObject var78 = var8.secondMultipleValue();
                                                                                var8.resetMultipleValues();
                                                                                if (module0742.NIL != module0141.f9289(var77)) {
                                                                                    final SubLObject var10_88 = module0138.$g1624$.currentBinding(var8);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var77, var8);
                                                                                        final SubLObject var79 = var78;
                                                                                        if (module0742.NIL != module0077.f5302(var79)) {
                                                                                            final SubLObject var80 = module0077.f5333(var79);
                                                                                            SubLObject var81;
                                                                                            SubLObject var82;
                                                                                            SubLObject var83;
                                                                                            for (var81 = module0032.f1741(var80), var82 = (SubLObject)module0742.NIL, var82 = module0032.f1742(var81, var80); module0742.NIL == module0032.f1744(var81, var82); var82 = module0032.f1743(var82)) {
                                                                                                var83 = module0032.f1745(var81, var82);
                                                                                                if (module0742.NIL != module0032.f1746(var82, var83) && module0742.NIL == module0249.f16059(var83, (SubLObject)module0742.UNPROVIDED)) {
                                                                                                    module0249.f16055(var83, (SubLObject)module0742.UNPROVIDED);
                                                                                                    module0056.f4149(var83, var18);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var79.isList()) {
                                                                                            SubLObject var84 = var79;
                                                                                            SubLObject var85 = (SubLObject)module0742.NIL;
                                                                                            var85 = var84.first();
                                                                                            while (module0742.NIL != var84) {
                                                                                                if (module0742.NIL == module0249.f16059(var85, (SubLObject)module0742.UNPROVIDED)) {
                                                                                                    module0249.f16055(var85, (SubLObject)module0742.UNPROVIDED);
                                                                                                    module0056.f4149(var85, var18);
                                                                                                }
                                                                                                var84 = var84.rest();
                                                                                                var85 = var84.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0742.$ic76$, var79);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var10_88, var8);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var105_110);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var10_87, var8);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var74);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0742.FIVE_INTEGER, (SubLObject)module0742.$ic77$, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (module0742.NIL != module0155.f9785(var71, (SubLObject)module0742.UNPROVIDED)) {
                                                        SubLObject var17_125;
                                                        final SubLObject var86 = var17_125 = ((module0742.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var8), module0137.f8955((SubLObject)module0742.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var8), module0137.f8955((SubLObject)module0742.UNPROVIDED)));
                                                        SubLObject var87 = (SubLObject)module0742.NIL;
                                                        var87 = var17_125.first();
                                                        while (module0742.NIL != var17_125) {
                                                            final SubLObject var10_89 = module0138.$g1625$.currentBinding(var8);
                                                            try {
                                                                module0138.$g1625$.bind(var87, var8);
                                                                final SubLObject var89;
                                                                final SubLObject var88 = var89 = Functions.funcall(var87, var71);
                                                                if (module0742.NIL != module0077.f5302(var89)) {
                                                                    final SubLObject var90 = module0077.f5333(var89);
                                                                    SubLObject var91;
                                                                    SubLObject var92;
                                                                    SubLObject var93;
                                                                    for (var91 = module0032.f1741(var90), var92 = (SubLObject)module0742.NIL, var92 = module0032.f1742(var91, var90); module0742.NIL == module0032.f1744(var91, var92); var92 = module0032.f1743(var92)) {
                                                                        var93 = module0032.f1745(var91, var92);
                                                                        if (module0742.NIL != module0032.f1746(var92, var93) && module0742.NIL == module0249.f16059(var93, (SubLObject)module0742.UNPROVIDED)) {
                                                                            module0249.f16055(var93, (SubLObject)module0742.UNPROVIDED);
                                                                            module0056.f4149(var93, var18);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var89.isList()) {
                                                                    SubLObject var94 = var89;
                                                                    SubLObject var95 = (SubLObject)module0742.NIL;
                                                                    var95 = var94.first();
                                                                    while (module0742.NIL != var94) {
                                                                        if (module0742.NIL == module0249.f16059(var95, (SubLObject)module0742.UNPROVIDED)) {
                                                                            module0249.f16055(var95, (SubLObject)module0742.UNPROVIDED);
                                                                            module0056.f4149(var95, var18);
                                                                        }
                                                                        var94 = var94.rest();
                                                                        var95 = var94.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0742.$ic76$, var89);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var10_89, var8);
                                                            }
                                                            var17_125 = var17_125.rest();
                                                            var87 = var17_125.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var58_81, var8);
                                                    module0137.$g1605$.rebind(var10_86, var8);
                                                }
                                                var69 = var69.rest();
                                                var70 = var69.first();
                                            }
                                            var76_77 = module0056.f4150(var18);
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var59_86, var8);
                                        module0138.$g1619$.rebind(var58_79, var8);
                                        module0141.$g1677$.rebind(var10_79, var8);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)module0742.TWO_INTEGER, (SubLObject)module0742.$ic79$, var16, module0244.f15748(module0137.f8955((SubLObject)module0742.UNPROVIDED)), (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var22, var8);
                                module0141.$g1674$.rebind(var21, var8);
                                module0141.$g1672$.rebind(var59_85, var8);
                                module0141.$g1671$.rebind(var58_78, var8);
                                module0141.$g1670$.rebind(var10_78, var8);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var58_77, var8);
                            module0141.$g1714$.rebind(var10_77, var8);
                        }
                    }
                    finally {
                        module0147.$g2096$.rebind(var59_84, var8);
                        module0147.$g2094$.rebind(var58_76, var8);
                        module0147.$g2095$.rebind(var10_76, var8);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var8));
                }
                finally {
                    module0139.$g1635$.rebind(var10_75, var8);
                }
                module0139.f9011(module0139.$g1636$.getDynamicValue(var8));
            }
            finally {
                module0139.$g1636$.rebind(var58_75, var8);
                module0137.$g1605$.rebind(var10_74, var8);
            }
            var11 = Sort.sort(module0084.f5780(var9), (SubLObject)module0742.$ic80$, Symbols.symbol_function((SubLObject)module0742.$ic81$));
            var11 = Sort.stable_sort(var11, (SubLObject)module0742.$ic82$, Symbols.symbol_function((SubLObject)module0742.$ic81$));
            SubLObject var96 = (SubLObject)module0742.NIL;
            SubLObject var97 = (SubLObject)module0742.NIL;
            SubLObject var98 = (SubLObject)module0742.NIL;
            var96 = var11;
            var97 = var96.first();
            for (var98 = (SubLObject)module0742.ZERO_INTEGER; module0742.NIL != var96; var96 = var96.rest(), var97 = var96.first(), var98 = Numbers.add((SubLObject)module0742.ONE_INTEGER, var98)) {
                ConsesLow.set_nth(var98, var11, (SubLObject)ConsesLow.cons(var97.first(), Sort.sort(var97.rest(), (SubLObject)module0742.$ic17$, (SubLObject)module0742.$ic83$)));
            }
        }
        finally {
            module0147.$g2096$.rebind(var15, var8);
            module0147.$g2094$.rebind(var14, var8);
            module0147.$g2095$.rebind(var13, var8);
        }
        return var11;
    }
    
    public static SubLObject f45937(final SubLObject var149) {
        final SubLThread var150 = SubLProcess.currentSubLThread();
        module0642.f39021((SubLObject)module0742.$ic84$);
        module0642.f39026((SubLObject)module0742.UNPROVIDED);
        module0642.f39019((SubLObject)module0742.$ic85$);
        module0642.f39020(module0015.$g185$.getGlobalValue());
        SubLObject var151 = var149;
        SubLObject var152 = (SubLObject)module0742.NIL;
        var152 = var151.first();
        while (module0742.NIL != var151) {
            SubLObject var154;
            final SubLObject var153 = var154 = var152;
            SubLObject var155 = (SubLObject)module0742.NIL;
            SubLObject var156 = (SubLObject)module0742.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var154, var153, (SubLObject)module0742.$ic53$);
            var155 = var154.first();
            var154 = (var156 = var154.rest());
            final SubLObject var157 = PrintLow.format((SubLObject)module0742.NIL, (SubLObject)module0742.$ic86$, module0656.f39942(var155));
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020(var157);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
            final SubLObject var158 = module0015.$g533$.currentBinding(var150);
            try {
                module0015.$g533$.bind((SubLObject)module0742.T, var150);
                module0642.f39019(var155);
                module0642.f39026((SubLObject)module0742.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var158, var150);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
            var151 = var151.rest();
            var152 = var151.first();
        }
        module0642.f39020(module0015.$g186$.getGlobalValue());
        return var149;
    }
    
    public static SubLObject f45938(final SubLObject var49, SubLObject var152) {
        if (var152 == module0742.UNPROVIDED) {
            var152 = module0677.f41312();
        }
        final SubLThread var153 = SubLProcess.currentSubLThread();
        final SubLObject var154 = module0226.f14990(var49, var152);
        SubLObject var155 = (SubLObject)module0742.NIL;
        final SubLObject var156 = module0147.f9540(var152);
        final SubLObject var157 = module0147.$g2095$.currentBinding(var153);
        final SubLObject var158 = module0147.$g2094$.currentBinding(var153);
        final SubLObject var159 = module0147.$g2096$.currentBinding(var153);
        final SubLObject var160 = module0579.$g4260$.currentBinding(var153);
        try {
            module0147.$g2095$.bind(module0147.f9545(var156), var153);
            module0147.$g2094$.bind(module0147.f9546(var156), var153);
            module0147.$g2096$.bind(module0147.f9549(var156), var153);
            module0579.$g4260$.bind(var152, var153);
            var155 = module0035.remove_if_not((SubLObject)module0742.$ic87$, var154, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
            var155 = module0035.f2467(var155, (SubLObject)module0742.$ic88$, (SubLObject)module0742.UNPROVIDED);
        }
        finally {
            module0579.$g4260$.rebind(var160, var153);
            module0147.$g2096$.rebind(var159, var153);
            module0147.$g2094$.rebind(var158, var153);
            module0147.$g2095$.rebind(var157, var153);
        }
        return var155;
    }
    
    public static SubLObject f45928(final SubLObject var155, SubLObject var13) {
        if (var13 == module0742.UNPROVIDED) {
            var13 = (SubLObject)module0742.NIL;
        }
        final SubLThread var156 = SubLProcess.currentSubLThread();
        SubLObject var157 = (SubLObject)module0742.NIL;
        SubLObject var158 = (SubLObject)module0742.NIL;
        final SubLObject var159 = module0580.$g4361$.currentBinding(var156);
        try {
            module0580.$g4361$.bind((SubLObject)module0742.NIL, var156);
            var156.resetMultipleValues();
            final SubLObject var10_158 = module0580.$g4362$.currentBinding(var156);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var156);
                final SubLObject var160 = var156.secondMultipleValue();
                var156.resetMultipleValues();
                try {
                    var156.resetMultipleValues();
                    final SubLObject var10_159 = module0580.$g4358$.currentBinding(var156);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var156);
                        final SubLObject var161 = var156.secondMultipleValue();
                        var156.resetMultipleValues();
                        final SubLObject var10_160 = module0580.$g4359$.currentBinding(var156);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var156);
                            final SubLObject var162 = module0580.$g4358$.getDynamicValue(var156);
                            final SubLObject var10_161 = module0034.$g879$.currentBinding(var156);
                            try {
                                module0034.$g879$.bind(var162, var156);
                                SubLObject var163 = (SubLObject)module0742.NIL;
                                if (module0742.NIL != var162 && module0742.NIL == module0034.f1842(var162)) {
                                    var163 = module0034.f1869(var162);
                                    final SubLObject var164 = Threads.current_process();
                                    if (module0742.NIL == var163) {
                                        module0034.f1873(var162, var164);
                                    }
                                    else if (!var163.eql(var164)) {
                                        Errors.error((SubLObject)module0742.$ic89$);
                                    }
                                }
                                try {
                                    SubLObject var165 = var155;
                                    SubLObject var166 = (SubLObject)module0742.NIL;
                                    var166 = var165.first();
                                    while (module0742.NIL != var165) {
                                        if (module0742.NIL != assertion_handles_oc.f11035(var166)) {
                                            var158 = (SubLObject)SubLObjectFactory.makeBoolean(module0742.NIL == module0161.f10514(module0178.f11287(var166), var157));
                                            if (module0742.NIL != var158) {
                                                var157 = module0178.f11287(var166);
                                            }
                                            f45939(var166, var13, var158);
                                        }
                                        else {
                                            module0656.f39804(var166, (SubLObject)module0742.NIL, (SubLObject)module0742.T);
                                            module0642.f39026((SubLObject)module0742.TWO_INTEGER);
                                            var157 = (SubLObject)module0742.NIL;
                                        }
                                        var165 = var165.rest();
                                        var166 = var165.first();
                                    }
                                }
                                finally {
                                    final SubLObject var10_162 = Threads.$is_thread_performing_cleanupP$.currentBinding(var156);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0742.T, var156);
                                        if (module0742.NIL != var162 && module0742.NIL == var163) {
                                            module0034.f1873(var162, (SubLObject)module0742.NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var10_162, var156);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var10_161, var156);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var10_160, var156);
                        }
                        if (var161 == module0742.$ic90$ && module0742.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var156))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var156));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var10_159, var156);
                    }
                }
                finally {
                    final SubLObject var10_163 = Threads.$is_thread_performing_cleanupP$.currentBinding(var156);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0742.T, var156);
                        if (module0742.NIL == var160) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var156));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var10_163, var156);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var10_158, var156);
            }
        }
        finally {
            module0580.$g4361$.rebind(var159, var156);
        }
        return (SubLObject)module0742.T;
    }
    
    public static SubLObject f45940(final SubLObject var169) {
        final SubLThread var170 = SubLProcess.currentSubLThread();
        final SubLObject var171 = f45941(var169);
        final SubLObject var172 = module0035.f2293(module0742.$g5886$.getGlobalValue(), var171, (SubLObject)module0742.EQL, (SubLObject)module0742.UNPROVIDED);
        final SubLObject var173 = Sequences.cconcatenate((SubLObject)module0742.$ic94$, new SubLObject[] { module0006.f203(assertion_handles_oc.f11025(var169)), module0742.$ic95$, module0006.f203(var172), module0742.$ic96$ });
        final SubLObject var174 = module0035.f2293(module0742.$g5887$.getGlobalValue(), var171, (SubLObject)module0742.EQL, (SubLObject)module0742.UNPROVIDED);
        final SubLObject var175 = module0035.f2293(module0742.$g5888$.getGlobalValue(), var171, (SubLObject)module0742.EQL, (SubLObject)module0742.UNPROVIDED);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        module0642.f39020(var173);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        if (module0742.NIL != var174) {
            module0642.f39020(module0015.$g386$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020(var174);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        }
        module0642.f39020(module0015.$g388$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        module0642.f39020((SubLObject)module0742.$ic97$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        final SubLObject var176 = module0015.$g533$.currentBinding(var170);
        try {
            module0015.$g533$.bind((SubLObject)module0742.T, var170);
            final SubLObject var177 = Sequences.cconcatenate(module0110.$g124$.getDynamicValue(var170), module0014.f683(var175));
            final SubLObject var178 = (SubLObject)module0742.$ic57$;
            final SubLObject var179 = module0014.f679(var175);
            final SubLObject var180 = (SubLObject)module0742.ZERO_INTEGER;
            module0642.f39020(module0015.$g431$.getGlobalValue());
            module0642.f39020(module0015.$g440$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020(var177);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            if (module0742.NIL != var179) {
                module0642.f39020(module0015.$g437$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39020(var179);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            }
            if (module0742.NIL != var178) {
                module0642.f39020(module0015.$g438$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39020(module0642.f39049(var178));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            }
            if (module0742.NIL != var180) {
                module0642.f39020(module0015.$g439$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39020(var180);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
            final SubLObject var10_178 = module0015.$g533$.currentBinding(var170);
            try {
                module0015.$g533$.bind((SubLObject)module0742.T, var170);
            }
            finally {
                module0015.$g533$.rebind(var10_178, var170);
            }
            module0642.f39020(module0015.$g432$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var176, var170);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var169;
    }
    
    public static SubLObject f45942(final SubLObject var169) {
        final SubLThread var170 = SubLProcess.currentSubLThread();
        final SubLObject var171 = f45943(var169);
        final SubLObject var172 = (SubLObject)((module0742.NIL != var171) ? module0742.$ic99$ : module0742.$ic100$);
        final SubLObject var173 = (SubLObject)((module0742.NIL != var171) ? module0742.$ic101$ : module0742.$ic102$);
        final SubLObject var174 = Sequences.cconcatenate((SubLObject)module0742.$ic103$, new SubLObject[] { module0006.f203(assertion_handles_oc.f11025(var169)), module0742.$ic95$, module0006.f203(var172), module0742.$ic96$ });
        final SubLObject var175 = (SubLObject)((module0742.NIL != var171) ? module0742.$ic104$ : module0742.$ic105$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        module0642.f39020(var174);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        if (module0742.NIL != var173) {
            module0642.f39020(module0015.$g386$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020(var173);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        final SubLObject var176 = module0015.$g533$.currentBinding(var170);
        try {
            module0015.$g533$.bind((SubLObject)module0742.T, var170);
            final SubLObject var177 = Sequences.cconcatenate(module0110.$g124$.getDynamicValue(var170), module0014.f683(var175));
            final SubLObject var178 = (SubLObject)module0742.$ic57$;
            final SubLObject var179 = module0014.f679(var175);
            final SubLObject var180 = (SubLObject)module0742.ZERO_INTEGER;
            module0642.f39020(module0015.$g431$.getGlobalValue());
            module0642.f39020(module0015.$g440$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020(var177);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            if (module0742.NIL != var179) {
                module0642.f39020(module0015.$g437$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39020(var179);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            }
            if (module0742.NIL != var178) {
                module0642.f39020(module0015.$g438$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39020(module0642.f39049(var178));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            }
            if (module0742.NIL != var180) {
                module0642.f39020(module0015.$g439$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39020(var180);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
            final SubLObject var10_184 = module0015.$g533$.currentBinding(var170);
            try {
                module0015.$g533$.bind((SubLObject)module0742.T, var170);
            }
            finally {
                module0015.$g533$.rebind(var10_184, var170);
            }
            module0642.f39020(module0015.$g432$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var176, var170);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var169;
    }
    
    public static SubLObject f45941(final SubLObject var169) {
        final SubLThread var170 = SubLProcess.currentSubLThread();
        final SubLObject var171 = module0147.$g2094$.currentBinding(var170);
        final SubLObject var172 = module0147.$g2095$.currentBinding(var170);
        try {
            module0147.$g2094$.bind((SubLObject)module0742.$ic106$, var170);
            module0147.$g2095$.bind(module0742.$ic107$, var170);
            if (module0742.NIL != module0158.f10282(var169, (SubLObject)module0742.NIL)) {
                final SubLObject var173 = module0158.f10283(var169, (SubLObject)module0742.NIL);
                SubLObject var174 = (SubLObject)module0742.NIL;
                final SubLObject var175 = (SubLObject)module0742.NIL;
                while (module0742.NIL == var174) {
                    final SubLObject var176 = module0052.f3695(var173, var175);
                    final SubLObject var177 = (SubLObject)SubLObjectFactory.makeBoolean(!var175.eql(var176));
                    if (module0742.NIL != var177) {
                        SubLObject var178 = (SubLObject)module0742.NIL;
                        try {
                            var178 = module0158.f10316(var176, (SubLObject)module0742.NIL, (SubLObject)module0742.NIL, (SubLObject)module0742.NIL);
                            SubLObject var186_191 = (SubLObject)module0742.NIL;
                            final SubLObject var187_192 = (SubLObject)module0742.NIL;
                            while (module0742.NIL == var186_191) {
                                final SubLObject var179 = module0052.f3695(var178, var187_192);
                                final SubLObject var189_194 = (SubLObject)SubLObjectFactory.makeBoolean(!var187_192.eql(var179));
                                if (module0742.NIL != var189_194 && module0742.NIL != module0158.f10284(var179, var176) && module0205.f13132(var179).eql(module0742.$ic108$)) {
                                    return module0205.f13204(var179, (SubLObject)module0742.UNPROVIDED);
                                }
                                var186_191 = (SubLObject)SubLObjectFactory.makeBoolean(module0742.NIL == var189_194);
                            }
                        }
                        finally {
                            final SubLObject var10_195 = Threads.$is_thread_performing_cleanupP$.currentBinding(var170);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0742.T, var170);
                                if (module0742.NIL != var178) {
                                    module0158.f10319(var178);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var10_195, var170);
                            }
                        }
                    }
                    var174 = (SubLObject)SubLObjectFactory.makeBoolean(module0742.NIL == var177);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var172, var170);
            module0147.$g2094$.rebind(var171, var170);
        }
        return (SubLObject)module0742.$ic110$;
    }
    
    public static SubLObject f45944(final SubLObject var169) {
        return Equality.eql(f45941(var169), module0742.$ic111$);
    }
    
    public static SubLObject f45945(final SubLObject var169) {
        return Equality.eql(f45941(var169), module0742.$ic112$);
    }
    
    public static SubLObject f45946(final SubLObject var169) {
        return Equality.eql(f45941(var169), (SubLObject)module0742.$ic110$);
    }
    
    public static SubLObject f45947(final SubLObject var169) {
        return Equality.eql(f45941(var169), module0742.$ic113$);
    }
    
    public static SubLObject f45943(final SubLObject var169) {
        return module0035.sublisp_boolean(module0219.f14509(var169, (SubLObject)module0742.TWO_INTEGER, module0742.$ic114$, module0178.f11287(var169), (SubLObject)module0742.UNPROVIDED));
    }
    
    public static SubLObject f45939(final SubLObject var196, final SubLObject var13, SubLObject var157) {
        if (var157 == module0742.UNPROVIDED) {
            var157 = (SubLObject)module0742.T;
        }
        final SubLThread var197 = SubLProcess.currentSubLThread();
        if (module0742.NIL != var157) {
            module0642.f39026((SubLObject)module0742.UNPROVIDED);
            module0642.f39020(module0015.$g209$.getGlobalValue());
            module0642.f39019((SubLObject)module0742.$ic134$);
            module0656.f39804(module0178.f11287(var196), (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020(module0015.$g210$.getGlobalValue());
            module0642.f39026((SubLObject)module0742.UNPROVIDED);
        }
        module0656.f39916(var196, module0655.$g5095$.getDynamicValue(var197), (SubLObject)module0742.NIL);
        module0642.f39026((SubLObject)module0742.UNPROVIDED);
        if (module0742.NIL != var13 && module0742.NIL != module0211.f13640(var196)) {
            SubLObject var198 = (SubLObject)module0742.NIL;
            try {
                var197.throwStack.push(module0742.$ic135$);
                final SubLObject var199 = Errors.$error_handler$.currentBinding(var197);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0742.$ic136$), var197);
                    try {
                        final SubLObject var10_198 = module0579.$g4298$.currentBinding(var197);
                        try {
                            module0579.$g4298$.bind((SubLObject)module0742.$ic137$, var197);
                            final SubLObject var200 = module0777.f50117(var196, (SubLObject)module0742.UNPROVIDED);
                            module0642.f39019((SubLObject)module0742.$ic138$);
                            if (module0742.NIL == var200) {
                                module0642.f39019((SubLObject)module0742.$ic139$);
                            }
                            else {
                                SubLObject var201 = var200;
                                SubLObject var202 = (SubLObject)module0742.NIL;
                                var202 = var201.first();
                                while (module0742.NIL != var201) {
                                    module0642.f39032((SubLObject)module0742.UNPROVIDED);
                                    PrintLow.format(module0015.$g131$.getDynamicValue(var197), (SubLObject)module0742.$ic140$, var202);
                                    var201 = var201.rest();
                                    var202 = var201.first();
                                }
                            }
                            module0642.f39026((SubLObject)module0742.TWO_INTEGER);
                        }
                        finally {
                            module0579.$g4298$.rebind(var10_198, var197);
                        }
                    }
                    catch (Throwable var203) {
                        Errors.handleThrowable(var203, (SubLObject)module0742.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var199, var197);
                }
            }
            catch (Throwable var204) {
                var198 = Errors.handleThrowable(var204, (SubLObject)module0742.$ic135$);
            }
            finally {
                var197.throwStack.pop();
            }
        }
        return var196;
    }
    
    public static SubLObject f45925(final SubLObject var5, SubLObject var13) {
        if (var13 == module0742.UNPROVIDED) {
            var13 = (SubLObject)module0742.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39020(module0015.$g219$.getGlobalValue());
        module0642.f39020(module0015.$g221$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        module0642.f39020((SubLObject)module0742.FIVE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        SubLObject var15 = module0015.$g533$.currentBinding(var14);
        try {
            module0015.$g533$.bind((SubLObject)module0742.T, var14);
            if (module0742.NIL != var13) {
                module0642.f39019((SubLObject)module0742.$ic22$);
            }
            module0642.f39019((SubLObject)module0742.$ic141$);
            module0656.f39804(var5, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
            module0642.f39019((SubLObject)module0742.$ic59$);
        }
        finally {
            module0015.$g533$.rebind(var15, var14);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)module0742.TWO_INTEGER);
        f45948(var5, var13);
        var15 = module0147.$g2094$.currentBinding(var14);
        final SubLObject var16 = module0147.$g2095$.currentBinding(var14);
        try {
            module0147.$g2094$.bind((SubLObject)module0742.$ic106$, var14);
            module0147.$g2095$.bind(module0742.$ic107$, var14);
            if (module0742.NIL != module0269.f17706(var5) || module0742.NIL != module0269.f17708(var5)) {
                f45949(var5, var13);
            }
        }
        finally {
            module0147.$g2095$.rebind(var16, var14);
            module0147.$g2094$.rebind(var15, var14);
        }
        return (SubLObject)module0742.T;
    }
    
    public static SubLObject f45950(final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        final SubLObject var39 = module0580.$g4361$.currentBinding(var38);
        try {
            module0580.$g4361$.bind((SubLObject)module0742.NIL, var38);
            var38.resetMultipleValues();
            final SubLObject var10_203 = module0580.$g4362$.currentBinding(var38);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var38);
                final SubLObject var40 = var38.secondMultipleValue();
                var38.resetMultipleValues();
                try {
                    var38.resetMultipleValues();
                    final SubLObject var10_204 = module0580.$g4358$.currentBinding(var38);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var38);
                        final SubLObject var41 = var38.secondMultipleValue();
                        var38.resetMultipleValues();
                        final SubLObject var10_205 = module0580.$g4359$.currentBinding(var38);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var38);
                            final SubLObject var42 = module0580.$g4358$.getDynamicValue(var38);
                            final SubLObject var10_206 = module0034.$g879$.currentBinding(var38);
                            try {
                                module0034.$g879$.bind(var42, var38);
                                SubLObject var43 = (SubLObject)module0742.NIL;
                                if (module0742.NIL != var42 && module0742.NIL == module0034.f1842(var42)) {
                                    var43 = module0034.f1869(var42);
                                    final SubLObject var44 = Threads.current_process();
                                    if (module0742.NIL == var43) {
                                        module0034.f1873(var42, var44);
                                    }
                                    else if (!var43.eql(var44)) {
                                        Errors.error((SubLObject)module0742.$ic89$);
                                    }
                                }
                                try {
                                    final SubLObject var10_207 = module0579.$g4260$.currentBinding(var38);
                                    final SubLObject var45 = module0579.$g4259$.currentBinding(var38);
                                    try {
                                        module0579.$g4260$.bind(module0677.f41312(), var38);
                                        module0579.$g4259$.bind((SubLObject)module0742.$ic142$, var38);
                                        return module0770.f49049(var37, (SubLObject)module0742.$ic110$, (SubLObject)module0742.NIL, module0677.f41312(), module0742.$ic143$, (SubLObject)module0742.$ic142$, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
                                    }
                                    finally {
                                        module0579.$g4259$.rebind(var45, var38);
                                        module0579.$g4260$.rebind(var10_207, var38);
                                    }
                                }
                                finally {
                                    final SubLObject var10_208 = Threads.$is_thread_performing_cleanupP$.currentBinding(var38);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0742.T, var38);
                                        if (module0742.NIL != var42 && module0742.NIL == var43) {
                                            module0034.f1873(var42, (SubLObject)module0742.NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var10_208, var38);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var10_206, var38);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var10_205, var38);
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var10_204, var38);
                    }
                }
                finally {
                    final SubLObject var10_209 = Threads.$is_thread_performing_cleanupP$.currentBinding(var38);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0742.T, var38);
                        if (module0742.NIL == var40) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var38));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var10_209, var38);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var10_203, var38);
            }
        }
        finally {
            module0580.$g4361$.rebind(var39, var38);
        }
    }
    
    public static SubLObject f45951(final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        final SubLObject var39 = module0580.$g4361$.currentBinding(var38);
        try {
            module0580.$g4361$.bind((SubLObject)module0742.NIL, var38);
            var38.resetMultipleValues();
            final SubLObject var10_210 = module0580.$g4362$.currentBinding(var38);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var38);
                final SubLObject var40 = var38.secondMultipleValue();
                var38.resetMultipleValues();
                try {
                    var38.resetMultipleValues();
                    final SubLObject var10_211 = module0580.$g4358$.currentBinding(var38);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var38);
                        final SubLObject var41 = var38.secondMultipleValue();
                        var38.resetMultipleValues();
                        final SubLObject var10_212 = module0580.$g4359$.currentBinding(var38);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var38);
                            final SubLObject var42 = module0580.$g4358$.getDynamicValue(var38);
                            final SubLObject var10_213 = module0034.$g879$.currentBinding(var38);
                            try {
                                module0034.$g879$.bind(var42, var38);
                                SubLObject var43 = (SubLObject)module0742.NIL;
                                if (module0742.NIL != var42 && module0742.NIL == module0034.f1842(var42)) {
                                    var43 = module0034.f1869(var42);
                                    final SubLObject var44 = Threads.current_process();
                                    if (module0742.NIL == var43) {
                                        module0034.f1873(var42, var44);
                                    }
                                    else if (!var43.eql(var44)) {
                                        Errors.error((SubLObject)module0742.$ic89$);
                                    }
                                }
                                try {
                                    final SubLObject var10_214 = module0579.$g4260$.currentBinding(var38);
                                    final SubLObject var45 = module0579.$g4259$.currentBinding(var38);
                                    try {
                                        module0579.$g4260$.bind(module0677.f41312(), var38);
                                        module0579.$g4259$.bind((SubLObject)module0742.$ic142$, var38);
                                        return module0764.f48457(var37, (SubLObject)module0742.$ic144$, (SubLObject)module0742.$ic145$, (SubLObject)module0742.$ic142$, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
                                    }
                                    finally {
                                        module0579.$g4259$.rebind(var45, var38);
                                        module0579.$g4260$.rebind(var10_214, var38);
                                    }
                                }
                                finally {
                                    final SubLObject var10_215 = Threads.$is_thread_performing_cleanupP$.currentBinding(var38);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0742.T, var38);
                                        if (module0742.NIL != var42 && module0742.NIL == var43) {
                                            module0034.f1873(var42, (SubLObject)module0742.NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var10_215, var38);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var10_213, var38);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var10_212, var38);
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var10_211, var38);
                    }
                }
                finally {
                    final SubLObject var10_216 = Threads.$is_thread_performing_cleanupP$.currentBinding(var38);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0742.T, var38);
                        if (module0742.NIL == var40) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var38));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var10_216, var38);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var10_210, var38);
            }
        }
        finally {
            module0580.$g4361$.rebind(var39, var38);
        }
    }
    
    public static SubLObject f45948(final SubLObject var37, SubLObject var13) {
        if (var13 == module0742.UNPROVIDED) {
            var13 = (SubLObject)module0742.NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        final SubLObject var39 = module0579.$g4298$.currentBinding(var38);
        try {
            module0579.$g4298$.bind((SubLObject)module0742.$ic137$, var38);
            var38.resetMultipleValues();
            final SubLObject var40 = f45950(var37);
            final SubLObject var41 = var38.secondMultipleValue();
            final SubLObject var42 = var38.thirdMultipleValue();
            var38.resetMultipleValues();
            final SubLObject var43 = conses_high.member(module0756.f47689(), var42, Symbols.symbol_function((SubLObject)module0742.EQUAL), (SubLObject)module0742.UNPROVIDED);
            f45952((SubLObject)module0742.$ic146$, var40, var41, var37, var13, var43, (SubLObject)module0742.UNPROVIDED);
            module0642.f39026((SubLObject)module0742.UNPROVIDED);
            if (module0742.NIL != var13) {
                final SubLObject var44 = f45951(var37);
                SubLObject var45 = Sequences.remove(var40, var44, Symbols.symbol_function((SubLObject)module0742.EQUALP), (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
                if (module0742.NIL == var45) {
                    var45 = (SubLObject)ConsesLow.cons((SubLObject)module0742.$ic147$, var45);
                }
                module0642.f39020(module0015.$g209$.getGlobalValue());
                module0642.f39019((SubLObject)module0742.$ic148$);
                module0642.f39020(module0015.$g210$.getGlobalValue());
                final SubLObject var46 = Sequences.length(var45);
                SubLObject var47 = (SubLObject)module0742.NIL;
                SubLObject var200_223 = (SubLObject)module0742.NIL;
                SubLObject var48 = (SubLObject)module0742.NIL;
                var47 = var45;
                var200_223 = var47.first();
                for (var48 = (SubLObject)module0742.ZERO_INTEGER; module0742.NIL != var47; var47 = var47.rest(), var200_223 = var47.first(), var48 = Numbers.add((SubLObject)module0742.ONE_INTEGER, var48)) {
                    PrintLow.format(module0015.$g131$.getDynamicValue(var38), (SubLObject)module0742.$ic140$, var200_223);
                    if (!var48.numGE(module0048.f_1_(var46))) {
                        module0642.f39019((SubLObject)module0742.$ic149$);
                    }
                }
                module0642.f39026((SubLObject)module0742.TWO_INTEGER);
            }
            return Values.values(var40, var41);
        }
        finally {
            module0579.$g4298$.rebind(var39, var38);
        }
    }
    
    public static SubLObject f45952(final SubLObject var225, SubLObject var200, final SubLObject var217, final SubLObject var5, final SubLObject var13, SubLObject var219, SubLObject var226) {
        if (var219 == module0742.UNPROVIDED) {
            var219 = (SubLObject)module0742.NIL;
        }
        if (var226 == module0742.UNPROVIDED) {
            var226 = (SubLObject)module0742.NIL;
        }
        final SubLThread var227 = SubLProcess.currentSubLThread();
        var200 = module0038.f2669(var200, (SubLObject)module0742.$ic150$, (SubLObject)module0742.$ic151$);
        module0642.f39020(module0015.$g209$.getGlobalValue());
        PrintLow.format(module0015.$g131$.getDynamicValue(var227), (SubLObject)module0742.$ic152$, var225);
        module0642.f39020(module0015.$g210$.getGlobalValue());
        final SubLObject var228 = module0035.f2002(var200, (SubLObject)module0742.$ic153$, (SubLObject)module0742.UNPROVIDED);
        if (module0742.NIL != var228) {
            module0642.f39026((SubLObject)module0742.UNPROVIDED);
            module0642.f39032((SubLObject)module0742.THREE_INTEGER);
        }
        PrintLow.format(module0015.$g131$.getDynamicValue(var227), (SubLObject)module0742.$ic140$, var200);
        if (module0742.NIL != var228) {
            module0642.f39026((SubLObject)module0742.UNPROVIDED);
            module0642.f39032((SubLObject)module0742.THREE_INTEGER);
        }
        PrintLow.format(module0015.$g131$.getDynamicValue(var227), (SubLObject)module0742.$ic154$, (SubLObject)((module0742.NIL != var217) ? var217 : module0742.$ic155$));
        if (module0742.NIL != var13 && module0742.NIL != module0035.f2013(var226)) {
            module0642.f39026((SubLObject)module0742.UNPROVIDED);
            module0642.f39019((SubLObject)module0742.$ic156$);
            SubLObject var229 = var226;
            SubLObject var230 = (SubLObject)module0742.NIL;
            var230 = var229.first();
            while (module0742.NIL != var229) {
                module0656.f39804(var230, (SubLObject)module0742.ONE_INTEGER, (SubLObject)module0742.T);
                module0642.f39026((SubLObject)module0742.UNPROVIDED);
                var229 = var229.rest();
                var230 = var229.first();
            }
        }
        module0642.f39026((SubLObject)module0742.UNPROVIDED);
        if (module0742.NIL != var219) {
            module0642.f39032((SubLObject)module0742.THREE_INTEGER);
            module0642.f39019((SubLObject)module0742.$ic157$);
            module0642.f39032((SubLObject)module0742.UNPROVIDED);
            module0656.f39837((SubLObject)module0742.$ic41$, var5, var13, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
        }
        return (SubLObject)module0742.NIL;
    }
    
    public static SubLObject f45949(final SubLObject var5, final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0751.f47156(var5, (SubLObject)module0742.T);
        if (module0742.NIL != module0206.f13464(var15)) {
            final SubLObject var16 = module0580.$g4361$.currentBinding(var14);
            try {
                module0580.$g4361$.bind((SubLObject)module0742.NIL, var14);
                var14.resetMultipleValues();
                final SubLObject var10_230 = module0580.$g4362$.currentBinding(var14);
                try {
                    module0580.$g4362$.bind(module0580.f35560(), var14);
                    final SubLObject var17 = var14.secondMultipleValue();
                    var14.resetMultipleValues();
                    try {
                        var14.resetMultipleValues();
                        final SubLObject var10_231 = module0580.$g4358$.currentBinding(var14);
                        try {
                            module0580.$g4358$.bind(module0580.f35544(), var14);
                            final SubLObject var18 = var14.secondMultipleValue();
                            var14.resetMultipleValues();
                            final SubLObject var10_232 = module0580.$g4359$.currentBinding(var14);
                            try {
                                module0580.$g4359$.bind(module0580.f35545(), var14);
                                final SubLObject var19 = module0580.$g4358$.getDynamicValue(var14);
                                final SubLObject var10_233 = module0034.$g879$.currentBinding(var14);
                                try {
                                    module0034.$g879$.bind(var19, var14);
                                    SubLObject var20 = (SubLObject)module0742.NIL;
                                    if (module0742.NIL != var19 && module0742.NIL == module0034.f1842(var19)) {
                                        var20 = module0034.f1869(var19);
                                        final SubLObject var21 = Threads.current_process();
                                        if (module0742.NIL == var20) {
                                            module0034.f1873(var19, var21);
                                        }
                                        else if (!var20.eql(var21)) {
                                            Errors.error((SubLObject)module0742.$ic89$);
                                        }
                                    }
                                    try {
                                        final SubLObject var10_234 = module0579.$g4260$.currentBinding(var14);
                                        final SubLObject var22 = module0579.$g4259$.currentBinding(var14);
                                        try {
                                            module0579.$g4260$.bind(module0677.f41312(), var14);
                                            module0579.$g4259$.bind((SubLObject)module0742.$ic142$, var14);
                                            var14.resetMultipleValues();
                                            final SubLObject var23 = f45950(var15);
                                            final SubLObject var24 = var14.secondMultipleValue();
                                            final SubLObject var25 = var14.thirdMultipleValue();
                                            var14.resetMultipleValues();
                                            f45952((SubLObject)module0742.$ic158$, var23, var24, var5, var13, (SubLObject)module0742.NIL, module0035.remove_if_not((SubLObject)module0742.$ic159$, var25, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED));
                                            if (module0742.NIL != var13) {
                                                final SubLObject var26 = Sequences.remove(var23, module0764.f48457(var15, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED), Symbols.symbol_function((SubLObject)module0742.EQUAL), (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
                                                if (module0742.NIL != module0035.f2013(var26)) {
                                                    module0642.f39020(module0015.$g209$.getGlobalValue());
                                                    module0642.f39019((SubLObject)module0742.$ic160$);
                                                    module0642.f39020(module0015.$g210$.getGlobalValue());
                                                    SubLObject var27 = var26;
                                                    SubLObject var28 = (SubLObject)module0742.NIL;
                                                    var28 = var27.first();
                                                    while (module0742.NIL != var27) {
                                                        module0642.f39026((SubLObject)module0742.UNPROVIDED);
                                                        module0642.f39032((SubLObject)module0742.THREE_INTEGER);
                                                        PrintLow.format(module0015.$g131$.getDynamicValue(var14), (SubLObject)module0742.$ic140$, module0209.f13552(var28));
                                                        var27 = var27.rest();
                                                        var28 = var27.first();
                                                    }
                                                    module0642.f39026((SubLObject)module0742.UNPROVIDED);
                                                }
                                            }
                                        }
                                        finally {
                                            module0579.$g4259$.rebind(var22, var14);
                                            module0579.$g4260$.rebind(var10_234, var14);
                                        }
                                    }
                                    finally {
                                        final SubLObject var10_235 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0742.T, var14);
                                            if (module0742.NIL != var19 && module0742.NIL == var20) {
                                                module0034.f1873(var19, (SubLObject)module0742.NIL);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var10_235, var14);
                                        }
                                    }
                                }
                                finally {
                                    module0034.$g879$.rebind(var10_233, var14);
                                }
                            }
                            finally {
                                module0580.$g4359$.rebind(var10_232, var14);
                            }
                            if (var18 == module0742.$ic90$ && module0742.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var14))) {
                                module0034.f1891(module0580.$g4358$.getDynamicValue(var14));
                            }
                        }
                        finally {
                            module0580.$g4358$.rebind(var10_231, var14);
                        }
                    }
                    finally {
                        final SubLObject var10_236 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0742.T, var14);
                            if (module0742.NIL == var17) {
                                module0580.f35554(module0580.$g4362$.getDynamicValue(var14));
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var10_236, var14);
                        }
                    }
                }
                finally {
                    module0580.$g4362$.rebind(var10_230, var14);
                }
            }
            finally {
                module0580.$g4361$.rebind(var16, var14);
            }
        }
        return (SubLObject)module0742.NIL;
    }
    
    public static SubLObject f45953(final SubLObject var25) {
        return module0038.f2638(module0178.f11287(var25));
    }
    
    public static SubLObject f45954(final SubLObject var25) {
        return module0038.f2638(module0205.f13132(module0178.f11303(var25)));
    }
    
    public static SubLObject f45955(final SubLObject var25) {
        return module0038.f2638(module0211.f13703(var25));
    }
    
    public static SubLObject f45956(SubLObject var7) {
        if (var7 == module0742.UNPROVIDED) {
            var7 = (SubLObject)module0742.NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (module0742.NIL == var7) {
            var7 = (SubLObject)module0742.$ic165$;
        }
        final SubLObject var9 = module0656.f39832((SubLObject)module0742.$ic49$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0742.$ic166$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        if (module0742.NIL != var9) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020(var9);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        final SubLObject var10 = module0015.$g533$.currentBinding(var8);
        try {
            module0015.$g533$.bind((SubLObject)module0742.T, var8);
            if (module0742.NIL != module0014.f695((SubLObject)module0742.$ic161$)) {
                final SubLObject var11 = module0014.f697((SubLObject)module0742.$ic161$);
                final SubLObject var12 = (SubLObject)module0742.$ic57$;
                final SubLObject var13 = module0014.f694((SubLObject)module0742.$ic161$);
                final SubLObject var14 = (SubLObject)module0742.ZERO_INTEGER;
                module0642.f39020(module0015.$g431$.getGlobalValue());
                module0642.f39020(module0015.$g440$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39020(var11);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                if (module0742.NIL != var13) {
                    module0642.f39020(module0015.$g437$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(var13);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                }
                if (module0742.NIL != var12) {
                    module0642.f39020(module0015.$g438$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(module0642.f39049(var12));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                }
                if (module0742.NIL != var14) {
                    module0642.f39020(module0015.$g439$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(var14);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                final SubLObject var10_245 = module0015.$g533$.currentBinding(var8);
                try {
                    module0015.$g533$.bind((SubLObject)module0742.T, var8);
                }
                finally {
                    module0015.$g533$.rebind(var10_245, var8);
                }
                module0642.f39020(module0015.$g432$.getGlobalValue());
                module0642.f39067();
            }
            module0642.f39019(var7);
        }
        finally {
            module0015.$g533$.rebind(var10, var8);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var7;
    }
    
    public static SubLObject f45957(SubLObject var1) {
        if (var1 == module0742.UNPROVIDED) {
            var1 = (SubLObject)module0742.NIL;
        }
        SubLObject var2 = (SubLObject)module0742.NIL;
        if (module0742.NIL != var1) {
            var2 = module0213.f13917(var1.first());
        }
        f45958(var2);
        return (SubLObject)module0742.NIL;
    }
    
    public static SubLObject f45958(final SubLObject var246) {
        final SubLThread var247 = SubLProcess.currentSubLThread();
        final SubLObject var248 = (SubLObject)module0742.$ic162$;
        final SubLObject var249 = module0015.$g538$.currentBinding(var247);
        try {
            module0015.$g538$.bind((module0742.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var247))) ? module0015.$g538$.getDynamicValue(var247) : module0057.f4173((SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED), var247);
            module0642.f39020((SubLObject)module0742.$ic24$);
            module0642.f39029((SubLObject)module0742.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var247), module0655.$g5142$.getDynamicValue(var247));
            final SubLObject var250 = module0014.f672((SubLObject)module0742.$ic25$);
            module0642.f39029((SubLObject)module0742.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020((SubLObject)module0742.$ic26$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            if (module0742.NIL != var250) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39020(var250);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020((SubLObject)module0742.$ic27$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
            module0016.f941();
            if (module0742.NIL != var248) {
                module0642.f39029((SubLObject)module0742.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var248);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0742.UNPROVIDED);
            final SubLObject var10_248 = module0015.$g535$.currentBinding(var247);
            try {
                module0015.$g535$.bind((SubLObject)module0742.T, var247);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0742.NIL != module0015.$g132$.getDynamicValue(var247)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var247)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39020((SubLObject)module0742.$ic28$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                final SubLObject var10_249 = module0015.$g533$.currentBinding(var247);
                try {
                    module0015.$g533$.bind((SubLObject)module0742.T, var247);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020((SubLObject)module0742.$ic29$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                    final SubLObject var10_250 = module0015.$g533$.currentBinding(var247);
                    try {
                        module0015.$g533$.bind((SubLObject)module0742.T, var247);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39020((SubLObject)module0742.$ic30$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39020((SubLObject)module0742.$ic31$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39019((SubLObject)module0742.$ic177$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var10_250, var247);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0742.NIL != var248) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0742.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39019(var248);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0742.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                    }
                    var247.resetMultipleValues();
                    final SubLObject var251 = f45959(var246);
                    final SubLObject var252 = var247.secondMultipleValue();
                    var247.resetMultipleValues();
                    if (module0742.NIL != module0079.f5404(var251)) {
                        f45960(var252, var251);
                    }
                    else {
                        f45961();
                    }
                    module0642.f39029((SubLObject)module0742.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var10_249, var247);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0742.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var10_248, var247);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0742.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var249, var247);
        }
        return var246;
    }
    
    public static SubLObject f45959(final SubLObject var246) {
        SubLObject var247 = (SubLObject)module0742.NIL;
        SubLObject var248 = (SubLObject)module0742.NIL;
        var247 = module0737.f45538();
        SubLObject var249 = var246;
        SubLObject var250 = (SubLObject)module0742.NIL;
        var250 = var249.first();
        while (module0742.NIL != var249) {
            SubLObject var251 = (SubLObject)module0742.NIL;
            final SubLObject var252 = module0737.$g5846$.getGlobalValue();
            SubLObject var253 = (SubLObject)module0742.NIL;
            try {
                var253 = Locks.seize_lock(var252);
                var251 = module0079.f5414(var247, var250, (SubLObject)module0742.UNPROVIDED);
            }
            finally {
                if (module0742.NIL != var253) {
                    Locks.release_lock(var252);
                }
            }
            if (module0742.NIL == module0079.f5404(var251)) {
                return Values.values(var247, Sequences.nreverse(var248));
            }
            var247 = var251;
            var248 = (SubLObject)ConsesLow.cons(var250, var248);
            var249 = var249.rest();
            var250 = var249.first();
        }
        return Values.values(var247, Sequences.nreverse(var248));
    }
    
    public static SubLObject f45961() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g209$.getGlobalValue());
        final SubLObject var9 = module0015.$g495$.getGlobalValue();
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0742.NIL != var9) {
            module0642.f39020(module0015.$g222$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020(module0642.f39042(var9));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        final SubLObject var10 = module0015.$g533$.currentBinding(var8);
        try {
            module0015.$g533$.bind((SubLObject)module0742.T, var8);
            module0642.f39019((SubLObject)module0742.$ic178$);
        }
        finally {
            module0015.$g533$.rebind(var10, var8);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0642.f39020(module0015.$g210$.getGlobalValue());
        return (SubLObject)module0742.NIL;
    }
    
    public static SubLObject f45960(final SubLObject var246, final SubLObject var259) {
        final SubLThread var260 = SubLProcess.currentSubLThread();
        SubLObject var261 = (SubLObject)module0742.NIL;
        final SubLObject var262 = module0737.$g5846$.getGlobalValue();
        SubLObject var263 = (SubLObject)module0742.NIL;
        try {
            var263 = Locks.seize_lock(var262);
            var261 = module0079.f5433(var259);
        }
        finally {
            if (module0742.NIL != var263) {
                Locks.release_lock(var262);
            }
        }
        final SubLObject var264 = f45962(var261);
        final SubLObject var265 = Sort.sort(var264, (SubLObject)module0742.$ic179$, (SubLObject)module0742.UNPROVIDED);
        if (module0742.NIL != module0035.f2002(var265, module0742.$g5890$.getDynamicValue(var260), (SubLObject)module0742.UNPROVIDED)) {
            return f45963(var246, var259, f45964(var265, (SubLObject)module0742.ONE_INTEGER));
        }
        return f45965(var246, var259, var265);
    }
    
    public static SubLObject f45963(final SubLObject var246, final SubLObject var259, final SubLObject var265) {
        final SubLThread var266 = SubLProcess.currentSubLThread();
        f45966(var246);
        f45967(var259);
        module0642.f39020(module0015.$g189$.getGlobalValue());
        module0642.f39020((SubLObject)module0742.THREE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        module0642.f39019((SubLObject)module0742.$ic180$);
        module0642.f39020(module0015.$g190$.getGlobalValue());
        module0642.f39020((SubLObject)module0742.THREE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        module0642.f39020(module0015.$g199$.getGlobalValue());
        module0642.f39019((SubLObject)module0742.$ic181$);
        module0642.f39019((SubLObject)module0742.$ic182$);
        module0642.f39019((SubLObject)module0742.$ic183$);
        module0642.f39020(module0015.$g200$.getGlobalValue());
        module0642.f39020(module0015.$g189$.getGlobalValue());
        module0642.f39020((SubLObject)module0742.FOUR_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        module0642.f39019((SubLObject)module0742.$ic184$);
        module0642.f39020(module0015.$g190$.getGlobalValue());
        module0642.f39020((SubLObject)module0742.FOUR_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        f45968(var265);
        if (module0742.NIL != module0742.$g5889$.getDynamicValue(var266)) {
            final SubLObject var267 = conses_high.getf(module0742.$g5889$.getDynamicValue(var266), (SubLObject)module0742.$ic185$, (SubLObject)module0742.UNPROVIDED);
            final SubLObject var268 = conses_high.getf(module0742.$g5889$.getDynamicValue(var266), (SubLObject)module0742.$ic186$, (SubLObject)module0742.UNPROVIDED);
            final SubLObject var269 = f45969(var265, var267, var268);
            module0642.f39020(module0015.$g189$.getGlobalValue());
            module0642.f39020((SubLObject)module0742.FOUR_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
            PrintLow.format(module0015.$g131$.getDynamicValue(var266), (SubLObject)module0742.$ic187$, f45970(var267, var268));
            module0642.f39020(module0015.$g190$.getGlobalValue());
            module0642.f39020((SubLObject)module0742.FOUR_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020(module0015.$g199$.getGlobalValue());
            module0642.f39019((SubLObject)module0742.$ic188$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_hash, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020((SubLObject)module0742.$ic189$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
            final SubLObject var270 = module0015.$g533$.currentBinding(var266);
            try {
                module0015.$g533$.bind((SubLObject)module0742.T, var266);
                module0642.f39019((SubLObject)module0742.$ic190$);
            }
            finally {
                module0015.$g533$.rebind(var270, var266);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
            module0642.f39019((SubLObject)module0742.$ic191$);
            module0642.f39020(module0015.$g200$.getGlobalValue());
            f45971(var246, var259, var269);
        }
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g384$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        module0642.f39020((SubLObject)module0742.$ic189$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        final SubLObject var271 = module0015.$g533$.currentBinding(var266);
        try {
            module0015.$g533$.bind((SubLObject)module0742.T, var266);
            module0642.f39020(module0015.$g189$.getGlobalValue());
            module0642.f39020((SubLObject)module0742.FOUR_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
            module0642.f39019((SubLObject)module0742.$ic192$);
            module0642.f39020(module0015.$g190$.getGlobalValue());
            module0642.f39020((SubLObject)module0742.FOUR_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var271, var266);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        f45972(var246, var259, var265);
        return var246;
    }
    
    public static SubLObject f45968(final SubLObject var265) {
        final SubLThread var266 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g185$.getGlobalValue());
        module0642.f39020(module0015.$g209$.getGlobalValue());
        SubLObject var267 = var265;
        SubLObject var268 = (SubLObject)module0742.NIL;
        var268 = var267.first();
        while (module0742.NIL != var267) {
            final SubLObject var269 = conses_high.getf(var268, (SubLObject)module0742.$ic185$, (SubLObject)module0742.UNPROVIDED);
            if (module0742.NIL != module0004.f104(var269, module0742.$g5892$.getGlobalValue(), (SubLObject)module0742.$ic196$, (SubLObject)module0742.UNPROVIDED)) {
                module0642.f39026((SubLObject)module0742.UNPROVIDED);
            }
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_hash, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020(var269);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
            final SubLObject var270 = module0015.$g533$.currentBinding(var266);
            try {
                module0015.$g533$.bind((SubLObject)module0742.T, var266);
                module0642.f39019((SubLObject)module0742.$ic197$);
                module0642.f39019(var269);
                module0642.f39019((SubLObject)module0742.$ic198$);
            }
            finally {
                module0015.$g533$.rebind(var270, var266);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
            if (module0742.NIL != module0004.f104(var269, module0742.$g5893$.getGlobalValue(), (SubLObject)module0742.$ic196$, (SubLObject)module0742.UNPROVIDED)) {
                module0642.f39026((SubLObject)module0742.UNPROVIDED);
            }
            var267 = var267.rest();
            var268 = var267.first();
        }
        module0642.f39020(module0015.$g210$.getGlobalValue());
        module0642.f39020(module0015.$g186$.getGlobalValue());
        return var265;
    }
    
    public static SubLObject f45969(final SubLObject var265, final SubLObject var270, final SubLObject var271) {
        SubLObject var272 = var265;
        SubLObject var273 = (SubLObject)module0742.NIL;
        var273 = var272.first();
        while (module0742.NIL != var272) {
            final SubLObject var274 = conses_high.getf(var273, (SubLObject)module0742.$ic185$, (SubLObject)module0742.UNPROVIDED);
            final SubLObject var275 = conses_high.getf(var273, (SubLObject)module0742.$ic186$, (SubLObject)module0742.UNPROVIDED);
            final SubLObject var276 = conses_high.getf(var273, (SubLObject)module0742.$ic199$, (SubLObject)module0742.UNPROVIDED);
            if (var271.numL(var275)) {
                return (SubLObject)module0742.NIL;
            }
            if (module0742.NIL != Strings.stringL(var270, var274, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED)) {
                return (SubLObject)module0742.NIL;
            }
            if (var271.numE(var275) && module0742.NIL != Strings.stringE(var270, var274, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED)) {
                return var276;
            }
            if (var276.first().isCons()) {
                final SubLObject var277 = f45969(var276, var270, var271);
                if (module0742.NIL != var277) {
                    return var277;
                }
            }
            var272 = var272.rest();
            var273 = var272.first();
        }
        return (SubLObject)module0742.NIL;
    }
    
    public static SubLObject f45972(final SubLObject var246, final SubLObject var259, final SubLObject var265) {
        final SubLThread var266 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g262$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        final SubLObject var267 = module0015.$g533$.currentBinding(var266);
        try {
            module0015.$g533$.bind((SubLObject)module0742.T, var266);
            SubLObject var268 = var265;
            SubLObject var269 = (SubLObject)module0742.NIL;
            var269 = var268.first();
            while (module0742.NIL != var268) {
                final SubLObject var270 = conses_high.getf(var269, (SubLObject)module0742.$ic185$, (SubLObject)module0742.UNPROVIDED);
                final SubLObject var271 = conses_high.getf(var269, (SubLObject)module0742.$ic186$, (SubLObject)module0742.UNPROVIDED);
                final SubLObject var272 = conses_high.getf(var269, (SubLObject)module0742.$ic199$, (SubLObject)module0742.UNPROVIDED);
                module0642.f39020(module0015.$g275$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                final SubLObject var10_273 = module0015.$g533$.currentBinding(var266);
                try {
                    module0015.$g533$.bind((SubLObject)module0742.T, var266);
                    if (module0742.ONE_INTEGER.numE(var271)) {
                        module0642.f39020(module0015.$g381$.getGlobalValue());
                        if (module0742.NIL != var270) {
                            module0642.f39020(module0015.$g384$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                            module0642.f39020(var270);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                        final SubLObject var10_274 = module0015.$g533$.currentBinding(var266);
                        try {
                            module0015.$g533$.bind((SubLObject)module0742.T, var266);
                        }
                        finally {
                            module0015.$g533$.rebind(var10_274, var266);
                        }
                        module0642.f39020(module0015.$g382$.getGlobalValue());
                    }
                    module0656.f39837((SubLObject)module0742.$ic200$, var246, var270, var271, Sequences.cconcatenate((SubLObject)module0742.$ic197$, new SubLObject[] { module0006.f203(var270), module0742.$ic201$ }), (SubLObject)module0742.UNPROVIDED);
                    if (var272.first().isString()) {
                        PrintLow.format(module0015.$g131$.getDynamicValue(var266), (SubLObject)module0742.$ic202$, Sequences.length(var272));
                    }
                    else if (var272.first().isCons()) {
                        f45972(var246, var259, var272);
                    }
                }
                finally {
                    module0015.$g533$.rebind(var10_273, var266);
                }
                module0642.f39020(module0015.$g276$.getGlobalValue());
                var268 = var268.rest();
                var269 = var268.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var267, var266);
        }
        module0642.f39020(module0015.$g263$.getGlobalValue());
        return var265;
    }
    
    public static SubLObject f45973(final SubLObject var246, final SubLObject var266, final SubLObject var267, SubLObject var7) {
        if (var7 == module0742.UNPROVIDED) {
            var7 = (SubLObject)module0742.NIL;
        }
        final SubLThread var268 = SubLProcess.currentSubLThread();
        if (module0742.NIL == var7) {
            var7 = (SubLObject)module0742.$ic203$;
        }
        final SubLObject var269 = module0656.f39832((SubLObject)module0742.$ic49$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var268), (SubLObject)module0742.$ic204$, module0213.f13918((SubLObject)ConsesLow.list((SubLObject)module0742.$ic205$, var246, (SubLObject)module0742.$ic185$, var266, (SubLObject)module0742.$ic186$, var267)));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        if (module0742.NIL != var269) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020(var269);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        final SubLObject var270 = module0015.$g533$.currentBinding(var268);
        try {
            module0015.$g533$.bind((SubLObject)module0742.T, var268);
            module0642.f39019(var7);
        }
        finally {
            module0015.$g533$.rebind(var270, var268);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var266;
    }
    
    public static SubLObject f45974(final SubLObject var1) {
        final SubLObject var2 = var1.first();
        final SubLObject var3 = module0213.f13917(var2);
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        SubLObject var6 = (SubLObject)module0742.NIL;
        SubLObject var7 = var5;
        SubLObject var8 = (SubLObject)module0742.NIL;
        SubLObject var282_283 = (SubLObject)module0742.NIL;
        while (module0742.NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var4, (SubLObject)module0742.$ic207$);
            var282_283 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var4, (SubLObject)module0742.$ic207$);
            if (module0742.NIL == conses_high.member(var282_283, (SubLObject)module0742.$ic208$, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED)) {
                var8 = (SubLObject)module0742.T;
            }
            if (var282_283 == module0742.$ic209$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (module0742.NIL != var8 && module0742.NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0742.$ic207$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)module0742.$ic205$, var5);
        final SubLObject var10 = (SubLObject)((module0742.NIL != var9) ? conses_high.cadr(var9) : module0742.NIL);
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0742.$ic185$, var5);
        final SubLObject var12 = (SubLObject)((module0742.NIL != var11) ? conses_high.cadr(var11) : module0742.NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0742.$ic186$, var5);
        final SubLObject var14 = (SubLObject)((module0742.NIL != var13) ? conses_high.cadr(var13) : module0742.NIL);
        module0742.$g5889$.setDynamicValue(var3);
        return f45958(var10);
    }
    
    public static SubLObject f45965(final SubLObject var246, final SubLObject var259, final SubLObject var264) {
        f45966(var246);
        f45967(var259);
        module0642.f39020(module0015.$g189$.getGlobalValue());
        module0642.f39020((SubLObject)module0742.THREE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        module0642.f39019((SubLObject)module0742.$ic211$);
        module0642.f39020(module0015.$g190$.getGlobalValue());
        module0642.f39020((SubLObject)module0742.THREE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        f45971(var246, var259, var264);
        return var259;
    }
    
    public static SubLObject f45971(final SubLObject var246, final SubLObject var259, final SubLObject var264) {
        final SubLThread var265 = SubLProcess.currentSubLThread();
        SubLObject var266 = (SubLObject)module0742.NIL;
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        module0642.f39020((SubLObject)module0742.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        final SubLObject var267 = module0015.$g533$.currentBinding(var265);
        try {
            module0015.$g533$.bind((SubLObject)module0742.T, var265);
            SubLObject var268 = var264;
            SubLObject var269 = (SubLObject)module0742.NIL;
            var269 = var268.first();
            while (module0742.NIL != var268) {
                final SubLObject var270 = module0737.$g5846$.getGlobalValue();
                SubLObject var271 = (SubLObject)module0742.NIL;
                try {
                    var271 = Locks.seize_lock(var270);
                    var266 = module0079.f5414(var259, var269, (SubLObject)module0742.UNPROVIDED);
                }
                finally {
                    if (module0742.NIL != var271) {
                        Locks.release_lock(var270);
                    }
                }
                final SubLObject var272 = (SubLObject)SubLObjectFactory.makeBoolean(module0742.NIL == module0079.f5404(var266));
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                final SubLObject var10_292 = module0015.$g533$.currentBinding(var265);
                try {
                    module0015.$g533$.bind((SubLObject)module0742.T, var265);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0742.$ic212$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0742.$ic57$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                    final SubLObject var10_293 = module0015.$g533$.currentBinding(var265);
                    try {
                        module0015.$g533$.bind((SubLObject)module0742.T, var265);
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        if (module0742.NIL != var272) {
                            final SubLObject var273 = var266.first();
                            f45975(var273);
                        }
                        else {
                            final SubLObject var273 = Sequences.cconcatenate(var246, (SubLObject)ConsesLow.list(var269));
                            module0656.f39837((SubLObject)module0742.$ic213$, var273, Sequences.cconcatenate((SubLObject)module0742.$ic197$, new SubLObject[] { module0006.f203(var269), module0742.$ic201$ }), (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var10_293, var265);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0742.$ic212$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0742.$ic57$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                    final SubLObject var10_294 = module0015.$g533$.currentBinding(var265);
                    try {
                        module0015.$g533$.bind((SubLObject)module0742.T, var265);
                        if (module0742.NIL != var272) {
                            f45976(var266, (SubLObject)module0742.UNPROVIDED);
                        }
                        else {
                            f45977(var269, var266);
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var10_294, var265);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var10_292, var265);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0742.UNPROVIDED);
                var268 = var268.rest();
                var269 = var268.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var267, var265);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return var246;
    }
    
    public static SubLObject f45967(final SubLObject var259) {
        final SubLThread var260 = SubLProcess.currentSubLThread();
        SubLObject var261 = (SubLObject)module0742.NIL;
        final SubLObject var262 = module0737.$g5846$.getGlobalValue();
        SubLObject var263 = (SubLObject)module0742.NIL;
        try {
            var263 = Locks.seize_lock(var262);
            var261 = module0079.f5414(var259, module0087.$g1177$.getGlobalValue(), (SubLObject)module0742.NIL);
        }
        finally {
            if (module0742.NIL != var263) {
                Locks.release_lock(var262);
            }
        }
        if (module0742.NIL != module0035.sublisp_boolean(var261)) {
            final SubLObject var264 = var261.first();
            module0642.f39020(module0015.$g189$.getGlobalValue());
            module0642.f39020((SubLObject)module0742.THREE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
            module0642.f39019((SubLObject)module0742.$ic214$);
            f45975(var264);
            module0642.f39020(module0015.$g190$.getGlobalValue());
            module0642.f39020((SubLObject)module0742.THREE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020(module0015.$g185$.getGlobalValue());
            f45976(var261, module0742.$g5891$.getDynamicValue(var260));
            module0642.f39020(module0015.$g186$.getGlobalValue());
        }
        return var259;
    }
    
    public static SubLObject f45966(final SubLObject var246) {
        module0642.f39020(module0015.$g189$.getGlobalValue());
        module0642.f39020((SubLObject)module0742.TWO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        module0656.f39837((SubLObject)module0742.$ic161$, (SubLObject)module0742.$ic215$, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
        SubLObject var247 = (SubLObject)module0742.NIL;
        SubLObject var248 = (SubLObject)module0742.NIL;
        SubLObject var249 = (SubLObject)module0742.NIL;
        var247 = var246;
        var248 = var247.first();
        for (var249 = (SubLObject)module0742.ZERO_INTEGER; module0742.NIL != var247; var247 = var247.rest(), var248 = var247.first(), var249 = Numbers.add((SubLObject)module0742.ONE_INTEGER, var249)) {
            module0642.f39019((SubLObject)module0742.$ic216$);
            final SubLObject var250 = Sequences.subseq(var246, (SubLObject)module0742.ZERO_INTEGER, Numbers.add((SubLObject)module0742.ONE_INTEGER, var249));
            module0656.f39837((SubLObject)module0742.$ic213$, var250, var248, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
        }
        module0642.f39020(module0015.$g190$.getGlobalValue());
        module0642.f39020((SubLObject)module0742.TWO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        f45978();
        return var246;
    }
    
    public static SubLObject f45978() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = module0656.f39832((SubLObject)module0742.NIL);
        module0642.f39020(module0015.$g282$.getGlobalValue());
        module0642.f39020(module0015.$g284$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        module0642.f39020(module0110.$g570$.getDynamicValue(var8));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        module0642.f39020(module0015.$g285$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        module0642.f39020((SubLObject)module0742.$ic217$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        if (module0742.NIL != var9) {
            module0642.f39020(module0015.$g286$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020(var9);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        final SubLObject var10 = module0015.$g533$.currentBinding(var8);
        final SubLObject var11 = module0015.$g541$.currentBinding(var8);
        final SubLObject var12 = module0015.$g539$.currentBinding(var8);
        try {
            module0015.$g533$.bind((SubLObject)module0742.T, var8);
            module0015.$g541$.bind((SubLObject)module0742.T, var8);
            module0015.$g539$.bind(module0015.f797(), var8);
            module0642.f39069((SubLObject)module0742.$ic218$, (SubLObject)module0742.T, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39020(module0015.$g351$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)module0742.$ic98$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020(module0015.$g352$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020((SubLObject)module0742.ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
            final SubLObject var10_301 = module0015.$g533$.currentBinding(var8);
            try {
                module0015.$g533$.bind((SubLObject)module0742.T, var8);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                final SubLObject var10_302 = module0015.$g533$.currentBinding(var8);
                try {
                    module0015.$g533$.bind((SubLObject)module0742.T, var8);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0742.$ic98$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0742.$ic57$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                    final SubLObject var10_303 = module0015.$g533$.currentBinding(var8);
                    try {
                        module0015.$g533$.bind((SubLObject)module0742.T, var8);
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0642.f39019((SubLObject)module0742.$ic219$);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var10_303, var8);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0742.$ic98$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0742.$ic57$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                    final SubLObject var10_304 = module0015.$g533$.currentBinding(var8);
                    try {
                        module0015.$g533$.bind((SubLObject)module0742.T, var8);
                        module0642.f39075((SubLObject)module0742.$ic220$, (SubLObject)module0742.$ic23$, (SubLObject)module0742.$ic221$);
                    }
                    finally {
                        module0015.$g533$.rebind(var10_304, var8);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0742.$ic98$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0742.$ic57$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                    final SubLObject var10_305 = module0015.$g533$.currentBinding(var8);
                    try {
                        module0015.$g533$.bind((SubLObject)module0742.T, var8);
                        module0642.f39074((SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var10_305, var8);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var10_302, var8);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0742.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var10_301, var8);
            }
            module0642.f39020(module0015.$g347$.getGlobalValue());
            module0015.f799(module0015.$g539$.getDynamicValue(var8));
        }
        finally {
            module0015.$g539$.rebind(var12, var8);
            module0015.$g541$.rebind(var11, var8);
            module0015.$g533$.rebind(var10, var8);
        }
        module0642.f39020(module0015.$g283$.getGlobalValue());
        return (SubLObject)module0742.NIL;
    }
    
    public static SubLObject f45979(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0642.f39111((SubLObject)module0742.$ic220$, var1, (SubLObject)module0742.UNPROVIDED);
        final SubLObject var4 = module0737.f45340(var3);
        SubLObject var5 = (SubLObject)module0742.NIL;
        SubLObject var6 = var4;
        SubLObject var7 = (SubLObject)module0742.NIL;
        var7 = var6.first();
        while (module0742.NIL != var6) {
            var2.resetMultipleValues();
            final SubLObject var8 = f45959(var7);
            final SubLObject var9 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            if (module0742.NIL != module0079.f5404(var8) && module0742.NIL != var9) {
                var5 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0742.$ic222$, var7, (SubLObject)module0742.$ic223$, var9), var5);
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        if (module0742.NIL == var5) {
            final SubLObject var10 = (SubLObject)module0742.$ic162$;
            final SubLObject var11 = module0015.$g538$.currentBinding(var2);
            try {
                module0015.$g538$.bind((module0742.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED), var2);
                module0642.f39020((SubLObject)module0742.$ic24$);
                module0642.f39029((SubLObject)module0742.UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
                final SubLObject var12 = module0014.f672((SubLObject)module0742.$ic25$);
                module0642.f39029((SubLObject)module0742.UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39020((SubLObject)module0742.$ic26$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                if (module0742.NIL != var12) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(var12);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39020((SubLObject)module0742.$ic27$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                module0016.f941();
                if (module0742.NIL != var10) {
                    module0642.f39029((SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var10);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)module0742.UNPROVIDED);
                final SubLObject var10_310 = module0015.$g535$.currentBinding(var2);
                try {
                    module0015.$g535$.bind((SubLObject)module0742.T, var2);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (module0742.NIL != module0015.$g132$.getDynamicValue(var2)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020((SubLObject)module0742.$ic28$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                    final SubLObject var10_311 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0742.T, var2);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39020((SubLObject)module0742.$ic29$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                        final SubLObject var10_312 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)module0742.T, var2);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                            module0642.f39020((SubLObject)module0742.$ic30$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                            module0642.f39020((SubLObject)module0742.$ic31$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                            module0642.f39019((SubLObject)module0742.$ic177$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var10_312, var2);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (module0742.NIL != var10) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)module0742.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                            module0642.f39019(var10);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)module0742.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g199$.getGlobalValue());
                        module0642.f39019((SubLObject)module0742.$ic224$);
                        module0642.f39020(module0015.$g200$.getGlobalValue());
                        module0642.f39020(module0015.$g185$.getGlobalValue());
                        module0642.f39019(var3);
                        module0642.f39020(module0015.$g186$.getGlobalValue());
                        module0642.f39020(module0015.$g199$.getGlobalValue());
                        module0642.f39019((SubLObject)module0742.$ic225$);
                        module0642.f39020(module0015.$g200$.getGlobalValue());
                        module0642.f39026((SubLObject)module0742.UNPROVIDED);
                        f45978();
                        module0642.f39029((SubLObject)module0742.UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var10_311, var2);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)module0742.UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var10_310, var2);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)module0742.UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var11, var2);
            }
        }
        else {
            if (module0742.NIL != module0035.f1995(var5, (SubLObject)module0742.ONE_INTEGER, (SubLObject)module0742.UNPROVIDED)) {
                final SubLObject var13 = var5.first();
                final SubLObject var14 = conses_high.getf(var13, (SubLObject)module0742.$ic223$, (SubLObject)module0742.UNPROVIDED);
                return f45958(var14);
            }
            final SubLObject var10 = (SubLObject)module0742.$ic162$;
            final SubLObject var11 = module0015.$g538$.currentBinding(var2);
            try {
                module0015.$g538$.bind((module0742.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED), var2);
                module0642.f39020((SubLObject)module0742.$ic24$);
                module0642.f39029((SubLObject)module0742.UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
                final SubLObject var12 = module0014.f672((SubLObject)module0742.$ic25$);
                module0642.f39029((SubLObject)module0742.UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39020((SubLObject)module0742.$ic26$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                if (module0742.NIL != var12) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(var12);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39020((SubLObject)module0742.$ic27$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                module0016.f941();
                if (module0742.NIL != var10) {
                    module0642.f39029((SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var10);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)module0742.UNPROVIDED);
                final SubLObject var10_313 = module0015.$g535$.currentBinding(var2);
                try {
                    module0015.$g535$.bind((SubLObject)module0742.T, var2);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (module0742.NIL != module0015.$g132$.getDynamicValue(var2)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020((SubLObject)module0742.$ic28$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                    final SubLObject var10_314 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0742.T, var2);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39020((SubLObject)module0742.$ic29$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                        final SubLObject var10_315 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)module0742.T, var2);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                            module0642.f39020((SubLObject)module0742.$ic30$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                            module0642.f39020((SubLObject)module0742.$ic31$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                            module0642.f39019((SubLObject)module0742.$ic177$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var10_315, var2);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (module0742.NIL != var10) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)module0742.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                            module0642.f39019(var10);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)module0742.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g199$.getGlobalValue());
                        module0642.f39019((SubLObject)module0742.$ic224$);
                        module0642.f39020(module0015.$g200$.getGlobalValue());
                        module0642.f39020(module0015.$g185$.getGlobalValue());
                        module0642.f39019(var3);
                        module0642.f39020(module0015.$g186$.getGlobalValue());
                        module0642.f39020(module0015.$g199$.getGlobalValue());
                        module0642.f39019((SubLObject)module0742.$ic226$);
                        module0642.f39020(module0015.$g200$.getGlobalValue());
                        module0642.f39020(module0015.$g264$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                        final SubLObject var10_316 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)module0742.T, var2);
                            SubLObject var15 = var5;
                            SubLObject var16 = (SubLObject)module0742.NIL;
                            var16 = var15.first();
                            while (module0742.NIL != var15) {
                                module0642.f39020(module0015.$g275$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                                final SubLObject var10_317 = module0015.$g533$.currentBinding(var2);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0742.T, var2);
                                    final SubLObject var18;
                                    final SubLObject var17 = var18 = var16;
                                    SubLObject var19 = (SubLObject)module0742.NIL;
                                    SubLObject var20 = var18;
                                    SubLObject var21 = (SubLObject)module0742.NIL;
                                    SubLObject var324_325 = (SubLObject)module0742.NIL;
                                    while (module0742.NIL != var20) {
                                        cdestructuring_bind.destructuring_bind_must_consp(var20, var17, (SubLObject)module0742.$ic227$);
                                        var324_325 = var20.first();
                                        var20 = var20.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var20, var17, (SubLObject)module0742.$ic227$);
                                        if (module0742.NIL == conses_high.member(var324_325, (SubLObject)module0742.$ic228$, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED)) {
                                            var21 = (SubLObject)module0742.T;
                                        }
                                        if (var324_325 == module0742.$ic209$) {
                                            var19 = var20.first();
                                        }
                                        var20 = var20.rest();
                                    }
                                    if (module0742.NIL != var21 && module0742.NIL == var19) {
                                        cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)module0742.$ic227$);
                                    }
                                    final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)module0742.$ic222$, var18);
                                    final SubLObject var23 = (SubLObject)((module0742.NIL != var22) ? conses_high.cadr(var22) : module0742.NIL);
                                    final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)module0742.$ic223$, var18);
                                    final SubLObject var25 = (SubLObject)((module0742.NIL != var24) ? conses_high.cadr(var24) : module0742.NIL);
                                    module0642.f39020(module0015.$g209$.getGlobalValue());
                                    f45975(var25);
                                    module0642.f39020(module0015.$g210$.getGlobalValue());
                                    final SubLObject var26 = Numbers.subtract(Sequences.length(var23), Sequences.length(var25));
                                    final SubLObject var27 = conses_high.last(var23, var26);
                                    f45975(var27);
                                    module0642.f39032((SubLObject)module0742.UNPROVIDED);
                                    module0656.f39837((SubLObject)module0742.$ic213$, var25, (SubLObject)module0742.$ic229$, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var10_317, var2);
                                }
                                module0642.f39020(module0015.$g276$.getGlobalValue());
                                var15 = var15.rest();
                                var16 = var15.first();
                            }
                        }
                        finally {
                            module0015.$g533$.rebind(var10_316, var2);
                        }
                        module0642.f39020(module0015.$g265$.getGlobalValue());
                        module0642.f39029((SubLObject)module0742.UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var10_314, var2);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)module0742.UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var10_313, var2);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)module0742.UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var11, var2);
            }
        }
        return (SubLObject)module0742.NIL;
    }
    
    public static SubLObject f45975(final SubLObject var246) {
        SubLObject var247 = var246;
        SubLObject var248 = (SubLObject)module0742.NIL;
        var248 = var247.first();
        while (module0742.NIL != var247) {
            module0642.f39019((SubLObject)Characters.CHAR_quotation);
            module0642.f39019(var248);
            module0642.f39019((SubLObject)Characters.CHAR_quotation);
            module0642.f39032((SubLObject)module0742.UNPROVIDED);
            var247 = var247.rest();
            var248 = var247.first();
        }
        return var246;
    }
    
    public static SubLObject f45964(final SubLObject var264, SubLObject var267) {
        if (var267 == module0742.UNPROVIDED) {
            var267 = (SubLObject)module0742.ONE_INTEGER;
        }
        final SubLThread var268 = SubLProcess.currentSubLThread();
        SubLObject var269 = var264.first();
        final SubLObject var270 = var264.rest();
        SubLObject var271 = (SubLObject)ConsesLow.list(var269);
        SubLObject var272 = (SubLObject)module0742.NIL;
        SubLObject var273 = var270;
        SubLObject var274 = (SubLObject)module0742.NIL;
        var274 = var273.first();
        while (module0742.NIL != var273) {
            if (module0742.NIL != f45980(var269, var274, var267)) {
                var271 = (SubLObject)ConsesLow.cons(var274, var271);
            }
            else {
                if (module0742.NIL != var271) {
                    var271 = Sequences.nreverse(var271);
                    if (module0742.NIL != module0035.f2002(var271, module0742.$g5890$.getDynamicValue(var268), (SubLObject)module0742.UNPROVIDED)) {
                        var271 = f45964(var271, Numbers.add(var267, (SubLObject)module0742.ONE_INTEGER));
                    }
                    final SubLObject var275 = f45981(var271);
                    final SubLObject var276 = Numbers.min(Sequences.length(var275), var267);
                    final SubLObject var277 = Strings.string_upcase(module0038.f2623(var275, (SubLObject)module0742.ZERO_INTEGER, var276), (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
                    var272 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0742.$ic185$, var277, (SubLObject)module0742.$ic186$, var267, (SubLObject)module0742.$ic199$, var271), var272);
                }
                var271 = (SubLObject)ConsesLow.list(var274);
            }
            var269 = var274;
            var273 = var273.rest();
            var274 = var273.first();
        }
        return Sequences.nreverse(var272);
    }
    
    public static SubLObject f45981(final SubLObject var269) {
        final SubLObject var270 = var269.first();
        if (var270.isString()) {
            return var270;
        }
        if (module0742.$ic185$ == var270) {
            return f45981(conses_high.getf(var269, (SubLObject)module0742.$ic199$, (SubLObject)module0742.UNPROVIDED));
        }
        if (var270.isCons()) {
            return f45981(var269.first());
        }
        Errors.error((SubLObject)module0742.$ic231$, var269);
        return (SubLObject)module0742.NIL;
    }
    
    public static SubLObject f45980(final SubLObject var330, final SubLObject var288, final SubLObject var267) {
        final SubLObject var331 = f45970(var330, var267);
        final SubLObject var332 = f45970(var288, var267);
        return Strings.string_equal(var331, var332, (SubLObject)module0742.ZERO_INTEGER, var267, (SubLObject)module0742.ZERO_INTEGER, var267);
    }
    
    public static SubLObject f45970(final SubLObject var288, final SubLObject var267) {
        final SubLObject var289 = Numbers.subtract(Sequences.length(var288), var267);
        if (var289.isNegative()) {
            final SubLObject var290 = Strings.make_string(var267, (SubLObject)Characters.CHAR_space);
            SubLObject var291 = (SubLObject)module0742.ZERO_INTEGER;
            SubLObject var339_340;
            SubLObject var292;
            SubLObject var293;
            SubLObject var294;
            for (var292 = (var339_340 = Sequences.length(var288)), var293 = (SubLObject)module0742.NIL, var293 = (SubLObject)module0742.ZERO_INTEGER; !var293.numGE(var339_340); var293 = module0048.f_1X(var293)) {
                var294 = Strings.sublisp_char(var288, var293);
                Strings.set_char(var290, var291, var294);
                var291 = Numbers.add(var291, (SubLObject)module0742.ONE_INTEGER);
            }
            return var290;
        }
        return var288;
    }
    
    public static SubLObject f45962(final SubLObject var331) {
        return module0035.delete_if_not((SubLObject)module0742.$ic232$, var331, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
    }
    
    public static SubLObject f45977(final SubLObject var288, final SubLObject var287) {
        final SubLThread var289 = SubLProcess.currentSubLThread();
        SubLObject var290 = (SubLObject)module0742.MINUS_ONE_INTEGER;
        final SubLObject var291 = module0737.$g5846$.getGlobalValue();
        SubLObject var292 = (SubLObject)module0742.NIL;
        try {
            var292 = Locks.seize_lock(var291);
            var290 = module0079.f5406(var287);
        }
        finally {
            if (module0742.NIL != var292) {
                Locks.release_lock(var291);
            }
        }
        module0642.f39020(module0015.$g230$.getGlobalValue());
        module0642.f39019((SubLObject)module0742.$ic233$);
        module0642.f39019(var290);
        PrintLow.format(module0015.$g131$.getDynamicValue(var289), (SubLObject)module0742.$ic234$, (SubLObject)(module0742.ONE_INTEGER.numE(var290) ? module0742.$ic23$ : module0742.$ic235$));
        module0642.f39020(module0015.$g231$.getGlobalValue());
        return var288;
    }
    
    public static SubLObject f45976(final SubLObject var287, SubLObject var345) {
        if (var345 == module0742.UNPROVIDED) {
            var345 = (SubLObject)module0742.NIL;
        }
        final SubLThread var346 = SubLProcess.currentSubLThread();
        final SubLObject var347 = var287.rest();
        final SubLObject var348 = var345.first();
        SubLObject var349 = (SubLObject)(var348.isString() ? Sequences.cconcatenate((SubLObject)module0742.$ic236$, module0006.f203(var348)) : module0742.$ic23$);
        final SubLObject var350 = conses_high.second(var345);
        SubLObject var351 = (SubLObject)(var350.isString() ? Sequences.cconcatenate((SubLObject)module0742.$ic236$, module0006.f203(var350)) : module0742.$ic23$);
        SubLObject var352 = (SubLObject)module0742.NIL;
        SubLObject var353 = (SubLObject)module0742.NIL;
        SubLObject var354 = (SubLObject)module0742.NIL;
        var352 = var347;
        var353 = var352.first();
        for (var354 = (SubLObject)module0742.ZERO_INTEGER; module0742.NIL != var352; var352 = var352.rest(), var353 = var352.first(), var354 = Numbers.add((SubLObject)module0742.ONE_INTEGER, var354)) {
            if (var354.isPositive()) {
                module0642.f39051((SubLObject)module0742.UNPROVIDED, (SubLObject)module0742.UNPROVIDED);
            }
            module0642.f39020(module0015.$g144$.getGlobalValue());
            module0642.f39020(module0015.$g147$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020(var349);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
            final SubLObject var355 = module0015.$g533$.currentBinding(var346);
            try {
                module0015.$g533$.bind((SubLObject)module0742.T, var346);
                if (module0742.NIL != module0737.f45321(var353, (SubLObject)module0742.UNPROVIDED)) {
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39020(module0015.$g352$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020((SubLObject)module0742.ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                    final SubLObject var10_352 = module0015.$g533$.currentBinding(var346);
                    try {
                        module0015.$g533$.bind((SubLObject)module0742.T, var346);
                        final SubLObject var356 = module0737.f45400(var353);
                        final SubLObject var357 = module0737.f45379(var353);
                        f45982(var356, (SubLObject)module0742.$ic237$);
                        f45982(var357, (SubLObject)module0742.$ic238$);
                    }
                    finally {
                        module0015.$g533$.rebind(var10_352, var346);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                }
                else {
                    f45983(var353);
                }
            }
            finally {
                module0015.$g533$.rebind(var355, var346);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            final SubLObject var358 = var349;
            var349 = var351;
            var351 = var358;
        }
        return var287;
    }
    
    public static SubLObject f45982(final SubLObject var356, final SubLObject var357) {
        final SubLThread var358 = SubLProcess.currentSubLThread();
        if (module0742.NIL != module0077.f5302(var356) && module0742.NIL == module0077.f5318(var356)) {
            SubLObject var359 = module0077.f5312(var356);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
            final SubLObject var360 = module0015.$g533$.currentBinding(var358);
            try {
                module0015.$g533$.bind((SubLObject)module0742.T, var358);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0742.$ic212$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0742.$ic57$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                final SubLObject var10_358 = module0015.$g533$.currentBinding(var358);
                try {
                    module0015.$g533$.bind((SubLObject)module0742.T, var358);
                    module0642.f39020(module0015.$g224$.getGlobalValue());
                    module0642.f39019(var357);
                    module0642.f39020(module0015.$g225$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var10_358, var358);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0742.$ic212$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0742.$ic57$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                final SubLObject var10_359 = module0015.$g533$.currentBinding(var358);
                try {
                    module0015.$g533$.bind((SubLObject)module0742.T, var358);
                    f45983(var359.first());
                }
                finally {
                    module0015.$g533$.rebind(var10_359, var358);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var360, var358);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0742.UNPROVIDED);
            SubLObject var361;
            var359 = (var361 = var359.rest());
            SubLObject var362 = (SubLObject)module0742.NIL;
            var362 = var361.first();
            while (module0742.NIL != var361) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                final SubLObject var363 = module0015.$g533$.currentBinding(var358);
                try {
                    module0015.$g533$.bind((SubLObject)module0742.T, var358);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                    final SubLObject var10_360 = module0015.$g533$.currentBinding(var358);
                    try {
                        module0015.$g533$.bind((SubLObject)module0742.T, var358);
                    }
                    finally {
                        module0015.$g533$.rebind(var10_360, var358);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0742.$ic212$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0742.$ic57$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
                    final SubLObject var10_361 = module0015.$g533$.currentBinding(var358);
                    try {
                        module0015.$g533$.bind((SubLObject)module0742.T, var358);
                        f45983(var362);
                    }
                    finally {
                        module0015.$g533$.rebind(var10_361, var358);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var363, var358);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0742.UNPROVIDED);
                var361 = var361.rest();
                var362 = var361.first();
            }
        }
        return var356;
    }
    
    public static SubLObject f45983(final SubLObject var351) {
        if (module0742.NIL != assertion_handles_oc.f11035(var351)) {
            module0656.f39916(var351, (SubLObject)module0742.T, (SubLObject)module0742.T);
        }
        else {
            module0656.f39804(var351, (SubLObject)module0742.ZERO_INTEGER, (SubLObject)module0742.T);
        }
        return var351;
    }
    
    public static SubLObject f45984(final SubLObject var1) {
        module0742.$g5889$.setDynamicValue((SubLObject)module0742.NIL);
        return f45957(var1);
    }
    
    public static SubLObject f45985(final SubLObject var246, SubLObject var7) {
        if (var7 == module0742.UNPROVIDED) {
            var7 = (SubLObject)module0742.NIL;
        }
        final SubLThread var247 = SubLProcess.currentSubLThread();
        if (module0742.NIL == var7) {
            var7 = (SubLObject)module0742.$ic240$;
        }
        final SubLObject var248 = module0656.f39832((SubLObject)module0742.$ic49$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var247), (SubLObject)module0742.$ic241$, module0213.f13918(var246));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        if (module0742.NIL != var248) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
            module0642.f39020(var248);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0742.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0742.UNPROVIDED);
        final SubLObject var249 = module0015.$g533$.currentBinding(var247);
        try {
            module0015.$g533$.bind((SubLObject)module0742.T, var247);
            module0642.f39019(var7);
        }
        finally {
            module0015.$g533$.rebind(var249, var247);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var246;
    }
    
    public static SubLObject f45986() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45919", "CB-C-LEXICAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45921", "S#50171", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45922", "CB-C-VERBOSE-LEXICAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45923", "S#50172", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45924", "S#50173", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45926", "S#50174", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45929", "S#50175", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45930", "S#50176", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45927", "S#50177", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45920", "S#44194", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45931", "S#50178", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45932", "S#50179", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45933", "CLEAR-LEXICAL-CACHES-FOR-TERM-WITH-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45934", "S#50180", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45935", "SHOW-GENERATION-FUNCTION-DOCUMENTATION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45936", "S#50181", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45937", "S#50182", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45938", "S#50183", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45928", "S#50184", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45940", "S#50185", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45942", "S#50186", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45941", "S#45281", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45944", "S#50187", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45945", "S#50188", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45946", "S#50189", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45947", "S#50190", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45943", "S#50191", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45939", "S#50192", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45925", "S#50193", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45950", "S#50194", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45951", "S#50195", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45948", "S#50196", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45952", "S#50197", 5, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45949", "S#50198", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45953", "S#50199", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45954", "S#50200", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45955", "S#50201", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45956", "S#50202", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45957", "CB-SHOW-NL-TRIE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45958", "S#50203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45959", "S#50204", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45961", "S#50205", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45960", "S#50206", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45963", "S#50207", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45968", "S#50208", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45969", "S#50209", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45972", "S#50210", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45973", "S#50211", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45974", "CB-SHOW-NL-TRIE-SET-PREFIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45965", "S#50212", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45971", "S#50213", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45967", "S#50214", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45966", "S#50215", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45978", "S#50216", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45979", "CB-SHOW-NL-TRIE-STARTING-AT-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45975", "S#50217", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45964", "S#50218", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45981", "S#50219", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45980", "S#50220", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45970", "S#50221", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45962", "S#50222", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45977", "S#50223", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45976", "S#50224", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45982", "S#50225", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45983", "S#50226", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45984", "CB-SHOW-NL-TRIE-SPECIFIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0742", "f45985", "S#50227", 1, 1, false);
        return (SubLObject)module0742.NIL;
    }
    
    public static SubLObject f45987() {
        module0742.$g5885$ = SubLFiles.defvar("S#50228", (SubLObject)module0742.NIL);
        module0742.$g5886$ = SubLFiles.deflexical("S#50229", (SubLObject)module0742.$ic91$);
        module0742.$g5887$ = SubLFiles.deflexical("S#50230", (SubLObject)module0742.$ic92$);
        module0742.$g5888$ = SubLFiles.deflexical("S#50231", (SubLObject)module0742.$ic93$);
        module0742.$g5889$ = SubLFiles.defparameter("S#50232", (SubLObject)module0742.NIL);
        module0742.$g5890$ = SubLFiles.defparameter("S#50233", (SubLObject)module0742.$ic169$);
        module0742.$g5891$ = SubLFiles.defparameter("S#50234", (SubLObject)ConsesLow.list((SubLObject)module0742.$ic171$, (SubLObject)module0742.$ic172$));
        module0742.$g5892$ = SubLFiles.deflexical("S#50235", (SubLObject)ConsesLow.list((SubLObject)module0742.$ic193$, (SubLObject)module0742.$ic194$));
        module0742.$g5893$ = SubLFiles.deflexical("S#50236", (SubLObject)ConsesLow.list((SubLObject)module0742.$ic195$));
        module0742.$g5894$ = SubLFiles.defparameter("S#50237", (SubLObject)module0742.$ic23$);
        module0742.$g5895$ = SubLFiles.defparameter("S#50238", (SubLObject)module0742.$ic244$);
        return (SubLObject)module0742.NIL;
    }
    
    public static SubLObject f45988() {
        module0012.f441((SubLObject)module0742.$ic0$);
        module0012.f444((SubLObject)module0742.$ic0$);
        module0015.f873((SubLObject)module0742.$ic3$);
        module0656.f39840((SubLObject)module0742.$ic8$, (SubLObject)module0742.$ic9$, (SubLObject)module0742.THREE_INTEGER);
        module0015.f873((SubLObject)module0742.$ic10$);
        module0656.f39840((SubLObject)module0742.$ic13$, (SubLObject)module0742.$ic14$, (SubLObject)module0742.ONE_INTEGER);
        module0656.f39840((SubLObject)module0742.$ic41$, (SubLObject)module0742.$ic45$, (SubLObject)module0742.THREE_INTEGER);
        module0015.f873((SubLObject)module0742.$ic47$);
        module0656.f39840((SubLObject)module0742.$ic36$, (SubLObject)module0742.$ic51$, (SubLObject)module0742.ONE_INTEGER);
        module0015.f873((SubLObject)module0742.$ic62$);
        Hashtables.sethash((SubLObject)module0742.$ic105$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0742.$ic115$, (SubLObject)module0742.$ic116$));
        Hashtables.sethash((SubLObject)module0742.$ic104$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0742.$ic117$, (SubLObject)module0742.$ic118$));
        Hashtables.sethash((SubLObject)module0742.$ic119$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0742.$ic120$, (SubLObject)module0742.$ic121$));
        Hashtables.sethash((SubLObject)module0742.$ic122$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0742.$ic123$, (SubLObject)module0742.$ic124$));
        Hashtables.sethash((SubLObject)module0742.$ic125$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0742.$ic126$, (SubLObject)module0742.$ic127$));
        Hashtables.sethash((SubLObject)module0742.$ic128$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0742.$ic129$, (SubLObject)module0742.$ic130$));
        Hashtables.sethash((SubLObject)module0742.$ic131$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0742.$ic132$, (SubLObject)module0742.$ic133$));
        module0656.f39819((SubLObject)module0742.$ic161$, (SubLObject)module0742.$ic162$, (SubLObject)module0742.$ic163$, (SubLObject)module0742.$ic164$);
        module0656.f39840((SubLObject)module0742.$ic161$, (SubLObject)module0742.$ic167$, (SubLObject)module0742.ONE_INTEGER);
        module0012.f441((SubLObject)module0742.$ic168$);
        module0012.f441((SubLObject)module0742.$ic170$);
        module0012.f441((SubLObject)module0742.$ic173$);
        module0015.f873((SubLObject)module0742.$ic174$);
        module0656.f39840((SubLObject)module0742.$ic200$, (SubLObject)module0742.$ic206$, (SubLObject)module0742.FOUR_INTEGER);
        module0015.f873((SubLObject)module0742.$ic210$);
        module0015.f873((SubLObject)module0742.$ic230$);
        module0015.f873((SubLObject)module0742.$ic239$);
        module0656.f39840((SubLObject)module0742.$ic213$, (SubLObject)module0742.$ic242$, (SubLObject)module0742.TWO_INTEGER);
        module0012.f441((SubLObject)module0742.$ic243$);
        module0012.f441((SubLObject)module0742.$ic245$);
        return (SubLObject)module0742.NIL;
    }
    
    public void declareFunctions() {
        f45986();
    }
    
    public void initializeVariables() {
        f45987();
    }
    
    public void runTopLevelForms() {
        f45988();
    }
    
    static {
        me = (SubLFile)new module0742();
        module0742.$g5885$ = null;
        module0742.$g5886$ = null;
        module0742.$g5887$ = null;
        module0742.$g5888$ = null;
        module0742.$g5889$ = null;
        module0742.$g5890$ = null;
        module0742.$g5891$ = null;
        module0742.$g5892$ = null;
        module0742.$g5893$ = null;
        module0742.$g5894$ = null;
        module0742.$g5895$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#50228", "CYC");
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44996", "CYC"));
        $ic2$ = SubLObjectFactory.makeString("Could not determine a term from ~a");
        $ic3$ = SubLObjectFactory.makeSymbol("CB-C-LEXICAL");
        $ic4$ = SubLObjectFactory.makeString("Lexical Info");
        $ic5$ = SubLObjectFactory.makeKeyword("CONTENT");
        $ic6$ = SubLObjectFactory.makeString("cb-c-lexical&~A");
        $ic7$ = SubLObjectFactory.makeString(" (~a)");
        $ic8$ = SubLObjectFactory.makeKeyword("LEXICAL");
        $ic9$ = SubLObjectFactory.makeSymbol("S#50171", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("CB-C-VERBOSE-LEXICAL");
        $ic11$ = SubLObjectFactory.makeString("cb-c-verbose-lexical&~A");
        $ic12$ = SubLObjectFactory.makeString("[Verbose Lexical Info]");
        $ic13$ = SubLObjectFactory.makeKeyword("VERBOSE-LEXICAL");
        $ic14$ = SubLObjectFactory.makeSymbol("S#50172", "CYC");
        $ic15$ = SubLObjectFactory.makeString("No lexical information found.");
        $ic16$ = SubLObjectFactory.makeSymbol("S#12762", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("STRING<");
        $ic18$ = SubLObjectFactory.makeSymbol("S#50200", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#50199", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#50201", "CYC");
        $ic21$ = SubLObjectFactory.makeString("~ALexical info for ~S");
        $ic22$ = SubLObjectFactory.makeString("Verbose ");
        $ic23$ = SubLObjectFactory.makeString("");
        $ic24$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic25$ = SubLObjectFactory.makeKeyword("CB-CYC");
        $ic26$ = SubLObjectFactory.makeString("stylesheet");
        $ic27$ = SubLObjectFactory.makeString("text/css");
        $ic28$ = SubLObjectFactory.makeString("yui-skin-sam");
        $ic29$ = SubLObjectFactory.makeString("reloadFrameButton");
        $ic30$ = SubLObjectFactory.makeString("button");
        $ic31$ = SubLObjectFactory.makeString("reload");
        $ic32$ = SubLObjectFactory.makeString("Refresh");
        $ic33$ = SubLObjectFactory.makeString("reloadCurrentFrame('reloadFrameButton');");
        $ic34$ = SubLObjectFactory.makeString("Additional lexical links:");
        $ic35$ = SubLObjectFactory.makeString("To see documentation on NL generation functions: ");
        $ic36$ = SubLObjectFactory.makeKeyword("GEN-FUNCTION-DOCUMENTATION");
        $ic37$ = SubLObjectFactory.makeString("This term is not sufficiently lexified: ");
        $ic38$ = SubLObjectFactory.makeString("To add more lexical assertions: ");
        $ic39$ = SubLObjectFactory.makeKeyword("LEXIFY-TERM");
        $ic40$ = SubLObjectFactory.makeString("To clear lexical caches for this term: ");
        $ic41$ = SubLObjectFactory.makeKeyword("CLEAR-LEXICAL-CACHES");
        $ic42$ = SubLObjectFactory.makeString("To see more: ");
        $ic43$ = SubLObjectFactory.makeString("[Clear Lexical Caches]");
        $ic44$ = SubLObjectFactory.makeString("clear-lexical-caches-for-term-with-id&~A&~A");
        $ic45$ = SubLObjectFactory.makeSymbol("S#50179", "CYC");
        $ic46$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44996", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50239", "CYC"));
        $ic47$ = SubLObjectFactory.makeSymbol("CLEAR-LEXICAL-CACHES-FOR-TERM-WITH-ID");
        $ic48$ = SubLObjectFactory.makeString("[Function Documentation]");
        $ic49$ = SubLObjectFactory.makeKeyword("MAIN");
        $ic50$ = SubLObjectFactory.makeString("show-generation-function-documentation");
        $ic51$ = SubLObjectFactory.makeSymbol("S#50180", "CYC");
        $ic52$ = SubLObjectFactory.makeString("NL Generation Function Documentation");
        $ic53$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#48573", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#811", "CYC"));
        $ic54$ = SubLObjectFactory.makeString("~A");
        $ic55$ = SubLObjectFactory.makeString(" &lang;mentioned in code&rang;");
        $ic56$ = SubLObjectFactory.makeKeyword("RIGHT");
        $ic57$ = SubLObjectFactory.makeKeyword("TOP");
        $ic58$ = SubLObjectFactory.makeInteger(80);
        $ic59$ = SubLObjectFactory.makeString(":");
        $ic60$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("comment")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("expansion")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("cyclistNotes")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("exampleAssertions")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("exampleSentences")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("exampleNATs")));
        $ic61$ = SubLObjectFactory.makeKeyword("SELF");
        $ic62$ = SubLObjectFactory.makeSymbol("SHOW-GENERATION-FUNCTION-DOCUMENTATION");
        $ic63$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("NLGenerationFunction"));
        $ic64$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic65$ = SubLObjectFactory.makeKeyword("BREADTH");
        $ic66$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic67$ = SubLObjectFactory.makeKeyword("STACK");
        $ic68$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic69$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic70$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic71$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic72$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic73$ = SubLObjectFactory.makeString("continue anyway");
        $ic74$ = SubLObjectFactory.makeKeyword("WARN");
        $ic75$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic76$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic77$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic78$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#4D5E436"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1526883"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#15AA083"));
        $ic79$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic80$ = SubLObjectFactory.makeSymbol("S#3846", "CYC");
        $ic81$ = SubLObjectFactory.makeSymbol("CAR");
        $ic82$ = SubLObjectFactory.makeSymbol("SPEC?");
        $ic83$ = SubLObjectFactory.makeSymbol("CONSTANT-NAME");
        $ic84$ = SubLObjectFactory.makeString("Table of Contents");
        $ic85$ = SubLObjectFactory.makeString("Click to go to functions denoting a phrase type.");
        $ic86$ = SubLObjectFactory.makeString("#~A");
        $ic87$ = SubLObjectFactory.makeSymbol("S#50240", "CYC");
        $ic88$ = SubLObjectFactory.makeSymbol("GENLS?");
        $ic89$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic90$ = SubLObjectFactory.makeKeyword("NEW");
        $ic91$ = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PrimaryLexicalMapping")), (SubLObject)SubLObjectFactory.makeString("default")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"), (SubLObject)SubLObjectFactory.makeString("context")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ContextuallyDependentLexicalMapping")), (SubLObject)SubLObjectFactory.makeString("vanishing")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("VanishinglyRareLexicalMapping")), (SubLObject)SubLObjectFactory.makeString("primary")));
        $ic92$ = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PrimaryLexicalMapping")), (SubLObject)SubLObjectFactory.makeString("Primary lexical mapping.  Click to weaken to default strength.")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"), (SubLObject)SubLObjectFactory.makeString("Default strength mapping. Click to make this a contextually dependent mapping.")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ContextuallyDependentLexicalMapping")), (SubLObject)SubLObjectFactory.makeString("Contextually dependent lexical mapping. Click to make this a vanishingly rare mapping.")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("VanishinglyRareLexicalMapping")), (SubLObject)SubLObjectFactory.makeString("Vanishingly rare lexical mapping. Click to make this a primary mapping.")));
        $ic93$ = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PrimaryLexicalMapping")), (SubLObject)SubLObjectFactory.makeKeyword("HTML-PRIMARY-LEXICAL-IMG")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"), (SubLObject)SubLObjectFactory.makeKeyword("HTML-NOT-CONTEXTUAL-LEXICAL-IMG")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ContextuallyDependentLexicalMapping")), (SubLObject)SubLObjectFactory.makeKeyword("HTML-CONTEXTUAL-LEXICAL-IMG")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("VanishinglyRareLexicalMapping")), (SubLObject)SubLObjectFactory.makeKeyword("HTML-VANISHING-LEXICAL-IMG")));
        $ic94$ = SubLObjectFactory.makeString("javascript:setStrength('");
        $ic95$ = SubLObjectFactory.makeString("', '");
        $ic96$ = SubLObjectFactory.makeString("', this);");
        $ic97$ = SubLObjectFactory.makeString("padding-right: 5px");
        $ic98$ = SubLObjectFactory.makeKeyword("CENTER");
        $ic99$ = SubLObjectFactory.makeString("remove");
        $ic100$ = SubLObjectFactory.makeString("add");
        $ic101$ = SubLObjectFactory.makeString("This assertion will be used preferentially for NL generation.  Click to remove genStringAssertion preference.");
        $ic102$ = SubLObjectFactory.makeString("Click here to prefer this assertion in NL generation.");
        $ic103$ = SubLObjectFactory.makeString("javascript:setGenString('");
        $ic104$ = SubLObjectFactory.makeKeyword("HTML-GENSTRING-IMG");
        $ic105$ = SubLObjectFactory.makeKeyword("HTML-NOT-GENSTRING-IMG");
        $ic106$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic107$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic108$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("strengthOfLexicalMapping"));
        $ic109$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic110$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic111$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ContextuallyDependentLexicalMapping"));
        $ic112$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PrimaryLexicalMapping"));
        $ic113$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("VanishinglyRareLexicalMapping"));
        $ic114$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genStringAssertion"));
        $ic115$ = SubLObjectFactory.makeString("genstring-gray-20x20.png");
        $ic116$ = SubLObjectFactory.makeString("[Add genStringAssertion]");
        $ic117$ = SubLObjectFactory.makeString("genstring-purple-20x20.png");
        $ic118$ = SubLObjectFactory.makeString("[Has a genStringAssert]");
        $ic119$ = SubLObjectFactory.makeKeyword("HTML-NOT-CONTEXTUAL-LEXICAL-IMG");
        $ic120$ = SubLObjectFactory.makeString("graycaution-19x19.png");
        $ic121$ = SubLObjectFactory.makeString("[Make Contextually Dependent]");
        $ic122$ = SubLObjectFactory.makeKeyword("HTML-CONTEXTUAL-LEXICAL-IMG");
        $ic123$ = SubLObjectFactory.makeString("caution-19x19.png");
        $ic124$ = SubLObjectFactory.makeString("[Assertion Contextually Dependent]");
        $ic125$ = SubLObjectFactory.makeKeyword("HTML-VANISHING-LEXICAL-IMG");
        $ic126$ = SubLObjectFactory.makeString("redcaution-19x19.png");
        $ic127$ = SubLObjectFactory.makeString("[Assertion Vanishingly Rare]");
        $ic128$ = SubLObjectFactory.makeKeyword("HTML-PRIMARY-LEXICAL-IMG");
        $ic129$ = SubLObjectFactory.makeString("yellowstar-19x19.png");
        $ic130$ = SubLObjectFactory.makeString("[Primary Lexical Assertion]");
        $ic131$ = SubLObjectFactory.makeKeyword("HTML-NOT-PRIMARY-LEXICAL-IMG");
        $ic132$ = SubLObjectFactory.makeString("graystar-19x19.gif");
        $ic133$ = SubLObjectFactory.makeString("[Make Primary]");
        $ic134$ = SubLObjectFactory.makeString("Mt: ");
        $ic135$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic136$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic137$ = SubLObjectFactory.makeKeyword("NONE");
        $ic138$ = SubLObjectFactory.makeString("generated phrases:");
        $ic139$ = SubLObjectFactory.makeString(" n/a");
        $ic140$ = SubLObjectFactory.makeString("~S");
        $ic141$ = SubLObjectFactory.makeString("Lexical Info for ");
        $ic142$ = SubLObjectFactory.makeKeyword("HTML");
        $ic143$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic144$ = SubLObjectFactory.makeKeyword("ALL");
        $ic145$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ABBREVS"), (SubLObject)SubLObjectFactory.makeKeyword("ACRONYMS"));
        $ic146$ = SubLObjectFactory.makeString("Default generated phrase");
        $ic147$ = SubLObjectFactory.makeString("n/a");
        $ic148$ = SubLObjectFactory.makeString("Other generated phrases: ");
        $ic149$ = SubLObjectFactory.makeString(", ");
        $ic150$ = SubLObjectFactory.makeString("\"");
        $ic151$ = SubLObjectFactory.makeString("'");
        $ic152$ = SubLObjectFactory.makeString("~A: ");
        $ic153$ = SubLObjectFactory.makeInteger(32);
        $ic154$ = SubLObjectFactory.makeString(" (~A)");
        $ic155$ = SubLObjectFactory.makeString("unknown agreement");
        $ic156$ = SubLObjectFactory.makeString("Generated based on:");
        $ic157$ = SubLObjectFactory.makeString("This paraphrase is cached.");
        $ic158$ = SubLObjectFactory.makeString("Default generation template");
        $ic159$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic160$ = SubLObjectFactory.makeString("Other generation templates:");
        $ic161$ = SubLObjectFactory.makeKeyword("NL-TRIE-BROWSE");
        $ic162$ = SubLObjectFactory.makeString("NL Trie Browser");
        $ic163$ = SubLObjectFactory.makeString("NLTrie");
        $ic164$ = SubLObjectFactory.makeString("Browse the NL Trie");
        $ic165$ = SubLObjectFactory.makeString("[NL Trie Browser]");
        $ic166$ = SubLObjectFactory.makeString("cb-show-nl-trie");
        $ic167$ = SubLObjectFactory.makeSymbol("S#50202", "CYC");
        $ic168$ = SubLObjectFactory.makeSymbol("S#50232", "CYC");
        $ic169$ = SubLObjectFactory.makeInteger(1000);
        $ic170$ = SubLObjectFactory.makeSymbol("S#50233", "CYC");
        $ic171$ = SubLObjectFactory.makeString("#e0eeee");
        $ic172$ = SubLObjectFactory.makeString("#f0ffff");
        $ic173$ = SubLObjectFactory.makeSymbol("S#50234", "CYC");
        $ic174$ = SubLObjectFactory.makeSymbol("CB-SHOW-NL-TRIE");
        $ic175$ = SubLObjectFactory.makeKeyword("SHA1");
        $ic176$ = SubLObjectFactory.makeString("text/javascript");
        $ic177$ = SubLObjectFactory.makeString("Refresh Frames");
        $ic178$ = SubLObjectFactory.makeString("No NL trie loaded.");
        $ic179$ = SubLObjectFactory.makeSymbol("STRING-LESSP");
        $ic180$ = SubLObjectFactory.makeString("Sub-Entry Clusters");
        $ic181$ = SubLObjectFactory.makeString("This section of the trie is too big to show in one page.");
        $ic182$ = SubLObjectFactory.makeString(" The keys have been clustered into more manageable sub-entry groups.");
        $ic183$ = SubLObjectFactory.makeString(" Use the prefix short cuts to navigate to a sub-entry group.");
        $ic184$ = SubLObjectFactory.makeString("Prefix Shortcuts");
        $ic185$ = SubLObjectFactory.makeKeyword("PREFIX");
        $ic186$ = SubLObjectFactory.makeKeyword("WIDTH");
        $ic187$ = SubLObjectFactory.makeString("Entries starting with '~A'");
        $ic188$ = SubLObjectFactory.makeString("(see ");
        $ic189$ = SubLObjectFactory.makeString("all_prefix_groups");
        $ic190$ = SubLObjectFactory.makeString("below");
        $ic191$ = SubLObjectFactory.makeString(" for all prefix groups)");
        $ic192$ = SubLObjectFactory.makeString("Groups by Prefixes");
        $ic193$ = SubLObjectFactory.makeString("0");
        $ic194$ = SubLObjectFactory.makeString("A");
        $ic195$ = SubLObjectFactory.makeString("Z");
        $ic196$ = SubLObjectFactory.makeSymbol("STRING=");
        $ic197$ = SubLObjectFactory.makeString("[");
        $ic198$ = SubLObjectFactory.makeString("] ");
        $ic199$ = SubLObjectFactory.makeKeyword("MEMBERS");
        $ic200$ = SubLObjectFactory.makeKeyword("CB-SHOW-NL-TRIE-SET-PREFIX");
        $ic201$ = SubLObjectFactory.makeString("]");
        $ic202$ = SubLObjectFactory.makeString("~A sub-entries");
        $ic203$ = SubLObjectFactory.makeString("[Set Prefix Filter]");
        $ic204$ = SubLObjectFactory.makeString("cb-show-nl-trie-set-prefix&~A");
        $ic205$ = SubLObjectFactory.makeKeyword("PATH");
        $ic206$ = SubLObjectFactory.makeSymbol("S#50211", "CYC");
        $ic207$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#2815", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10299", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#896", "CYC"));
        $ic208$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PATH"), (SubLObject)SubLObjectFactory.makeKeyword("PREFIX"), (SubLObject)SubLObjectFactory.makeKeyword("WIDTH"));
        $ic209$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic210$ = SubLObjectFactory.makeSymbol("CB-SHOW-NL-TRIE-SET-PREFIX");
        $ic211$ = SubLObjectFactory.makeString("Sub-Entries");
        $ic212$ = SubLObjectFactory.makeKeyword("LEFT");
        $ic213$ = SubLObjectFactory.makeKeyword("SHOW-NL-TRIE-SPECIFIC");
        $ic214$ = SubLObjectFactory.makeString("Entry for ");
        $ic215$ = SubLObjectFactory.makeString("(Root)");
        $ic216$ = SubLObjectFactory.makeString(" >> ");
        $ic217$ = SubLObjectFactory.makeString("post");
        $ic218$ = SubLObjectFactory.makeString("cb-show-nl-trie-starting-at-entry");
        $ic219$ = SubLObjectFactory.makeString("Go to entry:");
        $ic220$ = SubLObjectFactory.makeString("specification");
        $ic221$ = SubLObjectFactory.makeInteger(50);
        $ic222$ = SubLObjectFactory.makeKeyword("RAW-PATH");
        $ic223$ = SubLObjectFactory.makeKeyword("VALID-PATH");
        $ic224$ = SubLObjectFactory.makeString("The entry specification");
        $ic225$ = SubLObjectFactory.makeString("returned no NL trie entries. Please try again");
        $ic226$ = SubLObjectFactory.makeString("is ambiguous between the following NL trie entries:");
        $ic227$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#50241", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50242", "CYC"));
        $ic228$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RAW-PATH"), (SubLObject)SubLObjectFactory.makeKeyword("VALID-PATH"));
        $ic229$ = SubLObjectFactory.makeString("[Go]");
        $ic230$ = SubLObjectFactory.makeSymbol("CB-SHOW-NL-TRIE-STARTING-AT-ENTRY");
        $ic231$ = SubLObjectFactory.makeString("Dont know how to interpret ~A as cluster.");
        $ic232$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic233$ = SubLObjectFactory.makeString("(");
        $ic234$ = SubLObjectFactory.makeString(" sub-key~A)");
        $ic235$ = SubLObjectFactory.makeString("s");
        $ic236$ = SubLObjectFactory.makeString("background-color : ");
        $ic237$ = SubLObjectFactory.makeString("Syntactic: ");
        $ic238$ = SubLObjectFactory.makeString("Semantic: ");
        $ic239$ = SubLObjectFactory.makeSymbol("CB-SHOW-NL-TRIE-SPECIFIC");
        $ic240$ = SubLObjectFactory.makeString("[Show in NL Trie]");
        $ic241$ = SubLObjectFactory.makeString("cb-show-nl-trie-specific&~A");
        $ic242$ = SubLObjectFactory.makeSymbol("S#50227", "CYC");
        $ic243$ = SubLObjectFactory.makeSymbol("S#50237", "CYC");
        $ic244$ = SubLObjectFactory.makeInteger(8080);
        $ic245$ = SubLObjectFactory.makeSymbol("S#50238", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0742.class
	Total time: 2561 ms
	
	Decompiled with Procyon 0.5.32.
*/