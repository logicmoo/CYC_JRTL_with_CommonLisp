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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        SubLObject var2 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic1$);
        var2 = var1.first();
        final SubLObject var3 = var1.rest();
        if (NIL == var3) {
            final SubLObject var4 = module0656.f39943(var2, (SubLObject)UNPROVIDED);
            if (NIL == module0173.f10955(var4)) {
                return module0656.f39789((SubLObject)$ic2$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            f45920(var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic1$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45921(final SubLObject var5, SubLObject var6, SubLObject var7) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (NIL == var7) {
            var7 = (SubLObject)$ic4$;
        }
        final SubLObject var9 = module0656.f39832((SubLObject)$ic5$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var8), (SubLObject)$ic6$, module0656.f39842(var5));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var9) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var9);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var10 = module0015.$g533$.currentBinding(var8);
        try {
            module0015.$g533$.bind((SubLObject)T, var8);
            module0642.f39019(var7);
        }
        finally {
            module0015.$g533$.rebind(var10, var8);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        if (NIL != var6) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var8), (SubLObject)$ic7$, var6);
        }
        return var5;
    }
    
    public static SubLObject f45922(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic1$);
        var2 = var1.first();
        final SubLObject var3 = var1.rest();
        if (NIL == var3) {
            final SubLObject var4 = module0656.f39943(var2, (SubLObject)UNPROVIDED);
            if (NIL == module0173.f10955(var4)) {
                return module0656.f39789((SubLObject)$ic2$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            f45920(var4, (SubLObject)T, (SubLObject)UNPROVIDED);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic1$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45923(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = module0656.f39832((SubLObject)$ic5$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var6), (SubLObject)$ic11$, module0656.f39842(var5));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var7) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var7);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var8 = module0015.$g533$.currentBinding(var6);
        try {
            module0015.$g533$.bind((SubLObject)T, var6);
            module0642.f39019((SubLObject)$ic12$);
        }
        finally {
            module0015.$g533$.rebind(var8, var6);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var5;
    }
    
    public static SubLObject f45924(final SubLObject var5, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        f45925(var5, var13);
        SubLObject var14 = f45926(var5, var13);
        if (NIL != var14) {
            var14 = f45927(var14);
            f45928(var14, var13);
        }
        else {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)THREE_INTEGER);
            module0642.f39019((SubLObject)$ic15$);
            module0642.f39026((SubLObject)TWO_INTEGER);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45926(final SubLObject var5, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        return (NIL != module0731.f44764(var5, (SubLObject)UNPROVIDED)) ? f45929(var5, var13) : f45930(var5, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45929(final SubLObject var15, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = module0731.f44778(var15, (SubLObject)UNPROVIDED);
        SubLObject var18 = (SubLObject)NIL;
        var18 = var17.first();
        while (NIL != var17) {
            final SubLObject var19 = module0731.f44861(var15, var18, (SubLObject)UNPROVIDED);
            final SubLObject var20 = (SubLObject)((NIL != var19) ? var19 : ((NIL != var13) ? module0731.f44859(var15, var18) : NIL));
            var16 = ConsesLow.nconc(var16, var20);
            var17 = var17.rest();
            var18 = var17.first();
        }
        return var16;
    }
    
    public static SubLObject f45930(final SubLObject var5, SubLObject var21) {
        if (var21 == UNPROVIDED) {
            var21 = (SubLObject)NIL;
        }
        final SubLObject var22 = module0732.f45086(var5);
        if (NIL != var21 && NIL != module0661.f40297()) {
            SubLObject var23 = (SubLObject)NIL;
            final SubLObject var24 = (NIL != module0655.f39751()) ? module0262.f17322(module0661.f40271(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : module0661.f40271();
            SubLObject var25 = var22;
            SubLObject var26 = (SubLObject)NIL;
            var26 = var25.first();
            while (NIL != var25) {
                if (NIL != Sequences.find(module0178.f11287(var26), var24, (SubLObject)$ic16$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
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
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = var26;
        SubLObject var30 = (SubLObject)NIL;
        var30 = var29.first();
        while (NIL != var29) {
            if (NIL != assertion_handles_oc.f11035(var30)) {
                var27 = (SubLObject)ConsesLow.cons(var30, var27);
            }
            else {
                var28 = (SubLObject)ConsesLow.cons(var30, var28);
            }
            var29 = var29.rest();
            var30 = var29.first();
        }
        var27 = Sort.sort(var27, Symbols.symbol_function((SubLObject)$ic17$), Symbols.symbol_function((SubLObject)$ic18$));
        var27 = Sort.sort(var27, Symbols.symbol_function((SubLObject)$ic17$), Symbols.symbol_function((SubLObject)$ic19$));
        var27 = Sort.sort(var27, Symbols.symbol_function((SubLObject)$ic17$), Symbols.symbol_function((SubLObject)$ic20$));
        return ConsesLow.append(var27, var28);
    }
    
    public static SubLObject f45920(final SubLObject var5, SubLObject var13, SubLObject var30) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)NIL;
        }
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (NIL != var30) {
            module0732.f44981(var5);
        }
        final SubLObject var33;
        final SubLObject var32 = var33 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic21$, (SubLObject)((NIL != var13) ? $ic22$ : $ic23$), var5);
        final SubLObject var34 = module0015.$g538$.currentBinding(var31);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var31))) ? module0015.$g538$.getDynamicValue(var31) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var31);
            module0642.f39020((SubLObject)$ic24$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var31), module0655.$g5142$.getDynamicValue(var31));
            final SubLObject var35 = module0014.f672((SubLObject)$ic25$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic26$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var35) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var35);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic27$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            if (NIL != var33) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var33);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0016.f941();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var10_34 = module0015.$g535$.currentBinding(var31);
            try {
                module0015.$g535$.bind((SubLObject)T, var31);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var31)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var31)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic28$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_35 = module0015.$g533$.currentBinding(var31);
                try {
                    module0015.$g533$.bind((SubLObject)T, var31);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic29$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_36 = module0015.$g533$.currentBinding(var31);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var31);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic30$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic31$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic32$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g160$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic33$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var10_36, var31);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    module0016.f936();
                    module0016.f894();
                    f45924(var5, var13);
                    module0642.f39026((SubLObject)UNPROVIDED);
                    f45931(var5, var13);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var10_35, var31);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var10_34, var31);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var34, var31);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45931(final SubLObject var5, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        module0642.f39020(module0015.$g189$.getGlobalValue());
        module0642.f39020((SubLObject)FOUR_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic34$);
        module0642.f39020(module0015.$g190$.getGlobalValue());
        module0642.f39020((SubLObject)FOUR_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        if (NIL != module0226.f14792(var5)) {
            module0642.f39019((SubLObject)$ic35$);
            module0656.f39837((SubLObject)$ic36$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        if (NIL != module0777.f50031(var5, (SubLObject)UNPROVIDED)) {
            module0642.f39019((SubLObject)$ic37$);
        }
        else {
            module0642.f39019((SubLObject)$ic38$);
        }
        module0656.f39837((SubLObject)$ic39$, var5, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic40$);
        module0656.f39837((SubLObject)$ic41$, var5, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)UNPROVIDED);
        if (NIL == var13) {
            module0642.f39019((SubLObject)$ic42$);
            module0656.f39837((SubLObject)$ic13$, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f45932(final SubLObject var37, SubLObject var13, SubLObject var7) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        if (NIL == var7) {
            var7 = (SubLObject)$ic43$;
        }
        final SubLObject var39 = module0656.f39832((SubLObject)$ic5$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var38), (SubLObject)$ic44$, module0656.f39842(var37), var13);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var39) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var39);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var40 = module0015.$g533$.currentBinding(var38);
        try {
            module0015.$g533$.bind((SubLObject)T, var38);
            module0642.f39019(var7);
        }
        finally {
            module0015.$g533$.rebind(var40, var38);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45933(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic46$);
        var2 = var1.first();
        SubLObject var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)$ic46$);
        var3 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var5 = module0656.f39943(var2, (SubLObject)UNPROVIDED);
            final SubLObject var6 = reader.read_from_string(var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == module0173.f10955(var5)) {
                return module0656.f39789((SubLObject)$ic2$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            f45920(var5, var6, (SubLObject)T);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic46$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45934(SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (!var7.isString()) {
            var7 = (SubLObject)$ic48$;
        }
        final SubLObject var9 = module0656.f39832((SubLObject)$ic49$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var8), (SubLObject)$ic50$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var9) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var9);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var10 = module0015.$g533$.currentBinding(var8);
        try {
            module0015.$g533$.bind((SubLObject)T, var8);
            module0642.f39019(var7);
        }
        finally {
            module0015.$g533$.rebind(var10, var8);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45935(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = f45936();
        module0642.f39020(module0015.$g189$.getGlobalValue());
        module0642.f39020((SubLObject)ONE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic52$);
        module0642.f39020(module0015.$g190$.getGlobalValue());
        module0642.f39020((SubLObject)ONE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        f45937(var3);
        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var4 = var3;
        SubLObject var5 = (SubLObject)NIL;
        var5 = var4.first();
        while (NIL != var4) {
            SubLObject var7;
            final SubLObject var6 = var7 = var5;
            SubLObject var8 = (SubLObject)NIL;
            SubLObject var9 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic53$);
            var8 = var7.first();
            var7 = (var9 = var7.rest());
            final SubLObject var10 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic54$, module0656.f39942(var8));
            module0642.f39020(module0015.$g381$.getGlobalValue());
            if (NIL != var10) {
                module0642.f39020(module0015.$g384$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var10);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var11 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)T, var2);
            }
            finally {
                module0015.$g533$.rebind(var11, var2);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
            module0642.f39020(module0015.$g189$.getGlobalValue());
            module0642.f39020((SubLObject)TWO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0656.f39804(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g190$.getGlobalValue());
            module0642.f39020((SubLObject)TWO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39020(module0015.$g352$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var12 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)T, var2);
                SubLObject var13 = (SubLObject)NIL;
                SubLObject var14 = (SubLObject)NIL;
                SubLObject var15 = (SubLObject)NIL;
                var13 = var9;
                var14 = var13.first();
                for (var15 = (SubLObject)ZERO_INTEGER; NIL != var13; var13 = var13.rest(), var14 = var13.first(), var15 = Numbers.add((SubLObject)ONE_INTEGER, var15)) {
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_51 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g375$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)TEN_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var10_52 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var2);
                        }
                        finally {
                            module0015.$g533$.rebind(var10_52, var2);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g371$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var10_53 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var2);
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)THREE_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            module0656.f39804(var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            if (NIL != module0127.f8414(var14)) {
                                module0642.f39020((SubLObject)$ic55$);
                            }
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)THREE_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
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
                    module0642.f39029((SubLObject)UNPROVIDED);
                    SubLObject var17_54 = (SubLObject)$ic60$;
                    SubLObject var16 = (SubLObject)NIL;
                    var16 = var17_54.first();
                    while (NIL != var17_54) {
                        final SubLObject var17 = module0147.f9540(module0677.f41312());
                        final SubLObject var10_54 = module0147.$g2095$.currentBinding(var2);
                        final SubLObject var18 = module0147.$g2094$.currentBinding(var2);
                        final SubLObject var19 = module0147.$g2096$.currentBinding(var2);
                        try {
                            module0147.$g2095$.bind(module0147.f9545(var17), var2);
                            module0147.$g2094$.bind(module0147.f9546(var17), var2);
                            module0147.$g2096$.bind(module0147.f9549(var17), var2);
                            final SubLObject var20 = module0219.f14509(var14, (SubLObject)ONE_INTEGER, var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            if (NIL != var20) {
                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var10_55 = module0015.$g533$.currentBinding(var2);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var2);
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g375$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020((SubLObject)TEN_INTEGER);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var10_56 = module0015.$g533$.currentBinding(var2);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var2);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var10_56, var2);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)$ic56$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)$ic57$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0015.$g375$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020((SubLObject)$ic58$);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var10_57 = module0015.$g533$.currentBinding(var2);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var2);
                                        module0642.f39020(module0015.$g234$.getGlobalValue());
                                        module0656.f39804(var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        module0642.f39019((SubLObject)$ic59$);
                                        module0642.f39020(module0015.$g235$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var10_57, var2);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                    SubLObject var17_55 = var20;
                                    SubLObject var21 = (SubLObject)NIL;
                                    var21 = var17_55.first();
                                    while (NIL != var17_55) {
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var10_58 = module0015.$g533$.currentBinding(var2);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var2);
                                            module0656.f39921(var21, (SubLObject)T);
                                            module0642.f39026((SubLObject)UNPROVIDED);
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
                                module0642.f39029((SubLObject)UNPROVIDED);
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
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_59 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g371$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)THREE_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var10_60 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var2);
                            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_61 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g371$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)THREE_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_62 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var12, var2);
            }
            module0642.f39020(module0015.$g347$.getGlobalValue());
            var4 = var4.rest();
            var5 = var4.first();
        }
        module0656.f39790((SubLObject)$ic61$, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45936() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var10 = module0677.f41312();
        SubLObject var11 = (SubLObject)NIL;
        final SubLObject var12 = module0147.f9540(var10);
        final SubLObject var13 = module0147.$g2095$.currentBinding(var8);
        final SubLObject var14 = module0147.$g2094$.currentBinding(var8);
        final SubLObject var15 = module0147.$g2096$.currentBinding(var8);
        try {
            module0147.$g2095$.bind(module0147.f9545(var12), var8);
            module0147.$g2094$.bind(module0147.f9546(var12), var8);
            module0147.$g2096$.bind(module0147.f9549(var12), var8);
            final SubLObject var16 = $ic63$;
            final SubLObject var10_74 = module0137.$g1605$.currentBinding(var8);
            final SubLObject var58_75 = module0139.$g1636$.currentBinding(var8);
            try {
                module0137.$g1605$.bind(module0137.f8955($ic64$), var8);
                module0139.$g1636$.bind(module0139.f9007(), var8);
                SubLObject var76_77 = var16;
                final SubLObject var17 = (SubLObject)$ic67$;
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
                        final SubLObject var19 = (SubLObject)NIL;
                        final SubLObject var10_77 = module0141.$g1714$.currentBinding(var8);
                        final SubLObject var58_77 = module0141.$g1715$.currentBinding(var8);
                        try {
                            module0141.$g1714$.bind((NIL != var19) ? var19 : module0141.f9283(), var8);
                            module0141.$g1715$.bind((SubLObject)((NIL != var19) ? $ic68$ : module0141.$g1715$.getDynamicValue(var8)), var8);
                            if (NIL != var19 && NIL != module0136.f8864() && NIL == module0141.f9279(var19)) {
                                final SubLObject var20 = module0136.$g1591$.getDynamicValue(var8);
                                if (var20.eql((SubLObject)$ic69$)) {
                                    module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic70$, var19, (SubLObject)$ic71$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                else if (var20.eql((SubLObject)$ic72$)) {
                                    module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic73$, (SubLObject)$ic70$, var19, (SubLObject)$ic71$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                else if (var20.eql((SubLObject)$ic74$)) {
                                    Errors.warn((SubLObject)$ic70$, var19, (SubLObject)$ic71$);
                                }
                                else {
                                    Errors.warn((SubLObject)$ic75$, module0136.$g1591$.getDynamicValue(var8));
                                    Errors.cerror((SubLObject)$ic73$, (SubLObject)$ic70$, var19, (SubLObject)$ic71$);
                                }
                            }
                            final SubLObject var10_78 = module0141.$g1670$.currentBinding(var8);
                            final SubLObject var58_78 = module0141.$g1671$.currentBinding(var8);
                            final SubLObject var59_85 = module0141.$g1672$.currentBinding(var8);
                            final SubLObject var21 = module0141.$g1674$.currentBinding(var8);
                            final SubLObject var22 = module0137.$g1605$.currentBinding(var8);
                            try {
                                module0141.$g1670$.bind(module0244.f15771(module0137.f8955($ic64$)), var8);
                                module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955($ic64$))), var8);
                                module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955($ic64$))), var8);
                                module0141.$g1674$.bind((SubLObject)NIL, var8);
                                module0137.$g1605$.bind(module0244.f15771(module0137.f8955($ic64$)), var8);
                                if (NIL != module0136.f8865() || NIL != module0244.f15795(var16, module0137.f8955((SubLObject)UNPROVIDED))) {
                                    final SubLObject var10_79 = module0141.$g1677$.currentBinding(var8);
                                    final SubLObject var58_79 = module0138.$g1619$.currentBinding(var8);
                                    final SubLObject var59_86 = module0141.$g1674$.currentBinding(var8);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9210(), var8);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955($ic64$))), var8);
                                        module0141.$g1674$.bind((SubLObject)NIL, var8);
                                        module0249.f16055(var76_77, (SubLObject)UNPROVIDED);
                                        while (NIL != var76_77) {
                                            final SubLObject var23 = var76_77;
                                            SubLObject var25;
                                            final SubLObject var24 = var25 = module0200.f12443(module0137.f8955($ic64$));
                                            SubLObject var26 = (SubLObject)NIL;
                                            var26 = var25.first();
                                            while (NIL != var25) {
                                                final SubLObject var10_80 = module0137.$g1605$.currentBinding(var8);
                                                final SubLObject var58_80 = module0141.$g1674$.currentBinding(var8);
                                                try {
                                                    module0137.$g1605$.bind(var26, var8);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var8)) : module0141.$g1674$.getDynamicValue(var8)), var8);
                                                    final SubLObject var27 = module0228.f15229(var23);
                                                    if (NIL != module0138.f8992(var27)) {
                                                        final SubLObject var28 = module0242.f15664(var27, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var28) {
                                                            final SubLObject var29 = module0245.f15834(var28, module0244.f15780(module0137.f8955($ic64$)), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var29) {
                                                                SubLObject var30;
                                                                for (var30 = module0066.f4838(module0067.f4891(var29)); NIL == module0066.f4841(var30); var30 = module0066.f4840(var30)) {
                                                                    var8.resetMultipleValues();
                                                                    final SubLObject var31 = module0066.f4839(var30);
                                                                    final SubLObject var32 = var8.secondMultipleValue();
                                                                    var8.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var31)) {
                                                                        final SubLObject var10_81 = module0138.$g1623$.currentBinding(var8);
                                                                        try {
                                                                            module0138.$g1623$.bind(var31, var8);
                                                                            SubLObject var105_109;
                                                                            for (var105_109 = module0066.f4838(module0067.f4891(var32)); NIL == module0066.f4841(var105_109); var105_109 = module0066.f4840(var105_109)) {
                                                                                var8.resetMultipleValues();
                                                                                final SubLObject var33 = module0066.f4839(var105_109);
                                                                                final SubLObject var34 = var8.secondMultipleValue();
                                                                                var8.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var33)) {
                                                                                    final SubLObject var10_82 = module0138.$g1624$.currentBinding(var8);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var33, var8);
                                                                                        final SubLObject var35 = var34;
                                                                                        if (NIL != module0077.f5302(var35)) {
                                                                                            final SubLObject var36 = module0077.f5333(var35);
                                                                                            SubLObject var37;
                                                                                            SubLObject var38;
                                                                                            SubLObject var39;
                                                                                            SubLObject var17_118;
                                                                                            SubLObject var40;
                                                                                            SubLObject var41;
                                                                                            for (var37 = module0032.f1741(var36), var38 = (SubLObject)NIL, var38 = module0032.f1742(var37, var36); NIL == module0032.f1744(var37, var38); var38 = module0032.f1743(var38)) {
                                                                                                var39 = module0032.f1745(var37, var38);
                                                                                                if (NIL != module0032.f1746(var38, var39) && NIL == module0249.f16059(var39, module0139.$g1636$.getDynamicValue(var8))) {
                                                                                                    module0249.f16055(var39, module0139.$g1636$.getDynamicValue(var8));
                                                                                                    if (NIL != module0173.f10955(var39)) {
                                                                                                        var40 = (var17_118 = f45938(var39, var10));
                                                                                                        var41 = (SubLObject)NIL;
                                                                                                        var41 = var17_118.first();
                                                                                                        while (NIL != var17_118) {
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
                                                                                            SubLObject var43 = (SubLObject)NIL;
                                                                                            var43 = var42.first();
                                                                                            while (NIL != var42) {
                                                                                                if (NIL == module0249.f16059(var43, module0139.$g1636$.getDynamicValue(var8))) {
                                                                                                    module0249.f16055(var43, module0139.$g1636$.getDynamicValue(var8));
                                                                                                    if (NIL != module0173.f10955(var43)) {
                                                                                                        SubLObject var17_119;
                                                                                                        final SubLObject var44 = var17_119 = f45938(var43, var10);
                                                                                                        SubLObject var45 = (SubLObject)NIL;
                                                                                                        var45 = var17_119.first();
                                                                                                        while (NIL != var17_119) {
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
                                                                                            Errors.error((SubLObject)$ic76$, var35);
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
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic77$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                        if (NIL != module0200.f12419(var27, module0137.f8955((SubLObject)UNPROVIDED))) {
                                                            SubLObject var46 = module0248.f15995(var27);
                                                            SubLObject var47 = (SubLObject)NIL;
                                                            var47 = var46.first();
                                                            while (NIL != var46) {
                                                                SubLObject var49;
                                                                final SubLObject var48 = var49 = var47;
                                                                SubLObject var50 = (SubLObject)NIL;
                                                                SubLObject var51 = (SubLObject)NIL;
                                                                SubLObject var52 = (SubLObject)NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)$ic78$);
                                                                var50 = var49.first();
                                                                var49 = var49.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)$ic78$);
                                                                var51 = var49.first();
                                                                var49 = var49.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)$ic78$);
                                                                var52 = var49.first();
                                                                var49 = var49.rest();
                                                                if (NIL == var49) {
                                                                    if (NIL != module0147.f9507(var51)) {
                                                                        final SubLObject var10_83 = module0138.$g1623$.currentBinding(var8);
                                                                        try {
                                                                            module0138.$g1623$.bind(var51, var8);
                                                                            if (NIL != module0141.f9289(var52)) {
                                                                                final SubLObject var10_84 = module0138.$g1624$.currentBinding(var8);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var52, var8);
                                                                                    final SubLObject var35;
                                                                                    final SubLObject var53 = var35 = (SubLObject)ConsesLow.list(var50);
                                                                                    if (NIL != module0077.f5302(var35)) {
                                                                                        final SubLObject var36 = module0077.f5333(var35);
                                                                                        SubLObject var37;
                                                                                        SubLObject var38;
                                                                                        SubLObject var39;
                                                                                        SubLObject var40;
                                                                                        SubLObject var41;
                                                                                        SubLObject var17_120;
                                                                                        for (var37 = module0032.f1741(var36), var38 = (SubLObject)NIL, var38 = module0032.f1742(var37, var36); NIL == module0032.f1744(var37, var38); var38 = module0032.f1743(var38)) {
                                                                                            var39 = module0032.f1745(var37, var38);
                                                                                            if (NIL != module0032.f1746(var38, var39) && NIL == module0249.f16059(var39, module0139.$g1636$.getDynamicValue(var8))) {
                                                                                                module0249.f16055(var39, module0139.$g1636$.getDynamicValue(var8));
                                                                                                if (NIL != module0173.f10955(var39)) {
                                                                                                    var40 = (var17_120 = f45938(var39, var10));
                                                                                                    var41 = (SubLObject)NIL;
                                                                                                    var41 = var17_120.first();
                                                                                                    while (NIL != var17_120) {
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
                                                                                        SubLObject var43 = (SubLObject)NIL;
                                                                                        var43 = var120_131.first();
                                                                                        while (NIL != var120_131) {
                                                                                            if (NIL == module0249.f16059(var43, module0139.$g1636$.getDynamicValue(var8))) {
                                                                                                module0249.f16055(var43, module0139.$g1636$.getDynamicValue(var8));
                                                                                                if (NIL != module0173.f10955(var43)) {
                                                                                                    SubLObject var17_121;
                                                                                                    final SubLObject var44 = var17_121 = f45938(var43, var10);
                                                                                                    SubLObject var45 = (SubLObject)NIL;
                                                                                                    var45 = var17_121.first();
                                                                                                    while (NIL != var17_121) {
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
                                                                                        Errors.error((SubLObject)$ic76$, var35);
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
                                                                    cdestructuring_bind.cdestructuring_bind_error(var48, (SubLObject)$ic78$);
                                                                }
                                                                var46 = var46.rest();
                                                                var47 = var46.first();
                                                            }
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var27, (SubLObject)UNPROVIDED)) {
                                                        SubLObject var17_122;
                                                        final SubLObject var54 = var17_122 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955($ic64$)), module0141.$g1714$.getDynamicValue(var8), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955($ic64$)), module0141.$g1714$.getDynamicValue(var8), module0137.f8955((SubLObject)UNPROVIDED)));
                                                        SubLObject var55 = (SubLObject)NIL;
                                                        var55 = var17_122.first();
                                                        while (NIL != var17_122) {
                                                            final SubLObject var10_85 = module0138.$g1625$.currentBinding(var8);
                                                            try {
                                                                module0138.$g1625$.bind(var55, var8);
                                                                final SubLObject var57;
                                                                final SubLObject var56 = var57 = Functions.funcall(var55, var27);
                                                                if (NIL != module0077.f5302(var57)) {
                                                                    final SubLObject var58 = module0077.f5333(var57);
                                                                    SubLObject var59;
                                                                    SubLObject var60;
                                                                    SubLObject var61;
                                                                    SubLObject var17_123;
                                                                    SubLObject var62;
                                                                    SubLObject var63;
                                                                    for (var59 = module0032.f1741(var58), var60 = (SubLObject)NIL, var60 = module0032.f1742(var59, var58); NIL == module0032.f1744(var59, var60); var60 = module0032.f1743(var60)) {
                                                                        var61 = module0032.f1745(var59, var60);
                                                                        if (NIL != module0032.f1746(var60, var61) && NIL == module0249.f16059(var61, module0139.$g1636$.getDynamicValue(var8))) {
                                                                            module0249.f16055(var61, module0139.$g1636$.getDynamicValue(var8));
                                                                            if (NIL != module0173.f10955(var61)) {
                                                                                var62 = (var17_123 = f45938(var61, var10));
                                                                                var63 = (SubLObject)NIL;
                                                                                var63 = var17_123.first();
                                                                                while (NIL != var17_123) {
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
                                                                    SubLObject var65 = (SubLObject)NIL;
                                                                    var65 = var64.first();
                                                                    while (NIL != var64) {
                                                                        if (NIL == module0249.f16059(var65, module0139.$g1636$.getDynamicValue(var8))) {
                                                                            module0249.f16055(var65, module0139.$g1636$.getDynamicValue(var8));
                                                                            if (NIL != module0173.f10955(var65)) {
                                                                                SubLObject var17_124;
                                                                                final SubLObject var66 = var17_124 = f45938(var65, var10);
                                                                                SubLObject var67 = (SubLObject)NIL;
                                                                                var67 = var17_124.first();
                                                                                while (NIL != var17_124) {
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
                                                                    Errors.error((SubLObject)$ic76$, var57);
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
                                            final SubLObject var68 = var69 = module0200.f12443(module0244.f15771(module0137.f8955($ic64$)));
                                            SubLObject var70 = (SubLObject)NIL;
                                            var70 = var69.first();
                                            while (NIL != var69) {
                                                final SubLObject var10_86 = module0137.$g1605$.currentBinding(var8);
                                                final SubLObject var58_81 = module0141.$g1674$.currentBinding(var8);
                                                try {
                                                    module0137.$g1605$.bind(var70, var8);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var8)) : module0141.$g1674$.getDynamicValue(var8)), var8);
                                                    final SubLObject var71 = module0228.f15229(var76_77);
                                                    if (NIL != module0138.f8992(var71)) {
                                                        final SubLObject var72 = module0242.f15664(var71, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var72) {
                                                            final SubLObject var73 = module0245.f15834(var72, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var73) {
                                                                SubLObject var74;
                                                                for (var74 = module0066.f4838(module0067.f4891(var73)); NIL == module0066.f4841(var74); var74 = module0066.f4840(var74)) {
                                                                    var8.resetMultipleValues();
                                                                    final SubLObject var75 = module0066.f4839(var74);
                                                                    final SubLObject var76 = var8.secondMultipleValue();
                                                                    var8.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var75)) {
                                                                        final SubLObject var10_87 = module0138.$g1623$.currentBinding(var8);
                                                                        try {
                                                                            module0138.$g1623$.bind(var75, var8);
                                                                            SubLObject var105_110;
                                                                            for (var105_110 = module0066.f4838(module0067.f4891(var76)); NIL == module0066.f4841(var105_110); var105_110 = module0066.f4840(var105_110)) {
                                                                                var8.resetMultipleValues();
                                                                                final SubLObject var77 = module0066.f4839(var105_110);
                                                                                final SubLObject var78 = var8.secondMultipleValue();
                                                                                var8.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var77)) {
                                                                                    final SubLObject var10_88 = module0138.$g1624$.currentBinding(var8);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var77, var8);
                                                                                        final SubLObject var79 = var78;
                                                                                        if (NIL != module0077.f5302(var79)) {
                                                                                            final SubLObject var80 = module0077.f5333(var79);
                                                                                            SubLObject var81;
                                                                                            SubLObject var82;
                                                                                            SubLObject var83;
                                                                                            for (var81 = module0032.f1741(var80), var82 = (SubLObject)NIL, var82 = module0032.f1742(var81, var80); NIL == module0032.f1744(var81, var82); var82 = module0032.f1743(var82)) {
                                                                                                var83 = module0032.f1745(var81, var82);
                                                                                                if (NIL != module0032.f1746(var82, var83) && NIL == module0249.f16059(var83, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var83, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var83, var18);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var79.isList()) {
                                                                                            SubLObject var84 = var79;
                                                                                            SubLObject var85 = (SubLObject)NIL;
                                                                                            var85 = var84.first();
                                                                                            while (NIL != var84) {
                                                                                                if (NIL == module0249.f16059(var85, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var85, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var85, var18);
                                                                                                }
                                                                                                var84 = var84.rest();
                                                                                                var85 = var84.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic76$, var79);
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
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic77$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var71, (SubLObject)UNPROVIDED)) {
                                                        SubLObject var17_125;
                                                        final SubLObject var86 = var17_125 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var8), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var8), module0137.f8955((SubLObject)UNPROVIDED)));
                                                        SubLObject var87 = (SubLObject)NIL;
                                                        var87 = var17_125.first();
                                                        while (NIL != var17_125) {
                                                            final SubLObject var10_89 = module0138.$g1625$.currentBinding(var8);
                                                            try {
                                                                module0138.$g1625$.bind(var87, var8);
                                                                final SubLObject var89;
                                                                final SubLObject var88 = var89 = Functions.funcall(var87, var71);
                                                                if (NIL != module0077.f5302(var89)) {
                                                                    final SubLObject var90 = module0077.f5333(var89);
                                                                    SubLObject var91;
                                                                    SubLObject var92;
                                                                    SubLObject var93;
                                                                    for (var91 = module0032.f1741(var90), var92 = (SubLObject)NIL, var92 = module0032.f1742(var91, var90); NIL == module0032.f1744(var91, var92); var92 = module0032.f1743(var92)) {
                                                                        var93 = module0032.f1745(var91, var92);
                                                                        if (NIL != module0032.f1746(var92, var93) && NIL == module0249.f16059(var93, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var93, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var93, var18);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var89.isList()) {
                                                                    SubLObject var94 = var89;
                                                                    SubLObject var95 = (SubLObject)NIL;
                                                                    var95 = var94.first();
                                                                    while (NIL != var94) {
                                                                        if (NIL == module0249.f16059(var95, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var95, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var95, var18);
                                                                        }
                                                                        var94 = var94.rest();
                                                                        var95 = var94.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic76$, var89);
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
                                    module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic79$, var16, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
            var11 = Sort.sort(module0084.f5780(var9), (SubLObject)$ic80$, Symbols.symbol_function((SubLObject)$ic81$));
            var11 = Sort.stable_sort(var11, (SubLObject)$ic82$, Symbols.symbol_function((SubLObject)$ic81$));
            SubLObject var96 = (SubLObject)NIL;
            SubLObject var97 = (SubLObject)NIL;
            SubLObject var98 = (SubLObject)NIL;
            var96 = var11;
            var97 = var96.first();
            for (var98 = (SubLObject)ZERO_INTEGER; NIL != var96; var96 = var96.rest(), var97 = var96.first(), var98 = Numbers.add((SubLObject)ONE_INTEGER, var98)) {
                ConsesLow.set_nth(var98, var11, (SubLObject)ConsesLow.cons(var97.first(), Sort.sort(var97.rest(), (SubLObject)$ic17$, (SubLObject)$ic83$)));
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
        module0642.f39021((SubLObject)$ic84$);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic85$);
        module0642.f39020(module0015.$g185$.getGlobalValue());
        SubLObject var151 = var149;
        SubLObject var152 = (SubLObject)NIL;
        var152 = var151.first();
        while (NIL != var151) {
            SubLObject var154;
            final SubLObject var153 = var154 = var152;
            SubLObject var155 = (SubLObject)NIL;
            SubLObject var156 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var154, var153, (SubLObject)$ic53$);
            var155 = var154.first();
            var154 = (var156 = var154.rest());
            final SubLObject var157 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic86$, module0656.f39942(var155));
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var157);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var158 = module0015.$g533$.currentBinding(var150);
            try {
                module0015.$g533$.bind((SubLObject)T, var150);
                module0642.f39019(var155);
                module0642.f39026((SubLObject)UNPROVIDED);
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
        if (var152 == UNPROVIDED) {
            var152 = module0677.f41312();
        }
        final SubLThread var153 = SubLProcess.currentSubLThread();
        final SubLObject var154 = module0226.f14990(var49, var152);
        SubLObject var155 = (SubLObject)NIL;
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
            var155 = module0035.remove_if_not((SubLObject)$ic87$, var154, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var155 = module0035.f2467(var155, (SubLObject)$ic88$, (SubLObject)UNPROVIDED);
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
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var156 = SubLProcess.currentSubLThread();
        SubLObject var157 = (SubLObject)NIL;
        SubLObject var158 = (SubLObject)NIL;
        final SubLObject var159 = module0580.$g4361$.currentBinding(var156);
        try {
            module0580.$g4361$.bind((SubLObject)NIL, var156);
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
                                SubLObject var163 = (SubLObject)NIL;
                                if (NIL != var162 && NIL == module0034.f1842(var162)) {
                                    var163 = module0034.f1869(var162);
                                    final SubLObject var164 = Threads.current_process();
                                    if (NIL == var163) {
                                        module0034.f1873(var162, var164);
                                    }
                                    else if (!var163.eql(var164)) {
                                        Errors.error((SubLObject)$ic89$);
                                    }
                                }
                                try {
                                    SubLObject var165 = var155;
                                    SubLObject var166 = (SubLObject)NIL;
                                    var166 = var165.first();
                                    while (NIL != var165) {
                                        if (NIL != assertion_handles_oc.f11035(var166)) {
                                            var158 = (SubLObject)makeBoolean(NIL == module0161.f10514(module0178.f11287(var166), var157));
                                            if (NIL != var158) {
                                                var157 = module0178.f11287(var166);
                                            }
                                            f45939(var166, var13, var158);
                                        }
                                        else {
                                            module0656.f39804(var166, (SubLObject)NIL, (SubLObject)T);
                                            module0642.f39026((SubLObject)TWO_INTEGER);
                                            var157 = (SubLObject)NIL;
                                        }
                                        var165 = var165.rest();
                                        var166 = var165.first();
                                    }
                                }
                                finally {
                                    final SubLObject var10_162 = Threads.$is_thread_performing_cleanupP$.currentBinding(var156);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var156);
                                        if (NIL != var162 && NIL == var163) {
                                            module0034.f1873(var162, (SubLObject)NIL);
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
                        if (var161 == $ic90$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var156))) {
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
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var156);
                        if (NIL == var160) {
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
        return (SubLObject)T;
    }
    
    public static SubLObject f45940(final SubLObject var169) {
        final SubLThread var170 = SubLProcess.currentSubLThread();
        final SubLObject var171 = f45941(var169);
        final SubLObject var172 = module0035.f2293($g5886$.getGlobalValue(), var171, (SubLObject)EQL, (SubLObject)UNPROVIDED);
        final SubLObject var173 = Sequences.cconcatenate((SubLObject)$ic94$, new SubLObject[] { module0006.f203(assertion_handles_oc.f11025(var169)), $ic95$, module0006.f203(var172), $ic96$ });
        final SubLObject var174 = module0035.f2293($g5887$.getGlobalValue(), var171, (SubLObject)EQL, (SubLObject)UNPROVIDED);
        final SubLObject var175 = module0035.f2293($g5888$.getGlobalValue(), var171, (SubLObject)EQL, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var173);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var174) {
            module0642.f39020(module0015.$g386$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var174);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g388$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic97$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var176 = module0015.$g533$.currentBinding(var170);
        try {
            module0015.$g533$.bind((SubLObject)T, var170);
            final SubLObject var177 = Sequences.cconcatenate(module0110.$g124$.getDynamicValue(var170), module0014.f683(var175));
            final SubLObject var178 = (SubLObject)$ic57$;
            final SubLObject var179 = module0014.f679(var175);
            final SubLObject var180 = (SubLObject)ZERO_INTEGER;
            module0642.f39020(module0015.$g431$.getGlobalValue());
            module0642.f39020(module0015.$g440$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var177);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var179) {
                module0642.f39020(module0015.$g437$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var179);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            if (NIL != var178) {
                module0642.f39020(module0015.$g438$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049(var178));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            if (NIL != var180) {
                module0642.f39020(module0015.$g439$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var180);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var10_178 = module0015.$g533$.currentBinding(var170);
            try {
                module0015.$g533$.bind((SubLObject)T, var170);
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
        final SubLObject var172 = (SubLObject)((NIL != var171) ? $ic99$ : $ic100$);
        final SubLObject var173 = (SubLObject)((NIL != var171) ? $ic101$ : $ic102$);
        final SubLObject var174 = Sequences.cconcatenate((SubLObject)$ic103$, new SubLObject[] { module0006.f203(assertion_handles_oc.f11025(var169)), $ic95$, module0006.f203(var172), $ic96$ });
        final SubLObject var175 = (SubLObject)((NIL != var171) ? $ic104$ : $ic105$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var174);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var173) {
            module0642.f39020(module0015.$g386$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var173);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var176 = module0015.$g533$.currentBinding(var170);
        try {
            module0015.$g533$.bind((SubLObject)T, var170);
            final SubLObject var177 = Sequences.cconcatenate(module0110.$g124$.getDynamicValue(var170), module0014.f683(var175));
            final SubLObject var178 = (SubLObject)$ic57$;
            final SubLObject var179 = module0014.f679(var175);
            final SubLObject var180 = (SubLObject)ZERO_INTEGER;
            module0642.f39020(module0015.$g431$.getGlobalValue());
            module0642.f39020(module0015.$g440$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var177);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var179) {
                module0642.f39020(module0015.$g437$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var179);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            if (NIL != var178) {
                module0642.f39020(module0015.$g438$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049(var178));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            if (NIL != var180) {
                module0642.f39020(module0015.$g439$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var180);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var10_184 = module0015.$g533$.currentBinding(var170);
            try {
                module0015.$g533$.bind((SubLObject)T, var170);
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
            module0147.$g2094$.bind((SubLObject)$ic106$, var170);
            module0147.$g2095$.bind($ic107$, var170);
            if (NIL != module0158.f10282(var169, (SubLObject)NIL)) {
                final SubLObject var173 = module0158.f10283(var169, (SubLObject)NIL);
                SubLObject var174 = (SubLObject)NIL;
                final SubLObject var175 = (SubLObject)NIL;
                while (NIL == var174) {
                    final SubLObject var176 = module0052.f3695(var173, var175);
                    final SubLObject var177 = (SubLObject)makeBoolean(!var175.eql(var176));
                    if (NIL != var177) {
                        SubLObject var178 = (SubLObject)NIL;
                        try {
                            var178 = module0158.f10316(var176, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var186_191 = (SubLObject)NIL;
                            final SubLObject var187_192 = (SubLObject)NIL;
                            while (NIL == var186_191) {
                                final SubLObject var179 = module0052.f3695(var178, var187_192);
                                final SubLObject var189_194 = (SubLObject)makeBoolean(!var187_192.eql(var179));
                                if (NIL != var189_194 && NIL != module0158.f10284(var179, var176) && module0205.f13132(var179).eql($ic108$)) {
                                    return module0205.f13204(var179, (SubLObject)UNPROVIDED);
                                }
                                var186_191 = (SubLObject)makeBoolean(NIL == var189_194);
                            }
                        }
                        finally {
                            final SubLObject var10_195 = Threads.$is_thread_performing_cleanupP$.currentBinding(var170);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var170);
                                if (NIL != var178) {
                                    module0158.f10319(var178);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var10_195, var170);
                            }
                        }
                    }
                    var174 = (SubLObject)makeBoolean(NIL == var177);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var172, var170);
            module0147.$g2094$.rebind(var171, var170);
        }
        return (SubLObject)$ic110$;
    }
    
    public static SubLObject f45944(final SubLObject var169) {
        return Equality.eql(f45941(var169), $ic111$);
    }
    
    public static SubLObject f45945(final SubLObject var169) {
        return Equality.eql(f45941(var169), $ic112$);
    }
    
    public static SubLObject f45946(final SubLObject var169) {
        return Equality.eql(f45941(var169), (SubLObject)$ic110$);
    }
    
    public static SubLObject f45947(final SubLObject var169) {
        return Equality.eql(f45941(var169), $ic113$);
    }
    
    public static SubLObject f45943(final SubLObject var169) {
        return module0035.sublisp_boolean(module0219.f14509(var169, (SubLObject)TWO_INTEGER, $ic114$, module0178.f11287(var169), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f45939(final SubLObject var196, final SubLObject var13, SubLObject var157) {
        if (var157 == UNPROVIDED) {
            var157 = (SubLObject)T;
        }
        final SubLThread var197 = SubLProcess.currentSubLThread();
        if (NIL != var157) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g209$.getGlobalValue());
            module0642.f39019((SubLObject)$ic134$);
            module0656.f39804(module0178.f11287(var196), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g210$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        module0656.f39916(var196, module0655.$g5095$.getDynamicValue(var197), (SubLObject)NIL);
        module0642.f39026((SubLObject)UNPROVIDED);
        if (NIL != var13 && NIL != module0211.f13640(var196)) {
            SubLObject var198 = (SubLObject)NIL;
            try {
                var197.throwStack.push($ic135$);
                final SubLObject var199 = Errors.$error_handler$.currentBinding(var197);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic136$), var197);
                    try {
                        final SubLObject var10_198 = module0579.$g4298$.currentBinding(var197);
                        try {
                            module0579.$g4298$.bind((SubLObject)$ic137$, var197);
                            final SubLObject var200 = module0777.f50117(var196, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic138$);
                            if (NIL == var200) {
                                module0642.f39019((SubLObject)$ic139$);
                            }
                            else {
                                SubLObject var201 = var200;
                                SubLObject var202 = (SubLObject)NIL;
                                var202 = var201.first();
                                while (NIL != var201) {
                                    module0642.f39032((SubLObject)UNPROVIDED);
                                    PrintLow.format(module0015.$g131$.getDynamicValue(var197), (SubLObject)$ic140$, var202);
                                    var201 = var201.rest();
                                    var202 = var201.first();
                                }
                            }
                            module0642.f39026((SubLObject)TWO_INTEGER);
                        }
                        finally {
                            module0579.$g4298$.rebind(var10_198, var197);
                        }
                    }
                    catch (Throwable var203) {
                        Errors.handleThrowable(var203, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var199, var197);
                }
            }
            catch (Throwable var204) {
                var198 = Errors.handleThrowable(var204, (SubLObject)$ic135$);
            }
            finally {
                var197.throwStack.pop();
            }
        }
        return var196;
    }
    
    public static SubLObject f45925(final SubLObject var5, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39020(module0015.$g219$.getGlobalValue());
        module0642.f39020(module0015.$g221$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)FIVE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        SubLObject var15 = module0015.$g533$.currentBinding(var14);
        try {
            module0015.$g533$.bind((SubLObject)T, var14);
            if (NIL != var13) {
                module0642.f39019((SubLObject)$ic22$);
            }
            module0642.f39019((SubLObject)$ic141$);
            module0656.f39804(var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39019((SubLObject)$ic59$);
        }
        finally {
            module0015.$g533$.rebind(var15, var14);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)TWO_INTEGER);
        f45948(var5, var13);
        var15 = module0147.$g2094$.currentBinding(var14);
        final SubLObject var16 = module0147.$g2095$.currentBinding(var14);
        try {
            module0147.$g2094$.bind((SubLObject)$ic106$, var14);
            module0147.$g2095$.bind($ic107$, var14);
            if (NIL != module0269.f17706(var5) || NIL != module0269.f17708(var5)) {
                f45949(var5, var13);
            }
        }
        finally {
            module0147.$g2095$.rebind(var16, var14);
            module0147.$g2094$.rebind(var15, var14);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f45950(final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        final SubLObject var39 = module0580.$g4361$.currentBinding(var38);
        try {
            module0580.$g4361$.bind((SubLObject)NIL, var38);
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
                                SubLObject var43 = (SubLObject)NIL;
                                if (NIL != var42 && NIL == module0034.f1842(var42)) {
                                    var43 = module0034.f1869(var42);
                                    final SubLObject var44 = Threads.current_process();
                                    if (NIL == var43) {
                                        module0034.f1873(var42, var44);
                                    }
                                    else if (!var43.eql(var44)) {
                                        Errors.error((SubLObject)$ic89$);
                                    }
                                }
                                try {
                                    final SubLObject var10_207 = module0579.$g4260$.currentBinding(var38);
                                    final SubLObject var45 = module0579.$g4259$.currentBinding(var38);
                                    try {
                                        module0579.$g4260$.bind(module0677.f41312(), var38);
                                        module0579.$g4259$.bind((SubLObject)$ic142$, var38);
                                        return module0770.f49049(var37, (SubLObject)$ic110$, (SubLObject)NIL, module0677.f41312(), $ic143$, (SubLObject)$ic142$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                    finally {
                                        module0579.$g4259$.rebind(var45, var38);
                                        module0579.$g4260$.rebind(var10_207, var38);
                                    }
                                }
                                finally {
                                    final SubLObject var10_208 = Threads.$is_thread_performing_cleanupP$.currentBinding(var38);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var38);
                                        if (NIL != var42 && NIL == var43) {
                                            module0034.f1873(var42, (SubLObject)NIL);
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
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var38);
                        if (NIL == var40) {
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
            module0580.$g4361$.bind((SubLObject)NIL, var38);
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
                                SubLObject var43 = (SubLObject)NIL;
                                if (NIL != var42 && NIL == module0034.f1842(var42)) {
                                    var43 = module0034.f1869(var42);
                                    final SubLObject var44 = Threads.current_process();
                                    if (NIL == var43) {
                                        module0034.f1873(var42, var44);
                                    }
                                    else if (!var43.eql(var44)) {
                                        Errors.error((SubLObject)$ic89$);
                                    }
                                }
                                try {
                                    final SubLObject var10_214 = module0579.$g4260$.currentBinding(var38);
                                    final SubLObject var45 = module0579.$g4259$.currentBinding(var38);
                                    try {
                                        module0579.$g4260$.bind(module0677.f41312(), var38);
                                        module0579.$g4259$.bind((SubLObject)$ic142$, var38);
                                        return module0764.f48457(var37, (SubLObject)$ic144$, (SubLObject)$ic145$, (SubLObject)$ic142$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                    finally {
                                        module0579.$g4259$.rebind(var45, var38);
                                        module0579.$g4260$.rebind(var10_214, var38);
                                    }
                                }
                                finally {
                                    final SubLObject var10_215 = Threads.$is_thread_performing_cleanupP$.currentBinding(var38);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var38);
                                        if (NIL != var42 && NIL == var43) {
                                            module0034.f1873(var42, (SubLObject)NIL);
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
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var38);
                        if (NIL == var40) {
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
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        final SubLObject var39 = module0579.$g4298$.currentBinding(var38);
        try {
            module0579.$g4298$.bind((SubLObject)$ic137$, var38);
            var38.resetMultipleValues();
            final SubLObject var40 = f45950(var37);
            final SubLObject var41 = var38.secondMultipleValue();
            final SubLObject var42 = var38.thirdMultipleValue();
            var38.resetMultipleValues();
            final SubLObject var43 = conses_high.member(module0756.f47689(), var42, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
            f45952((SubLObject)$ic146$, var40, var41, var37, var13, var43, (SubLObject)UNPROVIDED);
            module0642.f39026((SubLObject)UNPROVIDED);
            if (NIL != var13) {
                final SubLObject var44 = f45951(var37);
                SubLObject var45 = Sequences.remove(var40, var44, Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL == var45) {
                    var45 = (SubLObject)ConsesLow.cons((SubLObject)$ic147$, var45);
                }
                module0642.f39020(module0015.$g209$.getGlobalValue());
                module0642.f39019((SubLObject)$ic148$);
                module0642.f39020(module0015.$g210$.getGlobalValue());
                final SubLObject var46 = Sequences.length(var45);
                SubLObject var47 = (SubLObject)NIL;
                SubLObject var200_223 = (SubLObject)NIL;
                SubLObject var48 = (SubLObject)NIL;
                var47 = var45;
                var200_223 = var47.first();
                for (var48 = (SubLObject)ZERO_INTEGER; NIL != var47; var47 = var47.rest(), var200_223 = var47.first(), var48 = Numbers.add((SubLObject)ONE_INTEGER, var48)) {
                    PrintLow.format(module0015.$g131$.getDynamicValue(var38), (SubLObject)$ic140$, var200_223);
                    if (!var48.numGE(module0048.f_1_(var46))) {
                        module0642.f39019((SubLObject)$ic149$);
                    }
                }
                module0642.f39026((SubLObject)TWO_INTEGER);
            }
            return Values.values(var40, var41);
        }
        finally {
            module0579.$g4298$.rebind(var39, var38);
        }
    }
    
    public static SubLObject f45952(final SubLObject var225, SubLObject var200, final SubLObject var217, final SubLObject var5, final SubLObject var13, SubLObject var219, SubLObject var226) {
        if (var219 == UNPROVIDED) {
            var219 = (SubLObject)NIL;
        }
        if (var226 == UNPROVIDED) {
            var226 = (SubLObject)NIL;
        }
        final SubLThread var227 = SubLProcess.currentSubLThread();
        var200 = module0038.f2669(var200, (SubLObject)$ic150$, (SubLObject)$ic151$);
        module0642.f39020(module0015.$g209$.getGlobalValue());
        PrintLow.format(module0015.$g131$.getDynamicValue(var227), (SubLObject)$ic152$, var225);
        module0642.f39020(module0015.$g210$.getGlobalValue());
        final SubLObject var228 = module0035.f2002(var200, (SubLObject)$ic153$, (SubLObject)UNPROVIDED);
        if (NIL != var228) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)THREE_INTEGER);
        }
        PrintLow.format(module0015.$g131$.getDynamicValue(var227), (SubLObject)$ic140$, var200);
        if (NIL != var228) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)THREE_INTEGER);
        }
        PrintLow.format(module0015.$g131$.getDynamicValue(var227), (SubLObject)$ic154$, (SubLObject)((NIL != var217) ? var217 : $ic155$));
        if (NIL != var13 && NIL != module0035.f2013(var226)) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39019((SubLObject)$ic156$);
            SubLObject var229 = var226;
            SubLObject var230 = (SubLObject)NIL;
            var230 = var229.first();
            while (NIL != var229) {
                module0656.f39804(var230, (SubLObject)ONE_INTEGER, (SubLObject)T);
                module0642.f39026((SubLObject)UNPROVIDED);
                var229 = var229.rest();
                var230 = var229.first();
            }
        }
        module0642.f39026((SubLObject)UNPROVIDED);
        if (NIL != var219) {
            module0642.f39032((SubLObject)THREE_INTEGER);
            module0642.f39019((SubLObject)$ic157$);
            module0642.f39032((SubLObject)UNPROVIDED);
            module0656.f39837((SubLObject)$ic41$, var5, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45949(final SubLObject var5, final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0751.f47156(var5, (SubLObject)T);
        if (NIL != module0206.f13464(var15)) {
            final SubLObject var16 = module0580.$g4361$.currentBinding(var14);
            try {
                module0580.$g4361$.bind((SubLObject)NIL, var14);
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
                                    SubLObject var20 = (SubLObject)NIL;
                                    if (NIL != var19 && NIL == module0034.f1842(var19)) {
                                        var20 = module0034.f1869(var19);
                                        final SubLObject var21 = Threads.current_process();
                                        if (NIL == var20) {
                                            module0034.f1873(var19, var21);
                                        }
                                        else if (!var20.eql(var21)) {
                                            Errors.error((SubLObject)$ic89$);
                                        }
                                    }
                                    try {
                                        final SubLObject var10_234 = module0579.$g4260$.currentBinding(var14);
                                        final SubLObject var22 = module0579.$g4259$.currentBinding(var14);
                                        try {
                                            module0579.$g4260$.bind(module0677.f41312(), var14);
                                            module0579.$g4259$.bind((SubLObject)$ic142$, var14);
                                            var14.resetMultipleValues();
                                            final SubLObject var23 = f45950(var15);
                                            final SubLObject var24 = var14.secondMultipleValue();
                                            final SubLObject var25 = var14.thirdMultipleValue();
                                            var14.resetMultipleValues();
                                            f45952((SubLObject)$ic158$, var23, var24, var5, var13, (SubLObject)NIL, module0035.remove_if_not((SubLObject)$ic159$, var25, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                                            if (NIL != var13) {
                                                final SubLObject var26 = Sequences.remove(var23, module0764.f48457(var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                if (NIL != module0035.f2013(var26)) {
                                                    module0642.f39020(module0015.$g209$.getGlobalValue());
                                                    module0642.f39019((SubLObject)$ic160$);
                                                    module0642.f39020(module0015.$g210$.getGlobalValue());
                                                    SubLObject var27 = var26;
                                                    SubLObject var28 = (SubLObject)NIL;
                                                    var28 = var27.first();
                                                    while (NIL != var27) {
                                                        module0642.f39026((SubLObject)UNPROVIDED);
                                                        module0642.f39032((SubLObject)THREE_INTEGER);
                                                        PrintLow.format(module0015.$g131$.getDynamicValue(var14), (SubLObject)$ic140$, module0209.f13552(var28));
                                                        var27 = var27.rest();
                                                        var28 = var27.first();
                                                    }
                                                    module0642.f39026((SubLObject)UNPROVIDED);
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
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var14);
                                            if (NIL != var19 && NIL == var20) {
                                                module0034.f1873(var19, (SubLObject)NIL);
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
                            if (var18 == $ic90$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var14))) {
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
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var14);
                            if (NIL == var17) {
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
        return (SubLObject)NIL;
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
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (NIL == var7) {
            var7 = (SubLObject)$ic165$;
        }
        final SubLObject var9 = module0656.f39832((SubLObject)$ic49$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic166$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var9) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var9);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var10 = module0015.$g533$.currentBinding(var8);
        try {
            module0015.$g533$.bind((SubLObject)T, var8);
            if (NIL != module0014.f695((SubLObject)$ic161$)) {
                final SubLObject var11 = module0014.f697((SubLObject)$ic161$);
                final SubLObject var12 = (SubLObject)$ic57$;
                final SubLObject var13 = module0014.f694((SubLObject)$ic161$);
                final SubLObject var14 = (SubLObject)ZERO_INTEGER;
                module0642.f39020(module0015.$g431$.getGlobalValue());
                module0642.f39020(module0015.$g440$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var11);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var13) {
                    module0642.f39020(module0015.$g437$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var13);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                if (NIL != var12) {
                    module0642.f39020(module0015.$g438$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049(var12));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                if (NIL != var14) {
                    module0642.f39020(module0015.$g439$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var14);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_245 = module0015.$g533$.currentBinding(var8);
                try {
                    module0015.$g533$.bind((SubLObject)T, var8);
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
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        SubLObject var2 = (SubLObject)NIL;
        if (NIL != var1) {
            var2 = module0213.f13917(var1.first());
        }
        f45958(var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45958(final SubLObject var246) {
        final SubLThread var247 = SubLProcess.currentSubLThread();
        final SubLObject var248 = (SubLObject)$ic162$;
        final SubLObject var249 = module0015.$g538$.currentBinding(var247);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var247))) ? module0015.$g538$.getDynamicValue(var247) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var247);
            module0642.f39020((SubLObject)$ic24$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var247), module0655.$g5142$.getDynamicValue(var247));
            final SubLObject var250 = module0014.f672((SubLObject)$ic25$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic26$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var250) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var250);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic27$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var248) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var248);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var10_248 = module0015.$g535$.currentBinding(var247);
            try {
                module0015.$g535$.bind((SubLObject)T, var247);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var247)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var247)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic28$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_249 = module0015.$g533$.currentBinding(var247);
                try {
                    module0015.$g533$.bind((SubLObject)T, var247);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic29$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_250 = module0015.$g533$.currentBinding(var247);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var247);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic30$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic31$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic177$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var10_250, var247);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var248) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var248);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    var247.resetMultipleValues();
                    final SubLObject var251 = f45959(var246);
                    final SubLObject var252 = var247.secondMultipleValue();
                    var247.resetMultipleValues();
                    if (NIL != module0079.f5404(var251)) {
                        f45960(var252, var251);
                    }
                    else {
                        f45961();
                    }
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var10_249, var247);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var10_248, var247);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var249, var247);
        }
        return var246;
    }
    
    public static SubLObject f45959(final SubLObject var246) {
        SubLObject var247 = (SubLObject)NIL;
        SubLObject var248 = (SubLObject)NIL;
        var247 = module0737.f45538();
        SubLObject var249 = var246;
        SubLObject var250 = (SubLObject)NIL;
        var250 = var249.first();
        while (NIL != var249) {
            SubLObject var251 = (SubLObject)NIL;
            final SubLObject var252 = module0737.$g5846$.getGlobalValue();
            SubLObject var253 = (SubLObject)NIL;
            try {
                var253 = Locks.seize_lock(var252);
                var251 = module0079.f5414(var247, var250, (SubLObject)UNPROVIDED);
            }
            finally {
                if (NIL != var253) {
                    Locks.release_lock(var252);
                }
            }
            if (NIL == module0079.f5404(var251)) {
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
        if (NIL != var9) {
            module0642.f39020(module0015.$g222$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39042(var9));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var10 = module0015.$g533$.currentBinding(var8);
        try {
            module0015.$g533$.bind((SubLObject)T, var8);
            module0642.f39019((SubLObject)$ic178$);
        }
        finally {
            module0015.$g533$.rebind(var10, var8);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0642.f39020(module0015.$g210$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45960(final SubLObject var246, final SubLObject var259) {
        final SubLThread var260 = SubLProcess.currentSubLThread();
        SubLObject var261 = (SubLObject)NIL;
        final SubLObject var262 = module0737.$g5846$.getGlobalValue();
        SubLObject var263 = (SubLObject)NIL;
        try {
            var263 = Locks.seize_lock(var262);
            var261 = module0079.f5433(var259);
        }
        finally {
            if (NIL != var263) {
                Locks.release_lock(var262);
            }
        }
        final SubLObject var264 = f45962(var261);
        final SubLObject var265 = Sort.sort(var264, (SubLObject)$ic179$, (SubLObject)UNPROVIDED);
        if (NIL != module0035.f2002(var265, $g5890$.getDynamicValue(var260), (SubLObject)UNPROVIDED)) {
            return f45963(var246, var259, f45964(var265, (SubLObject)ONE_INTEGER));
        }
        return f45965(var246, var259, var265);
    }
    
    public static SubLObject f45963(final SubLObject var246, final SubLObject var259, final SubLObject var265) {
        final SubLThread var266 = SubLProcess.currentSubLThread();
        f45966(var246);
        f45967(var259);
        module0642.f39020(module0015.$g189$.getGlobalValue());
        module0642.f39020((SubLObject)THREE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic180$);
        module0642.f39020(module0015.$g190$.getGlobalValue());
        module0642.f39020((SubLObject)THREE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g199$.getGlobalValue());
        module0642.f39019((SubLObject)$ic181$);
        module0642.f39019((SubLObject)$ic182$);
        module0642.f39019((SubLObject)$ic183$);
        module0642.f39020(module0015.$g200$.getGlobalValue());
        module0642.f39020(module0015.$g189$.getGlobalValue());
        module0642.f39020((SubLObject)FOUR_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic184$);
        module0642.f39020(module0015.$g190$.getGlobalValue());
        module0642.f39020((SubLObject)FOUR_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        f45968(var265);
        if (NIL != $g5889$.getDynamicValue(var266)) {
            final SubLObject var267 = conses_high.getf($g5889$.getDynamicValue(var266), (SubLObject)$ic185$, (SubLObject)UNPROVIDED);
            final SubLObject var268 = conses_high.getf($g5889$.getDynamicValue(var266), (SubLObject)$ic186$, (SubLObject)UNPROVIDED);
            final SubLObject var269 = f45969(var265, var267, var268);
            module0642.f39020(module0015.$g189$.getGlobalValue());
            module0642.f39020((SubLObject)FOUR_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            PrintLow.format(module0015.$g131$.getDynamicValue(var266), (SubLObject)$ic187$, f45970(var267, var268));
            module0642.f39020(module0015.$g190$.getGlobalValue());
            module0642.f39020((SubLObject)FOUR_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g199$.getGlobalValue());
            module0642.f39019((SubLObject)$ic188$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_hash, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic189$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var270 = module0015.$g533$.currentBinding(var266);
            try {
                module0015.$g533$.bind((SubLObject)T, var266);
                module0642.f39019((SubLObject)$ic190$);
            }
            finally {
                module0015.$g533$.rebind(var270, var266);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
            module0642.f39019((SubLObject)$ic191$);
            module0642.f39020(module0015.$g200$.getGlobalValue());
            f45971(var246, var259, var269);
        }
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g384$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic189$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var271 = module0015.$g533$.currentBinding(var266);
        try {
            module0015.$g533$.bind((SubLObject)T, var266);
            module0642.f39020(module0015.$g189$.getGlobalValue());
            module0642.f39020((SubLObject)FOUR_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0642.f39019((SubLObject)$ic192$);
            module0642.f39020(module0015.$g190$.getGlobalValue());
            module0642.f39020((SubLObject)FOUR_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
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
        SubLObject var268 = (SubLObject)NIL;
        var268 = var267.first();
        while (NIL != var267) {
            final SubLObject var269 = conses_high.getf(var268, (SubLObject)$ic185$, (SubLObject)UNPROVIDED);
            if (NIL != module0004.f104(var269, $g5892$.getGlobalValue(), (SubLObject)$ic196$, (SubLObject)UNPROVIDED)) {
                module0642.f39026((SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_hash, (SubLObject)UNPROVIDED);
            module0642.f39020(var269);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var270 = module0015.$g533$.currentBinding(var266);
            try {
                module0015.$g533$.bind((SubLObject)T, var266);
                module0642.f39019((SubLObject)$ic197$);
                module0642.f39019(var269);
                module0642.f39019((SubLObject)$ic198$);
            }
            finally {
                module0015.$g533$.rebind(var270, var266);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
            if (NIL != module0004.f104(var269, $g5893$.getGlobalValue(), (SubLObject)$ic196$, (SubLObject)UNPROVIDED)) {
                module0642.f39026((SubLObject)UNPROVIDED);
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
        SubLObject var273 = (SubLObject)NIL;
        var273 = var272.first();
        while (NIL != var272) {
            final SubLObject var274 = conses_high.getf(var273, (SubLObject)$ic185$, (SubLObject)UNPROVIDED);
            final SubLObject var275 = conses_high.getf(var273, (SubLObject)$ic186$, (SubLObject)UNPROVIDED);
            final SubLObject var276 = conses_high.getf(var273, (SubLObject)$ic199$, (SubLObject)UNPROVIDED);
            if (var271.numL(var275)) {
                return (SubLObject)NIL;
            }
            if (NIL != Strings.stringL(var270, var274, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)NIL;
            }
            if (var271.numE(var275) && NIL != Strings.stringE(var270, var274, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return var276;
            }
            if (var276.first().isCons()) {
                final SubLObject var277 = f45969(var276, var270, var271);
                if (NIL != var277) {
                    return var277;
                }
            }
            var272 = var272.rest();
            var273 = var272.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45972(final SubLObject var246, final SubLObject var259, final SubLObject var265) {
        final SubLThread var266 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g262$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var267 = module0015.$g533$.currentBinding(var266);
        try {
            module0015.$g533$.bind((SubLObject)T, var266);
            SubLObject var268 = var265;
            SubLObject var269 = (SubLObject)NIL;
            var269 = var268.first();
            while (NIL != var268) {
                final SubLObject var270 = conses_high.getf(var269, (SubLObject)$ic185$, (SubLObject)UNPROVIDED);
                final SubLObject var271 = conses_high.getf(var269, (SubLObject)$ic186$, (SubLObject)UNPROVIDED);
                final SubLObject var272 = conses_high.getf(var269, (SubLObject)$ic199$, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g275$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_273 = module0015.$g533$.currentBinding(var266);
                try {
                    module0015.$g533$.bind((SubLObject)T, var266);
                    if (ONE_INTEGER.numE(var271)) {
                        module0642.f39020(module0015.$g381$.getGlobalValue());
                        if (NIL != var270) {
                            module0642.f39020(module0015.$g384$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var270);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var10_274 = module0015.$g533$.currentBinding(var266);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var266);
                        }
                        finally {
                            module0015.$g533$.rebind(var10_274, var266);
                        }
                        module0642.f39020(module0015.$g382$.getGlobalValue());
                    }
                    module0656.f39837((SubLObject)$ic200$, var246, var270, var271, Sequences.cconcatenate((SubLObject)$ic197$, new SubLObject[] { module0006.f203(var270), $ic201$ }), (SubLObject)UNPROVIDED);
                    if (var272.first().isString()) {
                        PrintLow.format(module0015.$g131$.getDynamicValue(var266), (SubLObject)$ic202$, Sequences.length(var272));
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
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        final SubLThread var268 = SubLProcess.currentSubLThread();
        if (NIL == var7) {
            var7 = (SubLObject)$ic203$;
        }
        final SubLObject var269 = module0656.f39832((SubLObject)$ic49$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var268), (SubLObject)$ic204$, module0213.f13918((SubLObject)ConsesLow.list((SubLObject)$ic205$, var246, (SubLObject)$ic185$, var266, (SubLObject)$ic186$, var267)));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var269) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var269);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var270 = module0015.$g533$.currentBinding(var268);
        try {
            module0015.$g533$.bind((SubLObject)T, var268);
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
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = var5;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var282_283 = (SubLObject)NIL;
        while (NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var4, (SubLObject)$ic207$);
            var282_283 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var4, (SubLObject)$ic207$);
            if (NIL == conses_high.member(var282_283, (SubLObject)$ic208$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var8 = (SubLObject)T;
            }
            if (var282_283 == $ic209$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (NIL != var8 && NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic207$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)$ic205$, var5);
        final SubLObject var10 = (SubLObject)((NIL != var9) ? conses_high.cadr(var9) : NIL);
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic185$, var5);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic186$, var5);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        $g5889$.setDynamicValue(var3);
        return f45958(var10);
    }
    
    public static SubLObject f45965(final SubLObject var246, final SubLObject var259, final SubLObject var264) {
        f45966(var246);
        f45967(var259);
        module0642.f39020(module0015.$g189$.getGlobalValue());
        module0642.f39020((SubLObject)THREE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic211$);
        module0642.f39020(module0015.$g190$.getGlobalValue());
        module0642.f39020((SubLObject)THREE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        f45971(var246, var259, var264);
        return var259;
    }
    
    public static SubLObject f45971(final SubLObject var246, final SubLObject var259, final SubLObject var264) {
        final SubLThread var265 = SubLProcess.currentSubLThread();
        SubLObject var266 = (SubLObject)NIL;
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var267 = module0015.$g533$.currentBinding(var265);
        try {
            module0015.$g533$.bind((SubLObject)T, var265);
            SubLObject var268 = var264;
            SubLObject var269 = (SubLObject)NIL;
            var269 = var268.first();
            while (NIL != var268) {
                final SubLObject var270 = module0737.$g5846$.getGlobalValue();
                SubLObject var271 = (SubLObject)NIL;
                try {
                    var271 = Locks.seize_lock(var270);
                    var266 = module0079.f5414(var259, var269, (SubLObject)UNPROVIDED);
                }
                finally {
                    if (NIL != var271) {
                        Locks.release_lock(var270);
                    }
                }
                final SubLObject var272 = (SubLObject)makeBoolean(NIL == module0079.f5404(var266));
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_292 = module0015.$g533$.currentBinding(var265);
                try {
                    module0015.$g533$.bind((SubLObject)T, var265);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic212$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic57$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_293 = module0015.$g533$.currentBinding(var265);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var265);
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        if (NIL != var272) {
                            final SubLObject var273 = var266.first();
                            f45975(var273);
                        }
                        else {
                            final SubLObject var273 = Sequences.cconcatenate(var246, (SubLObject)ConsesLow.list(var269));
                            module0656.f39837((SubLObject)$ic213$, var273, Sequences.cconcatenate((SubLObject)$ic197$, new SubLObject[] { module0006.f203(var269), $ic201$ }), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var10_293, var265);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic212$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic57$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_294 = module0015.$g533$.currentBinding(var265);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var265);
                        if (NIL != var272) {
                            f45976(var266, (SubLObject)UNPROVIDED);
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
                module0642.f39029((SubLObject)UNPROVIDED);
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
        SubLObject var261 = (SubLObject)NIL;
        final SubLObject var262 = module0737.$g5846$.getGlobalValue();
        SubLObject var263 = (SubLObject)NIL;
        try {
            var263 = Locks.seize_lock(var262);
            var261 = module0079.f5414(var259, module0087.$g1177$.getGlobalValue(), (SubLObject)NIL);
        }
        finally {
            if (NIL != var263) {
                Locks.release_lock(var262);
            }
        }
        if (NIL != module0035.sublisp_boolean(var261)) {
            final SubLObject var264 = var261.first();
            module0642.f39020(module0015.$g189$.getGlobalValue());
            module0642.f39020((SubLObject)THREE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0642.f39019((SubLObject)$ic214$);
            f45975(var264);
            module0642.f39020(module0015.$g190$.getGlobalValue());
            module0642.f39020((SubLObject)THREE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g185$.getGlobalValue());
            f45976(var261, $g5891$.getDynamicValue(var260));
            module0642.f39020(module0015.$g186$.getGlobalValue());
        }
        return var259;
    }
    
    public static SubLObject f45966(final SubLObject var246) {
        module0642.f39020(module0015.$g189$.getGlobalValue());
        module0642.f39020((SubLObject)TWO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0656.f39837((SubLObject)$ic161$, (SubLObject)$ic215$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var247 = (SubLObject)NIL;
        SubLObject var248 = (SubLObject)NIL;
        SubLObject var249 = (SubLObject)NIL;
        var247 = var246;
        var248 = var247.first();
        for (var249 = (SubLObject)ZERO_INTEGER; NIL != var247; var247 = var247.rest(), var248 = var247.first(), var249 = Numbers.add((SubLObject)ONE_INTEGER, var249)) {
            module0642.f39019((SubLObject)$ic216$);
            final SubLObject var250 = Sequences.subseq(var246, (SubLObject)ZERO_INTEGER, Numbers.add((SubLObject)ONE_INTEGER, var249));
            module0656.f39837((SubLObject)$ic213$, var250, var248, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g190$.getGlobalValue());
        module0642.f39020((SubLObject)TWO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        f45978();
        return var246;
    }
    
    public static SubLObject f45978() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = module0656.f39832((SubLObject)NIL);
        module0642.f39020(module0015.$g282$.getGlobalValue());
        module0642.f39020(module0015.$g284$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0110.$g570$.getDynamicValue(var8));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g285$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic217$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var9) {
            module0642.f39020(module0015.$g286$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var9);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var10 = module0015.$g533$.currentBinding(var8);
        final SubLObject var11 = module0015.$g541$.currentBinding(var8);
        final SubLObject var12 = module0015.$g539$.currentBinding(var8);
        try {
            module0015.$g533$.bind((SubLObject)T, var8);
            module0015.$g541$.bind((SubLObject)T, var8);
            module0015.$g539$.bind(module0015.f797(), var8);
            module0642.f39069((SubLObject)$ic218$, (SubLObject)T, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39020(module0015.$g351$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic98$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g352$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var10_301 = module0015.$g533$.currentBinding(var8);
            try {
                module0015.$g533$.bind((SubLObject)T, var8);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_302 = module0015.$g533$.currentBinding(var8);
                try {
                    module0015.$g533$.bind((SubLObject)T, var8);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic98$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic57$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_303 = module0015.$g533$.currentBinding(var8);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var8);
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic219$);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var10_303, var8);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic98$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic57$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_304 = module0015.$g533$.currentBinding(var8);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var8);
                        module0642.f39075((SubLObject)$ic220$, (SubLObject)$ic23$, (SubLObject)$ic221$);
                    }
                    finally {
                        module0015.$g533$.rebind(var10_304, var8);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic98$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic57$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_305 = module0015.$g533$.currentBinding(var8);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var8);
                        module0642.f39074((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                module0642.f39029((SubLObject)UNPROVIDED);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45979(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0642.f39111((SubLObject)$ic220$, var1, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0737.f45340(var3);
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = var4;
        SubLObject var7 = (SubLObject)NIL;
        var7 = var6.first();
        while (NIL != var6) {
            var2.resetMultipleValues();
            final SubLObject var8 = f45959(var7);
            final SubLObject var9 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            if (NIL != module0079.f5404(var8) && NIL != var9) {
                var5 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic222$, var7, (SubLObject)$ic223$, var9), var5);
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        if (NIL == var5) {
            final SubLObject var10 = (SubLObject)$ic162$;
            final SubLObject var11 = module0015.$g538$.currentBinding(var2);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var2);
                module0642.f39020((SubLObject)$ic24$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
                final SubLObject var12 = module0014.f672((SubLObject)$ic25$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic26$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var12) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var12);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic27$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0016.f941();
                if (NIL != var10) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var10);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var10_310 = module0015.$g535$.currentBinding(var2);
                try {
                    module0015.$g535$.bind((SubLObject)T, var2);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var2)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic28$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_311 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic29$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var10_312 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var2);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic30$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic31$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic177$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var10_312, var2);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (NIL != var10) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            module0642.f39019(var10);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g199$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic224$);
                        module0642.f39020(module0015.$g200$.getGlobalValue());
                        module0642.f39020(module0015.$g185$.getGlobalValue());
                        module0642.f39019(var3);
                        module0642.f39020(module0015.$g186$.getGlobalValue());
                        module0642.f39020(module0015.$g199$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic225$);
                        module0642.f39020(module0015.$g200$.getGlobalValue());
                        module0642.f39026((SubLObject)UNPROVIDED);
                        f45978();
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var10_311, var2);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var10_310, var2);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var11, var2);
            }
        }
        else {
            if (NIL != module0035.f1995(var5, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
                final SubLObject var13 = var5.first();
                final SubLObject var14 = conses_high.getf(var13, (SubLObject)$ic223$, (SubLObject)UNPROVIDED);
                return f45958(var14);
            }
            final SubLObject var10 = (SubLObject)$ic162$;
            final SubLObject var11 = module0015.$g538$.currentBinding(var2);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var2);
                module0642.f39020((SubLObject)$ic24$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
                final SubLObject var12 = module0014.f672((SubLObject)$ic25$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic26$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var12) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var12);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic27$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0016.f941();
                if (NIL != var10) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var10);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var10_313 = module0015.$g535$.currentBinding(var2);
                try {
                    module0015.$g535$.bind((SubLObject)T, var2);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var2)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic28$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_314 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic29$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var10_315 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var2);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic30$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic31$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic177$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var10_315, var2);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (NIL != var10) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            module0642.f39019(var10);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g199$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic224$);
                        module0642.f39020(module0015.$g200$.getGlobalValue());
                        module0642.f39020(module0015.$g185$.getGlobalValue());
                        module0642.f39019(var3);
                        module0642.f39020(module0015.$g186$.getGlobalValue());
                        module0642.f39020(module0015.$g199$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic226$);
                        module0642.f39020(module0015.$g200$.getGlobalValue());
                        module0642.f39020(module0015.$g264$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var10_316 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var2);
                            SubLObject var15 = var5;
                            SubLObject var16 = (SubLObject)NIL;
                            var16 = var15.first();
                            while (NIL != var15) {
                                module0642.f39020(module0015.$g275$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var10_317 = module0015.$g533$.currentBinding(var2);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var2);
                                    final SubLObject var18;
                                    final SubLObject var17 = var18 = var16;
                                    SubLObject var19 = (SubLObject)NIL;
                                    SubLObject var20 = var18;
                                    SubLObject var21 = (SubLObject)NIL;
                                    SubLObject var324_325 = (SubLObject)NIL;
                                    while (NIL != var20) {
                                        cdestructuring_bind.destructuring_bind_must_consp(var20, var17, (SubLObject)$ic227$);
                                        var324_325 = var20.first();
                                        var20 = var20.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var20, var17, (SubLObject)$ic227$);
                                        if (NIL == conses_high.member(var324_325, (SubLObject)$ic228$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                            var21 = (SubLObject)T;
                                        }
                                        if (var324_325 == $ic209$) {
                                            var19 = var20.first();
                                        }
                                        var20 = var20.rest();
                                    }
                                    if (NIL != var21 && NIL == var19) {
                                        cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)$ic227$);
                                    }
                                    final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)$ic222$, var18);
                                    final SubLObject var23 = (SubLObject)((NIL != var22) ? conses_high.cadr(var22) : NIL);
                                    final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)$ic223$, var18);
                                    final SubLObject var25 = (SubLObject)((NIL != var24) ? conses_high.cadr(var24) : NIL);
                                    module0642.f39020(module0015.$g209$.getGlobalValue());
                                    f45975(var25);
                                    module0642.f39020(module0015.$g210$.getGlobalValue());
                                    final SubLObject var26 = Numbers.subtract(Sequences.length(var23), Sequences.length(var25));
                                    final SubLObject var27 = conses_high.last(var23, var26);
                                    f45975(var27);
                                    module0642.f39032((SubLObject)UNPROVIDED);
                                    module0656.f39837((SubLObject)$ic213$, var25, (SubLObject)$ic229$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var10_314, var2);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var10_313, var2);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var11, var2);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45975(final SubLObject var246) {
        SubLObject var247 = var246;
        SubLObject var248 = (SubLObject)NIL;
        var248 = var247.first();
        while (NIL != var247) {
            module0642.f39019((SubLObject)Characters.CHAR_quotation);
            module0642.f39019(var248);
            module0642.f39019((SubLObject)Characters.CHAR_quotation);
            module0642.f39032((SubLObject)UNPROVIDED);
            var247 = var247.rest();
            var248 = var247.first();
        }
        return var246;
    }
    
    public static SubLObject f45964(final SubLObject var264, SubLObject var267) {
        if (var267 == UNPROVIDED) {
            var267 = (SubLObject)ONE_INTEGER;
        }
        final SubLThread var268 = SubLProcess.currentSubLThread();
        SubLObject var269 = var264.first();
        final SubLObject var270 = var264.rest();
        SubLObject var271 = (SubLObject)ConsesLow.list(var269);
        SubLObject var272 = (SubLObject)NIL;
        SubLObject var273 = var270;
        SubLObject var274 = (SubLObject)NIL;
        var274 = var273.first();
        while (NIL != var273) {
            if (NIL != f45980(var269, var274, var267)) {
                var271 = (SubLObject)ConsesLow.cons(var274, var271);
            }
            else {
                if (NIL != var271) {
                    var271 = Sequences.nreverse(var271);
                    if (NIL != module0035.f2002(var271, $g5890$.getDynamicValue(var268), (SubLObject)UNPROVIDED)) {
                        var271 = f45964(var271, Numbers.add(var267, (SubLObject)ONE_INTEGER));
                    }
                    final SubLObject var275 = f45981(var271);
                    final SubLObject var276 = Numbers.min(Sequences.length(var275), var267);
                    final SubLObject var277 = Strings.string_upcase(module0038.f2623(var275, (SubLObject)ZERO_INTEGER, var276), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var272 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic185$, var277, (SubLObject)$ic186$, var267, (SubLObject)$ic199$, var271), var272);
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
        if ($ic185$ == var270) {
            return f45981(conses_high.getf(var269, (SubLObject)$ic199$, (SubLObject)UNPROVIDED));
        }
        if (var270.isCons()) {
            return f45981(var269.first());
        }
        Errors.error((SubLObject)$ic231$, var269);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45980(final SubLObject var330, final SubLObject var288, final SubLObject var267) {
        final SubLObject var331 = f45970(var330, var267);
        final SubLObject var332 = f45970(var288, var267);
        return Strings.string_equal(var331, var332, (SubLObject)ZERO_INTEGER, var267, (SubLObject)ZERO_INTEGER, var267);
    }
    
    public static SubLObject f45970(final SubLObject var288, final SubLObject var267) {
        final SubLObject var289 = Numbers.subtract(Sequences.length(var288), var267);
        if (var289.isNegative()) {
            final SubLObject var290 = Strings.make_string(var267, (SubLObject)Characters.CHAR_space);
            SubLObject var291 = (SubLObject)ZERO_INTEGER;
            SubLObject var339_340;
            SubLObject var292;
            SubLObject var293;
            SubLObject var294;
            for (var292 = (var339_340 = Sequences.length(var288)), var293 = (SubLObject)NIL, var293 = (SubLObject)ZERO_INTEGER; !var293.numGE(var339_340); var293 = module0048.f_1X(var293)) {
                var294 = Strings.sublisp_char(var288, var293);
                Strings.set_char(var290, var291, var294);
                var291 = Numbers.add(var291, (SubLObject)ONE_INTEGER);
            }
            return var290;
        }
        return var288;
    }
    
    public static SubLObject f45962(final SubLObject var331) {
        return module0035.delete_if_not((SubLObject)$ic232$, var331, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f45977(final SubLObject var288, final SubLObject var287) {
        final SubLThread var289 = SubLProcess.currentSubLThread();
        SubLObject var290 = (SubLObject)MINUS_ONE_INTEGER;
        final SubLObject var291 = module0737.$g5846$.getGlobalValue();
        SubLObject var292 = (SubLObject)NIL;
        try {
            var292 = Locks.seize_lock(var291);
            var290 = module0079.f5406(var287);
        }
        finally {
            if (NIL != var292) {
                Locks.release_lock(var291);
            }
        }
        module0642.f39020(module0015.$g230$.getGlobalValue());
        module0642.f39019((SubLObject)$ic233$);
        module0642.f39019(var290);
        PrintLow.format(module0015.$g131$.getDynamicValue(var289), (SubLObject)$ic234$, (SubLObject)(ONE_INTEGER.numE(var290) ? $ic23$ : $ic235$));
        module0642.f39020(module0015.$g231$.getGlobalValue());
        return var288;
    }
    
    public static SubLObject f45976(final SubLObject var287, SubLObject var345) {
        if (var345 == UNPROVIDED) {
            var345 = (SubLObject)NIL;
        }
        final SubLThread var346 = SubLProcess.currentSubLThread();
        final SubLObject var347 = var287.rest();
        final SubLObject var348 = var345.first();
        SubLObject var349 = (SubLObject)(var348.isString() ? Sequences.cconcatenate((SubLObject)$ic236$, module0006.f203(var348)) : $ic23$);
        final SubLObject var350 = conses_high.second(var345);
        SubLObject var351 = (SubLObject)(var350.isString() ? Sequences.cconcatenate((SubLObject)$ic236$, module0006.f203(var350)) : $ic23$);
        SubLObject var352 = (SubLObject)NIL;
        SubLObject var353 = (SubLObject)NIL;
        SubLObject var354 = (SubLObject)NIL;
        var352 = var347;
        var353 = var352.first();
        for (var354 = (SubLObject)ZERO_INTEGER; NIL != var352; var352 = var352.rest(), var353 = var352.first(), var354 = Numbers.add((SubLObject)ONE_INTEGER, var354)) {
            if (var354.isPositive()) {
                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g144$.getGlobalValue());
            module0642.f39020(module0015.$g147$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var349);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var355 = module0015.$g533$.currentBinding(var346);
            try {
                module0015.$g533$.bind((SubLObject)T, var346);
                if (NIL != module0737.f45321(var353, (SubLObject)UNPROVIDED)) {
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39020(module0015.$g352$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_352 = module0015.$g533$.currentBinding(var346);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var346);
                        final SubLObject var356 = module0737.f45400(var353);
                        final SubLObject var357 = module0737.f45379(var353);
                        f45982(var356, (SubLObject)$ic237$);
                        f45982(var357, (SubLObject)$ic238$);
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
        if (NIL != module0077.f5302(var356) && NIL == module0077.f5318(var356)) {
            SubLObject var359 = module0077.f5312(var356);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var360 = module0015.$g533$.currentBinding(var358);
            try {
                module0015.$g533$.bind((SubLObject)T, var358);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic212$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic57$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_358 = module0015.$g533$.currentBinding(var358);
                try {
                    module0015.$g533$.bind((SubLObject)T, var358);
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
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic212$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic57$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var10_359 = module0015.$g533$.currentBinding(var358);
                try {
                    module0015.$g533$.bind((SubLObject)T, var358);
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
            module0642.f39029((SubLObject)UNPROVIDED);
            SubLObject var361;
            var359 = (var361 = var359.rest());
            SubLObject var362 = (SubLObject)NIL;
            var362 = var361.first();
            while (NIL != var361) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var363 = module0015.$g533$.currentBinding(var358);
                try {
                    module0015.$g533$.bind((SubLObject)T, var358);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_360 = module0015.$g533$.currentBinding(var358);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var358);
                    }
                    finally {
                        module0015.$g533$.rebind(var10_360, var358);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic212$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic57$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var10_361 = module0015.$g533$.currentBinding(var358);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var358);
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
                module0642.f39029((SubLObject)UNPROVIDED);
                var361 = var361.rest();
                var362 = var361.first();
            }
        }
        return var356;
    }
    
    public static SubLObject f45983(final SubLObject var351) {
        if (NIL != assertion_handles_oc.f11035(var351)) {
            module0656.f39916(var351, (SubLObject)T, (SubLObject)T);
        }
        else {
            module0656.f39804(var351, (SubLObject)ZERO_INTEGER, (SubLObject)T);
        }
        return var351;
    }
    
    public static SubLObject f45984(final SubLObject var1) {
        $g5889$.setDynamicValue((SubLObject)NIL);
        return f45957(var1);
    }
    
    public static SubLObject f45985(final SubLObject var246, SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        final SubLThread var247 = SubLProcess.currentSubLThread();
        if (NIL == var7) {
            var7 = (SubLObject)$ic240$;
        }
        final SubLObject var248 = module0656.f39832((SubLObject)$ic49$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var247), (SubLObject)$ic241$, module0213.f13918(var246));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var248) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var248);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var249 = module0015.$g533$.currentBinding(var247);
        try {
            module0015.$g533$.bind((SubLObject)T, var247);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45987() {
        $g5885$ = SubLFiles.defvar("S#50228", (SubLObject)NIL);
        $g5886$ = SubLFiles.deflexical("S#50229", (SubLObject)$ic91$);
        $g5887$ = SubLFiles.deflexical("S#50230", (SubLObject)$ic92$);
        $g5888$ = SubLFiles.deflexical("S#50231", (SubLObject)$ic93$);
        $g5889$ = SubLFiles.defparameter("S#50232", (SubLObject)NIL);
        $g5890$ = SubLFiles.defparameter("S#50233", (SubLObject)$ic169$);
        $g5891$ = SubLFiles.defparameter("S#50234", (SubLObject)ConsesLow.list((SubLObject)$ic171$, (SubLObject)$ic172$));
        $g5892$ = SubLFiles.deflexical("S#50235", (SubLObject)ConsesLow.list((SubLObject)$ic193$, (SubLObject)$ic194$));
        $g5893$ = SubLFiles.deflexical("S#50236", (SubLObject)ConsesLow.list((SubLObject)$ic195$));
        $g5894$ = SubLFiles.defparameter("S#50237", (SubLObject)$ic23$);
        $g5895$ = SubLFiles.defparameter("S#50238", (SubLObject)$ic244$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45988() {
        module0012.f441((SubLObject)$ic0$);
        module0012.f444((SubLObject)$ic0$);
        module0015.f873((SubLObject)$ic3$);
        module0656.f39840((SubLObject)$ic8$, (SubLObject)$ic9$, (SubLObject)THREE_INTEGER);
        module0015.f873((SubLObject)$ic10$);
        module0656.f39840((SubLObject)$ic13$, (SubLObject)$ic14$, (SubLObject)ONE_INTEGER);
        module0656.f39840((SubLObject)$ic41$, (SubLObject)$ic45$, (SubLObject)THREE_INTEGER);
        module0015.f873((SubLObject)$ic47$);
        module0656.f39840((SubLObject)$ic36$, (SubLObject)$ic51$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic62$);
        Hashtables.sethash((SubLObject)$ic105$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic115$, (SubLObject)$ic116$));
        Hashtables.sethash((SubLObject)$ic104$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic117$, (SubLObject)$ic118$));
        Hashtables.sethash((SubLObject)$ic119$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic120$, (SubLObject)$ic121$));
        Hashtables.sethash((SubLObject)$ic122$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic123$, (SubLObject)$ic124$));
        Hashtables.sethash((SubLObject)$ic125$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic126$, (SubLObject)$ic127$));
        Hashtables.sethash((SubLObject)$ic128$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic129$, (SubLObject)$ic130$));
        Hashtables.sethash((SubLObject)$ic131$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic132$, (SubLObject)$ic133$));
        module0656.f39819((SubLObject)$ic161$, (SubLObject)$ic162$, (SubLObject)$ic163$, (SubLObject)$ic164$);
        module0656.f39840((SubLObject)$ic161$, (SubLObject)$ic167$, (SubLObject)ONE_INTEGER);
        module0012.f441((SubLObject)$ic168$);
        module0012.f441((SubLObject)$ic170$);
        module0012.f441((SubLObject)$ic173$);
        module0015.f873((SubLObject)$ic174$);
        module0656.f39840((SubLObject)$ic200$, (SubLObject)$ic206$, (SubLObject)FOUR_INTEGER);
        module0015.f873((SubLObject)$ic210$);
        module0015.f873((SubLObject)$ic230$);
        module0015.f873((SubLObject)$ic239$);
        module0656.f39840((SubLObject)$ic213$, (SubLObject)$ic242$, (SubLObject)TWO_INTEGER);
        module0012.f441((SubLObject)$ic243$);
        module0012.f441((SubLObject)$ic245$);
        return (SubLObject)NIL;
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
        $g5885$ = null;
        $g5886$ = null;
        $g5887$ = null;
        $g5888$ = null;
        $g5889$ = null;
        $g5890$ = null;
        $g5891$ = null;
        $g5892$ = null;
        $g5893$ = null;
        $g5894$ = null;
        $g5895$ = null;
        $ic0$ = makeSymbol("S#50228", "CYC");
        $ic1$ = ConsesLow.list((SubLObject)makeSymbol("S#44996", "CYC"));
        $ic2$ = makeString("Could not determine a term from ~a");
        $ic3$ = makeSymbol("CB-C-LEXICAL");
        $ic4$ = makeString("Lexical Info");
        $ic5$ = makeKeyword("CONTENT");
        $ic6$ = makeString("cb-c-lexical&~A");
        $ic7$ = makeString(" (~a)");
        $ic8$ = makeKeyword("LEXICAL");
        $ic9$ = makeSymbol("S#50171", "CYC");
        $ic10$ = makeSymbol("CB-C-VERBOSE-LEXICAL");
        $ic11$ = makeString("cb-c-verbose-lexical&~A");
        $ic12$ = makeString("[Verbose Lexical Info]");
        $ic13$ = makeKeyword("VERBOSE-LEXICAL");
        $ic14$ = makeSymbol("S#50172", "CYC");
        $ic15$ = makeString("No lexical information found.");
        $ic16$ = makeSymbol("S#12762", "CYC");
        $ic17$ = makeSymbol("STRING<");
        $ic18$ = makeSymbol("S#50200", "CYC");
        $ic19$ = makeSymbol("S#50199", "CYC");
        $ic20$ = makeSymbol("S#50201", "CYC");
        $ic21$ = makeString("~ALexical info for ~S");
        $ic22$ = makeString("Verbose ");
        $ic23$ = makeString("");
        $ic24$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic25$ = makeKeyword("CB-CYC");
        $ic26$ = makeString("stylesheet");
        $ic27$ = makeString("text/css");
        $ic28$ = makeString("yui-skin-sam");
        $ic29$ = makeString("reloadFrameButton");
        $ic30$ = makeString("button");
        $ic31$ = makeString("reload");
        $ic32$ = makeString("Refresh");
        $ic33$ = makeString("reloadCurrentFrame('reloadFrameButton');");
        $ic34$ = makeString("Additional lexical links:");
        $ic35$ = makeString("To see documentation on NL generation functions: ");
        $ic36$ = makeKeyword("GEN-FUNCTION-DOCUMENTATION");
        $ic37$ = makeString("This term is not sufficiently lexified: ");
        $ic38$ = makeString("To add more lexical assertions: ");
        $ic39$ = makeKeyword("LEXIFY-TERM");
        $ic40$ = makeString("To clear lexical caches for this term: ");
        $ic41$ = makeKeyword("CLEAR-LEXICAL-CACHES");
        $ic42$ = makeString("To see more: ");
        $ic43$ = makeString("[Clear Lexical Caches]");
        $ic44$ = makeString("clear-lexical-caches-for-term-with-id&~A&~A");
        $ic45$ = makeSymbol("S#50179", "CYC");
        $ic46$ = ConsesLow.list((SubLObject)makeSymbol("S#44996", "CYC"), (SubLObject)makeSymbol("S#50239", "CYC"));
        $ic47$ = makeSymbol("CLEAR-LEXICAL-CACHES-FOR-TERM-WITH-ID");
        $ic48$ = makeString("[Function Documentation]");
        $ic49$ = makeKeyword("MAIN");
        $ic50$ = makeString("show-generation-function-documentation");
        $ic51$ = makeSymbol("S#50180", "CYC");
        $ic52$ = makeString("NL Generation Function Documentation");
        $ic53$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#48573", "CYC"), (SubLObject)makeSymbol("S#811", "CYC"));
        $ic54$ = makeString("~A");
        $ic55$ = makeString(" &lang;mentioned in code&rang;");
        $ic56$ = makeKeyword("RIGHT");
        $ic57$ = makeKeyword("TOP");
        $ic58$ = makeInteger(80);
        $ic59$ = makeString(":");
        $ic60$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("comment")), constant_handles_oc.f8479((SubLObject)makeString("expansion")), constant_handles_oc.f8479((SubLObject)makeString("cyclistNotes")), constant_handles_oc.f8479((SubLObject)makeString("exampleAssertions")), constant_handles_oc.f8479((SubLObject)makeString("exampleSentences")), constant_handles_oc.f8479((SubLObject)makeString("exampleNATs")));
        $ic61$ = makeKeyword("SELF");
        $ic62$ = makeSymbol("SHOW-GENERATION-FUNCTION-DOCUMENTATION");
        $ic63$ = constant_handles_oc.f8479((SubLObject)makeString("NLGenerationFunction"));
        $ic64$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic65$ = makeKeyword("BREADTH");
        $ic66$ = makeKeyword("QUEUE");
        $ic67$ = makeKeyword("STACK");
        $ic68$ = makeSymbol("S#11450", "CYC");
        $ic69$ = makeKeyword("ERROR");
        $ic70$ = makeString("~A is not a ~A");
        $ic71$ = makeSymbol("S#11592", "CYC");
        $ic72$ = makeKeyword("CERROR");
        $ic73$ = makeString("continue anyway");
        $ic74$ = makeKeyword("WARN");
        $ic75$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic76$ = makeString("~A is neither SET-P nor LISTP.");
        $ic77$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic78$ = ConsesLow.list((SubLObject)makeUninternedSymbol("US#4D5E436"), (SubLObject)makeUninternedSymbol("US#1526883"), (SubLObject)makeUninternedSymbol("US#15AA083"));
        $ic79$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic80$ = makeSymbol("S#3846", "CYC");
        $ic81$ = makeSymbol("CAR");
        $ic82$ = makeSymbol("SPEC?");
        $ic83$ = makeSymbol("CONSTANT-NAME");
        $ic84$ = makeString("Table of Contents");
        $ic85$ = makeString("Click to go to functions denoting a phrase type.");
        $ic86$ = makeString("#~A");
        $ic87$ = makeSymbol("S#50240", "CYC");
        $ic88$ = makeSymbol("GENLS?");
        $ic89$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic90$ = makeKeyword("NEW");
        $ic91$ = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("PrimaryLexicalMapping")), (SubLObject)makeString("default")), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("DEFAULT"), (SubLObject)makeString("context")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("ContextuallyDependentLexicalMapping")), (SubLObject)makeString("vanishing")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("VanishinglyRareLexicalMapping")), (SubLObject)makeString("primary")));
        $ic92$ = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("PrimaryLexicalMapping")), (SubLObject)makeString("Primary lexical mapping.  Click to weaken to default strength.")), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("DEFAULT"), (SubLObject)makeString("Default strength mapping. Click to make this a contextually dependent mapping.")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("ContextuallyDependentLexicalMapping")), (SubLObject)makeString("Contextually dependent lexical mapping. Click to make this a vanishingly rare mapping.")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("VanishinglyRareLexicalMapping")), (SubLObject)makeString("Vanishingly rare lexical mapping. Click to make this a primary mapping.")));
        $ic93$ = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("PrimaryLexicalMapping")), (SubLObject)makeKeyword("HTML-PRIMARY-LEXICAL-IMG")), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("DEFAULT"), (SubLObject)makeKeyword("HTML-NOT-CONTEXTUAL-LEXICAL-IMG")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("ContextuallyDependentLexicalMapping")), (SubLObject)makeKeyword("HTML-CONTEXTUAL-LEXICAL-IMG")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("VanishinglyRareLexicalMapping")), (SubLObject)makeKeyword("HTML-VANISHING-LEXICAL-IMG")));
        $ic94$ = makeString("javascript:setStrength('");
        $ic95$ = makeString("', '");
        $ic96$ = makeString("', this);");
        $ic97$ = makeString("padding-right: 5px");
        $ic98$ = makeKeyword("CENTER");
        $ic99$ = makeString("remove");
        $ic100$ = makeString("add");
        $ic101$ = makeString("This assertion will be used preferentially for NL generation.  Click to remove genStringAssertion preference.");
        $ic102$ = makeString("Click here to prefer this assertion in NL generation.");
        $ic103$ = makeString("javascript:setGenString('");
        $ic104$ = makeKeyword("HTML-GENSTRING-IMG");
        $ic105$ = makeKeyword("HTML-NOT-GENSTRING-IMG");
        $ic106$ = makeSymbol("S#12274", "CYC");
        $ic107$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic108$ = constant_handles_oc.f8479((SubLObject)makeString("strengthOfLexicalMapping"));
        $ic109$ = makeSymbol("S#5859", "CYC");
        $ic110$ = makeKeyword("DEFAULT");
        $ic111$ = constant_handles_oc.f8479((SubLObject)makeString("ContextuallyDependentLexicalMapping"));
        $ic112$ = constant_handles_oc.f8479((SubLObject)makeString("PrimaryLexicalMapping"));
        $ic113$ = constant_handles_oc.f8479((SubLObject)makeString("VanishinglyRareLexicalMapping"));
        $ic114$ = constant_handles_oc.f8479((SubLObject)makeString("genStringAssertion"));
        $ic115$ = makeString("genstring-gray-20x20.png");
        $ic116$ = makeString("[Add genStringAssertion]");
        $ic117$ = makeString("genstring-purple-20x20.png");
        $ic118$ = makeString("[Has a genStringAssert]");
        $ic119$ = makeKeyword("HTML-NOT-CONTEXTUAL-LEXICAL-IMG");
        $ic120$ = makeString("graycaution-19x19.png");
        $ic121$ = makeString("[Make Contextually Dependent]");
        $ic122$ = makeKeyword("HTML-CONTEXTUAL-LEXICAL-IMG");
        $ic123$ = makeString("caution-19x19.png");
        $ic124$ = makeString("[Assertion Contextually Dependent]");
        $ic125$ = makeKeyword("HTML-VANISHING-LEXICAL-IMG");
        $ic126$ = makeString("redcaution-19x19.png");
        $ic127$ = makeString("[Assertion Vanishingly Rare]");
        $ic128$ = makeKeyword("HTML-PRIMARY-LEXICAL-IMG");
        $ic129$ = makeString("yellowstar-19x19.png");
        $ic130$ = makeString("[Primary Lexical Assertion]");
        $ic131$ = makeKeyword("HTML-NOT-PRIMARY-LEXICAL-IMG");
        $ic132$ = makeString("graystar-19x19.gif");
        $ic133$ = makeString("[Make Primary]");
        $ic134$ = makeString("Mt: ");
        $ic135$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic136$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic137$ = makeKeyword("NONE");
        $ic138$ = makeString("generated phrases:");
        $ic139$ = makeString(" n/a");
        $ic140$ = makeString("~S");
        $ic141$ = makeString("Lexical Info for ");
        $ic142$ = makeKeyword("HTML");
        $ic143$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic144$ = makeKeyword("ALL");
        $ic145$ = ConsesLow.list((SubLObject)makeKeyword("ABBREVS"), (SubLObject)makeKeyword("ACRONYMS"));
        $ic146$ = makeString("Default generated phrase");
        $ic147$ = makeString("n/a");
        $ic148$ = makeString("Other generated phrases: ");
        $ic149$ = makeString(", ");
        $ic150$ = makeString("\"");
        $ic151$ = makeString("'");
        $ic152$ = makeString("~A: ");
        $ic153$ = makeInteger(32);
        $ic154$ = makeString(" (~A)");
        $ic155$ = makeString("unknown agreement");
        $ic156$ = makeString("Generated based on:");
        $ic157$ = makeString("This paraphrase is cached.");
        $ic158$ = makeString("Default generation template");
        $ic159$ = makeSymbol("ASSERTION-P");
        $ic160$ = makeString("Other generation templates:");
        $ic161$ = makeKeyword("NL-TRIE-BROWSE");
        $ic162$ = makeString("NL Trie Browser");
        $ic163$ = makeString("NLTrie");
        $ic164$ = makeString("Browse the NL Trie");
        $ic165$ = makeString("[NL Trie Browser]");
        $ic166$ = makeString("cb-show-nl-trie");
        $ic167$ = makeSymbol("S#50202", "CYC");
        $ic168$ = makeSymbol("S#50232", "CYC");
        $ic169$ = makeInteger(1000);
        $ic170$ = makeSymbol("S#50233", "CYC");
        $ic171$ = makeString("#e0eeee");
        $ic172$ = makeString("#f0ffff");
        $ic173$ = makeSymbol("S#50234", "CYC");
        $ic174$ = makeSymbol("CB-SHOW-NL-TRIE");
        $ic175$ = makeKeyword("SHA1");
        $ic176$ = makeString("text/javascript");
        $ic177$ = makeString("Refresh Frames");
        $ic178$ = makeString("No NL trie loaded.");
        $ic179$ = makeSymbol("STRING-LESSP");
        $ic180$ = makeString("Sub-Entry Clusters");
        $ic181$ = makeString("This section of the trie is too big to show in one page.");
        $ic182$ = makeString(" The keys have been clustered into more manageable sub-entry groups.");
        $ic183$ = makeString(" Use the prefix short cuts to navigate to a sub-entry group.");
        $ic184$ = makeString("Prefix Shortcuts");
        $ic185$ = makeKeyword("PREFIX");
        $ic186$ = makeKeyword("WIDTH");
        $ic187$ = makeString("Entries starting with '~A'");
        $ic188$ = makeString("(see ");
        $ic189$ = makeString("all_prefix_groups");
        $ic190$ = makeString("below");
        $ic191$ = makeString(" for all prefix groups)");
        $ic192$ = makeString("Groups by Prefixes");
        $ic193$ = makeString("0");
        $ic194$ = makeString("A");
        $ic195$ = makeString("Z");
        $ic196$ = makeSymbol("STRING=");
        $ic197$ = makeString("[");
        $ic198$ = makeString("] ");
        $ic199$ = makeKeyword("MEMBERS");
        $ic200$ = makeKeyword("CB-SHOW-NL-TRIE-SET-PREFIX");
        $ic201$ = makeString("]");
        $ic202$ = makeString("~A sub-entries");
        $ic203$ = makeString("[Set Prefix Filter]");
        $ic204$ = makeString("cb-show-nl-trie-set-prefix&~A");
        $ic205$ = makeKeyword("PATH");
        $ic206$ = makeSymbol("S#50211", "CYC");
        $ic207$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#2815", "CYC"), (SubLObject)makeSymbol("S#10299", "CYC"), (SubLObject)makeSymbol("S#896", "CYC"));
        $ic208$ = ConsesLow.list((SubLObject)makeKeyword("PATH"), (SubLObject)makeKeyword("PREFIX"), (SubLObject)makeKeyword("WIDTH"));
        $ic209$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic210$ = makeSymbol("CB-SHOW-NL-TRIE-SET-PREFIX");
        $ic211$ = makeString("Sub-Entries");
        $ic212$ = makeKeyword("LEFT");
        $ic213$ = makeKeyword("SHOW-NL-TRIE-SPECIFIC");
        $ic214$ = makeString("Entry for ");
        $ic215$ = makeString("(Root)");
        $ic216$ = makeString(" >> ");
        $ic217$ = makeString("post");
        $ic218$ = makeString("cb-show-nl-trie-starting-at-entry");
        $ic219$ = makeString("Go to entry:");
        $ic220$ = makeString("specification");
        $ic221$ = makeInteger(50);
        $ic222$ = makeKeyword("RAW-PATH");
        $ic223$ = makeKeyword("VALID-PATH");
        $ic224$ = makeString("The entry specification");
        $ic225$ = makeString("returned no NL trie entries. Please try again");
        $ic226$ = makeString("is ambiguous between the following NL trie entries:");
        $ic227$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#50241", "CYC"), (SubLObject)makeSymbol("S#50242", "CYC"));
        $ic228$ = ConsesLow.list((SubLObject)makeKeyword("RAW-PATH"), (SubLObject)makeKeyword("VALID-PATH"));
        $ic229$ = makeString("[Go]");
        $ic230$ = makeSymbol("CB-SHOW-NL-TRIE-STARTING-AT-ENTRY");
        $ic231$ = makeString("Dont know how to interpret ~A as cluster.");
        $ic232$ = makeSymbol("STRINGP");
        $ic233$ = makeString("(");
        $ic234$ = makeString(" sub-key~A)");
        $ic235$ = makeString("s");
        $ic236$ = makeString("background-color : ");
        $ic237$ = makeString("Syntactic: ");
        $ic238$ = makeString("Semantic: ");
        $ic239$ = makeSymbol("CB-SHOW-NL-TRIE-SPECIFIC");
        $ic240$ = makeString("[Show in NL Trie]");
        $ic241$ = makeString("cb-show-nl-trie-specific&~A");
        $ic242$ = makeSymbol("S#50227", "CYC");
        $ic243$ = makeSymbol("S#50237", "CYC");
        $ic244$ = makeInteger(8080);
        $ic245$ = makeSymbol("S#50238", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 2561 ms
	
	Decompiled with Procyon 0.5.32.
*/